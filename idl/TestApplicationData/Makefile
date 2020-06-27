all: buildyacc buildCodeForApp01 buildApp01

buildyacc:
	go install ../../../goyaccidl



buildCodeForApp01:
	goyaccidl -v  -ff  -of ../../src/TestApplicationData/App01/   ./App01/App01.idl


buildApp01:
	go build ../../src/TestApplicationData/App01/
