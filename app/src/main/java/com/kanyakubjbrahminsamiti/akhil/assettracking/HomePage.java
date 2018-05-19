package com.kanyakubjbrahminsamiti.akhil.assettracking;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.kanyakubjbrahminsamiti.akhil.assettracking.assetadatadapter.AssetDataViewAdapter;
import com.kanyakubjbrahminsamiti.akhil.assettracking.model.AssetModel;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home_page);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AssetDataViewAdapter(this,loadAssetData()));

    loadAssetData();
    }
public ArrayList loadAssetData()
{
ArrayList<AssetModel> assetModels=new ArrayList<>();
AssetModel aa=new AssetModel();
aa.setImage(R.drawable.plus);
aa.setName("New Asset");
assetModels.add(aa);
    aa=new AssetModel();

    aa.setImage(R.drawable.editicon);
    aa.setName("Edit Asset");
    assetModels.add(aa);

    aa=new AssetModel();


    aa.setImage(R.drawable.moveicon);
    aa.setName("Move Asset");
    assetModels.add(aa);

    aa=new AssetModel();

    aa.setImage(R.drawable.checkouticon);
    aa.setName("Check-Out");
    assetModels.add(aa);

    aa=new AssetModel();

    aa.setImage(R.drawable.checkinicon);
    aa.setName("Check-In");
    assetModels.add(aa);

    aa=new AssetModel();

    aa.setImage(R.drawable.disposeicon);
    aa.setName("Dispose");
    assetModels.add(aa);

    aa=new AssetModel();

    aa.setImage(R.drawable.auditicon);
    aa.setName("Audit");
    assetModels.add(aa);

    aa=new AssetModel();

    aa.setImage(R.drawable.funding_auditicon);
    aa.setName("Funding Audit");
    assetModels.add(aa);

    aa=new AssetModel();

    aa.setImage(R.drawable.maintenanceicon);
    aa.setName("Maintenance");
    assetModels.add(aa);
return assetModels;
}
}
