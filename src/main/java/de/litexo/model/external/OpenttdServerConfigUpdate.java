package de.litexo.model.external;

public class OpenttdServerConfigUpdate {
    private int autoSaveMinutes;
    private int numberOfAutoSaveFilesToKeep;
    private int numberOfManuallySaveFilesToKeep;
    private String password;
    private String oldPassword;

    public int getAutoSaveMinutes() { return autoSaveMinutes; }
    public void setAutoSaveMinutes(int autoSaveMinutes) { this.autoSaveMinutes = autoSaveMinutes; }

    public int getNumberOfAutoSaveFilesToKeep() { return numberOfAutoSaveFilesToKeep; }
    public void setNumberOfAutoSaveFilesToKeep(int numberOfAutoSaveFilesToKeep) { this.numberOfAutoSaveFilesToKeep = numberOfAutoSaveFilesToKeep; }

    public int getNumberOfManuallySaveFilesToKeep() { return numberOfManuallySaveFilesToKeep; }
    public void setNumberOfManuallySaveFilesToKeep(int numberOfManuallySaveFilesToKeep) { this.numberOfManuallySaveFilesToKeep = numberOfManuallySaveFilesToKeep; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getOldPassword() { return oldPassword; }
    public void setOldPassword(String oldPassword) { this.oldPassword = oldPassword; }
}
