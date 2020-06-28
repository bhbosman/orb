// Code generated by me. DO NOT EDIT.

package IOP

import __goidl__ "github.com/bhbosman/goidl"

// TypeDef declaration: "IOP::TaggedComponentSeq", generatedBy by: "WriteTypeDefOfSequenceDcl"
//Typedef Sequence declaration: IOP::TaggedComponentSeq
type IopTaggedComponentSeq []*IopTaggedComponent

//noinspection GoSnakeCaseUsage
type IopTaggedComponentSeq_Helper struct {
}

//noinspection GoSnakeCaseUsage
const IopTaggedComponentSeqId_Const = "IDL:omg.org/IOP/TaggedComponentSeq:1.0"

func (self IopTaggedComponentSeq_Helper) Id() string {
	return IopTaggedComponentSeqId_Const
}

// WriteTypeDefOfSequenceDcl::WriteExtract
func (self IopTaggedComponentSeq_Helper) Read(stream __goidl__.IReadAny) (IopTaggedComponentSeq, error) {
	n, err := __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return nil, err
	}
	if n > 0 {
		result := make(IopTaggedComponentSeq, n)
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

func (self IopTaggedComponentSeq_Helper) Write(stream __goidl__.IWriteAny, v IopTaggedComponentSeq) error {
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
var IopTaggedComponentSeqHelper = IopTaggedComponentSeq_Helper{}

func init() {
}
