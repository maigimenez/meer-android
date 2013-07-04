 package com.i3m.dicomform;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.i3m.dicomform.model.Injury;
import com.i3m.dicomform.model.InjuryGroup;

public class TreeNodeActivity extends Activity {

	private TreeExpandableListAdapter adapter = null;
	private ArrayList<InjuryGroup> injuries;
	private ExpandableListView leftBreast_elist;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tree_nodes);
		
		leftBreast_elist = (ExpandableListView) findViewById(R.id.leftBreast_list);
		injuries = SetInjuries();
		adapter = new TreeExpandableListAdapter(TreeNodeActivity.this,injuries);
		leftBreast_elist.setAdapter(adapter);
		
	}

	private ArrayList<InjuryGroup> SetInjuries() {
		ArrayList<InjuryGroup> groups = new ArrayList<InjuryGroup>();
		ArrayList<Injury> instances = new ArrayList<Injury>();
		
		InjuryGroup nodes = new InjuryGroup("Nodes", false);
		for (int i=0;i<4;i++){
			Injury in = new Injury("nodo"+ String.valueOf(i));
			instances.add(in);
		}
		nodes.setInjuries(instances);
		groups.add(nodes);
		
		nodes = new InjuryGroup("Masas", false);
		for (int i=0;i<4;i++){
			Injury in = new Injury("masa"+ String.valueOf(i));
			instances.add(in);
		}
		nodes.setInjuries(instances);
		groups.add(nodes);

		return groups;
	}


}
