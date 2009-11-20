char *runtimeimport =
	"package runtime\n"
	"func runtime.mal (? int32) (? *any)\n"
	"func runtime.throwindex ()\n"
	"func runtime.throwreturn ()\n"
	"func runtime.throwinit ()\n"
	"func runtime.panicl ()\n"
	"func runtime.printbool (? bool)\n"
	"func runtime.printfloat (? float64)\n"
	"func runtime.printint (? int64)\n"
	"func runtime.printuint (? uint64)\n"
	"func runtime.printstring (? string)\n"
	"func runtime.printpointer (? any)\n"
	"func runtime.printiface (? any)\n"
	"func runtime.printeface (? any)\n"
	"func runtime.printslice (? any)\n"
	"func runtime.printnl ()\n"
	"func runtime.printsp ()\n"
	"func runtime.catstring (? string, ? string) (? string)\n"
	"func runtime.cmpstring (? string, ? string) (? int)\n"
	"func runtime.slicestring (? string, ? int, ? int) (? string)\n"
	"func runtime.indexstring (? string, ? int) (? uint8)\n"
	"func runtime.intstring (? int64) (? string)\n"
	"func runtime.slicebytetostring (? []uint8) (? string)\n"
	"func runtime.sliceinttostring (? []int) (? string)\n"
	"func runtime.stringiter (? string, ? int) (? int)\n"
	"func runtime.stringiter2 (? string, ? int) (retk int, retv int)\n"
	"func runtime.slicecopy (to any, fr any, wid uint32) (? int)\n"
	"func runtime.ifaceI2E (iface any) (ret any)\n"
	"func runtime.ifaceE2I (typ *uint8, iface any) (ret any)\n"
	"func runtime.ifaceT2E (typ *uint8, elem any) (ret any)\n"
	"func runtime.ifaceE2T (typ *uint8, elem any) (ret any)\n"
	"func runtime.ifaceE2I2 (typ *uint8, iface any) (ret any, ok bool)\n"
	"func runtime.ifaceE2T2 (typ *uint8, elem any) (ret any, ok bool)\n"
	"func runtime.ifaceT2I (typ1 *uint8, typ2 *uint8, elem any) (ret any)\n"
	"func runtime.ifaceI2T (typ *uint8, iface any) (ret any)\n"
	"func runtime.ifaceI2T2 (typ *uint8, iface any) (ret any, ok bool)\n"
	"func runtime.ifaceI2I (typ *uint8, iface any) (ret any)\n"
	"func runtime.ifaceI2Ix (typ *uint8, iface any) (ret any)\n"
	"func runtime.ifaceI2I2 (typ *uint8, iface any) (ret any, ok bool)\n"
	"func runtime.ifaceeq (i1 any, i2 any) (ret bool)\n"
	"func runtime.efaceeq (i1 any, i2 any) (ret bool)\n"
	"func runtime.ifacethash (i1 any) (ret uint32)\n"
	"func runtime.efacethash (i1 any) (ret uint32)\n"
	"func runtime.makemap (key *uint8, val *uint8, hint int) (hmap map[any] any)\n"
	"func runtime.mapaccess1 (hmap map[any] any, key any) (val any)\n"
	"func runtime.mapaccess2 (hmap map[any] any, key any) (val any, pres bool)\n"
	"func runtime.mapassign1 (hmap map[any] any, key any, val any)\n"
	"func runtime.mapassign2 (hmap map[any] any, key any, val any, pres bool)\n"
	"func runtime.mapiterinit (hmap map[any] any, hiter *any)\n"
	"func runtime.mapiternext (hiter *any)\n"
	"func runtime.mapiter1 (hiter *any) (key any)\n"
	"func runtime.mapiter2 (hiter *any) (key any, val any)\n"
	"func runtime.makechan (elem *uint8, hint int) (hchan chan any)\n"
	"func runtime.chanrecv1 (hchan <-chan any) (elem any)\n"
	"func runtime.chanrecv2 (hchan <-chan any) (elem any, pres bool)\n"
	"func runtime.chansend1 (hchan chan<- any, elem any)\n"
	"func runtime.chansend2 (hchan chan<- any, elem any) (pres bool)\n"
	"func runtime.closechan (hchan any)\n"
	"func runtime.closedchan (hchan any) (? bool)\n"
	"func runtime.newselect (size int) (sel *uint8)\n"
	"func runtime.selectsend (sel *uint8, hchan chan<- any, elem any) (selected bool)\n"
	"func runtime.selectrecv (sel *uint8, hchan <-chan any, elem *any) (selected bool)\n"
	"func runtime.selectdefault (sel *uint8) (selected bool)\n"
	"func runtime.selectgo (sel *uint8)\n"
	"func runtime.makeslice (nel int, cap int, width int) (ary []any)\n"
	"func runtime.sliceslice1 (old []any, lb int, width int) (ary []any)\n"
	"func runtime.sliceslice (old []any, lb int, hb int, width int) (ary []any)\n"
	"func runtime.slicearray (old *any, nel int, lb int, hb int, width int) (ary []any)\n"
	"func runtime.closure ()\n"
	"func runtime.int64div (? int64, ? int64) (? int64)\n"
	"func runtime.uint64div (? uint64, ? uint64) (? uint64)\n"
	"func runtime.int64mod (? int64, ? int64) (? int64)\n"
	"func runtime.uint64mod (? uint64, ? uint64) (? uint64)\n"
	"func runtime.float64toint64 (? float64) (? int64)\n"
	"func runtime.int64tofloat64 (? int64) (? float64)\n"
	"\n"
	"$$\n";
char *unsafeimport =
	"package unsafe\n"
	"type unsafe.Pointer *any\n"
	"func unsafe.Offsetof (? any) (? int)\n"
	"func unsafe.Sizeof (? any) (? int)\n"
	"func unsafe.Alignof (? any) (? int)\n"
	"func unsafe.Typeof (i interface { }) (typ interface { })\n"
	"func unsafe.Reflect (i interface { }) (typ interface { }, addr unsafe.Pointer)\n"
	"func unsafe.Unreflect (typ interface { }, addr unsafe.Pointer) (ret interface { })\n"
	"\n"
	"$$\n";
