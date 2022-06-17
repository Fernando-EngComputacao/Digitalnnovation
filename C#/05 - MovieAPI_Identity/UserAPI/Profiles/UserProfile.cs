using AutoMapper;
using Microsoft.AspNetCore.Identity;
using UserAPI.Controllers.Dtos.User;
using UserAPI.Models;

namespace UserAPI.Profiles
{
    public class UserProfile : Profile
    {
        public UserProfile()
        {
            CreateMap<CreateUserDto, User>();
            CreateMap<User, ReadUserDto>();
            CreateMap<CreateUserDto, ReadUserDto>();
            CreateMap<UpdateUserDto, User>();
            CreateMap<User, IdentityUser<int>>();
        }
    }
}
