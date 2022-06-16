using AutoMapper;
using Movie_EF.Controllers.Dtos.Session;
using Movie_EF.Models;

namespace Movie_EF.Profiles
{
    public class SessionProfile : Profile
    {
        public SessionProfile()
        {
            CreateMap<CreateSessionDto, Session>();
            CreateMap<Session, ReadSessionDto>()
                .ForMember(dto => dto.OpeningTime, opts => opts
                    .MapFrom(dto => 
                        dto.ClosingTime.AddMinutes(dto.Movie.Duraction*(-1))));
            // .ForMember [faz a operação para encontar o horário de início ]
            // *(-1) define a operação como subtração
            CreateMap<UpdateSessionDto, Session>();
        }
    }
}
