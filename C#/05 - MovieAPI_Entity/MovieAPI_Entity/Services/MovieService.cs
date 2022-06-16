using AutoMapper;
using FluentResults;
using MovieAPI_Entity.Controllers.Dtos.Movie;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Services
{
    public class MovieService
    {
        private ApiContext _context;
        private IMapper _mapper;

        //Constructor
        public MovieService(ApiContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;
        }

        //Methods

        //Get
        public List<ReadMovieDto> MovieRecover()
        {
            List<Movie> movie = _context.Movies.ToList();

            if (movie == null) return null;
            return _mapper.Map<List<ReadMovieDto>>(movie);
        }
      
        //Post
        public ReadMovieDto AddMovie(CreateMovieDto form)
        {
            Movie movie = _mapper.Map<Movie>(form);
            _context.Movies.Add(movie);
            _context.SaveChanges();
            return _mapper.Map<ReadMovieDto>(movie);
        }

        //Get("{id}")
        public ReadMovieDto MovieFindById(int id)
        {
            Movie movie = _context.Movies.FirstOrDefault(movie => movie.Id == id);

            if (movie != null) return _mapper.Map<ReadMovieDto>(movie);
            return null;
        }

        //Get("search/")
        public List<ReadMovieDto> MovieSearch(int? ageRating)
        {
            List<Movie> movies = _context.Movies.Where(movie => movie.AgeRating <= ageRating).ToList();

            if (ageRating == null)
                movies = _context.Movies.ToList();

            if (movies != null) return _mapper.Map<List<ReadMovieDto>>(movies);
            return null;
        }
        ////Put
        public Result MovieUpdate(int id, UpdateMovieDto form)
        {
            Movie movie = _context.Movies.FirstOrDefault(movie => movie.Id == id);
            if (movie == null)
                return Result.Fail("Not Found Movie");

            //movie = form.update(movie); 
            //ou
            _mapper.Map(form, movie);
            _context.SaveChanges();
            return Result.Ok();
        }
        //Delete
        public Movie MovieDelete(int id)
        {
            Movie movie = _context.Movies.FirstOrDefault(movie => movie.Id == id);
            if (movie == null)
                return null;

            _context.Movies.Remove(movie);
            _context.SaveChanges();

            return movie;
        }
    }
}
