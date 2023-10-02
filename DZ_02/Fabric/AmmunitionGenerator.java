package Fabric;

import Interfaces.iGameItem;
import Product.Ammunition;

public class AmmunitionGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Ammunition();
    }
}
