package dao;
import java.util.ArrayList;


public interface CrudDao<T, ID> extends SuperDao {
    boolean save(T t) throws Exception;
    boolean update(T t) throws Exception;
    boolean delete(ID iD) throws Exception;
    T search(ID iD) throws Exception;
    ArrayList<T> getAll() throws Exception;
}
