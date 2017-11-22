package model;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author BobaNote
 */
@Entity
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    @Column(length = 20)
    private String nome;
    @Column(length = 70)
    private String descricao;
    @Column(length = 3)
    private int duracao;
    @OneToOne 
    private Professor professor;   
    @Column(length = 6)
    private String intensidade;
    
    @OneToMany
    private List<Exercicio> exercicios;

    public Treino() {
    }

    public Treino(String nome, String descricao, int duracao, Professor professor, String intensidade, List<Exercicio> exercicios) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.professor = professor;
        this.intensidade = intensidade;
        this.exercicios = exercicios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
    




}
