package com.javaoo.Flowers;

public class Flower extends BouquetItem{

//    @Override
//    public int compareTo(Flower other) {
//        if(this.getLeng().compareTo(other.getLeng())>0)
//            return 1;
//        else if (this.getLeng() == other.getLeng())
//            return 0 ;
//        return -1 ;
//    }
    private Integer freshness;
    private Integer leng;
    private String flowerName;

    public Flower(Integer freshness, Integer leng, String flowerName, Double price) {
        super(price);
        this.freshness = freshness;
        this.leng = leng;
        this.flowerName = flowerName;
    }

    public Integer getFreshness() {
        return freshness;
    }

    public void setFreshness() {
        this.freshness = freshness;
    }

    public Integer getLeng() {
        return leng;
    }

    public void setLeng(Integer leng) {
        this.leng = leng;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flower{");
        sb.append("freshness=").append(freshness);
        sb.append(", leng=").append(leng);
        sb.append(", flowerName='").append(flowerName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
