package com.example.lin9080.accountoe;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    private ArrayList<Account> maccounts;
    public AccountAdapter(ArrayList<Account> accounts) {
        maccounts=accounts;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView number;
        TextView Time;
        TextView WhatDo;

        public ViewHolder(View view){
            super(view);
            number=(TextView)view.findViewById(R.id.newerNumber);
            Time=(TextView)view.findViewById(R.id.newerTime);
            WhatDo=(TextView) view.findViewById(R.id.newerWhatDo);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Account account=maccounts.get(position);
        holder.number.setText(account.getNumber()+"");
        holder.Time.setText(account.getUseTime()+"");
        holder.WhatDo.setText(account.getWhatDo()+"");
    }

    @Override
    public int getItemCount() {
        return maccounts.size();
    }
}