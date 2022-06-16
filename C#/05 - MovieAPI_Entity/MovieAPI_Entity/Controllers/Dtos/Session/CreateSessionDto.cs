using System;
using System.ComponentModel.DataAnnotations;

namespace MovieAPI_Entity.Controllers.Dtos.Session
{
    public class CreateSessionDto
    {
        [Required]
        public int MovieId { get; set; }
        [Required]
        public int CinemaId { get; set; }
        public DateTime ClosingTime { get; set; }
    }
}
