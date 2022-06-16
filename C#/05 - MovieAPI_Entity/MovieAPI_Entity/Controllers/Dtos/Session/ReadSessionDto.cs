using System;

namespace MovieAPI_Entity.Controllers.Dtos.Session
{
    public class ReadSessionDto
    {
        public int Id { get; set; }
        public Models.Movie Movie { get; set; }
        public Models.Cinema Cinema { get; set; }
        public DateTime ClosingTime { get; set; }
        public DateTime OpeningTime { get; set; }
    }
}
