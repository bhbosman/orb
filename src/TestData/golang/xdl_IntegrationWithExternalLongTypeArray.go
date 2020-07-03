// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::LongTypeArray", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalLongTypeArray struct {
	__goidl__.IdlObject
	Value [16]int32 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalLongTypeArrayId_Const = "IDL:IntegrationWithExternal/LongTypeArray:1.0"

func (self *IntegrationWithExternalLongTypeArray) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalLongTypeArray) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalLongTypeArray) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(LongType)
	for i0 := 0; i0 < 16; i0++ {
		self.Value[i0], err = __goidl__.IdlInt32Helper.Read(stream)
		if err != nil {
			return err
		}
	}
	return nil
}

func (self *IntegrationWithExternalLongTypeArray) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalLongTypeArray) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(LongType)
	for i0 := 0; i0 < 16; i0++ {
		err = __goidl__.IdlInt32Helper.Write(stream, self.Value[i0])
		if err != nil {
			return err
		}
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalLongTypeArray_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalLongTypeArrayHelper = IntegrationWithExternalLongTypeArray_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalLongTypeArrayId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalLongTypeArray.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalLongTypeArray{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalLongTypeArray{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalLongTypeArray)(nil))))
}
