package controller;

import java.sql.Connection;
import db.DBConnection;
import dto.FacultyDetailsDto;
import service.ServiceFactory;
import service.custom.FacultyDetailsService;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FaclttyDetailsController {
    private FacultyDetailsService facultyDetailsService = 
    (FacultyDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.FacultyDetails);


    //  Add Course
    public String add(FacultyDetailsDto faculty) throws Exception {
        return facultyDetailsService.add(faculty);
    }


    // Search Course by ID
    public FacultyDetailsDto search(String FacultyID) throws Exception {
        return facultyDetailsService.search(FacultyID);
    }

    // Delete Course
    public String delete(String FacultyID) throws Exception {
        return facultyDetailsService.delete(FacultyID);
    }

    // Update Course
    public String update(FacultyDetailsDto facultyDto) throws Exception {
        return facultyDetailsService.update(facultyDto);
    }
    public ArrayList<FacultyDetailsDto> getAll() {
    ArrayList<FacultyDetailsDto> facultyList = new ArrayList<>();
    try {
        String query = "SELECT * FROM Faculty_Details"; // Adjust table name if needed
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            FacultyDetailsDto faculty = new FacultyDetailsDto(
                rs.getString("FacultyID"), 
                rs.getString("Name"), 
                rs.getString("Department"), 
                rs.getString("Contact")
            );
            facultyList.add(faculty);
        }
        
        rs.close();
        ps.close();
        conn.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return facultyList;
}

}
