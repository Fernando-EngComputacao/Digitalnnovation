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
        public IActionResult AddCinema([FromBody] UpdateCinemaDto dto)
        {
            Cinema cinema = _mapper.Map<Cinema>(dto);

            _context.Cinemas.Add(cinema);
            _context.SaveChanges();
            return CreatedAtAction(nameof(CinemaRecover), new { Id = cinema.Id }, cinema);
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
