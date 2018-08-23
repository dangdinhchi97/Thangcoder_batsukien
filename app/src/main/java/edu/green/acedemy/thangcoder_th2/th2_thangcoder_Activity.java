package edu.green.acedemy.thangcoder_th2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class th2_thangcoder_Activity extends AppCompatActivity {
    private EditText eta;
    private EditText etb;
    private Button bta_c_b;
    private int a,b;
    private int kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th2_thangcoder_);
        eta=(EditText)findViewById(R.id.eta);
        etb=(EditText)findViewById(R.id.etb);
        bta_c_b=(Button)findViewById(R.id.bta_c_b);
        bta_c_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(!eta.getText().toString().equalsIgnoreCase("")&&!etb.getText().toString().equalsIgnoreCase(""))
                 {
                a=Integer.parseInt( eta.getText().toString());
                b=Integer.parseInt(etb.getText().toString());
                kq=a+b;
                Toast.makeText(th2_thangcoder_Activity.this,"ket qua cua"+a+"+"+b+"la:"+kq,Toast.LENGTH_SHORT).show();
            }else {
                    Toast.makeText(th2_thangcoder_Activity.this,"Du lieu nhap vao khong hop le",Toast.LENGTH_SHORT).show();
                 }
            }

        });
        bta_c_b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(th2_thangcoder_Activity.this,"Bam lau qua tao met ",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
