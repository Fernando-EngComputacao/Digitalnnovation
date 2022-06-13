using AutoMapper;
using Movie_EF.Controllers.Dtos;
using Movie_EF.Models;

namespace Movie_EF.Profiles
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
