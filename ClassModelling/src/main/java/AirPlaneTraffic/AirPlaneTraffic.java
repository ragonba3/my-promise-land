/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirPlaneTraffic;

import java.util.Date;

/**
 *
 * @author ragonba3
 */
public class AirPlaneTraffic {
    
   
	public static final Runway rw = new Runway();
	
	static final Gate1 g = new Gate1();
	
	static final Gate2 g1 = new Gate2();
	private Date beginTime;
	private int state; 
	private int priorityLevel; 
	String[] states = { "AirborneLanding", "Landing", "TaxiingToGate", "AtGate", "TaxiingToRunway", "TakingOff",
			"AirborneTookOff" };

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String[] getStates() {
        return states;
    }

    public void setStates(String[] states) {
        this.states = states;
    }

                
                
                
                       }

