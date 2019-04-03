package com.codeClan.Homework.Archive.Projections;


import com.codeClan.Homework.Archive.Models.Folder;
import com.codeClan.Homework.Archive.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = User.class)
public interface EmbedFolder {
    String name();
    List<Folder>getFolder();

}
