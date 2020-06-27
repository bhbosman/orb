// Code generated by me. DO NOT EDIT.

package omg

import __goidl__ "github.com/bhbosman/goidl"

// Interface declaration: "CORBA::Contained", generatedBy by: "WriteInterface"
type CorbaContained interface {
	// Interface operations
}

//noinspection GoSnakeCaseUsage
type CorbaContained_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CorbaContainedId_Const = "IDL:omg.org/CORBA/Contained:1.0"

func (self CorbaContained_Helper) Id() string {
	return CorbaContainedId_Const
}

func (self CorbaContained_Helper) Read(stream __goidl__.IReadAny) (CorbaContained, error) {
	return nil, nil
}

func (self CorbaContained_Helper) Write(stream __goidl__.IWriteAny, v CorbaContained) error {
	return nil
}

// TypeDef declaration: "CORBA::Identifier", generatedBy by: "WriteTypeDefOfPrimitiveDcl"
//Typedef Primitive declaration: "CORBA::Identifier" from: "string"
type CorbaIdentifier string

//noinspection GoSnakeCaseUsage
type CorbaIdentifier_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CorbaIdentifierId_Const = "IDL:omg.org/CORBA/Identifier:1.0"

func (self CorbaIdentifier_Helper) Id() string {
	return CorbaIdentifierId_Const
}

func (self CorbaIdentifier_Helper) Read(stream __goidl__.IReadAny) (string, error) {
	result, err := __goidl__.IdlStringHelper.Read(stream)
	return result, err
}

func (self CorbaIdentifier_Helper) Write(stream __goidl__.IWriteAny, v string) error {
	return __goidl__.IdlStringHelper.Write(stream, v)
}


//noinspection GoUnusedGlobalVariable
var CorbaContainedHelper = CorbaContained_Helper{}

//noinspection GoUnusedGlobalVariable
var CorbaIdentifierHelper = CorbaIdentifier_Helper{}

func init() {
}
