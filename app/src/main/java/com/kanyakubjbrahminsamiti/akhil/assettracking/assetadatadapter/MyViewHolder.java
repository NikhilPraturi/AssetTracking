package com.kanyakubjbrahminsamiti.akhil.assettracking.assetadatadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kanyakubjbrahminsamiti.akhil.assettracking.R;

/**
 * Created by akhil on 18-05-2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView assetname;
    ImageView imageView;

    public MyViewHolder(View itemView) {
        super(itemView);
assetname=(TextView) itemView.findViewById(R.id.textView2);
imageView=(ImageView) itemView.findViewById(R.id.imageView2);

    }
}
