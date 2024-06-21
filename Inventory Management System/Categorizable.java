import java.util.ArrayList;

public interface Categorizable {

    public void addCategory(String category);

    public ArrayList<String> getItemCategories();

    public void setCategorizable(boolean categorizable);

    public boolean getCategorizable();

}
