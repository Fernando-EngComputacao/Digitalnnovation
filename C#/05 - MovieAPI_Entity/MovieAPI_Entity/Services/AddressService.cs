using AutoMapper;
using MovieAPI_Entity.Controllers.Dtos.Address;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Services
{
    public class AddressService
    {
        private ApiContext _context;
        private IMapper _mapper;

        public AddressService(ApiContext context, IMapper mapper)
        {
            this._context = context;
            this._mapper = mapper;
        }
        
        //Get
        public List<ReadAddressDto> AddressRecover()
        {
            return _mapper.Map<List<ReadAddressDto>>(_context.Addresses.ToList());
        }
        //Get("{id}")
        public ReadAddressDto AddressFindById(int id)
        {
            Address address = _context.Addresses.FirstOrDefault(address => address.Id == id);
            if (address != null) return _mapper.Map<ReadAddressDto>(address);
            return null;
        }
        //Post
        internal ReadAddressDto AddAddress(UpdateAddressDto form)
        {
            Address address = _mapper.Map<Address>(form);
            _context.Addresses.Add(address);
            _context.SaveChanges();
            return _mapper.Map<ReadAddressDto>(address);
        }
        //Put
        public ReadAddressDto AddressUpdate(int id, UpdateAddressDto form)
        {
            Address address = _context.Addresses.FirstOrDefault(address => address.Id == id);

            if (address == null) return null;

            _mapper.Map(form, address);
            _context.SaveChanges();
            return _mapper.Map<ReadAddressDto>(address);
        }
        //Delete
        public ReadAddressDto AddressDelete(int id)
        {
            Address address = _context.Addresses.FirstOrDefault(address => address.Id == id);

            if (address == null) return null;

            _context.Addresses.Remove(address);
            _context.SaveChanges();

            return _mapper.Map<ReadAddressDto>(address);
        }

    }
}
