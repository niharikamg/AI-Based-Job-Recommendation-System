import pandas as pd
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity

# Sample Data (Replace with Database)
jobs = pd.DataFrame({
    'title': ['Backend Developer', 'Data Scientist', 'Frontend Developer'],
    'description': ['Java, Spring Boot, REST APIs', 'Machine Learning, Python, TensorFlow', 'React.js, JavaScript, CSS']
})

def match_job(candidate_skills):
    vectorizer = TfidfVectorizer()
    job_vectors = vectorizer.fit_transform(jobs['description'])
    candidate_vector = vectorizer.transform([candidate_skills])
    
    scores = cosine_similarity(candidate_vector, job_vectors).flatten()
    best_match_index = scores.argmax()
    
    return jobs.iloc[best_match_index]['title']

# Test Example
candidate_skills = "Python, Machine Learning, AI"
print("Recommended Job:", match_job(candidate_skills))
