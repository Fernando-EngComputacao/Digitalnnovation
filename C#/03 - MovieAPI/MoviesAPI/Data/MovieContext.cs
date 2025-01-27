﻿using Microsoft.EntityFrameworkCore;
using MoviesAPI.Models;

namespace MoviesAPI.Data
{
    public class MovieContext : DbContext
    {
        public DbSet<Movie> Movies { get; set;}

        //Constructor
        public MovieContext(DbContextOptions<MovieContext> opt) : base(opt)
        {
            
        }

       
    }
}
