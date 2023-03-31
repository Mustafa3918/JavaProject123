package java2_project_khan_manzani_sakalli;

import java.util.*;

public class Employee {
    private int id;
    private String name;
    private String job;
    private boolean fullTime;
    private String gender;

    public Employee(int id, String name, String job, boolean fullTime, String gender) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.fullTime = fullTime;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public String getGender() {
        return gender;
    }
}

