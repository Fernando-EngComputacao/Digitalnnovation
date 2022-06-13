using AutoMapper;
using Movie_EF.Controllers.Dtos;
using Movie_EF.Models;

namespace Movie_EF.Profiles
{
    public class CinemaProfile : Profile
    {
        public CinemaProfile()
        {
            //Cinema
            CreateMap<CreateCinemaDto, Cinema>();
            CreateMap<Cinema, ReadCinemaDto>();
            CreateMap<UpdateCinemaDto, Cinema>();
        }
    }
}
