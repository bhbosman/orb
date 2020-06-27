package App01

import __omg__ "github.com/bhbosman/orb/src/omg"

// Enum declaration: "CommonEnum", generatedBy by: "WriteEnumDcl"
type CommonEnum uint32

//noinspection GoUnusedConst
const (
	CommonEnumValueA CommonEnum = 0
	CommonEnumValueB CommonEnum = 1
)

//noinspection GoSnakeCaseUsage
type CommonEnum_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CommonEnumId_Const = "IDL:CommonEnum:1.0"

func (self CommonEnum_Helper) Id() string {
	return CommonEnumId_Const
}

func (self CommonEnum_Helper) Read(stream __omg__.IReadAny) (uint32, error) {
	result, err := __omg__.IdlUInt32Helper.Read(stream)
	return result, err
}

func (self CommonEnum_Helper) Write(stream __omg__.IWriteAny, v uint32) error {
	return __omg__.IdlUInt32Helper.Write(stream, v)
}

//noinspection GoUnusedGlobalVariable
var CommonEnumHelper = CommonEnum_Helper{}

func init() {
}
