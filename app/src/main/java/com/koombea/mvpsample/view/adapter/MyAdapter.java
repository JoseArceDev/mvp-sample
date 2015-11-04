package com.koombea.mvpsample.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.koombea.mvpsample.model.ItemModel;
import com.koombea.mvpsample.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by koombea on 10/27/15.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private ArrayList<ItemModel> itemModels;
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onUserItemClicked(ItemModel userModel);
    }

    public MyAdapter(ArrayList<ItemModel> itemModels){
        this.itemModels = itemModels;
    }

    public void setOnClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getItemCount() {
        return itemModels.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View layoutInflater = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_holder_items, viewGroup,false);
        MyAdapterHolder myAdapterHolder = new MyAdapterHolder(layoutInflater);
        return myAdapterHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final ItemModel itemModel = itemModels.get(i);
        MyAdapterHolder myAdapterHolder = (MyAdapterHolder) viewHolder;
        myAdapterHolder.textViewCarrear.setText(itemModel.carrear);
        myAdapterHolder.textViewName.setText(itemModel.name);
        myAdapterHolder.textViewLastName.setText(itemModel.lastName);
        myAdapterHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(onItemClickListener != null && itemModel != null){
                onItemClickListener.onUserItemClicked(itemModel);
            }
            }
        });
    }

    class MyAdapterHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.textView_name) TextView textViewName;
        @Bind(R.id.textView_last_name) TextView textViewLastName;
        @Bind(R.id.textView_carrear) TextView textViewCarrear;

        public MyAdapterHolder(View view){
            super(view);
            ButterKnife.bind(this,view);
        }

    }
}
