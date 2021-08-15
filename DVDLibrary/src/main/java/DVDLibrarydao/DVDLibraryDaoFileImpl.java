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
    public static final String DVD_FILE = "DVD.txt";
    public static final String DELIMETER = "::";
    
    private DVD unmarshallDVD(String dvdAsText){
        
        String[] dvdTokens = dvdAsText.split(DELIMETER);
        String dvdId = dvdTokens[0];
        DVD dvdFromFile = new DVD(dvdId);
        dvdFromFile.getDVDId(dvdTokens[1]);
        dvdFromFile.getDVDTitle(dvdTokens[2]);
        dvdFromFile.getDVDReleaseDate(dvdTokens[3]);
        return dvdFromFile;     
      }
    private void loadDVD() throws ClassDVDLibraryDaoException {
        Scanner scanner;
        
        try{
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        }
        Catch (FileNotFoundException e){
        throw new DVDLibraryDaoException("-_-Could not load DVD inti memory.", e);
        }
        String currentLine;
        DVD currentDVD;
        
        while (scanner.hasNextLine()) {
            currenteLine = scanner.nextLIne();
            currentDVD = unmarshallDVD(currentLine);
            dvds.put(currentDVD.getDVDId(),currentDVD);
        }
        scanner.close();
        private String marshallDVD(DVD aDVD){
            String dvdAsText = aDVD.getDVDId()+ DELIMETER;
            dvdAsText += aDVD.getDVDTitle()+ DELIMETER;
            dvdAsText += aDVD.getDVDReleaseDate() + DELIMETER;
            dvdAsTest += aDVD.getDVDRate();
            return dvdAsText;
        }
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
