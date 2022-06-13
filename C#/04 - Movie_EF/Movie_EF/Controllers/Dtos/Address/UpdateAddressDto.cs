using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class UpdateAddressDto
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

        //Constructor
        public UpdateAddressDto(string country, string state, string locality,
            string district, string complement, int number, string cep)
        {
            this.Country = country;
            this.State = state;
            this.Locality = locality;
            this.District = district;
            this.Complement = complement;
            this.Number = number;
            this.CEP = cep;
        }
        public UpdateAddressDto() { }
    }
}
