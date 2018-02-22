package m.srinivas.wme;

import android.content.Context;
import android.media.Image;
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

public class Home_adapter extends RecyclerView.Adapter<Home_adapter.HOlder> {
    ArrayList<Home_m> homename;
    int rowLayout;
    Context home;

    public Home_adapter(ArrayList<Home_m> homename, int rowLayout, Home home) {
        this.home = home;
        this.homename = homename;
        this.rowLayout = rowLayout;
    }


    @Override
    public HOlder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new Home_adapter.HOlder(view);
    }

    @Override
    public void onBindViewHolder(HOlder holder, int position) {
        holder.root_txt.setText(homename.get(position).getHomename());
        holder.root_img.setImageDrawable(home.getResources().getDrawable(homename.get(position).getImage()));
    }


    @Override
    public int getItemCount() {
        return homename.size();
    }

    public class HOlder extends RecyclerView.ViewHolder {
        TextView root_txt;
        ImageView root_img;
        public HOlder(View itemView) {
            super(itemView);
            root_txt = (TextView) itemView.findViewById(R.id.root_txt);
            root_img = (ImageView) itemView.findViewById(R.id.root_img);
        }
    }
}
