package testmtg.apimtg.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="TB_Lista_Cartas")
public class ListaCartas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @NotNull
    private String nome;

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

    @Override
    public String toString() {
        return "ListaCartas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
