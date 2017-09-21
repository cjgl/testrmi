package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAdd extends Remote {
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 * @throws RemoteException
	 */
	public int add(int x, int y) throws RemoteException;
}
