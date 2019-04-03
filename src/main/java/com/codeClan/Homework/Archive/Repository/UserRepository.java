package com.codeClan.Homework.Archive.Repository;

import com.codeClan.Homework.Archive.Models.User;
import com.codeClan.Homework.Archive.Projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
