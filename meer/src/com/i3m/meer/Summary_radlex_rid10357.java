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


public class Summary_radlex_rid10357 extends Activity {

    

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_radlex_rid10357);
        
        ListView listview_RID10357 = (ListView) findViewById(R.id.list_RID10357);
        String[] items = getResources().getStringArray(R.array.list_RID10357);
        ArrayAdapter<String> adapter_RID10357 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listview_RID10357.setAdapter(adapter_RID10357);

        listview_RID10357.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> adapterview, View view, int position, long id) {
				Toast.makeText(getApplicationContext(), 
						"Click ListItem Number " + position, Toast.LENGTH_LONG).show();
				Intent i = new Intent(getBaseContext(),Edit_radlex_rid29896_radlex_rid34261.class);
				startActivity(i);			
			}
		});
        
        
    }

}