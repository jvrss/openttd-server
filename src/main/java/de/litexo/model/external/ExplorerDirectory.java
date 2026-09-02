package de.litexo.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExplorerDirectory {
    String id;
    String name;
    String absolutePath;
    String relativePath;
    List<ExplorerFile> files = new ArrayList<>();
    List<ExplorerDirectory> dirs = new ArrayList<>();

    public String getId() { return id; }
    public ExplorerDirectory setId(String id) { this.id = id; return this; }

    public String getName() { return name; }
    public ExplorerDirectory setName(String name) { this.name = name; return this; }

    public String getAbsolutePath() { return absolutePath; }
    public ExplorerDirectory setAbsolutePath(String absolutePath) { this.absolutePath = absolutePath; return this; }

    public String getRelativePath() { return relativePath; }
    public ExplorerDirectory setRelativePath(String relativePath) { this.relativePath = relativePath; return this; }

    public List<ExplorerFile> getFiles() { return files; }
    public ExplorerDirectory setFiles(List<ExplorerFile> files) { this.files = files; return this; }

    public List<ExplorerDirectory> getDirs() { return dirs; }
    public ExplorerDirectory setDirs(List<ExplorerDirectory> dirs) { this.dirs = dirs; return this; }
}
