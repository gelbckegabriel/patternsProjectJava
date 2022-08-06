package com.application.labpatternsprojectspring.gof.controller;

import com.application.labpatternsprojectspring.gof.model.Client;
import com.application.labpatternsprojectspring.gof.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> searchAll() {
        return ResponseEntity.ok(clientService.searchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> searchById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.searchById(id));
    }

    @PostMapping
    public ResponseEntity<Client> add(@RequestBody Client client) {
        clientService.add(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping
    public ResponseEntity<Client> edit(@PathVariable Long id, @RequestBody Client client) {
        clientService.edit(id, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        clientService.delete(id);
        return ResponseEntity.ok().build();
    }

}
