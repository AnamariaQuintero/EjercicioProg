package com.mycompany.sportscenter;

import com.mycompany.sportscenter.scenario.Scenario;
import com.mycompany.sportscenter.sportsCenter.SportCenter;

public class SportsCenter {

    public static void main(String[] args) {
        SportCenter sportCenter = new SportCenter("El Campin", "ASD", "bogotà", "24 horas");
        
        Scenario scenario1 = new Scenario(1800, TypeSport.SOCCER, "18:00 - 20:00");
        Scenario scenario2 = new Scenario(400, TypeSport.VOLLEYBALL, "18:00 - 22:00");
        
        sportCenter.addScenario(scenario1);
        sportCenter.addScenario(scenario2);
        
        sportCenter.bookScenaio(scenario1);
        sportCenter.bookScenaio(scenario2);
        sportCenter.bookScenaio(scenario1);
    }
}
