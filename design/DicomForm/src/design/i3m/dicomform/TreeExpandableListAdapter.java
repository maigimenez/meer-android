package design.i3m.dicomform;

import java.util.ArrayList;

import design.i3m.dicomform.R;

import design.i3m.dicomform.model.Injury;
import design.i3m.dicomform.model.InjuryGroup;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TreeExpandableListAdapter extends BaseExpandableListAdapter {

	private Context context;	
	private ArrayList<InjuryGroup> groups;
	
	public TreeExpandableListAdapter (Context context, ArrayList<InjuryGroup> groups){
		this.context = context;
		this.groups = groups;
	}

	/* public void addItem (Injury new_injury, InjuryGroup new_group){
		//If the injury type is not already in the list, we add it 
		if(!groups.contains(new_group)){
			groups.add(new_group);
		}
		//Retrieve injuries given the injury type. Add the new injury and update 
		int index = groups.indexOf(new_group);
		ArrayList<Injury> injuries = groups.get(index).getInjuries();
		injuries.add(new_injury);
		groups.get(index).setInjuries(injuries);
		
	}
	*/
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		ArrayList<Injury> injuries = groups.get(groupPosition).getInjuries();
		return injuries.get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View view, ViewGroup parent) {
		
		final Injury injury = (Injury) getChild(groupPosition, childPosition);
		if(view == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.injury_child,null);
		}
		TextView tv = (TextView) view.findViewById(R.id.injury_node_textview);
		tv.setText(injury.getId());
		
		ImageButton edit_node_button = (ImageButton) view.findViewById(R.id.edit_node); 
		edit_node_button.setFocusable(false);   
		edit_node_button.setOnClickListener(new ImageButton.OnClickListener() {
		    public void onClick(View v) {
		    	Toast.makeText(context, 
						"Edit node type: " + injury.getId() , Toast.LENGTH_LONG).show();
		    }
		});
		
		ImageButton delete_node_button = (ImageButton) view.findViewById(R.id.delete_node); 
		delete_node_button.setFocusable(false);   
		delete_node_button.setOnClickListener(new ImageButton.OnClickListener() {
		    public void onClick(View v) {
		    	Toast.makeText(context, 
						"Delete node type: " + injury.getId() , Toast.LENGTH_LONG).show();
		    }
		});
	
		return view;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return groups.get(groupPosition).getInjuries().size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return groups.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return groups.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(final int groupPosition, boolean isExpanded,
			View view, ViewGroup parent) {
		InjuryGroup group = (InjuryGroup) getGroup(groupPosition);
		if(view == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.injuries_group, null);
		}
		TextView tv = (TextView) view.findViewById(R.id.injury_type);
		tv.setText(group.getType());
		ImageButton add_node_button = (ImageButton) view.findViewById(R.id.add_node_button); 
		add_node_button.setFocusable(false);   
		add_node_button.setOnClickListener(new ImageButton.OnClickListener() {
		    public void onClick(View v) {
		    	Toast.makeText(context, 
						"Add node type: " +Integer.toString(groupPosition), Toast.LENGTH_LONG).show();
		    	context.startActivity(new Intent(context,DetailNodeActivity.class));

		    }
		});
		return view; 
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}
	
}