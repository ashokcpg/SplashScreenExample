package np.com.ashok.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Button btnchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable runnableobj = new Runnable() {         // Certain Time Paxi garne kaam Runnable ma rakhne
            @Override
            public void run() {

                Toast.makeText(MainActivity.this, "Popups text after certain time!!! ", Toast.LENGTH_SHORT).show();

                Intent intentobj = new Intent(MainActivity.this,LoginActivity.class);  //To go to another class
                startActivity(intentobj);
                finish(); //To kill previous page

            }
        };

        new Handler().postDelayed(runnableobj, 3000);

//        btnchange = findViewById(R.id.btnChange);

//        btnchange.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                changepicture();
//            }
//        });
//    }
//
//
//    public void changepicture()
//    {
//
//    }
    }
}
