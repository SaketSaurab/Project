package com.example.ikea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.viewHolder> {

    Context context;
    String[] programNameList;
    String[] programDescriptionList;
    int[] images;


    public static class viewHolder extends RecyclerView.ViewHolder{

TextView rowName;
TextView rowDescription;
ImageView rowImage;

        public viewHolder( View itemView) {
            super(itemView);

            rowName=itemView.findViewById(R.id.textview1);
            rowDescription=itemView.findViewById(R.id.textview2);
            rowImage=itemView.findViewById(R.id.programImages);
        }
    }
public  ProgramAdapter(Context context,String[]programNameList,String[]programDescriptionList,int[]images){
        this.context=context;
        this.programNameList=programNameList;
        this.programDescriptionList=programDescriptionList;
        this.images=images;

}

    @Override
    public ProgramAdapter.viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);

        return new viewHolder(view);


    }

    @Override
    public void onBindViewHolder( ProgramAdapter.viewHolder holder, int position) {

        holder.rowName.setText(programNameList[position]);
        holder.rowDescription.setText(programDescriptionList[position]);
        holder.rowImage.setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {
        return programNameList.length;
    }
}
