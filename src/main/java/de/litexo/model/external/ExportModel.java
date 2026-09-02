package de.litexo.model.external;

import de.litexo.commands.PauseCommand;
import de.litexo.commands.UnpauseCommand;
import de.litexo.events.OpenttdTerminalUpdateEvent;

import java.util.Objects;

public class ExportModel {
    private OpenttdTerminalUpdateEvent openttdTerminalUpdateEvent;
    private UnpauseCommand unpauseCommand;
    private PauseCommand pauseCommand;
    private ServiceError serviceError;

    public OpenttdTerminalUpdateEvent getOpenttdTerminalUpdateEvent() { return openttdTerminalUpdateEvent; }
    public void setOpenttdTerminalUpdateEvent(OpenttdTerminalUpdateEvent e) { this.openttdTerminalUpdateEvent = e; }

    public UnpauseCommand getUnpauseCommand() { return unpauseCommand; }
    public void setUnpauseCommand(UnpauseCommand unpauseCommand) { this.unpauseCommand = unpauseCommand; }

    public PauseCommand getPauseCommand() { return pauseCommand; }
    public void setPauseCommand(PauseCommand pauseCommand) { this.pauseCommand = pauseCommand; }

    public ServiceError getServiceError() { return serviceError; }
    public void setServiceError(ServiceError serviceError) { this.serviceError = serviceError; }
}
