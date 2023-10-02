package Fabric;

import Interfaces.iGameItem;
import Product.Health;

public class HealthGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Health();
    }
}
