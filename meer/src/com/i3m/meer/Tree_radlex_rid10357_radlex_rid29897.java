package com.i3m.meer;


import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.app.Activity;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;


public class Tree_radlex_rid10357_radlex_rid29897 extends Activity {

    

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tree_radlex_rid10357_radlex_rid29897);
        
        ListView listview_RID29897 = (ListView) findViewById(R.id.list_RID29897);
        String[] items = getResources().getStringArray(R.array.list_RID29897);
        ArrayAdapter<String> adapter_RID29897 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listview_RID29897.setAdapter(adapter_RID29897);
        
        
    }

}