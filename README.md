# Jet Fighter (Team Daemon Demons)

## Members
[Dylan Nguyen](https://github.com/DylanNguyenGit)  
Puneet Tokhi  
Sandesh Gupta  
[Shradha Yewale](https://github.com/SHRADHA-YEWALE)  

## Summary
Jet fighter is a local multiplayer jet fighting game. Two players on the same keyboard control their own jet and try to shoot the other jet. The person who 
hits the other the most wins. Developed using Java and Greenfoot from scratch.

## Videos
* [User Story Video](https://www.youtube.com/watch?v=WlVwUZLluek)  
* [Demo Video](https://www.youtube.com/watch?v=9OzpEX2Uu2Y)

## Gameplay Screenshots
### Title Screen
![TitleScreen](/JetFighter/Screenshots/TitleScreen.png)
### Instructions Screen
![InstructionsScreen](/JetFighter/Screenshots/InstructionsScreen.png)
### Menu Screen
![MenuScreen](/JetFighter/Screenshots/MenuScreen.png)
### User Input
![UserInputcreen](/JetFighter/Screenshots/UserInput.png)
## Gameplay Screen
![GamePlay1](/JetFighter/Screenshots/GamePlay1.png)
![GamePlay1](/JetFighter/Screenshots/GamePlay3.png)
![GamePlay2](/JetFighter/Screenshots/GamePlay2.png)
![GamePlay1](/JetFighter/Screenshots/GamePlay4.png)
## Game Tied
![Tied](/JetFighter/Screenshots/Tied.png)
## Winner Screen
![Winner](/JetFighter/Screenshots/Winner.png)

## Key Features
* Player controlled Jets that turn and shoot
* A score and timer system that determines the winner of the game
* Game settings that allows players to change the speed of the bullets and jets

## Task Sheet & Burndown
[Task Sheet](https://docs.google.com/spreadsheets/d/1RcyCSWCNy9yeMHt_llLNDZoZeZGewSY5GR5uJhFoxaU/edit?usp=sharing)  
![](documentation/Burndown.png)  
Burndown chart finishes task before final date as the final week devoted to preparing for project submission and demo.

## Project task board
<img width="1431" alt="image" src="https://user-images.githubusercontent.com/22095857/168347517-529c3854-4f47-412f-b810-c515ad99a5ff.png">

![](documentation/TaskBoard2.png)  

## Design Patterns
### Strategy
![](./documentation/diagram/strategy.png)  
Strategy pattern is implemented in order to handle different control schemes in the same class. In this case, an IMovementStrategy is made that 
handles moving, turning, and shooting. One strategy is for controllling with the arrow keys while the other is to use the WASD keys to control the jet. 
The Jet class has methods that define each strategy and picks the correct one depending ont he instantiation. 
The strategy is then called in the act method to respond to the corresponding button presses.

### Command
![](./documentation/diagram/CommandPatternDiagram.png)
Command Pattern is used to add action listener to any button that is present in the game. In our project, the `MenuOption` class implements the `IMenuInvoker` interface so that when the `invoke()` method is called, the `MenuOption` performs some action added in the command that is attached to the button. In this case, we are creating buttons from the `Buttons` class which adds an inline receiver to `IMenuCommand` and attaches the command to the created button. There are two hash maps used in the `Buttons` class, one is for the menu option commands, and the other is for menu option images.

### Observer

![Observer pattern](https://user-images.githubusercontent.com/22095857/168407503-b302f0e4-959a-40e1-bf6d-6c476cf36ccf.jpg)

Observer pattern is a design pattern in which a subject notifies an object automatically of any state change usually by calling their methods. Here `IDetectSubject` is a subject interface with `notifyObservers()` and `Jet` class(acts as subject) implements it. The `Jet1` and `Jet2` class extends the Jet class to implement the `notifyObservers()`. When the hit is detected, that is when Jet1 hit by Bullet2, jet 2 score is updated and when Jet2 hit by Bullet1, jet 1 score is updated. 

`IUpdateScoreObserver` acts as an object interface. Score (acts as object) which implements `updateScore()` to update the score when there is a detect hit(state change) in `Jet1` and `Jet2`. `JetOneScore` will update the Jet1 score when Jet2 hits by Bullet1 and `JetTwoScore` will update the Jet2 score when Jet1 hits by Bullet2.



## Architecture Diagram

![](documentation/diagram/Architecture_diagram.png)

## Deployment Diagram

![Deployment Diagram](https://user-images.githubusercontent.com/22095857/168148446-4e77f1c9-67ca-4232-8fae-32e1950ad7ca.jpg)

## Class Diagram

![Class Diagram](documentation/diagram/Class_Diagram.png)

## Wireframes

| Screen  | Wireframe |
| ------------- | ------------- |
| Homescreen  | ![](documentation/wireframes/1-Homepage-2x.png)  |
| Menu  | ![](documentation/wireframes/2-Menu-2x.png)  |
| Settings | ![](documentation/wireframes/3-Settings-2x.png) |
| Game | ![](documentation/wireframes/4-Game-2x.png) |
| Post Game | ![](documentation/wireframes/5-Post_Game-2x.png) | 

## Journals/Contributions

| Name  | Design Pattern |
| ------------- | ------------- |
| Dylan Nguyen  | Strategy |
| Puneet Tokhi  | Command  |
| Sandesh Gupta | Decorator|
| Shradha Yewale | Observer|

### Dylan Nguyen 
[Journal](./journals/dylan.md)  
* Worked primarily on the `Jet` and the `Bullet` components. This involved movement, shooting, and overall behavior such as bullet fire rate and range. 
* Made the `Jet` class available to alteration for different settings 
* Made subclasses `Jet1`, `Jet2`, `Bullet1`, and `Bullet2` to make hit detection and score updates easier.
* Used `Strategy Pattern` with `IMovementStrategy` to make the different control schemes of arrow keys and WASD.
* Made Demo video

### Puneet Tokhi 
[Journal](./journals/puneet.md)
* Worked on implementing the `Menu`, `Instructions`, `Settings` and `GameSettings` screen
* Implemented the `Explosion` and `Instructions` class and added code to animate the game background to enhance the user experience
* Used the `Command Pattern` to implement the Menu and Settings screen. Created `Buttons` and `MenuCommand` class and required invoker and receiver interfaces to implement the Command Pattern. All buttons used in the game are in `Buttons` class and the command pattern is used to assign functionality to buttons and labels.
* Added game assets including the title screen, background music, explosion sound, bullet sounds and the menu navigation sounds
* Created the `Player` class to get the Player's information from the user when the game is started 
* Added the `Jet` and `Bullet` speed configurations in the settings screen, fixed score display bug, and updated the `WinnerBanner` class to enhance user experience
* Worked on the project documentation and class diagrams and helped the team in creating the user story video

### Sandesh Gupta 
[Journal](./journals/sandesh.md)

* Worked on creating `Assets`, `Timer`, `Settings` and `Post-game` screen.
* Assets
  * Create Jet and Bullet asset. 
  * Integrated the assets with gameplay.
* Timer
  * Implemented the timer logic
  * Display timer in game
  * Timer blink when game is about to end
  * Implemented Timer using Decorator design pattern
* Settings
  * Add functionality for increment and decrement of speed in Settings screen
  * Reflect speed changes in gameplay
  * Vaidation of speeds: Min, max and Jet speed < Bullet speed
* Post-game screen
  * Designed and implemented the post-game screen with the game results.
* Documentation 
  * Architecture diagram
  * Class diagram 
  * UI wireframes
  * User strory video

### Shradha Yewale 
[Journal](./journals/shradha.md)

* I primarily worked on the Score feature for `Jet1` and `Jet2`.
* Used an `Observer Pattern` to implement the score feature.
* Implemented major functionalities such as Detect Hit, Update Score, Display Score and Reset Score in score feature.
* `Detect Hit` : Detect the hit for `Jet1` with `Bullet2` and `Jet2` with `Bullet1` to notify about the hit to update score.
* `Update Score` : Once the hit is detected updated the score in JetOneScore and JetTwoScore
* `Display Score` : `JetOneScoreDisplay` and `JetTwoScoreDisplay` to display the score. worked on display score design and layout on screen.
* `Reset Score` : Whenever the game is finished and a new game is started the score is resetted to 0.
* Actively participated in discussions right from game selection, tasks identification, feature distributions, patterns to implemented, scrum meeting and implemented feedback core value.
* Worked on project documentation of the project. Draw the class diagram for the observer design pattern. Also made a deployment diagram for the project.
* Contributed in making the user video for Jet fighter.




