Use this file to record your reflection on this assignment.

What are your initial impressions of how `Unit Testing` affects your programming?
What worked, what didn't, what advice would you give someone taking this course in the future?

I've never used unit tests before, and I'm finding them incredibly helpful already. I can test to make sure certain sections of my code are working at a time, and in assignments like A4 where I'm building a framework, it is going to be way easier to use unit testing instead of creating a main method to make sure everything works. What helped me a lot for this assignment was deciding where I wanted local method variables and where to declare a set of class variables. I was able to reuse my testCar for a lot of the unit tests. 

I am completely lost on the test for printManifest, though. I can't just assert equals because the printManifest method is void and doesn't return anything. The CS tutor wasn't sure how I would solve it either, short of changing the void method to return a string which I don't think is what I'm supposed to do. A little outside research suggested using something I'm unfamiliar with called ByteArrayOutputStream, but again, if we didn't learn that in class I don't think that's the intended solution. I left that test as an automatic fail so I could turn this in and plan to revise once I've stopped by office hours. I also don't think JavaDoc comments are needed for unit tests, but I will go back and fix if they are. 

My tests, in order:
- testEngineConstructor: constructs an engine with three arguments and tests if each attribute equals the expected from arguments
- testEngineGo: tests if fuel level drops after running engine.go()
- testCarAddPassenger: tests if the number of empty seats decreases after adding a passenger
- testCarRemovePassenger: tests if removing a passenger that isn't on board returns false and if the number of empty seats increases after removing a passenger
- testPassengerBoardCarWithSpace: tests if a passenger is added to the car manifest after boarding
- testPassengerBoardCarFull: tests if a passenger is still added to the car manifest if boarding is unsuccessful because of a full car
- testTrainConstructor: constructs a train with an engine and tests two attributes (since engine was already tested)
- testTrainPassengerCount: tests if the number of seats remaining changes as passengers board and leave
- testTrainGetCar: tests if the appropriate car is returned by getCar()