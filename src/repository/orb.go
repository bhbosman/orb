package repository

import (
	"github.com/bhbosman/orb/common"
	"github.com/bhbosman/orb/src/omg"
)

type Orb struct {
}

func (self Orb) Id() (omg.CorbaORBid, error) {
	panic("implement me")
}

func (self Orb) ObjectToString(Obj common.IdlObject) (common.IdlString, error) {
	panic("implement me")
}

func (self Orb) StringToObject(Str common.IdlString) (common.IdlObject, error) {
	panic("implement me")
}

func (self Orb) CreateList(Count common.IdlLong, NewList *omg.CorbaNVList) error {
	panic("implement me")
}

func (self Orb) CreateOperationList(Oper omg.CorbaOperationDef, NewList *omg.CorbaNVList) error {
	panic("implement me")
}

func (self Orb) GetDefaultContext(Ctx *omg.CorbaContext) error {
	panic("implement me")
}

func (self Orb) SendMultipleRequestsOneway(Req omg.CorbaRequestSeq) error {
	panic("implement me")
}

func (self Orb) SendMultipleRequestsDeferred(Req omg.CorbaRequestSeq) error {
	panic("implement me")
}

func (self Orb) PollNextResponse() (common.IdlBoolean, error) {
	panic("implement me")
}

func (self Orb) GetNextResponse(Req *omg.CorbaRequest) error {
	panic("implement me")
}

func (self Orb) GetServiceInformation(ServiceType omg.CorbaServiceType, ServiceInformation *omg.CorbaServiceInformation) (common.IdlBoolean, error) {
	panic("implement me")
}

func (self Orb) ListInitialServices() (omg.CorbaOrbObjectIdList, error) {
	panic("implement me")
}

func (self Orb) ResolveInitialReferences(Identifier omg.CorbaOrbObjectId) (common.IdlObject, error) {
	panic("implement me")
}

func (self Orb) CreateStructTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, Members omg.CorbaStructMemberSeq) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateUnionTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, DiscriminatorType omg.CorbaTypeCode, Members omg.CorbaUnionMemberSeq) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateEnumTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, Members omg.CorbaEnumMemberSeq) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateAliasTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, OriginalType omg.CorbaTypeCode) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateExceptionTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, Members omg.CorbaStructMemberSeq) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateInterfaceTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateStringTc(Bound common.IdlUnsignedLong) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateWstringTc(Bound common.IdlUnsignedLong) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateFixedTc(Digits common.IdlUnsignedShort, Scale common.IdlShort) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateSequenceTc(Bound common.IdlUnsignedLong, ElementType omg.CorbaTypeCode) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateRecursiveSequenceTc(Bound common.IdlUnsignedLong, Offset common.IdlUnsignedLong) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateArrayTc(Length common.IdlUnsignedLong, ElementType omg.CorbaTypeCode) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateValueTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, TypeModifier omg.CorbaValueModifier, ConcreteBase omg.CorbaTypeCode, Members omg.CorbaValueMemberSeq) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateValueBoxTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, BoxedType omg.CorbaTypeCode) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateNativeTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateRecursiveTc(Id omg.CorbaRepositoryId) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateAbstractInterfaceTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateLocalInterfaceTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateComponentTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateHomeTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) CreateEventTc(Id omg.CorbaRepositoryId, Name omg.CorbaIdentifier, TypeModifier omg.CorbaValueModifier, ConcreteBase omg.CorbaTypeCode, Members omg.CorbaValueMemberSeq) (omg.CorbaTypeCode, error) {
	panic("implement me")
}

func (self Orb) WorkPending() (common.IdlBoolean, error) {
	panic("implement me")
}

func (self Orb) PerformWork() error {
	panic("implement me")
}

func (self Orb) Run() error {
	panic("implement me")
}

func (self Orb) Shutdown(WaitForCompletion common.IdlBoolean) error {
	panic("implement me")
}

func (self Orb) Destroy() error {
	panic("implement me")
}

func (self Orb) CreatePolicy(Type omg.CorbaPolicyType, Val common.IdlAny) (omg.CorbaPolicy, error) {
	panic("implement me")
}

func (self Orb) RegisterValueFactory(Id omg.CorbaRepositoryId, Factory omg.CorbaValueFactory) (omg.CorbaValueFactory, error) {
	panic("implement me")
}

func (self Orb) UnregisterValueFactory(Id omg.CorbaRepositoryId) error {
	panic("implement me")
}

func (self Orb) LookupValueFactory(Id omg.CorbaRepositoryId) (omg.CorbaValueFactory, error) {
	panic("implement me")
}

func (self Orb) RegisterInitialReference(Id omg.CorbaOrbObjectId, Obj common.IdlObject) error {
	panic("implement me")
}
