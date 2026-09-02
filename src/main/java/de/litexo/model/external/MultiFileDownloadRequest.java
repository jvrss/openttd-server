package de.litexo.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultiFileDownloadRequest {
    String directoryPath;
    List<String> fileNames;

    public String getDirectoryPath() { return directoryPath; }
    public MultiFileDownloadRequest setDirectoryPath(String directoryPath) { this.directoryPath = directoryPath; return this; }

    public List<String> getFileNames() { return fileNames; }
    public MultiFileDownloadRequest setFileNames(List<String> fileNames) { this.fileNames = fileNames; return this; }
}
