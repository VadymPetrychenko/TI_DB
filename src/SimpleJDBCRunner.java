import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Vadim on 05.03.2016.
 */
public class SimpleJDBCRunner {
    public static void main(String[] args) throws SQLException {
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
//            if (list.size() > 0){
                System.out.println(list);
//            }else{
//                System.out.println("Not found");
//            }

        rs.close();
    }
}
