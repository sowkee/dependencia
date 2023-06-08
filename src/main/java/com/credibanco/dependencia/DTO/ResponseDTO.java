package com.credibanco.dependencia.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

@Component
public class ResponseDTO extends RequestDTO {
    @JsonIgnore
    private String userPassword;
}
