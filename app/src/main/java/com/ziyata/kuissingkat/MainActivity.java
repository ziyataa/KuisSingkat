package com.ziyata.kuissingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout mlinePilGan, mLineEssay;	//variabel baru bertipe LinearLayout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan variabel pada MainActivity.java dengan id pada activity_main
        //pastikan tipe data variabel dengan view id sama
        mlinePilGan = (LinearLayout) findViewById(R.id.linePilGan);
        mLineEssay = (LinearLayout) findViewById(R.id.lineEssay);

        //memberi aksi ketika diklik
        mlinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisPilihaGanda
                Intent i = new Intent(MainActivity.this, KuisPilihanGanda.class);
                startActivity(i); //jalankan Intent
            }
        });

        mLineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisEssay
                Intent i = new Intent(MainActivity.this, KuisEssay.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case R.id.About:
                Intent pindah = new Intent(this, About.class);
                startActivity(pindah);
                break;
            case R.id.Profile:
                pindah = new Intent(this, Profile.class);
                startActivity(pindah);
        }
        return super.onOptionsItemSelected(item);
    }

}