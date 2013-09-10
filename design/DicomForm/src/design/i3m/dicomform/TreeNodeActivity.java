 package design.i3m.dicomform;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import design.i3m.dicomform.R;

import design.i3m.dicomform.model.Injury;
import design.i3m.dicomform.model.InjuryGroup;

public class TreeNodeActivity extends Activity {

	private TreeExpandableListAdapter left_adapter = null;
	private TreeExpandableListAdapter right_adapter = null;
	private ArrayList<InjuryGroup> left_injuries;
	private ArrayList<InjuryGroup> right_injuries;
	private ExpandableListView leftBreast_elist;
	private ExpandableListView rightBreast_elist;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tree_nodes);
		
		leftBreast_elist = (ExpandableListView) findViewById(R.id.leftBreast_list);
		rightBreast_elist = (ExpandableListView) findViewById(R.id.rightBreast_list);

		left_injuries = SetInjuries();
		right_injuries = SetInjuries2();
		
		left_adapter = new TreeExpandableListAdapter(TreeNodeActivity.this,left_injuries);
		leftBreast_elist.setAdapter(left_adapter);
		
		right_adapter = new TreeExpandableListAdapter(TreeNodeActivity.this,right_injuries);
		rightBreast_elist.setAdapter(right_adapter);
		
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
		
		nodes = new InjuryGroup("Mass", false);
		instances = new ArrayList<Injury>();
		for (int i=0;i<5;i++){
			Injury in = new Injury("mass"+ String.valueOf(i));
			instances.add(in);
		}
		nodes.setInjuries(instances);
		groups.add(nodes);

		return groups;
	}
	
	private ArrayList<InjuryGroup> SetInjuries2() {
		ArrayList<InjuryGroup> groups = new ArrayList<InjuryGroup>();
		ArrayList<Injury> instances = new ArrayList<Injury>();
		
		InjuryGroup nodes = new InjuryGroup("Calcification", false);
		for (int i=0;i<2;i++){
			Injury in = new Injury("calcification"+ String.valueOf(i));
			instances.add(in);
		}
		nodes.setInjuries(instances);
		groups.add(nodes);
		
		nodes = new InjuryGroup("Associated Findings", false);
		instances = new ArrayList<Injury>();
		for (int i=0;i<4;i++){
			Injury in = new Injury("af"+ String.valueOf(i));
			instances.add(in);
		}
		nodes.setInjuries(instances);
		groups.add(nodes);

		return groups;
	}


}
