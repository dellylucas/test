package com.dfl9.apptst.View;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dfl9.apptst.R;
import com.dfl9.apptst.View.FragmentAdicion;
import com.dfl9.apptst.View.FragmentConsulta;
import com.dfl9.apptst.View.FragmentElimina;
import com.dfl9.apptst.View.FragmentModifica;

public class DeployActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deploy);

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

       switch (getIntent().getIntExtra("VAL",0)){

           case 1:
               FragmentAdicion ad=new FragmentAdicion();
               fragmentTransaction.add(android.R.id.content,ad);
               break;
           case 2:
               FragmentElimina el=new FragmentElimina();
               fragmentTransaction.add(android.R.id.content,el);
               break;
           case 3:
               FragmentModifica ac=new FragmentModifica();
               fragmentTransaction.add(android.R.id.content,ac);
               break;
           case 4:
               FragmentConsulta co=new FragmentConsulta();
               fragmentTransaction.add(android.R.id.content,co);
               break;

       }
       fragmentTransaction.commit();
    }
}
