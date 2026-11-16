# Git & GitHub – Complete Study Notes
## How to Push a Java Project from Eclipse to GitHub

### 1. What is Git?

Git is a **Distributed Version Control System (DVCS)** used to track changes in source code.

It helps developers:
- Track code changes.
- Maintain different versions of a project.
- Restore previous versions.
- Work with multiple developers.
- Manage project history.

**Example:** If you modify your Java code and something goes wrong, Git helps you return to an earlier committed version.

### 2. What is GitHub?

GitHub is a cloud-based platform that hosts Git repositories.

It helps developers:
- Store projects online.
- Share code with others.
- Collaborate with developers.
- Maintain project repositories.
- Showcase projects to recruiters.

**Difference between Git and GitHub:**

| Git | GitHub |
|---|---|
| Version control system | Cloud hosting platform |
| Installed locally | Accessed online |
| Tracks code changes | Stores Git repositories |
| Works on your computer | Allows collaboration |

### 3. Important Git Terminologies

**Repository (Repo)**

A repository is a location where project files and their version history are maintained.

**Working Directory**

The folder where you create and modify your project files.

**Staging Area**

An intermediate area where we select files before committing them.

**Commit**

A snapshot of staged changes saved in Git history.

**Remote Repository**

A repository hosted on a platform like GitHub.

**Branch**

A separate line of development. The default branch is commonly named `main`.

**Origin**

The default nickname given to a remote repository.

### 4. Git Workflow

The basic Git workflow:

Working Directory → Staging Area → Local Repository → Remote Repository

- Working Directory: Write Java code.
- Staging Area: Select files using `git add`.
- Local Repository: Save changes using `git commit`.
- Remote Repository: Upload changes using `git push`.

---

# 5. Practical: Push a Java Project to GitHub

**Project details:**

- IDE: Eclipse
- Project: jdbcProg
- GitHub username: GOKULAN36
- Repository: jdbc
- Local location: `C:\Users\HP\eclipse-workspace\jdbcProg`
- GitHub URL: `https://github.com/GOKULAN36/jdbc.git`

### Step 1: Locate the Java Project

Find your project folder in Eclipse.

Right-click the project → Properties → Resource → Location.

Copy the project location.

### Step 2: Open Command Prompt

Open the project folder in File Explorer.

Click the address bar, type:

`cmd`

Press Enter.

Command Prompt opens inside your project folder.

### Step 3: Initialize Git

Command:

`git init`

Explanation:

Initializes an empty Git repository inside your Java project.

It creates a hidden `.git` folder that stores Git version history and configuration.

### Step 4: Check Git Status

Command:

`git status`

Explanation:

Displays the current status of your project files.

It shows:
- Untracked files.
- Modified files.
- Staged files.
- Current branch.

### Step 5: Create a .gitignore File

Command:

`echo target/ > .gitignore`

Explanation:

Creates a `.gitignore` file and adds `target/` to it.

Why?

Maven generates compiled files and other build output inside the `target` folder.

We generally don't need to upload these generated files to GitHub.

Git ignores files and folders specified in `.gitignore`, provided they haven't already been tracked.

### Step 6: Add Files to Staging Area

Command:

`git add .`

Explanation:

Adds all eligible files and folders from the current directory to the staging area.

The dot (`.`) represents the current directory.

### Step 7: Commit the Files

Command:

`git commit -m "Initial commit"`

Explanation:

Saves the staged changes as a snapshot in the local Git repository.

- `git commit`: Saves the snapshot.
- `-m`: Specifies the commit message.
- `Initial commit`: Describes the first commit.

### Step 8: Verify the Commit

Command:

`git status`

Expected output:

`nothing to commit, working tree clean`

Explanation:

It means there are no pending changes to commit.

### Step 9: Create a GitHub Repository

1. Open https://github.com
2. Click New Repository.
3. Enter the repository name.
4. Select Public or Private.
5. Click Create Repository.

For this project, the repository URL is:

`https://github.com/GOKULAN36/jdbc.git`

### Step 10: Connect Local Repository to GitHub

Command:

`git remote add origin https://github.com/GOKULAN36/jdbc.git`

Explanation:

Connects your local Git repository to your GitHub repository.

- `remote`: Manages remote repositories.
- `add`: Adds a remote connection.
- `origin`: Nickname for the remote repository.
- URL: GitHub repository address.

### Step 11: Verify Remote Connection

Command:

`git remote -v`

Explanation:

Displays the remote repository URLs.

Expected output:

`origin https://github.com/GOKULAN36/jdbc.git (fetch)`

`origin https://github.com/GOKULAN36/jdbc.git (push)`

### Step 12: Rename the Branch

Command:

`git branch -M main`

Explanation:

Renames the current branch from `master` to `main`.

- `branch`: Manages branches.
- `-M`: Renames the branch, forcing the change if necessary.
- `main`: New branch name.

### Step 13: Push the Project to GitHub

Command:

`git push -u origin main`

Explanation:

