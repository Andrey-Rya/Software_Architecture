import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<ItemGenerator> listOfFabrics = new ArrayList<ItemGenerator>();

        Functions.AddReward(listOfFabrics, new GoldGenerator(), 50);
        Functions.AddReward(listOfFabrics, new SilverGenerator(), 100);
        Functions.AddReward(listOfFabrics, new GemGenerator(), 10);
        Functions.AddReward(listOfFabrics, new AddLifeGenerator(), 3);
        Functions.AddReward(listOfFabrics, new AmmunitionGenerator(), 20);
        Functions.AddReward(listOfFabrics, new HealthGenerator(), 10);
        Functions.AddReward(listOfFabrics, new MannaGenerator(), 30);
        Functions.AddReward(listOfFabrics, new StarGenerator(), 100);

        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            listOfFabrics.get(rnd.nextInt(323)).openReward();
        }
    }
}
