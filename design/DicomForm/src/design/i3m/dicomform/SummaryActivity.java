package design.i3m.dicomform;

import design.i3m.dicomform.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class SummaryActivity extends Activity {

	//private static String[] items = {"Desestructuración","Nódulo/Masa","Asimetría","Hallazgos asociados","Desestructuración","Nódulo/Masa","Asimetría","Hallazgos asociados"};
	private static String[] empty = {};
	private static String[] organs  = {"Left breast", "Right breast"}; 
	Button addInjuries_button;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Setting the layout
		setContentView(R.layout.summary);

		//Managing the button than adds new injuries
		addInjuries_button = (Button) findViewById(R.id.addInjuries_button);
		addInjuries_button.setOnClickListener(addInjuries_handler);

		//Managing the injuries summary inside a listview.
		//We created an arrayAdapter and we handle when user clicks on a item 
		//because he/she wants to edit/delete this information
		ListView injuries_listView = (ListView) findViewById(R.id.injuries_list);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, empty);
		injuries_listView.setAdapter(adapter);
		injuries_listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(getApplicationContext(), 
						"Click ListItem Number " + position, Toast.LENGTH_LONG).show();
			}
		});

	}



	View.OnClickListener addInjuries_handler = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent i = new Intent(SummaryActivity.this, TreeNodeActivity.class);
			startActivity(i);

		}
	};

}
