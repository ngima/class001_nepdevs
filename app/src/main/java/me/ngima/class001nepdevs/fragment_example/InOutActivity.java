package me.ngima.class001nepdevs.fragment_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import me.ngima.class001nepdevs.R;

public class InOutActivity extends AppCompatActivity implements InputFragment.InputFragmentCallback {


    OutputFragment outputFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_out);

        init();
    }


    private void init() {
        outputFragment = OutputFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_in, InputFragment.newInstance(this))
                .commit();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_out, outputFragment)
                .commit();
    }

    @Override
    public void onTextEntered(String text) {
        Toast.makeText(this, "Activity: "+text, Toast.LENGTH_SHORT).show();
        outputFragment.setText(text);
    }
}
