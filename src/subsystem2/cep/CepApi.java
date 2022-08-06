package subsystem2.cep;

import gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
        super(); // it will work with or without the super.
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String retrieveCity(String cep) {
        return "Curitiba";
    }


    public String retrieveState(String cep) {
        return "PR";
    }

}
