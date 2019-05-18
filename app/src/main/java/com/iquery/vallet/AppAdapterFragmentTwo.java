package com.iquery.vallet;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AppAdapterFragmentTwo extends RecyclerView.Adapter<AppAdapterFragmentTwo.MyViewHolder> {

    List<App> mApp;

    public AppAdapterFragmentTwo(List<App> AppList){
        mApp = AppList;
    }

    @NonNull
    @Override
    public AppAdapterFragmentTwo.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_two,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(mView);
        
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mTextViewName.setText("Name = "+mApp.get(position).getName());
        holder.mTextViewDev.setText("Developer ="+mApp.get(position).getDev());
        holder.mTextViewDesc.setText("Description ="+mApp.get(position).getDesc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //destination when clicked
                Intent mIntent = new Intent(v.getContext(),MainActivity.class);
                mIntent.putExtra("Name", mApp.get(position).getName());
                mIntent.putExtra("Developer", mApp.get(position).getDev());
                mIntent.putExtra("Description", mApp.get(position).getDesc());
                v.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mApp.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewName,mTextViewDev,mTextViewDesc;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewName=(TextView)itemView.findViewById(R.id.tvName);
            mTextViewDev=(TextView)itemView.findViewById(R.id.tvDev);
            mTextViewDesc=(TextView)itemView.findViewById(R.id.tvDesc);
        }
    }
}
