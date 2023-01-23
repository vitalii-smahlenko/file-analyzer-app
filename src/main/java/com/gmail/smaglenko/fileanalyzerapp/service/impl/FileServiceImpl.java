package com.gmail.smaglenko.fileanalyzerapp.service.impl;

import com.gmail.smaglenko.fileanalyzerapp.model.Company;
import com.gmail.smaglenko.fileanalyzerapp.service.FileService;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {
    @Value("${path.to.files.storage}")
    private String pathToFilesStorage;

    @Override
    public List<Company> cacheDataFromCatalog(String fileName) {
        try {
            String contents = Files.readString(Path.of(pathToFilesStorage + fileName));
            String[] split = contents.split("\r\n");
            // According to the task, a quick search is required.
            // In my opinion, LinkedList is better suited for working with stored data.
            List<Company> companies = new LinkedList<>();
            for (int i = 0; i < split.length; i++) {
                String replace = split[i].replace("\"", "");
                Company company = new Company();
                company.setId((long) (i + 1));
                company.setName(replace);
                companies.add(company);
            }
            return companies;
        } catch (Exception e) {
            throw new RuntimeException("Can't read file: " + fileName, e);
        }
    }
}