Uploads your committed project from the local repository to GitHub.

- `push`: Uploads commits.
- `-u`: Sets the upstream tracking relationship.
- `origin`: Remote repository nickname.
- `main`: Branch to upload.

After successful authentication and upload, your project becomes available in your GitHub repository.

---

# 6. All Commands at One Place

| Command | Purpose |
|---|---|
| `git init` | Initialize Git |
| `git status` | Check project status |
| `echo target/ > .gitignore` | Ignore Maven target folder |
| `git add .` | Add files to staging |
| `git commit -m "Initial commit"` | Save a commit |
| `git remote add origin URL` | Connect GitHub |
| `git remote -v` | Verify remote URL |
| `git branch -M main` | Rename branch |
| `git push -u origin main` | Push to GitHub |

---

# 7. How to Push Future Changes

Important: You don't need to repeat the entire process every time you modify your Java project.

Suppose you modify `Connect_jdbc.java` or create a new Java class.

You only need these three commands:

**Step 1: Add changes**

`git add .`

Adds the latest eligible changes to the staging area.

**Step 2: Commit changes**

`git commit -m "Updated JDBC programs"`

Saves the changes in local Git history.

**Step 3: Push changes**

`git push`

Uploads the new commits to GitHub.

That's it!

### Future workflow

Modify Code → `git add .` → `git commit` → `git push`

---

# 8. Important Additional Git Commands

| Command | Purpose |
|---|---|
| `git log` | View commit history |
| `git diff` | View unstaged changes |
| `git diff --staged` | View staged changes |
| `git branch` | List local branches |
| `git switch main` | Switch to main branch |
| `git clone URL` | Download a repository |
| `git pull` | Fetch and integrate remote changes |
| `git remote remove origin` | Remove remote connection |
| `git restore filename` | Discard unstaged changes in a file |
| `git rm filename` | Remove a tracked file |
| `git show` | Display a commit's details |

---

# 9. Common Git Errors

**Error 1: 'git' is not recognized**

Reason: Git may not be installed or configured in PATH.

Solution: Install Git for Windows and restart Command Prompt.

**Error 2: Repository not found**

Reason:
- Incorrect GitHub URL.
- Repository doesn't exist.
- No access permission.

Solution: Verify your repository URL and permissions.

**Error 3: Nothing to commit, working tree clean**

Reason: No new changes are available to commit.

Solution: Check whether you modified or created any files.

**Error 4: Authentication failed**

Reason: GitHub authentication failed.

Solution: Sign in using an authorized authentication method, such as Git Credential Manager or a personal access token.

**Error 5: Remote origin already exists**

Reason: A remote named `origin` is already configured.

Solution: Check it using:

`git remote -v`

If you need to change the URL:

`git remote set-url origin NEW_URL`

---

# 10. Java Developer Interview Questions

**Q1. What is Git?**

Git is a distributed version control system used to track changes in source code.

**Q2. What is GitHub?**

GitHub is a cloud-based platform used to host Git repositories and collaborate with developers.

**Q3. What is the difference between Git and GitHub?**

Git is a version control system, whereas GitHub is a platform that hosts Git repositories online.

**Q4. What is git init?**

It initializes a new Git repository in the current project directory.

**Q5. What is git add?**

It moves selected changes from the working directory into the staging area.

**Q6. What is git commit?**

It saves staged changes as a snapshot in the local repository.

**Q7. What is git push?**

It uploads local commits to a remote repository.

**Q8. What is git pull?**

It fetches changes from a remote repository and integrates them into the current branch.

**Q9. What is git clone?**

It creates a local copy of an existing remote repository.

**Q10. What is the purpose of .gitignore?**

It specifies files and folders that Git should ignore when tracking untracked files.

**Q11. What is a staging area?**

It is an intermediate area where changes are prepared before committing.

**Q12. What is origin in Git?**

Origin is the conventional default name given to a remote repository.

**Q13. What is a branch?**

A branch is an independent line of development in Git.

**Q14. Why do we use git status?**

To check the current state of files and identify staged, unstaged and untracked changes.

**Q15. What is the difference between git fetch and git pull?**

`git fetch` downloads remote changes without integrating them into the current branch. `git pull` fetches and integrates them.

---

# 11. Important Points to Remember

1. Git is used for version control.
2. GitHub is used for online repository hosting.
3. `git init` initializes the repository.
4. `git add .` stages eligible changes.
5. `git commit` saves a local snapshot.
6. `git remote add origin` connects the remote repository.
7. `git push` uploads commits to GitHub.
8. `git pull` retrieves and integrates remote changes.
9. `.gitignore` excludes specified untracked files.
10. Future updates generally require only add, commit and push.

**Security reminder:** Before making a repository public, check that your Java files do not contain database passwords, API keys, tokens or other secrets. Never commit real credentials.

## Final Git Workflow

`git init` → `git add .` → `git commit` → `git remote add origin` → `git branch -M main` → `git push -u origin main`

**You have now completed your first Java project upload using Git and GitHub!**
