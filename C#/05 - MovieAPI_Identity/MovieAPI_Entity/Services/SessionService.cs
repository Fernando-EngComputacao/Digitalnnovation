using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using MovieAPI_Entity.Controllers.Dtos.Session;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Services
{
    public class SessionService
    {
        private ApiContext _context;
        private IMapper _mapper;

        //Constructor
        public SessionService(ApiContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;

        }

        //Get
        public List<ReadSessionDto> SessionRecover()
        {
            return _mapper.Map<List<ReadSessionDto>>(_context.Sessions.ToList());
        }

        //Get("{id}")
        public ReadSessionDto SessionFindById(int id)
        {
            Session session = _context.Sessions.FirstOrDefault(session => session.Id == id);
            Console.WriteLine(session);
            if (session == null) return null;
            return _mapper.Map<ReadSessionDto>(session);
        }
        //Post
        public ReadSessionDto AddSession(CreateSessionDto form)
        {
            Session session = _mapper.Map<Session>(form);
            _context.Sessions.Add(session);
            _context.SaveChanges();
            return _mapper.Map<ReadSessionDto>(session);
        }

        //Put
        public ReadSessionDto SessionUpdate(int id, UpdateSessionDto form)
        {
            Session session = _context.Sessions.FirstOrDefault(session => session.Id == id);
            if (session == null) return null;
            _mapper.Map(form, session);
            _context.SaveChanges();
            return _mapper.Map<ReadSessionDto>(session);
        }

        //Delete
        public ReadSessionDto SessionDelete(int id)
        {
            Session session = _context.Sessions.FirstOrDefault(session => session.Id == id);
            if (session == null) return null;

            _context.Sessions.Remove(session);
            _context.SaveChanges();
            return _mapper.Map<ReadSessionDto>(session);
        }
    }
}
