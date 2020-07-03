// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::DoubleTypeArray", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalDoubleTypeArray struct {
	__goidl__.IdlObject
	Value [16]float64 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalDoubleTypeArrayId_Const = "IDL:IntegrationWithExternal/DoubleTypeArray:1.0"

func (self *IntegrationWithExternalDoubleTypeArray) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalDoubleTypeArray) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalDoubleTypeArray) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(DoubleType)
	for i0 := 0; i0 < 16; i0++ {
		self.Value[i0], err = __goidl__.IdlFloat64Helper.Read(stream)
		if err != nil {
			return err
		}
	}
	return nil
}

func (self *IntegrationWithExternalDoubleTypeArray) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalDoubleTypeArray) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(DoubleType)
	for i0 := 0; i0 < 16; i0++ {
		err = __goidl__.IdlFloat64Helper.Write(stream, self.Value[i0])
		if err != nil {
			return err
		}
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalDoubleTypeArray_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalDoubleTypeArrayHelper = IntegrationWithExternalDoubleTypeArray_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalDoubleTypeArrayId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalDoubleTypeArray.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalDoubleTypeArray{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalDoubleTypeArray{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalDoubleTypeArray)(nil))))
}
