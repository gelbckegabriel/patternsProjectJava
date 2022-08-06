package com.application.labpatternsprojectspring.gof.service.impl;

import com.application.labpatternsprojectspring.gof.model.Adress;
import com.application.labpatternsprojectspring.gof.model.AdressRepository;
import com.application.labpatternsprojectspring.gof.model.Client;
import com.application.labpatternsprojectspring.gof.model.ClientRepository;
import com.application.labpatternsprojectspring.gof.service.ClientService;
import com.application.labpatternsprojectspring.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AdressRepository adressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> searchAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client searchById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void add(Client client) {
        saveClientWithCep(client);
    }

    @Override
    public void edit(Long id, Client client) {
        Optional<Client> clientDataBase = clientRepository.findById(id);
        if (clientDataBase.isPresent()) {
            saveClientWithCep(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }


    private void saveClientWithCep(Client client) {
        String cep = client.getAdress().getCep();
        Adress adress = adressRepository.findById(cep).orElseGet(() -> {
            Adress newAdress = viaCepService.consultCep(cep);
            return newAdress;
        });
        client.setAdress(adress);

        clientRepository.save(client);
    }
}