package com.sundy.tabbar.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.sundy.tabbar.R;
import com.sundy.tablayout.VerticalTabLayout;
import com.sundy.tablayout.adapter.TabAdapter;
import com.sundy.tablayout.widget.QTabView;

import java.util.ArrayList;
import java.util.List;

public class TabFragmentActivity extends AppCompatActivity {
    private VerticalTabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_fragment_layout);
        tabLayout = findViewById(R.id.tablayout);
        List<Fragment> fragments = getFragments();
        tabLayout.setupWithFragment(getSupportFragmentManager(), R.id.fragment_container, fragments
                , new TabAdapter() {
                    @Override
                    public int getCount() {
                        return 10;
                    }

                    @Override
                    public QTabView.TabBadge getBadge(int position) {
                        return null;
                    }

                    @Override
                    public QTabView.TabIcon getIcon(int position) {
                        return null;
                    }

                    @Override
                    public QTabView.TabTitle getTitle(int position) {
                        return new QTabView.TabTitle.Builder().setContent(String.valueOf(position)).build();
                    }

                    @Override
                    public int getBackground(int position) {
                        return 0;
                    }
                });
        tabLayout.setTabSelected(6);
    }

    private List<Fragment> getFragments() {
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TabFragment fragment = new TabFragment();
            Bundle bundle = new Bundle();
            bundle.putString("index", String.valueOf(i));
            fragment.setArguments(bundle);
            fragments.add(fragment);
        }
        return fragments;
    }
}
