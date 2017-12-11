/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ishk
 */
public class Town {
    private boolean isOverNight;
    public String townName;
    
     Town(String townName){
       this.setTownName(townName);}

    public boolean getOverNightStop() {
        return isOverNight;
    }

    public void setOverNightStop(boolean isOverNight) {
        this.isOverNight = isOverNight;
    }
    
    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
}
