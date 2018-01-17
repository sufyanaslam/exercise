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


        int mat[][] = { { 2, 3, 8 },
                { 5, 1, 7 },
                { 9, 2, 6 } };
        int new_mat[][] = bucketPaint(mat);
        System.out.println("mat : ");
        display(mat);
        System.out.println("new_mat : ");
        display(new_mat);


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

    static int [][] bucketPaint( int dataArray[][], int x, int y, int color)
    {
        int numberOfRows = dataArray.length;  // get the no. of rows
        int numberOfCols = dataArray[0].length;  // get the no. of columns

        // Base case terminations
        if (x < 0 ||  x > numberOfRows || y < 0 || y > numberOfCols)
            return;
        if (dataArray[x][y] == color)
            return;

        // Replace the color at (x, y)
        dataArray[x][y] = color;

        // Recur for Adjacent cells
        bucketPaint(dataArray, x+1, y, color);
        bucketPaint(dataArray, x-1, y, color);
        bucketPaint(dataArray, x, y+1, color);
        bucketPaint(dataArray, x, y-1, color);
    }

    static void display(int mat[][]) {
        for ( int i = 0; i < mat.length; i++ ) {
            for ( int j = 0; j < mat[0].length; j++ ) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }




}
