package service;

import service.custom.impl.CourseDetailsServiceImpl;
import service.custom.impl.StudentDetailsServiceImpl;
import service.custom.impl.FacultyDetailsServiceImpl;
import service.custom.impl.ReportDetailsServiceImpl;

public class ServiceFactory {
    private static volatile ServiceFactory serviceFactory;

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            synchronized (ServiceFactory.class) {
                if (serviceFactory == null) {
                    serviceFactory = new ServiceFactory();
                }
            }
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case CourseDetails:
                return new CourseDetailsServiceImpl();
            case StudentDetails:
                return new StudentDetailsServiceImpl();
            case FacultyDetails:
                return new FacultyDetailsServiceImpl();
           case ReportDetails:
                return new ReportDetailsServiceImpl();
            default:
                throw new IllegalArgumentException("Invalid Service Type: " + type);
        }
    }

    public enum ServiceType {
        CourseDetails, StudentDetails, FacultyDetails,ReportDetails//  Add StudentProgress here
    }
}
