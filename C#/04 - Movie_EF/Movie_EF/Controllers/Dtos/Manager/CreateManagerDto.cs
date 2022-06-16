using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos.Manager
{
    public class CreateManagerDto
    {
        [Required]
        public string Name { get; set; }
        [Required]
        public string LastName { get; set; }
    }
}
