// Code generated by me. DO NOT EDIT.

package IOP

// Exception declaration: "IOP::Codec::InvalidTypeForEncoding", generatedBy by: "WriteStructDcl"
// Exception Decl: true
type IopCodecInvalidTypeForEncoding struct {
	__goidl__.IdlObject
}

//noinspection GoSnakeCaseUsage
const IopCodecInvalidTypeForEncodingId_Const = "IDL:omg.org/IOP/Codec/InvalidTypeForEncoding:1.0"

//noinspection GoUnusedExportedFunction
func NewDefaultIopCodecInvalidTypeForEncoding() *IopCodecInvalidTypeForEncoding {
	//noinspection GoRedundantConversion
	return &IopCodecInvalidTypeForEncoding{
		IdlObject: __goidl__.IdlObject{
			Id: IopCodecInvalidTypeForEncodingId_Const,
		},
	}
}

//noinspection GoUnusedExportedFunction
func NewIopCodecInvalidTypeForEncoding() *IopCodecInvalidTypeForEncoding {
	//noinspection GoRedundantConversion
	return &IopCodecInvalidTypeForEncoding{
		IdlObject: __goidl__.IdlObject{
			Id: IopCodecInvalidTypeForEncodingId_Const,
		},
	}
}

//noinspection GoUnusedExportedFunction
func NewRandomIopCodecInvalidTypeForEncoding() *IopCodecInvalidTypeForEncoding {
	//noinspection GoRedundantConversion
	return &IopCodecInvalidTypeForEncoding{
		IdlObject: __goidl__.IdlObject{
			Id: IopCodecInvalidTypeForEncodingId_Const,
		},
	}
}

func (self *IopCodecInvalidTypeForEncoding) String() string {
	b, err := __json__.Marshal(self)
	if err != nil {
		return ""
	}
	return string(b)
}

func (self *IopCodecInvalidTypeForEncoding) Error() string{
	return 	__fmt__.Sprintf("Error of type IopCodecInvalidTypeForEncoding(%v)", self.String())
}
func (self *IopCodecInvalidTypeForEncoding) GoString() string {
	return self.String()
}

func (self *IopCodecInvalidTypeForEncoding) ReadValue(stream __goidl__.IReadAny) error {
	var err error
	err = self.IdlObject.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IopCodecInvalidTypeForEncoding) Read(stream __goidl__.IReadAny) error {
	err := self.ReadValue(stream)
	if err != nil {
		return err
	}
	return nil
}

func (self *IopCodecInvalidTypeForEncoding) Write(stream __goidl__.IWriteAny) error {
	var err error
	err = self.IdlObject.Write(stream)
	if err != nil {
		return err
	}
	return nil
}

//noinspection GoSnakeCaseUsage
type IopCodecInvalidTypeForEncoding_Helper struct {
}


//noinspection GoUnusedGlobalVariable
var IopCodecInvalidTypeForEncodingHelper = IopCodecInvalidTypeForEncoding_Helper{}

func init() {
	__goidl__.AddRegistration(
		__goidl__.NewRegistrationInformation(
			IopCodecInvalidTypeForEncodingId_Const,
			__yaccidl__.IdlStruct,
			"iop.idl.InvalidTypeForEncoding.go",
			func() __goidl__.IIdlObject {
				return NewDefaultIopCodecInvalidTypeForEncoding()
			},
			func(generator __goidl__.IRandomDataGenerator) __goidl__.IIdlObject {
				return NewDefaultIopCodecInvalidTypeForEncoding()
			},
			__reflect__.TypeOf((*IopCodecInvalidTypeForEncoding)(nil))))
}
