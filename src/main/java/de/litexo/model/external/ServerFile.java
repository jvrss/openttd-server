package de.litexo.model.external;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServerFile {

    private String ownerId;
    private String ownerName;
    private String path;
    private String name;
    private ServerFileType type;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private boolean exists = true;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long created;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long lastModified;

    public String getOwnerId() { return ownerId; }
    public ServerFile setOwnerId(String ownerId) { this.ownerId = ownerId; return this; }

    public String getOwnerName() { return ownerName; }
    public ServerFile setOwnerName(String ownerName) { this.ownerName = ownerName; return this; }

    public String getPath() { return path; }
    public ServerFile setPath(String path) { this.path = path; return this; }

    public String getName() { return name; }
    public ServerFile setName(String name) { this.name = name; return this; }

    public ServerFileType getType() { return type; }
    public ServerFile setType(ServerFileType type) { this.type = type; return this; }

    public boolean isExists() { return exists; }
    public ServerFile setExists(boolean exists) { this.exists = exists; return this; }

    public long getCreated() { return created; }
    public ServerFile setCreated(long created) { this.created = created; return this; }

    public long getLastModified() { return lastModified; }
    public ServerFile setLastModified(long lastModified) { this.lastModified = lastModified; return this; }
}
