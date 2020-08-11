# Weekop
Projekt oparty na kursie podstaw Java EE prowadzonym przez Javastart.pl

Jest to projekt aplikacji webowej przypominającej popularny portal Wykop.pl. Aplikacja wykorzystuje biblioteki Spring JDBC, JSTL oraz MySql Connector. 
Celem tworzenia tego projektu jest nauka i szlifowanie umiejętności pisania kodu w środowisku Java EE. Aplikacja domyślnie będzie uruchamiana na serwerze lokalnym Tomcat.  

Technologie wykorzystane w tworzeniu aplikacji:
- Java EE 8
- Bootstrap
- Tomcat
- MySql
- biblioteki Spring JDBC, JSTL, MySql Connector,  Apache Commons Codec.



03/08/2020 Utworzenie projektu:
- zaprojaktowanie i stworzenie bazy danych potrzebnej do funkcjonowania aplikacji,
- dodanie bibliotek Spring JDBC, JSTL, MySql Connector oraz zasobów potrzebnych do działania Bootstrapa,
- stworzenie strony głównej index.jsp.



04/08/2020:
- utworzenie szablonów poszczególnych stron aplikacji tj.: logowania, rejestracji i dodawania nowych projektów, wykorzystane zostały przy tym klasy Bootstrapa. W celu uwierzytelniania użytkownika zostanie wykorzystana funkcja Tomcata j_security_check,
- dodanie klas modelu danych będacych odpowiednikami elementów z bazy danych (User, Discovery, Vote oraz enum VoteType),
- utworzenie połączenia z bazą danych za pomocą klasy ConnectionProvider i pliku context.xml,
- wykorzystanie wzorca projektowego DAO (Data Acces Object) i wprowadzenie go do projektu w celu usprawnienia połączenia aplikacji z bazą danych i stworzenia możliwości wykorzystania innego źródła danych w przyszłości.



05/08/2020:
- dodanie warsty serwisu w aplikacji aby oddzielić logikę aplikacji od klas odpowiedzialnych za połączenie z bazą danych,
- dodanie funkcji rejestrowania użytkowników.



06/08/2020:
- dodanie funkcji logowania zarejestrownaych użytkowników,
- dodanie serwletu filtrującego (LoginFilter.java), mającego na celu zezwalanie zalogowanym użytkownikom na dostęp do wyznaczonych w pliku web.xml elementów aplikacji.



07/08/2020:
- dodanie funkcji dodawania nowych treści dla zalogowanych użytkowników,
- dodanie funkcji wyświatlania treści na stronie głównej na podstawie danych pobieranych z bazy danych przy pomocy pętli. 



10/08/2020:
- dodanie funkcji głosowania, wprowadzenie tej funkcji wymagało modyfikacji klas DiscoveryDAOImpl oras VoteDAOImpl oraz utworzenia serwletu odpowiedzialnego za właściwe, wspólne funkcjonowanie tych dwóch klas.



11/08/2020:
- ukrycie stron .jsp w folderze WEB-INF w celu zmuszenia użytkownika do odwoływania się do nich poprzez klasy kontrolerów, zamiast bezpośrednio do stron .jsp,
- wydzielenie powtarzających się fragmentów stron .jsp do oddzielnych plików .jspf i zaimplementowanie ich w kodzie plików .jsp,
- dodanie funkcji szyfrowania haseł przy pomocy algorytmu MD5, w tym celu w projekcie wykorzystano nową bibliotekę -  Apache Commons Codec.

