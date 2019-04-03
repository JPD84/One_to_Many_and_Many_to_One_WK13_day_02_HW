package com.codeClan.Homework.Archive.Components;

import com.codeClan.Homework.Archive.Models.File;
import com.codeClan.Homework.Archive.Models.Folder;
import com.codeClan.Homework.Archive.Models.User;
import com.codeClan.Homework.Archive.Repository.FileRepository;
import com.codeClan.Homework.Archive.Repository.FolderRepository;
import com.codeClan.Homework.Archive.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        User clark = new User("clark kent");
        User blueprints = new User( "blueprints");
        userRepository.save(clark);
        userRepository.save(blueprints);

        Folder schematics = new Folder("schematics", clark);
        Folder schematicFiles = new Folder("schematicFiles",clark);
        Folder newPlans = new Folder("New Plans", clark);
        folderRepository.save(schematics);
        folderRepository.save(newPlans);
        folderRepository.save(schematicFiles);

        File draughtFiles = new File("draughtFiles",".dwg", 500, schematicFiles);
        File extensions = new File(".java, txt", ".dwg", 500, schematicFiles);
        File size = new File("New Project", ".dwg", 500, schematicFiles);
        File folder = new File("New Project", ".dwg", 500, schematicFiles);
        fileRepository.save(draughtFiles);
        fileRepository.save(extensions);
        fileRepository.save(size);
        fileRepository.save(folder);

    }
}
