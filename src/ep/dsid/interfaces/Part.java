package ep.dsid.interfaces;

import java.rmi.Remote;

public interface Part extends Remote {
    public int setId();
    public String setNome();
    public String setDescription();
    public int[] subComponentes();
}
