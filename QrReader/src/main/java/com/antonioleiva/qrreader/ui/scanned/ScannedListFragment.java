package com.antonioleiva.qrreader.ui.scanned;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.antonioleiva.qrreader.R;
import com.antonioleiva.qrreader.ui.base.BaseFragment;

public class ScannedListFragment extends BaseFragment {

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_scanned_list, container, false);
    }
}
