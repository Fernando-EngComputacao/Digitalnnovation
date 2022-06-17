using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text.Json.Serialization;

namespace MovieAPI_Entity.Models
{
    public class Manager
    {
        [Key]
        [Required]
        public int Id { get; set; }
        public string Name { get; set; }
        public string LastName { get; set; }
        [JsonIgnore]
        public virtual List<Cinema> Cinemas { get; set; }
    }
}
