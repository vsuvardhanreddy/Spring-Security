package com.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/voter")
public class StudentController {

    public static final List<Voter> voterList = Arrays.asList(new Voter(1, "Suvardhan"),
                                                new Voter(2,"Sravanthi"));

    @GetMapping("{voterId}")
    public Voter findList(@PathVariable Integer voterId){
        return voterList.stream()
                .filter(voter -> voterId.equals(voter.getVoterId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("given "+voterId+"is not in the voter list"));
    }
}
