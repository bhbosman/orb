// Code generated by me. DO NOT EDIT.

package omg

import __goidl__ "github.com/bhbosman/goidl"
import __json__ "encoding/json"
import __reflect__ "reflect"
import __yaccidl__ "github.com/bhbosman/yaccidl"

// TypeDef declaration: "MIOP::UniqueId", generatedBy by: "WriteTypeDefOfSequenceDcl"
//Typedef Sequence declaration: MIOP::UniqueId
type MiopUniqueId []byte

//noinspection GoSnakeCaseUsage
type MiopUniqueId_Helper struct {
}

//noinspection GoSnakeCaseUsage
const MiopUniqueIdId_Const = "IDL:omg.org/MIOP/UniqueId:1.0"

func (self MiopUniqueId_Helper) Id() string {
	return MiopUniqueIdId_Const
}

// WriteTypeDefOfSequenceDcl::WriteExtract
func (self MiopUniqueId_Helper) Read(stream __goidl__.IReadAny) (MiopUniqueId, error) {
	n, err := __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return nil, err
	}
	if n > 0 {
		result := make(MiopUniqueId, n)
		var i uint32
		for i = 0; i < n; i++ {
			result[i], err = __goidl__.IdlOctetHelper.Read(stream)
			if err != nil {
				return nil, err
			}
		}
		return result, nil
	}
	return nil, nil
}

func (self MiopUniqueId_Helper) Write(stream __goidl__.IWriteAny, v MiopUniqueId) error {
	if v == nil {
		return __goidl__.IdlUInt32Helper.Write(stream, 0)
	}
	err := __goidl__.IdlUInt32Helper.Write(stream, uint32(len(v)))
	if err != nil {
		return nil
	}
	for _, item := range v {
			err = __goidl__.IdlOctetHelper.Write(stream, item)
		if err != nil {
			return err
		}
	}
	return err
}

// Struct declaration: "MIOP::PacketHeader_1_0", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type MiopPacketHeader10 struct {
	__goidl__.IdlObject
	Magic [4]byte `json:"Magic"`
	HdrVersion byte `json:"HdrVersion"`
	Flags byte `json:"Flags"`
	PacketLength uint16 `json:"PacketLength"`
	PacketNumber uint32 `json:"PacketNumber"`
	NumberOfPackets uint32 `json:"NumberOfPackets"`
	Id MiopUniqueId `json:"Id"`
}

//noinspection GoSnakeCaseUsage
const MiopPacketHeader10Id_Const = "IDL:omg.org/MIOP/PacketHeader_1_0:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultMiopPacketHeader10() *MiopPacketHeader10 {
	//noinspection GoRedundantConversion
	return &MiopPacketHeader10{
		IdlObject: __goidl__.IdlObject{
			Id: MiopPacketHeader10Id_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "magic", Type: "IdlChar" Scope: "CharType"
		Magic: [4]byte{},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "hdr_version", Type: "IdlOctet" Scope: "IdlOctetKind"
		HdrVersion: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "flags", Type: "IdlOctet" Scope: "IdlOctetKind"
		Flags: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "packet_length", Type: "IdlUnsignedShort" Scope: "UnsignedShortType"
		PacketLength: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "packet_number", Type: "IdlUnsignedLong" Scope: "UnsignedLongType"
		PacketNumber: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "number_of_packets", Type: "IdlUnsignedLong" Scope: "UnsignedLongType"
		NumberOfPackets: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "Id", Type: "MIOP::UniqueId" Scope: "IdlTypedef"
		Id: MiopUniqueId(nil),
	}
}

