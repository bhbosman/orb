// Code generated by me. DO NOT EDIT.

package golang

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"

// Struct declaration: "IntegrationWithExternalNotAligned::WideCharTypeSeq", generatedBy by: "WriteSeqStructDcl"
type IntegrationWithExternalNotAlignedWideCharTypeSeq struct {
	__goidl__.IdlObject
	Array []*IntegrationWithExternalNotAlignedWideCharType `json:"Array"`
}

//noinspection GoSnakeCaseUsage
const IntegrationWithExternalNotAlignedWideCharTypeSeqId_Const = "IDL:IntegrationWithExternalNotAligned/WideCharTypeSeq:1.0"

func (self *IntegrationWithExternalNotAlignedWideCharTypeSeq) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IntegrationWithExternalNotAlignedWideCharTypeSeq) GoString() string {
	return self.String()
}

func (self *IntegrationWithExternalNotAlignedWideCharTypeSeq) ReadValue(stream __goidl__.IReadAny) error {
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
		self.Array = make([]*IntegrationWithExternalNotAlignedWideCharType, n)
		var i uint32
		for i = 0; i < n; i++ {
			self.Array[i] = &IntegrationWithExternalNotAlignedWideCharType{}
			err = self.Array[i].ReadValue(stream)
				if err != nil {
				return err
			}
		}
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedWideCharTypeSeq) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IntegrationWithExternalNotAlignedWideCharTypeSeq) Write(stream __goidl__.IWriteAny) error {
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
type IntegrationWithExternalNotAlignedWideCharTypeSeq_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IntegrationWithExternalNotAlignedWideCharTypeSeqHelper = IntegrationWithExternalNotAlignedWideCharTypeSeq_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IntegrationWithExternalNotAlignedWideCharTypeSeqId_Const,
			__goidl__.SequenceType,
			"test2.idl",
			"xdl_IntegrationWithExternalNotAlignedWideCharTypeSeq.go",
			func() __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedWideCharTypeSeq{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &IntegrationWithExternalNotAlignedWideCharTypeSeq{}
			},
			__reflect__.TypeOf((*IntegrationWithExternalNotAlignedWideCharTypeSeq)(nil))))
}
