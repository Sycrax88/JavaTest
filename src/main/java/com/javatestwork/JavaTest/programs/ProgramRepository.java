package com.javatestwork.JavaTest.programs;


@Repository
public interface ProgramRepository
        extends JpaRepository<Program, Long> {
    // SELECT * FROM program WHERE name = ?
    Optional<Program> findProgramByName(String name);
}
