// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"

// Enum declaration: "IntegrationWithExternal::EnumValue", generatedBy by: "WriteEnumDcl"
type IntegrationWithExternalEnumValue uint32

//noinspection GoUnusedConst
const (
	IntegrationWithExternalEnumValueValueA IntegrationWithExternalEnumValue = 0
	IntegrationWithExternalEnumValueValueB IntegrationWithExternalEnumValue = 1
)

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalEnumValue_Helper struct {
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalEnumValueId_Const = "IDL:IntegrationWithExternal/EnumValue:1.0"

func (self IntegrationWithExternalEnumValue_Helper) Id() string {
	return IntegrationWithExternalEnumValueId_Const
}

func (self IntegrationWithExternalEnumValue_Helper) Read(stream __goidl__.IReadAny) (uint32, error) {
	result, err := __goidl__.IdlUInt32Helper.Read(stream)
	return result, err
}

func (self IntegrationWithExternalEnumValue_Helper) Write(stream __goidl__.IWriteAny, v uint32) error {
	return __goidl__.IdlUInt32Helper.Write(stream, v)
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalEnumValueHelper = IntegrationWithExternalEnumValue_Helper{}

func init() {
}
