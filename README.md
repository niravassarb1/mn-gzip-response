## Demonstration

This demonstrates that micronaut responds to the accept-encoding attribute of http. It will return content-encoding: gzip through the
netty server.

- Run the app with `./gradlew run`
- at a command send this
    - `curl "http://localhost:8080/foo" -H "accept-encoding: gzip" -v --output -`
    - you will get a compressed set of data with header `content-encoding: gzip`
- at a command send this
    - `curl "http://localhost:8080/foo" -H -v --output -`
    - you will see json data