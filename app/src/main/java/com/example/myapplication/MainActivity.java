package com.example.myapplication;
import static android.widget.Toast.LENGTH_LONG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etSecret;
    private Button btnOpen, btnSave;
    private TextView tvHaveSecret;
    public void init()
    {
        etSecret=findViewById(R.id.etSecret);
        btnOpen=findViewById(R.id.btnOpen);
        btnSave=findViewById(R.id.btnSave);
        tvHaveSecret=findViewById(R.id.tvHaveSecret);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        init();


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void OpenSesamo(View view)
    {
        Toast.makeText(this,"Open Sesamo!",Toast.LENGTH_LONG).show();//הדפסה של הודעה קצרה צפה על אירוע הלחיצה
// SecretActivity שלח מסר מ אקטיביטי ראשי לאקטיביטי
        Intent intent=new Intent(MainActivity.this,SecretActivity.class );
        startActivity(intent);//שלח!
    }


    public void SaveSecret(View view)
    {


    }

}