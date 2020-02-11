package id.ac.poliban.mi.maisarah.android_lat06;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //membuat object inflater
        MenuInflater inflater = getMenuInflater();
        //Menampilkan menu ke object inflater
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.miCherryBarb) {
            View view = this.getWindow().getDecorView();
            //Terlihat file gambar cherr_barb sebgai
            //hasil import android drawable importer
            //dikenali dalam source code kita
            view.setBackgroundResource(R.drawable.cherry_barb);
        }

        if (item.getItemId() == R.id.miGuppies) {
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.guppies);
        }

        if (item.getItemId() == R.id.miMollies) {
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.mollies);
        }

        if (item.getItemId() == R.id.miOscar) {
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.oscar);
        }

        if (item.getItemId() == R.id.miPlates) {
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.plates);
        }

        if (item.getItemId() == R.id.miZebraDanios) {
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.zebra_danios);
        }

        if (item.getItemId() == R.id.miPearlGourami) {
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.pearl_gourami);
        }
        return true;
    }
}
