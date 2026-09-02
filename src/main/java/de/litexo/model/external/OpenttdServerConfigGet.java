package de.litexo.model.external;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OpenttdServerConfigGet {
    private int autoSaveMinutes;
    private int numberOfAutoSaveFilesToKeep;
    private int numberOfManuallySaveFilesToKeep;
    List<OpenttdServer> servers = new ArrayList<>();

    public int getAutoSaveMinutes() { return autoSaveMinutes; }
    public void setAutoSaveMinutes(int autoSaveMinutes) { this.autoSaveMinutes = autoSaveMinutes; }

    public int getNumberOfAutoSaveFilesToKeep() { return numberOfAutoSaveFilesToKeep; }
    public void setNumberOfAutoSaveFilesToKeep(int numberOfAutoSaveFilesToKeep) { this.numberOfAutoSaveFilesToKeep = numberOfAutoSaveFilesToKeep; }

    public int getNumberOfManuallySaveFilesToKeep() { return numberOfManuallySaveFilesToKeep; }
    public void setNumberOfManuallySaveFilesToKeep(int numberOfManuallySaveFilesToKeep) { this.numberOfManuallySaveFilesToKeep = numberOfManuallySaveFilesToKeep; }

    public List<OpenttdServer> getServers() { return servers; }
    public void setServers(List<OpenttdServer> servers) { this.servers = servers; }
}
