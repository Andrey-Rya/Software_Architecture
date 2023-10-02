import Fabric.ItemGenerator;
import Product.ItemReward;

import java.util.List;

public class Functions {
    public static void AddReward(List<ItemGenerator> list, ItemGenerator item, int count) {
        for (int i = 0; i < count; i++) {
            list.add(item);
        }
    }
}
