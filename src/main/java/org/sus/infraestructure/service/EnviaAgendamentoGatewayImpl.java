package org.sus.infraestructure.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.sus.application.gateway.EnviaAgendamentoGateway;
import org.sus.domain.agendamentonotificacao.model.AgendamentoNotificacao;
import org.sus.infraestructure.producer.KafkaProducerAgendamento;

@ApplicationScoped
public class EnviaAgendamentoGatewayImpl implements EnviaAgendamentoGateway {

    @Inject
    KafkaProducerAgendamento producer;

    @Override
    public void execute(AgendamentoNotificacao agendamentoNotificacao) {
        producer.sendMessage(agendamentoNotificacao);
    }
}
