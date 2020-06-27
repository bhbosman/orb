package App01

import __json__ "encoding/json"
import __omg__ "github.com/bhbosman/orb/src/omg"

// Struct declaration: "CarParts::GearBox", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type CarPartsGearBox struct {
	__omg__.IdlObject
	Gears __omg__.IdlLong `json:"Gears"`
}

//noinspection GoSnakeCaseUsage
const CarPartsGearBoxId_Const = "IDL:CarParts/GearBox:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultCarPartsGearBox() *CarPartsGearBox {
	//noinspection GoRedundantConversion
	return &CarPartsGearBox{
		IdlObject: __omg__.IdlObject{
			Id: CarPartsGearBoxId_Const,
		},
		Gears: 0,
	}
}
func (self *CarPartsGearBox) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *CarPartsGearBox) GoString() string {
	return self.String()
}

func (self *CarPartsGearBox) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	self.Gears, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Gears)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type CarPartsGearBox_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := __omg__.IdlObjectHelper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

// Struct declaration: "CarParts::GearBox01", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type CarPartsGearBox01 struct {
	CarPartsGearBox
	A __omg__.IdlLong `json:"A"`
}

//noinspection GoSnakeCaseUsage
const CarPartsGearBox01Id_Const = "IDL:CarParts/GearBox01:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultCarPartsGearBox01() *CarPartsGearBox01 {
	//noinspection GoRedundantConversion
	return &CarPartsGearBox01{
		CarPartsGearBox: CarPartsGearBox{
			IdlObject: __omg__.IdlObject{
				Id: CarPartsGearBox01Id_Const,
			},
			Gears: 0,
		},
		A: 0,
	}
}
func (self *CarPartsGearBox01) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *CarPartsGearBox01) GoString() string {
	return self.String()
}

func (self *CarPartsGearBox01) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.CarPartsGearBox.ReadValue(stream)
	if err != nil {
		return err
	}
	self.A, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox01) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox01) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.CarPartsGearBox.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.A)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type CarPartsGearBox01_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox01_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox01_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := CarPartsGearBoxHelper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

// Struct declaration: "CarParts::GearBox02", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type CarPartsGearBox02 struct {
	CarPartsGearBox01
	B __omg__.IdlLong `json:"B"`
}

//noinspection GoSnakeCaseUsage
const CarPartsGearBox02Id_Const = "IDL:CarParts/GearBox02:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultCarPartsGearBox02() *CarPartsGearBox02 {
	//noinspection GoRedundantConversion
	return &CarPartsGearBox02{
		CarPartsGearBox01: CarPartsGearBox01{
			CarPartsGearBox: CarPartsGearBox{
				IdlObject: __omg__.IdlObject{
					Id: CarPartsGearBox02Id_Const,
				},
				Gears: 0,
			},
			A: 0,
		},
		B: 0,
	}
}
func (self *CarPartsGearBox02) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *CarPartsGearBox02) GoString() string {
	return self.String()
}

func (self *CarPartsGearBox02) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.CarPartsGearBox01.ReadValue(stream)
	if err != nil {
		return err
	}
	self.B, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox02) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox02) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.CarPartsGearBox01.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.B)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type CarPartsGearBox02_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox02_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox02_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := CarPartsGearBox01Helper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

// Struct declaration: "CarParts::GearBox03", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type CarPartsGearBox03 struct {
	CarPartsGearBox02
	C __omg__.IdlLong `json:"C"`
}

//noinspection GoSnakeCaseUsage
const CarPartsGearBox03Id_Const = "IDL:CarParts/GearBox03:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultCarPartsGearBox03() *CarPartsGearBox03 {
	//noinspection GoRedundantConversion
	return &CarPartsGearBox03{
		CarPartsGearBox02: CarPartsGearBox02{
			CarPartsGearBox01: CarPartsGearBox01{
				CarPartsGearBox: CarPartsGearBox{
					IdlObject: __omg__.IdlObject{
						Id: CarPartsGearBox03Id_Const,
					},
					Gears: 0,
				},
				A: 0,
			},
			B: 0,
		},
		C: 0,
	}
}
func (self *CarPartsGearBox03) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *CarPartsGearBox03) GoString() string {
	return self.String()
}

func (self *CarPartsGearBox03) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.CarPartsGearBox02.ReadValue(stream)
	if err != nil {
		return err
	}
	self.C, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox03) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox03) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.CarPartsGearBox02.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.C)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type CarPartsGearBox03_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox03_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox03_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := CarPartsGearBox02Helper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

