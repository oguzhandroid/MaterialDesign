package com.ogocer.materialdesignkullanimi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRvAdapter {
    private Context mContext;
    private List<String> gelenBilgiListesi;
    private List<Integer> gelenBilgiNo;

    public MyRvAdapter() {
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
