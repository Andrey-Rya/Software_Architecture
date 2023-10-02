package Fabric;

import Interfaces.iGameItem;
import Product.Manna;

public class MannaGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Manna();
    }
}
