// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::CharTypeSequence", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedCharTypeSequence struct {
	__goidl__.IdlObject
	Dummy byte                                         `json:"Dummy"`
	Seq   IntegrationWithExternalNotAlignedCharTypeSeq `json:"Seq"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedCharTypeSequenceId_Const = "IDL:IntegrationWithExternalNotAligned/CharTypeSequence:1.0"

func (self *IntegrationWithExternalNotAlignedCharTypeSequence) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedCharTypeSequence) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedCharTypeSequence) ReadValue(stream __goidl__.IReadAny) error {
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

func (self *IntegrationWithExternalNotAlignedCharTypeSequence) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedCharTypeSequence) Write(stream __goidl__.IWriteAny) error {
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
type IntegrationWithExternalNotAlignedCharTypeSequence_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedCharTypeSequenceHelper = IntegrationWithExternalNotAlignedCharTypeSequence_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedCharTypeSequenceId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedCharTypeSequence.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedCharTypeSequence{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedCharTypeSequence{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedCharTypeSequence)(nil))))
}
