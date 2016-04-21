package app.demo.com.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener{

    Button onClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        onClick = (Button) findViewById(R.id.onClick);

        onClick.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(HomeScreen.this, "Hoan thanh tac vu!", Toast.LENGTH_SHORT).show();
    }
}
