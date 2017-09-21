package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImpl extends UnicastRemoteObject implements IAdd {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6315510043677087308L;

	protected AddImpl() throws RemoteException {
		super();
	}

	public int add(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x + y;
	}

}
