// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::WideStringTypeArray", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IntegrationWithExternalNotAlignedWideStringTypeArray struct {
	__goidl__.IdlObject
	Dummy byte       `json:"Dummy"`
	Value [16]string `json:"Value"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedWideStringTypeArrayId_Const = "IDL:IntegrationWithExternalNotAligned/WideStringTypeArray:1.0"

func (self *IntegrationWithExternalNotAlignedWideStringTypeArray) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedWideStringTypeArray) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedWideStringTypeArray) ReadValue(stream __goidl__.IReadAny) error {
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
	// WriteStructHelper::WriteStructMemberExtractValue(WideStringType)
	for i0 := 0; i0 < 16; i0++ {
		self.Value[i0], err = __goidl__.IdlWideStringHelper.Read(stream)
		if err != nil {
			return err
		}
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedWideStringTypeArray) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedWideStringTypeArray) Write(stream __goidl__.IWriteAny) error {
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
	// WriteStructHelper::WriteStructMemberInsert(WideStringType)
	for i0 := 0; i0 < 16; i0++ {
		err = __goidl__.IdlWideStringHelper.Write(stream, self.Value[i0])
		if err != nil {
			return err
		}
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalNotAlignedWideStringTypeArray_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedWideStringTypeArrayHelper = IntegrationWithExternalNotAlignedWideStringTypeArray_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedWideStringTypeArrayId_Const,
			__goidl__.StructType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedWideStringTypeArray.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedWideStringTypeArray{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedWideStringTypeArray{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedWideStringTypeArray)(nil))))
}
