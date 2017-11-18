
package se.strativ.servicenode.mobile_check.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class OrderList implements Serializable{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("customer")
    @Expose
    private Customer customer;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("is_checkin_completed")
    @Expose
    private Boolean isCheckinCompleted;
    @SerializedName("is_checkout_completed")
    @Expose
    private Boolean isCheckoutCompleted;
    @SerializedName("location")
    @Expose
    private Location_ location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsCheckinCompleted() {
        return isCheckinCompleted;
    }

    public void setIsCheckinCompleted(Boolean isCheckinCompleted) {
        this.isCheckinCompleted = isCheckinCompleted;
    }

    public Boolean getIsCheckoutCompleted() {
        return isCheckoutCompleted;
    }

    public void setIsCheckoutCompleted(Boolean isCheckoutCompleted) {
        this.isCheckoutCompleted = isCheckoutCompleted;
    }

    public Location_ getLocation() {
        return location;
    }

    public void setLocation(Location_ location) {
        this.location = location;
    }

    @Override
    public String toString() {
        String[] orderTypeArray = {"", "New Delivery", "Empty and Replace", "Empty and Terminate"};
        return id + "-" + orderTypeArray[type];
    }
}
