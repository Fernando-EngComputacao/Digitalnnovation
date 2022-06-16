using Microsoft.EntityFrameworkCore;
using MovieAPI_Entity.Models;

namespace MovieAPI_Entity.Data
{
    public class ApiContext : DbContext
    {
        public DbSet<Movie> Movies { get; set; }
        public DbSet<Cinema> Cinemas { get; set; }
        public DbSet<Address> Addresses { get; set; }
        public DbSet<Manager> Managers { get; set; }
        public DbSet<Session> Sessions { get; set; }


        //Constructor
        public ApiContext(DbContextOptions<ApiContext> opt) : base(opt)
        {

        }

        //Methods
        protected override void OnModelCreating(ModelBuilder builder)
        {
            builder.Entity<Address>()
                .HasOne(address => address.Cinema)
                .WithOne(cinema => cinema.Address)
                .HasForeignKey<Cinema>(cinema => cinema.AddressId);

            builder.Entity<Cinema>()
                .HasOne(cinema => cinema.Manager)
                .WithMany(manager => manager.Cinemas)
                .HasForeignKey(cinema => cinema.ManagerId);

            //Altera deleção em [castaca] para [restrict] -> Após esta alteração é necessário
            //utilizar o comando no Console de Gerenciador de Pacotes: Add-Migration "texto"
            //.OnDelete(DeleteBehavior.Restrict);

            // ou faça o seguinte código
            //.IsRequired(false) -> retira a obrigatoriedade de todo cinema ter [ManagerId] obrigatório
            // podendo ser preenchido com [null]

            builder.Entity<Session>()
               .HasOne(session => session.Movie)
               .WithMany(movie => movie.Sessions)
               .HasForeignKey(session => session.MovieId);

            builder.Entity<Session>()
               .HasOne(session => session.Cinema)
               .WithMany(cinema => cinema.Sessions)
               .HasForeignKey(session => session.CinemaId);
        }
    }
}
