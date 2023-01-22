package com.gmail.smaglenko.fileanalyzerapp.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    public String fileUpload(MultipartFile file);
}