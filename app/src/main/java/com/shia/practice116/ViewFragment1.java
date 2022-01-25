package com.shia.practice116;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

public class ViewFragment1 extends Fragment {

    LinearLayout linear1;
    TextInputLayout layoutName, layoutPass;
    EditText editName, editPass;
    Button login;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        linear1 = view.findViewById(R.id.linear1);
        layoutName = view.findViewById(R.id.layoutName);
        layoutPass = view.findViewById(R.id.layoutPass);
        editName = view.findViewById(R.id.editName);
        editPass = view.findViewById(R.id.editPass);
        login = view.findViewById(R.id.login);

        linear1.setOnClickListener(null);

        editName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (editName.getText().toString().isEmpty()){
                    layoutName.setError("enter your name");
                } else {
                    layoutName.setErrorEnabled(false);
                }
            }
        });
        editName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (editName.getText().toString().isEmpty()){
                    layoutName.setError("enter your name");
                } else {
                    layoutName.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editPass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (editPass.getText().toString().isEmpty()){
                    layoutPass.setError("enter your pass");
                } else {
                    layoutPass.setErrorEnabled(false);
                }
            }
        });
        editPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (editPass.getText().toString().isEmpty()){
                    layoutPass.setError("enter your pass");
                } else {
                    layoutPass.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runAlert();
            }
        });
    }
    private void runAlert(){
        new AlertDialog.Builder(getContext())
                .setTitle("login apply")
                .setMessage("select ok to agree with your data")
                .setCancelable(false)
                .setIcon(R.drawable.ic_baseline_source_24)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getContext(), "ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .create()
                .show();
    }
}
