using Movie_EF.Models;
using System;

namespace Movie_EF.Controllers.Dtos.Session
{
    public class CreateSessionDto
    {
        public int MovieId { get; set; }
        public int CinemaId { get; set; }
        public DateTime ClosingTime { get; set; }
    }
}
