package subsystem1.crm;

public class CrmService {

    private CrmService() { // this makes sure that the class will be private.
        super();
    }

    public static void saveClient(String name, String cep, String city, String state) {
        System.out.println("Client has been saved in the CRM system.");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }

}
