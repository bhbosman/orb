// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternal::FloatTypeSeq", generatedBy by: "WriteSeqStructDcl"
type IntegrationWithExternalFloatTypeSeq struct {
	__goidl__.IdlObject
	Array []*IntegrationWithExternalFloatType `json:"Array"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalFloatTypeSeqId_Const = "IDL:IntegrationWithExternal/FloatTypeSeq:1.0"

func (self *IntegrationWithExternalFloatTypeSeq) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalFloatTypeSeq) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalFloatTypeSeq) ReadValue(stream __goidl__.IReadAny) error {
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
		self.Array = make([]*IntegrationWithExternalFloatType, n)
		var i uint32
		for i = 0; i < n; i++ {
			self.Array[i] = &IntegrationWithExternalFloatType{}
			err = self.Array[i].ReadValue(stream)
			if err != nil {
				return err
			}
		}
	}
	return nil
}

func (self *IntegrationWithExternalFloatTypeSeq) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalFloatTypeSeq) Write(stream __goidl__.IWriteAny) error {
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
type IntegrationWithExternalFloatTypeSeq_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalFloatTypeSeqHelper = IntegrationWithExternalFloatTypeSeq_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalFloatTypeSeqId_Const,
			__goidl__.SequenceType,
			"test.idl",
			"xdl_IntegrationWithExternalFloatTypeSeq.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalFloatTypeSeq{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalFloatTypeSeq{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalFloatTypeSeq)(nil))))
}
