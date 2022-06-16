using AutoMapper;
using FluentResults;
using MovieAPI_Entity.Controllers.Dtos.Cinema;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Services
{
    public class CinemaService
    {
        private ApiContext _context;
        private IMapper _mapper;

        public CinemaService(ApiContext context, IMapper mapper)
        {
            this._context = context;
            this._mapper = mapper;
        }
        //Get
        public List<ReadCinemaDto> CinemaRecover()
        {
            return _mapper.Map<List<ReadCinemaDto>>(_context.Cinemas.ToList());
        }
        //Get("{id}")
        public ReadCinemaDto CinemaFindById(int id)
        {
            Cinema cinema = _context.Cinemas.FirstOrDefault(cinema => cinema.Id == id);

            if (cinema == null)
                return null;

            return _mapper.Map<ReadCinemaDto>(cinema);

        }
        //Post
        public ReadCinemaDto AddCinema(CreateCinemaDto form)
        {
            Cinema cinema = _mapper.Map<Cinema>(form);
            _context.Cinemas.Add(cinema);
            _context.SaveChanges();
            return _mapper.Map<ReadCinemaDto>(cinema);
        }
        //Get("search/")
        internal List<ReadCinemaDto> CinemaSearch(string movieName)
        {
            List<Cinema> cinemas = _context.Cinemas.ToList();
            if (cinemas == null)
            {
                return null;
            }
            if (!string.IsNullOrEmpty(movieName))
            {
                IEnumerable<Cinema> query = from cinema in cinemas
                                            where cinema.Sessions.Any(sessao =>
                                            sessao.Movie.Title == movieName)
                                            select cinema;

                cinemas = query.ToList();
            }
            List<ReadCinemaDto> dto = _mapper.Map<List<ReadCinemaDto>>(cinemas);

            return dto;
        }

        //Put
        public ReadCinemaDto CinemaUpdate(int id, UpdateCinemaDto form)
        {
            Cinema cinema = _context.Cinemas.FirstOrDefault(cinema => cinema.Id == id);
            if (cinema == null) return null;

            //movie = form.update(movie); 
            //ou
            _mapper.Map(form, cinema);
            _context.SaveChanges();
            return _mapper.Map<ReadCinemaDto>(cinema);
        }

        //Delete
        public ReadCinemaDto CinemaDelete(int id)
        {
            Cinema cinema = _context.Cinemas.FirstOrDefault(cinema => cinema.Id == id);
            if (cinema == null)
                return null;

            _context.Cinemas.Remove(cinema);
            _context.SaveChanges();

            return _mapper.Map<ReadCinemaDto>(cinema);
        }
    }
}
