package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class Leibniz extends UnicastRemoteObject implements InterfaceLeibniz {
    protected Leibniz() throws RemoteException {
        super();
        System.out.println("Marcelo curte pirocas!");
    }

    @Override
    public double calc(double n) throws RemoteException {
        // TODO Auto-generated method stub
        double pi = 0;

        for (int i = 0; i < n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        return pi * 4;
    }
}
