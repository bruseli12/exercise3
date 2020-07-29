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

    @Test
    public void should_return_1890_when_use_way3_given_buy_800_promotion_tv_and_2000_impromotion_washer(){
        //given
        Supermarket supermarket=new Supermarket();
        supermarket.addGoods(new Goods("TV",800,GoodsType.PROMOTION));
        supermarket.addGoods(new Goods("WASHER",2000,GoodsType.IMPROMOTION));
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addGoods("TV",new HoldingGoods(1,supermarket.getGoods("TV")));
        shoppingCart.addGoods("WASHER",new HoldingGoods(1,supermarket.getGoods("WASHER")));
        User user=new User("Tom");
        supermarket.addUser(user);
        //when

        int credit=supermarket.calculate(shoppingCart, new CreditCalculateWay3());
        user.setCredit(credit);
        //then
        Assert.assertEquals(user.getCredit(), 1890);
    }
    @Test
    public void should_return_1090_when_use_way3_given_buy_800_impromotion_tv_and_2000_impromotion_washer(){
        //given
        Supermarket supermarket=new Supermarket();
        supermarket.addGoods(new Goods("TV",800,GoodsType.IMPROMOTION));
        supermarket.addGoods(new Goods("WASHER",2000,GoodsType.IMPROMOTION));
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addGoods("TV",new HoldingGoods(1,supermarket.getGoods("TV")));
        shoppingCart.addGoods("WASHER",new HoldingGoods(1,supermarket.getGoods("WASHER")));
        User user=new User("Tom");
        supermarket.addUser(user);
        //when

        int credit=supermarket.calculate(shoppingCart, new CreditCalculateWay3());
        user.setCredit(credit);
        //then
        Assert.assertEquals(user.getCredit(),1090 );
    }
    @Test
    public void should_return_2090_when_use_way3_given_buy_800_promotion_tv_and_2000_promotion_washer(){
        //given
        Supermarket supermarket=new Supermarket();
        supermarket.addGoods(new Goods("TV",800,GoodsType.PROMOTION));
        supermarket.addGoods(new Goods("WASHER",2000,GoodsType.PROMOTION));
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addGoods("TV",new HoldingGoods(1,supermarket.getGoods("TV")));
        shoppingCart.addGoods("WASHER",new HoldingGoods(1,supermarket.getGoods("WASHER")));
        User user=new User("Tom");
        supermarket.addUser(user);
        //when

        int credit=supermarket.calculate(shoppingCart, new CreditCalculateWay3());
        user.setCredit(credit);
        //then
        Assert.assertEquals(user.getCredit(),2090 );
    }
}

