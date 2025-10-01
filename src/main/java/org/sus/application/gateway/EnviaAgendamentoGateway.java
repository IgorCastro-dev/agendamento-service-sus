package org.sus.application.gateway;

import org.sus.domain.agendamento.model.Agendamento;
import org.sus.domain.agendamentonotificacao.model.AgendamentoNotificacao;

public interface EnviaAgendamentoGateway {
    void execute(AgendamentoNotificacao agendamentoNotificacao);
}
