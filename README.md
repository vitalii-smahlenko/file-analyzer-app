<p align="center">
<img src="images/file-analyzer-app.png">
<p>

Project description
- 

### *This is a simple RESTful file-analyze application based on Spring-boot framework*

## Features in this application :
- Upload the file to directory app
- Cache companies from catalog

## Instructions for launching the project:

- Run application via FileAnalyzerAppApplication class.
- To upload a file to the app storage send POST request to http://localhost:8080/upload
- To save the company catalog in the application cache send GET request to http://localhost:8080/save-companies?fileName=dict.txt where fileName is the name of the directory file

## Technologies

- java 17.0.5 2022-10-18 LTS
- Apache Maven 3.8.1
- REST API
- Swagger