package dao.custom.impl;
import dao.custom.StudentDetailsDao;
import entity.StudentDetailsEntity;
import java.util.ArrayList;
import dao.CrudUtil;
import java.sql.ResultSet;


public class StudentDetailsDaoImpl implements StudentDetailsDao{
    @Override
    public boolean save(StudentDetailsEntity t) throws Exception {       
         return CrudUtil.executeUpdate("INSERT INTO Student_Details VALUES (?,?,?,?,?,?)",
                 t.getStudetID(),t.getName(),t.getDateOfBirth(),t.getProgramOfStudy(),t.getYear(),t.getContact());
    }

    @Override
    public boolean update(StudentDetailsEntity t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE Student_Details SET Name = ?, DateOfBirth=?, ProgramOfStudy=?, Year=?,Contact=? WHERE StudentID=?",
                 t.getName(),t.getDateOfBirth(),t.getProgramOfStudy(),t.getYear(),t.getContact(),t.getStudetID());
               
    }

    @Override
    public boolean delete(String StudentID) throws Exception {
          return CrudUtil.executeUpdate("DELETE from Student_Details WHERE StudentID=?", StudentID);
    }

    @Override
    public StudentDetailsEntity search(String StudentID) throws Exception {
        ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Student_Details WHERE StudentID=?", StudentID);
        if(rst.next()){
            return new StudentDetailsEntity(rst.getString("studentID"),
                    rst.getString("Name"),
                    rst.getString("DateOfBirth"), 
                    rst.getString("ProgramOfStudy"),
                    rst.getInt("Year"),
                    rst.getString("Contact"));
        }
        return null;
    }
    

    @Override
    public ArrayList<StudentDetailsEntity> getAll() throws Exception {
        ArrayList<StudentDetailsEntity> studentDetailsEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Student_Details");
        while(rst.next()){
            studentDetailsEntities.add(new StudentDetailsEntity(rst.getString("StudentID"),
                    rst.getString("Name"),
                    rst.getString("DateOfBirth"), 
                    rst.getString("ProgramOfStudy"),
                    rst.getInt("Year"),
                    rst.getString("Contact")));
        }
        return studentDetailsEntities;
    }
    
}
