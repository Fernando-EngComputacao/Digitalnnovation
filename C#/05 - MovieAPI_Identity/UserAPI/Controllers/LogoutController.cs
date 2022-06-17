using FluentResults;
using Microsoft.AspNetCore.Mvc;
using UserAPI.Services;

namespace UserAPI.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class LogoutController : ControllerBase
    {
        //Atributes
        private LogoutService _logoutService;

        //Constructor
        public LogoutController(LogoutService logoutService)
        {
            _logoutService = logoutService;
        }

        //Http Verbs
        [HttpPost]
        public IActionResult LogoutUser()
        {
            Result result = _logoutService.LogoutUser();
            if (result.IsFailed) return Unauthorized(result.Errors);
            return Ok(result.Successes);
        }
    }
}
