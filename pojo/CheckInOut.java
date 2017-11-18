
package se.strativ.servicenode.mobile_check.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CheckInOut implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("checkin_by")
    @Expose
    private String checkinBy;
    @SerializedName("checkin_company")
    @Expose
    private String checkinCompany;
    @SerializedName("checkout_by")
    @Expose
    private String checkoutBy;
    @SerializedName("checkout_company")
    @Expose
    private String checkoutCompany;
    @SerializedName("checkin_time")
    @Expose
    private String checkinTime;
    @SerializedName("checkout_time")
    @Expose
    private String checkoutTime;
    @SerializedName("status")
    @Expose
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckinBy() {
        return checkinBy;
    }

    public void setCheckinBy(String checkinBy) {
        this.checkinBy = checkinBy;
    }

    public String getCheckinCompany() {
        return checkinCompany;
    }

    public void setCheckinCompany(String checkinCompany) {
        this.checkinCompany = checkinCompany;
    }

    public String getCheckoutBy() {
        return checkoutBy;
    }

    public void setCheckoutBy(String checkoutBy) {
        this.checkoutBy = checkoutBy;
    }

    public String getCheckoutCompany() {
        return checkoutCompany;
    }

    public void setCheckoutCompany(String checkoutCompany) {
        this.checkoutCompany = checkoutCompany;
    }

    public String getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
