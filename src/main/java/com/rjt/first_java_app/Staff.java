package com.rjt.first_java_app;

public class Staff {
    private String StaffName;
    private String StaffTitle;
    private double StaffSalary;

    public Staff() {

    }



    public Staff(String staffName, String staffTitle, double staffSalary) {
        StaffName = staffName;
        StaffTitle = staffTitle;
        StaffSalary = staffSalary;

    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String staffName) {
        StaffName = staffName;
    }

    public String getStaffTitle() {
        return StaffTitle;
    }

    public void setStaffTitle(String staffTitle) {
        StaffTitle = staffTitle;
    }

    public double getStaffSalary() {
        return StaffSalary;
    }

    public void setStaffSalary(double staffSalary) {
        StaffSalary = staffSalary;
    }
}
