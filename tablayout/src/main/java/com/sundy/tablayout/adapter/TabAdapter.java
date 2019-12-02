package com.sundy.tablayout.adapter;


import com.sundy.tablayout.widget.TabView;

public interface TabAdapter {
    int getCount();

    TabView.TabBadge getBadge(int position);

    TabView.TabIcon getIcon(int position);

    TabView.TabTitle getTitle(int position);

    int getBackground(int position);
}
