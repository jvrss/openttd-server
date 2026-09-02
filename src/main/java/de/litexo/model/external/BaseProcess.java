package de.litexo.model.external;

import java.util.Objects;

public class BaseProcess {
    private String processId;
    private String processData;

    public String getProcessId() { return processId; }
    public BaseProcess setProcessId(String processId) { this.processId = processId; return this; }

    public String getProcessData() { return processData; }
    public BaseProcess setProcessData(String processData) { this.processData = processData; return this; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseProcess)) return false;
        BaseProcess that = (BaseProcess) o;
        return Objects.equals(processId, that.processId) && Objects.equals(processData, that.processData);
    }

    @Override
    public int hashCode() { return Objects.hash(processId, processData); }

    @Override
    public String toString() {
        return "BaseProcess(processId=" + processId + ", processData=" + processData + ")";
    }
}
