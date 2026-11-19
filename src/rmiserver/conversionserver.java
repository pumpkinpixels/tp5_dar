package rmiserver;

import rmiservice.conversionimpl;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class conversionserver {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            conversionimpl obj = new conversionimpl();

            Naming.rebind("rmi://localhost:1099/ConversionService", obj);

            System.out.println("Server ready, service published.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}