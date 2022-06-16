using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text.Json.Serialization;

namespace Movie_EF.Models
{
    public class Movie
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Title { get; set; }
        [Required]
        public string Director { get; set; }
        [StringLength(42)]
        public string Genre { get; set; }
        [Range(1,650)]
        public int Duraction { get; set; }
        public int AgeRating { get; set; }
        [JsonIgnore]
        public virtual List<Session> Sessions { get; set; }
     
    }
}
