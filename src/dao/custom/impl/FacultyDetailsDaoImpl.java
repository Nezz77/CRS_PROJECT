package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.FacultyDetailsDao;
import entity.FacultyDetailsEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FacultyDetailsDaoImpl implements FacultyDetailsDao{

    @Override
    public boolean save(FacultyDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Faculty_Details VALUES (?,?,?,?)",
                 t.getFacultyID(),t.getName(),t.getDepartment(),t.getContact());
    }

    @Override
    public boolean update(FacultyDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Faculty_Details SET  Name=?, Department=?,Contact=? WHERE FacultyID=?",
                 t.getName(),t.getDepartment(),t.getContact(),t.getFacultyID()); 
    }


    @Override
    public boolean delete(String FacultyID) throws Exception {
         return CrudUtil.executeUpdate("DELETE from Faculty_Details WHERE FacultyID=?", FacultyID);
    }

    @Override
    public FacultyDetailsEntity search(String FacltyID) throws Exception {
         ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Faculty_Details WHERE FacultyID=?", FacltyID);
        if(rst.next()){
            return new FacultyDetailsEntity(rst.getString("FacultyID"),
                    rst.getString("Name"),
                    rst.getString("Department"), 
                    rst.getString("Contact"));
        }
        return null;
    }
    

    @Override
    public ArrayList<FacultyDetailsEntity> getAll() throws Exception {
        ArrayList<FacultyDetailsEntity> facultyDetailsEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.extecuteQuery("SELECT * from Faculty_Details");
        while(rst.next()){
            facultyDetailsEntities.add(new FacultyDetailsEntity(rst.getString("FacultyID"),
                    rst.getString("Name"),
                    rst.getString("Department"), 
                    rst.getString("Contact")));
        }
        return facultyDetailsEntities;
    }
}
