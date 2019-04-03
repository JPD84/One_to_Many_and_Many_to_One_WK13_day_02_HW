package com.codeClan.Homework.Archive.Repository;

import com.codeClan.Homework.Archive.Models.Folder;
import com.codeClan.Homework.Archive.Projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
