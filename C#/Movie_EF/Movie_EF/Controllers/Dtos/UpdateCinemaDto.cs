using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class UpdateCinemaDto
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
    }
}
