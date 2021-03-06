// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::LongTypeSeq", generatedBy by: "WriteSeqStructDcl"
type IntegrationWithExternalNotAlignedLongTypeSeq struct {
	__goidl__.IdlObject
	Array []*IntegrationWithExternalNotAlignedLongType `json:"Array"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedLongTypeSeqId_Const = "IDL:IntegrationWithExternalNotAligned/LongTypeSeq:1.0"

func (self *IntegrationWithExternalNotAlignedLongTypeSeq) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedLongTypeSeq) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedLongTypeSeq) ReadValue(stream __goidl__.IReadAny) error {
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
		self.Array = make([]*IntegrationWithExternalNotAlignedLongType, n)
		var i uint32
		for i = 0; i < n; i++ {
			self.Array[i] = &IntegrationWithExternalNotAlignedLongType{}
			err = self.Array[i].ReadValue(stream)
			if err != nil {
				return err
			}
		}
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedLongTypeSeq) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedLongTypeSeq) Write(stream __goidl__.IWriteAny) error {
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
type IntegrationWithExternalNotAlignedLongTypeSeq_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedLongTypeSeqHelper = IntegrationWithExternalNotAlignedLongTypeSeq_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedLongTypeSeqId_Const,
			__goidl__.SequenceType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedLongTypeSeq.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedLongTypeSeq{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedLongTypeSeq{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedLongTypeSeq)(nil))))
}
