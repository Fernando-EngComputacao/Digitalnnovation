using System.ComponentModel.DataAnnotations;

namespace MovieAPI_Entity.Controllers.Dtos.Manager
{
    public class UpdateManagerDto
    {
        [Required]
        public string Name { get; set; }
        [Required]
        public string LastName { get; set; }
    }
}
