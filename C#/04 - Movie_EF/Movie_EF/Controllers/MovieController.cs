using AutoMapper;
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
<<<<<<< HEAD
                return Ok(_mapper.Map<ReadCinemaDto>(movie));
=======
                return Ok(_mapper.Map<ReadMovieDto>(movie));
>>>>>>> dotnet

            else
                return NotFound();
        }

        [HttpPost]
<<<<<<< HEAD
        public IActionResult AddMovie([FromBody] CreateMovieDto movieDto)
        {
            Movie movie = _mapper.Map<Movie>(movieDto);

            _context.Movies.Add(movie);
            _context.SaveChanges();
=======
        public IActionResult AddMovie([FromBody] UpdateMovieDto form)
        {
            Movie movie = _mapper.Map<Movie>(form);
            _context.Movies.Add(movie);
            _context.SaveChanges();

>>>>>>> dotnet
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
