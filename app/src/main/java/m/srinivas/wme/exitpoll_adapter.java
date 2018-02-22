package m.srinivas.wme;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by srinivas on 21/02/18.
 */

public class exitpoll_adapter extends RecyclerView.Adapter<exitpoll_adapter.Holder> {
     ArrayList<Home_m> home_ms;int rootlayout;
     Context context;

    public exitpoll_adapter(ArrayList<Home_m> addhome, int root_pol, Home home) {
         this.home_ms = addhome;this.rootlayout = root_pol;this.context = home;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rootlayout, parent, false);
        return new exitpoll_adapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.root_pol_txt.setText(home_ms.get(position).getHomename());
        holder.root_pol_img.setImageDrawable(context.getResources().getDrawable(home_ms.get(position).getImage()));
    }

    @Override
    public int getItemCount() {
        return home_ms.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView root_pol_txt;
ImageView root_pol_img;
        public Holder(View itemView) {
            super(itemView);
            root_pol_txt = (TextView) itemView.findViewById(R.id.root_pol_txt);
            root_pol_img = (ImageView) itemView.findViewById(R.id.root_pol_img);
        }
    }
}
