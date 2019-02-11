/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letturaescritturaxml;

/**
 *
 * @author zancanella_alessandr
 */
public class Circolari {
    String data;
    String titolo;
    String Tipo;
    String link;

    public Circolari(String data, String titolo, String Tipo, String link) {
        this.data = data;
        this.titolo = titolo;
        this.Tipo = Tipo;
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getLink() {
        return link;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
}
