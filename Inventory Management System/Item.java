import java.util.HashMap;

public interface Item {

    public HashMap<String, String> getItemDetails();

    public double calculateItemValue();

    public String getItemDescription();

    public void setItemDescription(String description);

}
