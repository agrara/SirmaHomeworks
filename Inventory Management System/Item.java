import java.util.ArrayList;
import java.util.HashMap;

public interface Item {

    ArrayList<String> itemCategories = new ArrayList<String>();

    public HashMap<String, String> getItemDetails();

    public double calculateItemValue();

    public String displayItemDescription();

}
