Test framework (Java + Selenide + TestNG + Allure)

Run test - `mvn clean test -Dbrowser=chrome -Dheadless=1` or just `mvn clean test`

**parameters:**

- `browser` - chrome or firefox. default - chrome 
- `headless` - 0 or 1. default - 0

Generate allure report - mvn allure:serve
