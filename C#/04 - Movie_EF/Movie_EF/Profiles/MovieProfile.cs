using AutoMapper;
using Movie_EF.Controllers.Dtos;
using Movie_EF.Models;

namespace Movie_EF.Profiles
{
    public class MovieProfile : Profile
    {
        public MovieProfile()
        {
<<<<<<< HEAD
            CreateMap<CreateMovieDto, Movie>();
            CreateMap<Movie, ReadMovieDto>();
            CreateMap<UpdateMovieDto, Movie>();
            CreateMap<CreateCinemaDto, Cinema>();
            CreateMap<Cinema, ReadCinemaDto>();
            CreateMap<UpdateCinemaDto, Cinema>();
=======
            //Movie
            CreateMap<CreateMovieDto, Movie>();
            CreateMap<Movie, ReadMovieDto>();
            CreateMap<UpdateMovieDto, Movie>();
>>>>>>> dotnet
        }
    }
}
