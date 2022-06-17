using AutoMapper;
using MovieAPI_Entity.Controllers.Dtos.Cinema;
using MovieAPI_Entity.Models;

namespace MovieAPI_Entity.Profiles
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
