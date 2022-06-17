using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Identity;
using System;
using UserAPI.Controllers.Requests;

namespace UserAPI.Services
{

    public class LoginService
    {
        //Atributes
        private SignInManager<IdentityUser<int>> _signInManager;

        //Constructor
        public LoginService(SignInManager<IdentityUser<int>> signInManager)
        {
            _signInManager = signInManager;
        }
        //HTTP Verbes - representation
        public Result UserLogin(LoginRequest request)
        {
            var resultIdentity = _signInManager.PasswordSignInAsync(request.UserName, request.Password, false, false);
            if (resultIdentity.Result.Succeeded) return Result.Ok();
            return Result.Fail("Login não realizado!");
        }

        

    }
}
