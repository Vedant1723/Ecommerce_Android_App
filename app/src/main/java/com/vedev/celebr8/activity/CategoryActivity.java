package com.vedev.celebr8.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.vedev.celebr8.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String title = getIntent().getStringExtra("CategoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        categoryRecyclerView = findViewById(R.id.category_recyclerView);
        /////// Banner SLider
        //SliderAdapter sliderAdapter = new SliderAdapter();
        List<SliderModel>sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.bakery,"#000000"));
        sliderModelList.add(new SliderModel(R.drawable._im1,"#000000"));
        sliderModelList.add(new SliderModel(R.drawable._logo_small,"#000000"));

        sliderModelList.add(new SliderModel(R.drawable._logo_small,"#000000"));
        sliderModelList.add(new SliderModel(R.drawable.bakery,"#000000"));

        sliderModelList.add(new SliderModel(R.drawable._im1,"#000000"));
        sliderModelList.add(new SliderModel(R.drawable.bakery,"#000000"));
        sliderModelList.add(new SliderModel(R.drawable._logo_small,"#000000"));
        ///// Banner Slider
        ///// Strip ad
        ///// Strip ad
        ///// Horizontal Product Layout
        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.cake,"Cake","Chocolate","150 Rs"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.cokkkkee,"Cookie","Chocolate","150 Rs"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bread,"Bread","Chocolate","150 Rs"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.cokkkkee,"Cookie","Chocolate","150 Rs"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.cake,"Cake","Chocolate","150 Rs"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.cokkkkee,"Cookie","Chocolate","150 Rs"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bread,"Bread","Chocolate","150 Rs"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.cokkkkee,"Cookie","Chocolate","150 Rs"));
        ///// Horizontal Product Layout
        /////////
        LinearLayoutManager testinglayoutmanager = new LinearLayoutManager(this);
        testinglayoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(testinglayoutmanager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0,sliderModelList));

        //   homePageModelList.add(new HomePageModel(3,sliderModelList));
        homePageModelList.add(new HomePageModel(2,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.bakery,"#000000"));
        homePageModelList.add(new HomePageModel(3,"Deals of the Day",horizontalProductScrollModelList));
        //    homePageModelList.add(new HomePageModel(3,sliderModelList));
        homePageModelList.add(new HomePageModel(0,sliderModelList));
        homePageModelList.add(new HomePageModel(2,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.bakery,"#000000"));
        homePageModelList.add(new HomePageModel(3,"Deals of the Day",horizontalProductScrollModelList));


        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_search)
        {
            return true;
        }
        else if (id == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
