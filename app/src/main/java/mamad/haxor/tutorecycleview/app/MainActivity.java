package mamad.haxor.tutorecycleview.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity
{
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ItemsModelList data = new ItemsModelList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data.addItem(new ItemsModel(R.drawable.monkey_junky_funy, "Asian Town", "another text"));
        data.addItem(new ItemsModel(R.drawable.monkey_junky_funy, "Asian Town", "another text"));
        data.addItem(new ItemsModel(R.drawable.monkey_junky_funy, "Asian Town", "another text"));
        data.addItem(new ItemsModel(R.drawable.monkey_junky_funy, "Asian Town", "another text"));
        data.addItem(new ItemsModel(R.drawable.monkey_junky_funy, "Asian Town", "another text"));

        setContentView(R.layout.items_layout);
        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        //recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new recycleViewAdapter(data);
        recyclerView.setAdapter(adapter);
        toolbar = (Toolbar)findViewById(R.id.ttoolbar);
        toolbar.setTitle("Tutorial RecycleView");
        setSupportActionBar(toolbar);
    }
}
