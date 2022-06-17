using AutoMapper;
using MovieAPI_Entity.Controllers.Dtos.Manager;
using MovieAPI_Entity.Data;
using MovieAPI_Entity.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MovieAPI_Entity.Services
{
    public class ManagerService
    {
        private ApiContext _context;
        private IMapper _mapper;

        //Constructor (dependency injection)
        public ManagerService(ApiContext context, IMapper mapper)
        {
            _context = context;
            _mapper = mapper;
        }

        //Get
        public List<ReadManagerDto> ManagerRecover()
        {
            return _mapper.Map<List<ReadManagerDto>>(_context.Managers.ToList());
        }
        //Get("{id}")
        public ReadManagerDto ManagerFindById(int id)
        {
            Manager manager = _context.Managers.FirstOrDefault(manager => manager.Id == id);
            if (manager == null) return null;
            return _mapper.Map<ReadManagerDto>(manager);
        }
        //Post
        public ReadManagerDto AddManager(CreateManagerDto form)
        {
            Manager manager = _mapper.Map<Manager>(form);
            _context.Managers.Add(manager);
            _context.SaveChanges();
            return _mapper.Map<ReadManagerDto>(manager);
        }
        //Put
        public ReadManagerDto ManagerUpdate(int id, UpdateManagerDto form)
        {
            Manager manager = _context.Managers.FirstOrDefault(manager => manager.Id == id);
            if (manager != null)
            {
                _mapper.Map(form, manager);
                _context.SaveChanges();
                return _mapper.Map<ReadManagerDto>(manager);
            }
            return null;
        }
        //Delete
        public ReadManagerDto ManagerDelete(int id)
        {
            Manager manager = _context.Managers.FirstOrDefault(manager => manager.Id == id);
            if (manager != null)
            {
                _context.Managers.Remove(manager);
                _context.SaveChanges();
                return _mapper.Map<ReadManagerDto>(manager);
            }
            return null;
        }
    }
}
