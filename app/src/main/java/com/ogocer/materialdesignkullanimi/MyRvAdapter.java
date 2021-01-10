package com.ogocer.materialdesignkullanimi;

import android.content.Context;

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
}
