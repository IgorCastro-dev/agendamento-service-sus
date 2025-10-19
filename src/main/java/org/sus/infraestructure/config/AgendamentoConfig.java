package org.sus.infraestructure.config;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Produces;
import org.sus.application.gateway.BuscaCidadaoGateway;
import org.sus.application.gateway.EnviaAgendamentoGateway;
import org.sus.application.usecaseimpl.AgendaUsuarioUsecaseImpl;

@ApplicationScoped
public class AgendamentoConfig {

    @Produces
    @ApplicationScoped
    public AgendaUsuarioUsecaseImpl agendaUsuarioUsecaseImpl(
            BuscaCidadaoGateway buscaCidadaoGateway,
            EnviaAgendamentoGateway enviaAgendamentoGateway
    ){
        return new AgendaUsuarioUsecaseImpl(buscaCidadaoGateway, enviaAgendamentoGateway);
    }
}
