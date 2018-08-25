//used for performing CRUD operations

package software.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import software.models.InventoryList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sharad34
 */
@Repository
public interface InventoryRepository extends CrudRepository<InventoryList, Long>  {

    //select all
    @Query("Select ob from InventoryList ob")
    public List<InventoryList> getAll();

    //select
    @Query("Select ob from InventoryList ob where ob.vendorName = ?1 and ob.billNumber =?2")
    public List<InventoryList> inventoryDetails(String vendorName,String billNumber);

    //update
    @Modifying
    @Transactional
    @Query("update InventoryList ob set ob.discount = ?1 ,ob.costPrice = ?2,ob.sellingPrice = ?3, ob.quantity = ?4,ob.itemDescription = ?5,ob.price = ?6 where ob.itemCode = ?7")
    public void updateDetails(Double discount,Double cost_price,Double selling_price,Integer quantity,String item_desc,Double price,String item_code);

    //delete
    @Modifying
    @Transactional
    @Query("delete from InventoryList ob where ob.itemCode = ?1")
    public void deleteItemDataFetch(String ItemCode);

}
