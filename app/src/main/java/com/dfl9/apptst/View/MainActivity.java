package com.dfl9.apptst.View;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dfl9.apptst.R;

public class MainActivity extends AppCompatActivity {
   private Intent inte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inte = new Intent(this, DeployActivity.class);
      /*  SharedPreferences preferencia= PreferenceManager.getDefaultSharedPreferences(this);
SharedPreferences.Editor edit= preferencia.edit();
edit.putString("hola","value holass");
edit.apply();

--
*/
    /*  SharedPreferences p1= getSharedPreferences(nombre,valor)
              p1.getString(nombre."0")*/
/*
        SharedPreferences preferencia= PreferenceManager.getDefaultSharedPreferences(this);
       String ass= preferencia.getString("hola","0");

 */
    }

    public void consuList(View vista) {
        inte.putExtra("VAL",4);
        startActivity(inte);
    }
    public void agreList(View vista) {
        inte.putExtra("VAL",1);
        startActivity(inte);
    }
    public void elimList(View vista) {
        inte.putExtra("VAL",2);
        startActivity(inte);
    }
    public void actList(View vista) {
        inte.putExtra("VAL",3);
        startActivity(inte);
    }
}

