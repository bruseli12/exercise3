public  class  CreditCalculateWay2 extends  CreditCalculateWays{

    @Override
    public int calculateCredit(ShoppingCart shoppingCart) {

        if(shoppingCart.getPromotionGoodsAmt()<=1000)
            return  shoppingCart.getPromotionGoodsAmt()*2+shoppingCart.getImpromotionGoodsAmt();
        return  shoppingCart.getPromotionGoodsAmt()-1000+1000*2+shoppingCart.getImpromotionGoodsAmt();
    }
}