package org.framework.git.bank.controller;

import org.framework.git.bank.entity.Card;
import org.framework.git.bank.service.GenericInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/card")
public class CardController implements GenericInterfaceController<Card> {

    private final GenericInterfaceService<Card> interfaceService;

    public CardController(GenericInterfaceService<Card> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    @Override
    public List<Card> findAll() {
        return interfaceService.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public Optional<Card> findById(@PathVariable Long id) {
        return interfaceService.findById(id);
    }

    @PostMapping
    @Override
    public Card save(Card card) {
        return interfaceService.save(card);
    }

    @PutMapping("/{id}")
    @Override
    public Card update(Card card) {
        return interfaceService.save(card);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {
        interfaceService.delete(id);
    }
}
