# MCP Demo with Spring AI
Minimal Spring Boot app demonstrating local filesystem tooling via MCP and Spring AI.
Start the app with the Maven wrapper defined in [.mvn/wrapper/maven-wrapper.properties](.mvn/wrapper/maven-wrapper.properties).
MCP filesystem server configured in [src/main/resources/server.json](src/main/resources/server.json).
Application config in [src/main/resources/application.yaml](src/main/resources/application.yaml).
Main class: [`com.mcp.demo.McpDemoWithJavaApplication`](src/main/java/com/mcp/demo/McpDemoWithJavaApplication.java).
Controller exposing /chat: [`com.mcp.demo.controller.McpController`](src/main/java/com/mcp/demo/controller/McpController.java).
Dependencies (Spring AI MCP client, OpenAI model) in [pom.xml](pom.xml).
Set OPEN_AI_API_KEY environment variable and run; default port is 8081.