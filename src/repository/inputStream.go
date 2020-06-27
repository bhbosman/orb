package repository

import (
	"github.com/bhbosman/orb/common"
	"github.com/bhbosman/orb/src/omg"
)

const (
	defaultBufSize = 4096
)

type InputStream struct {
}

func (s InputStream) ReadAny() (common.IdlAny, error) {
	panic("implement me")
}

func (s InputStream) ReadBoolean() (common.IdlBoolean, error) {
	panic("implement me")
}

func (s InputStream) ReadChar() (common.IdlChar, error) {
	panic("implement me")
}

func (s InputStream) ReadWchar() (common.IdlWideChar, error) {
	panic("implement me")
}

func (s InputStream) ReadOctet() (common.IdlOctet, error) {
	panic("implement me")
}

func (s InputStream) ReadShort() (common.IdlShort, error) {
	panic("implement me")
}

func (s InputStream) ReadUshort() (common.IdlUnsignedShort, error) {
	panic("implement me")
}

func (s InputStream) ReadLong() (common.IdlLong, error) {
	panic("implement me")
}

func (s InputStream) ReadUlong() (common.IdlUnsignedLong, error) {
	panic("implement me")
}

func (s InputStream) ReadLonglong() (common.IdlLongLong, error) {
	panic("implement me")
}

func (s InputStream) ReadUlonglong() (common.IdlUnsignedLongLong, error) {
	panic("implement me")
}

func (s InputStream) ReadFloat() (common.IdlFloatType, error) {
	panic("implement me")
}

func (s InputStream) ReadDouble() (common.IdlDoubleType, error) {
	panic("implement me")
}

func (s InputStream) ReadLongdouble() (common.IdlLongDoubleType, error) {
	panic("implement me")
}

func (s InputStream) ReadString() (common.IdlString, error) {
	panic("implement me")
}

func (s InputStream) ReadWstring() (common.IdlWideString, error) {
	panic("implement me")
}

func (s InputStream) ReadObject() (common.IdlObject, error) {
	panic("implement me")
}

func (s InputStream) ReadAbstract() (omg.CorbaAbstractBase, error) {
	panic("implement me")
}

func (s InputStream) ReadValue() (common.IdlValueBase, error) {
	panic("implement me")
}

func (s InputStream) ReadTypeCode() (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (s InputStream) ReadAnyArray(Seq *omg.CorbaAnySeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadBooleanArray(Seq *omg.CorbaBooleanSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadCharArray(Seq *omg.CorbaCharSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadWcharArray(Seq *omg.CorbaWCharSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadOctetArray(Seq *omg.CorbaOctetSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadShortArray(Seq *omg.CorbaShortSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadUshortArray(Seq *omg.CorbaUShortSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadLongArray(Seq *omg.CorbaLongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadUlongArray(Seq *omg.CorbaULongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadUlonglongArray(Seq *omg.CorbaULongLongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadLonglongArray(Seq *omg.CorbaLongLongSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadFloatArray(Seq *omg.CorbaFloatSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadDoubleArray(Seq *omg.CorbaDoubleSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadLongDoubleArray(Seq *omg.CorbaDoubleSeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong) error {
	panic("implement me")
}

func (s InputStream) ReadFixed(Digits common.IdlUnsignedShort, Scale common.IdlShort) (common.IdlAny, error) {
	panic("implement me")
}

func (s InputStream) ReadFixedArray(Seq *omg.CorbaAnySeq, Offset common.IdlUnsignedLong, Length common.IdlUnsignedLong, Digits common.IdlUnsignedShort, Scale common.IdlShort) error {
	panic("implement me")
}
