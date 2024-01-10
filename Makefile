.PHONY: all trace provider

all: trace provider

trace:
	@cd trace && ./gradlew clean build shadowJar

structured-logging-poc:
	@cd structured-logging-poc && ./gradlew clean build -x generateJsonSchema2Pojo
