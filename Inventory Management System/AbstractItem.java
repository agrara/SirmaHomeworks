import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {

    ArrayList<String> itemCategories = new ArrayList<String>();
    HashMap<String, String> itemDetails = new HashMap<String, String>();
    String itemDescription;
    public double itemPrice = 0;
    public boolean perishable = false;
    public boolean breakable = true;
    ArrayList<String> categories = new ArrayList<String>();
    public boolean categorizable;
    String expirationDate;

    // Item interface
    @Override
    public HashMap<String, String> getItemDetails() {
        return this.itemDetails;
    }

    @Override
    public double calculateItemValue() {
        return this.itemPrice;
    }

    @Override
    public String getItemDescription() {
        return this.itemDescription;
    }

    @Override
    public void setItemDescription(String description) {
        this.itemDescription = description;
    }

    // Sellable interface
    @Override
    public double getItemPrice() {
        return this.itemPrice;
    }

    @Override
    public void setItemPice(double price) {
        this.itemPrice = price;
    }

    // Perishable interface
    @Override
    public boolean getPerishable() {
        return this.perishable;
    }

    @Override
    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public String getExpiraionDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Breakable inteface
    @Override
    public boolean getBreakable() {
        return this.breakable;
    }

    @Override
    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    // Categorizable interface
    @Override
    public void setCategorizable(boolean categorizable) {
        this.categorizable = categorizable;
    }

    public boolean getCategorizable() {
        return this.categorizable;
    }

    @Override
    public ArrayList<String> getItemCategories() {
        return this.itemCategories;
    }

    public void addCategory(String category) {
        if (this.categorizable) {
            this.categories.add(category);
            Collections.sort(this.categories);
        }
    }

}
