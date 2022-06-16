using System;
using System.ComponentModel.DataAnnotations;

namespace MovieAPI_Entity.Controllers.Dtos.Session
{
    public class UpdateSessionDto
    {
        [Required]
        public int MovieId { get; set; }
        [Required]
        public int CinemaId { get; set; }
        [Required]
        public DateTime ClosingTime { get; set; }
    }
}
