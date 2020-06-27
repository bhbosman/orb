build: golang java

java:
	rm  -rf ../../src/TestData/Java/IntegrationWithExternal/*.java
	idlj  -fall  -td ../../src/TestData/Java   ./test.idl
	idlj  -fall  -td ../../src/TestData/Java   ./test2.idl

golang:
	rm  -rf ../../src/TestData/golang/*.idl.go
	goyaccidl -v     -ff  -of ../../src/TestData/golang   ./test.idl
	goyaccidl -v     -ff  -of ../../src/TestData/golang   ./test2.idl
	go build ../../src/TestData/golang



