package np.com.ashok.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtusername,txtpassword;
    Button btnlogin,btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtusername = findViewById(R.id.txtUsername);
        txtpassword = findViewById(R.id.txtPassword);
        btnlogin = findViewById(R.id.btnLogin);
        btnreset = findViewById(R.id.btnReset);

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    public void login()
    {
       String username = txtusername.getText().toString().trim();
       String password = txtpassword.getText().toString().trim();


       if (username.equals("")||password.equals(""))
       {
           Toast.makeText(this, "EMPTY FIELD", Toast.LENGTH_SHORT).show();
       }

       else
       {
           Toast.makeText(this, "VALID", Toast.LENGTH_SHORT).show();

       }

    }

    public void reset()
    {

        Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show();

        txtusername.setText("");
        txtpassword.setText("");
    }



}
