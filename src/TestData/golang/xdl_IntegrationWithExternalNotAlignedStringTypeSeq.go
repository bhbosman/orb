// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::StringTypeSeq", generatedBy by: "WriteSeqStructDcl"
type IntegrationWithExternalNotAlignedStringTypeSeq struct {
	__goidl__.IdlObject
	Array []*IntegrationWithExternalNotAlignedStringType `json:"Array"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedStringTypeSeqId_Const = "IDL:IntegrationWithExternalNotAligned/StringTypeSeq:1.0"

func (self *IntegrationWithExternalNotAlignedStringTypeSeq) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedStringTypeSeq) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedStringTypeSeq) ReadValue(stream __goidl__.IReadAny) error {
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
		self.Array = make([]*IntegrationWithExternalNotAlignedStringType, n)
		var i uint32
		for i = 0; i < n; i++ {
			self.Array[i] = &IntegrationWithExternalNotAlignedStringType{}
			err = self.Array[i].ReadValue(stream)
			if err != nil {
				return err
			}
		}
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedStringTypeSeq) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedStringTypeSeq) Write(stream __goidl__.IWriteAny) error {
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
type IntegrationWithExternalNotAlignedStringTypeSeq_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedStringTypeSeqHelper = IntegrationWithExternalNotAlignedStringTypeSeq_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedStringTypeSeqId_Const,
			__goidl__.SequenceType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedStringTypeSeq.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedStringTypeSeq{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedStringTypeSeq{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedStringTypeSeq)(nil))))
}
