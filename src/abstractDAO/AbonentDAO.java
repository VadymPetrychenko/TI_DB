package abstractDAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vadim on 05.03.2016.
 */
public class AbonentDAO extends AbsractDAO<Integer, Abonent> {
    @Override
    public List<Abonent> findAll() throws SQLException {
        Connection cn = ConnectorDB.getConnection();

        Statement st = cn.createStatement();

        ResultSet rs = st.executeQuery("select * from its_database.phonedb");

        ArrayList<Abonent> list = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int phone = rs.getInt(3);
            list.add(new Abonent(id, name, phone));
        }
        return list;
    }

    @Override
    public Abonent findEntityById(Integer Id) {
        return null;
    }

    @Override
    public boolean delete(Integer Id) {
        return false;
    }

    @Override
    public boolean delete(Abonent entity) {
        return false;
    }

    @Override
    public boolean create(Abonent entity) {
        return false;
    }

    @Override
    public Abonent update(Abonent entity) {
        return null;
    }
}
