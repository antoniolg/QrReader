package com.antonioleiva.qrreader.ui;

import android.os.Bundle;
import com.antonioleiva.qrreader.R;
import com.antonioleiva.qrreader.ui.base.BaseActivity;
import com.antonioleiva.qrreader.ui.scanned.ScannedListFragment;

public class MainActivity extends BaseActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, new ScannedListFragment())
                    .commit();
        }
    }
}
