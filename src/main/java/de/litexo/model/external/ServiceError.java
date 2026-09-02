package de.litexo.model.external;

public class ServiceError {
    ServiceErrorType type;
    String message;
    String stackTrace;

    public ServiceErrorType getType() { return type; }
    public void setType(ServiceErrorType type) { this.type = type; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getStackTrace() { return stackTrace; }
    public void setStackTrace(String stackTrace) { this.stackTrace = stackTrace; }
}
