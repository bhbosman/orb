// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::ShortType", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedShortType struct {
	__goidl__.IdlObject
	Dummy byte `json:"Dummy"`
	Value int16 `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedShortTypeId_Const = "IDL:IntegrationWithExternalNotAligned/ShortType:1.0"

func (self *IntegrationWithExternalNotAlignedShortType) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedShortType) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedShortType) ReadValue(stream __goidl__.IReadAny) error {
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
	// WriteStructHelper::WriteStructMemberExtractValue(ShortType)
	self.Value, err = __goidl__.IdlInt16Helper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedShortType) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedShortType) Write(stream __goidl__.IWriteAny) error {
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
	// WriteStructHelper::WriteStructMemberInsert(ShortType)
	err = __goidl__.IdlInt16Helper.Write(stream, self.Value)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalNotAlignedShortType_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedShortTypeHelper = IntegrationWithExternalNotAlignedShortType_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedShortTypeId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedShortType.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedShortType{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedShortType{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedShortType)(nil))))
}