// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::StringTypeSequence", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalStringTypeSequence struct {
	__goidl__.IdlObject
	Seq IntegrationWithExternalStringTypeSeq `json:"Seq"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalStringTypeSequenceId_Const = "IDL:IntegrationWithExternal/StringTypeSequence:1.0"

func (self *IntegrationWithExternalStringTypeSequence) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalStringTypeSequence) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalStringTypeSequence) ReadValue(stream __goidl__.IReadAny) error {
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

func (self *IntegrationWithExternalStringTypeSequence) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalStringTypeSequence) Write(stream __goidl__.IWriteAny) error {
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
type IntegrationWithExternalStringTypeSequence_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalStringTypeSequenceHelper = IntegrationWithExternalStringTypeSequence_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalStringTypeSequenceId_Const,
			__goidl__.StructType,
			"test.idl",
			"xdl_IntegrationWithExternalStringTypeSequence.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalStringTypeSequence{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalStringTypeSequence{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalStringTypeSequence)(nil))))
}
