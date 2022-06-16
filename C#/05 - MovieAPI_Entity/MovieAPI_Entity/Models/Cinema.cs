using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text.Json.Serialization;

namespace MovieAPI_Entity.Models
{
    public class Cinema
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
        public virtual Address Address { get; set; }
        public int AddressId { get; set; }
        public virtual Manager Manager { get; set; }
        public int ManagerId { get; set; }
        public int AddressFK { get; set; }
        public int ManagerFK { get; set; }
        [JsonIgnore]
        public virtual List<Session> Sessions { get; set; }
    }
}
