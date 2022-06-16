using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using Movie_EF.Controllers.Dtos.Manager;
using Movie_EF.Data;
using Movie_EF.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Movie_EF.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class ManagerController : ControllerBase
    {
        private ConfigureContext _context;
        private IMapper _mapper;

        //Constructor (dependency injection)
        public ManagerController(ConfigureContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;
        }

        [HttpGet]
        public IEnumerable<Manager> ManagerRecover()
        {
           return _context.Managers;
        }

        [HttpGet("{id}")]
        public IActionResult ManagerFindById(int id)
        {
            Manager manager = _context.Managers.FirstOrDefault(manager => manager.Id == id); 
            
            if (manager != null)
                return Ok(_mapper.Map<ReadManagerDto>(manager));

           return NotFound();
        }

        [HttpPost]
        public IActionResult AddManager([FromBody] CreateManagerDto form)
        {
            Manager manager = _mapper.Map<Manager>(form);

            _context.Managers.Add(manager);
            _context.SaveChanges();
            return CreatedAtAction(nameof(ManagerRecover), new { Id = manager.Id }, manager);
        }

        [HttpPut("{id}")]
        public IActionResult ManagerUpdate(int id, [FromBody] UpdateManagerDto form)
        {
            Manager manager = _mapper.Map<Manager>(form);

            _context.Managers.Add(manager);
            _context.SaveChanges();
            return CreatedAtAction(nameof(ManagerRecover), new {Id = manager.Id}, manager);
        }

        [HttpDelete("{id}")]
        public IActionResult ManagerDelete(int id)
        {
            Manager manager = _context.Managers.FirstOrDefault(manager => manager.Id == id);

            if (manager == null)
                return NotFound();

            _context.Managers.Remove(manager);
            _context.SaveChanges();

            return Ok(manager);
        }
    }
}
