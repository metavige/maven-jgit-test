## Maven with jgit

- Create new branch from `master`, like `feature/0.1.1`
- Make some changes, commit.
- `mvn validate` show version
- Change to `master`, merge from `feature/0.1.1`.
- Tag to `0.1.1`, then `mvn package` will make `xxxx-0.1.1.jar`