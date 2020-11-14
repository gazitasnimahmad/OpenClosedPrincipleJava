package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SmartBulb smartBulb = new SmartBulb();
        Scene relaxingEvening = new Scene("relaxing Evening" , smartBulb);
        relaxingEvening.startScene();

        SmartAC smartAc = new SmartAC();
        Scene sleepyNight = new Scene("Sleepy night",smartAc);
        sleepyNight.startScene();

    }
}
