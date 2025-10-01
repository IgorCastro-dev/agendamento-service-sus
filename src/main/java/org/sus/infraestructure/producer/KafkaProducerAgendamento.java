package org.sus.infraestructure.producer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.sus.domain.agendamentonotificacao.model.AgendamentoNotificacao;

@ApplicationScoped
public class KafkaProducerAgendamento {
    @Inject
    @Channel("agendamento-notificacao")
    Emitter<AgendamentoNotificacao> emitter;

    public void sendMessage(AgendamentoNotificacao message) {
        emitter.send(message);
    }
}
