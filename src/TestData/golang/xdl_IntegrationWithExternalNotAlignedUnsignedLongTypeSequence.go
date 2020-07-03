// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::UnsignedLongTypeSequence", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedUnsignedLongTypeSequence struct {
	__goidl__.IdlObject
	Dummy byte `json:"Dummy"`
	Seq IntegrationWithExternalNotAlignedUnsignedLongTypeSeq `json:"Seq"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedUnsignedLongTypeSequenceId_Const = "IDL:IntegrationWithExternalNotAligned/UnsignedLongTypeSequence:1.0"

func (self *IntegrationWithExternalNotAlignedUnsignedLongTypeSequence) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedUnsignedLongTypeSequence) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedUnsignedLongTypeSequence) ReadValue(stream __goidl__.IReadAny) error {
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

func (self *IntegrationWithExternalNotAlignedUnsignedLongTypeSequence) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedUnsignedLongTypeSequence) Write(stream __goidl__.IWriteAny) error {
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
type IntegrationWithExternalNotAlignedUnsignedLongTypeSequence_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedUnsignedLongTypeSequenceHelper = IntegrationWithExternalNotAlignedUnsignedLongTypeSequence_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedUnsignedLongTypeSequenceId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedUnsignedLongTypeSequence.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedUnsignedLongTypeSequence{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedUnsignedLongTypeSequence{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedUnsignedLongTypeSequence)(nil))))
}
