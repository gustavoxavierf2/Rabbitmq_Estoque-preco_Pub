package com.microservico.estoquepreco.dto;

import java.io.Serializable;
public record PrecoDto(String codigoproduto, Integer preco) implements Serializable{
    
}
