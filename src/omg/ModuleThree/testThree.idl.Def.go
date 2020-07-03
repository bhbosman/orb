// Code generated by me. DO NOT EDIT.

package ModuleThree

import __Abc__ "github.com/bhbosman/orb/src/omg/Abc"
import __Def__ "github.com/bhbosman/orb/src/omg/Def"
import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"
import __yaccidl__ "github.com/bhbosman/yaccidl"

// Struct declaration: "Three::Def", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type ThreeDef struct {
	__goidl__.IdlObject
	A __Abc__.AbcAbc `json:"A"`
	Magic [4]byte `json:"Magic"`
	S __Def__.DefDef `json:"S"`
}

//noinspection GoSnakeCaseUsage
const ThreeDefId_Const = "IDL:Three/Def:1.0"

func (self *ThreeDef) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *ThreeDef) GoString() string {
	return self.String()
}

func (self *ThreeDef) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlStruct)
	err = self.A.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(CharType)
	self.Magic, err = __Abc__.AbcMagicNHelper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlStruct)
	err = self.S.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *ThreeDef) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *ThreeDef) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlStruct)
	err = self.A.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(CharType)
	err = __Abc__.AbcMagicNHelper.Write(stream, self.Magic)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlStruct)
	err = self.S.Write(stream)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type ThreeDef_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var ThreeDefHelper = ThreeDef_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			ThreeDefId_Const,
			__yaccidl__.IdlStruct,
			"testThree.idl.Def.go",
			func() __goidl__.IIdlObject {
				return &ThreeDef{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &ThreeDef{}
			},
			__reflect__.TypeOf((*ThreeDef)(nil))))
}