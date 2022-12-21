init:
	gradle wrap

.PHONY: build
build:
	./gradlew build -x test

run:
	./gradlew run

.PHONY: test
test:
	./gradlew test --tests "*Tests" --info --debug-jvm
