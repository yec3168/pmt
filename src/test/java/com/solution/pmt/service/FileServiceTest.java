package com.solution.pmt.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FileServiceTest {
    @Autowired
    private FileService fileService;
    @Test
    void isExistFolder() {
        fileService.isExistFolder("C:/pmt//user");
    }
}