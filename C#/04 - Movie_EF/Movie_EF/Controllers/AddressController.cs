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
    public class AddressController : ControllerBase
    {
        private ConfigureContext _context;
        private IMapper _mapper;

        public AddressController(ConfigureContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;
        }

    
        [HttpGet]
        public IEnumerable<Address> AddressRecover()
        {
            return _context.Addresses;
        }

        [HttpGet("{id}")]
        public IActionResult AddressFindById(int id)
        {
            Address address = _context.Addresses.FirstOrDefault(address => address.Id == id);

            if (address != null)
                return Ok(_mapper.Map<ReadAddressDto>(address));

            else
                return NotFound();
        } 

        [HttpPost]
        public IActionResult AddAddress([FromBody] UpdateAddressDto form)
        {
            Address address = _mapper.Map<Address>(form);
            _context.Addresses.Add(address);
            _context.SaveChanges();
            return CreatedAtAction(nameof(AddressRecover), new { Id = address.Id }, address);
        }

        [HttpPut("{id}")]
        public IActionResult AddressUpdate(int id, [FromBody] UpdateAddressDto form)
        {
            Address address = _context.Addresses.FirstOrDefault(address => address.Id == id);

            if (address == null)
                return NotFound();

            _mapper.Map(form, address);
            _context.SaveChanges();
            return Ok(address);
        }

        [HttpDelete("{id}")]
        public IActionResult AddressDelete(int id)
        {
            Address address = _context.Addresses.FirstOrDefault(address => address.Id == id);

            if (address == null)
                return NotFound();

            _context.Addresses.Remove(address);
            _context.SaveChanges();

            return Ok(address);
        }
    }
}
