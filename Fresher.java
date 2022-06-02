package com.javaoo.students;

public class Fresher implements Comparable<Fresher> {

    @Override
    public int compareTo(Fresher other) {
        Integer sum=0;
        for(Integer n:this.getNotes()){
            sum = sum+n;
        }
        Integer sumOther=0;
        for(Integer n:other.getNotes()){
            sumOther = sumOther+n;
        }
        if(sum<sumOther)
            return 1;
        else if (sum == sumOther)
            return 0 ;
        return -1 ;
    }

    public Fresher(Integer id, String name, String surname, Integer yearOfBirth, String faculty, Integer[] notes) {
        setId(id);
        setName(name);
        setSurname(surname);
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
        this.notes = notes;
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
        sb.append(showNotes(getNotes())
        );
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

    private Integer id;
    private String name;
    private String surname;
    private Integer yearOfBirth;
    private String faculty;

    public Integer[] getNotes() {
        return notes;
    }

    public String showNotes(Integer[] notes){
        String m="";
        for(Integer n: notes){
            m = m + " " +n;
        }
        return m;
    }

    public void setNotes(Integer[] notes) {
        this.notes = notes;
    }

    private Integer[] notes = new Integer[3];
}
