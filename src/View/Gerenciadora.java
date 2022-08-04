package View;

import java.util.ArrayList;

public class Gerenciadora {

    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    ;
    
    private ArrayList<Comprador> compradores = new ArrayList();
    
     private ArrayList<Corretora> contratos = new ArrayList();

    public Gerenciadora() {

    }
    
     public boolean salvarContrato(Corretora c) {
        if (c.getIdContrato().equals("")) {

            return false;
        } else {
            System.out.println(c.toString());
            contratos.add(c);
            for (Corretora c1 : contratos) {
                System.out.println(c1.toString());
            }

            return true;
        }
    }
    

    public boolean salvarComprador(Comprador c) {
        if (c.getNome().equals("") || c.getId().equals("")) {

            return false;
        } else {
            System.out.println(c.toString());
            compradores.add(c);
            for (Comprador c1 : compradores) {
                System.out.println(c1.toString());
            }

            return true;
        }
    }

    public boolean salvarVendedor(Vendedor v) {
        if (v.getNome().equals("") || v.getId().equals("")) {

            return false;
        } else {
            System.out.println(v.toString());
            vendedores.add(v);
            for (Vendedor v1 : vendedores) {
                System.out.println(v1.toString());
            }

            return true;
        }
    }

    //criar funcao 
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

    public void printaTudo() {
        System.out.println("Printa tudo");
        for (Vendedor v : vendedores) {
            System.out.println(v.toString());
        }
    }

    public Vendedor buscaCpf(String busca) {

        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor buscado = vendedores.get(i);
            if (buscado.getId().equals(busca)) {
                int pos = i;
                return vendedores.get(i);// abrir outra janela para reescreves todos  os dados talvez
            }
        }
        return null;
    }

    public boolean removerVendedor(String busca) {

        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor buscado = vendedores.get(i);
            if (buscado.getId().equals(busca)) {
                vendedores.remove(i);
                return true;// abrir outra janela para reescreves todos  os dados talvez
            }
        }
        return false;
    }
    
    public boolean removerComprador(String busca) {

        for (int i = 0; i < compradores.size(); i++) {
            Comprador buscado = compradores.get(i);
            if (buscado.getId().equals(busca)) {
                compradores.remove(i);
                return true;// abrir outra janela para reescreves todos  os dados talvez
            }
        }
        return false;
    }

    public boolean buscaCpfComprador(String busca) {
        boolean verifica = false;
        for (int i = 0; i < compradores.size(); i++) {
            Comprador buscado = compradores.get(i);
            if (buscado.getId().equals(busca)) {
                return true;// abrir outra janela para reescreves todos  os dados talvez
            }
        }
        return false;
    }

}
