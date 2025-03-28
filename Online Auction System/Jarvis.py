import openai
import pyttsx3 #pip install pyttsx3
import speech_recognition as sr #pip install speechRecognition
import datetime
import wikipedia #pip install wikipedia
import webbrowser
import os
import smtplib
from pygame import mixer

engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
# print(voices[1].id)
engine.setProperty('voice', voices[0].id)
openai.api_key = "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"

def speak(audio):
    engine.say(audio)
    engine.runAndWait()


def wishMe():
    hour = int(datetime.datetime.now().hour)
    if hour>=0 and hour<12:
        speak("Good Morning!")

    elif hour>=12 and hour<18:
        speak("Good Afternoon!")   

    else:
        speak("Good Evening!")  

    speak("I am Jarvis Sir. Please tell me how may I help you")       

def takeCommand():
    #It takes microphone input from the user and returns string output

    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        r.pause_threshold = 0.5
        audio = r.listen(source)

    try:
        print("Recognizing...")    
        query = r.recognize_google(audio, language='en-in')
        print(f"User said: {query}\n")

    except Exception as e:
        # print(e)    
        print("Say that again please...")  
        return "None"
    return query

def sendEmail(to, content):
    server = smtplib.SMTP('smtp.gmail.com', 587)
    server.ehlo()
    server.starttls()
    server.login('rushikeshtanpure200@gmail.com', 'jknldcomlwkbmfre')
    server.sendmail('rushikeshtanpure200@gmail.com', to, content)
    server.close()

if __name__ == "__main__":
    wishMe()
    condition=True
    while condition:
        query = takeCommand().lower()

        # Logic for executing tasks based on query
        if 'wikipedia' in query:
            speak('Searching Wikipedia...')
            query = query.replace("wikipedia", "")
            try:
                results = wikipedia.summary(query,auto_suggest=False,sentences=2)
                speak("According to Wikipedia")
                print(results)
                speak(results)
            except Exception as e:
                print(e)
            

        elif 'open youtube' in query:
            webbrowser.open("youtube.com")

        elif 'open google' in query:
            webbrowser.open("google.com")

        elif 'open stackoverflow' in query:
            webbrowser.open("stackoverflow.com")   


        elif 'play music' in query:
            music_dir = 'F:\\Songs'
            songs = os.listdir(music_dir)
            mixer.init()
            print(songs)
            for song in songs:
                mixer.music.load("F:\\Songs\\"+song)
            mixer.music.play()


        elif 'the time' in query:
            strTime = datetime.datetime.now().strftime("%H:%M:%S")    
            speak(f"Sir, the time is {strTime}")

        elif 'open code' in query:
            codePath = "F:\\HexDemo.java"
            os.startfile(codePath)

        elif 'email to rishikesh' in query:
            try:
                speak("What should I say?")
                content = takeCommand()
                to = "rushikeshtanpure100@gmail.com"    
                sendEmail(to, content)
                speak("Email has been sent!")
            except Exception as e:
                print(e)
                speak("Sorry  Sir . I am not able to send this email")
        elif 'exit' in query:
            try:
                speak("Thanks Sir")
                condition=False
            except Exception as e:
                print(e)
        else:
                SYSTEM_PROMPT = "You are a smart and intelligent Pesonal Assistant.Your name is JARVIS.You are developed by tanpure rushikesh.So your father is tanpure rushikesh .Currently you helping the user.Your Features are Face Recognition and voice recognition and as well as assist user.Your development is done python using libaries mediapipe,tenslarflow,openai.Cv2 for camera access and to for graphical user interrface used PyQt.Your future goal is to detect user using voice for that purpose you saving the voice data for anaylisy and research and control windows also you have to detect emotions of user using face and voice and upload user data so use for further development and help deaf and dumb to answer based on user actions and Posture.You can open youtube using command 'open youtube'.You can open stackoverflow from 'open stackoverflow' command. Play song using 'Play music' command.Also search anything on wikipedia using 'wikipedia search thing' command.And also send email to using 'email to person name' command.And also other features of chatgpt"
                response = openai.ChatCompletion.create(
                    model="gpt-3.5-turbo",
                    messages=[{"role": "system", "content": SYSTEM_PROMPT},
                            {"role": "user", "content":query},])
                print(response.choices[0].message.content)
                speak(response.choices[0].message.content) 
        
        