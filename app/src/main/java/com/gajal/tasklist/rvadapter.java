package com.gajal.tasklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class rvadapter extends RecyclerView.Adapter<rvadapter.ViewHolder> {

    List<rvmodal> rvmodalList;
    Context context;

    public rvadapter(List<rvmodal> rvmodalList, Context context) {
        this.rvmodalList = rvmodalList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.rv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        rvmodal rev=rvmodalList.get(position);
holder.textView.setText(rev.getTask());

    }

    @Override
    public int getItemCount() {
        return rvmodalList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
TextView textView;
Button done;
Button edit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView1);
            done=itemView.findViewById(R.id.button);
            edit= itemView.findViewById(R.id.button2);
        }
    }

}
