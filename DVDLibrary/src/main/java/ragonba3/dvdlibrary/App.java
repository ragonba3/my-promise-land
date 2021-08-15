/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragonba3.dvdlibrary;

import DVDLibraryController.DVDLibraryController;

/**
 *
 * @author ragonba3
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo =new userIOConsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIO);
        DVDLIbraryDao myDao = new DVDLibraryDaoFileImpl();
        DVDLibraryController controller = new DVDLibraryController(myDao, myView);
        controller.run();
    }
    
}
