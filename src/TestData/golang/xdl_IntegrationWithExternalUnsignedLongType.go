// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::UnsignedLongType", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalUnsignedLongType struct {
	__goidl__.IdlObject
	Value uint32 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalUnsignedLongTypeId_Const = "IDL:IntegrationWithExternal/UnsignedLongType:1.0"

func (self *IntegrationWithExternalUnsignedLongType) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalUnsignedLongType) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalUnsignedLongType) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(UnsignedLongType)
	self.Value, err = __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalUnsignedLongType) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalUnsignedLongType) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(UnsignedLongType)
	err = __goidl__.IdlUInt32Helper.Write(stream, self.Value)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalUnsignedLongType_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalUnsignedLongTypeHelper = IntegrationWithExternalUnsignedLongType_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalUnsignedLongTypeId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalUnsignedLongType.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalUnsignedLongType{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalUnsignedLongType{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalUnsignedLongType)(nil))))
}