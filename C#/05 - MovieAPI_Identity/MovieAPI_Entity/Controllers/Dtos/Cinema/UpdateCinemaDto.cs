using System.ComponentModel.DataAnnotations;

namespace MovieAPI_Entity.Controllers.Dtos.Cinema
{
    public class UpdateCinemaDto
    {
        [Required]
        public string Name { get; set; }
    }
}
