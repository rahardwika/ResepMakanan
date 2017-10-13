package com.rahardwika.resepmasakan;

/**
 * Created by rahardwika on 5 Okt 2017.
 */

public class resepMasakan {
    private String namaMasakan, desc, caraMasak;
    private int img;

    public resepMasakan(String namaMasakan, String desc, String caraMasak, int img){
        this.namaMasakan = namaMasakan;
        this.desc = desc;
        this.caraMasak = caraMasak;
        this.img = img;
    }

    public String getNamaMasakan(){
        return namaMasakan;
    }
    public String getDesc(){
        return desc;
    }
    public String getCaraMasak(){
        return caraMasak;
    }
    public int getImg(){
        return img;
    }
    public void setNamaMasakan(String namaMasakan)
    {
        this.namaMasakan = namaMasakan;
    }
    public void setDesc (String desc){

        this.desc = desc;
    }
    public void setImg (int img){

        this.img = img;
    }
    public void setCaraMasak (String caraMasak){

        this.caraMasak = caraMasak;
    }
}
