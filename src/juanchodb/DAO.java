/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juanchodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public abstract class DAO {

    protected String user_db = "root";
    protected String password_db = "280690";
    protected String location_db = "localhost";
    protected String port = "3306";
    protected String name_db = "test";
    
    protected Connection conn = null;

    protected void connnect() throws DBException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://" + location_db + ":" + port + "/" + name_db + "", user_db, password_db);
        } catch (SQLException ex) {
            throw new DBException(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            throw new DBException(ex.getMessage());
        }
    }

    protected void disconnect() throws DBException {
        try {
            conn.close();
            System.out.println("Database connection terminated");
        } catch (SQLException ex) {
            throw new DBException(ex.getMessage());
        }
    }

    protected Connection getConection() throws DBException{
        //si esta conectacto devuelvo conexion
        //y sino conn.
//        
//        if (!conn.isClosed()) {
//            return conn;
//        } else {
//            connnect();
//        }
//        return null;
        
        if(conn == null) connnect();
        return conn;
        
    }

    public abstract void insert(Object o) throws DBException;
    public abstract void delete(Object o) throws DBException;
    public abstract void update(Object o) throws DBException;
    public abstract List<Object> getAll() throws DBException;
}
