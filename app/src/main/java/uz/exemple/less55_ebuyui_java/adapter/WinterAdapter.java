package uz.exemple.less55_ebuyui_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less55_ebuyui_java.R;
import uz.exemple.less55_ebuyui_java.model.WinterModel;

public class WinterAdapter extends RecyclerView.Adapter<WinterAdapter.ViewHolder> {
    private Context context;
    private ArrayList<WinterModel> wList;

    public WinterAdapter(Context context, ArrayList<WinterModel> wList) {
        this.context = context;
        this.wList = wList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_winter_essential,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WinterModel item = wList.get(position);
        holder.image.setImageResource(item.getImage());
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return wList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.iv_image_winter);
            title = itemView.findViewById(R.id.tv_title_winter);
        }
    }
}
