using AutoMapper;
using MovieAPI_Entity.Controllers.Dtos.Movie;
using MovieAPI_Entity.Models;

namespace MovieAPI_Entity.Profiles
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
