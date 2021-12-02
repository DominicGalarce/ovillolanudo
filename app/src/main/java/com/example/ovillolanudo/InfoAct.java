package com.example.ovillolanudo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class InfoAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void whattsapp(View view){
        //Datos para intent de app Whatsapp
        //numero telefono
        String numeroW = "+56974491396";
        //mensaje a enviar
        String mensajeWD = "Hola buenas, me contacto con....";

        //try catch para sacar errores
        try {
            //abrir aplicacion a traves de intent
            Intent iW = new Intent();
            iW.setAction(Intent.ACTION_VIEW);
            //pasamos el uri
            String uri = "whatsapp://send?phone=" + numeroW + "&text=" + mensajeWD;
            iW.setData(Uri.parse(uri));
            startActivity(iW);

        } catch (ActivityNotFoundException e){
            System.out.println(e);
        }
    }
    public void mapsDireccion(View view){
        Intent i = new Intent(Intent.ACTION_VIEW); //accion que abre un navegador
        //parseamos la direccion del link sacado de google maps
        i.setData(Uri.parse("https://www.google.com/maps/place/Vicu%C3%B1a+Mackenna+2585,+Macul,+San+Joaqu%C3%ADn,+Regi%C3%B3n+Metropolitana/@-33.4762003,-70.6253917,17z/data=!3m1!4b1!4m5!3m4!1s0x9662c557c97d7dc5:0xebdeba2cb9e9e94e!8m2!3d-33.4762003!4d-70.623203")); //pasamos con el uri.parse la direccion de la pagina web
        startActivity(i); // iniciamos activity
    }


}