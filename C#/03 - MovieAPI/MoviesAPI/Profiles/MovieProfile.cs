using AutoMapper;
using MoviesAPI.Controllers.Dtos;
using MoviesAPI.Models;

namespace MoviesAPI.Profiles
{
    public class MovieProfile : Profile
    {
        public MovieProfile()
        {
            CreateMap<CreateMovieDto, Movie>();
            CreateMap<Movie, ReadMovieDto>();
            CreateMap<UpdateMovieDto, Movie>();
        }
    }
}
