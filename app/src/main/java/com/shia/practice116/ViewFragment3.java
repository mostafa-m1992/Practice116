package com.shia.practice116;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewFragment3 extends Fragment {

    TextView textGravity1, textGravity2, textGravity3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textGravity1 = view.findViewById(R.id.textGravity1);
        textGravity2 = view.findViewById(R.id.textGravity2);
        textGravity3 = view.findViewById(R.id.textGravity3);
    }
}
