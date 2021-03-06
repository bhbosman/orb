// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::LongLongType", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedLongLongType struct {
	__goidl__.IdlObject
	Dummy byte  `json:"Dummy"`
	Value int64 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedLongLongTypeId_Const = "IDL:IntegrationWithExternalNotAligned/LongLongType:1.0"

func (self *IntegrationWithExternalNotAlignedLongLongType) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedLongLongType) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedLongLongType) ReadValue(stream __goidl__.IReadAny) error {
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
	// WriteStructHelper::WriteStructMemberExtractValue(LongLongType)
	self.Value, err = __goidl__.IdlInt64Helper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedLongLongType) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedLongLongType) Write(stream __goidl__.IWriteAny) error {
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
	// WriteStructHelper::WriteStructMemberInsert(LongLongType)
	err = __goidl__.IdlInt64Helper.Write(stream, self.Value)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalNotAlignedLongLongType_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedLongLongTypeHelper = IntegrationWithExternalNotAlignedLongLongType_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedLongLongTypeId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedLongLongType.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedLongLongType{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedLongLongType{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedLongLongType)(nil))))
}
