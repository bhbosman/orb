// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::EnumValueTypeSequence", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedEnumValueTypeSequence struct {
	__goidl__.IdlObject
	Dummy byte `json:"Dummy"`
	Seq IntegrationWithExternalNotAlignedEnumValueTypeSeq `json:"Seq"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedEnumValueTypeSequenceId_Const = "IDL:IntegrationWithExternalNotAligned/EnumValueTypeSequence:1.0"

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSequence) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSequence) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSequence) ReadValue(stream __goidl__.IReadAny) error {
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
	// WriteStructHelper::WriteStructMemberExtractValue(IdlStruct)
	err = self.Seq.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSequence) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSequence) Write(stream __goidl__.IWriteAny) error {
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
	// WriteStructHelper::WriteStructMemberInsert(IdlStruct)
	err = self.Seq.Write(stream)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalNotAlignedEnumValueTypeSequence_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedEnumValueTypeSequenceHelper = IntegrationWithExternalNotAlignedEnumValueTypeSequence_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedEnumValueTypeSequenceId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedEnumValueTypeSequence.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedEnumValueTypeSequence{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedEnumValueTypeSequence{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedEnumValueTypeSequence)(nil))))
}
