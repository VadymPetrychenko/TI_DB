package abstractDAO;

import java.sql.SQLException;

/**
 * Created by Vadim on 05.03.2016.
 */
public class MainDAO {
    public static void main(String[] args) throws SQLException {
        AbonentDAO abonentDAO = new AbonentDAO();
        System.out.println(abonentDAO.findAll());
    }

}
