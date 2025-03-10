package controller;
import dto.ReportDetailsDto;
import service.ServiceFactory;
import service.custom.ReportDetailsService;
import java.util.ArrayList;


public class ReportDetailsController {
    private ReportDetailsService reportDetailsService = 
    (ReportDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ReportDetails);


    // Add Course
    public String add(ReportDetailsDto report) throws Exception {
        return reportDetailsService.add(report);
    }

    //  Get All Courses
    public ArrayList<ReportDetailsDto> getAll() throws Exception {
        return reportDetailsService.getAll();
    } 

    // Search Course by ID
    public ReportDetailsDto search(String StudentID) throws Exception {
        return reportDetailsService.search(StudentID);
    }

    // Delete Course
    public String delete(String StudentID) throws Exception {
        return reportDetailsService.delete(StudentID);
    }

    // Update Course
    public String update(ReportDetailsDto reportDto) throws Exception {
        return reportDetailsService.update(reportDto);
    }
}
