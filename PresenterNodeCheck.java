package se.strativ.servicenode.mobile_check;

import android.content.Context;

import se.strativ.servicenode.mobile_check.pojo.NodeDetailResponse;


/**
 * Created by dinislam on 6/14/17.
 * email : milon@strativ.se
 */

public class PresenterNodeCheck implements ResponseInterface {
    private ViewNodeCheck viewNodeCheck;
    private Context context;
    ModelNodeCheck modelNodeCheck;

    PresenterNodeCheck(ViewNodeCheck viewNodeCheck, Context context) {
        this.viewNodeCheck = viewNodeCheck;
        this.context = context;
    }

    public void loadNodeDetail(String nodeID) {
        viewNodeCheck.showProgress();
        modelNodeCheck = new ModelNodeCheck(this);
        modelNodeCheck.loadOrderFromServer(nodeID, context);
    }


    @Override
    public void onResponseSuccess(NodeDetailResponse nodeDetailResponse) {
        viewNodeCheck.stopProgress();
        viewNodeCheck.onLoadNodeDetail(nodeDetailResponse);
    }

    @Override
    public void onResponseFailed() {
        viewNodeCheck.stopProgress();
        //failed
        viewNodeCheck.onLoadFailed();
    }
}
