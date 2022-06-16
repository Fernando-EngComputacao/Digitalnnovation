using System.ComponentModel.DataAnnotations;
using System.Text.Json.Serialization;

namespace MovieAPI_Entity.Models
{
    public class Address
    {
        [Key]
        [Required]
        public int Id { get; set; }
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
        [JsonIgnore]
        public virtual Cinema Cinema { get; set; }
    }
}
