using MovieAPI_Entity.Controllers.Dtos.Manager;
using Microsoft.AspNetCore.Mvc;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using System.Collections.Generic;
using System.Linq;
using AutoMapper;
using MovieAPI_Entity.Services;

namespace MovieAPI_Entity.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class ManagerController : ControllerBase
    {
        private ManagerService _managerService;

        public ManagerController(ManagerService managerService)
        {
            this._managerService = managerService;
        }

        [HttpGet]
        public IActionResult ManagerRecover()
        {
            List<ReadManagerDto> dto = _managerService.ManagerRecover();
            if (dto != null) return Ok(dto);
            return NotFound();
        }

        [HttpGet("{id}")]
        public IActionResult ManagerFindById(int id)
        {
            ReadManagerDto dto = _managerService.ManagerFindById(id);
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpPost]
        public IActionResult AddManager([FromBody] CreateManagerDto form)
        {
            ReadManagerDto dto = _managerService.AddManager(form);
            return CreatedAtAction(nameof(ManagerRecover), new { Id = dto.Id }, dto);
        }

        [HttpPut("{id}")]
        public IActionResult ManagerUpdate(int id, [FromBody] UpdateManagerDto form)
        {
            ReadManagerDto dto = _managerService.ManagerUpdate(id, form);
            if (dto == null) return NotFound();
            return CreatedAtAction(nameof(ManagerRecover), new { Id = dto.Id }, dto);
        }

        [HttpDelete("{id}")]
        public IActionResult ManagerDelete(int id)
        {
            ReadManagerDto dto = _managerService.ManagerDelete(id);
            if (dto == null) return NotFound();
            return Ok(dto);
        }
    }
}
