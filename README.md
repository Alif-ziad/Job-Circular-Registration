# Job Circular Registration

Academic Java Swing desktop project for a small recruitment workflow. Applicants can register and log in for **Security** or **Electrician** vacancies, while a simple administrator login provides a separate admin screen.

## Features

- Separate Security and Electrician applicant flows
- Role-specific registration forms
- Applicant login using locally stored credentials
- Registration confirmation screens
- Simple applicant dashboards
- Separate administrator login
- Local text-file persistence for demo credentials

## Tech

- Java
- Swing / AWT
- Local text files for lightweight persistence

## Project structure

```text
Hiring company Staffs/
├── Start.java
├── EInformation.txt
├── SInformation.txt
└── Data/
    ├── Main.java
    ├── Admin.java
    ├── Adminprofile.java
    ├── Login.java
    ├── Signup.java
    ├── Esignup.java / Elogin.java / Econfirm.java / Edashboard.java / Estore.java
    └── Ssignup.java / Slogin.java / Sconfirm.java / Sdashboard.java / Sstore.java
```

`Start.java` launches the main Swing interface.

## Run locally

A JDK is required.

```bash
cd "Hiring company Staffs"
javac Data/*.java Start.java
java Start
```

## Demo credentials

The repository uses synthetic/demo credentials only.

- Administrator: `admin` / `admin`
- Security applicant: `security.demo@example.com` / `demo1234`
- Electrician applicant: `electrician.demo@example.com` / `demo1234`

## Limitations

This is an academic desktop prototype, not a production recruitment system. Credentials are stored in plaintext local files, the administrator credentials are hard-coded, validation is minimal, and the confirmation screens display entered password values. Do not use real personal information or real passwords with this project.

Generated `.class` files from earlier development are still present in the repository; new compiled artifacts are ignored by `.gitignore`.

## Maintainer

MD Alif Ziad Sarkar — CSE, American International University-Bangladesh (AIUB)
