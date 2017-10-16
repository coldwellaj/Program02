package com.example.ajcoldwe.program02;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ItemsList extends AppCompatActivity
implements ItemListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, ItemDetail.class);
        intent.putExtra(ItemDetail.EXTRA_ITEM_ID, (int)id);
        startActivity(intent);
    }
}
