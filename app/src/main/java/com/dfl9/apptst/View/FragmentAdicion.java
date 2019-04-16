package com.dfl9.apptst.View;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dfl9.apptst.R;

import java.util.Objects;


public class FragmentAdicion extends Fragment implements View.OnClickListener{
    private EditText codi;
    private EditText prom;
    private EditText cole;
    private EditText cedu;
    private EditText nomb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adicion,container,false);
        codi= view.findViewById(R.id.codIn);
        prom=view.findViewById(R.id.colegioIn);
        cole=view.findViewById(R.id.promedioIn);
        cedu=view.findViewById(R.id.idIn);
        nomb=view.findViewById(R.id.nombreIn);
        Button upButton = view.findViewById(R.id.insertBut);
        upButton.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.insertBut:
                Toast.makeText(v.getContext(),
                        codi.getText()+" "+
                                prom.getText()+" "+
                                cole.getText()+" "+
                                cedu.getText()+" "+
                                nomb.getText(),Toast.LENGTH_LONG).show();
                break;
        }
    }
}
