package com.gmail.smaglenko.fileanalyzerapp.service;

import com.gmail.smaglenko.fileanalyzerapp.model.Company;
import java.util.List;

public interface FileService {
    List<Company> saveAllCompanies(String fileName);
}
