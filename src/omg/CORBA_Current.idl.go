// Code generated by me. DO NOT EDIT.

package omg

import __goidl__ "github.com/bhbosman/goidl"

// Interface declaration: "CORBA::Current", generatedBy by: "WriteInterface"
type CorbaCurrent interface {
	// Interface operations
}

//noinspection GoSnakeCaseUsage
type CorbaCurrent_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CorbaCurrentId_Const = "IDL:omg.org/CORBA/Current:1.0"

func (self CorbaCurrent_Helper) Id() string {
	return CorbaCurrentId_Const
}

func (self CorbaCurrent_Helper) Read(stream __goidl__.IReadAny) (CorbaCurrent, error) {
	return nil, nil
}

func (self CorbaCurrent_Helper) Write(stream __goidl__.IWriteAny, v CorbaCurrent) error {
	return nil
}


//noinspection GoUnusedGlobalVariable
var CorbaCurrentHelper = CorbaCurrent_Helper{}

func init() {
}
