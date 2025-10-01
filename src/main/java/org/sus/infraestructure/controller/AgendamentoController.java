package org.sus.infraestructure.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.sus.domain.agendamento.model.Agendamento;
import org.sus.usecase.AgendaUsuarioUseCase;

@Path("/agendamento")
public class AgendamentoController {

    private final AgendaUsuarioUseCase agendaUsuarioUseCase;

    public AgendamentoController(AgendaUsuarioUseCase agendaUsuarioUseCase){
        this.agendaUsuarioUseCase = agendaUsuarioUseCase;
    };

    @POST
    public void realizaAgendamento(Agendamento agendamento) {
        agendaUsuarioUseCase.execute(agendamento);
    }
}
