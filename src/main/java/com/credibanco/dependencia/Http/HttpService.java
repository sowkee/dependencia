package com.credibanco.dependencia.Http;

import com.credibanco.dependencia.DTO.RequestDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

public class HttpService {
    public static HttpEntity getHttpEntity(RequestDTO requestDTO) {
        return new HttpEntity(requestDTO, getHttpHeadersJson());
    }

    public static HttpHeaders getHttpHeadersJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type", "application/json");
        headers.add("Accept", "application/json");
        return headers;
    }
}
