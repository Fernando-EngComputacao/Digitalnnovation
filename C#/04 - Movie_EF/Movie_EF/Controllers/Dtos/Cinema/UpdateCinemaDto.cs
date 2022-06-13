using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class UpdateCinemaDto
    {
        [Required]
        public string Name { get; set; }
    }
}
