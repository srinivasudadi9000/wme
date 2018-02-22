package m.srinivas.wme;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ImageView;

import java.util.ArrayList;

public class Home extends Activity {
    RecyclerView survey_recycle, home_survey;
    ArrayList<Home_m> home_ms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        home_survey = (RecyclerView) findViewById(R.id.left_drawer);
        survey_recycle = (RecyclerView) findViewById(R.id.right_drawer);
        survey_recycle.setLayoutManager(new LinearLayoutManager(this));
        survey_recycle.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        survey_recycle.setAdapter(new Home_adapter(addhome(), R.layout.root, this));

        home_survey.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        home_survey.setAdapter(new exitpoll_adapter(add_exitpol(), R.layout.root_pol, this));
    }

    public ArrayList<Home_m> addhome() {
        home_ms = new ArrayList<Home_m>();
        home_ms.add(new Home_m(R.drawable.events, "Events"));
        home_ms.add(new Home_m(R.drawable.exhibition, "Exhibition"));
        home_ms.add(new Home_m(R.drawable.poll, "Bulk Sale"));
        home_ms.add(new Home_m(R.drawable.emergency, "Emergency"));
        home_ms.add(new Home_m(R.drawable.scholars, "ScholarShips"));
        home_ms.add(new Home_m(R.drawable.hospitals, "Hospitals"));
        home_ms.add(new Home_m(R.drawable.hotel, "Hotels"));
        home_ms.add(new Home_m(R.drawable.jobs, "Jobs"));
        home_ms.add(new Home_m(R.drawable.movies, "Movies"));
        home_ms.add(new Home_m(R.drawable.shoppingmalls, "Shopping Malls"));
        home_ms.add(new Home_m(R.drawable.companies, "Companies"));
        home_ms.add(new Home_m(R.drawable.notification, "Notifications"));
        return home_ms;
    }

    public ArrayList<Home_m> add_exitpol() {
        home_ms = new ArrayList<Home_m>();
        home_ms.add(new Home_m(R.drawable.school, "Schools"));
        home_ms.add(new Home_m(R.drawable.exhibition, "Collegs"));
        home_ms.add(new Home_m(R.drawable.events, "Politics"));
         home_ms.add(new Home_m(R.drawable.exhibition, "Books"));
        home_ms.add(new Home_m(R.drawable.laptop, "Laptops"));

        return home_ms;
    }
}
