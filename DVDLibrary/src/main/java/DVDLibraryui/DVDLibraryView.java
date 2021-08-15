/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVDLibraryui;

import DVDLibrarydto.DVD;
import java.util.List;
import DVDLibrarydao.DVDLibraryDao;

/**
 *
 * @author ragonba3
 */
public class DVDLibraryView {
    
    private UserIO io = new UserIOConsoleImpl();
    private DVDLibraryView view = new DVDLibraryView();
    private final DVDLibraryDao dao = DVDLibraryDaoFileImpl();
        
    
    
    public void displayCreateDVDBanner()   {
        io.print("***Create DVD ***");
        
    }
    public void displayCreateSuccessBanner(){
            io.readString(
                    "DVD succesfully created. Please hit enter to continue");
    }
    
    public void displayDVDList(List<DVD> DvdList){
        for(DVD currentDVD : DvdList){
            String DvdInfo = String.format("#%s : %s %s",
                    currentDVD.getDVDId(),
                    currentDVD.getDVDTitle(),
                    currentDVD.getDVDReleaseDate(),
                    currentDVD.getDVDRate(),
                    currentDVD.getDVDDirectorsName(),
                    currentDVD.getDVDStudio(),
                    currentDVD.getDVDComments());}
            io.readString("Please hit enter to continue");
        }
    
    public int printMenuAndGetSelection(){
        io.print("Main Menu");
        io.print("1. List DVDs");
        io.print("2. Creat New DVD");
        io.print("3. View DVD");
        io.print("4. Remove DVD");
        io.print("5. Exit");
     
        return io.readInt("Please select from the above choises.", 1, 5);
    }
    
    
    public DVD getNewDVDInfo(){
        String DvdId = io.readString("Please enter DVD ID");
        String DVDTitle = io.readString("Please enter Title");
        String DVDReleaseDate = io.readString("Please enter Release Date");
        String DVDRate = io.readString("Please enter DVD Rate");
        String DVDDirectorsName =io.readString("Please enter Director's Name");
        String DVDStudio = io.readString("Enter Studio's Name");
        String DVDComments = io.readString("Please enter Comment");
        DVD currentDVD = new DVD(DvdId);
        currentDVD.setDVDId(DVDTitle);
        currentDVD.setDVDReleaseDate(DVDReleaseDate);
        currentDVD.setDVDRate(DVDRate);
        currentDVD.setDVDDirectorsName(DVDDirectorsName);
        currentDVD.setDVDStudio(DVDStudio);
        currentDVD.setDVDComments(DVDComments);
        return currentDVD;
    }
    public void displayDisplayAllBanner(){
        io.print("****Display DVD ***");
    }
    public String getDVDIdChoice(){
        return io.readString("Please enter DVD ID");
    }
    public void displayDVD(DVD dvd){
        if (dvd != null){
            io.print(dvd.getDVDId());
            io.print(dvd.getDVDTitle());
            io.print(dvd.getDVDReleaseDate());
            io.print(dvd.getDVDRate());
            io.print(dvd.getDVDDirectorsName());
            io.print(dvd.getDVDStudio());
            io.print(dvd.getDVDComments());
            io.print("");
        }else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }
    private DVDLibraryDao DVDLibraryDaoFileImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void createDVD(){
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getDVDId(), newDVD);
        view.displayCreateSuccessBanner();}
    
    public void displayRemoveDVDBanner(){
        io.print("***Remove DVD***");
    }
    public void displayRemoveResult(DVD DvdId){
        if(DvdId != null){
        io.print("DVD Title successfully removed.");
        
    }else {
            io.print("No such DVD");     
            }
            io.readString("Please hit enter to continue.");
            
    }
    
    public void displayExitBanner(){
        io.print("Good Bye");
    }
    public void displayUnknownCommandBanner(){
        io.print("Unknown Command");
    }
    }
    


