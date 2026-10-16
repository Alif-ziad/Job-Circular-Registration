# Job Circular Registration

Java desktop GUI project for a job-circular / recruitment workflow with separate hiring-company and applicant-related screens.

## Source layout

```text
Hiring company Staffs/
├── Start.java
└── Data/
    ├── Main.java
    ├── Login.java
    ├── Signup.java
    ├── Admin.java
    ├── Elogin.java
    ├── Esignup.java
    ├── Slogin.java
    └── ...
```

`Start.java` is the application entry point and launches the `Main` interface from the `Data` package.

## Run locally

From the repository root:

```bash
cd "Hiring company Staffs"
javac Data/*.java Start.java
java Start
```

A JDK is required. The repository currently contains generated `.class` files from development; those can be removed in a later cleanup because they can be rebuilt from the Java sources.

## Tech

- Java
- Swing/AWT-style desktop GUI
- Package-based source organization
- Local text-file data

## Author

MD Alif Ziad Sarkar — CSE, American International University-Bangladesh (AIUB)
