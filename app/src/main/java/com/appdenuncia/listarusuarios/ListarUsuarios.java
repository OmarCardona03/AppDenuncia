package com.appdenuncia.listarusuarios;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;

import com.appdenuncia.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 30/08/2016.
 */
public class ListarUsuarios extends ListActivity{

    private UsuarioAdapter usuarioAdapter;
    private List<Usuario> listado= new ArrayList<>();

    @Override
    protected void onCreate(Bundle SavedInstanceState){
            super.onCreate(SavedInstanceState);
            setContentView(R.layout.listar_usuarios);

        AsyncCallWS asyn= new AsyncCallWS();
        asyn.execute();

        usuarioAdapter= new UsuarioAdapter(this);
    }

    private class AsyncCallWS extends AsyncTask<String, Void, Void>{
        @Override
        protected Void doInBackground(String... params){

            listado=WebService.listarUsuarios("listarUsuarios");

            return null;
        }

        @Override
        protected void onPostExecute(Void result){

            usuarioAdapter.setLista(listado);
            setListAdapter(usuarioAdapter);
        }

        @Override
        protected void onPreExecute(){
            //Make ProgressBar invisible
            //pg.setVisibility(View.VISIBLE);
        }
        @Override
        protected void onProgressUpdate(Void... values){

        }


    }
}
