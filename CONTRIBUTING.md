# Contribution Guidelines



### How can you contribute to Crio Open Source in #IBelieveinDoing Hacktoberfest Edition?



In two ways:

- **As a Creator**
- **As a Learner**



A creator can add a new MicroByte by choosing a topic from here - [MicroByte Topics](https://docs.google.com/spreadsheets/d/15SY0OvF-ruqVtvWUogxRg51m6J5VZhbyGECPYIsQdi8/edit?usp=sharing), or can create a topic of their own and choose a respective master repo for the same. Creators must follow the MicroByte Structure as mentioned in the [getting started guide](https://docs.google.com/document/d/1WYVo-O1--RX3hGr6hxPRm6Mz_ky1ErNDUfUZv6oEw_s/edit#heading=h.bc09i7s92ri9). 



A learner can help creators improve the MicroBytes by adding new functionality, fixing bugs, enhancing the learning content or adding better references. 

There are no restrictions on the roles, any participants can make PRs either as a Creator, a Learner or Both. 

Kindly refer the aforementioned [getting started guide](https://docs.google.com/document/d/1WYVo-O1--RX3hGr6hxPRm6Mz_ky1ErNDUfUZv6oEw_s/edit#heading=h.bc09i7s92ri9) for detailed instructions.

#### Note for issue creation and PR proposals

Kindly utilise the templates provided in the `.github` directory of the main branch to create relative issues and PRs. You can also go adventurous if you have something fun in your mind, but kindly maintain a similar workflow by taking the already available templates as a reference.

For working on a brand new MicroByte, utilise the issue template `Add MicroByte` using the GitHub UI.

For updating a MicroByte in stock, utilise the issue template `Update MicroByte` using the GitHub UI.

For proposing a PR with a new MicroByte, utilise PR template `adding-microbyte.md` using GitHub API.

For proposing a PR with updates to an existing MicroByte, utilise PR template `updating-microbyte.md` using GitHub API.



### Instructions regarding traditional workflow

**</> Git Workflow </>**

```bash
## It all starts with forking the repository

## Clone the repo
$ git clone https://github.com/<User-Name>/<Repo-Name>.git
# - OR -
$ git clone git@github.com:<User-Name>/<Repo-Name>.git

## Add upstream remote
$ git remote add upstream https://github.com/Crio-Bytes/Miscellaneous.git
# - OR -
$ git remote add upstream git@github.com:Crio-Bytes/Miscellaneous.git

## Syncing with upstream/main branch
$ git fetch upstream
$ git checkout main
$ git merge upstream/main

## To create and shift to working branch
$ git checkout -b <name>/<microbyte-name|issue>/{<add|update|additional-fixes>}

## Types of additional-fixes:
# wip - Work in Progress; long term work; mainstream changes
# feat - New Feature; future planned; non-mainstream changes
# bug - Bug Fixes
# exp - Experimental; random experiemntal features

## Ensure branch
$ git branch

## Wildcard to add all folder and file changes in current branch
$ git add --all .

# Committing all changes with appropriate commit message and description
$ git commit -m "your-commit-message" -m "your-commit-description"

## To publish working branch to your forked repository
$ git push origin <branch-name>

## Creating the PR using GitHub UI
# Create Pull Request from the working branch in your forked repository to the master branch in the upstream repository
# Link Pull Request to appropriate Issue, or Project+Milestone (if no issue created)
# IMPORTANT: Do Not Merge the PR unless specifically asked to by an admin or approved by at least 2-3 maintainers.
# NOTE: Contributors who are among maintainers and/or collaborators have merge permissions.

```



**</> After PR Merge/Close </>**

```bash
## Syncing with upstream/main branch
$ git fetch upstream
$ git checkout main
$ git merge upstream/main

## Delete branch from forked repository
# Deleting the branch in local repository
$ git branch -d <branch-name>
# Deleting the branch in remote repository
$ git push --delete origin <branch-name>
```



#### References:

- [Fork a repo](https://docs.github.com/en/free-pro-team@latest/github/getting-started-with-github/fork-a-repo)

- [About forks](https://docs.github.com/en/free-pro-team@latest/github/collaborating-with-issues-and-pull-requests/about-forks)
- [Fork-And-Branch workflow](https://blog.scottlowe.org/2015/01/27/using-fork-branch-git-workflow/)

- [Commit message standards](https://chris.beams.io/posts/git-commit/)
- [Configuring a remote for a fork](https://docs.github.com/en/free-pro-team@latest/github/collaborating-with-issues-and-pull-requests/configuring-a-remote-for-a-fork)
- [Syncing a fork](https://docs.github.com/en/free-pro-team@latest/github/collaborating-with-issues-and-pull-requests/syncing-a-fork)