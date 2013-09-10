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


public class Edit_radlex_rid29896_radlex_rid5196 extends Activity {

    
        private Spinner spinner_RID5958;
        private Spinner spinner_RID28825;
        private Spinner spinner_RID5972;
        private Spinner spinner_TRMM0021;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_radlex_rid29896_radlex_rid5196);
        
		ArrayAdapter<CharSequence> adapter_TRMM0021 = ArrayAdapter.createFromResource(
				this, R.array.list_TRMM0021, android.R.layout.simple_spinner_item);
		spinner_TRMM0021= (Spinner) findViewById(R.id.spinner_TRMM0021);
		adapter_TRMM0021.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner_RID5958.setAdapter(adapter_TRMM0021);

		ArrayAdapter<CharSequence> adapter_RID28825 = ArrayAdapter.createFromResource(
				this, R.array.list_RID28825, android.R.layout.simple_spinner_item);
		spinner_RID28825 = (Spinner) findViewById(R.id.spinner_RID28825);
		adapter_RID28825.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner_RID28825.setAdapter(adapter_RID28825);

		ArrayAdapter<CharSequence> adapter_RID5972 = ArrayAdapter.createFromResource(
				this, R.array.list_RID5972, android.R.layout.simple_spinner_item);
		spinner_RID5972 = (Spinner) findViewById(R.id.spinner_RID5972);
		adapter_RID5972.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner_RID5972.setAdapter(adapter_RID28825);
		
		ArrayAdapter<CharSequence> adapter_RID5958 = ArrayAdapter.createFromResource(
				this, R.array.list_RID5972, android.R.layout.simple_spinner_item);
		spinner_RID5958 = (Spinner) findViewById(R.id.spinner_RID5958);
		adapter_RID5958.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner_RID5958.setAdapter(adapter_RID5958);
        
    }

}