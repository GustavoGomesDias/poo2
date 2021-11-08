
package leitura;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();
        String current = new java.io.File( "." ).getCanonicalPath();
        File inputFile = new File(current + "\\src\\arquivo.csv");
        FileReader in = new FileReader(inputFile);

        int c = in.read();
        String inputData = "";
        while (c != -1) {
          inputData += (char) c;
          c = in.read();
        }

        in.close();
        String[] arrData =  inputData.split("\n");
        ArrayList<String[]> data = new ArrayList<String[]>();
        for (int i = 1; i < arrData.length; i++) {
          data.add(arrData[i].split(";"));
       }

        for (String[] s : data) {
          Cliente cliente = new Cliente();
          for (int i = 0; i < s.length; i++) {
            if (i == 0) cliente.setId(s[i]);
            if (i == 1) cliente.setNome(s[i]);
            if (i == 2) cliente.setEmail(s[i]);
            if (i == 4) cliente.setTelefone(s[i]);
            if (i == 5) cliente.setTotalCompras(Double.parseDouble(s[i]));
          }

          clientes.add(cliente);
       }

        return clientes;
     }
}
