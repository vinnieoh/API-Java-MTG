package testmtg.apimtg.model;

import com.sun.istack.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;


@Entity
@Table(name="TB_Carta")

public class Carta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @NotNull
    private String nome;

    @NotNull
    private String edicao;

    @NotNull
    private String idioma;

    @NotNull
    private Boolean foil;

    @NotNull
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "lista_cartas_id")
    private ListaCartas listaCartas;


    public ListaCartas getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ListaCartas listaCartas) {
        this.listaCartas = listaCartas;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Boolean getFoil() {
        return foil;
    }

    public void setFoil(Boolean foil) {
        this.foil = foil;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", edicao='" + edicao + '\'' +
                ", idioma='" + idioma + '\'' +
                ", foil=" + foil +
                ", preco=" + preco +
                '}';
    }
}
