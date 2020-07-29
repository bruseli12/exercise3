public class CreditCalculateWay1 extends CreditCalculateWays{

    @Override
    public int calculateCredit(ShoppingCart shoppingCart) {
        if(shoppingCart.gettotalamt()<=1000)
            return shoppingCart.gettotalamt();
        return (int) (1000+Math.floor((shoppingCart.gettotalamt()-1000)/20));
    }
}
