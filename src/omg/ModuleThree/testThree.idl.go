// Code generated by me. DO NOT EDIT.

package ModuleThree

import __Abc__ "github.com/bhbosman/orb/src/omg/Abc"
import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"
import __yaccidl__ "github.com/bhbosman/yaccidl"

// TypeDef declaration: "Three::TypeRepository", generatedBy by: "WriteTypeDefOfStructDcl(*objects.TypedclToStructDclImpl)"
// Struct declaration: "Three::TypeRepository", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type ThreeTypeRepository struct {
	__goidl__.IdlObject
}

//noinspection GoSnakeCaseUsage
const ThreeTypeRepositoryId_Const = "IDL:Three/TypeRepository:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultThreeTypeRepository() *ThreeTypeRepository {
	//noinspection GoRedundantConversion
	return &ThreeTypeRepository{
		IdlObject: __goidl__.IdlObject{
		},
	}
}

//noinspection GoUnusedExportedFunction
func NewThreeTypeRepository() *ThreeTypeRepository {
	//noinspection GoRedundantConversion
	return &ThreeTypeRepository{
		IdlObject: __goidl__.IdlObject{
		},
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomThreeTypeRepository() *ThreeTypeRepository {
	//noinspection GoRedundantConversion
	return &ThreeTypeRepository{
		IdlObject: __goidl__.IdlObject{
		},
	}
}

func (self *ThreeTypeRepository) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *ThreeTypeRepository) GoString() string {
	return self.String()
}

func (self *ThreeTypeRepository) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *ThreeTypeRepository) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *ThreeTypeRepository) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type ThreeTypeRepository_Helper struct {
}

// Struct declaration: "Three::Def", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type ThreeDef struct {
	__goidl__.IdlObject
	A __Abc__.AbcAbc `json:"A"`
	Magic [4]byte `json:"Magic"`
}

//noinspection GoSnakeCaseUsage
const ThreeDefId_Const = "IDL:Three/Def:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultThreeDef() *ThreeDef {
	//noinspection GoRedundantConversion
	return &ThreeDef{
		IdlObject: __goidl__.IdlObject{
			Id: ThreeDefId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "Abc::Abc" Scope: "IdlStruct"
		A: __Abc__.AbcAbc{
		IdlObject: __goidl__.IdlObject{
			Id: "ddd",
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "IdlString" Scope: "StringType"
		A: "",
	},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "Magic", Type: "Abc::MagicN" Scope: "IdlTypedef"
		Magic: [4]byte{},
	}
}

//noinspection GoUnusedExportedFunction
func NewThreeDef(
	//"StructDclAllParamsConstructorParamService"
	A __Abc__.AbcAbc,
	//"StructDclAllParamsConstructorParamService"
	Magic [4]byte) *ThreeDef {
	//noinspection GoRedundantConversion
	return &ThreeDef{
		IdlObject: __goidl__.IdlObject{
			Id: ThreeDefId_Const,
		},
		A: A,
		Magic: Magic,
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomThreeDef(randomGenerator __goidl__.IRandomDataGenerator) *ThreeDef {
	//noinspection GoRedundantConversion
	return &ThreeDef{
		IdlObject: __goidl__.IdlObject{
			Id: ThreeDefId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "Abc::Abc" Scope: "IdlStruct"
		A: __Abc__.AbcAbc{
		IdlObject: __goidl__.IdlObject{
			Id: "ddd",
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "a", Type: "IdlString" Scope: "StringType"
		A: randomGenerator.StringTypeValue(__reflect__.TypeOf((*ThreeDef)(nil)), "A"),
	},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "Magic", Type: "Abc::MagicN" Scope: "IdlTypedef"
		Magic: [4]byte{},
	}
}

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
	return nil
}

//noinspection GoSnakeCaseUsage
type ThreeDef_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var ThreeTypeRepositoryHelper = ThreeTypeRepository_Helper{}

//noinspection GoUnusedGlobalVariable
var ThreeDefHelper = ThreeDef_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			ThreeTypeRepositoryId_Const,
			__yaccidl__.IdlStruct,
			"testThree.idl.go",
			func() __goidl__.IIdlObject {
				return NewDefaultThreeTypeRepository()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewDefaultThreeTypeRepository()
			},
			__reflect__.TypeOf((*ThreeTypeRepository)(nil))))
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			ThreeDefId_Const,
			__yaccidl__.IdlStruct,
			"testThree.idl.go",
			func() __goidl__.IIdlObject {
				return NewDefaultThreeDef()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewRandomThreeDef(generator)
			},
			__reflect__.TypeOf((*ThreeDef)(nil))))
}
