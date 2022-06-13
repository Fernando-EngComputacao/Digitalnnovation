using Microsoft.EntityFrameworkCore;
using Movie_EF.Models;

namespace Movie_EF.Data
{
    public class ConfigureContext : DbContext
    {

        public DbSet<Movie> Movies { get; set; }
        public DbSet<Cinema> Cinemas { get; set; }
<<<<<<< HEAD
=======
        public DbSet<Address> Addresses { get; set; }
>>>>>>> dotnet

        //Constructor
        public ConfigureContext(DbContextOptions<ConfigureContext> opt) : base(opt)
        {

        }
    }
}
