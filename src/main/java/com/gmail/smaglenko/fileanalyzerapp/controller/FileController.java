package com.gmail.smaglenko.fileanalyzerapp.controller;

import com.gmail.smaglenko.fileanalyzerapp.service.FileService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @ApiOperation(value = "Save all companies from the catalog.",
            response = String.class)
    @GetMapping("/save-companies")
    public String saveCatalog(@RequestParam String fileName) {
        fileService.saveAllCompanies(fileName);
        return "Companies is successfully saved.";
    }
}
