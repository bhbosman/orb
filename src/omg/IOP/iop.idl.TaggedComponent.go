// Code generated by me. DO NOT EDIT.

package IOP

import __goIdlCorba__ "github.com/bhbosman/goIdlCorba"
import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"
import __yaccidl__ "github.com/bhbosman/yaccidl"

// Struct declaration: "IOP::TaggedComponent", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type IopTaggedComponent struct {
	__goidl__.IdlObject
	Tag uint32 `json:"Tag"`
	ComponentData IopComponentData `json:"ComponentData"`
}

//noinspection GoSnakeCaseUsage
const IopTaggedComponentId_Const = "IDL:omg.org/IOP/TaggedComponent:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultIopTaggedComponent() *IopTaggedComponent {
	//noinspection GoRedundantConversion
	return &IopTaggedComponent{
		IdlObject: __goidl__.IdlObject{
			Id: IopTaggedComponentId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "tag", Type: "IOP::ComponentId" Scope: "IdlTypedef"
		Tag: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "component_data", Type: "IOP::ComponentData" Scope: "IdlTypedef"
		ComponentData: IopComponentData(IopComponentData(nil)),
	}
}

//noinspection GoUnusedExportedFunction
func NewIopTaggedComponent(
	//"StructDclAllParamsConstructorParamService"
	Tag uint32,
	//"StructDclAllParamsConstructorParamService"
	ComponentData IopComponentData) *IopTaggedComponent {
	//noinspection GoRedundantConversion
	return &IopTaggedComponent{
		IdlObject: __goidl__.IdlObject{
			Id: IopTaggedComponentId_Const,
		},
		Tag: Tag,
		ComponentData: ComponentData,
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomIopTaggedComponent(randomGenerator __goidl__.IRandomDataGenerator) *IopTaggedComponent {
	//noinspection GoRedundantConversion
	return &IopTaggedComponent{
		IdlObject: __goidl__.IdlObject{
			Id: IopTaggedComponentId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "tag", Type: "IOP::ComponentId" Scope: "IdlTypedef"
		Tag: randomGenerator.UnsignedLongTypeValue(__reflect__.TypeOf((*IopTaggedComponent)(nil)), "Tag"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "component_data", Type: "IOP::ComponentData" Scope: "IdlTypedef"
		ComponentData: IopComponentData(IopComponentData(nil)),
	}
}

func (self *IopTaggedComponent) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IopTaggedComponent) GoString() string {
	return self.String()
}

func (self *IopTaggedComponent) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(UnsignedLongType)
	self.Tag, err = __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlSequence)
	self.ComponentData, err = IopComponentDataHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IopTaggedComponent) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IopTaggedComponent) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(UnsignedLongType)
	err = __goidl__.IdlUInt32Helper.Write(stream, self.Tag)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlSequence)
	err = IopComponentDataHelper.Write(stream, self.ComponentData)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IopTaggedComponent_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IopTaggedComponentHelper = IopTaggedComponent_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IopTaggedComponentId_Const,
			__yaccidl__.IdlStruct,
			"iop.idl.TaggedComponent.go",
			func() __goidl__.IIdlObject {
				return NewDefaultIopTaggedComponent()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewRandomIopTaggedComponent(generator)
			},
			__reflect__.TypeOf((*IopTaggedComponent)(nil))))
}