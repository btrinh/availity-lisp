.PHONY: clean
clean:
	@rm -rf out

.PHONY: build
build:
	@javac src/main/java/com/availity/*.java -d out
