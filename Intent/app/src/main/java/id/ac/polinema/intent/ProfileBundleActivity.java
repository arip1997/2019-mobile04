package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ProfileBundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        Intent intent = new Intent(this, ProfileBundleActivity.class);
        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
        }
    }
}
