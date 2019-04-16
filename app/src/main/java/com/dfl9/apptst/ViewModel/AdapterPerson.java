package com.dfl9.apptst.ViewModel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dfl9.apptst.Model.Estudiante;
import com.dfl9.apptst.R;

import java.util.List;

public class AdapterPerson extends BaseAdapter {

    private List<Estudiante> ListPerson;

    public AdapterPerson(List<Estudiante> listPerson) {
        ListPerson = listPerson;
    }

    @Override
    public int getCount() {

        return ListPerson.size();
    }

    @Override
    public Estudiante getItem(int position) {

        return ListPerson.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inf = LayoutInflater.from(parent.getContext());
        if (convertView == null) {
            convertView= inf.inflate(R.layout.adapter_person,null);
        }
        TextView id = convertView.findViewById(R.id.IdLb);
        TextView nom = convertView.findViewById(R.id.nameLb);
        TextView cod = convertView.findViewById(R.id.codLb);
        TextView col = convertView.findViewById(R.id.ColLb);
        TextView prom = convertView.findViewById(R.id.PromLb);
        ImageView img = convertView.findViewById(R.id.imgList);

        id.setText(getItem(position).getId());
        nom.setText(getItem(position).getNombre());
        cod.setText(getItem(position).getCod());
        col.setText(getItem(position).getColegio());
        prom.setText(String.valueOf(getItem(position).getPromedio()));
        img.setImageResource(R.mipmap.ic_launcher);


        return convertView;
    }
}
