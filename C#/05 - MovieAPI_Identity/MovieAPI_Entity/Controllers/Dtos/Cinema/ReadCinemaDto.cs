using System;

namespace MovieAPI_Entity.Controllers.Dtos.Cinema
{
    public class ReadCinemaDto
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public Models.Manager Manager { get; set; }
        public Models.Address Address { get; set; }
        public DateTime HourSearch { get; set; } = DateTime.Now;
    }
}
