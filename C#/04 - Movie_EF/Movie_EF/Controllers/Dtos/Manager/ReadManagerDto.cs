using Movie_EF.Models;
using System.ComponentModel.DataAnnotations;
using System.Collections.Generic;

namespace Movie_EF.Controllers.Dtos.Manager
{
    public class ReadManagerDto
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string LastName { get; set; }
        public object Cinemas { get; set; }
    }
}
