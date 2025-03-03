package com.br.tclxedu17.orderms.dto;

import java.math.BigDecimal;

public record OrdemItemEvent(String produto,
                             Integer quantidade,
                             BigDecimal preco) {
}
