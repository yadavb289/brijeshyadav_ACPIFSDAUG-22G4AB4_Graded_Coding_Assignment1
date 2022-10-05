package com.fullstacklearning;

public class Main {

    public static void main(String[] args) {

        AdminDepartment adminDepartment = new AdminDepartment();
        System.out.println("Welcome to "+adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork()+"\n"+adminDepartment.getWorkDeadline() +"\n"+adminDepartment.isTodayAHoliday()+"\n");

        HrDepartment hrDepartment = new HrDepartment();
        System.out.println("Welcome to "+hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity()+"\n"+hrDepartment.getTodaysWork()+"\n"+hrDepartment.getWorkDeadline()+"\n"+hrDepartment.isTodayAHoliday()+"\n");

        TechDepartment techDepartment = new TechDepartment();
        System.out.println("Welcome to "+techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork()+"\n"+techDepartment.getWorkDeadline()+"\n"+techDepartment.getTechStackInformation()+"\n"+techDepartment.isTodayAHoliday()+"\n");
    }
}
