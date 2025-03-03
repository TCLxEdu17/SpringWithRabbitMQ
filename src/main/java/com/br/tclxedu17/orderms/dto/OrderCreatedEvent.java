package com.br.tclxedu17.orderms.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrdemItemEvent> itens) {
}
