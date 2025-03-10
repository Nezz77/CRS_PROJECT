package dao.custom.impl;

import dao.custom.CourseDetailsDao;
import entity.CourseDetailsEntity;
import java.util.ArrayList;
import dao.CrudUtil;
import java.sql.ResultSet;


public  class CourseDetailsDaoImpl implements CourseDetailsDao{

    @Override
    public boolean save(CourseDetailsEntity t) throws Exception {       
         return CrudUtil.executeUpdate("INSERT INTO Course_Details VALUES (?,?,?,?,?,?)",
                 t.getCourseID(),t.getTitle(),t.getCreditHours(),t.getDepartment(),t.getPrerequisites(),t.getMaxEnrollmentCapacity());
    }

    @Override
    public boolean update(CourseDetailsEntity t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE Course_Details SET Title = ?, CreditHours=?, Department=?, Prerequisites=?,MaxEnrollmentCapacity=? WHERE CourseID=?",
                 t.getTitle(),t.getCreditHours(),t.getDepartment(),t.getPrerequisites(),t.getMaxEnrollmentCapacity(),t.getCourseID());
               
    }

    @Override
    public boolean delete(String CourseID) throws Exception {
          return CrudUtil.executeUpdate("DELETE from Course_Details WHERE CourseID=?", CourseID);
    }


    @Override
    public CourseDetailsEntity search(String CourseID) throws Exception {
        ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Course_Details WHERE CourseID=?", CourseID);
        if(rst.next()){
            return new CourseDetailsEntity(rst.getString("CourseID"),
                    rst.getString("Title"),
                    rst.getDouble("CreditHours"), 
                    rst.getString("Department"),
                    rst.getString("Prerequisites"),
                    rst.getInt("MaxEnrollmentCapacity"));
        }
        return null;
    }
    

    @Override
    public ArrayList<CourseDetailsEntity> getAll() throws Exception {
        ArrayList<CourseDetailsEntity> courseDetailsEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Course_Details");
        while(rst.next()){
            courseDetailsEntities.add(new CourseDetailsEntity(rst.getString("CourseID"),
                    rst.getString("Title"),
                    rst.getDouble("CreditHours"), 
                    rst.getString("Department"),
                    rst.getString("prerequisites"),
                    rst.getInt("MaxEnrollmentCapacity")));
        }
        return courseDetailsEntities;
    }

    

    
    
}
