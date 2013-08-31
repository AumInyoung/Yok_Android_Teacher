package bigcamp.yok.teacher;

import java.util.ArrayList;
import java.util.Calendar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CalendarAdapter extends ArrayAdapter<Integer> {

	Context context = null;
	ArrayList<Integer> data = null; 
	Calendar calendar = null;
	LayoutInflater inflater = null; 
	int firstDayOfMonth = 0; 

	public CalendarAdapter(Context context, ArrayList<Integer> objects) {
		super(context, 0, objects);
		// TODO Auto-generated constructor stub

		this.context = context; 
		this.data = objects; 
		this.inflater = LayoutInflater.from(context); 
		calendar = Calendar.getInstance(); 
		calendar.set(Calendar.DATE, 1); 
		firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK); 
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return calendar.getMaximum(Calendar.DAY_OF_MONTH)+firstDayOfMonth-1;
	}



	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub


		View v = convertView;
		int pos = position+1;
		if(v == null || v.getId() == -1){
			v = inflater.inflate(R.layout.item_calendar, null);
			v.setTag(R.id.calendar_background, v.findViewById(R.id.calendar_background));
			v.setTag(R.id.calendar_date, v.findViewById(R.id.calendar_date));
			v.setTag(R.id.calendar_slang, v.findViewById(R.id.calendar_slang));

		}
		TextView day = (TextView)v.getTag(R.id.calendar_date);
		TextView slang = (TextView)v.getTag(R.id.calendar_slang);

		if(pos < firstDayOfMonth){

		} else {
			calendar.set(Calendar.YEAR,calendar.get(calendar.YEAR));
			calendar.set(Calendar.MONTH,calendar.get(calendar.MONTH));
			
			calendar.set(calendar.DATE, pos-firstDayOfMonth+1);
			int now = calendar.get(Calendar.DAY_OF_WEEK); 
			
			//RelativeLayout bg = (RelativeLayout)v.getTag(R.id.calendar_background); 
			day.setText((pos-firstDayOfMonth+1)+""); 
			if(now == 1){
				day.setTextColor(Color.RED);
			}else if(now == 7){
				day.setTextColor(Color.BLUE);
			}
			
			slang.setText(1+"");

		}


		return v;

	}



}
