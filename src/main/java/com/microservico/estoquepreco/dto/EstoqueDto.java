package com.microservico.estoquepreco.dto;

import java.io.Serializable;
public record EstoqueDto(String codigoproduto, Integer quantidade) implements Serializable{
    
}
