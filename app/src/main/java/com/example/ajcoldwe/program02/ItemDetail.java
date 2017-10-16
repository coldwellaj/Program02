package com.example.ajcoldwe.program02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItemDetail extends AppCompatActivity {

    public static final String EXTRA_ITEM_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        ItemDetailFragment frag = (ItemDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int itemId = (int) getIntent().getExtras().get(EXTRA_ITEM_ID);
        frag.setItem(itemId);
    }
}
