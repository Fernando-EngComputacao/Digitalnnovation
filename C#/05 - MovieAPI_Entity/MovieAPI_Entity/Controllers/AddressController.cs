using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using MovieAPI_Entity.Controllers.Dtos.Address;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using MovieAPI_Entity.Services;
using System.Collections.Generic;
using System.Linq;


namespace MovieAPI_Entity.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class AddressController : ControllerBase
    {
        private AddressService _addressService;

        public AddressController(AddressService addressService)
        {
            this._addressService = addressService;
        }


        [HttpGet]
        public IActionResult AddressRecover()
        {
            List<ReadAddressDto> dto = _addressService.AddressRecover();
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpGet("{id}")]
        public IActionResult AddressFindById(int id)
        {
            ReadAddressDto dto = _addressService.AddressFindById(id);
            if (dto != null) return Ok(dto);
            return NotFound();
        }

        [HttpPost]
        public IActionResult AddAddress([FromBody] UpdateAddressDto form)
        {
            ReadAddressDto dto = _addressService.AddAddress(form);
            
            return CreatedAtAction(nameof(AddressRecover), new { Id = dto.Id }, dto);
        }

        [HttpPut("{id}")]
        public IActionResult AddressUpdate(int id, [FromBody] UpdateAddressDto form)
        {
            ReadAddressDto dto = _addressService.AddressUpdate(id, form);
            if (dto != null) return Ok(dto);
            return NotFound();
        }

        [HttpDelete("{id}")]
        public IActionResult AddressDelete(int id)
        {
            ReadAddressDto dto = _addressService.AddressDelete(id);
            if (dto != null) return Ok(dto);
            return NotFound();
        }
    }
}
