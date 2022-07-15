package com.javatestwork.JavaTest.programs;


import javax.persistence.*;

@Entity
@Table
public class Program {
    @Id
    @SequenceGenerator(
            name="program_sequence",
            sequenceName = "program_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String facultad;
    private String sede;

    public Program() {
    }

    public Program(Long id, String name, String facultad, String sede) {
        this.id = id;
        this.name = name;
        this.facultad = facultad;
        this.sede = sede;
    }

    public Program(String name, String facultad, String sede) {
        this.name = name;
        this.facultad = facultad;
        this.sede = sede;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getSede() {
        return sede;
    }

    @Override
    public String toString() {
        return "programs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", facultad='" + facultad + '\'' +
                ", sede='" + sede + '\'' +
                '}';
    }
}
