package org.sus.infraestructure.service;

import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.sus.application.gateway.BuscaCidadaoGateway;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.infraestructure.client.CidadaoClient;

public class BuscaCidadaoGatewayImpl implements BuscaCidadaoGateway {

    @Inject
    @RestClient
    public CidadaoClient cidadaoClient;

    @Override
    public Cidadao execute(Long cidadaoId) {
        return cidadaoClient.buscaCidadao(cidadaoId);
    }
}
