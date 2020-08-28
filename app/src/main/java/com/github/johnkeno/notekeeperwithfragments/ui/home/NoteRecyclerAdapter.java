package com.github.johnkeno.notekeeperwithfragments.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.johnkeno.notekeeperwithfragments.R;

import java.util.List;

public class NoteRecyclerAdapter extends RecyclerView.Adapter<NoteRecyclerAdapter.viewHolder> {


    private final List<HomeList> mDataSource;
    private Context mContext;

    public NoteRecyclerAdapter(Context Context, List<HomeList> list) {
        this.mContext = Context;
        this.mDataSource = list;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_note_lists,parent,false);
        viewHolder viewHolder = new viewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return mDataSource.size();
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.mTextTitle.setText(mDataSource.get(position).getVal1());
        holder.mTextNote.setText(mDataSource.get(position).getVal2());

    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private final TextView mTextTitle;
        private final TextView mTextNote;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            mTextTitle = itemView.findViewById(R.id.text_note_title);
            mTextNote = itemView.findViewById(R.id.text_note_text);
        }
    }
}
