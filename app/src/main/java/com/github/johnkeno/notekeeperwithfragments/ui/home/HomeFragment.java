package com.github.johnkeno.notekeeperwithfragments.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.johnkeno.notekeeperwithfragments.R;
import com.github.johnkeno.notekeeperwithfragments.ui.gallery.GalleryViewModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView mView;
    private List<HomeList> mList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        mView = root.findViewById(R.id.recyclerView_home);

        mView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mView.setAdapter(new NoteRecyclerAdapter(getContext(),mList));
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mList = new ArrayList<>();
        // data used to populate the recyclerView
        mList.add(new HomeList("note 1","details"));
        mList.add(new HomeList("note 2 ","details"));
        mList.add(new HomeList("note 3 ","details"));
        mList.add(new HomeList("note 4 ","details"));
        mList.add(new HomeList("note 5 ","details"));
        mList.add(new HomeList("note 6 ","details"));
        mList.add(new HomeList("note 7 ","details"));
        mList.add(new HomeList("note 8 ","details"));
        mList.add(new HomeList("note 9 ","details"));
        mList.add(new HomeList("note 10 ","details"));


    }
}
