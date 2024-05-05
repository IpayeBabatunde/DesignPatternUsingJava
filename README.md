DESIGN PATTERN USING JAVA EDITED & RE-COMPOSED BY IPAYE BABATUNDE👩‍💻💻

 Software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. This is the definition written on Wikipedia for software design patterns...The above definition makes sense to you if you are an experienced developer and spent some time writing the code for some software but the same line is just going right over your head and sounds boring if you are a beginner and completely unaware of it. Let's discuss with experienced developers first....(beginners please wait for a moment or just skip the next paragraph). 

 
Design-Patterns-Understand-The-Importance-With-Real-Life-Examples


Software design patterns...interesting topic yeah? You might have enjoyed your development career working on some design patterns and solving the problems that occur over and over again in your projects. You might be also aware that how it makes code reusable and increase the productivity of developers. Design patterns are common vocabulary for developers to talk about software solutions. When you (as a developer) say "We should implement this using the singleton pattern" all the other developers clearly understand that what's the common point of reference. 
Enough talk to you (experienced one...we will get back to you) now let's come to the beginners or newbie programmers...Forget about the technical stuff and let's have a friendly discussion first... 

 
Real-World Example



Do you love food? (Everyone loves that)... Which one is your favorite restaurant? Where do you visit most? Do you love street food or you prefer some online app Zomato and Swiggy? You might have tried different cuisines and you might have experimented with different places as well. If there is a favorite restaurant in your list where most of the time you love to eat your favorite dish then what's the reason behind that?. Of course, the experienced chef of that restaurant might be using a specific technique to prepare the dish. What if you also want to prepare the same food with the same test at home? what do you need to do now? You need to follow the same approach or technique used by the experienced chef. They might have tried many recipes and they might have changed their approach to prepare that dish. Finally, at one point they stopped when they learned a particular technique to prepare that specific dish and it tastes good. 

Well if you also want to prepare the same dish that tastes good like in your favorite restaurant then you need to follow the same approach and techniques given by the experienced chefs or you need to approach your friend who cook good and prepares dishes using some specific technique. 

Enough talking about food, let's come to the design patterns. Notice the words highlighted above, tried many recipes, changed their approach, experienced chef and cook really good. The same is the case with design patterns. Design Patterns are like some of the best practices used by chefs (Gang of Four (GoF)) to prepare a dish so that it tastes the best. 

 
Design patterns are some design practices used by experienced object-oriented software developers (experienced chef or friends in our context). They are general solutions to problems faced during software development.
They are the solutions obtained by trial and error (trying many recipes) by numerous software developers over a substantial period.


 

Design patterns don't solve the problem themselves, they help us solve the problem.

 

Let's have some technical discussion about Design Patterns. 

Gang of Four (GoF)) experienced problems over time which they solved. They noticed some of these solutions can be categorized and some problems are always very prevalent and common (as common as poverty). So technically, design patterns are just templates that give a proper flow, linking, and structure to your code. It's a communication tool or you can say a general solution given by experienced software developers to solve commonly occurring problems that developers face during the development phase of the software. 

Computing researchers and practitioners developed a variety of organizational concepts and methodologies for designing quality object-oriented software that is concise, correct, and reusable, which describes a solution to a “typical” software design problem. A pattern provides a general template for a solution that can be applied in many different situations. You can use these templates million of times to solve some specific types of problems. 

 

Do you know that only 11% of programmers use design diagrams more than 75% of the times?

 

Now you might have a question that why do we need to fit our problems into some design patterns...why can't we use our technique. What's the benefit of using it? Surely we are going to talk about this... 

 
Purpose of Design Patterns



 
You are running a restaurant. Running a restaurant doesn't mean only preparing food and serving it to the customers. You also need to take care of delicious food, clean dishes, common problems that waiters, chef or other employees are facing in your restaurant. Being a restaurant owner you need to give solutions to those general problems as well. 
Being a software engineer your purpose should not be only writing a bunch of code but also to reduce complexity and taking care of code reusability as well. You will be expected to write a clean, elegant, bug-free and manageable code so that other developers can understand and later if it requires any kind of change then it can be done with minimal effect on your entire project and here design pattern plays a crucial role. 
 

The purpose of software engineering is to control complexity, not to create it. 
-Pamela Zave

You are building a house yourself without any plan. You have a rough idea of what you want or need for the house and you start building the first wall, then the second wall and so on. Sooner you find out that this is not going to work and it can be more problematic if you are building the house with multiple people. How will they know what to do without a plan? The same thing goes for software. 
In software development, you can build an application without upfront design. Especially if you can re-use an existing design. (e.g. adding a new page to a website does not require you to re-design everything. You can just follow how other pages were made and re-use the same build pattern). You can check the existing solution for the similar kind of problem you are dealing with and use the technique or use some code from there to solve your own problems.
Suppose you are a student or a CAT aspirant. To solve some aptitude questions or mathematics problem you might be using some formulas or techniques. You apply those formulas or techniques to solve some similar kinds of problems. You know that you just rescued a few lines or principles and your efforts get reduced. You also saved your time as well. In software development, design patterns play this crucial role (mathematics formula or technique).
In software development suppose you are writing some piece of code, you realize you did a mistake. Correcting it needs changes in 10 more files. This implies your design, if you made, wasn't good in the first place. What did this mistake cost you?....you wasted a lot of time, some resources, efforts and it also affected the other developer's productivity.


You might have got the clue that how important design patterns are in software development. Let's take an example that you are working on a project. Your project has a notification system. You have 15 classes of code. 13 of these classes generate notifications. You write code in each of them to communicate with your notification class. 

After a couple of days, things change and you have 10 more classes, you add notifications to those classes as well. Your notifying mechanism changes, you go in all 10+13 classes and change the code. Now your code doesn't make sense to you. You realize that all these classes should be decoupled from the notification system. You make a new class and put all the notification logic there. And then you come up with abstractions that allow absolutely anything to notify your system with a minimum ripple effect and maximum re-usability. 

Did you notice that you just invented the observer or pattern for your whole code? If you knew this pattern before, you haven't faced all those issues and you haven't wasted a lot of time as well. Being a software engineer you are expected to build software that makes sense. Now we can summarize the importance of design patterns from the below points… 

 
It makes code reusable, bug-free, and clean.
Speed up development process.
Changes or modification become easier.
Reduce common problems of developers they face during development process.
Improve object oriented skill.
Easy to understand the flow of code.
Less code so easy to maintain.


 

Patterns don't provide solutions, they inspire solutions.

In addition, we have many TYPES OF DESIGN PATTERN
But i wlln only discuss the few i know:-
1. MOMENTO PATTERN - This pattern is used for implementing a new mechanism in our classes 
this mechanism are divided as
- originator 
- momento
- caretaker

2. STATE PATTERN - this pattern allows an object to behave differently when the states changes.
NB - ENUM is a type of class in java which is a set a constant
NB - Simplicity is the ultimate Sophistication 
