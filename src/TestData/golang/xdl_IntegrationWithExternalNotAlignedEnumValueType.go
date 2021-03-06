// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::EnumValueType", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedEnumValueType struct {
	__goidl__.IdlObject
	Dummy byte   `json:"Dummy"`
	Value uint32 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedEnumValueTypeId_Const = "IDL:IntegrationWithExternalNotAligned/EnumValueType:1.0"

func (self *IntegrationWithExternalNotAlignedEnumValueType) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedEnumValueType) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedEnumValueType) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlOctetKind)
	self.Dummy, err = __goidl__.IdlOctetHelper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlEnum)
	self.Value, err = __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedEnumValueType) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedEnumValueType) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlOctetKind)
	err = __goidl__.IdlOctetHelper.Write(stream, self.Dummy)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlEnum)
	err = __goidl__.IdlUInt32Helper.Write(stream, self.Value)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalNotAlignedEnumValueType_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedEnumValueTypeHelper = IntegrationWithExternalNotAlignedEnumValueType_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedEnumValueTypeId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedEnumValueType.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedEnumValueType{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedEnumValueType{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedEnumValueType)(nil))))
}
