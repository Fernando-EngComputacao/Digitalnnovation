using MoviesAPI.Models;
using System.ComponentModel.DataAnnotations;

namespace MoviesAPI.Controllers.Dtos
{
    public class CreateMovieDto
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Titulo { get; set; }
        [Required]
        public string Diretor { get; set; }
        [StringLength(45)]
        public string Genero { get; set; }
        [Range(1, 550)]
        public int Duracao { get; set; }


        //Methods
        public Movie converter()
        {
            return new Movie(this.Titulo, this.Diretor, this.Genero, this.Duracao);

        }
    }
}
