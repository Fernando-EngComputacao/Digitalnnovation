using AutoMapper;
using Movie_EF.Controllers.Dtos.Manager;
using Movie_EF.Models;
using System.Linq;

namespace Movie_EF.Profiles
{
    public class ManagerProfile : Profile
    {
        public ManagerProfile()
        {
            CreateMap<CreateManagerDto, Manager>();
            CreateMap<Manager,ReadManagerDto>()
                .ForMember(manager => manager.Cinemas, opts => opts
                .MapFrom(manager => manager.Cinemas.Select
                    (c => new { c.Id, c.Name, c.Address, c.AddressId})));
            CreateMap<UpdateManagerDto, Manager>();
        }
    }
}
