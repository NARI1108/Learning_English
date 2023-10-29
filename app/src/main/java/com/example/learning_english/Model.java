package com.example.learning_english;

public class Model {
    private int image;
    private String title_En, title_Fa;

    public Model(int image, String title_En, String title_Fa) {
        this.image = image;
        this.title_En = title_En;
        this.title_Fa = title_Fa;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle_En() {
        return title_En;
    }

    public void setTitle_En(String title_En) {
        this.title_En = title_En;
    }

    public String getTitle_Fa() {
        return title_Fa;
    }

    public void setTitle_Fa(String title_Fa) {
        this.title_Fa = title_Fa;
    }
}
