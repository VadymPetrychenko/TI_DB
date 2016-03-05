package abstractDAO;

/**
 * Created by Vadim on 05.03.2016.
 */
public abstract class Entity {
    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
