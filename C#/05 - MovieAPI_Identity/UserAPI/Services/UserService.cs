using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Identity;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Web;
using UserAPI.Controllers.Dtos.User;
using UserAPI.Controllers.Requests;
using UserAPI.Data;
using UserAPI.Models;

namespace UserAPI.Services
{
    public class UserService
    {
        private IMapper _mapper;
        private UserManager<IdentityUser<int>> _userManager;
        private UserDbContext _dbContext;
        private EmailService _emailService;

        public UserService(IMapper mapper, UserManager<IdentityUser<int>> userManager, UserDbContext db, EmailService emailService)
        {
            _mapper = mapper;
            _userManager = userManager;
            _dbContext = db;
            _emailService = emailService;
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
                var code = _userManager.GenerateEmailConfirmationTokenAsync(userIdentity).Result;
                var encodedCode = HttpUtility.UrlEncode(code);
                _dbContext.Users.Add(user);
                _dbContext.SaveChanges();
                //_emailService.SendEmail(
                //    new[] {userIdentity.Email}, "Link to Activate", userIdentity.Id, code
                //);
                return Result.Ok().WithSuccess(encodedCode);
            }
            return Result.Fail("Falha ao cadastrar usuário");

        }
        //Post("active/")
        public Result ActiveLoginUser(ActiveAccountRequest request)
        {
            var identityUser = _userManager.Users.FirstOrDefault(user => user.Id == request.UserId);
            var identityResult = _userManager.ConfirmEmailAsync(identityUser, request.ActivateCode).Result;
            if (identityResult.Succeeded) return Result.Ok();
            return Result.Fail("Failed to activate your account.");
        }
    }
}
