package ep.dsid.interfaces;

import java.rmi.Remote;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public interface PartRepository extends Remote {
    public LinkedList<Part> listOfParts = new LinkedList<Part>();

}
