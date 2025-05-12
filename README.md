# 🤖 AI-Based Job Recommendation System

## 📌 Overview
This project is an **AI-powered job recommendation system** built with **Spring Boot, Python (ML), and PostgreSQL**. It analyzes **resumes and job descriptions** to match candidates with the best-fit job roles using **Natural Language Processing (NLP) and AI**.

## 🚀 Features
- ✅ **AI-Powered Job Matching** – Uses AI to recommend jobs based on resumes.
- ✅ **Resume Parsing** – Extracts skills and experience from PDFs/DOCX files.
- ✅ **NLP for Job Descriptions** – Processes job descriptions using **TF-IDF/BERT**.
- ✅ **Job Fit Score** – Calculates how well a candidate matches a job.
- ✅ **REST API for Integration** – Can be used by **recruitment platforms**.
- ✅ **Docker Support** – Easily deploy using Docker Compose.

## 🏗️ Tech Stack
- **Backend:** Java (Spring Boot)  
- **Machine Learning:** Python (Scikit-learn, Pandas, TF-IDF)  
- **Database:** PostgreSQL  
- **Containerization:** Docker & Docker Compose  
- **API Security:** JWT Authentication (Future Update)  

## 📂 Project Structure
```
├── backend/
│   ├── src/main/java/com/jobrec/
│   │   ├── Application.java
│   │   ├── controller/JobController.java
│   │   ├── service/JobRecommendationService.java
│   │   ├── service/ResumeParserService.java
│   │   ├── model/Job.java
│   │   ├── model/Candidate.java
│   │   ├── config/SecurityConfig.java
│   ├── resources/application.properties
├── database/
│   ├── schema.sql
├── ai_model/
│   ├── job_matching.py
│   ├── resume_parser.py
├── docker-compose.yml
├── README.md
```

## 🛠️ Setup & Installation
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/AI-Based-Job-Recommendation-System.git
cd AI-Based-Job-Recommendation-System
```

### **2️⃣ Run the Backend (Spring Boot)**
```bash
cd backend
./mvnw spring-boot:run
```

### **3️⃣ Run the Machine Learning Model Training (Optional)**
```bash
cd ai_model
python job_matching.py
```

### **4️⃣ Run Everything Using Docker (Recommended)**
```bash
docker-compose up --build
```

## 📡 API Endpoints (Spring Boot)
| Method | Endpoint                  | Description                     |
|--------|---------------------------|---------------------------------|
| POST   | `/api/jobs/recommend`     | Recommends jobs based on skills |

### **Example API Request**
```json
POST /api/jobs/recommend
{
  "name": "John Doe",
  "email": "johndoe@gmail.com",
  "skills": "Java, Spring Boot, Microservices, REST APIs",
  "experience": "5 years"
}
```
#### **Example API Response**
```json
{
  "message": "Recommended Job: Backend Developer at Google"
}
```

## 📝 Future Enhancements
- 🔒 **JWT Authentication** for API security  
- 📊 **Visualization Dashboard** for job trends  
- 🤖 **Better AI Model** with Deep Learning (BERT, GPT)  

---
 
