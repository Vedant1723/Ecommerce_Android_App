package com.vedev.celebr8.activity;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vedev.celebr8.R;

import java.util.List;

public class GridProductLayoutAdapter extends BaseAdapter {

    List<HorizontalProductScrollModel> horizontalProductScrollModelList;

    public GridProductLayoutAdapter(List<HorizontalProductScrollModel> horizontalProductScrollModelList) {
        this.horizontalProductScrollModelList = horizontalProductScrollModelList;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1;
        if(view == null)
        {
            view1 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_scroll_item_layout,null);
           // view1.setElevation(0);
            //view1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            ImageView productImage = view1.findViewById(R.id.H_s_product_image);
            TextView productTitle = view1.findViewById(R.id.H_s_product_title);
            TextView productPrice = view1.findViewById(R.id.H_s_product_price);
            TextView productDescription = view1.findViewById(R.id.H_s_pro_descript);

            productImage.setImageResource(horizontalProductScrollModelList.get(i).getProductImage());
            productTitle.setText(horizontalProductScrollModelList.get(i).getProductTitle());
            productPrice.setText(horizontalProductScrollModelList.get(i).getProductPrice());
            productDescription.setText(horizontalProductScrollModelList.get(i).getProductDescription());
        }else {
            view1 = view;
        }
        return view1;
    }
}
