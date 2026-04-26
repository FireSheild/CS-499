Test Hyperlink [Portfolio](https://google.com)

Rescue Animal System (v2, v3, v4)

Overview:
- v2: Refactored structure (software engineering)
- v3: Improved logic and filtering (algorithms)
- v4: Database integration using SQLite (JDBC)

Running v4 (Database Version):

1. Ensure SQLite JDBC driver is present:
   File: v4/lib/sqlite-jdbc.jar

   If missing, download from:
   https://github.com/xerial/sqlite-jdbc

2. Compile:
   Windows:
   javac -cp ".;lib/sqlite-jdbc.jar" app/Main.java

   Mac/Linux:
   javac -cp ".:lib/sqlite-jdbc.jar" app/Main.java

3. Run:
   Windows:
   java -cp ".;lib/sqlite-jdbc.jar" app.Main

   Mac/Linux:
   java -cp ".:lib/sqlite-jdbc.jar" app.Main

Notes:
- Database file (animals.db) will be created automatically in v4 directory.
- No separate SQLite installation is required.
- Prepared statements are used for safe database operations.

