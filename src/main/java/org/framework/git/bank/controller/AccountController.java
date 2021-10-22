package org.framework.git.bank.controller;

import org.framework.git.bank.entity.Account;
import org.framework.git.bank.service.GenericInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController implements GenericInterfaceController<Account> {

    private final GenericInterfaceService<Account> interfaceService;

    public AccountController(GenericInterfaceService<Account> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    @Override
    public List<Account> findAll() {
        return interfaceService.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public Optional<Account> findById(@PathVariable Long id) {
        return interfaceService.findById(id);
    }

    @PostMapping
    @Override
    public Account save(Account account) {
        return interfaceService.save(account);
    }

    @PutMapping("/{id}")
    @Override
    public Account update(Account account) {
        return interfaceService.save(account);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {
        interfaceService.delete(id);
    }
}
