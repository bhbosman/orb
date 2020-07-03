// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::CharTypeArray", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedCharTypeArray struct {
	__goidl__.IdlObject
	Dummy byte `json:"Dummy"`
	Value [16]byte `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedCharTypeArrayId_Const = "IDL:IntegrationWithExternalNotAligned/CharTypeArray:1.0"

func (self *IntegrationWithExternalNotAlignedCharTypeArray) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedCharTypeArray) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedCharTypeArray) ReadValue(stream __goidl__.IReadAny) error {
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
	// WriteStructHelper::WriteStructMemberExtractValue(CharType)
	for i0 := 0; i0 < 16; i0++ {
		self.Value[i0], err = __goidl__.IdlOctetHelper.Read(stream)
		if err != nil {
			return err
		}
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedCharTypeArray) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedCharTypeArray) Write(stream __goidl__.IWriteAny) error {
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
	// WriteStructHelper::WriteStructMemberInsert(CharType)
	for i0 := 0; i0 < 16; i0++ {
		err = __goidl__.IdlOctetHelper.Write(stream, self.Value[i0])
		if err != nil {
			return err
		}
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalNotAlignedCharTypeArray_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedCharTypeArrayHelper = IntegrationWithExternalNotAlignedCharTypeArray_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedCharTypeArrayId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedCharTypeArray.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedCharTypeArray{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedCharTypeArray{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedCharTypeArray)(nil))))
}
