package com.codeClan.Homework.Archive.Projections;

import com.codeClan.Homework.Archive.Models.File;
import com.codeClan.Homework.Archive.Models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFile", types = Folder.class)
public interface EmbedFile {
    String getName();
    List<File>getFiles();
}
