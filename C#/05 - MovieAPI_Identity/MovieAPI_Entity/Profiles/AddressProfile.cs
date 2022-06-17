using AutoMapper;
using MovieAPI_Entity.Controllers.Dtos.Address;
using MovieAPI_Entity.Models;

namespace MovieAPI_Entity.Profiles
{
    public class AddressProfile : Profile
    {
        public AddressProfile()
        {
            //Address
            CreateMap<CreateAddressDto, Address>();
            CreateMap<Address, ReadAddressDto>();
            CreateMap<UpdateAddressDto, Address>();
        }
    }
}
