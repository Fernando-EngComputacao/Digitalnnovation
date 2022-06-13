using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class CreateMovieDto
    {
        [Required]
        public string Title { get; set; }
        [Required]
        public string Director { get; set; }
        [StringLength(62)]
        public string Genre { get; set; }
        [Range(1, 650)]
        public int Duraction { get; set; }
        public int AgeRating { get; set; }

        // Constructor
        public CreateMovieDto(string title, string director, string genre, int duraction, int age)
        {
            this.Title = title;
            this.Director = director;
            this.Genre = genre;
            this.Duraction = duraction;
            this.AgeRating = age;
        }
        public CreateMovieDto() { }
    }
}
