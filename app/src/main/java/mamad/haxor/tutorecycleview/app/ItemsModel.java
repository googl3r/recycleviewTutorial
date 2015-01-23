package mamad.haxor.tutorecycleview.app;

import java.io.Serializable;

/**
 * Created by mamadhaxor on 22/01/15.
 */
public class ItemsModel implements Serializable
{
    private String firstText;
    private String secondText;
    private int image;

    public ItemsModel(int image, String firstText, String secondText)
    {
        this.image = image;
        this.firstText = firstText;
        this.secondText = secondText;
    }

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
