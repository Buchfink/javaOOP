package com.javaoo.students;

public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student other) {
        if(this.getName().compareTo(other.getName())>0)
            return 1;
        else if (this.getName() == other.getName())
            return 0 ;
        return -1 ;
    }

    public Student(Integer id, String name, String surname, Integer yearOfBirth, String faculty, String group) {
        setId(id);
        setName(name);
        setSurname(surname);
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
        this.group = group;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id= ").append(getId());
        sb.append(", Name= ");
        sb.append(getName());
        sb.append(", Surname= ");
        sb.append(getSurname());
        sb.append(", yearOfBirth= ");
        sb.append(getYearOfBirth());
        sb.append(", faculty= ");
        sb.append(getFaculty());
        sb.append(", group= ");
        sb.append(getGroup());
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    private Integer id;
    private String name;
    private String surname;
    private Integer yearOfBirth;
    private String faculty;
    private String group;
}
