package dishari.com.taskthree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    public final static String EXTRA_MESSAGE = "TASK 3 COMPLETED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button=(Button)findViewById(R.id.button);
        String x= "Application Started";
Toast.makeText(
        MainActivity.this,x,Toast.LENGTH_SHORT
).show();
    button.setOnClickListener(this);

}
@Override
public void onClick(View v)
{

    Intent intent= new Intent (this,SecondActivity.class);
    String s="Task 3 completed";
    intent.putExtra(EXTRA_MESSAGE,s);
    startActivity(intent);

}
}
