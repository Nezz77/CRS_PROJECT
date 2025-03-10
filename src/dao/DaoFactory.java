package dao;

import dao.custom.impl.CourseDetailsDaoImpl;
import dao.custom.impl.FacultyDetailsDaoImpl;
import dao.custom.impl.ReportDetailsDaoImpl;
import dao.custom.impl.StudentDetailsDaoImpl;

public class DaoFactory {
    private static volatile DaoFactory daoFactory;

    private DaoFactory() {}

    // Thread-safe Singleton Pattern
    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    daoFactory = new DaoFactory();
                }
            }
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case CourseDetails:
                return new CourseDetailsDaoImpl();
            case StudentDetails:
                return new StudentDetailsDaoImpl();
           
            case FacultyDetails:
                return new FacultyDetailsDaoImpl();
             case ReportDetails:
                return new ReportDetailsDaoImpl();    
            default:
                throw new IllegalArgumentException("Invalid DAO Type: " + type);
        }
    }

    // Enum for DAO Types
    public enum DaoTypes {
        StudentDetails, CourseDetails, FacultyDetails,ReportDetails
    }
}
