using AutoMapper;
using MovieAPI_Entity.Controllers.Dtos.Manager;
using MovieAPI_Entity.Models;
using System.Linq;

namespace MovieAPI_Entity.Profiles
{
    public class ManagerProfile : Profile
    {
        //Manager
        public ManagerProfile()
        {
            CreateMap<CreateManagerDto, Manager>();
            CreateMap<Manager, ReadManagerDto>()
                .ForMember(manager => manager.Cinemas, opts => opts
                .MapFrom(manager => manager.Cinemas.Select
                    (c => new { c.Id, c.Name, c.Address, c.AddressId })));
            CreateMap<UpdateManagerDto, Manager>();
        }
    }
}
