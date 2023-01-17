Ниже приведен фрагмент XML документа (pom.xml — используется в Maven для указания
зависимостей)
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.4</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.powermock</groupId>
<artifactId>powermock-reflect</artifactId>
<version>3.2</version>
</dependency>
Поместите эти строки в массив строк, создайте поток на его основе и выделите значения в теге <groupid> и
соберите результат в список строк.
