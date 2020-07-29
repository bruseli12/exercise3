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
}
