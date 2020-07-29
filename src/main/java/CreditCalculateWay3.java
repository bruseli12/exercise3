public class CreditCalculateWay3 extends CreditCalculateWays {
    @Override
    public int calculateCredit(ShoppingCart shoppingCart) {
        if (shoppingCart.gettotalamt() <= 1000)
            return shoppingCart.getPromotionGoodsAmt() * 2 + shoppingCart.getImpromotionGoodsAmt();
        if (shoppingCart.getPromotionGoodsAmt() <= 1000)
            return (int) (shoppingCart.getPromotionGoodsAmt() * 2 + 1000 - shoppingCart.getPromotionGoodsAmt() + Math.floor((shoppingCart.gettotalamt() - 1000)/20));
        else
            return (int) (1000*2+Math.floor(((shoppingCart.gettotalamt() - 1000)/20)));
    }
}
