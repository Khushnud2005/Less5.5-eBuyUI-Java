package uz.exemple.less55_ebuyui_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import uz.exemple.less55_ebuyui_java.adapter.DealAdapter;
import uz.exemple.less55_ebuyui_java.adapter.FavoriteAdapter;
import uz.exemple.less55_ebuyui_java.adapter.WinterAdapter;
import uz.exemple.less55_ebuyui_java.model.Favorite;
import uz.exemple.less55_ebuyui_java.model.TodaysDealsModel;
import uz.exemple.less55_ebuyui_java.model.WinterModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView dealRecyclerView;
    RecyclerView winterRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);

        refreshAdapter(getFavorites());

        dealRecyclerView = findViewById(R.id.dealRecyclerView);
        LinearLayoutManager dealManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        dealRecyclerView.setLayoutManager(dealManager);

        dealAdapter(getDeals());

        winterRecyclerView = findViewById(R.id.braveRecyclerView);
        GridLayoutManager winterManager = new GridLayoutManager(this, 3);
        winterRecyclerView.setLayoutManager(winterManager);

        winterAdapter(getWinters());
    }

    void refreshAdapter(ArrayList<Favorite> items) {
        FavoriteAdapter adapter = new FavoriteAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<Favorite> getFavorites(){
        ArrayList<Favorite> items = new  ArrayList<Favorite>();
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));
        items.add(new Favorite("Apple Watch", R.drawable.im_product_1));

        return items;
    }

    void dealAdapter(ArrayList<TodaysDealsModel> items) {
        DealAdapter adapter = new DealAdapter(this, items);
        dealRecyclerView.setAdapter(adapter);
    }

    ArrayList<TodaysDealsModel> getDeals(){
        ArrayList<TodaysDealsModel> items = new  ArrayList<TodaysDealsModel>();

        String text ="Apple Airpods Pro - Select Right Airpod Pro or Left Airpod Pro or Both - Good";
        items.add(new TodaysDealsModel(R.drawable.aripod1,text,125.95,150.00));
        text ="Apple Airpods 2nd Generation - Left Airpods or Right Airpods Select Side - Good";
        items.add(new TodaysDealsModel(R.drawable.aripod2,text,143.65,170.00));
        text ="Samsung Galaxy Watch 42mm 4GB Storage Rose Gold Stainless Steel Case Pink Buckle";
        items.add(new TodaysDealsModel(R.drawable.swatch1,text,109.90,128.90));
        text ="Apple Watch Series 4 44mm Space Grey GPS (Nike Band) Grade B \"eBay Good\"";
        items.add(new TodaysDealsModel(R.drawable.swatch2,text,75.00,93.00));
        text ="Apple iPad Air 4 (4th Gen) (10.9 inch) -64GB -256GB Wi-Fi + Cellular - Excellent";
        items.add(new TodaysDealsModel(R.drawable.ipad1,text,458.00,634.00));
        text ="Apple iPad 6 (6th Gen) - (2018 Model) - 32GB - 128GB - Wi-Fi - Cellular - Good";
        items.add(new TodaysDealsModel(R.drawable.ipad2,text,149.90,180.90));
        text ="Apple Airpods Pro - Select Right Airpod Pro or Left Airpod Pro or Both - Good";
        items.add(new TodaysDealsModel(R.drawable.aripod1,text,125.95,150.00));
        text ="Apple Airpods 2nd Generation - Left Airpods or Right Airpods Select Side - Good";
        items.add(new TodaysDealsModel(R.drawable.aripod2,text,143.65,170.00));
        text ="Samsung Galaxy Watch 42mm 4GB Storage Rose Gold Stainless Steel Case Pink Buckle";
        items.add(new TodaysDealsModel(R.drawable.swatch1,text,109.90,128.90));
        text ="Apple Watch Series 4 44mm Space Grey GPS (Nike Band) Grade B \"eBay Good\"";
        items.add(new TodaysDealsModel(R.drawable.swatch2,text,75.00,93.00));
        text ="Apple iPad Air 4 (4th Gen) (10.9 inch) -64GB -256GB Wi-Fi + Cellular - Excellent";
        items.add(new TodaysDealsModel(R.drawable.ipad1,text,458.00,634.00));
        text ="Apple iPad 6 (6th Gen) - (2018 Model) - 32GB - 128GB - Wi-Fi - Cellular - Good";
        items.add(new TodaysDealsModel(R.drawable.ipad2,text,149.90,180.90));

        return items;
    }

    void winterAdapter(ArrayList<WinterModel> items) {
        WinterAdapter adapter = new WinterAdapter(this, items);
        winterRecyclerView.setAdapter(adapter);
    }
    ArrayList<WinterModel> getWinters(){
        ArrayList<WinterModel> items = new  ArrayList<WinterModel>();
        items.add(new WinterModel( R.drawable.blanket,"Blankets"));
        items.add(new WinterModel( R.drawable.heaters,"Heaters"));
        items.add(new WinterModel( R.drawable.thermostats,"Thermostats"));
        items.add(new WinterModel( R.drawable.generators,"Generators"));
        items.add(new WinterModel( R.drawable.snowblower,"SnowBlowers"));
        items.add(new WinterModel( R.drawable.snowshowel,"SnowShovel"));

        return items;
    }
}