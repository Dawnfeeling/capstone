package com.example.mainmap;

public class listviewitem {
    private String iconDrawable ;
    private String titleStr ;
    private int Dosu;
    private String region;
    private String type;
    private float rating;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getRegion() {return region;}

    public void setRegion(String region) {this.region = region;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    private int ML ;

    public int getML() {
        return ML;
    }

    public void setML(int ML) {
        this.ML = ML;
    }

    public listviewitem(){};

    public void setIcon(String icon) {
        iconDrawable = icon ;
    }

    public void setTitle(String title) {
        titleStr = title ;
    }

    public void setDosu(int dosu) {Dosu=dosu;}

    public String getIcon() {
        return this.iconDrawable ;
    }

    public String getTitle() {
        return this.titleStr ;
    }

    public int getDosu() {return this.Dosu;}
}