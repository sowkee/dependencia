package com.credibanco.dependencia.Utils;

import com.credibanco.dependencia.DTO.RequestDTO;

import java.util.Collections;

public class AsteriskLogicCard {
    public static String addAsteristk(RequestDTO requestDTO) {
        if (requestDTO.getCardNumber() != null && requestDTO.getCardNumber().length() > 4) {
            int stringLength = requestDTO.getCardNumber().length();
            int longitud = stringLength - 4;
            return String.format("%s%s%s", requestDTO.getCardNumber().substring(0, 2),
                    String.join("", Collections.nCopies(longitud, "*")), requestDTO.getCardNumber().substring(stringLength - 2, stringLength));
        }
        return null;
    }
}
