// Code generated by me. DO NOT EDIT.

package IOP

import __goidl__ "github.com/bhbosman/goidl"

// TypeDef declaration: "IOP::MultipleComponentProfile", generatedBy by: "WriteTypeDefOfSequenceDcl"
//Typedef Sequence declaration: IOP::MultipleComponentProfile
type IopMultipleComponentProfile []*IopTaggedComponent

//noinspection GoSnakeCaseUsage
type IopMultipleComponentProfile_Helper struct {
}

//noinspection GoSnakeCaseUsage
const IopMultipleComponentProfileId_Const = "IDL:omg.org/IOP/MultipleComponentProfile:1.0"

func (self IopMultipleComponentProfile_Helper) Id() string {
	return IopMultipleComponentProfileId_Const
}

// WriteTypeDefOfSequenceDcl::WriteExtract
func (self IopMultipleComponentProfile_Helper) Read(stream __goidl__.IReadAny) (IopMultipleComponentProfile, error) {
	n, err := __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return nil, err
	}
	if n > 0 {
		result := make(IopMultipleComponentProfile, n)
		var i uint32
		for i = 0; i < n; i++ {
			result[i] = NewDefaultIopTaggedComponent()
			err = result[i].Read(stream)
			if err != nil {
				return nil, err
			}
		}
		return result, nil
	}
	return nil, nil
}

func (self IopMultipleComponentProfile_Helper) Write(stream __goidl__.IWriteAny, v IopMultipleComponentProfile) error {
	if v == nil {
		return __goidl__.IdlUInt32Helper.Write(stream, 0)
	}
	err := __goidl__.IdlUInt32Helper.Write(stream, uint32(len(v)))
	if err != nil {
		return nil
	}
	for _, item := range v {
			err = item.Write(stream)
		if err != nil {
			return err
		}
	}
	return err
}


//noinspection GoUnusedGlobalVariable
var IopMultipleComponentProfileHelper = IopMultipleComponentProfile_Helper{}

func init() {
}