package com.javatestwork.JavaTest.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/programs")


public class ProgramController {

    private final ProgramService programService;

    @Autowired
    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping
    public List<Program> getPrograms() {
        return programService.getPrograms();
    }

    @PostMapping
    public void createNewProgram(@RequestBody Program program) {
        programService.addNewProgram(program);
    }

    @DeleteMapping(path = "{programId}")
    public void deleteProgram(@PathVariable("programId") Long programId) {
        programService.deleteProgram(programId);
    }

    @PutMapping(path = "{studentId}")
    public void updateProgram(@PathVariable("programId") Long programId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String facultad,
                              @RequestParam(required = false) String sede) {
        programService.updateProgram(programId, name, facultad, sede);
    }
}
