// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::CharTypeSequence", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalCharTypeSequence struct {
	__goidl__.IdlObject
	Seq IntegrationWithExternalCharTypeSeq `json:"Seq"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalCharTypeSequenceId_Const = "IDL:IntegrationWithExternal/CharTypeSequence:1.0"

func (self *IntegrationWithExternalCharTypeSequence) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalCharTypeSequence) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalCharTypeSequence) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
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

func (self *IntegrationWithExternalCharTypeSequence) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalCharTypeSequence) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
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
type IntegrationWithExternalCharTypeSequence_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalCharTypeSequenceHelper = IntegrationWithExternalCharTypeSequence_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalCharTypeSequenceId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalCharTypeSequence.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalCharTypeSequence{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalCharTypeSequence{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalCharTypeSequence)(nil))))
}
