// Code generated by me. DO NOT EDIT.

package Abc

import __goidl__ "github.com/bhbosman/goidl"

// TypeDef declaration: "Abc::MagicN", generatedBy by: "WriteTypeDefOfPrimitiveDcl"
//Typedef Primitive declaration: "Abc::MagicN" from: "[4]byte"
type AbcMagicN [4]byte

//noinspection GoSnakeCaseUsage
type AbcMagicN_Helper struct {
}

//noinspection GoSnakeCaseUsage
const AbcMagicNId_Const = "IDL:Abc/MagicN:1.0"

func (self AbcMagicN_Helper) Id() string {
	return AbcMagicNId_Const
}

func (self AbcMagicN_Helper) Read(stream __goidl__.IReadAny) ([4]byte, error) {
	var data AbcMagicN
	var err error
	for i0 := 0; i0 < 4; i0++ {
		data[i0], err = __goidl__.IdlOctetHelper.Read(stream)
		if err != nil {
			return data, err
		}
	}
	return data, nil
}

func (self AbcMagicN_Helper) Write(stream __goidl__.IWriteAny, v [4]byte) error {
	var data AbcMagicN
	var err error
	for i0 := 0; i0 < 4; i0++ {
		err = __goidl__.IdlOctetHelper.Write(stream, data[i0])
		if err != nil {
			return err
		}
	}
	return nil
}


//noinspection GoUnusedGlobalVariable
var AbcMagicNHelper = AbcMagicN_Helper{}

func init() {
}
