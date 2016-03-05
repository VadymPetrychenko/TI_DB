package abstractDAO;

/**
 * Created by Vadim on 05.03.2016.
 */
public class Abonent extends Entity {
    private int phone;
    private String lastName;

    public Abonent(int id, String lastName, int phone) {
        super(id);
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "phone=" + phone +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
