package Day1;

import java.util.Scanner;

public class Controller {
    private Service service=new Service();
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }



}