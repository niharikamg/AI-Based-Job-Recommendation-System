import docx
import pdfplumber

def extract_text_from_docx(file_path):
    doc = docx.Document(file_path)
    return " ".join([para.text for para in doc.paragraphs])

def extract_text_from_pdf(file_path):
    with pdfplumber.open(file_path) as pdf:
        return " ".join([page.extract_text() for page in pdf.pages])

# Test
print(extract_text_from_docx("resume.docx"))
print(extract_text_from_pdf("resume.pdf"))
