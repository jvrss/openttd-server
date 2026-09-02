package de.litexo.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExplorerFile {
    String id;
    String name;
    String absolutePath;
    String relativePath;
    String baseName;
    String extension;
    Long size;
    Long lastModified;
    Boolean isDirectory;

    public String getId() { return id; }
    public ExplorerFile setId(String id) { this.id = id; return this; }

    public String getName() { return name; }
    public ExplorerFile setName(String name) { this.name = name; return this; }

    public String getAbsolutePath() { return absolutePath; }
    public ExplorerFile setAbsolutePath(String absolutePath) { this.absolutePath = absolutePath; return this; }

    public String getRelativePath() { return relativePath; }
    public ExplorerFile setRelativePath(String relativePath) { this.relativePath = relativePath; return this; }

    public String getBaseName() { return baseName; }
    public ExplorerFile setBaseName(String baseName) { this.baseName = baseName; return this; }

    public String getExtension() { return extension; }
    public ExplorerFile setExtension(String extension) { this.extension = extension; return this; }

    public Long getSize() { return size; }
    public ExplorerFile setSize(Long size) { this.size = size; return this; }

    public Long getLastModified() { return lastModified; }
    public ExplorerFile setLastModified(Long lastModified) { this.lastModified = lastModified; return this; }

    public Boolean getIsDirectory() { return isDirectory; }
    public ExplorerFile setIsDirectory(Boolean isDirectory) { this.isDirectory = isDirectory; return this; }
}
