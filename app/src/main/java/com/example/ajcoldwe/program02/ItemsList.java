package com.example.ajcoldwe.program02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItemsList extends AppCompatActivity
implements ItemListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);
    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, ItemDetail.class);
        intent.putExtra(ItemDetail.EXTRA_ITEM_ID, (int)id);
        startActivity(intent);
    }
}
