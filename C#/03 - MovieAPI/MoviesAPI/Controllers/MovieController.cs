using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using MoviesAPI.Controllers.Dtos;
using MoviesAPI.Data;
using MoviesAPI.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MoviesAPI.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class MovieController :ControllerBase
    {

        private MovieContext _context;
        private IMapper _mapper;

        public MovieController(MovieContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;
        }

        [HttpPost]
        public IActionResult AddMovie([FromBody] CreateMovieDto movieDto)
        {
            Movie movie = _mapper.Map<Movie>(movieDto);

            _context.Movies.Add(movie);
            _context.SaveChanges();
            return CreatedAtAction(nameof(MovieRecover), new { Id = movie.Id }, movie);
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
                return Ok(new ReadMovieDto().converter(movie));

            else
                return NotFound();
        }

        [HttpPut("{id}")]
        public IActionResult MovieUpdate(int id, [FromBody] UpdateMovieDto form)
        {
            Movie movie = _context.Movies.FirstOrDefault(movie => movie.Id == id);
            if(movie == null)
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
