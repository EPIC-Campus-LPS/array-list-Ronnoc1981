## Chat History

First, create a program which allows the user to enter sentences over and over, adding each word in the sentence to an ArrayList. When the word `"STOP"` is entered, stop allowing the user to enter input and move on to the analysis phase. 

For the analysis phase, determine and print the following:
- The number of total words
- The number of unique words
- The number of times "the" appears
- The longest word
- If all words are lowercase or not

Then print a condensed version of the chat history with all duplicates and three letter or less words removed.

A complete run of the program will look like this:
```
Enter a sentence: the quick brown fox jumped over THE LAZY DOG
Enter a sentence: hello there
Enter a sentence: HELLO WORLD
Enter a sentence: STOP

Chat Report:
You used 13 words.
You used 11 unique words.
You used "the" 2 times.
"jumped" was the longest word.
Are all words lowercase? false

Condensed Chat History:
quick
brown
jumped
over
lazy
hello
there
world
```

## Leaderboard

First, create the class `Score`. `Score` has the two instance variables described below and appropriate constructor/getters/setters.

| Variable    | Description                                              |
| ----------- | -------------------------------------------------------- |
| String name | A three letter name(all caps) associated with each score |
| int score   | A numerical score                                        |

Also, create a `toString()` method for the `Score` class. 

Then, create the class `Leaderboard`. `Leaderboard` has two instance variables described below. 

| Variable                      | Description                                                                                                                                             |
| ----------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| int capacity                  | The capacity of the scoreboard. The number of scores on the scoreboard must not exceed this number.                                                     |
| ArrayList\<Score\> scoreboard | An ArrayList of `Score` representing the scoreboard. The items are stored with the largest first, then the second largest, then the third largest, etc. |

`Leaderboard` has one constructor: `Leaderboard(int capacity)` which initialized the `capacity` of `Leaderboard` and creates a new ArrayList of the given capacity. 

`Leaderboard` has the following methods: 

| Method                                       | Description                                                                                                                                                                                                                                                                                |
| -------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| public void addScore(String name, int score) | This adds a new score to the scoreboard in the appropriate location. The scoreboard should always maintain it's order of the largest as the first element, the second largest as the second etc. If adding the score exceeds the max capacity, remove the element with the smallest score. |
| public int getHighScore()                    | Returns the high score of the scoreboard                                                                                                                                                                                                                                                  |
| public int getAverageScore()                 | Returns the average score of the scoreboard                                                                                                                                                                                                                                                |
| public boolean break1000()                   | Returns true if one of the scores on the scoreboard has over 1000 points                                                                                                                                                                                                                   |
| public void printLeaderboard()               | Prints the scoreboard, largest first.                                                                                                                                                                                                                                                      |
Test your code with the following main method: 

```java
public static void main(String[] args) {  
    Leaderboard board = new Leaderboard(5);  
  
    board.addScore("ABC", 100);  
    board.addScore("DEF", 200);  
    board.addScore("GHI", 250);  
    board.addScore("JKL", 300);  
    board.addScore("MNO", 205);  
  
    System.out.println("High Score: " + board.getHighScore());  
    System.out.println("Average Score: " + board.getAverageScore());  
    System.out.println("Did a player break 1000 points?: " + board.break1000());  
  
    System.out.println("\nLeaderboard: ");  
    board.printLeaderboard();  
  
    System.out.println("\nLeaderboard: ");  
    board.addScore("PQR", 150);  
  
    board.printLeaderboard();  
  
}
```
