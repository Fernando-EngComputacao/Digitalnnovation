using FluentResults;
using System;
using Microsoft.AspNetCore.Identity;

namespace UserAPI.Services
{
    public class LogoutService
    {
        //Atributes
        private SignInManager<IdentityUser<int>> _signinManager;

        //Constructor
        public LogoutService(SignInManager<IdentityUser<int>> signinManager)
        {
            _signinManager = signinManager;
        }

        //HTTP Verbes
        public Result LogoutUser()
        {
            var resultIdentity = _signinManager.SignOutAsync();
            if (resultIdentity.IsCompletedSuccessfully) return Result.Ok();
            return Result.Fail("LogOut Fail!");
        }
    }
}
