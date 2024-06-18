import java.time.LocalDate;

public interface Perishable {
    public boolean perishable = false;

    public boolean getPerishable();

    public LocalDate getExpiraionDAte();
}
