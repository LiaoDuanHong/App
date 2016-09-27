package sql.androidy.admin.sqlactivity;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 2016/8/11.
 */
public class MyAdapter extends BaseAdapter{
    private List<Object>data;
    private Context context;
    public MyAdapter(Context context,List<Object>data){
        this.context=context;
        this.data=data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder=null;
        if(view==null){
            LayoutInflater layoutInflater=((Activity)context).getLayoutInflater();
            view=layoutInflater.inflate(R.layout.activity_user_item,null);
            viewHolder=new ViewHolder();
            viewHolder.textView1=(TextView)view.findViewById(R.id.userName);
            viewHolder.textView2=(TextView)view.findViewById(R.id.userPwd);
            view.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)view.getTag();
        }
        //设置数据
        return view;
    }
    class ViewHolder{
        TextView textView1,textView2;
    }
}
