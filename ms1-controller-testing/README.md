# MS1 Controller MockMvc Test

This Maven Spring Boot project demonstrates an isolated controller test for `GET /ms1/add?a=5&b=10`.

## Requirements

- Java 17 or later
- Maven 3.6 or later (or the Maven bundled with STS4/Eclipse)

## Run the test

From the project directory:

```powershell
mvn test
```

Or in STS4/Eclipse:

1. Select **File > Import > Maven > Existing Maven Projects**.
2. Choose the extracted `ms1-controller-testing` folder.
3. Open `MS1ControllerTest`.
4. Right-click it and select **Run As > JUnit Test**.

The test uses `@WebMvcTest(MS1Controller.class)`, so only the web layer is loaded. `MS1Service` is supplied as a mock using `@MockBean`.

Expected assertion:

```text
HTTP status: 200 OK
Response body: MS 1.1 - Additon = 15
```

> The word `Additon` deliberately matches the spelling required in the task.
