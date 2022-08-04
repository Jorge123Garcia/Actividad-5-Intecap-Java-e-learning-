/*
 Programa que permite escribir y leer archivos de texto.
 */

package com.mycompany.archivo;

import java.io.*;

public class Archivo {

    public void escritura(String doc, String texto boolean sobreescritura){
    try{
    FileWriter archivo = new FileWriter(doc+".txt", sobreescritura);
    BufferedWriter flujo = new BufferedWriter(archivo);
    PrintWriter escribir = new PrintWriter(flujo);
    escribir.println(texto);
    escribir.flush();
    
    } catch (Exception e){
    System.err.println("No se puede escribir " + e.getMessage());
    }
    }
    public static void main(String[] args) {
       Archivo arch = new Archivo();
       arch.escritura("Documento", "Texto nuevo", true);
       System.out.println(arch.leer("Documento"));
    }
}

publick String leer(String documento){
String datos = ""; 
String salida = "";
try{
FileReader archivo = new FileReader(documento + ".txt");
BufferedReader flujo = new BufferedReader (archivo);

while((salida = flujo.readLine())!=null) {
datos += salida+ "";
}
}catch (Exception e){
System.err.println("No se puede leer " +e.getMessage());
}
return datos;
}