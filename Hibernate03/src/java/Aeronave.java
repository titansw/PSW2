
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ra21506739
 */
@Entity
public class Aeronave {
    @Id
    private int matricula;
    private String nome_aeronave;
    private int horas_de_voo;
    private int quantidade_pousos;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome_aeronave() {
        return nome_aeronave;
    }

    public void setNome_aeronave(String nome_aeronave) {
        this.nome_aeronave = nome_aeronave;
    }

    public int getHoras_de_voo() {
        return horas_de_voo;
    }

    public void setHoras_de_voo(int horas_de_voo) {
        this.horas_de_voo = horas_de_voo;
    }

    public int getQuantidade_pousos() {
        return quantidade_pousos;
    }

    public void setQuantidade_pousos(int quantidade_pousos) {
        this.quantidade_pousos = quantidade_pousos;
    }

}
