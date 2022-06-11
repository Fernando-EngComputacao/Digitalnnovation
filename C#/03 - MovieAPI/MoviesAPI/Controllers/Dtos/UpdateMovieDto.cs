using MoviesAPI.Models;
using System.ComponentModel.DataAnnotations;

namespace MoviesAPI.Controllers.Dtos
{
    public class UpdateMovieDto
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
        public Movie update(Movie movie)
        {
            movie.Titulo = this.Titulo;
            movie.Diretor = this.Diretor;
            movie.Genero = this.Genero;
            movie.Duracao = this.Duracao;
            return movie;
        }
    }
}