// Struct declaration: "CarParts::GearBox04", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type CarPartsGearBox04 struct {
	CarPartsGearBox03
	D __omg__.IdlLong `json:"D"`
}

//noinspection GoSnakeCaseUsage
const CarPartsGearBox04Id_Const = "IDL:CarParts/GearBox04:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultCarPartsGearBox04() *CarPartsGearBox04 {
	//noinspection GoRedundantConversion
	return &CarPartsGearBox04{
		CarPartsGearBox03: CarPartsGearBox03{
			CarPartsGearBox02: CarPartsGearBox02{
				CarPartsGearBox01: CarPartsGearBox01{
					CarPartsGearBox: CarPartsGearBox{
						IdlObject: __omg__.IdlObject{
							Id: CarPartsGearBox04Id_Const,
						},
						Gears: 0,
					},
					A: 0,
				},
				B: 0,
			},
			C: 0,
		},
		D: 0,
	}
}
func (self *CarPartsGearBox04) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *CarPartsGearBox04) GoString() string {
	return self.String()
}

func (self *CarPartsGearBox04) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.CarPartsGearBox03.ReadValue(stream)
	if err != nil {
		return err
	}
	self.D, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox04) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox04) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.CarPartsGearBox03.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.D)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type CarPartsGearBox04_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox04_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox04_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := CarPartsGearBox03Helper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

// Struct declaration: "CarParts::GearBox05", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type CarPartsGearBox05 struct {
	CarPartsGearBox04
	E __omg__.IdlLong `json:"E"`
}

//noinspection GoSnakeCaseUsage
const CarPartsGearBox05Id_Const = "IDL:CarParts/GearBox05:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultCarPartsGearBox05() *CarPartsGearBox05 {
	//noinspection GoRedundantConversion
	return &CarPartsGearBox05{
		CarPartsGearBox04: CarPartsGearBox04{
			CarPartsGearBox03: CarPartsGearBox03{
				CarPartsGearBox02: CarPartsGearBox02{
					CarPartsGearBox01: CarPartsGearBox01{
						CarPartsGearBox: CarPartsGearBox{
							IdlObject: __omg__.IdlObject{
								Id: CarPartsGearBox05Id_Const,
							},
							Gears: 0,
						},
						A: 0,
					},
					B: 0,
				},
				C: 0,
			},
			D: 0,
		},
		E: 0,
	}
}
func (self *CarPartsGearBox05) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *CarPartsGearBox05) GoString() string {
	return self.String()
}

func (self *CarPartsGearBox05) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.CarPartsGearBox04.ReadValue(stream)
	if err != nil {
		return err
	}
	self.E, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox05) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsGearBox05) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.CarPartsGearBox04.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.E)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type CarPartsGearBox05_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox05_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsGearBox05_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := CarPartsGearBox04Helper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

// Struct declaration: "CarParts::Wheel", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type CarPartsWheel struct {
	__omg__.IdlObject
	Nuts __omg__.IdlLong `json:"Nuts"`
}

//noinspection GoSnakeCaseUsage
const CarPartsWheelId_Const = "IDL:CarParts/Wheel:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultCarPartsWheel() *CarPartsWheel {
	//noinspection GoRedundantConversion
	return &CarPartsWheel{
		IdlObject: __omg__.IdlObject{
			Id: CarPartsWheelId_Const,
		},
		Nuts: 0,
	}
}
func (self *CarPartsWheel) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *CarPartsWheel) GoString() string {
	return self.String()
}

func (self *CarPartsWheel) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	self.Nuts, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsWheel) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *CarPartsWheel) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Nuts)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type CarPartsWheel_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsWheel_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *CarPartsWheel_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := __omg__.IdlObjectHelper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

//noinspection GoUnusedGlobalVariable
var CarPartsGearBoxHelper = CarPartsGearBox_Helper{}

//noinspection GoUnusedGlobalVariable
var CarPartsGearBox01Helper = CarPartsGearBox01_Helper{}

//noinspection GoUnusedGlobalVariable
var CarPartsGearBox02Helper = CarPartsGearBox02_Helper{}

//noinspection GoUnusedGlobalVariable
var CarPartsGearBox03Helper = CarPartsGearBox03_Helper{}

//noinspection GoUnusedGlobalVariable
var CarPartsGearBox04Helper = CarPartsGearBox04_Helper{}

//noinspection GoUnusedGlobalVariable
var CarPartsGearBox05Helper = CarPartsGearBox05_Helper{}

//noinspection GoUnusedGlobalVariable
var CarPartsWheelHelper = CarPartsWheel_Helper{}
