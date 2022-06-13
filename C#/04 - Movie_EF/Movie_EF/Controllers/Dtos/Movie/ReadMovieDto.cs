using Movie_EF.Models;
using System;
using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class ReadMovieDto
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Title { get; set; }
        [Required]
        public string Director { get; set; }
        [StringLength(62)]
        public string Genre { get; set; }
        [Range(1, 650)]
        public int Duraction { get; set; }
        public int AgeRating { get; set; }
        public DateTime HourSearch { get; set; }

        // Constructor
        public ReadMovieDto(string title, string director, string genre, int duraction)
        {
            this.Title = title;
            this.Director = director;
            this.Genre = genre;
            this.Duraction = duraction;
            this.HourSearch = DateTime.Now;
        }
        public ReadMovieDto(){}
    }
}
