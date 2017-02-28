package com.blooms.kingsite.framework.core.exceptions;

public class VitamineException extends RuntimeException {
    private static final long serialVersionUID = -1441302146078538240L;

    public VitamineException() {
        super();
    }

    public VitamineException(String message) {
        super(message);
    }

    public VitamineException(Throwable cause) {
        super(cause);
    }

    public VitamineException(String message, Throwable cause) {
        super(message, cause);
    }
}
