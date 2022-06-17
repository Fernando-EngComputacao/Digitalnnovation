using AutoMapper;
using FluentResults;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using UserAPI.Controllers.Dtos.User;
using UserAPI.Data;
using UserAPI.Services;

namespace UserAPI.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class RegistrationController : ControllerBase
    {
        private UserService _userService;
        private IMapper _mapper;

        public RegistrationController(UserService userService, IMapper mapper)
        {
            this._userService = userService;
            this._mapper = mapper;
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
            return Ok(_mapper.Map<ReadUserDto>(form));
        }
    }
}
