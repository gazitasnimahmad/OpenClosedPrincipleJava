package org.example;

public class Scene {

    public String sceneName;
    private SmartDevices smartDevices;

    public Scene(String sceneName,SmartDevices smartDevices){
        this.sceneName = sceneName;
        this.smartDevices = smartDevices;
    }

    public void startScene(){
        smartDevices.turnOn();
    }
}
