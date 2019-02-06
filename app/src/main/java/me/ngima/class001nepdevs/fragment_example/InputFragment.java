package me.ngima.class001nepdevs.fragment_example;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import me.ngima.class001nepdevs.R;

public class InputFragment extends Fragment {

    interface InputFragmentCallback {
        void onTextEntered(String text);
    }

    InputFragmentCallback callback;

    EditText editText;
    Button buttonDisplay;

    public static InputFragment newInstance(InputFragmentCallback callback) {
        InputFragment fragment = new InputFragment();

        fragment.callback = callback;

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_input, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editText = view.findViewById(R.id.edit_text);
        buttonDisplay = view.findViewById(R.id.button_display);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (callback != null)
                    callback.onTextEntered(editText.getText().toString());
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (callback != null)
                    callback.onTextEntered(editText.getText().toString());            }
        });


    }
}
