import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, HoldingGoods> shoppingCard = new HashMap<String, HoldingGoods>();

    public Map<String, HoldingGoods> getShoppingCard() {
        return shoppingCard;
    }

    public void addGoods(String goodsName, HoldingGoods holdingGoods) {
        if (shoppingCard.containsKey(goodsName)) {
           HoldingGoods holdingGoods1=shoppingCard.get(goodsName);
           holdingGoods1.setQuanlity(holdingGoods.getQuanlity());
           shoppingCard.put(goodsName,holdingGoods1);
        }
        else{
            shoppingCard.put(goodsName,holdingGoods);
        }
    }

    public int gettotalamt(){
        int totalamt=0;
        for(String goods:shoppingCard.keySet()){
            totalamt+=shoppingCard.get(goods).gettotalamt();
        }
        return totalamt;
    }


}
