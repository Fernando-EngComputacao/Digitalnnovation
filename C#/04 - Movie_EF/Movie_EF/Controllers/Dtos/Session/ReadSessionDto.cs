using Movie_EF.Models;
using System;
using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos.Session
{
    public class ReadSessionDto
    {
        public int Id { get; set; }
        public Movie Movie { get; set; }
        public Cinema Cinema { get; set; }
        public DateTime ClosingTime { get; set; }
        public DateTime OpeningTime { get; set; }
    }
}
