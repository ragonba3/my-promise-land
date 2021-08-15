/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVDLibrarydao;

import DVDLibrarydto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ragonba3
 */
public class DVDLibraryDaoFileImpl implements  DVDLibraryDao{
   
    private Map<String,DVD> Dvds = new HashMap<>();
    
    public void setDvds(Map<String, DVD> Dvds) {
        this.Dvds = Dvds;
    }

    @Override
    public DVD addDVD(String DvdId, DVD Dvd) {
        DVD prevDVD = Dvds.put(DvdId, Dvd);
        return prevDVD;
    }

    /*@Override
    public List<DVD> getAllDVDs() {
        return new ArrayList<DVD>(Dvd.values());
    }
    */
    @Override
    public DVD getDVD(String DvdId) {
        return Dvds.get(DvdId);
    }

    @Override
    public DVD removeDVD(String DvdId) {
        DVD removedDVD = Dvds.remove(DvdId);
        return removedDVD;
    }

    @Override
    public List<DVD> getAllDVDs() {
        return new ArrayList<DVD>(Dvds.values());
    }

    
}
