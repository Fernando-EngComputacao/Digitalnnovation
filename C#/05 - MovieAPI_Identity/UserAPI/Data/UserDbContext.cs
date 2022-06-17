using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;
using UserAPI.Models;

namespace UserAPI.Data
{
    public class UserDbContext : IdentityDbContext<IdentityUser<int>, IdentityRole<int>, int>
    {
        public DbSet<User> Users { get; set; }

        //Constructor
        public UserDbContext(DbContextOptions<UserDbContext> opt) : base(opt)
        {

        }
    }
}
