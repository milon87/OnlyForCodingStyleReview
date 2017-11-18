
package se.strativ.servicenode.mobile_check.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Asset implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("has_error")
    @Expose
    private Boolean hasError;
    @SerializedName("subtype")
    @Expose
    private String subtype;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("mfc")
    @Expose
    private String mfc;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("owner_logo")
    @Expose
    private String ownerLogo;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("is_eqp_task")
    @Expose
    private Boolean isEqpTask;
    @SerializedName("asset_id")
    @Expose
    private String assetId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("serial")
    @Expose
    private String serial;
    @SerializedName("mfc_date")
    @Expose
    private String mfcDate;
    @SerializedName("install_date")
    @Expose
    private String installDate;
    @SerializedName("warranty_from_date")
    @Expose
    private String warrantyFromDate;
    @SerializedName("warranty_to_date")
    @Expose
    private String warrantyToDate;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("service_interval_times")
    @Expose
    private String serviceIntervalTimes;
    @SerializedName("service_interval_units")
    @Expose
    private String serviceIntervalUnits;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("docs")
    @Expose
    private List<Object> docs = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMfc() {
        return mfc;
    }

    public void setMfc(String mfc) {
        this.mfc = mfc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOwnerLogo() {
        return ownerLogo;
    }

    public void setOwnerLogo(String ownerLogo) {
        this.ownerLogo = ownerLogo;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getIsEqpTask() {
        return isEqpTask;
    }

    public void setIsEqpTask(Boolean isEqpTask) {
        this.isEqpTask = isEqpTask;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMfcDate() {
        return mfcDate;
    }

    public void setMfcDate(String mfcDate) {
        this.mfcDate = mfcDate;
    }

    public String getInstallDate() {
        return installDate;
    }

    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }

    public String getWarrantyFromDate() {
        return warrantyFromDate;
    }

    public void setWarrantyFromDate(String warrantyFromDate) {
        this.warrantyFromDate = warrantyFromDate;
    }

    public String getWarrantyToDate() {
        return warrantyToDate;
    }

    public void setWarrantyToDate(String warrantyToDate) {
        this.warrantyToDate = warrantyToDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceIntervalTimes() {
        return serviceIntervalTimes;
    }

    public void setServiceIntervalTimes(String serviceIntervalTimes) {
        this.serviceIntervalTimes = serviceIntervalTimes;
    }

    public String getServiceIntervalUnits() {
        return serviceIntervalUnits;
    }

    public void setServiceIntervalUnits(String serviceIntervalUnits) {
        this.serviceIntervalUnits = serviceIntervalUnits;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Object> getDocs() {
        return docs;
    }

    public void setDocs(List<Object> docs) {
        this.docs = docs;
    }

}