//noinspection GoUnusedExportedFunction
func NewMiopPacketHeader10(
	//"StructDclAllParamsConstructorParamService"
	Magic [4]byte,
	//"StructDclAllParamsConstructorParamService"
	HdrVersion byte,
	//"StructDclAllParamsConstructorParamService"
	Flags byte,
	//"StructDclAllParamsConstructorParamService"
	PacketLength uint16,
	//"StructDclAllParamsConstructorParamService"
	PacketNumber uint32,
	//"StructDclAllParamsConstructorParamService"
	NumberOfPackets uint32,
	//"StructDclAllParamsConstructorParamService"
	Id MiopUniqueId) *MiopPacketHeader10 {
	//noinspection GoRedundantConversion
	return &MiopPacketHeader10{
		IdlObject: __goidl__.IdlObject{
			Id: MiopPacketHeader10Id_Const,
		},
		Magic: Magic,
		HdrVersion: HdrVersion,
		Flags: Flags,
		PacketLength: PacketLength,
		PacketNumber: PacketNumber,
		NumberOfPackets: NumberOfPackets,
		Id: Id,
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomMiopPacketHeader10(randomGenerator __goidl__.IRandomDataGenerator) *MiopPacketHeader10 {
	//noinspection GoRedundantConversion
	return &MiopPacketHeader10{
		IdlObject: __goidl__.IdlObject{
			Id: MiopPacketHeader10Id_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "magic", Type: "IdlChar" Scope: "CharType"
		Magic: [4]byte{},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "hdr_version", Type: "IdlOctet" Scope: "IdlOctetKind"
		HdrVersion: randomGenerator.OctetTypeValue(__reflect__.TypeOf((*MiopPacketHeader10)(nil)), "HdrVersion"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "flags", Type: "IdlOctet" Scope: "IdlOctetKind"
		Flags: randomGenerator.OctetTypeValue(__reflect__.TypeOf((*MiopPacketHeader10)(nil)), "Flags"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "packet_length", Type: "IdlUnsignedShort" Scope: "UnsignedShortType"
		PacketLength: randomGenerator.UnsignedShortTypeValue(__reflect__.TypeOf((*MiopPacketHeader10)(nil)), "PacketLength"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "packet_number", Type: "IdlUnsignedLong" Scope: "UnsignedLongType"
		PacketNumber: randomGenerator.UnsignedLongTypeValue(__reflect__.TypeOf((*MiopPacketHeader10)(nil)), "PacketNumber"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "number_of_packets", Type: "IdlUnsignedLong" Scope: "UnsignedLongType"
		NumberOfPackets: randomGenerator.UnsignedLongTypeValue(__reflect__.TypeOf((*MiopPacketHeader10)(nil)), "NumberOfPackets"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "Id", Type: "MIOP::UniqueId" Scope: "IdlTypedef"
		Id: MiopUniqueId(nil),
	}
}

func (self *MiopPacketHeader10) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *MiopPacketHeader10) GoString() string {
	return self.String()
}

func (self *MiopPacketHeader10) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(CharType)
	for i0 := 0; i0 < 4; i0++ {
		self.Magic[i0], err = __goidl__.IdlOctetHelper.Read(stream)
		if err != nil {
			return err
		}
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlOctetKind)
	self.HdrVersion, err = __goidl__.IdlOctetHelper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlOctetKind)
	self.Flags, err = __goidl__.IdlOctetHelper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(UnsignedShortType)
	self.PacketLength, err = __goidl__.IdlUInt16Helper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(UnsignedLongType)
	self.PacketNumber, err = __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(UnsignedLongType)
	self.NumberOfPackets, err = __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlSequence)
	self.Id, err = MiopUniqueIdHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *MiopPacketHeader10) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *MiopPacketHeader10) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(CharType)
	for i0 := 0; i0 < 4; i0++ {
		err = __goidl__.IdlOctetHelper.Write(stream, self.Magic[i0])
		if err != nil {
			return err
		}
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlOctetKind)
	err = __goidl__.IdlOctetHelper.Write(stream, self.HdrVersion)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlOctetKind)
	err = __goidl__.IdlOctetHelper.Write(stream, self.Flags)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(UnsignedShortType)
	err = __goidl__.IdlUInt16Helper.Write(stream, self.PacketLength)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(UnsignedLongType)
	err = __goidl__.IdlUInt32Helper.Write(stream, self.PacketNumber)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(UnsignedLongType)
	err = __goidl__.IdlUInt32Helper.Write(stream, self.NumberOfPackets)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlSequence)
	err = MiopUniqueIdHelper.Write(stream, self.Id)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type MiopPacketHeader10_Helper struct {
}

// TypeDef declaration: "MIOP::Address", generatedBy by: "WriteTypeDefOfPrimitiveDcl"
//Typedef Primitive declaration: "MIOP::Address" from: "string"
type MiopAddress string

//noinspection GoSnakeCaseUsage
type MiopAddress_Helper struct {
}

//noinspection GoSnakeCaseUsage
const MiopAddressId_Const = "IDL:omg.org/MIOP/Address:1.0"

func (self MiopAddress_Helper) Id() string {
	return MiopAddressId_Const
}

func (self MiopAddress_Helper) Read(stream __goidl__.IReadAny) (string, error) {
	result, err := __goidl__.IdlStringHelper.Read(stream)
	return result, err
}

func (self MiopAddress_Helper) Write(stream __goidl__.IWriteAny, v string) error {
	return __goidl__.IdlStringHelper.Write(stream, v)
}

// Struct declaration: "MIOP::UIPMC_ProfileBody", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type MiopUipmcProfileBody struct {
	__goidl__.IdlObject
	MiopVersion GiopVersion `json:"MiopVersion"`
	TheAddress string `json:"TheAddress"`
	ThePort int16 `json:"ThePort"`
	Components IopTaggedComponentSeq `json:"Components"`
}

