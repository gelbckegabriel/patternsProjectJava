package com.application.labpatternsprojectspring.gof.service;

import com.application.labpatternsprojectspring.gof.model.Client;

public interface ClientService {

    Iterable<Client> searchAll();

    Client searchById(Long id);

    void add(Client client);
    void edit(Long id, Client client);
    void delete(Long id);

}
