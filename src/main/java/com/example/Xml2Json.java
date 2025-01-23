package com.example;

import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;

public class Xml2Json {
    public String convertirXmlAJson(String xml){
        try {
            JSONObject jsonJsObject = XML.toJSONObject(xml);
            String jsonPrettyString =  jsonJsObject.toString(4);
            return jsonPrettyString;
        } catch (JSONException e) {
            System.out.println("Texto no valido");
        }
        return "Algo de ejemplo";
    }
}