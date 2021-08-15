/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVDLibrarydto;

/**
 *
 * @author ragonba3
 */
public class DVD {
    private String DVDId;
    private String DVDTitle;
    private String DVDReleaseDate;
    private String DVDRate;
    private String DVDDirectorsName;
    private String DVDStudio;
    private String DVDComments;

    public DVD(String DvdId) {
        this.DVDId =  DvdId;
    }

    public String getDVDId() {
        return DVDId;
    }

    public void setDVDId(String DVDId) {
        this.DVDId = DVDId;
    }

    public String getDVDTitle() {
        return DVDTitle;
    }

    public void setDVDTitle(String DVDTitle) {
        this.DVDTitle = DVDTitle;
    }

    public String getDVDReleaseDate() {
        return DVDReleaseDate;
    }

    public void setDVDReleaseDate(String DVDReleaseDate) {
        this.DVDReleaseDate = DVDReleaseDate;
    }

    public String getDVDRate() {
        return DVDRate;
    }

    public void setDVDRate(String DVDRate) {
        this.DVDRate = DVDRate;
    }

    public String getDVDDirectorsName() {
        return DVDDirectorsName;
    }

    public void setDVDDirectorsName(String DVDDirectorsName) {
        this.DVDDirectorsName = DVDDirectorsName;
    }

    public String getDVDStudio() {
        return DVDStudio;
    }

    public void setDVDStudio(String DVDStudio) {
        this.DVDStudio = DVDStudio;
    }

    public String getDVDComments() {
        return DVDComments;
    }

    public void setDVDComments(String DVDComments) {
        this.DVDComments = DVDComments;
    }

    
   
}
