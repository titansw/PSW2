
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ra21506739
 */
public class Pedido {
    private String Molho;
    private String Massa;
    private List<String> Ingredientes;

    public String getMolho() {
        return Molho;
    }

    public void setMolho(String Molho) {
        this.Molho = Molho;
    }

    public String getMassa() {
        return Massa;
    }

    public void setMassa(String Massa) {
        this.Massa = Massa;
    }

    public List<String> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(List<String> Ingrediente) {
        this.Ingredientes = Ingrediente;
    }
    
}
