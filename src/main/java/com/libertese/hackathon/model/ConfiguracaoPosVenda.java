package com.libertese.hackathon.model;

import javax.persistence.*;

/**
 * @author mpsdantas
 *
 */
@Entity
@Table(name = "pvenda_configuracoes")
public class ConfiguracaoPosVenda {
    /**
     * Serial version uid (default)
     */
    private static final long serialVersionUID = 1L;

    public ConfiguracaoPosVenda(){}

    public ConfiguracaoPosVenda(int tipoDisparo){
        super();
        this.tipoDisparo = tipoDisparo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "tipo_disparo")
    private int tipoDisparo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTipoDisparo() {
        return tipoDisparo;
    }

    public void setTipoDisparo(int tipoDisparo) {
        this.tipoDisparo = tipoDisparo;
    }
}
