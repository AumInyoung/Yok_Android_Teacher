package bigcamp.yok.teacher.status;

import java.util.ArrayList;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import bigcamp.yok.teacher.StudentItem;

public class StatusAdapter extends ArrayAdapter<StudentItem> {

	Context mContext = null;  
	ArrayList<StudentItem> data = null; 
	LayoutInflater inflater = null; 
	Resources res = null; 
	
	
	public StatusAdapter(Context context, ArrayList<StudentItem> objects) {
		super(context,0,objects);
		// TODO Auto-generated constructor stub
		
		this.mContext = context; 
		this.data = objects; 
		this.inflater = LayoutInflater.from(context); 
		this.res = mContext.getResources(); 
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size(); 
	}
	
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return super.getView(position, convertView, parent);
	}

	
	
}
