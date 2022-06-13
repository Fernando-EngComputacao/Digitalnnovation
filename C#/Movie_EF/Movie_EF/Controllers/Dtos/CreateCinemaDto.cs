using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class CreateCinemaDto
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
    }
}
