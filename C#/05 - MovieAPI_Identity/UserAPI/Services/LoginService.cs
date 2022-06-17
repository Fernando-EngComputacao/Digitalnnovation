using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Identity;
using System;
using System.Linq;
using UserAPI.Controllers.Requests;
using UserAPI.Models;

namespace UserAPI.Services
{

    public class LoginService
    {
        //Atributes
        private SignInManager<IdentityUser<int>> _signInManager;
        private TokenService _tokenService;

        //Constructor
        public LoginService(SignInManager<IdentityUser<int>> signInManager, TokenService service)
        {
            _signInManager = signInManager;
            _tokenService = service;
        }
        //HTTP Verbes - representation
        public Result UserLogin(LoginRequest request)
        {
            var resultIdentity = _signInManager.PasswordSignInAsync(request.UserName, request.Password, false, false);
            if (resultIdentity.Result.Succeeded)
            {
                var identityUser = _signInManager.UserManager.Users.FirstOrDefault(user 
                    => user.NormalizedUserName == request.UserName.ToUpper());
                Token token = _tokenService.CreateToken(identityUser);
                return Result.Ok().WithSuccess(token.Value);
            }
            return Result.Fail("Login não realizado!");
        }

        

    }
}
