package se.strativ.servicenode.mobile_check;

import se.strativ.servicenode.mobile_check.pojo.NodeDetailResponse;

/**
 * Created by dinislam on 6/6/17.
 * email : milon@strativ.se
 */

public interface ResponseInterface {
    public void onResponseSuccess(NodeDetailResponse nodeDetailResponse);

    public void onResponseFailed();
}
