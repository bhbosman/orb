// Code generated by me. DO NOT EDIT.

package omg

import __goidl__ "github.com/bhbosman/goidl"

// Interface declaration: "CORBA::DomainManager", generatedBy by: "WriteInterface"
type CorbaDomainManager interface {
	// Interface operations
	// Original name: "get_domain_policy"
	GetDomainPolicy(PolicyType uint32) (result CorbaPolicy, err error)
}

//noinspection GoSnakeCaseUsage
type CorbaDomainManager_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CorbaDomainManagerId_Const = "IDL:omg.org/CORBA/DomainManager:1.0"

func (self CorbaDomainManager_Helper) Id() string {
	return CorbaDomainManagerId_Const
}

func (self CorbaDomainManager_Helper) Read(stream __goidl__.IReadAny) (CorbaDomainManager, error) {
	return nil, nil
}

func (self CorbaDomainManager_Helper) Write(stream __goidl__.IWriteAny, v CorbaDomainManager) error {
	return nil
}

// Constant declaration: "CORBA::SecConstruction", generatedBy by: "WriteConstantValue"
//noinspection GoUnusedConst
const CorbaSecConstruction uint32 = 11

// Interface declaration: "CORBA::ConstructionPolicy", generatedBy by: "WriteInterface"
type CorbaConstructionPolicy interface {
	//No duplicate operations found in the base interfaces.
	CorbaPolicy
	// Interface operations
	// Original name: "make_domain_manager"
	MakeDomainManager(ObjectType CorbaInterfaceDef, ConstrPolicy bool) (error error)
}

//noinspection GoSnakeCaseUsage
type CorbaConstructionPolicy_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CorbaConstructionPolicyId_Const = "IDL:omg.org/CORBA/ConstructionPolicy:1.0"

func (self CorbaConstructionPolicy_Helper) Id() string {
	return CorbaConstructionPolicyId_Const
}

func (self CorbaConstructionPolicy_Helper) Read(stream __goidl__.IReadAny) (CorbaConstructionPolicy, error) {
	return nil, nil
}

func (self CorbaConstructionPolicy_Helper) Write(stream __goidl__.IWriteAny, v CorbaConstructionPolicy) error {
	return nil
}

// TypeDef declaration: "CORBA::DomainManagersList", generatedBy by: "WriteTypeDefOfSequenceDcl"
//Typedef Sequence declaration: CORBA::DomainManagersList
type CorbaDomainManagersList []CorbaDomainManager

//noinspection GoSnakeCaseUsage
type CorbaDomainManagersList_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CorbaDomainManagersListId_Const = "IDL:omg.org/CORBA/DomainManagersList:1.0"

func (self CorbaDomainManagersList_Helper) Id() string {
	return CorbaDomainManagersListId_Const
}

// WriteTypeDefOfSequenceDcl::WriteExtract
func (self CorbaDomainManagersList_Helper) Read(stream __goidl__.IReadAny) (CorbaDomainManagersList, error) {
	n, err := __goidl__.IdlUInt32Helper.Read(stream)
	if err != nil {
		return nil, err
	}
	if n > 0 {
		result := make(CorbaDomainManagersList, n)
		var i uint32
		for i = 0; i < n; i++ {
			result[i], err = CorbaDomainManagerHelper.Read(stream)
			if err != nil {
				return nil, err
			}
		}
		return result, nil
	}
	return nil, nil
}

func (self CorbaDomainManagersList_Helper) Write(stream __goidl__.IWriteAny, v CorbaDomainManagersList) error {
	if v == nil {
		return __goidl__.IdlUInt32Helper.Write(stream, 0)
	}
	err := __goidl__.IdlUInt32Helper.Write(stream, uint32(len(v)))
	if err != nil {
		return nil
	}
	for _, item := range v {
			err = CorbaDomainManagerHelper.Write(stream, item)
		if err != nil {
			return err
		}
	}
	return err
}


//noinspection GoUnusedGlobalVariable
var CorbaDomainManagerHelper = CorbaDomainManager_Helper{}

//noinspection GoUnusedGlobalVariable
var CorbaConstructionPolicyHelper = CorbaConstructionPolicy_Helper{}

//noinspection GoUnusedGlobalVariable
var CorbaDomainManagersListHelper = CorbaDomainManagersList_Helper{}

func init() {
}
