package org.framework.git.bank.controller;

import org.framework.git.bank.entity.Person;
import org.framework.git.bank.service.GenericInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController implements GenericInterfaceController<Person> {

    private final GenericInterfaceService<Person> interfaceService;

    public PersonController(GenericInterfaceService<Person> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    @Override
    public List<Person> findAll() {
        return interfaceService.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public Optional<Person> findById(@PathVariable Long id) {
        return interfaceService.findById(id);
    }

    @PostMapping
    @Override
    public Person save(@RequestBody Person person) {
        return interfaceService.save(person);
    }

    @PutMapping("/{id}")
    @Override
    public Person update(@RequestBody Person person) {
        return interfaceService.update(person);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {
        interfaceService.delete(id);
    }

}
