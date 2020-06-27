package repository

import (
	"github.com/bhbosman/orb/common"
	"github.com/bhbosman/orb/src/omg"
	"io"
)

type OutputStream struct {
	any common.IdlAny
}

func (self OutputStream) WriteAny(Value common.IdlAny) error {
	if Value == nil {
		dd1
	}
	self.WriteTypeCode(Value.TypeCode())
	_, err := io.Copy(self.any, Value)
	return err
}

func (self OutputStream) WriteBoolean(Value common.IdlBoolean) error {

	panic("implement me")
}

func (self OutputStream) WriteChar(Value common.IdlChar) error {
	panic("implement me")
}

func (self OutputStream) WriteWchar(Value common.IdlWideChar) error {
	panic("implement me")
}

func (self OutputStream) WriteOctet(Value common.IdlOctet) error {
	panic("implement me")
}

func (self OutputStream) WriteShort(Value common.IdlShort) error {
	panic("implement me")
}

func (self OutputStream) WriteUshort(Value common.IdlUnsignedShort) error {
	panic("implement me")
}

func (self OutputStream) WriteLong(Value common.IdlLong) error {
	panic("implement me")
}

func (self OutputStream) WriteUlong(Value common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteLonglong(Value common.IdlLongLong) error {
	panic("implement me")
}

func (self OutputStream) WriteUlonglong(Value common.IdlUnsignedLongLong) error {
	panic("implement me")
}

func (self OutputStream) WriteFloat(Value common.IdlFloatType) error {
	panic("implement me")
}

func (self OutputStream) WriteDouble(Value common.IdlDoubleType) error {
	panic("implement me")
}

func (self OutputStream) WriteLongdouble(Value common.IdlLongDoubleType) error {
	panic("implement me")
}

func (self OutputStream) WriteString(Value common.IdlString) error {
	panic("implement me")
}

func (self OutputStream) WriteWstring(Value common.IdlWideString) error {
	panic("implement me")
}

func (self OutputStream) WriteObject(Value common.IdlObject) error {
	panic("implement me")
}

func (self OutputStream) WriteAbstract(Value omg.CorbaAbstractBase) error {
	panic("implement me")
}

func (self OutputStream) WriteValue(Value common.IdlValueBase) error {
	panic("implement me")
}

func (self OutputStream) WriteTypeCode(Value omg.CorbaTypeCode) error {
	panic("implement me")
}

func (self OutputStream) WriteAnyArray(Seq omg.CorbaAnySeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteBooleanArray(Seq omg.CorbaBooleanSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteCharArray(Seq omg.CorbaCharSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteWcharArray(Seq omg.CorbaWCharSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteOctetArray(Seq omg.CorbaOctetSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteShortArray(Seq omg.CorbaShortSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteUshortArray(Seq omg.CorbaUShortSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteLongArray(Seq omg.CorbaLongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteUlongArray(Seq omg.CorbaULongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteUlonglongArray(Seq omg.CorbaULongLongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteLonglongArray(Seq omg.CorbaLongLongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteFloatArray(Seq omg.CorbaFloatSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteDoubleArray(Seq omg.CorbaDoubleSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteLongDoubleArray(Seq omg.CorbaLongDoubleSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (self OutputStream) WriteFixed(FixedValue common.IdlAny) error {
	panic("implement me")
}

func (self OutputStream) WriteFixedArray(Seq omg.CorbaAnySeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}
