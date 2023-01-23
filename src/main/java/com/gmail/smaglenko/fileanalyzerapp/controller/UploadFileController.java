package com.gmail.smaglenko.fileanalyzerapp.controller;

import com.gmail.smaglenko.fileanalyzerapp.service.UploadFileService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadFileController {
    private final UploadFileService uploadFileService;

    public UploadFileController(UploadFileService uploadFileService) {
        this.uploadFileService = uploadFileService;
    }

    @ApiOperation(value = "Upload the file to the application storage.",
            response = String.class)
    @PostMapping("/upload")
    public String uploadFile(MultipartFile file) {
        return uploadFileService.uploadFile(file);
    }
}
