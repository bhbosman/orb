package omg

import (
	"reflect"
	"testing"
)

func TestNewDefaultGiopMessageHeader10(t *testing.T) {
	t.Run("", func(t *testing.T) {

	})
	tests := []struct {
		name string
		want *GiopMessageHeader10
	}{
		{
			name: "",
			want: &GiopMessageHeader10{
				IdlObject: IdlObject{
					Id: GiopMessageHeader10Id_Const,
				},
			},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := NewDefaultGiopMessageHeader10(); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("NewDefaultGiopMessageHeader10() = %v, want %v", got, tt.want)
			}
		})
	}
}
