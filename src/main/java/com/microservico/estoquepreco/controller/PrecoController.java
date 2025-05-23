package com.microservico.estoquepreco.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservico.estoquepreco.contantes.RabbitmqConstantes;
import com.microservico.estoquepreco.dto.PrecoDto;
import com.microservico.estoquepreco.service.RabbitmqService;

@RestController
@RequestMapping(value = "preco")
public class PrecoController {

  @Autowired
  private RabbitmqService rabbitmqService;

  @PutMapping
  private ResponseEntity alteraPreco(@RequestBody PrecoDto precoDto){
    this.rabbitmqService.enviaMensagem(RabbitmqConstantes.FILA_PRECO, precoDto);
    return new ResponseEntity(HttpStatus.OK);
  }
}