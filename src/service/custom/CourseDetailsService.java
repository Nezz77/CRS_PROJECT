package service.custom;
import dto.CourseDetailsDto;
import java.util.ArrayList;
import service.SuperService;

public interface CourseDetailsService extends SuperService{
    public String addCourse(CourseDetailsDto course) throws Exception;
    public ArrayList<CourseDetailsDto> getAllCourses() throws Exception;
    public CourseDetailsDto searchCourse(String CourseID) throws Exception;
    public String deleteCourse(String CourseID) throws Exception;
    public String updateCourse(CourseDetailsDto courseDto) throws Exception;
    public boolean updateCourseCapacity(String CourseID, int newCapacity);
}
