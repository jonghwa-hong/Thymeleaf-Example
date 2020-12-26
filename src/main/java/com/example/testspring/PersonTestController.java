package com.example.testspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class PersonTestController {


    @GetMapping("/person")
    public String person(Model model) {
        List<Person> list = Arrays.asList(
                Person.builder().name("정우성").age(30).height(180)
                        .carList(Arrays.asList(new Car("소나타"), new Car("아반테"), new Car("넥소"))).build()
                , Person.builder().name("원빈").age(19).height(181)
                        .carList(Arrays.asList(new Car("소나타"), new Car("아반테"), new Car("BMW"))).build()
                , Person.builder().name("이정").age(22).height(180)
                        .carList(Arrays.asList(new Car("아반테"), new Car("그랜져"), new Car("페라리"))).build()
        );
        Person person = Person.builder()
                .name("장동건")
                .age(30)
                .build();
        model.addAttribute("list", list);
        model.addAttribute("person", person);
        return "person";
    }
}
