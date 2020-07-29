import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class Requirement2Test {
    @Test
    public  void should_return_100_given_buy_10_promotion_apple_and_30_promotion_watermelon_and_20_impromotion_laundry(){
        //given
        Supermarket supermarket=new Supermarket();
        supermarket.addGoods(new Goods("APPLE",10,GoodsType.IMPROMOTION));
        supermarket.addGoods(new Goods("WATERMELON",30,GoodsType.IMPROMOTION));
        supermarket.addGoods(new Goods("LAUNDRY",20,GoodsType.IMPROMOTION));
        supermarket.updateGoodsTypetoProtion("APPLE");
        supermarket.updateGoodsTypetoProtion("WATERMELON");
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addGoods("APPLE",1);
        shoppingCart.addGoods("WATERMELON",1);
        shoppingCart.addGoods("LAUNDRY",1);
        User user=new User("Tom");
        supermarket.addUser(user);
        //when

        int credit=supermarket.calculate(shoppingCart);
        user.setCredit(credit);
        //then
        Assert.assertEquals(user.getCredit(), 100);

    }
    @Test
    public  void should_return__60_given_buy_10_impromotion_apple_and_30_impromotion_watermelon_and_20_impromotion_laundry(){
        //given
        Supermarket supermarket=new Supermarket();
        supermarket.addGoods(new Goods("APPLE",10,GoodsType.PROMOTION));
        supermarket.addGoods(new Goods("WATERMELON",30,GoodsType.PROMOTION));
        supermarket.addGoods(new Goods("LAUNDRY",20,GoodsType.IMPROMOTION));
        supermarket.updateGoodsTypetoImprotion("APPLE");
        supermarket.updateGoodsTypetoImprotion("WATERMELON");

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addGoods("APPLE",1);
        shoppingCart.addGoods("WATERMELON",1);
        shoppingCart.addGoods("LAUNDRY",1);
        User user=new User("Tom");
        supermarket.addUser(user);
        //when

        int credit=supermarket.calculate(shoppingCart);
        user.setCredit(credit);
        //then
        Assert.assertEquals(user.getCredit(), 60);

    }
}
