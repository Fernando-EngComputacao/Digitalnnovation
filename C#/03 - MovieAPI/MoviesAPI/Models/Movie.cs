using System.ComponentModel.DataAnnotations;

namespace MoviesAPI.Models
{
    public class Movie
    {
        [Key] 
        [Required]
        public int Id { get; set; }
        //[Required(ErrorMessage = "The field Titulo is mandatory.")]
        [Required]
        public string Titulo { get; set; }
        [Required]
        public string Diretor { get; set; }
        [StringLength(45)]
        public string Genero { get; set; }
        [Range(1,550)]
        public int Duracao { get; set; }

        //Constructor
        public Movie(string Titutlo, string Diretor, string Genero, int Duracao)
        {
            this.Titulo = Titutlo;
            this.Diretor = Diretor;
            this.Genero = Genero;
            this.Duracao = Duracao;
        }
        public Movie(){}

    }
}
