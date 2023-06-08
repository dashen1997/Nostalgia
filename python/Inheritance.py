class Person:
    def __init__(self):
     self.age = None
     self.name = None
     self.gender = None

    def setAge(self, age):
        self.age = age

    def getAge(self):
        return self.age

    def setName(self, name):
        self.name = name

    def getName(self):
        return self.name

    def setGender(self, gender):
        self.gender = gender

    def getGender(self):
        return self.gender

class Player(Person):
    def play(self):
        print(f"play")
    def participateCompetition(self):
        print(f"participate in a competition")

class Coach(Person):
    def teach(self):
        print(f"teach")

class SwimmingPlayer(Player):
    def play(self):
        print(f"I'm swimming")
    def participateCompetition(self):
        print(f"participate in a swimming competition")

class SwimmingCoach(Coach):
    def teach(self):
        print(f"teach swimming")

class TennisPlayer(Player):
    def play(self):
        print(f"I'm playing tennis")
    def participateCompetition(self):
        print(f"participate in a tennis competition")

class TennisCoach(Coach):
    def teach(self):
        print(f"teach tennis")
