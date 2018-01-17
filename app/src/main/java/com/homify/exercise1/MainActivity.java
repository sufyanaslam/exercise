package com.homify.exercise1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager staggeredGridLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        List<ImageObject> staggeredList = getImageListItemData();

        ImageRecyclerViewAdapter recyclerViewAdapter = new ImageRecyclerViewAdapter(MainActivity.this, staggeredList);
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ImageObject> getImageListItemData(){
        List<ImageObject> listViewItems = new ArrayList<ImageObject>();
        listViewItems.add(new ImageObject("ONE", R.drawable.one));
        listViewItems.add(new ImageObject("TWO", R.drawable.two));
        listViewItems.add(new ImageObject("THREE", R.drawable.three));
        listViewItems.add(new ImageObject("FOUR", R.drawable.four));
        listViewItems.add(new ImageObject("FIVE", R.drawable.five));
        listViewItems.add(new ImageObject("SIX", R.drawable.six));
        listViewItems.add(new ImageObject("SEVEN", R.drawable.seven));
        listViewItems.add(new ImageObject("NINE", R.drawable.nine));
        listViewItems.add(new ImageObject("TEN", R.drawable.ten));
        listViewItems.add(new ImageObject("THREE", R.drawable.three));
        listViewItems.add(new ImageObject("SIX", R.drawable.six));
        listViewItems.add(new ImageObject("ONE", R.drawable.one));
        listViewItems.add(new ImageObject("FIVE", R.drawable.five));
        listViewItems.add(new ImageObject("SIX", R.drawable.six));
        listViewItems.add(new ImageObject("SEVEN", R.drawable.seven));
        listViewItems.add(new ImageObject("NINE", R.drawable.nine));
        listViewItems.add(new ImageObject("TEN", R.drawable.ten));
        listViewItems.add(new ImageObject("THREE", R.drawable.three));
        listViewItems.add(new ImageObject("SIX", R.drawable.six));
        listViewItems.add(new ImageObject("ONE", R.drawable.one));
        listViewItems.add(new ImageObject("FIVE", R.drawable.five));
        listViewItems.add(new ImageObject("SIX", R.drawable.six));
        listViewItems.add(new ImageObject("SEVEN", R.drawable.seven));
        listViewItems.add(new ImageObject("NINE", R.drawable.nine));
        listViewItems.add(new ImageObject("TEN", R.drawable.ten));
        listViewItems.add(new ImageObject("THREE", R.drawable.three));
        listViewItems.add(new ImageObject("SIX", R.drawable.six));
        listViewItems.add(new ImageObject("ONE", R.drawable.one));

        return listViewItems;
    }
}
