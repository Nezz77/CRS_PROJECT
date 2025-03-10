package service.custom;
import dto.StudentDetailsDto;
import java.util.ArrayList;
import service.SuperService;


public interface StudentDetailsService extends SuperService{
    public String addStudent(StudentDetailsDto student) throws Exception;
    public ArrayList<StudentDetailsDto> getAllStudents() throws Exception;
    public StudentDetailsDto searchStudent(String StudentID) throws Exception;
    public String deleteStudent(String StudentID) throws Exception;
    public String updateStudent(StudentDetailsDto studentDto) throws Exception;
}
