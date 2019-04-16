package com.dfl9.apptst.View;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.dfl9.apptst.Model.Estudiante;
import com.dfl9.apptst.R;
import com.dfl9.apptst.ViewModel.AdapterPerson;

import java.util.ArrayList;

public class FragmentConsulta extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_consulta,container,false);
        ArrayList<Estudiante> lista= new ArrayList<>();

        lista.add(new Estudiante("121","IED ernesto",5,"222","Fabian"));
        lista.add(new Estudiante("122","IED ernesto",5,"223","Fabiansit"));

        AdapterPerson adp = new AdapterPerson(lista);

        ListView liView = view.findViewById(R.id.listItems);

        liView.setAdapter(adp);

        return view;
    }
}
