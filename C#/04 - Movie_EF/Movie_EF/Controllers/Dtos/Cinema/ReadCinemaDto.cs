using Movie_EF.Models;
using System;
using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class ReadCinemaDto
    {
        [Key]
        [Required]
        public int Id { get; set; } 
        [Required]
        public string Name { get; set; }
        public Models.Manager Manager { get; set; }
        public Address Address { get; set; }
        public DateTime HourSearch { get; set; } = DateTime.Now;
    }
}
