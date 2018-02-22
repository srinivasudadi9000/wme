package m.srinivas.wme;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by srinivas on 21/02/18.
 */

public class Custom_Adapter  extends RecyclerView.Adapter<Custom_Adapter.Holder>{
   Context context;
    ArrayList<Items> items;
    CustomListview customListview;
    int rowlayout;
    public Custom_Adapter(ArrayList<Items> items, int mycutom, CustomListview customListview) {
        this.context = customListview;
        this.rowlayout = mycutom;
        this.items = items;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowlayout, parent, false);
        return new Custom_Adapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
         holder.wht_img.setImageDrawable(context.getResources().getDrawable(items.get(position).getItem_image()));
         holder.wht_txt.setText(items.get(position).getItem_name());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class  Holder extends RecyclerView.ViewHolder{
       TextView wht_txt ;
       ImageView wht_img;
        public Holder(View itemView) {
            super(itemView);
            wht_txt = (TextView) itemView.findViewById(R.id.wht_txt);
            wht_img = (ImageView) itemView.findViewById(R.id.wht_img);
        }
    }
}
