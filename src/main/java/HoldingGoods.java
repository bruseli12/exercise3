public class HoldingGoods {
    private int quanlity;
    private Goods goods;
    public HoldingGoods(int quanlity, Goods goods) {
        this.quanlity=quanlity;
        this.goods=goods;
    }
    public void setQuanlity(int quanlity){
        this.quanlity+=quanlity;
    }

    public int getQuanlity(){
        return  this.quanlity;
    }
    public  int gettotalamt(){
        return  quanlity*goods.getPrice();
    }
    public GoodsType getGoodsType(){
        return  goods.getGoodsType();
    }

}
