package gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {

    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstance().retrieveCity(cep);
        String state = CepApi.getInstance().retrieveState(cep); // needed for the implementation below.

        CrmService.saveClient(name, cep, city, state);
    }

}
