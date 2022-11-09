### How to run

First run the "maven install" command to compile, run tests and create the jar package of the project.

Then run the project as a Java Application.

Send a GET request to the address http://localhost:8080/awardsInterval

For the provided movie list, the expected response should have HTTP Status 200 OK and the following body:

```json
{
    "min": [
        {
            "producer": "Bo Derek",
            "interval": 6,
            "previousWin": 1984,
            "followingWin": 1990
        }
    ],
    "max": [
        {
            "producer": "Bo Derek",
            "interval": 6,
            "previousWin": 1984,
            "followingWin": 1990
        }
    ]
}
```

The movielist.csv is in the src/main/resources folder.

### Integration Test

The path to the integration test is src/test/java/com/test/texoIt/TexoItApplicationTests.java

The test will do a GET request to the awardsInterval endpoint and check the expected HTTP Status code and response body.

###Contact
Name: Eduardo Yamamoto

Project repository: https://github.com/EduardoYamamoto/texoIt
