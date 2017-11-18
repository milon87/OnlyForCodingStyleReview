package se.strativ.servicenode.mobile_check;

import se.strativ.servicenode.mobile_check.pojo.NodeDetailResponse;

/**
 * Created by dinislam on 6/14/17.
 * email : milon@strativ.se
 */

public interface ViewNodeCheck {
    public void showProgress();

    public void stopProgress();

    public void onLoadNodeDetail(NodeDetailResponse nodeDetailResponse);

    public void onLoadFailed();
}
