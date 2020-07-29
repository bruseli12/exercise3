public class Goods {
    private String name;
    private int price;
    private GoodsType goodsType;

    public Goods(String name, int price, GoodsType goodsType) {
        this.name = name;
        this.price = price;
        this.goodsType = goodsType;
    }

    public String getName() {
        return this.name;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public GoodsType getGoodsType() {
        return this.goodsType;
    }

    public int getPrice() {
        return price;
    }
}
