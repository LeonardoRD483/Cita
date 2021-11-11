package com.example.cm.resource;


import com.example.cm.application.command.CitaCatalogCommand;
import com.example.cm.application.domain.model.Cita;
import com.example.cm.application.factory.CitaCatalogFactory;
import com.example.cm.resource.mapper.CitaRequestMapper;
import com.example.cm.resource.model.CitaRequest;
import com.example.cm.resource.model.CitaResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CitaController {


    private CitaCatalogFactory citaCatalogFactory;

    @PostMapping("/cita")
    public ResponseEntity<CitaResponse> CreateCita(
            @RequestBody CitaRequest citaRequest){

    log.info("Creating cita, title {}", citaRequest.getTitulo());
    Cita cita = CitaRequestMapper.MAPPER.map(citaRequest);
    CitaCatalogCommand citaCatalogCommand = citaCatalogFactory.getCitaCatalogCommand();
    Long citaId = citaCatalogCommand.addCita(cita);

    CitaResponse citaResponse = new CitaResponse(citaId);
    return new ResponseEntity<>(citaResponse , HttpStatus.CREATED);
    }


}
