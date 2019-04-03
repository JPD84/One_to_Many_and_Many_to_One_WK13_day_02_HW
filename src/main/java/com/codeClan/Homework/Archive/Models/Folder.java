package com.codeClan.Homework.Archive.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")

public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    private ArrayList listOfFiles;


    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private List<File> files;


    public Folder(String title, User user) {
        this.title = title;
        this.listOfFiles = new ArrayList<File>();
        this.user = user;

    }

    public Folder() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList getListOfFiles() {
        return listOfFiles;
    }

    public void setListOfFiles(ArrayList listOfFiles) {
        this.listOfFiles = listOfFiles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
