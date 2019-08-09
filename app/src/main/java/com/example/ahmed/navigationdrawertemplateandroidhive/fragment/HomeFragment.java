package com.example.ahmed.navigationdrawertemplateandroidhive.fragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmed.navigationdrawertemplateandroidhive.R;
import com.example.ahmed.navigationdrawertemplateandroidhive.other.ExampleAdapter;
import com.example.ahmed.navigationdrawertemplateandroidhive.other.ExampleItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private ExampleAdapter adapter;
    RecyclerView recyclerView;
    private List<ExampleItem> exampleList;

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        setUpRecyclerView(CreatList());
        return view;
    }

    private List<ExampleItem> CreatList(){
        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.background_1));
        exampleList.add(new ExampleItem(R.drawable.background_2));
        exampleList.add(new ExampleItem(R.drawable.background_3));
        exampleList.add(new ExampleItem(R.drawable.background_4));
        exampleList.add(new ExampleItem(R.drawable.background_1));
        exampleList.add(new ExampleItem(R.drawable.background_2));
        exampleList.add(new ExampleItem(R.drawable.background_3));
        exampleList.add(new ExampleItem(R.drawable.background_4));
        exampleList.add(new ExampleItem(R.drawable.background_1));
        exampleList.add(new ExampleItem(R.drawable.background_2));
        exampleList.add(new ExampleItem(R.drawable.background_3));
        exampleList.add(new ExampleItem(R.drawable.background_4));
        exampleList.add(new ExampleItem(R.drawable.background_1));
        exampleList.add(new ExampleItem(R.drawable.background_2));
        exampleList.add(new ExampleItem(R.drawable.background_3));
        exampleList.add(new ExampleItem(R.drawable.background_4));
        return exampleList;
    }

    private void setUpRecyclerView(List<ExampleItem> exampleList) {
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        adapter = new ExampleAdapter(exampleList, getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}
