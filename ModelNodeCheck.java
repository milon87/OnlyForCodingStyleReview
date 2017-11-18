package se.strativ.servicenode.mobile_check;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import se.strativ.servicenode.connectivity.CustomRequest;
import se.strativ.servicenode.connectivity.VolleyHandler;
import se.strativ.servicenode.mobile_check.pojo.NodeDetailResponse;
import se.strativ.servicenode.mobile_sn.util.Util;
import se.strativ.servicenode.model_layer.GetTokenWithRefreshToken;
import se.strativ.servicenode.util.Constants;
import se.strativ.servicenode.util.SessionManager;


/**
 * Created by dinislam on 6/6/17.
 * email : milon@strativ.se
 */

public class ModelNodeCheck implements
        Response.Listener<JSONObject>,
        Response.ErrorListener,
        se.strativ.servicenode.interfaces.ResponseInterface {

    private ResponseInterface responseInterface;
    private RequestQueue queue;
    private Context context;
    private String nodeID;


    public ModelNodeCheck(ResponseInterface responseInterface) {
        this.responseInterface = responseInterface;
        queue = VolleyHandler.getRequestQueue();
    }

    public void loadOrderFromServer(String nodeID, Context context) {

        this.nodeID = nodeID;
        this.context = context;
        SessionManager sessionManager = new SessionManager(context);
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + sessionManager.getUserToken());

        Map<String, String> params = new HashMap<>();

        CustomRequest customRequest = new CustomRequest(Request.Method.GET, Util.getNodeDetailUrl(nodeID),
                params, headers, this, this);

        queue.add(customRequest);
    }


    @Override
    public void onErrorResponse(VolleyError volleyError) {

        if (volleyError instanceof AuthFailureError) {
            GetTokenWithRefreshToken getTokenWithRefreshToken =
                    new GetTokenWithRefreshToken(this, context);
        } else {
            responseInterface.onResponseFailed();
        }
    }

    @Override
    public void onResponse(JSONObject jsonObject) {
        Gson gson = new Gson();
        responseInterface.onResponseSuccess(gson.fromJson(jsonObject.toString(), NodeDetailResponse.class));
    }

    @Override
    public void onSuccessResponse(JSONObject jsonObject) {
        loadOrderFromServer(nodeID, context);

    }

    @Override
    public void onFailureResponse(VolleyError volleyError) {
        Constants.logOut(context);
    }
}
