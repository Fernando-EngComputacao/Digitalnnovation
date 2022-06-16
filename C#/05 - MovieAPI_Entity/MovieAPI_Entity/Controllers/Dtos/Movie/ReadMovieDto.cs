using System;

namespace MovieAPI_Entity.Controllers.Dtos.Movie
{
    public class ReadMovieDto
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public string Director { get; set; }
        public string Genre { get; set; }
        public int Duraction { get; set; }
        public int AgeRating { get; set; }
        public DateTime HourSearch { get; set; } = DateTime.Now;
    }
}
