package T2021.SpringB.q14;

import java.util.Arrays;

public class School {
    private String name;
    private String manager;
    private Teacher[] teachers;

    public School(String name, String manager, Teacher[] teachers) {
        this.name = name;
        this.manager = manager;
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "School Name: " + name + ", School Manager: " + manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
