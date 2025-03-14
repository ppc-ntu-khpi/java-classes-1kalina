[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18064121)
# Створення класів

Це друга лабораторна робота в нашому курсі з ООП, в ході якої ви маєте отримати навички зі створення класів та тестування їх працездатності. Робота дуже маленька та складається з двох завдань.

## Завдання 1. Створення класу з атрибутами

1. **клонуйте** створений для вас репозиторій в Netbeans (детальна інструкція з картинками є [тут](https://netbeans.org/kb/docs/ide/git.html)), **відкрийте** в [Repl.It](https://repl.it/) ([ось](https://repl.it/talk/learn/Configuring-GitHub-repos-to-run-on-Replit-and-contributing-back/23948) покрокова інструкція з картинками) або **просто завантажте** його вміст у ZIP-форматі (скориставшись кнопкою "Code" > "Download ZIP") і відкрийте в IDE за вашим вибором
2. створіть **в пакеті ````domain````** клас ```` Сustomer ```` з такими **приватними атрибутами**:
    * ````ID```` (номер клієнта, **ціле** число)
    * ````isNew```` (статус клієнта новий він чи старий, **булевське** значення)
    * ````total```` (сума замовлень за рік, **дробове** число)
3. атрибути повинні мати **значення за замовчуванням** (наприклад, ````1```` для ````ID````, ````true```` для ````isNew````, ````1000```` для ````total````, див. відеозапис лекції).

**УВАГА! Repl.It на даний момент не підтримує пакети, тож краще виконувати роботу в Netbeans!** Якщо виконуєте в Repl.It - робите як минулого разу - все в дефолтному пакеті (й не забувайте про файли ````.replit```` і ````start.sh````!).

## Завдання 2. Додавання в клас методів 

Додати до класу метод ````displayCustomerInfo````, який виводить на консоль інформацію про клієнта з допомогою ````System.out.println````. Кожен рядок має містити відповідну мітку, наприклад, "Total purchases are:" (див. перердню роботу).


## Перевірка працездатності створеного класу

1. Створити в **пакеті ````test````** клас ````CustomerTest````, в методі ````main```` якого створити об'єкт класу ```` Сustomer ```` та вивести на екран його властивості з допомогою методу ````displayCustomerInfo```` (див. відеозапис лекції). 
2. **запустіть** його (<kbd>F6</kbd> у NetBeans для запуску головного виконуваного файлу, <kbd>SHIFT</kbd>+<kbd>F6</kbd> - для запуску поточного файлу)
3. зробіть та збережіть (тека **Solution**) у файл ````done.png```` **скріншот** результатів роботи програми 

**На завершення виконання лабораторної роботи закомітьте ваш проект до репозиторію та здайте завдання через Google Classroom, вказавши посилання на Ваш репозиторій.**

:triangular_flag_on_post: **УВАГА!** Ваша оцінка залежить від того, що саме було вами зроблено:
* на "**три**" - просто виконані перелічені вище завдання
* на "**чотири**" - те, що на "три", плюс, добре оформлений файл змініть файл ````README.md````  - з кодом класу ```` Сustomer ```` та скріншотом роботи програми
* на "**п'ять**" - те, що на "чотири", плюс, змінити код класу наступним чином:
  * додати **конструктор за замовчуванням**, який ініціалізує атрибути початковими значеннями (див. відеозапис лекції) 
  * додати **методи для зміни атрибутів** - ````setID````, ````setStatus````, ````setTotal```` з відповідними параметрами та перевіркою присвоюваних значень (можуть або нічого не повертати, або повертати булевське значення, див. відеозапис лекції). 
**Підказка:** натисніть в Netbeans <kbd>Alt</kbd> + <kbd>Insert</kbd> і оберіть пункт "Getter and Setter..." - Netbeans напише все замість вас!
![](https://github.com/ppc-ntu-khpi/Class-Starter/raw/main/images/GetterAndSetter.png)
  * **використати ці методи** в методі в методі ````main```` класу````CustomerTest````
  * зробити та зберегти (тека **Solution**) у файл ````advanced.png```` **скріншот** результатів роботи програми, та модифікувати файл ````README.md````відповідним чином



