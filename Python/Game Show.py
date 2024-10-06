import random

# Define the questions and answers
questions = [
    {
        "question": "What is the capital of France?",
        "options": ["A) Berlin", "B) Madrid", "C) Paris", "D) Rome"],
        "answer": "C"
    },
    {
        "question": "Who wrote 'To Kill a Mockingbird'?",
        "options": ["A) Harper Lee", "B) Mark Twain", "C) J.K. Rowling", "D) Ernest Hemingway"],
        "answer": "A"
    },
    {
        "question": "What is the chemical symbol for water?",
        "options": ["A) H2O", "B) CO2", "C) O2", "D) NaCl"],
        "answer": "A"
    },
    {
        "question": "Which planet is known as the Red Planet?",
        "options": ["A) Earth", "B) Mars", "C) Jupiter", "D) Saturn"],
        "answer": "B"
    },
    {
        "question": "Who painted the Mona Lisa?",
        "options": ["A) Vincent van Gogh", "B) Pablo Picasso", "C) Leonardo da Vinci", "D) Claude Monet"],
        "answer": "C"
    },
    {
        "question": "What is the largest mammal?",
        "options": ["A) Elephant", "B) Blue Whale", "C) Giraffe", "D) Polar Bear"],
        "answer": "B"
    },
    {
        "question": "Which country is known as the Land of the Rising Sun?",
        "options": ["A) China", "B) Japan", "C) South Korea", "D) India"],
        "answer": "B"
    },
    {
        "question": "Who developed the theory of relativity?",
        "options": ["A) Isaac Newton", "B) Galileo Galilei", "C) Nikola Tesla", "D) Albert Einstein"],
        "answer": "D"
    },
    {
        "question": "What is the smallest unit of life?",
        "options": ["A) Atom", "B) Molecule", "C) Cell", "D) Organ"],
        "answer": "C"
    },
    {
        "question": "Who discovered penicillin?",
        "options": ["A) Marie Curie", "B) Alexander Fleming", "C) Louis Pasteur", "D) Thomas Edison"],
        "answer": "B"
    },
    {
        "question": "What is the longest river in the world?",
        "options": ["A) Amazon", "B) Nile", "C) Mississippi", "D) Yangtze"],
        "answer": "B"
    },
    {
        "question": "Which element has the chemical symbol 'O'?",
        "options": ["A) Gold", "B) Silver", "C) Oxygen", "D) Osmium"],
        "answer": "C"
    },
    {
        "question": "What is the hardest natural substance on Earth?",
        "options": ["A) Iron", "B) Diamond", "C) Quartz", "D) Gold"],
        "answer": "B"
    },
    {
        "question": "Who was the first president of the United States?",
        "options": ["A) Thomas Jefferson", "B) John Adams", "C) George Washington", "D) Abraham Lincoln"],
        "answer": "C"
    },
    {
        "question": "What is the capital of Italy?",
        "options": ["A) Rome", "B) Venice", "C) Florence", "D) Milan"],
        "answer": "A"
    },
    {
        "question": "Which gas is most abundant in the Earth's atmosphere?",
        "options": ["A) Oxygen", "B) Carbon Dioxide", "C) Nitrogen", "D) Hydrogen"],
        "answer": "C"
    },
    {
        "question": "What is the largest ocean on Earth?",
        "options": ["A) Atlantic Ocean", "B) Indian Ocean", "C) Arctic Ocean", "D) Pacific Ocean"],
        "answer": "D"
    },
    {
        "question": "Who is the author of 'Pride and Prejudice'?",
        "options": ["A) Emily Brontë", "B) Jane Austen", "C) Mary Shelley", "D) Charlotte Brontë"],
        "answer": "B"
    },
    {
        "question": "Which continent is the Sahara Desert located on?",
        "options": ["A) Asia", "B) South America", "C) Africa", "D) Australia"],
        "answer": "C"
    },
    {
        "question": "Which country hosted the 2016 Summer Olympics?",
        "options": ["A) China", "B) Brazil", "C) United Kingdom", "D) Russia"],
        "answer": "B"
    }
]

# Function to run the game show
def game_show():
    print("Welcome to the Game Show!")
    print("Answer the following questions by choosing the correct option (A, B, C, or D).\n")
    
    score = 0
    selected_questions = random.sample(questions, 10)  # Randomly select 10 questions
    
    for i, q in enumerate(selected_questions):
        print(f"Question {i + 1}: {q['question']}")
        for option in q['options']:
            print(option)
        
        answer = input("Your answer: ").upper()
        if answer == q['answer']:
            print("Correct!\n")
            score += 1
        else:
            print(f"Wrong! The correct answer was {q['answer']}.\n")
    
    print(f"Game over! Your final score is {score}/10.")

# Run the game show
if __name__ == "__main__":
    game_show()