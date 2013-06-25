/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import juanchodb.DBException;
import juanchodb.DAO;

/**
 *
 * @author alpocr
 */
public class UserController extends DAO {

    private User user;
    private String INSERT = "INSERT INTO user (id, nid, name, lastname, username, password)"
            + "VALUES(?,?,?,?,?,?)";
    
    private String GETALL = "SELECT * FROM User";

    public UserController() {
    }

    @Override
    public void insert(Object o) throws DBException {
        if (o instanceof User) {
            user = ((User) o);
            PreparedStatement stmt = null;
            try {
                stmt = getConection().prepareStatement(INSERT);
                stmt.setInt(1, user.getId());
                stmt.setString(2, user.getNid());
                stmt.setString(3, user.getName());
                stmt.setString(4, user.getLastname());
                stmt.setString(5, user.getUsername());
                stmt.setString(6, user.getPassword());
                stmt.executeUpdate();
            } catch (DBException ex) {
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    stmt.close();
                    disconnect();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
        }
    }

    @Override
    public void delete(Object o) throws DBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Object o) throws DBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Object> getAll() throws DBException {
        try {
            getConection().prepareStatement(GETALL);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
