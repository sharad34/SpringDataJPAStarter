package software.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sharad34
 */

@Entity
//@Entity used to denote plain old Java object (POJO) class that is mapped to the database and configured for usage through JPA using annotations and/or XML.

@Table(name = "INVENTORYLIST" , schema = "dbo")
public class InventoryList {

    private Integer id;
    private String itemCode ;
    private String itemDescription;
    private Integer quantity;
    private Double price ;
    private Double discount;
    private Double sellingPrice;
    private Double costPrice;
    private String vendorName;
    private String billNumber;

    public InventoryList() { }


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

@Basic
@Column(name = "item_code")
public String getItemCode() {
    return itemCode;
}

public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
}

@Basic
@Column(name = "item_description")
public String getItemDescription() {
    return itemDescription;
}

public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
}

@Basic
@Column(name = "quantity")
public Integer getQuantity() {
    return quantity;
}

public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}

@Basic
@Column(name = "price")
public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}

@Basic
@Column(name = "discount")
public Double getDiscount() {
    return discount;
}

public void setDiscount(Double discount) {
    this.discount = discount;
}

@Basic
@Column(name = "selling_price")
public Double getSellingPrice() {
    return sellingPrice;
}

public void setSellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
}

@Basic
@Column(name = "cost_price")
public Double getCostPrice() {
    return costPrice;
}

public void setCostPrice(Double costPrice) {
    this.costPrice = costPrice;
}

@Basic
@Column(name = "vendor_name")
public String getVendorName() {
    return vendorName;
}

public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
}
@Basic
@Column(name = "bill_number")
public String getBillNumber() {
    return billNumber;
}

public void setBillNumber(String billNumber) {
    this.billNumber = billNumber;
}
