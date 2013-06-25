/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author alpocr
 */
public class User {
    
    public int id;
    public String nid;
    public String name;
    public String lastname;
    public String username;
    public String password;
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public User() {
        setId(0);
        setNid("N/A");
        setName("N/A");
        setLastname("N/A");
        setUsername("N/A");
        setPassword("N/A");
    }
    
    public User(int id, String nid, String name, String lastname, String username, String password) {
        this.id = id;
        this.nid = nid;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getNid() {
        return nid;
    }
    
    public void setNid(String nid) {
        this.nid = nid;
    }
}