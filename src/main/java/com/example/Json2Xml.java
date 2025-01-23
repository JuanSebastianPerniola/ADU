package com.example;

import org.json.JSONObject;
import org.json.XML;

public class Json2Xml {
    // metodo publico que acepta por parametro
    // un obj json y devuelve un cadena de texto formato (xml)
    public String convertirToJsonAxml(String json) {
        try {
            if (json.isBlank() || json.isEmpty()) {
                throw new Exception("Texto no valido");
            }
            JSONObject jsonObject = new JSONObject(json);
            String xml = XML.toString(jsonObject);
            return xml;
        } catch (Exception e) {
            System.out.println("Algo fuera del control de nuestro tecnico a ido mal\n" +
                    "Verifique el contenido del strin o pongase en contacto con soporte");
        }
        return "algo a ido mal";
    }
}
