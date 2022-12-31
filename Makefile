.PHONY: build
build:
	./gradlew build -x test
.PHONY: test
test:
	./gradlew test --tests "*Test" --info

run:
	./gradlew run
