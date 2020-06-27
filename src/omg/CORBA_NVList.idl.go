// Code generated by me. DO NOT EDIT.

package omg

import __goidl__ "github.com/bhbosman/goidl"

// Interface declaration: "CORBA::NVList", generatedBy by: "WriteInterface"
type CorbaNVList interface {
	// Interface operations
	// Original name: "add_item"
	AddItem(ItemName string, ItemType CorbaTypeCode, Value CorbaOpaqueValue, ValueLen int32, ItemFlags uint32) (error error)
	// Original name: "free"
	Free() (error error)
	// Original name: "free_memory"
	FreeMemory() (error error)
	// Original name: "get_count"
	GetCount() (Count int32, error error)
}

//noinspection GoSnakeCaseUsage
type CorbaNVList_Helper struct {
}

//noinspection GoSnakeCaseUsage
const CorbaNVListId_Const = "IDL:omg.org/CORBA/NVList:1.0"

func (self CorbaNVList_Helper) Id() string {
	return CorbaNVListId_Const
}

func (self CorbaNVList_Helper) Read(stream __goidl__.IReadAny) (CorbaNVList, error) {
	return nil, nil
}

func (self CorbaNVList_Helper) Write(stream __goidl__.IWriteAny, v CorbaNVList) error {
	return nil
}


//noinspection GoUnusedGlobalVariable
var CorbaNVListHelper = CorbaNVList_Helper{}

func init() {
}