package com.example;

public class playerlist {
    String judulLagu;
    String namaPenyanyi;

    public playerlist(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

//    public String getNamaPenyanyi() {
//        return namaPenyanyi;
//    }

    @Override
    public String toString() {
        return "playerlist{" +
                "judulLagu='" + judulLagu + '\'' +
                ", namaPenyanyi='" + namaPenyanyi + '\'' +
                '}';
    }
}

