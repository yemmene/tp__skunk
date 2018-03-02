Overview

For this first Phase (TP 1.1) of the first Team Project, you will be assigned to a team of two students. You and your team member(s) will then study a provided specification of the game of Skunk. A separate document describes the detailed rules for this game.
By the end of this Project, you should have implemented a Java application that plays one round of the game of Skunk. For this first Phase, you are required only to implement "testable die and dice" classes along with unit tests for them.
You will work with your team partner in Eclipse, using EGit/Git and GitHub. I will grade your work by checking the final committed version of your code on the specified due date. You will continue working on this code across the remaining Phases of this Team Project.

Process Steps

Meet with your assigned team member(s) and review the Skunk specifications.

Together, you should review the provided Skunk specification (posted on our Canvas site within the TP 1 module). You will eventually implement all of its described behavior across multiple phases of this project, but you will first implement a version of the Skunk dice that make it easier to test your implementation.

Download and import the starting Skunk.zip archive file into the host's Eclipse workspace. 

Pick one of your team members, and designate them as the project host. Have each team member start Eclipse on their own PC, and configure it with their own Git credentials (GitHub name and email).

Download and import the Skunk.zip archived project into the host's local Eclipse workspace. It contains starting code the Skunk Eclipse project. Only do this for the host, initially. We will review how to do so in class.
The provided project has the required starting structure and code for your Skunk implementation, with a separate project source folder named test that should contain all of your JUnit test cases. It also contains an external library (.jar) called stdlib, which includes StdIn and StdOut for simple console-based I/O. This replaces the usual Java I/O console. Please use it for your UI.

Convert this local project into a Git-enabled one ("share the project").

Share the host's Eclipse project (Team->Share Project...), creating a local repository outside the Eclipse workspace on the host's PC. If working on a classroom PC, think about placing your repo in a folder on your Desktop so you can find it later. If working on your own PC, remember where you locate the repo.

Create, stage, and commit your beginning Java classes to the local Git repo.

Create a first class SkunkApp within your project. Then create a JUnit test case SkunkAppTest with its initial fail() test method for this class. Stage these new files ("Git add"), along with others in the project, then do your first commit to the local repo. Don't forget to provide a commit message! 

Create an empty GitHub repository tp_1_skunk under the host's GitHub account.

Add other team member's accounts as collaborators to the host's repo, along with my seis-635-spring2018 account. Make sure that all collaborators accept the GitHub-generated email invitation.

Push the previous commit to this remote GitHub repo, and check your work.

Push your commit to the empty GitHub repo under the host's account. Think about storing your GitHub logon credentials in Eclipse's secure storage, so you don't have to enter them over and over. Log onto the host's GitHub account, examine the repo and verify this first commit was successful.

Clone the GitHub repo to the non-host's local PC.

Now the other team member(s) should (each) clone the host's GitHub tp_1_skunk repo to their own local PC, whether classroom or laptop. Do so by logging onto their own GitHub account, then viewing and copying the shared host repo URI to the clipboard. (You did remember to add all team members as collaborators, didn't you?) Then do Import...->Git->Projects from Git->Clone URI and the URI in the clipboard should be automatically entered into the dialog. 
Note that you don't need to log onto GitHub to clone (download a copy) the host repo, since it's a public repo - but entering and saving the Authentication info (GitHub username and password) into Eclipse's secure store will allow you to skip logging on to GitHub for each repo access in the future.

Start your implementation of "testable" Skunk die and dice classes.

The random nature of rolling dice makes it tricky to test your evolving SkunkApp. Thus, start by implementing "pre-programmed dice" that can be initialized with a sequence of die values that should result when repeatedly rolling these "loaded dice." This can be one or multiple classes. (We'll discuss possible designs for such loaded dice in class.) You are expected to write complete JUnit tests for as much of your implementation as possible.


Try to implement using Test-Driven Development (TDD).

Remember the TDD procedure: (a) Write a failing test, with not compiling counting as a failure; (b) Write just enough code to make the test succeed; (c) Refactor both code and tests, removing duplication and improving readability. Repeat!


You are free to design your Java implementation in any way you wish. Ideally, TDD will guide you to good design, but don't worry about this yet. We'll discuss this process in class, with support readings and tutorials posted on Canvas.

Try Pair Programming. 

One common practice of TDD is "pair programming." One of the team members begins by controlling the keyboard on their own PC (the "boss"), with the other reviewing their work on both code and tests. As work proceeds, the boss should commit regularly to their local repo. Only push these commits to the remote host repo after each new test succeeds. Both author and committer here should be the boss.


After a while, the other team member should take over control of the keyboard, becoming the new boss. They should log into their own account on a classroom PC or their own laptop, working in their own clone of the host's GitHub repo. Since this remote repo now has committed changes beyond their original cloned version (upstream is ahead of the local repo), you'll have to pull the changes down to your local PC repository before continuing work. We'll discuss how to do this in EGit (the Eclipse Git toolset) in class.


As before, the boss commits changes regularly to the local PC repo. Be sure the boss is both author and committer on all commits. Continue to push each successful completion of new test commits to the remote GitHub host repo, occasionally consulting the remote site web page to verify your work.


Implement at least the starting Skunk die/dice classes. 

By the due date, you should have a complete implementation of "testable" Skunk die/dice classes, along with complete JUnit tests. You may continue with implementing more of the complete Skunk game if you wish, but this isn't required - yet. Make sure you've committed and pushed all your code and tests to the host's GitHub repo. Your code should have no syntax errors, and all tests should succeed. If so, and if all team members have done commits, then all team members will earn full credit. No other submissions are required.

Work concurrently as a team, managing merge conflicts in your commits.


Try working on your implementation with both team members working independently, ideally using TDD. Before starting a coding session, you should pull the latest changes from the host repo, merging them into the local repo. This will help to avoid Git merge conflicts.


If you encounter merge conflicts, resolve them as best you can; we'll see later how to deal with these situations that occur when both team members modify the same lines of code in the same files, and then try committing.


Grading is based on code committed by this Phase's due date.


Soon after this Phase's due date, I will grade your work by cloning each of your host repos (you did add seis-635-spring2018 as a collaborator, didn't you?), running all your tests, and making sure you've satisfied all the requirements. Your grade will be based on how exactly you follow the above requirements.