//noinspection GoSnakeCaseUsage
const MiopUipmcProfileBodyId_Const = "IDL:omg.org/MIOP/UIPMC_ProfileBody:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultMiopUipmcProfileBody() *MiopUipmcProfileBody {
	//noinspection GoRedundantConversion
	return &MiopUipmcProfileBody{
		IdlObject: __goidl__.IdlObject{
			Id: MiopUipmcProfileBodyId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "miop_version", Type: "GIOP::Version" Scope: "IdlStruct"
		MiopVersion: GiopVersion{
		IdlObject: __goidl__.IdlObject{
			Id: "ddd",
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "major", Type: "IdlOctet" Scope: "IdlOctetKind"
		Major: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "minor", Type: "IdlOctet" Scope: "IdlOctetKind"
		Minor: 0,
	},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "the_address", Type: "MIOP::Address" Scope: "IdlTypedef"
		TheAddress: "",
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "the_port", Type: "IdlShort" Scope: "ShortType"
		ThePort: 0,
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "components", Type: "IOP::TaggedComponentSeq" Scope: "IdlTypedef"
		Components: IopTaggedComponentSeq(nil),
	}
}

//noinspection GoUnusedExportedFunction
func NewMiopUipmcProfileBody(
	//"StructDclAllParamsConstructorParamService"
	MiopVersion GiopVersion,
	//"StructDclAllParamsConstructorParamService"
	TheAddress string,
	//"StructDclAllParamsConstructorParamService"
	ThePort int16,
	//"StructDclAllParamsConstructorParamService"
	Components IopTaggedComponentSeq) *MiopUipmcProfileBody {
	//noinspection GoRedundantConversion
	return &MiopUipmcProfileBody{
		IdlObject: __goidl__.IdlObject{
			Id: MiopUipmcProfileBodyId_Const,
		},
		MiopVersion: MiopVersion,
		TheAddress: TheAddress,
		ThePort: ThePort,
		Components: Components,
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomMiopUipmcProfileBody(randomGenerator __goidl__.IRandomDataGenerator) *MiopUipmcProfileBody {
	//noinspection GoRedundantConversion
	return &MiopUipmcProfileBody{
		IdlObject: __goidl__.IdlObject{
			Id: MiopUipmcProfileBodyId_Const,
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "miop_version", Type: "GIOP::Version" Scope: "IdlStruct"
		MiopVersion: GiopVersion{
		IdlObject: __goidl__.IdlObject{
			Id: "ddd",
		},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "major", Type: "IdlOctet" Scope: "IdlOctetKind"
		Major: randomGenerator.OctetTypeValue(__reflect__.TypeOf((*MiopUipmcProfileBody)(nil)), "Major"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "minor", Type: "IdlOctet" Scope: "IdlOctetKind"
		Minor: randomGenerator.OctetTypeValue(__reflect__.TypeOf((*MiopUipmcProfileBody)(nil)), "Minor"),
	},
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "the_address", Type: "MIOP::Address" Scope: "IdlTypedef"
		TheAddress: randomGenerator.StringTypeValue(__reflect__.TypeOf((*MiopUipmcProfileBody)(nil)), "TheAddress"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "the_port", Type: "IdlShort" Scope: "ShortType"
		ThePort: randomGenerator.ShortTypeValue(__reflect__.TypeOf((*MiopUipmcProfileBody)(nil)), "ThePort"),
		// "StructDclDefaultConstructorMemberDefaultValueService", MemberName: "components", Type: "IOP::TaggedComponentSeq" Scope: "IdlTypedef"
		Components: IopTaggedComponentSeq(nil),
	}
}

func (self *MiopUipmcProfileBody) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *MiopUipmcProfileBody) GoString() string {
	return self.String()
}

func (self *MiopUipmcProfileBody) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlStruct)
	err = self.MiopVersion.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(StringType)
	self.TheAddress, err = __goidl__.IdlStringHelper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(ShortType)
	self.ThePort, err = __goidl__.IdlInt16Helper.Read(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberExtractValue(IdlSequence)
	self.Components, err = IopTaggedComponentSeqHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *MiopUipmcProfileBody) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *MiopUipmcProfileBody) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlStruct)
	err = self.MiopVersion.Write(stream)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(StringType)
	err = __goidl__.IdlStringHelper.Write(stream, self.TheAddress)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(ShortType)
	err = __goidl__.IdlInt16Helper.Write(stream, self.ThePort)
	if err != nil {
		return err
	}
	// WriteStructHelper::WriteStructMemberInsert(IdlSequence)
	err = IopTaggedComponentSeqHelper.Write(stream, self.Components)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type MiopUipmcProfileBody_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var MiopUniqueIdHelper = MiopUniqueId_Helper{}

//noinspection GoUnusedGlobalVariable
var MiopPacketHeader10Helper = MiopPacketHeader10_Helper{}

//noinspection GoUnusedGlobalVariable
var MiopAddressHelper = MiopAddress_Helper{}

//noinspection GoUnusedGlobalVariable
var MiopUipmcProfileBodyHelper = MiopUipmcProfileBody_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			MiopPacketHeader10Id_Const,
			__yaccidl__.IdlStruct,
			"MIOP.idl.go",
			func() __goidl__.IIdlObject {
				return NewDefaultMiopPacketHeader10()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewRandomMiopPacketHeader10(generator)
			},
			__reflect__.TypeOf((*MiopPacketHeader10)(nil))))
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			MiopUipmcProfileBodyId_Const,
			__yaccidl__.IdlStruct,
			"MIOP.idl.go",
			func() __goidl__.IIdlObject {
				return NewDefaultMiopUipmcProfileBody()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewRandomMiopUipmcProfileBody(generator)
			},
			__reflect__.TypeOf((*MiopUipmcProfileBody)(nil))))
}
