/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVDLibrarydao;

import DVDLibrarydto.DVD;
import java.util.List;

/**
 *
 * @author ragonba3
 */
public interface DVDLibraryDao {
    
    DVD addDVD(String DvdId, DVD Dvd);
    
    List<DVD> getAllDVDs();
    
    DVD getDVD(String DvdId);
    
    DVD removeDVD(String DvdId);
    
}
