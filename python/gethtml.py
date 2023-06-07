from selenium import webdriver
from bs4 import BeautifulSoup
import time
url = "https://www.example.com"
drive = webdriver.Chrome()
drive.get(url)
time.sleep(5)
s = drive.page_source
drive.quit()
soup = BeautifulSoup(s, "html.parser")
s1 = soup.prettify()
name = "C:\\Users\\Desktop\\htmlFile.txt"
with open(name, "w", encoding='utf-8') as htmlFile:
    htmlFile.write(s1)
