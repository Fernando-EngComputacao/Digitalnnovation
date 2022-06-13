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
        public object Address { get; set; }
        public DateTime HourSearch { get; set; }

        //Constructors
        public ReadCinemaDto(string name)
        {
            this.Name = name;
            this.HourSearch = DateTime.Now;
        }
        public ReadCinemaDto() {}
    }
}
