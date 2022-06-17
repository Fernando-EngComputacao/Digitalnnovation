using AutoMapper;
using MovieAPI_Entity.Controllers.Dtos.Session;
using MovieAPI_Entity.Models;

namespace MovieAPI_Entity.Profiles
{
    public class SessionProfile : Profile
    {
        //Session
        public SessionProfile()
        {
            CreateMap<CreateSessionDto, Session>();
            CreateMap<Session, ReadSessionDto>()
                .ForMember(dto => dto.OpeningTime, opts => opts
                    .MapFrom(dto =>
                        dto.ClosingTime.AddMinutes(dto.Movie.Duraction * (-1))));
            // .ForMember [faz a operação para encontar o horário de início ]
            // *(-1) define a operação como subtração
            CreateMap<UpdateSessionDto, Session>();
        }
    }
}
