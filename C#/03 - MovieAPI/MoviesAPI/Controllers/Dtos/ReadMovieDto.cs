using MoviesAPI.Models;
using System;
using System.ComponentModel.DataAnnotations;

namespace MoviesAPI.Controllers.Dtos
{
    public class ReadMovieDto
    {
        [Key]
        [Required]
        public int Id { get; set; }
        public string Titulo { get; set; }
        [Required]
        public string Diretor { get; set; }
        [StringLength(45)]
        public string Genero { get; set; }
        [Range(1, 550)]
        public int Duracao { get; set; }
        public DateTime HoraDaConsulta { get; set; }

        //Constructor
        public ReadMovieDto(int Id, string Titulo, string Diretor, string Genero, int Duracao)
        {
            this.Id = Id;
            this.Titulo = Titulo;
            this.Diretor = Diretor;
            this.Genero = Genero;
            this.Duracao = Duracao;
            this.HoraDaConsulta = DateTime.Now;
        }
        public ReadMovieDto(){}

        //Methods
        public ReadMovieDto converter(Movie movie)
        {
            return new ReadMovieDto(movie.Id, movie.Titulo, movie.Diretor, movie.Genero, movie.Duracao);
        }
    }
}
