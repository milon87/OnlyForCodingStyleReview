
package se.strativ.servicenode.mobile_check.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class NodeDetailResponse implements Serializable {

    @SerializedName("assets")
    @Expose
    private List<Asset> assets = null;
    @SerializedName("check_in_out")
    @Expose
    private CheckInOut checkInOut;
    @SerializedName("storage")
    @Expose
    private List<Storage> storage = null;
    @SerializedName("order_list")
    @Expose
    private List<OrderList> orderList = null;
    @SerializedName("node_type")
    @Expose
    private Integer nodeType;
    @SerializedName("order")
    @Expose
    private OrderList order;

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public CheckInOut getCheckInOut() {
        return checkInOut;
    }

    public void setCheckInOut(CheckInOut checkInOut) {
        this.checkInOut = checkInOut;
    }

    public List<Storage> getStorage() {
        return storage;
    }

    public void setStorage(List<Storage> storage) {
        this.storage = storage;
    }

    public List<OrderList> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderList> orderList) {
        this.orderList = orderList;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public OrderList getOrder() {
        return order;
    }

    public void setOrder(OrderList order) {
        this.order = order;
    }

}
