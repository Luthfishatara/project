package com.example.maungaji.fragments;

import android.app.Notification;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maungaji.R;
import com.github.ybq.android.spinkit.SpinKitView;

public class FragmentHome extends Fragment {

    SpinKitView spinKitView;
    RecyclerView recyclerView;
    GridLayoutManager glm;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);


        makanbang();

        return view;
    }

    private void makanbang() {


    }
}
