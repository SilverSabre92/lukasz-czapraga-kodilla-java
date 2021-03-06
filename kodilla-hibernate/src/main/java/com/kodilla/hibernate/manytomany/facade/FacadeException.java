package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception {
    public static String ERR_EMPL_NOT_FOUND = "Employee was not found";
    public static String ERR_COMPANY_NOT_FOUND = "Company was not found";

    public FacadeException(String message) {
        super(message);
    }
}
