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

## ПРИМІТКА: На жаль, мені не вдалося реалізувати основну бізнес-логіку додатку:
1) шукати назви компаній (які є в довіднику dict.txt, що додається до цього завдання). На вхід - буде передаватись текстовий файл (як приклад такого файлу – test1.txt і test2.txt, що також додаються до завдання), на виході - в форматі json назви компаній які знайшли, їх позицію в текстовому файлі і довжину. Основна вимога – швидкість пошуку.

2) шукати дати і суми. На вхід - буде передаватись текстовий файл (як приклад такого файлу – test1.txt і test2.txt), на виході - в форматі json дати і суми які знайшли, їх позицію в текстовому файлі і довжину.

3) ділити текст на речення логічні з точки зору людини. На вхід - буде передаватись текстовий файл (як приклад такого файлу – test1.txt і test2.txt), на виході - в форматі json речення, їх позиція в текстовому файлі і довжина. 

### Хочу подякувати за круте тестве завдання. Я знаю,  що з моєю реалізацією, мало шансів потрапити на технічну співбесіду та стати частиною команди ЛІГА ЗАКОНУ. Якщо я отримаю шанс, я обіцяю викладуватись на 100%.

### Дякую! 