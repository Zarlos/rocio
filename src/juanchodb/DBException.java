/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juanchodb;

/**
 *
 * @author alpocr
 */
public class DBException extends Exception {

    /**
     * Creates a new instance of
     * <code>DBException</code> without detail message.
     */
    public DBException() {
    }

    /**
     * Constructs an instance of
     * <code>DBException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public DBException(String msg) {
        super(msg);
    }
}
