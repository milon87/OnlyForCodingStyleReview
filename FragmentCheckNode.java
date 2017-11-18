package se.strativ.servicenode.mobile_check;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import se.strativ.servicenode.R;
import se.strativ.servicenode.activity.ActivityCheckInOut;
import se.strativ.servicenode.fragment.HomeTabFragment;
import se.strativ.servicenode.mobile_check.pojo.NodeDetailResponse;
import se.strativ.servicenode.util.Constants;
import se.strativ.servicenode.util.MyToast;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCheckNode extends Fragment implements ViewNodeCheck {

    private ProgressBar progressBar;
    private PresenterNodeCheck presenterNodeCheck;
    private Button btnRetry;

    public FragmentCheckNode() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenterNodeCheck = new PresenterNodeCheck(this, getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_check_node, container, false);
        progressBar = (ProgressBar) rootView.findViewById(R.id.node_check_progress);
        btnRetry = (Button) rootView.findViewById(R.id.btn_check_retry);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenterNodeCheck.loadNodeDetail(Constants.nodeID);

        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.container, new HomeTabFragment()).commit();
            }
        });
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void stopProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onLoadNodeDetail(NodeDetailResponse nodeDetailResponse) {

        if (nodeDetailResponse.getCheckInOut() == null) {
            btnRetry.setVisibility(View.VISIBLE);
            MyToast.show(getContext(), getString(R.string.error_message_with_no_dialog), false, MyToast.ERROR);
            return;
        } else {
            Intent intent = new Intent(getActivity(), ActivityCheckInOut.class);
            intent.putExtra("response", nodeDetailResponse);
            startActivity(intent);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onLoadFailed() {
        //Show Error message
        btnRetry.setVisibility(View.VISIBLE);
        MyToast.show(getContext(), getString(R.string.error_message_with_no_dialog), false, MyToast.ERROR);
    }


}
