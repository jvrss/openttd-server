package de.litexo.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.litexo.OpenttdProcess;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenttdServer {

    private String id = UUID.randomUUID().toString();
    private String name = null;
    private String password = null;
    private String adminPassword = null;
    private Integer serverAdminPort = null;
    private Integer port = null;
    private ServerFile saveGame = null;
    private ServerFile openttdConfig = null;
    private ServerFile openttdPrivateConfig = null;
    private ServerFile openttdSecretsConfig = null;
    private boolean autoSave = true;
    private boolean autoPause = true;
    private boolean paused = false;
    private boolean autoRestart = false;
    private String inviteCode;
    private int currentClients;
    private int maxClients;
    private int currentCompanies;
    private int maxCompanies;
    private int currentSpectators;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OpenttdProcess process;

    public String getId() { return id; }
    public OpenttdServer setId(String id) { this.id = id; return this; }

    public String getName() { return name; }
    public OpenttdServer setName(String name) { this.name = name; return this; }

    public String getPassword() { return password; }
    public OpenttdServer setPassword(String password) { this.password = password; return this; }

    public String getAdminPassword() { return adminPassword; }
    public OpenttdServer setAdminPassword(String adminPassword) { this.adminPassword = adminPassword; return this; }

    public Integer getServerAdminPort() { return serverAdminPort; }
    public OpenttdServer setServerAdminPort(Integer serverAdminPort) { this.serverAdminPort = serverAdminPort; return this; }

    public Integer getPort() { return port; }
    public OpenttdServer setPort(Integer port) { this.port = port; return this; }

    public ServerFile getSaveGame() { return saveGame; }
    public OpenttdServer setSaveGame(ServerFile saveGame) { this.saveGame = saveGame; return this; }

    public ServerFile getOpenttdConfig() { return openttdConfig; }
    public OpenttdServer setOpenttdConfig(ServerFile openttdConfig) { this.openttdConfig = openttdConfig; return this; }

    public ServerFile getOpenttdPrivateConfig() { return openttdPrivateConfig; }
    public OpenttdServer setOpenttdPrivateConfig(ServerFile openttdPrivateConfig) { this.openttdPrivateConfig = openttdPrivateConfig; return this; }

    public ServerFile getOpenttdSecretsConfig() { return openttdSecretsConfig; }
    public OpenttdServer setOpenttdSecretsConfig(ServerFile openttdSecretsConfig) { this.openttdSecretsConfig = openttdSecretsConfig; return this; }

    public boolean isAutoSave() { return autoSave; }
    public OpenttdServer setAutoSave(boolean autoSave) { this.autoSave = autoSave; return this; }

    public boolean isAutoPause() { return autoPause; }
    public OpenttdServer setAutoPause(boolean autoPause) { this.autoPause = autoPause; return this; }

    public boolean isAutoRestart() { return autoRestart; }
    public OpenttdServer setAutoRestart(boolean autoRestart) { this.autoRestart = autoRestart; return this; }

    public boolean isPaused() { return paused; }
    public OpenttdServer setPaused(boolean paused) { this.paused = paused; return this; }

    public String getInviteCode() { return inviteCode; }
    public OpenttdServer setInviteCode(String inviteCode) { this.inviteCode = inviteCode; return this; }

    public int getCurrentClients() { return currentClients; }
    public OpenttdServer setCurrentClients(int currentClients) { this.currentClients = currentClients; return this; }

    public int getMaxClients() { return maxClients; }
    public OpenttdServer setMaxClients(int maxClients) { this.maxClients = maxClients; return this; }

    public int getCurrentCompanies() { return currentCompanies; }
    public OpenttdServer setCurrentCompanies(int currentCompanies) { this.currentCompanies = currentCompanies; return this; }

    public int getMaxCompanies() { return maxCompanies; }
    public OpenttdServer setMaxCompanies(int maxCompanies) { this.maxCompanies = maxCompanies; return this; }

    public int getCurrentSpectators() { return currentSpectators; }
    public OpenttdServer setCurrentSpectators(int currentSpectators) { this.currentSpectators = currentSpectators; return this; }

    public OpenttdProcess getProcess() { return process; }
    public OpenttdServer setProcess(OpenttdProcess process) { this.process = process; return this; }
}
