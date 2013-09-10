package com.i3m.meer;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.i3m.meer.model.RightBreast_Children;
import com.i3m.meer.model.RightBreast_Group;


public class RID29896ListAdapter extends BaseExpandableListAdapter {
	private Context context;	
	private ArrayList<RightBreast_Group> groups;
	
	public RID29896ListAdapter (Context context, ArrayList<RightBreast_Group> children){
		this.context = context;
		this.groups = children;
	}
	
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	public Object getChild(int groupPosition, int childPosition) {
		ArrayList<RightBreast_Children> children = groups.get(groupPosition).getChildren();
		return children.get(childPosition);
	}

	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
		View v = convertView;
		final RightBreast_Children child = (RightBreast_Children) getChild(groupPosition, childPosition);
		
		if (v == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.child, parent, false);
		}
		TextView tv = (TextView) v.findViewById(R.id.item_tv);
		tv.setText(child.getSnomed_ct_118522005());
		
		return v;
	}

	public int getChildrenCount(int groupPosition) {
		return groups.get(groupPosition).getChildren().size();
	}

	public Object getGroup(int groupPosition) {
		return groups.get(groupPosition);
	}

	public int getGroupCount() {
		return groups.size();
	}

	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		View v = convertView;
		final RightBreast_Group group = (RightBreast_Group) getGroup(groupPosition);
		
		if (v == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.group, parent, false);
		}

		TextView tv = (TextView) v.findViewById(R.id.group_tv);
		tv.setText(group.getType());
		
		ImageButton add_button = (ImageButton) v.findViewById(R.id.add_group_button);
		add_button.setFocusable(false);
		add_button.setOnClickListener(new ImageButton.OnClickListener() {
		    public void onClick(View v) {
		    	Intent i=null;
		    	Context context = v.getContext();
				if (groupPosition == 0){
					i = new Intent(context,Edit_radlex_rid29896_radlex_rid34261.class);
				}
				else if (groupPosition == 1){
					i = new Intent(context,Edit_radlex_rid29896_radlex_rid34265.class);
				}
				else if (groupPosition == 2){
					i = new Intent(context,Edit_radlex_rid29896_radlex_rid3874.class);
				}
				else if (groupPosition == 3){
					i = new Intent(context,Edit_radlex_rid29896_radlex_rid5196.class);
				}
				else{
					i = new Intent(context,Edit_radlex_rid29896_trencadis_mamo_trmm0011.class);
				}
				context.startActivity(i);
		    }
		});		
		return v;
	}

	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

}