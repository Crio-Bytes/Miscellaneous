# Introduction
There comes a certain point in every new developers journey where they need to manage the entirety of their application. I’m not talking about deploying a project, but in reference to managing all the files of your project in one specific location. Say you have a project saved to your desktop and one day your system crashes.  How terrible would it be if that file was just gone. Well this is where version control software comes into the picture! 

# What is Git ?

Git is a version-control system for tracking changes in computer files and coordinating work on those files among multiple people. Git is a Distributed Version Control System. So Git does not necessarily rely on a central server to store all the versions of a project’s files. Instead, every user “clones” a copy of a repository (a collection of files) and has the full history of the project on their own hard drive.

## Git vs Github 

Git is a revision control system, a tool to manage your source code history.

GitHub is a hosting service for Git repositories.

So they are not the same thing: Git is the tool, GitHub is the service for projects that use Git.

## Worksflow
### What is a Repository ?

A repository also know as repo is nothing but a collection of source code.
### There are four fundamental elements in the Git Workflow.

Working Directory, Staging Area, Local Repository and Remote Repository.
![img](https://miro.medium.com/max/700/1*iL2J8k4ygQlg3xriKGimbQ.png)

## Installation

Create a account in [Github](https://github.com/).

Click the [link](https://gitforwindows.org/) to install git in your machine.

Open your terminal and make sure you have installed Git.
```
$ git --version
```


## Configuration
Tell Git who you are.
```
$ git config --global user.name "YOUR_USERNAME" 
$ git config --global user.email "YOUR_EMAIL"
$ git config --global --list # To check the info you just provided
```

## Activity 1 : Creating a Repo and Adding files
Create a Repo in [Github](https://github.com/). You can choose between public and private repo.
Public Repositories : They're visible to any user on GitHub.
Private Repositories : They're only available to the repository owner.

![Git Hub Repo](https://github.com/itherohit/Miscellaneous/blob/GitMicroByte/Git_Fundamentals/images/GithubRepo.JPG)


In your local machine make a folder and Create a file
```bash
mkdir NewRepo
cd NewRepo
touch index.txt
```

For every project we work with git, we have to initialize a git repo.
```
$ git init
```
This command creates an empty Git repository - basically a .git directory with subdirectories for objects, refs/heads, refs/tags, and template files. An initial HEAD file that references the HEAD of the master branch is also created.

```bash
$ git add <file_name>   #Add a Specific file 
OR
$ git add .     #Add all the files
```

This command is used to add a file that is in the working directory to the staging area.

```bash
$ git commit -m "Initial Commit"     #Commit files with a message
```

This command is used to add a file that is in the working directory to the staging area.

### Add a remote origin and Push:

Now each time you make changes in your files and save it, it won’t be automatically updated on GitHub. All the changes we made in the file are updated in the local repository. 

```bash
$ git remote add origin remote_repository_URL
```
Get the remote url from Github.
The git remote command lets you create, view, and delete connections to other repositories.

```bash
$ git branch -M main         #Eager to know about this command than google it
$ git push -u origin main    #For the first time
$ git push
```
Now the git push command pushes the changes in your local repository up to the remote repository you specified as the origin.

And now if we go and check our repository page on GitHub it should look something like this:
[img]

### See the Changes you made to your file:

Once you start making changes on your files and you save them, the file won’t match the last version that was committed to git. To see the changes you just made:
```bash
$ git diff   #To show the files changes not yet staged
```

### Revert back to the last committed version to the Git Repo:

Now you can choose to revert back to the last committed version by entering:
```bash
$ git checkout .
OR for a specific file
$ git checkout -- <filename>
```


## Activity 2 : Cloning and Branching

Now we know how to add files to our repo. Let's learn how to download and work on other repositories.Locate to the directory you want to clone the repo. Copy the link of the repository you want and enter the following.
```bash
$ git clone remote_repo_url
```
Now that repo will be available locally. You can now change files and add it to your own repository.

Open the folder in your favorite text editor and modify the content present in it. Then initialize git and push it to your repo.
[img]

```bash
$ git init
$ git remote add origin remote_repository_URL   #Create a repo in Github
$ git add .
$ git commit -m "Text changed"
$ git push 
```

Have you ever wondered how developers add new features without having any conflicts  with the main source. That is where we can use branching.

### How Branching works ?
A branch represents an independent line of development. Branches serve as an abstraction for the edit/stage/commit process. You can think of them as a way to request a brand new working directory, staging area, and project history.

```bash
$ git branch   #Lists all the available branches
$ git checkout -b "New_branch_name"    #Creates a new branch and switches to the branch
$ git branch -d   #To delete the branch
```

Create a new branch and add a new file. When you checkout to main you will not see the file that you created in the new branch.

```bash
$ git merge
```
This command lets you to merge your new branch with  main.

If your working in a team and your teammate makes changes and pushes it to the repo. You can directly get all the changes to your local machine by git pull command.

```bash
$ git pull
```
git pull runs git fetch with the given parameters and calls git merge to merge the retrieved branch heads into the current branch.


## Activity 3 : Forking and Pull Request

Creating a “fork” is producing a personal copy of someone else's project. Forks act as a sort of bridge between the original repository and your personal copy. You can submit Pull Requests to help make other people's projects better by offering your changes up to the original project.



## Making and pushing changes

Go ahead and make a few changes to the project using your favorite text editor.

When you’re ready to submit your changes, stage and commit your changes.

## Making a Pull Request

At last, you’re ready to propose changes into the main project! This is the final step in producing a fork of someone else’s project, and arguably the most important.

Clicking on Compare and Pull Request sends you to a discussion page, where you can enter a title and optional description. It’s important to provide as much useful information and a rationale for why you’re making this Pull Request in the first place.

You’ve successfully forked and contributed back to a repository. 

## Common Mistakes to avoid
* Misspelling the Last Commit Message
* Added a wrong file in the repo
* Forgot to add a file to that last commit
* You Pushed a Commit That Has a Problem in It
* Spelling mistake on branch name
* Accidentally committed all changes to the master branch


## References & Useful links
* [https://git-scm.com/doc](https://git-scm.com/doc)
* [Blog](https://www.freecodecamp.org/news/learn-the-basics-of-git-in-under-10-minutes-da548267cc91/)
* [Atlassian Tutorial](https://www.atlassian.com/git/tutorials)
* [Cheatsheet](https://www.atlassian.com/git/tutorials/atlassian-git-cheatsheet)