package com.i3m.meer;


import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.i3m.meer.model.LeftBreast_Children;
import com.i3m.meer.model.LeftBreast_Group;


public class Tree_radlex_rid10357_radlex_rid29897 extends Activity {

	private RID29897ListAdapter adapter = null;
	private ExpandableListView RID29897_elist;
	private ArrayList<LeftBreast_Group> children;    

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tree_radlex_rid10357_radlex_rid29897);
        children = SetChildren();
        
        RID29897_elist = (ExpandableListView) findViewById(R.id.list_RID29897);
        adapter = new RID29897ListAdapter(Tree_radlex_rid10357_radlex_rid29897.this, children);
        RID29897_elist.setAdapter(adapter);
        
    }

	private ArrayList<LeftBreast_Group> SetChildren() {
		ArrayList<LeftBreast_Group> children = new ArrayList<LeftBreast_Group>();
		String[] groups = getResources().getStringArray(R.array.list_RID29897);
		
		for (int i=0;i<groups.length;i++){
			LeftBreast_Group child = new LeftBreast_Group();
			child.setType(groups[i]);
			child.setChildren(new ArrayList<LeftBreast_Children>());
			children.add(child);
		}
		
		return children;
	}

}