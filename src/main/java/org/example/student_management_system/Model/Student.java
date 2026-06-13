package org.example.student_management_system.Model;


import jakarta.persistence.*;


@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String course;

    // Default Constructor;  hm hibernate ko object create karne ke liya default constructor banate hai
   public  Student(){}

    //Parameterised Constructor;
    public Student(Long id,String name,String email,String course){
             this.id = id;
             this.name = name;
             this.email = email;
             this.course = course;
    }


    // Using Getter and Setter method used;

    public void setId(Long id){
       this.id = id;
    }

    public Long getId(){
       return id;
    }

    public void setName(String name){
       this.name = name;
    }

    public String getName(){
       return name;
    }

    public void setEmail(String email){
       this.email = email;
    }

    public String getEmail(){
       return email;
    }

    public void setCourse(String course){
       this.course = course;
    }

    public String getCourse(){
       return course;
    }
}
