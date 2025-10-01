package org.sus.application.usecaseimpl;


import org.sus.application.gateway.BuscaCidadaoGateway;
import org.sus.application.gateway.EnviaAgendamentoGateway;
import org.sus.domain.agendamento.model.Agendamento;
import org.sus.domain.agendamentonotificacao.model.AgendamentoNotificacao;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.usecase.AgendaUsuarioUseCase;


public class AgendaUsuarioUsecaseImpl implements AgendaUsuarioUseCase {
    private BuscaCidadaoGateway buscaCidadaoGateway;
    private EnviaAgendamentoGateway enviaAgendamentoGateway;

    public AgendaUsuarioUsecaseImpl(BuscaCidadaoGateway buscaCidadaoGateway, EnviaAgendamentoGateway enviaAgendamentoGateway) {
        this.buscaCidadaoGateway = buscaCidadaoGateway;
        this.enviaAgendamentoGateway = enviaAgendamentoGateway;
    }

    @Override
    public void execute(Agendamento agendamento) {
        Cidadao cidadao = buscaCidadaoGateway.execute( agendamento.getCidadaoId() );
        AgendamentoNotificacao agendamentoNotificacao = new AgendamentoNotificacao(cidadao.getEmail(), agendamento.getUnidadeId());
        enviaAgendamentoGateway.execute(agendamentoNotificacao);
    }


}
