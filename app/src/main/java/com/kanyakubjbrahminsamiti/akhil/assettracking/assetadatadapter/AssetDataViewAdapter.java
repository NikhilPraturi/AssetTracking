package com.kanyakubjbrahminsamiti.akhil.assettracking.assetadatadapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kanyakubjbrahminsamiti.akhil.assettracking.R;
import com.kanyakubjbrahminsamiti.akhil.assettracking.model.AssetModel;

import java.util.ArrayList;

/**
 * Created by akhil on 18-05-2018.
 */

public class AssetDataViewAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context c;
    
    private ArrayList<AssetModel> assetModelslist;
    public AssetDataViewAdapter(Context c,ArrayList<AssetModel> assetModels)
    {
        this.c=c;
        this.assetModelslist=assetModels;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(c).inflate(R.layout.asset_data,parent,false);
        

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        AssetModel aa=assetModelslist.get(position);
            holder.imageView.setImageResource(aa.getImage()) ;
            holder.assetname.setText(aa.getName());

    }

    @Override
    public int getItemCount() {
        return assetModelslist.size();
    }
}
