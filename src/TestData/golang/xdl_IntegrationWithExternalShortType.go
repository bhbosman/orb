// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::ShortType", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalShortType struct {
	__goidl__.IdlObject
	Value int16 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalShortTypeId_Const = "IDL:IntegrationWithExternal/ShortType:1.0"

func (self *IntegrationWithExternalShortType) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalShortType) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalShortType) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(ShortType)
	self.Value, err = __goidl__.IdlInt16Helper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalShortType) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalShortType) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(ShortType)
	err = __goidl__.IdlInt16Helper.Write(stream, self.Value)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalShortType_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalShortTypeHelper = IntegrationWithExternalShortType_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalShortTypeId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalShortType.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalShortType{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalShortType{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalShortType)(nil))))
}