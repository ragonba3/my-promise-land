/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ragonba3
 */
public class Ambulance  implements EmergencyVehicle {
    
    
    @Override
 public void moveForward(int milesPerHour){
   
}   
 @Override
public void moveBackward(int milesPerHour){
}
@Override
public void stop(){
    
}
@Override
public void turnLeft(){
}
@Override
public void turnRight(){
    
}
@Override
public void engineOn(){
    
}
@Override
public void engineOff(){
    
}

    @Override
    public void flashersOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void flashersOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sirenOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sirenOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
