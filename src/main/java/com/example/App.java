package com.example;

import java.io.File;
import java.io.FileWriter;

/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {
        String xml = "<marihuana>\r\n" + //
                "    <aspectos>\r\n" + //
                "        <aspecto>\r\n" + //
                "            <nombre>Uso medicinal</nombre>\r\n" + //
                "            <descripcion>La marihuana puede ser utilizada para tratar dolores crónicos, náuseas asociadas a la quimioterapia y ciertas condiciones como la epilepsia.</descripcion>\r\n"
                + //
                "        </aspecto>\r\n" + //
                "        <aspecto>\r\n" + //
                "            <nombre>Relajación</nombre>\r\n" + //
                "            <descripcion>En pequeñas dosis, puede promover la relajación y ayudar a reducir el estrés y la ansiedad.</descripcion>\r\n"
                + //
                "        </aspecto>\r\n" + //
                "        <aspecto>\r\n" + //
                "            <nombre>Industria sostenible</nombre>\r\n" + //
                "            <descripcion>El cáñamo, una variedad de cannabis, puede ser utilizado para producir papel, textiles, bioplásticos y materiales de construcción de forma sostenible.</descripcion>\r\n"
                + //
                "        </aspecto>\r\n" + //
                "        <aspecto>\r\n" + //
                "            <nombre>Regulación y economía</nombre>\r\n" + //
                "            <descripcion>La regulación de la marihuana en algunos países ha generado ingresos fiscales significativos y reducido el mercado negro.</descripcion>\r\n"
                + //
                "        </aspecto>\r\n" + //
                "        <aspecto>\r\n" + //
                "            <nombre>Investigación científica</nombre>\r\n" + //
                "            <descripcion>La marihuana está siendo estudiada ampliamente para entender mejor su impacto en la salud y cómo puede ser utilizada de manera segura y eficaz.</descripcion>\r\n"
                + //
                "        </aspecto>\r\n" + //
                "    </aspectos>\r\n" + //
                "</marihuana>\r\n";

        String json = "{\"amorPorJoselu\":{\"nombre\":\"Joselu\",\"razones\":[{\"titulo\":\"Amistad incondicional\",\"descripcion\":\"Siempre está ahí cuando lo necesito, ofreciendo su apoyo y comprensión sin dudarlo.\"},{\"titulo\":\"Sentido del humor\",\"descripcion\":\"Me hace reír incluso en los momentos más difíciles, con su ingenio y carisma únicos.\"},{\"titulo\":\"Generosidad\",\"descripcion\":\"Tiene un corazón enorme y siempre está dispuesto a ayudar a los demás, sin esperar nada a cambio.\"},{\"titulo\":\"Compañía especial\",\"descripcion\":\"Cada momento que paso con él es único, lleno de conversaciones profundas y memorias inolvidables.\"},{\"titulo\":\"Inspiración\",\"descripcion\":\"Me motiva a ser mejor persona con su dedicación, esfuerzo y forma de ver la vida.\"}],\"mensajeFinal\":\"Joselu, eres una persona increíble y no hay palabras suficientes para describir lo mucho que te quiero y valoro.\"}}";

        // Xml to json
        Xml2Json xml2Json = new Xml2Json();
        System.out.println(xml2Json.convertirXmlAJson(xml)); // anda puedo hacer un sout de un metodo
        // Json to xml
        Json2Xml json2Xml = new Json2Xml();
        System.out.println(json2Xml.convertirToJsonAxml(json));
        // Creacion de ficheros
        MetodoParaTranformarFicheros(xml, json);
    }

    private static void MetodoParaTranformarFicheros(String xml, String json) {
        try {
            // creamos arhchivos
            File fileXML = new File("src\\FolderParaGuardarArchivos\\DeJsonAXML.xml");
            File fileJson = new File("src\\FolderParaGuardarArchivos\\DeJsonAXML.json");
            FileWriter fileWriterXML = new FileWriter(fileXML);
            FileWriter fileWriterJson = new FileWriter(fileJson);
            // escribimos en los archivos
            fileWriterXML.write(xml);
            fileWriterJson.write(json);
            // cerramos los archivos
            fileWriterXML.close();
            fileWriterJson.close();
        } catch (Exception e) {
            System.out.println("Algo fuera del control de nuestro tecnico a ido mal\n" +
                    "Verifique el contenido del strin o pongase en contacto con soporte");
        }
    }
}
