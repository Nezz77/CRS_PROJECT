package service.custom.impl;

import dao.DaoFactory;
import dao.custom.ReportDetailsDao;
import dto.ReportDetailsDto;
import entity.ReportDetailsEntity;
import service.custom.ReportDetailsService;
import java.util.ArrayList;


public class ReportDetailsServiceImpl implements ReportDetailsService{
    private ReportDetailsDao reportDetailsDao = (ReportDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ReportDetails);

    
    @Override
    public String add(ReportDetailsDto report) throws Exception {
        ReportDetailsEntity reportDetailsEntity = new ReportDetailsEntity(report.getStudentID(),report.getCourseID(),report.getSemester(),report.getGrade());
         boolean isSaved = reportDetailsDao.save(reportDetailsEntity);
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public ArrayList<ReportDetailsDto> getAll() throws Exception {
        ArrayList<ReportDetailsEntity> reportDetailsEntities = reportDetailsDao.getAll();
        ArrayList<ReportDetailsDto> reportDetailsDtos = new  ArrayList<>();
        
        for (ReportDetailsEntity reportDetailsEntity : reportDetailsEntities) {
            ReportDetailsDto dto = new ReportDetailsDto(reportDetailsEntity.getStudentID(),reportDetailsEntity.getCourseID(),reportDetailsEntity.getSemester(),reportDetailsEntity.getGrade());
            reportDetailsDtos.add(dto);
        }
        return reportDetailsDtos;
    }

    @Override
    public ReportDetailsDto search(String StudentID) throws Exception {
        ReportDetailsEntity reportDetailsEntity = reportDetailsDao.search(StudentID);
        if(reportDetailsEntity != null){
        return new ReportDetailsDto(reportDetailsEntity.getStudentID(),reportDetailsEntity.getCourseID(),reportDetailsEntity.getSemester(),reportDetailsEntity.getGrade());
        }
        return null;
    }

    @Override
    public String delete(String StudentID) throws Exception {
        boolean isDeleted = reportDetailsDao.delete(StudentID);
            return isDeleted ? "Success" : "Fail";
    }

    @Override
    public String update(ReportDetailsDto report) throws Exception {
        ReportDetailsEntity reportDetailsEntity = new ReportDetailsEntity(report.getStudentID(),report.getCourseID(),report.getSemester(),report.getGrade());
       boolean isSaved = reportDetailsDao.update(reportDetailsEntity);
       return isSaved ? "Success" : "Fail";
    }
}
