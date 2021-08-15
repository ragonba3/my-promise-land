/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVDLibraryController;

import DVDLibrarydao.DVDLibraryDao;
import DVDLibrarydao.DVDLibraryDaoFileImpl;
import DVDLibrarydto.DVD;
import DVDLibraryui.DVDLibraryView;
import DVDLibraryui.UserIO;
import DVDLibraryui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author ragonba3
 */
public class DVDLibraryController {
    
    private DVDLibraryView view;
    private DVDLibraryDao dao;
    private UserIO io = new UserIOConsoleImpl();
    private DVDLibraryDao dao = new DVDLibraryDaoFileImp();

    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view){
        this.dao = dao;
        this.view;
    }
    
    public DVDLibraryController() {
        this.view = new DVDLibraryView();
    }
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            
            menuSelection = getMenuSelection();
            
            io.print("Main Menu");
            io.print("1. List DVDs");
            io.print("2. Create New DVD");
            io.print("3. View a DVD");
            io.print("4. Remove DVD");
            io.print("5. Exit");
            
            menuSelection = io.readInt("Please select from the"+" above choices.", 1, 5);
            
            switch (menuSelection){
                case 1:
                    listDVDs();
                    break;
                case 2:
                    CreateDVD();
                    break;
                case 3:
                    viewDVD();
                    break;
                case 4:
                    removeDVD();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }
        }
        io.print("GOOD BYE");
    }
   private int getMenuSelection(){
       return view.printMenuAndGetSelection();
   }

    private void CreateDVD() {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getDVDId(),newDVD);
        view.displayCreateSuccessBanner();
    }
    
    private void listDVDs(){
        view.displayDisplayAllBanner();
        List<DVD> DvdList = dao.getAllDVDs();
        view.displayDVDList(DvdList);
    }

    private void viewDVD(){
        view.displayCreateDVDBanner();
        String dvdId = view.getDVDIdChoice();
        DVD Dvd = dao.getDVD(dvdId);
        view.displayDVD(Dvd);                   
    }
    private void removeDVD(){
        view.displayRemoveDVDBanner();
        String dvdId = view.getDVDIdChoice();
        DVD removedDVD = dao.removeDVD(dvdId);
        view.displayRemoveResult(removedDVD);
    }
    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }
    private void exitMessage(){
        view.displayExitBanner();
    }
    
}



