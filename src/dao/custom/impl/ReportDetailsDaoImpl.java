package dao.custom.impl;
import dao.custom.ReportDetailsDao;
import entity.ReportDetailsEntity;
import java.util.ArrayList;
import dao.CrudUtil;
import java.sql.ResultSet;

public class ReportDetailsDaoImpl implements ReportDetailsDao{
    @Override
    public boolean save(ReportDetailsEntity t) throws Exception {       
         return CrudUtil.executeUpdate("INSERT INTO Enrollment VALUES (?,?,?,?)",
                 t.getStudentID(),t.getCourseID(),t.getSemester(),t.getGrade());
    }

    @Override
    public boolean update(ReportDetailsEntity t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE Enrollment SET StudentID = ?, CourseID=?, Semester=?, Grade=?",
                 t.getStudentID(),t.getCourseID(),t.getSemester(),t.getGrade());
               
    }

    @Override
    public boolean delete(String StudentID) throws Exception {
          return CrudUtil.executeUpdate("DELETE from Enrollment WHERE StudentID=?", StudentID);
    }

    @Override
    public ReportDetailsEntity search(String StudentID) throws Exception {
        ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Enrollment WHERE StudentID=?", StudentID);
        if(rst.next()){
            return new ReportDetailsEntity(rst.getString("StudentID"),
                    rst.getString("CourseID"),
                    rst.getString("Semester"), 
                    rst.getString("Grade")
                    );
        }
        return null;
    }
    

    @Override
    public ArrayList<ReportDetailsEntity> getAll() throws Exception {
        ArrayList<ReportDetailsEntity> reportDetailsEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Enrollment");
        while(rst.next()){
            reportDetailsEntities.add(new ReportDetailsEntity(rst.getString("StudentID"),
                    rst.getString("CourseID"),
                    rst.getString("Semester"), 
                    rst.getString("Grade")
            ));
        }
        return reportDetailsEntities;
    }
    
}
