using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using MovieAPI_Entity.Controllers.Dtos.Session;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using MovieAPI_Entity.Services;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class SessionController : ControllerBase
    {
        private SessionService _service;

        //Constructor
        public SessionController(SessionService sessionService)
        {
            _service = sessionService;
        }

        [HttpGet]
        public IActionResult SessionRecover()
        {
            return Ok(_service.SessionRecover());

        }

        [HttpGet("{id}")]
        public IActionResult SessionFindById(int id)
        {
            ReadSessionDto dto = _service.SessionFindById(id);
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpPost]
        public IActionResult AddSession([FromBody] CreateSessionDto form)
        {
            ReadSessionDto dto = _service.AddSession(form);

            return CreatedAtAction(nameof(SessionRecover), new { Id = dto.Id }, dto);
        }

        [HttpPut("{id}")]
        public IActionResult SessionUpdate(int id, [FromBody] UpdateSessionDto form)
        {
            ReadSessionDto dto = _service.SessionUpdate(id, form);
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpDelete("{id}")]
        public IActionResult SessionDelete(int id)
        {
            ReadSessionDto dto = _service.SessionDelete(id);
            if (dto == null) return NotFound();
            return Ok(dto);
        }
    }
}
