# 🚀 URL Shortener - DevOps CI/CD Project

This is a full DevOps pipeline project for a Spring Boot-based URL Shortener application, using Jenkins, Maven, and Docker.

---

## 🧰 Tech Stack

| Layer        | Tool/Technology                   |
|--------------|------------------------------------|
| Backend      | Java 17, Spring Boot               |
| Build Tool   | Maven                              |
| CI/CD        | Jenkins                            |
| Unit Testing | JUnit                              |
| Container    | Docker                             |
| Registry     | DockerHub                          |
| VCS          | Git + GitHub                       |

---

## 📦 Project Highlights

- 🔗 URL Shortening microservice
- ✅ JUnit test cases for core logic
- 📦 Maven used for packaging
- 🐳 Docker image built & pushed manually
- 🔁 Jenkins pipeline for CI

---

## 🛠️ Jenkins Pipeline Stages

1. **Checkout** code from GitHub
2. **Maven Build** to generate JAR
3. **Run JUnit Tests**
4. *(Skipped)* Docker build and push (manual due to daemon issue)
5. ✅ Final build success via Jenkins

---

## 🧪 Unit Testing

Run locally:

```bash
mvn test
```

Sample Output:

```
✅ Shortened Code: abc123
✅ Retrieved Original URL: https://example.com
Tests run: 2, Failures: 0, Errors: 0
```

---

## 🐳 Docker Image

Pushed manually to DockerHub:

```bash
docker pull kapilan27/url-shortener-app:1.0.0
docker run -p 8080:8080 kapilan27/url-shortener-app:1.0.0
```

Access it at: [http://localhost:8080](http://localhost:8080)

---

## 🔧 Manual Docker Build (Optional)

```bash
mvn clean package
docker build -t kapilan27/url-shortener-app:1.0.0 .
docker push kapilan27/url-shortener-app:1.0.0
```

---

## 📁 Project Structure

```
url-shortener-devops/
├── src/
├── target/
├── Dockerfile
├── pom.xml
├── Jenkinsfile
└── README.md
```

---

## 📌 GitHub Repo

🔗 https://github.com/kapilank-k/url-shortener-devops

---

## ✅ Done

- [x] Java + Spring Boot backend
- [x] JUnit tests and Maven build
- [x] Docker image built manually
- [x] Jenkins pipeline: Build & Test stages working

---

## 🧪 Optional Enhancements

| Task                             | Status     |
|----------------------------------|------------|
| Fix Docker permissions in Jenkins| ⏳ Pending |
| Add Ansible to automate Jenkins  | ❌ Skipped |
| Grafana + Prometheus monitoring  | ❌ Skipped |
| Deploy to cloud (AWS/Heroku)     | ❌ Skipped |

---

## 🏁 Final Notes

> This project demonstrates the key CI/CD skills using Jenkins and Docker for a simple backend microservice.
> Docker build and push were completed manually due to daemon permission restrictions.

