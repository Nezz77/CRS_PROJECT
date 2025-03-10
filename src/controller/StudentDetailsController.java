package controller;
import dto.StudentDetailsDto;
import service.ServiceFactory;
import service.custom.StudentDetailsService;
import java.util.ArrayList;

public class StudentDetailsController {
    private StudentDetailsService studentDetailsService = 
    (StudentDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.StudentDetails);


    // Add Course
    public String addStudent(StudentDetailsDto student) throws Exception {
        return studentDetailsService.addStudent(student);
    }

    // Get All Courses
    public ArrayList<StudentDetailsDto> getAllStudents() throws Exception {
        return studentDetailsService.getAllStudents();
    } 

    // Search Course by ID
    public StudentDetailsDto searchStudent(String StudentID) throws Exception {
        return studentDetailsService.searchStudent(StudentID);
    }

    // Delete Course
    public String deleteStudent(String StudentID) throws Exception {
        return studentDetailsService.deleteStudent(StudentID);
    }

    // Update Course
    public String updateStudent(StudentDetailsDto studentDto) throws Exception {
        return studentDetailsService.updateStudent(studentDto);
    }
}
