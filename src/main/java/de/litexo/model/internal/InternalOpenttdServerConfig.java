package de.litexo.model.internal;

import de.litexo.model.external.OpenttdServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InternalOpenttdServerConfig {
    private String path;
    private int autoSaveMinutes = 5;
    private int numberOfAutoSaveFilesToKeep = 10;
    private int numberOfManuallySaveFilesToKeep = 10;

    private String passwordSha256Hash;

    List<OpenttdServer> servers = new ArrayList<>();

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public int getAutoSaveMinutes() { return autoSaveMinutes; }
    public void setAutoSaveMinutes(int autoSaveMinutes) { this.autoSaveMinutes = autoSaveMinutes; }

    public int getNumberOfAutoSaveFilesToKeep() { return numberOfAutoSaveFilesToKeep; }
    public void setNumberOfAutoSaveFilesToKeep(int numberOfAutoSaveFilesToKeep) { this.numberOfAutoSaveFilesToKeep = numberOfAutoSaveFilesToKeep; }

    public int getNumberOfManuallySaveFilesToKeep() { return numberOfManuallySaveFilesToKeep; }
    public void setNumberOfManuallySaveFilesToKeep(int numberOfManuallySaveFilesToKeep) { this.numberOfManuallySaveFilesToKeep = numberOfManuallySaveFilesToKeep; }

    public String getPasswordSha256Hash() { return passwordSha256Hash; }
    public void setPasswordSha256Hash(String passwordSha256Hash) { this.passwordSha256Hash = passwordSha256Hash; }

    public List<OpenttdServer> getServers() { return servers; }
    public void setServers(List<OpenttdServer> servers) { this.servers = servers; }
}
