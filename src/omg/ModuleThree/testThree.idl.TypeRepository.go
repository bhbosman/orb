// Code generated by me. DO NOT EDIT.

package ModuleThree

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"
import __yaccidl__ "github.com/bhbosman/yaccidl"

// Struct declaration: "Three::TypeRepository", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type ThreeTypeRepository struct {
	__goidl__.IdlObject
}

//noinspection GoSnakeCaseUsage
const ThreeTypeRepositoryId_Const = "IDL:Three/TypeRepository:1.0"

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

//noinspection GoUnusedGlobalVariable
var ThreeTypeRepositoryHelper = ThreeTypeRepository_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			ThreeTypeRepositoryId_Const,
			__yaccidl__.IdlStruct,
			"testThree.idl.TypeRepository.go",
			func() __goidl__.IIdlObject {
				return &ThreeTypeRepository{}
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return &ThreeTypeRepository{}
			},
			__reflect__.TypeOf((*ThreeTypeRepository)(nil))))
}
