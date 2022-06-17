using FluentResults;
using Microsoft.AspNetCore.Mvc;
using UserAPI.Controllers.Requests;
using UserAPI.Services;

namespace UserAPI.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class LoginController : ControllerBase
    {
        //Atribues
        private LoginService _loginService;

        //Constructor
        public LoginController(LoginService loginService)
        {
            _loginService = loginService;
        }

        //HTTP Verbes
        [HttpPost]
        public IActionResult UserLogin(LoginRequest request)
        {
            Result result = _loginService.UserLogin(request);
            if (result.IsFailed) return Unauthorized(result.Errors);
            return Ok(result.Successes);
        }
    }
}
