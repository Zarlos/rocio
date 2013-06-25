/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juanchodb;

import user.User;
import user.UserController;

/**
 *
 * @author alpocr
 */
public class JuanchoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DBException {
        // TODO code application logic here
        
        DAO myDAO = new UserController();// DAOUsuario();
        
        User user = new User(1, "2008010925", "Allan", "Porras", "alpocr", "password");
        
        myDAO.insert(user);
    }
}
