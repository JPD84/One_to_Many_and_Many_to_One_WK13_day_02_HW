package com.codeClan.Homework.Archive;

import com.codeClan.Homework.Archive.Models.File;
import com.codeClan.Homework.Archive.Models.Folder;
import com.codeClan.Homework.Archive.Models.User;
import com.codeClan.Homework.Archive.Repository.FileRepository;
import com.codeClan.Homework.Archive.Repository.FolderRepository;
import com.codeClan.Homework.Archive.Repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArchiveApplicationTests {


	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndCopyToFolder(){

		User user = new User("James");
		userRepository.save(user);
		Folder folder = new Folder("SkiResorts",  user);
		folderRepository.save(folder);
		File file = new File("New_Resort", ".doc", 15, folder);
		fileRepository.save(file);
	}




}
