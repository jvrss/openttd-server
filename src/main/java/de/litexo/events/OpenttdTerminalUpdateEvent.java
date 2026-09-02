package de.litexo.events;

public class OpenttdTerminalUpdateEvent extends BaseEvent {

    private String processId;

    private String text;

    public OpenttdTerminalUpdateEvent(Object eventSource, String processId, String text) {
        super(eventSource);
        this.processId = processId;
        this.text = text;
    }

    public String getProcessId() { return processId; }
    public String getText() { return text; }

    @Override
    public String toString() {
        return "OpenttdTerminalUpdateEvent(" + super.toString() + ", processId=" + processId + ", text=" + text + ")";
    }
}
