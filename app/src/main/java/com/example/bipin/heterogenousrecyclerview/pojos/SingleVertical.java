package com.example.bipin.heterogenousrecyclerview.pojos;

/**
 * Created by dellxps on 3/28/2017.
 */

public class SingleVertical {

    private String header, subHeader;
    private int image;

    public SingleVertical( ) {

    }

    public SingleVertical(String header, String subHeader, int image) {
        this.header = header;
        this.subHeader = subHeader;
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSubHeader() {
        return subHeader;
    }

    public void setSubHeader(String subHeader) {
        this.subHeader = subHeader;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
