package service.custom.impl;

import dao.DaoFactory;
import dao.custom.FacultyDetailsDao;
import dto.FacultyDetailsDto;
import entity.FacultyDetailsEntity;
import service.custom.FacultyDetailsService;
import java.util.ArrayList;


public class FacultyDetailsServiceImpl implements FacultyDetailsService{
private FacultyDetailsDao facultyDetailsDao = (FacultyDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.FacultyDetails);

    @Override
    public String add(FacultyDetailsDto faculty) throws Exception {
    FacultyDetailsEntity facultyDetailsEntity = new FacultyDetailsEntity(faculty.getFacultyID(),faculty.getName(),faculty.getDepartment(),faculty.getContact());
         boolean isSaved = facultyDetailsDao.save(facultyDetailsEntity);
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public ArrayList<FacultyDetailsDto> getAll() throws Exception {
        ArrayList<FacultyDetailsEntity> facultyDetailsEntities = facultyDetailsDao.getAll();
        ArrayList<FacultyDetailsDto> facultyDetailsDtos = new  ArrayList<>();
        
        for (FacultyDetailsEntity facultyDetailsEntity : facultyDetailsEntities) {
            FacultyDetailsDto dto = new FacultyDetailsDto(facultyDetailsEntity.getFacultyID(),facultyDetailsEntity.getName(),facultyDetailsEntity.getDepartment(),facultyDetailsEntity.getContact());
        }
        return facultyDetailsDtos;
    }

    @Override
    public FacultyDetailsDto search(String FacultyID) throws Exception {
        FacultyDetailsEntity facultyDetailsEntity = facultyDetailsDao.search(FacultyID);
        if(facultyDetailsEntity != null){
        return new FacultyDetailsDto(facultyDetailsEntity.getFacultyID(),facultyDetailsEntity.getName(),facultyDetailsEntity.getDepartment(),facultyDetailsEntity.getContact());
        }
        return null;
    }

    @Override
    public String delete(String FacultyID) throws Exception {
         boolean isDeleted = facultyDetailsDao.delete(FacultyID);
            return isDeleted ? "Success" : "Fail";
    }

    @Override
    public String update(FacultyDetailsDto faculty) throws Exception {
       FacultyDetailsEntity facultyDetailsEntity = new FacultyDetailsEntity(faculty.getFacultyID(),faculty.getName(),faculty.getDepartment(),faculty.getContact());
       boolean isSaved = facultyDetailsDao.update(facultyDetailsEntity);
       return isSaved ? "Success" : "Fail";
    }
    
}
