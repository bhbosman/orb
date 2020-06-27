package App01

import __json__ "encoding/json"
import __omg__ "github.com/bhbosman/orb/src/omg"

// Struct declaration: "Sedan::Sedan", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type SedanSedan struct {
	CarVehicle
	GearBox   CarPartsGearBox   `json:"GearBox"`
	GearBox01 CarPartsGearBox01 `json:"GearBox01"`
	GearBox02 CarPartsGearBox02 `json:"GearBox02"`
	GearBox03 CarPartsGearBox03 `json:"GearBox03"`
	GearBox04 CarPartsGearBox04 `json:"GearBox04"`
	GearBox05 CarPartsGearBox05 `json:"GearBox05"`
}

//noinspection GoSnakeCaseUsage
const SedanSedanId_Const = "IDL:Sedan/Sedan:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultSedanSedan() *SedanSedan {
	//noinspection GoRedundantConversion
	return &SedanSedan{
		CarVehicle: CarVehicle{
			IdlObject: __omg__.IdlObject{
				Id: SedanSedanId_Const,
			},
			Registration: "",
			MaxSpeed:     0,
		},
		GearBox: CarPartsGearBox{
			IdlObject: __omg__.IdlObject{
				Id: "ddd",
			},
		},
		GearBox01: CarPartsGearBox01{
			CarPartsGearBox: CarPartsGearBox{
				IdlObject: __omg__.IdlObject{
					Id: "ddd",
				},
			},
			A: 0,
		},
		GearBox02: CarPartsGearBox02{
			CarPartsGearBox01: CarPartsGearBox01{
				CarPartsGearBox: CarPartsGearBox{
					IdlObject: __omg__.IdlObject{
						Id: "ddd",
					},
				},
				A: 0,
			},
			B: 0,
		},
		GearBox03: CarPartsGearBox03{
			CarPartsGearBox02: CarPartsGearBox02{
				CarPartsGearBox01: CarPartsGearBox01{
					CarPartsGearBox: CarPartsGearBox{
						IdlObject: __omg__.IdlObject{
							Id: "ddd",
						},
					},
					A: 0,
				},
				B: 0,
			},
			C: 0,
		},
		GearBox04: CarPartsGearBox04{
			CarPartsGearBox03: CarPartsGearBox03{
				CarPartsGearBox02: CarPartsGearBox02{
					CarPartsGearBox01: CarPartsGearBox01{
						CarPartsGearBox: CarPartsGearBox{
							IdlObject: __omg__.IdlObject{
								Id: "ddd",
							},
						},
						A: 0,
					},
					B: 0,
				},
				C: 0,
			},
			D: 0,
		},
		GearBox05: CarPartsGearBox05{
			CarPartsGearBox04: CarPartsGearBox04{
				CarPartsGearBox03: CarPartsGearBox03{
					CarPartsGearBox02: CarPartsGearBox02{
						CarPartsGearBox01: CarPartsGearBox01{
							CarPartsGearBox: CarPartsGearBox{
								IdlObject: __omg__.IdlObject{
									Id: "ddd",
								},
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
		},
	}
}

func (self *SedanSedan) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *SedanSedan) GoString() string {
	return self.String()
}

func (self *SedanSedan) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.CarVehicle.ReadValue(stream)
	if err != nil {
		return err
	}
	err = self.GearBox.ReadValue(stream)
	if err != nil {
		return err
	}
	err = self.GearBox01.ReadValue(stream)
	if err != nil {
		return err
	}
	err = self.GearBox02.ReadValue(stream)
	if err != nil {
		return err
	}
	err = self.GearBox03.ReadValue(stream)
	if err != nil {
		return err
	}
	err = self.GearBox04.ReadValue(stream)
	if err != nil {
		return err
	}
	err = self.GearBox05.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *SedanSedan) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *SedanSedan) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.CarVehicle.Write(stream)
	if err != nil {
		return err
	}
	err = self.GearBox.Write(stream)
	if err != nil {
		return err
	}
	err = self.GearBox01.Write(stream)
	if err != nil {
		return err
	}
	err = self.GearBox02.Write(stream)
	if err != nil {
		return err
	}
	err = self.GearBox03.Write(stream)
	if err != nil {
		return err
	}
	err = self.GearBox04.Write(stream)
	if err != nil {
		return err
	}
	err = self.GearBox05.Write(stream)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type SedanSedan_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *SedanSedan_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *SedanSedan_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := CarVehicleHelper.AddMembers(orb, memberSeq)
	if err != nil {
		return err
	}
	var memberInstance *__omg__.CorbaStructMember
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

//noinspection GoUnusedGlobalVariable
var SedanSedanHelper = SedanSedan_Helper{}
