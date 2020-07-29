import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Requirement3Test {

    @Test
    public void should_return_1067_when_use_way1_given_buy_2350_frige(){
        //given
        Supermarket supermarket=new Supermarket();
        supermarket.addGoods(new Goods("FRIGE",2350,GoodsType.IMPROMOTION));
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addGoods("FRIGE",new HoldingGoods(1,supermarket.getGoods("FRIGE")));
        User user=new User("Tom");
        supermarket.addUser(user);
        //when

        int credit=supermarket.calculate(shoppingCart, new CreditCalculateWay1());
        user.setCredit(credit);
        //then
        Assert.assertEquals(user.getCredit(), 1067);
    }

    @Test
    public void should_return_3000_when_use_way2_given_buy_2000_promotion_tv(){
        //given
        Supermarket supermarket=new Supermarket();
        supermarket.addGoods(new Goods("TV",2000,GoodsType.IMPROMOTION));
        supermarket.updateGoodsTypetoProtion("TV");
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addGoods("TV",new HoldingGoods(1,supermarket.getGoods("TV")));
        User user=new User("Tom");
        supermarket.addUser(user);
        //when

        int credit=supermarket.calculate(shoppingCart, new CreditCalculateWay2());
        user.setCredit(credit);
        //then
        Assert.assertEquals(user.getCredit(), 3000);
    }
}

