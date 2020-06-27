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

//noinspection GoUnusedExportedFunction
func NewDefaultDefDef() *DefDef {
	//noinspection GoRedundantConversion
	return &DefDef{
		IdlObject: __goidl__.IdlObject{
			Id: DefDefId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "Abc::Abc" Scope: "IdlStruct"
		A: __Abc__.AbcAbc{
		IdlObject: __goidl__.IdlObject{
			Id: "ddd",
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "IdlString" Scope: "StringType"
		A: "",
	},
	}
}

//noinspection GoUnusedExportedFunction
func NewDefDef(
	//"StructDclAllParamsConstructorParamService"
	A __Abc__.AbcAbc) *DefDef {
	//noinspection GoRedundantConversion
	return &DefDef{
		IdlObject: __goidl__.IdlObject{
			Id: DefDefId_Const,
		},
		A: A,
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomDefDef(randomGenerator __goidl__.IRandomDataGenerator) *DefDef {
	//noinspection GoRedundantConversion
	return &DefDef{
		IdlObject: __goidl__.IdlObject{
			Id: DefDefId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "Abc::Abc" Scope: "IdlStruct"
		A: __Abc__.AbcAbc{
		IdlObject: __goidl__.IdlObject{
			Id: "ddd",
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "IdlString" Scope: "StringType"
		A: randomGenerator.StringTypeValue(__reflect__.TypeOf((*DefDef)(nil)), "A"),
	},
	}
}

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
			"testDef.idl.go",
			func() __goidl__.IIdlObject {
				return NewDefaultDefDef()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewRandomDefDef(generator)
			},
			__reflect__.TypeOf((*DefDef)(nil))))
}