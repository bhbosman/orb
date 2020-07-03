// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::DoubleType", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalDoubleType struct {
	__goidl__.IdlObject
	Value float64 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalDoubleTypeId_Const = "IDL:IntegrationWithExternal/DoubleType:1.0"

func (self *IntegrationWithExternalDoubleType) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalDoubleType) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalDoubleType) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(DoubleType)
	self.Value, err = __goidl__.IdlFloat64Helper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalDoubleType) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalDoubleType) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(DoubleType)
	err = __goidl__.IdlFloat64Helper.Write(stream, self.Value)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalDoubleType_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalDoubleTypeHelper = IntegrationWithExternalDoubleType_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalDoubleTypeId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalDoubleType.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalDoubleType{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalDoubleType{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalDoubleType)(nil))))
}
