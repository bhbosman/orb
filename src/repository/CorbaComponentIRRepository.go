package repository

import (
	__omg__ "github.com/bhbosman/orb/src/omg"
)

func NewCorbaComponentIRRepository() __omg__.CorbaComponentIRRepository {
	return &CorbaComponentIRRepository{}
}

type CorbaComponentIRRepository struct {
}

func (c CorbaComponentIRRepository) Contents(LimitType __omg__.CorbaDefinitionKind, ExcludeInherited __omg__.IdlBoolean) (__omg__.CorbaContainedSeq, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateAbstractInterface(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, BaseInterfaces __omg__.CorbaAbstractInterfaceDefSeq) (__omg__.CorbaAbstractInterfaceDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateAlias(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, OriginalType __omg__.CorbaIDLType) (__omg__.CorbaAliasDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateArray(Length __omg__.IdlUnsignedLong, ElementType __omg__.CorbaIDLType) (__omg__.CorbaArrayDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateConstant(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, Type __omg__.CorbaIDLType, Value __omg__.IdlAny) (__omg__.CorbaConstantDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateEnum(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, Members __omg__.CorbaEnumMemberSeq) (__omg__.CorbaEnumDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateException(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, Members __omg__.CorbaStructMemberSeq) (__omg__.CorbaExceptionDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateExtValue(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, IsCustom __omg__.IdlBoolean, IsAbstract __omg__.IdlBoolean, BaseValue __omg__.CorbaValueDef, IsTruncatable __omg__.IdlBoolean, AbstractBaseValues __omg__.CorbaValueDefSeq, SupportedInterfaces __omg__.CorbaInterfaceDefSeq, Initializers __omg__.CorbaExtInitializerSeq) (__omg__.CorbaExtValueDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateFixed(Digits __omg__.IdlUnsignedShort, Scale __omg__.IdlShort) (__omg__.CorbaFixedDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateInterface(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, BaseInterfaces __omg__.CorbaInterfaceDefSeq, IsAbstract __omg__.IdlBoolean) (__omg__.CorbaInterfaceDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateLocalInterface(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, BaseInterfaces __omg__.CorbaInterfaceDefSeq) (__omg__.CorbaLocalInterfaceDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateModule(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec) (__omg__.CorbaModuleDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateNative(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec) (__omg__.CorbaNativeDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateSequence(Bound __omg__.IdlUnsignedLong, ElementType __omg__.CorbaIDLType) (__omg__.CorbaSequenceDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateString(Bound __omg__.IdlUnsignedLong) (__omg__.CorbaStringDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateStruct(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, Members __omg__.CorbaStructMemberSeq) (__omg__.CorbaStructDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateUnion(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, DiscriminatorType __omg__.CorbaIDLType, Members __omg__.CorbaUnionMemberSeq) (__omg__.CorbaUnionDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateValue(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, IsCustom __omg__.IdlBoolean, IsAbstract __omg__.IdlBoolean, BaseValue __omg__.CorbaValueDef, IsTruncatable __omg__.IdlBoolean, AbstractBaseValues __omg__.CorbaValueDefSeq, SupportedInterfaces __omg__.CorbaInterfaceDefSeq, Initializers __omg__.CorbaInitializerSeq) (__omg__.CorbaValueDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateValueBox(Id __omg__.CorbaRepositoryId, Name __omg__.CorbaIdentifier, Version __omg__.CorbaVersionSpec, OriginalTypeDef __omg__.CorbaIDLType) (__omg__.CorbaValueBoxDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) CreateWstring(Bound __omg__.IdlUnsignedLong) (__omg__.CorbaWstringDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) DescribeContents(LimitType __omg__.CorbaDefinitionKind, ExcludeInherited __omg__.IdlBoolean, MaxReturnedObjs __omg__.IdlLong) (__omg__.CorbaContainerDescriptionSeq, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) Destroy() error {
	panic("implement me")
}

func (c CorbaComponentIRRepository) GetCanonicalTypecode(Tc __omg__.CorbaTypeCode) (__omg__.CorbaTypeCode, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) GetPrimitive(Kind __omg__.CorbaPrimitiveKind) (__omg__.CorbaPrimitiveDef, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) Lookup(SearchName __omg__.CorbaScopedName) (__omg__.CorbaContained, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) LookupId(SearchId __omg__.CorbaRepositoryId) (__omg__.CorbaContained, error) {
	panic("implement me")
}

func (c CorbaComponentIRRepository) LookupName(SearchName __omg__.CorbaIdentifier, LevelsToSearch __omg__.IdlLong, LimitType __omg__.CorbaDefinitionKind, ExcludeInherited __omg__.IdlBoolean) (__omg__.CorbaContainedSeq, error) {
	panic("implement me")
}
