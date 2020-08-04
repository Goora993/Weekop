# Weekop
Projekt oparty na kursie podstaw Java EE prowadzonym przez Javastart.pl

Jest to projekt aplikacji webowej przypominającej popularny portal Wykop.pl. Aplikacja wykorzystuje biblioteki Spring JDBC, JSTL oraz MySql Connector. 
Celem tworzenia tego projektu jest nauka i szlifowanie umiejętności pisania kodu w środowisku Java EE. Aplikacja domyślnie będzie uruchamiana na serwerze lokalnym Tomcat.  

03/08/2020
Utworzenie projektu:
  - zaprojaktowanie i stworzenie bazy danych potrzebnej do funkcjonowania aplikacji,
  - dodanie bibliotek Spring JDBC, JSTL, MySql Connector oraz zasobów potrzebnych do działania Bootstrapa,
  - stworzenie strony głównej index.jsp.
  
04/08/2020
  - Utworzenie szablonów poszczególnych stron aplikacji tj.: logowania, rejestracji i dodawania nowych projektów, wykorzystane zostały przy tym klasy Bootstrapa. W celu uwierzytelniania użytkownika zostanie wykorzystana funkcja Tomcata j_security_check,
  - dodanie klas modelu danych będacych odpowiednikami elementów z bazy danych (User, Discovery, Vote oraz enum VoteType),
  - utworzenie podstawowego połączenia z bazą danych za pomocą klasy ConnectionProvider i pliku context.xml - docelowo łączenie z bazą danych będzie się odbywać za pomocą struktury DAO.
