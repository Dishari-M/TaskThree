package dishari.com.taskthree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent =getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Toast.makeText(
                SecondActivity.this,message, Toast.LENGTH_SHORT
        ).show();

    }
}
