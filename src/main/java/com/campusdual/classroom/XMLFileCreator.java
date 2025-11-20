package com.campusdual.classroom;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XMLFileCreator {

    private static final String OUTPUT_PATH = "src/main/resources/shoppingList.xml";

    public static void createDocument() {
        File file = new File(OUTPUT_PATH);
        File parent = file.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }

        String ln = System.lineSeparator();
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>").append(ln);
        sb.append("<shoppinglist>").append(ln);
        sb.append("  <items>").append(ln);
        sb.append("    <item quantity=\"2\">Manzana</item>").append(ln);
        sb.append("    <item quantity=\"1\">Leche</item>").append(ln);
        sb.append("    <item quantity=\"3\">Pan</item>").append(ln);
        sb.append("    <item quantity=\"2\">Huevo</item>").append(ln);
        sb.append("    <item quantity=\"1\">Queso</item>").append(ln);
        sb.append("    <item quantity=\"1\">Cereal</item>").append(ln);
        sb.append("    <item quantity=\"4\">Agua</item>").append(ln);
        sb.append("    <item quantity=\"6\">Yogur</item>").append(ln);
        sb.append("    <item quantity=\"2\">Arroz</item>").append(ln);
        sb.append("  </items>").append(ln);
        sb.append("</shoppinglist>").append(ln);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(sb.toString());
        } catch (IOException e) {
            System.out.println("Error al escribir XML: " + e.getMessage());
        }
    }
}