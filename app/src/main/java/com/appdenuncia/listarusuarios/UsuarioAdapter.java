package com.appdenuncia.listarusuarios;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.appdenuncia.entidades.Usuario;

import java.util.List;

/**
 * Created by usuario on 30/08/2016.
 */
public class UsuarioAdapter extends BaseAdapter {

    private final Activity actividad;
    public List<Usuario> lista;

    public UsuarioAdapter(Activity actividad) {
        this.actividad = actividad;
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater=actividad.getLayoutInflater();

        View vista=inflater.inflate(R.layout.elemento_usuario, null, true);

        TextView txtCodigo=(TextView) vista.findViewById(R.id.txtCodigo);
        txtCodigo.setText(lista.get(i).getLogin().toString());

        TextView txtNombre=(TextView) vista.findViewById(R.id.txtNombre);
        txtNombre.setText(lista.get(i).getNombreCompleto());

        return vista;
    }
}
