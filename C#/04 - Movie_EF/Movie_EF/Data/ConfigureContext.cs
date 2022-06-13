using Microsoft.EntityFrameworkCore;
using Movie_EF.Models;

namespace Movie_EF.Data
{
    public class ConfigureContext : DbContext
    {

        public DbSet<Movie> Movies { get; set; }
        public DbSet<Cinema> Cinemas { get; set; }
        public DbSet<Address> Addresses { get; set; }

        //Constructor
        public ConfigureContext(DbContextOptions<ConfigureContext> opt) : base(opt)
        {

        }

        //Methods
        protected override void OnModelCreating(ModelBuilder builder)
        {
            builder.Entity<Address>()
                .HasOne(address => address.Cinema)
                .WithOne(cinema => cinema.Address)
                .HasForeignKey<Cinema>(cinema => cinema.AddressId);
        }

    }
}
