package me.ngima.class001nepdevs.fragment_example;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.ngima.class001nepdevs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OutputFragment extends Fragment {

    public static OutputFragment newInstance() {
        OutputFragment fragment = new OutputFragment();

        return fragment;
    }

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_output, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.text);
    }

    public void setText(String text){
        textView.setText(text);
    }

}
