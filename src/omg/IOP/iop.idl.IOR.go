// Code generated by me. DO NOT EDIT.

package IOP

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"
import __yaccidl__ "github.com/bhbosman/yaccidl"

// Struct declaration: "IOP::IOR", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IopIor struct {
	__goidl__.IdlObject
	TypeId string `json:"TypeId"`
	Profiles IopTaggedProfileSeq `json:"Profiles"`
}

//noinspection GoSnakeCaseUsage
const IopIorId_Const = "IDL:omg.org/IOP/IOR:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultIopIor() *IopIor {
	//noinspection GoRedundantConversion
	return &IopIor{
		IdlObject: __goidl__.IdlObject{
			Id: IopIorId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "type_id", Type: "IdlString" Scope: "StringType"
		TypeId: "",
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "profiles", Type: "IOP::TaggedProfileSeq" Scope: "IdlTypedef"
		Profiles: IopTaggedProfileSeq(nil),
	}
}

//noinspection GoUnusedExportedFunction
func NewIopIor(
	//"StructDclAllParamsConstructorParamService"
	TypeId string,
	//"StructDclAllParamsConstructorParamService"
	Profiles IopTaggedProfileSeq) *IopIor {
	//noinspection GoRedundantConversion
	return &IopIor{
		IdlObject: __goidl__.IdlObject{
			Id: IopIorId_Const,
		},
		TypeId: TypeId,
		Profiles: Profiles,
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomIopIor(randomGenerator __goidl__.IRandomDataGenerator) *IopIor {
	//noinspection GoRedundantConversion
	return &IopIor{
		IdlObject: __goidl__.IdlObject{
			Id: IopIorId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "type_id", Type: "IdlString" Scope: "StringType"
		TypeId: randomGenerator.StringTypeValue(__reflect__.TypeOf((*IopIor)(nil)), "TypeId"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "profiles", Type: "IOP::TaggedProfileSeq" Scope: "IdlTypedef"
		Profiles: IopTaggedProfileSeq(nil),
	}
}

func (self *IopIor) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IopIor) GoString() string {
	return self.String()
}

func (self *IopIor) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(StringType)
	self.TypeId, err = __goidl__.IdlStringHelper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlSequence)
	self.Profiles, err = IopTaggedProfileSeqHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IopIor) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IopIor) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(StringType)
	err = __goidl__.IdlStringHelper.Write(stream, self.TypeId)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlSequence)
	err = IopTaggedProfileSeqHelper.Write(stream, self.Profiles)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IopIor_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IopIorHelper = IopIor_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IopIorId_Const,
			__yaccidl__.IdlStruct,
			"iop.idl.IOR.go",
			func() __goidl__.IIdlObject {
				return NewDefaultIopIor()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewRandomIopIor(generator)
			},
			__reflect__.TypeOf((*IopIor)(nil))))
}
