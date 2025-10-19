package org.sus.domain.agendamento.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Agendamento {
    private Long cidadaoId;
    private Long unidadeId;
    private LocalDate data;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;

    public Agendamento(Long cidadaoId, Long unidadeId, LocalDate data, LocalTime horarioInicio, LocalTime horarioFim) {
        this.cidadaoId = cidadaoId;
        this.unidadeId = unidadeId;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(LocalTime horarioFim) {
        this.horarioFim = horarioFim;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento that = (Agendamento) o;
        return Objects.equals(cidadaoId, that.cidadaoId) && Objects.equals(unidadeId, that.unidadeId) && Objects.equals(data, that.data) && Objects.equals(horarioInicio, that.horarioInicio) && Objects.equals(horarioFim, that.horarioFim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidadaoId, unidadeId, data, horarioInicio, horarioFim);
    }
}
