using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using Movie_EF.Controllers.Dtos;
using Movie_EF.Data;
using Movie_EF.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Movie_EF.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class CinemaController : ControllerBase
    {
        private ConfigureContext _context;
        private IMapper _mapper;

        public CinemaController(ConfigureContext context, IMapper mapper)
        {
            this._context = context;
            this._mapper = mapper;
        }
        [HttpGet]
        public IEnumerable<Cinema> CinemaRecover()
        {
            return _context.Cinemas;
        }

        [HttpGet("{id}")]
        public IActionResult CinemaFindById(int id)
        {
            Cinema cinema = _context.Cinemas.FirstOrDefault(cinema => cinema.Id == id);

            if (cinema != null)
                return Ok(_mapper.Map<ReadCinemaDto>(cinema));

            else
                return NotFound();
        }

        [HttpPost]
        public IActionResult AddCinema([FromBody] CreateCinemaDto dto)
        {
            Cinema cinema = _mapper.Map<Cinema>(dto);

            _context.Cinemas.Add(cinema);
            _context.SaveChanges();
            return CreatedAtAction(nameof(CinemaRecover), new { Id = cinema.Id }, cinema);
        }

        [HttpGet("search/")]
        [HttpGet]
        public IActionResult CinemaSearch([FromQuery] string movieName)
        {
            List<Cinema> cinemas = _context.Cinemas.ToList();
            if (cinemas == null)
            {
                return NotFound();
            }
            if (!string.IsNullOrEmpty(movieName))
            {
                IEnumerable<Cinema> query = from cinema in cinemas
                                            where cinema.Sessions.Any(sessao =>
                                            sessao.Movie.Title == movieName)
                                            select cinema;

                cinemas = query.ToList();
            }
            List<ReadCinemaDto> readDto = _mapper.Map<List<ReadCinemaDto>>(cinemas);

            return Ok(readDto);
        }

        [HttpPut("{id}")]
        public IActionResult CinemaUpdate(int id, [FromBody] UpdateCinemaDto form)
        {
            Cinema cinema = _context.Cinemas.FirstOrDefault(cinema => cinema.Id == id);
            if (cinema == null)
                return NotFound();

            //movie = form.update(movie); 
            //ou
            _mapper.Map(form, cinema);
            _context.SaveChanges();
            return Ok(cinema);

        }

        [HttpDelete("{id}")]
        public IActionResult CinemaDelete(int id)
        {
            Cinema cinema = _context.Cinemas.FirstOrDefault(cinema => cinema.Id == id);
            if (cinema == null)
                return NotFound();

            _context.Cinemas.Remove(cinema);
            _context.SaveChanges();

            return Ok(cinema);
        }

    }
}
