package com.example.sodm.ejerciciolistados;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sodm.ejerciciolistados.model.Alumno;

import java.util.List;

/**
 * Created by sodm on 4/28/2017.
 */

public class ListadoAlumnosAdapter extends BaseAdapter{

    private List<Alumno> mAlumnos;
    private LayoutInflater mInflater;

    public ListadoAlumnosAdapter(Context context,List<Alumno> alumnos){
        mAlumnos=alumnos;
        mInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mAlumnos.size();
    }

    @Override
    public Object getItem(int i) {
        mAlumnos.get(i);
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewholder;
        if (view==null){

            view = mInflater.inflate(R.layout.item_alumnos,viewGroup,false);

            viewholder=new ViewHolder();
            viewholder.tviNombreAlumno= (TextView) view.findViewById(R.id.tviNombreAlumno);
            view.setTag(viewholder);
        }else{
            viewholder=(ViewHolder) view.getTag();
        }

       Alumno alumno=mAlumnos.get(i);
        viewholder.tviNombreAlumno.setText(alumno.getNombre());
        return view;
    }

    class ViewHolder{
        TextView tviNombreAlumno;
    }


}
