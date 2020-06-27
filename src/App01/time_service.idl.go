package App01

import __json__ "encoding/json"
import __omg__ "github.com/bhbosman/orb/src/omg"

// Struct declaration: "TimeService::ICurrentTime::CurrentTime", generatedBy by: "WriteStructDcl"
// Exception Decl: false
type TimeServiceICurrentTimeCurrentTime struct {
	__omg__.IdlObject
	TimeZone __omg__.IdlString `json:"TimeZone"`
	Year     __omg__.IdlLong   `json:"Year"`
	Month    __omg__.IdlLong   `json:"Month"`
	Day      __omg__.IdlLong   `json:"Day"`
	Hour     __omg__.IdlLong   `json:"Hour"`
	Minute   __omg__.IdlLong   `json:"Minute"`
	Second   __omg__.IdlLong   `json:"Second"`
	Zzz      __omg__.IdlLong   `json:"Zzz"`
}

//noinspection GoSnakeCaseUsage
const TimeServiceICurrentTimeCurrentTimeId_Const = "IDL:TimeService/ICurrentTime/CurrentTime:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultTimeServiceICurrentTimeCurrentTime() *TimeServiceICurrentTimeCurrentTime {
	//noinspection GoRedundantConversion
	return &TimeServiceICurrentTimeCurrentTime{
		IdlObject: __omg__.IdlObject{
			Id: TimeServiceICurrentTimeCurrentTimeId_Const,
		},
		TimeZone: "",
		Year:     0,
		Month:    0,
		Day:      0,
		Hour:     0,
		Minute:   0,
		Second:   0,
		Zzz:      0,
	}
}

func (self *TimeServiceICurrentTimeCurrentTime) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *TimeServiceICurrentTimeCurrentTime) GoString() string {
	return self.String()
}

func (self *TimeServiceICurrentTimeCurrentTime) ReadValue(stream __omg__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	self.TimeZone, err = __omg__.IdlStringHelper.Read(stream)
	if err != nil {
		return err
	}
	self.Year, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	self.Month, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	self.Day, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	self.Hour, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	self.Minute, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	self.Second, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	self.Zzz, err = __omg__.IdlLongHelper.Read(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *TimeServiceICurrentTimeCurrentTime) Read(stream __omg__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *TimeServiceICurrentTimeCurrentTime) Write(stream __omg__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	err = __omg__.IdlStringHelper.Write(stream, self.TimeZone)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Year)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Month)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Day)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Hour)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Minute)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Second)
	if err != nil {
		return err
	}
	err = __omg__.IdlLongHelper.Write(stream, self.Zzz)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type TimeServiceICurrentTimeCurrentTime_Helper struct {
}

//noinspection GoSnakeCaseUsage
func (self *TimeServiceICurrentTimeCurrentTime_Helper) CreateTypeCode(orb __omg__.CorbaOrb) (__omg__.CorbaTypeCode, error) {
	var err error
	var memberSeq __omg__.CorbaStructMemberSeq = nil
	err = self.AddMembers(orb, &memberSeq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

//noinspection GoSnakeCaseUsage
func (self *TimeServiceICurrentTimeCurrentTime_Helper) AddMembers(orb __omg__.CorbaOrb, memberSeq *__omg__.CorbaStructMemberSeq) error {
	err := __omg__.IdlObjectHelper.AddMembers(orb, memberSeq)
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
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	memberInstance = __omg__.NewDefaultCorbaStructMember()
	*memberSeq = append(*memberSeq, memberInstance)
	return nil
}

// Interface declaration: "TimeService::ICurrentTime", generatedBy by: "WriteInterface"
type TimeServiceICurrentTime interface {
	// Interface operations
	// Original name: "UTC"
	Utc() (result TimeServiceICurrentTimeCurrentTime, err error)
}

//noinspection GoSnakeCaseUsage
type TimeServiceICurrentTime_Helper struct {
}

//noinspection GoSnakeCaseUsage
const TimeServiceICurrentTimeId_Const = "IDL:TimeService/ICurrentTime:1.0"

func (self TimeServiceICurrentTime_Helper) Id() string {
	return TimeServiceICurrentTimeId_Const
}

func (self TimeServiceICurrentTime_Helper) Read(stream __omg__.IReadAny) (TimeServiceICurrentTime, error) {
	return nil, nil
}

func (self TimeServiceICurrentTime_Helper) Write(stream __omg__.IWriteAny, v TimeServiceICurrentTime) error {
	return nil
}

//noinspection GoUnusedGlobalVariable
var TimeServiceICurrentTimeCurrentTimeHelper = TimeServiceICurrentTimeCurrentTime_Helper{}

//noinspection GoUnusedGlobalVariable
var TimeServiceICurrentTimeHelper = TimeServiceICurrentTime_Helper{}
