package service.custom;

import dto.FacultyDetailsDto;
import dto.StudentDetailsDto;
import service.SuperService;
import java.util.ArrayList;


public interface FacultyDetailsService extends SuperService{
    public String add(FacultyDetailsDto faculty) throws Exception;
    public ArrayList<FacultyDetailsDto> getAll() throws Exception;
    public FacultyDetailsDto search(String FacultyID) throws Exception;
    public String delete(String FacultyID) throws Exception;
    public String update(FacultyDetailsDto facultyDto) throws Exception;
}
