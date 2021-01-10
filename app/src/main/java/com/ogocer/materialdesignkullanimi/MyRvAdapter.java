package com.ogocer.materialdesignkullanimi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_tasarim,parent,false);
        return new CardViewNesneTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewNesneTutucu holder, int position) {

        String bilgi = gelenBilgiListesi.get(position);
        holder.satirBilgi.setText(bilgi);

        int no = gelenBilgiNo.get(position);
        holder.satirNo.setText(""+no);
        holder.satirCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Tıklanan : "+bilgi, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return gelenBilgiListesi.size();
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
