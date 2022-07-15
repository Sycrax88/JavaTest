package com.javatestwork.JavaTest.programs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProgramConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProgramRepository repository){
        return args -> {
            Program IngSistemas = new Program(1L, "Ingenieria de Sistemas", "Ingenieria", "Princial");
            Program IngElectronica = new Program(2L, "Ingenieria Electronica", "Ingenieria", "Principal");

            repository.saveAll(
                    List.of(IngSistemas,IngElectronica)
            );
        };
    }
}
