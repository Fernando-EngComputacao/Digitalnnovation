using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Models
{
    public class Cinema
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
    }
}
