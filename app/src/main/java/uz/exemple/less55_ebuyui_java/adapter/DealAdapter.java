package uz.exemple.less55_ebuyui_java.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less55_ebuyui_java.R;
import uz.exemple.less55_ebuyui_java.model.TodaysDealsModel;

public class DealAdapter extends RecyclerView.Adapter<DealAdapter.ViewHolder> {
    private Context context;
    private ArrayList<TodaysDealsModel> dealLst;

    public DealAdapter(Context context, ArrayList<TodaysDealsModel> dealLst) {
        this.context = context;
        this.dealLst = dealLst;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todays_deal,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TodaysDealsModel item = dealLst.get(position);
        holder.image.setImageResource(item.getImage());
        holder.title.setText(item.getTitle());
        holder.price.setText("$"+ item.getPrice());

        CharSequence oldPrice = Html.fromHtml("<s>" +"$"+  item.getOld_price() + "</s>");
        holder.old_price.setText(oldPrice);
        holder.discount.setText(item.getDiscount() + "% OFF");
    }

    @Override
    public int getItemCount() {
        return dealLst.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        TextView price;
        TextView old_price;
        TextView discount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.iv_image_deal);
            title = itemView.findViewById(R.id.tv_title_deal);
            price = itemView.findViewById(R.id.tv_price_deal);
            old_price = itemView.findViewById(R.id.tv_oldPrice);
            discount = itemView.findViewById(R.id.tv_discount);
        }
    }
}
