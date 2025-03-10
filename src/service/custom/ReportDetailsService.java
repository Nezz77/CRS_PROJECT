package service.custom;
import dto.ReportDetailsDto;
import java.util.ArrayList;
import service.SuperService;


public interface ReportDetailsService extends SuperService{
    public String add(ReportDetailsDto report) throws Exception;
    public ArrayList<ReportDetailsDto> getAll() throws Exception;
    public ReportDetailsDto search(String StudentID) throws Exception;
    public String delete(String StudentID) throws Exception;
    public String update(ReportDetailsDto reportDto) throws Exception;
}
