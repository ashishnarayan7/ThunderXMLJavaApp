package com.example;

import java.io.File;
import com.example.services.ServiceHandler;

public class App {
    public static void main(String[] args) {
        System.out.println("Initializing Thunder XML Java Application...");
        
        // Load Thunder XML Configuration
        File configFile = new File("src/main/resources/thunder/config.xml");
        if (configFile.exists()) {
            System.out.println("Config file loaded: " + configFile.getAbsolutePath());
        } else {
            System.err.println("Config file not found!");
            return;
        }
        
        // Start Service
        ServiceHandler handler = new ServiceHandler();
        handler.startService();
    }
}
