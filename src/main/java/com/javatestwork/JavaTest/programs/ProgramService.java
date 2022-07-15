package com.javatestwork.JavaTest.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Component
public class ProgramService {
    private final ProgramRepository programRepository;

    @Autowired
    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    public List<Program> getPrograms() {
        return programRepository.findAll();
         }

    public void addNewProgram(Program program) {
        programRepository.findProgramByName(program.getName());

        System.out.println(program);
        programRepository.save(program);
    }

    public void deleteProgram(Long programId) {
        boolean exists = programRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("Programa con id "+programId+" no existe.");
        }
        programRepository.deleteById(programId);
    }

    @Transactional
    public void updateProgram(Long programId, String name, String facultad, String sede) {
        Program program= programRepository.findById(programId).orElseThrow(()-> new IllegalStateException("Programa con id "+programId+" no existe."));

        if (name != null && name.length() > 0 && !Objects.equals(program.getName(),name)){
            program.setName(name);
        }
        if (facultad != null && facultad.length() > 0 && !Objects.equals(program.getFacultad(),facultad)){
            program.setFacultad(facultad);
        }
        if (sede != null && sede.length() > 0 && !Objects.equals(program.getSede(),sede)){
            program.setSede(sede);
        }
    }
}
