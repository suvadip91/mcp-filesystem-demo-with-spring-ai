# MCP Demo with Spring AI — Local FS via MCP 🚀
- Minimal Spring Boot app showcasing local filesystem tooling with MCP + Spring AI.
- Start: ./mvnw spring-boot:run (uses .mvn/wrapper/maven-wrapper.properties).
- MCP FS server: src/main/resources/server.json
- App config: src/main/resources/application.yaml
- Main: com.mcp.demo.McpDemoWithJavaApplication
- Controller: com.mcp.demo.controller.McpController (exposes /chat)
- Dependencies in pom.xml (Spring AI MCP client + OpenAI model)
- Set OPEN_AI_API_KEY env var; default port 8081
- Quick tip: check logs in VS Code Output/Terminal for MCP interactions 🔧