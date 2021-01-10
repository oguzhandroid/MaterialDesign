package com.ogocer.materialdesignkullanimi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.CardViewNesneTutucu>{
    private Context mContext;
    private List<String> gelenBilgiListesi;
    private List<Integer> gelenBilgiNo;

    public MyRvAdapter() {
    }

    @NonNull
    @Override
    public CardViewNesneTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewNesneTutucu holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public MyRvAdapter(Context mContext, List<String> gelenBilgiListesi, List<Integer> gelenBilgiNo) {
        this.mContext = mContext;
        this.gelenBilgiListesi = gelenBilgiListesi;
        this.gelenBilgiNo = gelenBilgiNo;
    }

    public class CardViewNesneTutucu extends RecyclerView.ViewHolder{

        public TextView satirNo,satirBilgi;
        public CardView satirCardView;
        public CardViewNesneTutucu(@NonNull View itemView) {
            super(itemView);
            satirNo = itemView.findViewById(R.id.tvNumara);
            satirBilgi = itemView.findViewById(R.id.tvBilgi);
            satirCardView = itemView.findViewById(R.id.cardView);


        }
    }
}
