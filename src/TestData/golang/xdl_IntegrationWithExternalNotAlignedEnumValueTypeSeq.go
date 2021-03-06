// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::EnumValueTypeSeq", generatedBy by: "WriteSeqStructDcl"
type IntegrationWithExternalNotAlignedEnumValueTypeSeq struct {
	__goidl__.IdlObject
	Array []*IntegrationWithExternalNotAlignedEnumValueType `json:"Array"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedEnumValueTypeSeqId_Const = "IDL:IntegrationWithExternalNotAligned/EnumValueTypeSeq:1.0"

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSeq) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSeq) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSeq) ReadValue(stream __goidl__.IReadAny) error {
	err := self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	var n uint32
	n, err = __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return err
	}
	if n > 0 {
		self.Array = make([]*IntegrationWithExternalNotAlignedEnumValueType, n)
		var i uint32
		for i = 0; i < n; i++ {
			self.Array[i] = &IntegrationWithExternalNotAlignedEnumValueType{}
			err = self.Array[i].ReadValue(stream)
			if err != nil {
				return err
			}
		}
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSeq) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedEnumValueTypeSeq) Write(stream __goidl__.IWriteAny) error {
	err := self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	err = __goidl__.IdlUInt32Helper.Write(stream, uint32(len(self.Array)))
	if err != nil {
		return err
	}
	if len(self.Array) > 0 {
		for _, item := range self.Array {
			err = item.Write(stream)
			if err != nil {
				return err
			}
		}
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IntegrationWithExternalNotAlignedEnumValueTypeSeq_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedEnumValueTypeSeqHelper = IntegrationWithExternalNotAlignedEnumValueTypeSeq_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedEnumValueTypeSeqId_Const,
			__goidl__.SequenceType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedEnumValueTypeSeq.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedEnumValueTypeSeq{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedEnumValueTypeSeq{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedEnumValueTypeSeq)(nil))))
}
