﻿using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using Movie_EF.Controllers.Dtos;
using Movie_EF.Data;
using Movie_EF.Models;
using System.Collections.Generic;
using System.Linq;

namespace Movie_EF.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class MovieController : ControllerBase
    {
        private ConfigureContext _context;
        private IMapper _mapper;

        public MovieController(ConfigureContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;
        }

        [HttpGet]
        public IEnumerable<Movie> MovieRecover()
        {
            return _context.Movies;
        }

        [HttpGet("{id}")]
        public IActionResult MovieFindById(int id)
        {
            Movie movie = _context.Movies.FirstOrDefault(movie => movie.Id == id);

            if (movie != null)
                return Ok(_mapper.Map<ReadMovieDto>(movie));

            else
                return NotFound();
        }

        [HttpGet("search/")]
        public IActionResult MovieSearch([FromQuery] int? ageRating = null)
        {
            List<Movie> movies = _context.Movies.Where(movie => movie.AgeRating <= ageRating).ToList();

            if (ageRating == null)
                movies = _context.Movies.ToList();

            if (movies == null)
                return NotFound();

            List<ReadMovieDto> dto = _mapper.Map<List<ReadMovieDto>>(movies);
            return Ok(dto);
        }

        [HttpPost]
        public IActionResult AddMovie([FromBody] UpdateMovieDto form)
        {
            Movie movie = _mapper.Map<Movie>(form);
            _context.Movies.Add(movie);
            _context.SaveChanges();

            return CreatedAtAction(nameof(MovieRecover), new { Id = movie.Id }, movie);
        }

        [HttpPut("{id}")]
        public IActionResult MovieUpdate(int id, [FromBody] UpdateMovieDto form)
        {
            Movie movie = _context.Movies.FirstOrDefault(movie => movie.Id == id);
            if (movie == null)
                return NotFound();

            //movie = form.update(movie); 
            //ou
            _mapper.Map(form, movie);
            _context.SaveChanges();
            return Ok(movie);

        }

        [HttpDelete("{id}")]
        public IActionResult MovieDelete(int id)
        {
            Movie movie = _context.Movies.FirstOrDefault(movie => movie.Id == id);
            if (movie == null)
                return NotFound();

            _context.Movies.Remove(movie);
            _context.SaveChanges();

            return Ok(movie);
        }
    }
}
