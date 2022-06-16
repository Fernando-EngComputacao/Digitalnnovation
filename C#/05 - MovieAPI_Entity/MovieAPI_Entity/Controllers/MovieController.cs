using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Mvc;
using MovieAPI_Entity.Controllers.Dtos.Movie;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using MovieAPI_Entity.Services;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class MovieController : ControllerBase
    {
        private MovieService _movieService;
        public MovieController(MovieService movieService)
        {
            _movieService = movieService;
        }

        [HttpGet]
        public IActionResult MovieRecover()
        {
            List<ReadMovieDto> dto = _movieService.MovieRecover();
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpGet("{id}")]
        public IActionResult MovieFindById(int id)
        {
            ReadMovieDto dto = _movieService.MovieFindById(id);

            if (dto != null) return Ok(dto);
            return NotFound();
        }

        [HttpGet("search/")]
        public IActionResult MovieSearch([FromQuery] int? ageRating = null)
        {
            List<ReadMovieDto> dto = _movieService.MovieSearch(ageRating);
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpPost]
        public IActionResult AddMovie([FromBody] CreateMovieDto form)
        {
            ReadMovieDto dto = _movieService.AddMovie(form);
            return CreatedAtAction(nameof(MovieRecover), new { Id = dto.Id }, dto);
        }

        [HttpPut("{id}")]
        public IActionResult MovieUpdate(int id, [FromBody] UpdateMovieDto form)
        {
            Result resul = _movieService.MovieUpdate(id, form);

            if (resul.IsSuccess) return Ok(form);
            return NotFound();
        }

        [HttpDelete("{id}")]
        public IActionResult MovieDelete(int id)
        {
            Movie movie = _movieService.MovieDelete(id);

            if (movie != null) return Ok(movie);
            return NotFound();
        }
    }
}
