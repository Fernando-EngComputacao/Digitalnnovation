using AutoMapper;
using Movie_EF.Controllers.Dtos;
using Movie_EF.Models;

namespace Movie_EF.Profiles
{
    public class MovieProfile : Profile
    {
        public MovieProfile()
        {
            //Movie
            CreateMap<CreateMovieDto, Movie>();
            CreateMap<Movie, ReadMovieDto>();
            CreateMap<UpdateMovieDto, Movie>();
        }
    }
}
