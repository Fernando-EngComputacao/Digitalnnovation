using System.ComponentModel.DataAnnotations;

namespace MovieAPI_Entity.Controllers.Dtos.Cinema
{
    public class CreateCinemaDto
    {
        [Required]
        public string Name { get; set; }
        public int AddressFK { get; set; }
        public int ManagerFK { get; set; }
        [Required]
        public int AddressId { get; set; }
        [Required]
        public int ManagerId { get; set; }
    }
}
