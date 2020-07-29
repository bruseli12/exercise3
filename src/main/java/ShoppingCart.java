import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> shoppingCard = new HashMap<String, Integer>();

    public Map<String, Integer> getShoppingCard() {
        return shoppingCard;
    }

    public void addGoods(String goodsName, int quantity) {
        if (shoppingCard.containsKey(goodsName)) {
            shoppingCard.put(goodsName, shoppingCard.get(goodsName) + quantity);
        }
        else{
            shoppingCard.put(goodsName,quantity);
        }
    }

}
