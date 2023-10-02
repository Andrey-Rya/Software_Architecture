package Fabric;

import Interfaces.iGameItem;
import Product.AddLife;

public class AddLifeGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new AddLife();
    }
}
