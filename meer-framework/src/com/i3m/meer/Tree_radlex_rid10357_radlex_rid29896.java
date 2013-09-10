package com.i3m.meer;


import java.util.ArrayList;

import com.i3m.meer.model.Radlex_rid29896_radlex_rid3874;
import com.i3m.meer.model.RightBreast_Children;
import com.i3m.meer.model.RightBreast_Group;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.app.Activity;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;


public class Tree_radlex_rid10357_radlex_rid29896 extends Activity {

	private RID29896ListAdapter adapter = null;
	private ExpandableListView RID29896_elist;
	private ArrayList<RightBreast_Group> children;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tree_radlex_rid10357_radlex_rid29896);
        children = SetChildren();
        RID29896_elist = (ExpandableListView) findViewById(R.id.list_RID29896);
        adapter = new RID29896ListAdapter(Tree_radlex_rid10357_radlex_rid29896.this, children);
        RID29896_elist.setAdapter(adapter);
        
        
    }

	private ArrayList<RightBreast_Group> SetChildren() {
		ArrayList<RightBreast_Group> children = new ArrayList<RightBreast_Group>();
		String[] groups = getResources().getStringArray(R.array.list_RID29896);
		
		for (int i=0;i<groups.length;i++){
			RightBreast_Group child = new RightBreast_Group();
			child.setType(groups[i]);
			child.setChildren(new ArrayList<RightBreast_Children>());
			children.add(child);
		}
		
		return children;
	}

}