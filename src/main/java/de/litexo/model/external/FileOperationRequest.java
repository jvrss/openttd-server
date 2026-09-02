package de.litexo.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FileOperationRequest {
    String sourcePath;
    String destinationPath;
    Boolean overwrite;

    public String getSourcePath() { return sourcePath; }
    public FileOperationRequest setSourcePath(String sourcePath) { this.sourcePath = sourcePath; return this; }

    public String getDestinationPath() { return destinationPath; }
    public FileOperationRequest setDestinationPath(String destinationPath) { this.destinationPath = destinationPath; return this; }

    public Boolean getOverwrite() { return overwrite; }
    public FileOperationRequest setOverwrite(Boolean overwrite) { this.overwrite = overwrite; return this; }
}
