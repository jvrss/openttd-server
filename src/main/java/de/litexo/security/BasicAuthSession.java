package de.litexo.security;

import jakarta.ws.rs.core.SecurityContext;
import java.util.UUID;


public class BasicAuthSession {
    private String sessionId = UUID.randomUUID().toString();
    private long lastUpdate;
    private String user;
    private SecurityContext securityContext;

    public String getSessionId() { return sessionId; }

    public long getLastUpdate() { return lastUpdate; }
    public void setLastUpdate(long lastUpdate) { this.lastUpdate = lastUpdate; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public SecurityContext getSecurityContext() { return securityContext; }
    public void setSecurityContext(SecurityContext securityContext) { this.securityContext = securityContext; }
}
