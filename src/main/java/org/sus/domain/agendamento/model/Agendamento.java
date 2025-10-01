package org.sus.domain.agendamento.model;

import org.sus.domain.cidadao.model.Cidadao;

import java.util.Objects;

public class Agendamento {
    Long cidadaoId;
    Long unidadeId;

    public Agendamento(Long cidadaoId, Long unidadeId) {
        this.cidadaoId = cidadaoId;
        this.unidadeId = unidadeId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento that = (Agendamento) o;
        return Objects.equals(cidadaoId, that.cidadaoId) && Objects.equals(unidadeId, that.unidadeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidadaoId, unidadeId);
    }

    public Long getCidadaoId() {
        return cidadaoId;
    }

    public void setCidadaoId(Long cidadaoId) {
        this.cidadaoId = cidadaoId;
    }

    public Long getUnidadeId() {
        return unidadeId;
    }

    public void setUnidadeId(Long unidadeId) {
        this.unidadeId = unidadeId;
    }
}
