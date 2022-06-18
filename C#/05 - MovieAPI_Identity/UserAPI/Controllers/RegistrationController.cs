using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using UserAPI.Controllers.Dtos.User;
using UserAPI.Controllers.Requests;
using UserAPI.Data;
using UserAPI.Services;

namespace UserAPI.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class RegistrationController : ControllerBase
    {
        private UserService _userService;

        public RegistrationController(UserService userService)
        {
            this._userService = userService;
        }

        [HttpGet]
        public IActionResult UserRecover()
        {
            List<ReadUserDto> dto = _userService.UserRecover();
            if (dto == null) return NotFound();
            return Ok(dto);
        }

        [HttpPost]
        public IActionResult UserRegistration(CreateUserDto form)
        {
            Result result = _userService.UserRegistration(form);
            if (result.IsFailed) return StatusCode(500);
            return Ok(result.Successes);
        }
        [HttpGet("active/")]
        public IActionResult ActiveLoginUser([FromQuery] ActiveAccountRequest request)
        {
            Result result = _userService.ActiveLoginUser(request);
            if (result.IsFailed) return StatusCode(500);
            return Ok(result.Successes);
        }
    }
}
