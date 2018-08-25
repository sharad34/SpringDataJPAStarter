
package interfaces;

import java.util.List;
import javax.swing.*;


/**
 *
 * @author sharad34
 */
public interface GenericInterface<T> {

    public void save(T entity);

    public List<T> getAll();

    public void populateTable(JTable table[]);
