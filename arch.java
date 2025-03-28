create a new repository on the command line
echo "# prc-git-pill-push" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/rodroca/prc-git-pill-push.git
git push -u origin main