## **Professional Self-Assessment**

Throughout the Computer Science program and the development of this ePortfolio, there has been a clear progression from focusing primarily on functionality to developing a broader understanding of software design, structure, and professional practices. The work completed across courses, along with the refinement of selected artifacts, demonstrates growth in technical ability as well as in the approach to problem solving and system design.

One of the most significant areas of development has been in software engineering and design. Earlier work was often written with a focus on immediate results, with less attention given to structure, maintainability, or clarity. Through continued coursework and the process of enhancing artifacts, there has been a shift toward organizing code into distinct layers, improving readability, and applying object-oriented principles more effectively. This includes separating concerns between data models, business logic, and data access, which allows systems to be more scalable and easier to modify. These improvements are reflected in the enhanced artifacts, where restructuring played a key role in improving overall code quality.

Another key area of growth is in the understanding and application of algorithms and data structures. Initial implementations often relied on basic or inefficient approaches without fully considering performance or scalability. Over time, there has been increased attention to how data is stored, accessed, and processed. Improvements such as more efficient filtering, better use of collections, and clearer control flow demonstrate a stronger grasp of algorithmic thinking. This shift shows an ability to evaluate solutions not only based on correctness but also on efficiency and clarity.

Experience with databases represents an additional area of development. Integrating persistent storage into an application required learning how to design relational structures, connect applications to databases, and manage data through queries. This process reinforced the importance of data persistence in real-world systems and highlighted how applications must maintain state beyond a single execution. It also introduced considerations such as data integrity, validation, and secure handling of inputs.

Collaboration and communication have also been important components of this program. While much of the work was completed individually, the ability to explain code, justify design decisions, and present technical information clearly has been emphasized. The code review process, in particular, required explaining both the functionality and limitations of existing code, as well as outlining plans for improvement. This reflects real-world development environments, where communication with team members and stakeholders is essential for successful project outcomes.

Security awareness has become a more deliberate part of the development process as well. Earlier work did not consistently consider potential vulnerabilities or data validation. Through later coursework and enhancements, there has been increased attention to safe coding practices, such as validating inputs and using parameterized queries when interacting with databases. While not all aspects of security are fully explored, there is a growing understanding of its importance in software development.

The artifacts included in this ePortfolio collectively demonstrate growth across these areas. Each enhancement builds on a previous version, showing a progression from basic functionality to more structured, efficient, and realistic implementations. The improvements in software design, algorithmic reasoning, and database integration work together to present a more complete and professional representation of development skills.

Overall, this body of work reflects a transition from writing code that simply functions to developing systems that are structured, maintainable, and aligned with industry practices. The skills demonstrated through these artifacts provide a foundation for continued growth, particularly in building more complex applications and refining design approaches. This progression supports readiness to enter the field with a clearer understanding of both technical requirements and professional expectations in computer science.

---

## Enhancements and Narratives

Enhancement One (V2) File:
[improved_project_v2](https://github.com/FireSheild/CS-499/tree/main/v2%20)

Narrative:

Version 2 was a major step into making the system easier to work with. The original version placed nearly all responsibility into one class, which made it difficult to understand and even harder to modify without breaking something else. In this revision, the primary goal was to separate concerns in a way that reflects how larger systems are actually built. Instead of letting one class handle everything, responsibilities are divided into distinct layers: models to represent data, a repository to manage storage, a service layer to handle logic, and an application entry point to control execution.
This change is not just about organization for its own sake. By introducing a repository layer, the program now has a clear boundary between how data is stored and how it is used. This makes it easier to replace or extend storage later, whether that means switching to a database or adding persistence. The introduction of a service layer further improves clarity by centralizing business logic, such as reserving animals or adding new ones. Instead of scattering logic across different parts of the program, it is now located in one place where it can be maintained and tested more effectively.
Another important improvement is the shift from name-based identification to ID-based identification. In the earlier version, animals were often referenced by name, which creates ambiguity and potential errors if duplicates exist. By assigning unique identifiers, the system becomes more reliable and predictable. This also aligns with how real-world systems track entities.
The addition of a new animal type, the cat, serves as a practical test of the system’s flexibility. In the original design, adding a new type would have required modifying multiple areas of the code in inconsistent ways. In this version, the inheritance structure allows new animal types to be added with minimal changes, demonstrating that the system is becoming more extensible.
Overall, Version 2 addresses the most fundamental issues in the original project. It replaces a tightly coupled structure with a layered approach, reduces logical errors by clarifying responsibilities, and sets the foundation for further improvements. While it is still relatively simple, it moves the project from a basic implementation toward something that can be reasonably maintained and expanded.



---

### Code Review

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

