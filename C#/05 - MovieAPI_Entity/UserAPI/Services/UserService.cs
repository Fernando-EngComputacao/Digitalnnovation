using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Identity;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using UserAPI.Controllers.Dtos.User;
using UserAPI.Data;
using UserAPI.Models;

namespace UserAPI.Services
{
    public class UserService
    {
        private IMapper _mapper;
        private UserManager<IdentityUser<int>> _userManager;
        private UserDbContext _dbContext;

        public UserService(IMapper mapper, UserManager<IdentityUser<int>> userManager, UserDbContext db)
        {
            _mapper = mapper;
            _userManager = userManager;
            _dbContext = db;
        }

        //Get
        public List<ReadUserDto> UserRecover()
        {
            return _mapper.Map<List<ReadUserDto>>(_dbContext.Users.ToList());
        }
        //Post
        public Result UserRegistration(CreateUserDto dto)
        {
            User user = _mapper.Map<User>(dto);
            IdentityUser<int> userIdentity = _mapper.Map<IdentityUser<int>>(user);
            Task<IdentityResult> resultadoIdentity = _userManager.CreateAsync(userIdentity, dto.Password);
            
            if (resultadoIdentity.Result.Succeeded)
            {
                _dbContext.Users.Add(user);
                _dbContext.SaveChanges();
                return Result.Ok(_mapper.Map<ReadUserDto>(dto));
            }
            return Result.Fail("Falha ao cadastrar usuário");

        }

    }
}
