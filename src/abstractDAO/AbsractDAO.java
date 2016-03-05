package abstractDAO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vadim on 05.03.2016.
 */
public abstract class AbsractDAO <K, T extends Entity> {
    public abstract List<T>findAll() throws SQLException;
    public abstract T findEntityById(K Id);
    public abstract boolean delete(K Id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);

}

