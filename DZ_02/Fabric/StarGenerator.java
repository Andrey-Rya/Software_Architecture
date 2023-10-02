package Fabric;

import Interfaces.iGameItem;
import Product.Star;

public class StarGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Star();
    }
}
