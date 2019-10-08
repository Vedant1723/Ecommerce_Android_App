package com.vedev.celebr8.activity;


import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.vedev.celebr8.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;




public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }
    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    private RecyclerView testing;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        categoryRecyclerView = view.findViewById(R.id.category_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);
        final List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("Link","Home"));
        categoryModelList.add(new CategoryModel("Link","Cake"));
        categoryModelList.add(new CategoryModel("Link","Cookies"));
        categoryModelList.add(new CategoryModel("Link","Beverages"));
        categoryModelList.add(new CategoryModel("Link","New Product"));
        categoryModelList.add(new CategoryModel("Link","Baked"));
        categoryModelList.add(new CategoryModel("Link","HomeMade"));
        categoryModelList.add(new CategoryModel("Link","Home"));
        categoryModelList.add(new CategoryModel("Link","Home"));
        categoryModelList.add(new CategoryModel("Link","Home"));
        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

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
     testing = view.findViewById(R.id.home_page_recyclerView);
        LinearLayoutManager testinglayoutmanager = new LinearLayoutManager(getContext());
        testinglayoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        testing.setLayoutManager(testinglayoutmanager);

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
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        ////////

        return view;

    }
    /////// Banner Slider

    ////// Banner Slider
}