package rmiservice;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class conversionimpl  extends UnicastRemoteObject implements IConversion {

    private static final double TAUX = 3.4; // 1 EUR = 3.4 TND (change if you want)

    public conversionimpl() throws RemoteException {
        super();
    }

    @Override
    public double convertirMontant(double mt) throws RemoteException {
        return mt * TAUX;
    }
}
