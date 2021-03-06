// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::BooleanType", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalBooleanType struct {
	__goidl__.IdlObject
	Value bool `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalBooleanTypeId_Const = "IDL:IntegrationWithExternal/BooleanType:1.0"

func (self *IntegrationWithExternalBooleanType) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalBooleanType) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalBooleanType) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(BooleanType)
	self.Value, err = __goidl__.IdlBooleanHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalBooleanType) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalBooleanType) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(BooleanType)
	err = __goidl__.IdlBooleanHelper.Write(stream, self.Value)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalBooleanType_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalBooleanTypeHelper = IntegrationWithExternalBooleanType_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalBooleanTypeId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalBooleanType.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalBooleanType{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalBooleanType{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalBooleanType)(nil))))
}
