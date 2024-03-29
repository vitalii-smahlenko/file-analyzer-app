package com.gmail.smaglenko.fileanalyzerapp.service.impl;

import com.gmail.smaglenko.fileanalyzerapp.service.UploadFileService;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//123
@Service
public class UploadFileServiceImpl implements UploadFileService {
    @Value("${path.to.files.storage}")
    private String pathToFilesStorage;

    @Override
    public String uploadFile(MultipartFile file) {
        String destinationFileName = pathToFilesStorage + file.getOriginalFilename();
        try {
            Files.copy(file.getInputStream(),
                    Path.of(destinationFileName),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException("Can't upload file " + file.getName(), e);
        }
        return destinationFileName + " Has been saved!!!";
    }
}
