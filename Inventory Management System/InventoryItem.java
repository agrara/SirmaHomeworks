public class InventoryItem extends AbstractItem {

    private int itemID;
    private int itemQuantity;

    public InventoryItem(int itemID, int itemQuantity) {
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
    }

    public int getItemID() {
        return this.itemID;
    }

    public void setitemID(int itemID) {
        this.itemID = itemID;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

}
