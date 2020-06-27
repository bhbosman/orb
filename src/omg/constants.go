package omg

import "errors"

//var giopVersion10 *GiopVersion = NewGiopVersion(1, 0)
//var giopVersion11 *GiopVersion = NewGiopVersion(1, 1)
//var giopVersion12 *GiopVersion = NewGiopVersion(1, 2)
//
//func GiopVersion10() *GiopVersion {
//	return giopVersion10
//}
//func GiopVersion11() *GiopVersion {
//	return giopVersion11
//}
//func GiopVersion12() *GiopVersion {
//	return giopVersion12
//}

var InvalidSwitch error = errors.New("invalid switch")
