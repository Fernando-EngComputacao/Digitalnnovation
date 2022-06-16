using System;

namespace MovieAPI_Entity.Controllers.Dtos.Address
{
    public class ReadAddressDto
    {
        public int Id { get; set; }
        public string Country { get; set; }
        public string State { get; set; }
        public string Locality { get; set; }
        public string District { get; set; }
        public string Complement { get; set; }
        public int Number { get; set; }
        public string CEP { get; set; }
        public DateTime HourSearch { get; set; } = DateTime.Now;
    }
}
