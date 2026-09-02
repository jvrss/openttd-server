package de.litexo.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExplorerData {
    String root;
    String fileSeperator;
    List<ExplorerDirectory> directories = new ArrayList<>();

    public String getRoot() { return root; }
    public ExplorerData setRoot(String root) { this.root = root; return this; }

    public String getFileSeperator() { return fileSeperator; }
    public ExplorerData setFileSeperator(String fileSeperator) { this.fileSeperator = fileSeperator; return this; }

    public List<ExplorerDirectory> getDirectories() { return directories; }
    public ExplorerData setDirectories(List<ExplorerDirectory> directories) { this.directories = directories; return this; }
}
