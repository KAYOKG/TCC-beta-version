package View;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Gerenciadora {

    private ArrayList<Vendedor> vendedores;

    private ArrayList<Comprador> compradores;

    private ArrayList<Corretora> contratos;

    public Gerenciadora() {
        compradores = binarioComprador();
        
        vendedores = binarioVendedores();
        
        contratos = binarioContratos();

        if (compradores == null) {
            compradores = new ArrayList<>();
        }
        if (vendedores == null) {
            vendedores = new ArrayList<>();
        }
        if (contratos == null) {
            contratos = new ArrayList<>();
        }
    }

    //gera txt
    
    public void relatorioContratos() {
        try {

            FileWriter dadosContratos = new FileWriter("Relatorio_Contratos.txt");

            try ( PrintWriter escreveContratos = new PrintWriter(dadosContratos)) {

                for (Corretora c : contratos) {
                    escreveContratos.println(c);

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    //load binario

    public ArrayList<Comprador> binarioComprador() {
        try {
            ArrayList<Comprador> c1;
            try ( ObjectInputStream arqCompradores
                    = new ObjectInputStream(new FileInputStream("CompradoresDados"))) {
                c1 = (ArrayList<Comprador>) arqCompradores.readObject();
            }
            return c1;
        } catch (IOException | ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }
        return null;
    }

    public void salvabinarioComprador() {
        try {

            try ( ObjectOutputStream arqCompradores
                    = new ObjectOutputStream(new FileOutputStream("CompradoresDados"))) {
                arqCompradores.writeObject(compradores);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }
    
     public ArrayList<Vendedor> binarioVendedores() {
        try {
                ArrayList<Vendedor> v1;
                try ( ObjectInputStream arqVendedores
                    = new ObjectInputStream(new FileInputStream("VendedoresDados"))) {
                v1 = (ArrayList<Vendedor>) arqVendedores.readObject();
            }
            return v1;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public void salvabinarioVendedor() {
        try {
            try (ObjectOutputStream arqVendedores
                    = new ObjectOutputStream(new FileOutputStream("VendedoresDados"))) {
                arqVendedores.writeObject(vendedores);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
    
       public ArrayList<Corretora> binarioContratos() {
        try {
                ArrayList<Corretora> c1;
                try ( ObjectInputStream arqContratos
                    = new ObjectInputStream(new FileInputStream("ContratosDados"))) {
                c1 = (ArrayList<Corretora>) arqContratos.readObject();
            }
            return c1;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public void salvabinarioContratos() {
        try {
            try (ObjectOutputStream arqContratos
                    = new ObjectOutputStream(new FileOutputStream("ContratosDados"))) {
                arqContratos.writeObject(contratos);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }


    public void salvarContrato(Corretora c) {

        contratos.add(c);
        
        for (Corretora c1 : contratos) {
            System.out.println(c1.toString());
        }
    }

    public void salvarComprador(Comprador c) {
      
        compradores.add(c);
        
        for (Comprador c1 : compradores) {
            System.out.println(c1.toString());
        }
    }

    public void salvarVendedor(Vendedor v) {
       
        vendedores.add(v);
        
        for (Vendedor v1 : vendedores) {
            System.out.println(v1.toString());
        }
    }

    public Vendedor consultaVendedor(String busca) {
        for (Vendedor v : vendedores) {
            if (v.getId().equals(busca)) {
                return v;
            }
        }
        return null;

    }

    public Comprador consultaComprador(String busca) {
        for (Comprador c : compradores) {
            if (c.getId().equals(busca)) {
                return c;
            }
        }
        return null;

    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public ArrayList<Corretora> getContratos() {
        return contratos;
    }

    public Vendedor buscaCpf(String busca) {

        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor buscado = vendedores.get(i);
            if (buscado.getId().equals(busca)) {
             
                return vendedores.get(i);
            }
        }
        return null;
    }
    
      public Corretora buscaContrato(String busca) {

        for (int i = 0; i < contratos.size(); i++) {
            Corretora buscado = contratos.get(i);
            if (buscado.getIdContrato().equals(busca)) {
             
                return contratos.get(i);
            }
        }
        return null;
    }
      
       public boolean removerContrato(String busca) {

        for (int i = 0; i < contratos.size(); i++) {
             Corretora buscado = contratos.get(i);
            if (buscado.getIdContrato().equals(busca)) {
                contratos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean removerVendedor(String busca) {

        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor buscado = vendedores.get(i);
            if (buscado.getId().equals(busca)) {
                vendedores.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean removerComprador(String busca) {

        for (int i = 0; i < compradores.size(); i++) {
            Comprador buscado = compradores.get(i);
            if (buscado.getId().equals(busca)) {
                compradores.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean buscaCpfComprador(String busca) {
       
        for (int i = 0; i < compradores.size(); i++) {
            Comprador buscado = compradores.get(i);
            if (buscado.getId().equals(busca)) {
                return true;

            }
        }
        return false;
    }
    
    public boolean alterarContrato(Corretora c) {
       
        for(int i = 0; i < contratos.size(); i++){
            Corretora con = contratos.get(i);
            if(c.getIdContrato().equals(con.getIdContrato())){  
                
                contratos.set(i, c);      
                return true;
            }
        }
        return false;
    }
    
    

}
