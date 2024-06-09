# junit5-jupiter-starter-maven

The `junit5-jupiter-starter-maven` project demonstrates how to execute JUnit Jupiter
tests using Maven.

Please note that this project uses the [Maven Wrapper](https://github.com/apache/maven-wrapper).
Thus, to ensure that the correct version of Maven is used, invoke `mvnw` instead of `mvn`.

## Example

`./mvnw clean test`

`./mvnw clean test -Dbrowser=webkit -Dheadless=false` (chromium, webkit, firefox - it's actuall for WebTests (extends BaseWebTest))

`./mvnw clean test -Dconfig=default` (or another config from test/resources/yaml/*.yaml)

### Contains:

Junit5

Playwright

RestAssured

Jackson : databind/xml/yaml/jsr310

JSONObject

Apache Commong Lang 3 : StringUtils

Lombok

slf4j

Allure
