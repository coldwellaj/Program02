package com.example.ajcoldwe.program02;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ItemListFragment extends ListFragment {

    static interface Listener {
        void itemClicked(long id);
    };

    private Listener listener;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Item.items.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Item.items[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1,
        names);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener)context;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        if (listener != null){
            listener.itemClicked(id);
        }
    }
}
