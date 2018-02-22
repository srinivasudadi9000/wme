package m.srinivas.wme;

/**
 * Created by srinivas on 21/02/18.
 */

public class Items {
    String item_name;
    int item_image;
    Items(String item_name,int item_image){
        this.item_image = item_image;
        this.item_name = item_name;
    }

    public int getItem_image() {
        return item_image;
    }

    public String getItem_name() {
        return item_name;
    }
}
