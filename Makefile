bulild: clean deleteFile build_primitives ORB IOP IIOP GIOP MIOP build

build:
	go build ./src/omg

deleteFile:
	rm -rf ./src/omg/*.idl.go


clean:
	goyaccidl  -v -processor ClearExports


build_primitives:
	goyaccidl -v -processor PrimitiveProcessor -ff  -of ./idl/omg

ORB:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/orb.idl

IOP:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/IOP.idl
IIOP:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/IIOP.idl

GIOP:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/GIOP.idl

MIOP:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/MIOP.idl


TimeBase:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/TimeBase.idl



CosBridgeAdmin.idl:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg        ./idl/omg/CosBridgeAdmin.idl
CosCollection.idl:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/CosCollection.idl
CosConcurrencyControl.idl:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/CosConcurrencyControl.idl
CosEventChannelAdmin.idl:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/CosEventChannelAdmin.idl
CosEventComm.idl:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/CosEventComm.idl
CosNaming.idl:
	goyaccidl -v  -idldef _COMPONENT_REPOSITORY_   -ff -of ./src/omg       ./idl/omg/CosNaming.idl
CosNotification.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosNotification.idl

CosNotifyChannelAdmin.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosNotifyChannelAdmin.idl
CosNotifyComm.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosNotifyComm.idl
CosNotifyFilter.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosNotifyFilter.idl
CosTime.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosTime.idl
CosTrading.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosTrading.idl
CosTransactions.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosTransactions.idl
CosTypedEventChannelAdmin.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosTypedEventChannelAdmin.idl
CosTypedEventComm.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosTypedEventComm.idl
CosTypedNotifyChannelAdmin.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosTypedNotifyChannelAdmin.idl
CosTypedNotifyComm.idl:
	goyaccidl -v -ff -of ./src/omg ./idl/omg/CosTypedNotifyComm.idl












App01:
	goyaccidl -v    -o ./MIOP.idl.json -ff -of ./src/App01       ./idl/App01/car.idl





