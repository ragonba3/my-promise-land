/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ragonba3
 */
public class HouseInGps {
    
    private double latitud;
    private double longitud;
    
    public HouseInGps (double lat, double lon){
        this.latitud=lat;//getters 
        this.latitud=lon;
        
        
    }
    
    public double getLatitud() { //setters
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    
    
}
