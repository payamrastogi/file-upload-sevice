package com.coddicted.fileuploadservice;

import com.coddicted.fileuploadservice.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class FileUploadServiceApplication implements CommandLineRunner {
    @Resource
    FileStorageService fileStorageService;
    public static void main(String[] args) {
        SpringApplication.run(FileUploadServiceApplication.class, args);
    }

    @Override
    public void run(String... arg) throws Exception {
        fileStorageService.deleteAll();
        fileStorageService.init();
    }
}
