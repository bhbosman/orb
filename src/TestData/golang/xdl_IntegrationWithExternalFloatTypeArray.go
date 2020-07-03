// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::FloatTypeArray", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalFloatTypeArray struct {
	__goidl__.IdlObject
	Value [16]float32 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalFloatTypeArrayId_Const = "IDL:IntegrationWithExternal/FloatTypeArray:1.0"

func (self *IntegrationWithExternalFloatTypeArray) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalFloatTypeArray) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalFloatTypeArray) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(FloatType)
	for i0 := 0; i0 < 16; i0++ {
		self.Value[i0], err = __goidl__.IdlFloat32Helper.Read(stream)
		if err != nil {
			return err
		}
	}
	return nil
}

func (self *IntegrationWithExternalFloatTypeArray) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalFloatTypeArray) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(FloatType)
	for i0 := 0; i0 < 16; i0++ {
		err = __goidl__.IdlFloat32Helper.Write(stream, self.Value[i0])
		if err != nil {
			return err
		}
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalFloatTypeArray_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalFloatTypeArrayHelper = IntegrationWithExternalFloatTypeArray_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalFloatTypeArrayId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalFloatTypeArray.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalFloatTypeArray{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalFloatTypeArray{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalFloatTypeArray)(nil))))
}