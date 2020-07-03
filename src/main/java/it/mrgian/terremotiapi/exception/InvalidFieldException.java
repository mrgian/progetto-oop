package it.mrgian.terremotiapi.exception;

import java.util.HashMap;

import it.mrgian.terremotiapi.utils.JsonUtils;

/**
 * Eccezione generata quando il parametro passato non è valido
 */
public class InvalidFieldException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidFieldException(String message) {
        super(message);
    }

    public String getJsonMessage() {
        HashMap<String, Object> errorMap = new HashMap<String, Object>();
        errorMap.put("errore", getMessage());
        return JsonUtils.mapToJson(errorMap);
    }
}