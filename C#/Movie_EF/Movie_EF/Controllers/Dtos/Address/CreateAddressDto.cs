using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class CreateAddressDto
    {
        [Required]
        public string Country { get; set; }
        [Required]
        public string State { get; set; }
        [Required]
        public string Locality { get; set; }
        [Required]
        public string District { get; set; }
        [Required]
        [StringLength(120)]
        public string Complement { get; set; }
        [Required]
        public int Number { get; set; }
        [Required]
        [StringLength(10)]
        public string CEP { get; set; }



    }
}
