using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class CreateCinemaDto
    {
        [Required]
        public string Name { get; set; }
        public int AddressFK { get; set; }
        public int ManagerFK { get; set; }

        public int AddressId { get; set; }
        public int ManagerId { get; set; } 
    }
}
