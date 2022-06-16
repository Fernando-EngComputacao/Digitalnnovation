using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Mvc;
using MovieAPI_Entity.Controllers.Dtos.Cinema;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using MovieAPI_Entity.Services;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class CinemaController : ControllerBase
    {
        private CinemaService _cinemaService;

        public CinemaController(CinemaService cinemaService)
        {
            this._cinemaService = cinemaService;
        }

        [HttpGet]
        public IActionResult CinemaRecover()
        {
            List<ReadCinemaDto> dto = _cinemaService.CinemaRecover();
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpGet("{id}")]
        public IActionResult CinemaFindById(int id)
        {
            ReadCinemaDto dto = _cinemaService.CinemaFindById(id);
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpPost]
        public IActionResult AddCinema([FromBody] CreateCinemaDto form)
        {
            ReadCinemaDto dto = _cinemaService.AddCinema(form);
            return CreatedAtAction(nameof(CinemaRecover), new { Id = dto.Id }, dto);
        }

        [HttpGet("search/")]
        public IActionResult CinemaSearch([FromQuery] string? movieName = null)
        {
            List<ReadCinemaDto> dto = _cinemaService.CinemaSearch(movieName);
            if (dto == null) return NotFound();
            return Ok(dto.ToList());
        }

        [HttpPut("{id}")]
        public IActionResult CinemaUpdate(int id, [FromBody] UpdateCinemaDto form)
        {
            ReadCinemaDto dto = _cinemaService.CinemaUpdate(id, form);
            if (dto != null) return Ok(dto);
            return NotFound();
        }

        [HttpDelete("{id}")]
        public IActionResult CinemaDelete(int id)
        {
            ReadCinemaDto dto = _cinemaService.CinemaDelete(id);
            if (dto != null) return Ok(dto);
            return NotFound();
        }
    }
}
