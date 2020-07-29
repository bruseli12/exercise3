import java.util.HashMap;
import java.util.Map;

public class Supermarket {
    private   Map<String, User> usersinfo = new HashMap<String, User>();
    private   Map<String, Goods> goodsInfo = new HashMap<String, Goods>();

    public void addGoods(Goods goods) {
        goodsInfo.put(goods.getName(), goods);
    }

    public void updateGoodsTypetoProtion(String goodsName) {
        Goods goods = goodsInfo.get(goodsName);
        goods.setGoodsType(GoodsType.PROMOTION);
        goodsInfo.put(goodsName, goods);
    }

    public void addUser(User user) {
        usersinfo.put(user.getName(), user);
    }

    public int calculate(ShoppingCart shoppingCart) {
        Map<String, Integer> goods = shoppingCart.getShoppingCard();
        int credit = 0;
        for (String goodsname : goods.keySet()) {
            if (GoodsType.PROMOTION == goodsInfo.get(goodsname).getGoodsType()) {
                credit += goodsInfo.get(goodsname).getPrice() * goods.get(goodsname) * 2;
            } else {
                credit += goodsInfo.get(goodsname).getPrice() * goods.get(goodsname);
            }

        }
        return credit;
    }

    public void updateGoodsTypetoImprotion(String goodsName) {
        Goods goods = goodsInfo.get(goodsName);
        goods.setGoodsType(GoodsType.IMPROMOTION);
        goodsInfo.put(goodsName, goods);
    }
}
