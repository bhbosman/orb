package App01

import __common__ "github.com/bhbosman/orb/src/TestApplicationData/common"
import __omg__ "github.com/bhbosman/orb/src/omg"

// TypeDef declaration: "App01Enum", generatedBy by: "WriteTypeDefOfScopeDcl(*objects.ScopeDcl)"
// Typedef Primitive declaration: App01Enum
type App01Enum __common__.CommonEnum

//noinspection GoSnakeCaseUsage
type App01Enum_Helper struct {
}

//noinspection GoSnakeCaseUsage
const App01EnumId_Const = "IDL:App01Enum:1.0"

func (self App01Enum_Helper) Id() string {
	return App01EnumId_Const
}

func (self App01Enum_Helper) Read(stream __omg__.IReadAny) (App01Enum, error) {
	result, err := __common__.CommonEnumHelper.Read(stream)
	return App01Enum(result), err
}

func (self App01Enum_Helper) Write(stream __omg__.IWriteAny, v App01Enum) error {
	return __common__.CommonEnumHelper.Write(stream, uint32(v))
}

//noinspection GoUnusedGlobalVariable
var App01EnumHelper = App01Enum_Helper{}

func init() {
}
