package id.ac.poliban.dts.molida.latihan06;

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
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menus, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== R.id.miCherry){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.cherry);
        }

        if (item.getItemId() == R.id.miGuppies){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.guppies);
        }
        if (item.getItemId()== R.id.miMollies){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.mollies);
        }

        if (item.getItemId()== R.id.miNeonTetra){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.neon_tetra);
        }

        if (item.getItemId()== R.id.miOscar){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.oscar);
        }

        if (item.getItemId()== R.id.miPlaties){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.platies);
        }

        if (item.getItemId()== R.id.miZebra){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.zebra_danios);
        }

        return true;

        }



}
