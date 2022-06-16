using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using Movie_EF.Controllers.Dtos.Session;
using Movie_EF.Data;
using Movie_EF.Models;
using System.Collections.Generic;
using System.Linq;

namespace Movie_EF.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class SessionController : ControllerBase
    {
        private ConfigureContext _context;
        private IMapper _mapper;

        //Constructor
        public SessionController(ConfigureContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;

        }
        [HttpGet]
        public IEnumerable<Session> SessionRecover()
        {
            return _context.Sessions;
        }

        [HttpGet("{id}")]
        public IActionResult SessionFindById(int id)
        {
            Session session = _context.Sessions.FirstOrDefault(session => session.Id == id);
            
            if (session != null)
                return Ok(_mapper.Map<ReadSessionDto>(session));

            return NotFound();
        }

        [HttpPost]
        public IActionResult AddSession([FromBody] CreateSessionDto form)
        {
            Session session = _mapper.Map<Session>(form);
            _context.Sessions.Add(session);
            _context.SaveChanges();

            return CreatedAtAction(nameof(SessionRecover), new {Id = session.Id}, session);
        }

        [HttpPut("{id}")]
        public IActionResult SessionUpdate(int id, [FromBody] UpdateSessionDto form)
        {
            Session session = _context.Sessions.FirstOrDefault(session => session.Id == id);

            if (session == null)
                return NotFound();

            _mapper.Map(form, session);
            _context.SaveChanges();
            return Ok(session);
        }

        [HttpDelete("{id}")]
        public IActionResult SessionDelete(int id)
        {
            Session session = _context.Sessions.FirstOrDefault(session => session.Id == id);

            if (session == null)
                return NotFound();

            _context.Sessions.Remove(session);
            _context.SaveChanges();
            return Ok(session);
        }
    }
}
