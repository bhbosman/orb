// Code generated by me. DO NOT EDIT.

package Def

import __Abc__ "github.com/bhbosman/orb/src/omg/Abc"
import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"
import __yaccidl__ "github.com/bhbosman/yaccidl"

// Struct declaration: "Def::Def", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type DefDef struct {
	__goidl__.IdlObject
	A __Abc__.AbcAbc `json:"A"`
}

//noinspection GoSnakeCaseUsage
const DefDefId_Const = "IDL:Def/Def:1.0"

func (self *DefDef) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *DefDef) GoString() string {
	return self.String()
}

func (self *DefDef) ReadValue(stream __goidl__.IReadAny) error {
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
	return nil
}

func (self *DefDef) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *DefDef) Write(stream __goidl__.IWriteAny) error {
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
	return nil
}

//noinspection GoSnakeCaseUsage
type DefDef_Helper struct {
}

//noinspection GoUnusedGlobalVariable
var DefDefHelper = DefDef_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			DefDefId_Const,
			__yaccidl__.IdlStruct,
			"testDef.idl.Def.go",
			func() __goidl__.IIdlObject {
				return &DefDef{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &DefDef{}
			},
			__reflect__.TypeOf((*DefDef)(nil))))
}
