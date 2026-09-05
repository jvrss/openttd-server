package de.litexo.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServerInfoCommand extends Command {

    private String inviteCode;
    private int currentClients;
    private int maxClients;
    private int currentCompanies;
    private int maxCompanies;
    private int currentSpectators;

    public String getInviteCode() { return inviteCode; }
    public int getCurrentClients() { return currentClients; }
    public int getMaxClients() { return maxClients; }
    public int getCurrentCompanies() { return currentCompanies; }
    public int getMaxCompanies() { return maxCompanies; }
    public int getCurrentSpectators() { return currentSpectators; }

    public ServerInfoCommand() {
        super("server_info");
    }

    @Override
    public boolean check(String logs) {
        List<String> lines = new ArrayList<>(Arrays.asList(logs.split("\\R")));
        int matched = 0;
        for (String line : lines) {
            if (line.contains("Invite code:")) {
                String[] split = line.split("Invite code:");
                if (split.length > 1) {
                    this.inviteCode = split[1].trim();
                }
                matched++;
            }
            if (line.contains("Current/maximum clients:")) {
                String[] split = line.split("Current/maximum clients:");
                if (split.length > 1) {
                    try {
                        this.currentClients = Integer.parseInt(split[1].split("/")[0].trim());
                        this.maxClients = Integer.parseInt(split[1].split("/")[1].trim());
                    } catch (NumberFormatException e) {
                        // Log error or handle it
                    }
                }
                matched++;
            }
            if (line.contains("Current/maximum companies:")) {
                String[] split = line.split("Current/maximum companies:");
                if (split.length > 1) {
                    try {
                        this.currentCompanies = Integer.parseInt(split[1].split("/")[0].trim());
                        this.maxCompanies = Integer.parseInt(split[1].split("/")[1].trim());
                    } catch (NumberFormatException e) {
                        // Log error or handle it
                    }
                }
                matched++;
            }
            if (line.contains("Current spectators:")) {
                String[] split = line.split("Current spectators:");
                if (split.length > 1) {
                    try {
                        this.currentSpectators = Integer.parseInt(split[1].trim());
                    } catch (NumberFormatException e) {
                        // Log error or handle it
                    }
                }
                matched++;
            }

        }
        return matched == 4;
    }


}
