package new_simvasos.adaptation;

import new_simvasos.log.Log;

public class main {
    public static void main (String[] args) {
        String path = "./src./new main./Integrated./src./new_simvasos./adaptation./configuration./";
        SmartHomeSimulation smartHomeSimulation = new SmartHomeSimulation(path + "simulationConfig.txt");
        Log log = smartHomeSimulation.runSimulation();
        log.printSnapshot();
    }
}