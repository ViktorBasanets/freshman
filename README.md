Інструкція користувача
Вступні відомості
    Ця інструкция призначина виключно для перевіряючих данного тестового завдання, як демонстрація особистих навичок автора в написанні(складанні) подібного роду технічної документації.
    Для користування программою "Freshman" необхідно мати інстальовану JVM бажано останньої версії (допустимі і попередні версії) а для компілювання з вихідного коду необхідно користуватися компілятором javac (для запуску зкомпільованих файлів з розширенням .class, необхідно в командній стороці використовувати команду java) абож одною із IDE: Eclipse, NetBeans, IntelliJ IDE тощо. (Данна інформація додана виключно для наповнення контенту :) )
Структура программи "Freshman"
    В вихідний код данної программи входить шість файлів:
        Main.java - файл з точкою входу
        Students.java - сласс-контейнер для об'єктів типу Student
        Group.java - оболонка для класу Students яка в подальшому потрібна для ініціалізації об'єкта класу Professor (списку зареестрованних в группі студентів)
        Student.java - клас нащадок, унаслідований від базового класу Person, що предсталяє собою реального студента з усіма його рисами характеру та особистими досягненнями 
        Professor.java - клас нащадок, унаслідований від базового класу Person, з основним методом перевірки присутніх студентів ініціалізється об'єктом класу 
        Person.java - файл з базовим класом
Опис вихідного коду головного метода
    В головному методі программи створюється об'єкт allStudents класу Students (що фактично представляе всіх зареєстрованих студентів) та ініціалізуеться ішіціалізатором списку з захардкодиними значеннями. Потім створюеться об'ект групи, та ініціалізуеться об'єктом allStudents, визначається староста за допомогою методу chooseHeadman() класу Students та передається його значення методу setHeadman() класа Group (об'єкт groupFreshman). Після - об'єкт professor класу Professor ініціалізується об'єктом groupFreshman та викликається метод rollCall якому передається об'єкт классу Students в якості параметру і отримується в результаті список відсутніх студентів, який згодом виводиться в консоль
Запуск программи
    Відкрити консоль/термінал зайти в папку з програмою (some path ... /freshman/src/) та виконати команду javac Main.java . В результаті з'яваться файл Main.class . Потім виконати команду java Main