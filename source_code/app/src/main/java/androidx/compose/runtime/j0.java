package androidx.compose.runtime;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0 {
    public final C0575g0 alpha;
    public int[] bravo;
    public Object[] charlie;
    public ArrayList delta;
    public HashMap echo;
    public bv.aa foxtrot;
    public int golf;
    public int hotel;
    public int india;
    public int juliet;
    public int kilo;
    public int lima;
    public int mike;
    public int november;
    public int oscar;
    public final al papa;
    public final al quebec;
    public final al romeo;
    public bv.aa sierra;
    public int tango;
    public int uniform;
    public int victor;
    public boolean whiskey;
    public bv.z xray;

    public j0(C0575g0 c0575g0) {
        this.alpha = c0575g0;
        int[] iArr = c0575g0.alpha;
        this.bravo = iArr;
        Object[] objArr = c0575g0.red;
        this.charlie = objArr;
        this.delta = c0575g0.f3004b;
        this.echo = c0575g0.f3005c;
        this.foxtrot = c0575g0.f3006d;
        int i4 = c0575g0.purple;
        this.golf = i4;
        this.hotel = (iArr.length / 5) - i4;
        int i5 = c0575g0.silver;
        this.kilo = i5;
        this.lima = objArr.length - i5;
        this.mike = i4;
        this.papa = new al();
        this.quebec = new al();
        this.romeo = new al();
        this.uniform = i4;
        this.victor = -1;
    }

    public static int india(int i4, int i5, int i10, int i11) {
        if (i4 > i5) {
            return -(((i11 - i10) - i4) + 1);
        }
        return i4;
    }

    public static void yankee(j0 j0Var) {
        int i4 = j0Var.victor;
        int romeo = j0Var.romeo(i4);
        int[] iArr = j0Var.bravo;
        int i5 = (romeo * 5) + 1;
        int i10 = iArr[i5];
        if ((i10 & 134217728) == 0) {
            int i11 = (i10 & (-134217729)) | 134217728;
            iArr[i5] = i11;
            if ((67108864 & i11) != 0) {
                return;
            }
            j0Var.lime(j0Var.black(i4, iArr));
        }
    }

    public final void alpha(int i4) {
        boolean z2;
        boolean z10;
        boolean z11 = false;
        if (i4 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            r.charlie("Cannot seek backwards");
        }
        if (this.november <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            J.bravo("Cannot call seek() while inserting");
        }
        if (i4 == 0) {
            return;
        }
        int i5 = this.tango + i4;
        if (i5 >= this.victor && i5 <= this.uniform) {
            z11 = true;
        }
        if (!z11) {
            r.charlie("Cannot seek outside the current group (" + this.victor + NumberOnlyZipVisualTransformation.HYPHEN + this.uniform + ')');
        }
        this.tango = i5;
        int golf = golf(romeo(i5), this.bravo);
        this.india = golf;
        this.juliet = golf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.bravo;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        kotlin.collections.ArraysKt.zulu(r4 + r3, r3, r2, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        kotlin.collections.ArraysKt.zulu(r5, r5 + r4, r2, r2, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void amber(int i4) {
        int papa;
        C0562a c0562a;
        int i5;
        C0562a c0562a2;
        int i10;
        int i11;
        int i12 = this.hotel;
        int i13 = this.golf;
        if (i13 != i4) {
            if (!this.delta.isEmpty()) {
                int oscar = oscar() - this.hotel;
                if (i13 < i4) {
                    for (int bravo = i0.bravo(this.delta, i13, oscar); bravo < this.delta.size() && (i10 = (c0562a2 = (C0562a) this.delta.get(bravo)).alpha) < 0 && (i11 = i10 + oscar) < i4; bravo++) {
                        c0562a2.alpha = i11;
                    }
                } else {
                    for (int bravo2 = i0.bravo(this.delta, i4, oscar); bravo2 < this.delta.size() && (i5 = (c0562a = (C0562a) this.delta.get(bravo2)).alpha) >= 0; bravo2++) {
                        c0562a.alpha = -(oscar - i5);
                    }
                }
            }
            if (i4 < i13) {
                i13 = i4 + i12;
            }
            int oscar2 = oscar();
            if (i13 >= oscar2) {
                r.charlie("Check failed");
            }
            while (i13 < oscar2) {
                int i14 = (i13 * 5) + 2;
                int i15 = this.bravo[i14];
                if (i15 > -2) {
                    papa = i15;
                } else {
                    papa = (papa() + i15) - (-2);
                }
                if (papa >= i4) {
                    papa = -((papa() - papa) - (-2));
                }
                if (papa != i15) {
                    this.bravo[i14] = papa;
                }
                i13++;
                if (i13 == i4) {
                    i13 += i12;
                }
            }
        }
        this.golf = i4;
    }

    public final void azure(int i4, int i5) {
        boolean z2;
        boolean z10;
        int i10 = this.lima;
        int i11 = this.kilo;
        int i12 = this.mike;
        if (i11 != i4) {
            Object[] objArr = this.charlie;
            if (i4 < i11) {
                System.arraycopy(objArr, i4, objArr, i4 + i10, i11 - i4);
            } else {
                int i13 = i11 + i10;
                System.arraycopy(objArr, i13, objArr, i11, (i4 + i10) - i13);
            }
        }
        int min = Math.min(i5 + 1, papa());
        if (i12 != min) {
            int length = this.charlie.length - i10;
            if (min < i12) {
                int romeo = romeo(min);
                int romeo2 = romeo(i12);
                int i14 = this.golf;
                while (romeo < romeo2) {
                    int i15 = (romeo * 5) + 4;
                    int i16 = this.bravo[i15];
                    if (i16 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        r.charlie("Unexpected anchor value, expected a positive anchor");
                    }
                    this.bravo[i15] = -((length - i16) + 1);
                    romeo++;
                    if (romeo == i14) {
                        romeo += this.hotel;
                    }
                }
            } else {
                int romeo3 = romeo(i12);
                int romeo4 = romeo(min);
                while (romeo3 < romeo4) {
                    int i17 = (romeo3 * 5) + 4;
                    int i18 = this.bravo[i17];
                    if (i18 < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        r.charlie("Unexpected anchor value, expected a negative anchor");
                    }
                    this.bravo[i17] = i18 + length + 1;
                    romeo3++;
                    if (romeo3 == this.golf) {
                        romeo3 += this.hotel;
                    }
                }
            }
            this.mike = min;
        }
        this.kilo = i4;
    }

    public final Object beige(int i4) {
        int romeo = romeo(i4);
        int[] iArr = this.bravo;
        if ((iArr[(romeo * 5) + 1] & 1073741824) != 0) {
            return this.charlie[hotel(golf(romeo, iArr))];
        }
        return null;
    }

    public final int black(int i4, int[] iArr) {
        int i5 = iArr[(romeo(i4) * 5) + 2];
        if (i5 > -2) {
            return i5;
        }
        return (papa() + i5) - (-2);
    }

    public final Object blue(Object obj) {
        if (this.november > 0) {
            whiskey(1, this.victor);
        }
        Object[] objArr = this.charlie;
        int i4 = this.india;
        this.india = i4 + 1;
        Object obj2 = objArr[hotel(i4)];
        if (this.india > this.juliet) {
            r.charlie("Writing to an invalid slot");
        }
        this.charlie[hotel(this.india - 1)] = obj;
        return obj2;
    }

    public final C0562a bravo(int i4) {
        ArrayList arrayList = this.delta;
        int echo = i0.echo(arrayList, i4, papa());
        if (echo < 0) {
            if (i4 > this.golf) {
                i4 = -(papa() - i4);
            }
            C0562a c0562a = new C0562a(i4);
            arrayList.add(-(echo + 1), c0562a);
            return c0562a;
        }
        return (C0562a) arrayList.get(echo);
    }

    public final void bronze() {
        int i4;
        int i5;
        bv.z zVar = this.xray;
        if (zVar != null) {
            while (zVar.bravo != 0) {
                int crimson = C0564b.crimson(zVar);
                int romeo = romeo(crimson);
                int i10 = crimson + 1;
                int tango = tango(crimson) + crimson;
                while (true) {
                    i4 = 1;
                    if (i10 < tango) {
                        if ((this.bravo[(romeo(i10) * 5) + 1] & 201326592) != 0) {
                            i5 = 1;
                            break;
                        }
                        i10 += tango(i10);
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                int[] iArr = this.bravo;
                int i11 = (romeo * 5) + 1;
                int i12 = iArr[i11];
                if ((67108864 & i12) == 0) {
                    i4 = 0;
                }
                if (i4 != i5) {
                    iArr[i11] = (i5 << 26) | ((-67108865) & i12);
                    int black = black(crimson, iArr);
                    if (black >= 0) {
                        C0564b.kilo(zVar, black);
                    }
                }
            }
        }
    }

    public final int charlie(C0562a c0562a) {
        int i4 = c0562a.alpha;
        if (i4 < 0) {
            return papa() + i4;
        }
        return i4;
    }

    public final boolean coral() {
        boolean z2;
        if (this.november == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            r.charlie("Cannot remove group while inserting");
        }
        int i4 = this.tango;
        int i5 = this.india;
        int golf = golf(romeo(i4), this.bravo);
        int fuchsia = fuchsia();
        green(this.victor);
        bv.z zVar = this.xray;
        if (zVar != null) {
            while (true) {
                int i10 = zVar.bravo;
                if (i10 == 0) {
                    break;
                }
                if (i10 != 0) {
                    if (zVar.alpha[0] < i4) {
                        break;
                    }
                    C0564b.crimson(zVar);
                } else {
                    bw.a.echo("IntList is empty.");
                    throw null;
                }
            }
        }
        boolean crimson = crimson(i4, this.tango - i4);
        cyan(golf, this.india - golf, i4 - 1);
        this.tango = i4;
        this.india = i5;
        this.oscar -= fuchsia;
        return crimson;
    }

    public final boolean crimson(int i4, int i5) {
        boolean z2 = false;
        if (i5 > 0) {
            ArrayList arrayList = this.delta;
            amber(i4);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.echo;
                int i10 = i4 + i5;
                int bravo = i0.bravo(this.delta, i10, oscar() - this.hotel);
                if (bravo >= this.delta.size()) {
                    bravo--;
                }
                int i11 = bravo + 1;
                int i12 = 0;
                while (bravo >= 0) {
                    C0562a c0562a = (C0562a) this.delta.get(bravo);
                    int charlie = charlie(c0562a);
                    if (charlie < i4) {
                        break;
                    }
                    if (charlie < i10) {
                        c0562a.alpha = RecyclerView.UNDEFINED_DURATION;
                        if (hashMap != null) {
                        }
                        if (i12 == 0) {
                            i12 = bravo + 1;
                        }
                        i11 = bravo;
                    }
                    bravo--;
                }
                if (i11 < i12) {
                    z2 = true;
                }
                if (z2) {
                    this.delta.subList(i11, i12).clear();
                }
            }
            this.golf = i4;
            this.hotel += i5;
            int i13 = this.mike;
            if (i13 > i4) {
                this.mike = Math.max(i4, i13 - i5);
            }
            int i14 = this.uniform;
            if (i14 >= this.golf) {
                this.uniform = i14 - i5;
            }
            int i15 = this.victor;
            if (i15 >= 0 && (this.bravo[(romeo(i15) * 5) + 1] & 67108864) != 0) {
                lime(i15);
            }
        }
        return z2;
    }

    public final void cyan(int i4, int i5, int i10) {
        if (i5 > 0) {
            int i11 = this.lima;
            int i12 = i4 + i5;
            azure(i12, i10);
            this.kilo = i4;
            this.lima = i11 + i5;
            ArraysKt.coral(i4, i12, null, this.charlie);
            int i13 = this.juliet;
            if (i13 >= i4) {
                this.juliet = i13 - i5;
            }
        }
    }

    public final void delta() {
        int i4 = this.november;
        this.november = i4 + 1;
        if (i4 == 0) {
            this.quebec.charlie((oscar() - this.hotel) - this.uniform);
        }
    }

    public final void echo(boolean z2) {
        this.whiskey = true;
        if (z2 && this.papa.bravo == 0) {
            amber(papa());
            azure(this.charlie.length - this.lima, this.golf);
            int i4 = this.kilo;
            Arrays.fill(this.charlie, i4, this.lima + i4, (Object) null);
            bronze();
        }
        int[] iArr = this.bravo;
        int i5 = this.golf;
        Object[] objArr = this.charlie;
        int i10 = this.kilo;
        ArrayList arrayList = this.delta;
        HashMap hashMap = this.echo;
        bv.aa aaVar = this.foxtrot;
        C0575g0 c0575g0 = this.alpha;
        c0575g0.getClass();
        if (!c0575g0.yellow) {
            J.alpha("Unexpected writer close()");
        }
        c0575g0.yellow = false;
        c0575g0.alpha = iArr;
        c0575g0.purple = i5;
        c0575g0.red = objArr;
        c0575g0.silver = i10;
        c0575g0.f3004b = arrayList;
        c0575g0.f3005c = hashMap;
        c0575g0.f3006d = aaVar;
    }

    public final Object emerald(int i4, int i5, Object obj) {
        int gray = gray(romeo(i4), this.bravo);
        int golf = golf(romeo(i4 + 1), this.bravo);
        int i10 = gray + i5;
        if (i10 < gray || i10 >= golf) {
            r.charlie("Write to an invalid slot index " + i5 + " for group " + i4);
        }
        int hotel = hotel(i10);
        Object[] objArr = this.charlie;
        Object obj2 = objArr[hotel];
        objArr[hotel] = obj;
        return obj2;
    }

    public final int foxtrot(int i4) {
        return golf(romeo(i4), this.bravo);
    }

    public final int fuchsia() {
        int romeo = romeo(this.tango);
        int alpha = i0.alpha(romeo, this.bravo) + this.tango;
        this.tango = alpha;
        this.india = golf(romeo(alpha), this.bravo);
        int i4 = this.bravo[(romeo * 5) + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void gold() {
        int i4 = this.uniform;
        this.tango = i4;
        this.india = golf(romeo(i4), this.bravo);
    }

    public final int golf(int i4, int[] iArr) {
        if (i4 >= oscar()) {
            return this.charlie.length - this.lima;
        }
        int i5 = iArr[(i4 * 5) + 4];
        int i10 = this.lima;
        int length = this.charlie.length;
        if (i5 < 0) {
            return (length - i10) + i5 + 1;
        }
        return i5;
    }

    public final int gray(int i4, int[] iArr) {
        if (i4 >= oscar()) {
            return this.charlie.length - this.lima;
        }
        int charlie = i0.charlie(i4, iArr);
        int i5 = this.lima;
        int length = this.charlie.length;
        if (charlie < 0) {
            return (length - i5) + charlie + 1;
        }
        return charlie;
    }

    public final ak green(int i4) {
        C0562a jade;
        HashMap hashMap = this.echo;
        if (hashMap == null || (jade = jade(i4)) == null) {
            return null;
        }
        return (ak) hashMap.get(jade);
    }

    public final int hotel(int i4) {
        int i5;
        int i10 = this.lima;
        if (i4 < this.kilo) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        return (i10 * i5) + i4;
    }

    public final void indigo() {
        if (this.november != 0) {
            r.charlie("Key must be supplied when inserting");
        }
        as asVar = C0580l.alpha;
        ivory(0, asVar, asVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ivory(int i4, Object obj, Object obj2, boolean z2) {
        Object[] objArr;
        int i5;
        int i10;
        int i11;
        int i12 = this.victor;
        if (this.november > 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        this.romeo.charlie(this.oscar);
        as asVar = C0580l.alpha;
        if (objArr != false) {
            int i13 = this.tango;
            int golf = golf(romeo(i13), this.bravo);
            victor(1);
            this.india = golf;
            this.juliet = golf;
            int romeo = romeo(i13);
            if (obj != asVar) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!z2 && obj2 != asVar) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            int india = india(golf, this.kilo, this.lima, this.charlie.length);
            if (india >= 0 && this.mike < i13) {
                india = -(((this.charlie.length - this.lima) - india) + 1);
            }
            int[] iArr = this.bravo;
            int i14 = this.victor;
            int i15 = romeo * 5;
            iArr[i15] = i4;
            iArr[i15 + 1] = ((z2 ? 1 : 0) << 30) | (i10 << 29) | (i11 << 28);
            iArr[i15 + 2] = i14;
            iArr[i15 + 3] = 0;
            iArr[i15 + 4] = india;
            int i16 = (z2 ? 1 : 0) + i10 + i11;
            if (i16 > 0) {
                whiskey(i16, i13);
                Object[] objArr2 = this.charlie;
                int i17 = this.india;
                if (z2) {
                    objArr2[i17] = obj2;
                    i17++;
                }
                if (i10 != 0) {
                    objArr2[i17] = obj;
                    i17++;
                }
                if (i11 != 0) {
                    objArr2[i17] = obj2;
                    i17++;
                }
                this.india = i17;
            }
            this.oscar = 0;
            i5 = i13 + 1;
            this.victor = i13;
            this.tango = i5;
            if (i12 >= 0) {
                green(i12);
            }
        } else {
            this.papa.charlie(i12);
            this.quebec.charlie((oscar() - this.hotel) - this.uniform);
            int i18 = this.tango;
            int romeo2 = romeo(i18);
            if (!Intrinsics.areEqual(obj2, asVar)) {
                if (z2) {
                    magenta(this.tango, obj2);
                } else {
                    lavender(obj2);
                }
            }
            this.india = gray(romeo2, this.bravo);
            this.juliet = golf(romeo(this.tango + 1), this.bravo);
            int[] iArr2 = this.bravo;
            int i19 = romeo2 * 5;
            this.oscar = iArr2[i19 + 1] & 67108863;
            this.victor = i18;
            this.tango = i18 + 1;
            i5 = i18 + iArr2[i19 + 3];
        }
        this.uniform = i5;
    }

    public final C0562a jade(int i4) {
        ArrayList arrayList;
        int echo;
        if (i4 < 0 || i4 >= papa() || (echo = i0.echo((arrayList = this.delta), i4, papa())) < 0) {
            return null;
        }
        return (C0562a) arrayList.get(echo);
    }

    public final void juliet() {
        boolean z2;
        boolean z10;
        int i4;
        int romeo;
        bv.ah ahVar;
        int i5 = 0;
        if (this.november > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i10 = this.tango;
        int i11 = this.uniform;
        int i12 = this.victor;
        int romeo2 = romeo(i12);
        int i13 = this.oscar;
        int i14 = i10 - i12;
        int i15 = romeo2 * 5;
        int i16 = i15 + 1;
        if ((this.bravo[i16] & 1073741824) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        al alVar = this.romeo;
        if (z2) {
            bv.aa aaVar = this.sierra;
            if (aaVar != null && (ahVar = (bv.ah) aaVar.bravo(i12)) != null) {
                Object[] objArr = ahVar.alpha;
                int i17 = ahVar.bravo;
                for (int i18 = 0; i18 < i17; i18++) {
                    blue(objArr[i18]);
                }
            }
            int[] iArr = this.bravo;
            iArr[i15 + 3] = i14;
            i0.delta(romeo2, i13, iArr);
            int bravo = alVar.bravo();
            if (z10) {
                i13 = 1;
            }
            this.oscar = bravo + i13;
            int black = black(i12, this.bravo);
            this.victor = black;
            if (black < 0) {
                romeo = papa();
            } else {
                romeo = romeo(black + 1);
            }
            if (romeo >= 0) {
                i5 = golf(romeo, this.bravo);
            }
            this.india = i5;
            this.juliet = i5;
            return;
        }
        if (i10 != i11) {
            r.charlie("Expected to be at the end of a group");
        }
        int[] iArr2 = this.bravo;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        i0.delta(romeo2, i13, iArr2);
        int bravo2 = this.papa.bravo();
        this.uniform = (oscar() - this.hotel) - this.quebec.bravo();
        this.victor = bravo2;
        int black2 = black(i12, this.bravo);
        int bravo3 = alVar.bravo();
        this.oscar = bravo3;
        if (black2 == bravo2) {
            if (!z10) {
                i5 = i13 - i21;
            }
            this.oscar = bravo3 + i5;
            return;
        }
        int i22 = i14 - i20;
        if (z10) {
            i4 = 0;
        } else {
            i4 = i13 - i21;
        }
        if (i22 != 0 || i4 != 0) {
            while (black2 != 0 && black2 != bravo2 && (i4 != 0 || i22 != 0)) {
                int romeo3 = romeo(black2);
                if (i22 != 0) {
                    int[] iArr3 = this.bravo;
                    int i23 = (romeo3 * 5) + 3;
                    iArr3[i23] = iArr3[i23] + i22;
                }
                if (i4 != 0) {
                    int[] iArr4 = this.bravo;
                    i0.delta(romeo3, (iArr4[(romeo3 * 5) + 1] & 67108863) + i4, iArr4);
                }
                int[] iArr5 = this.bravo;
                if ((iArr5[(romeo3 * 5) + 1] & 1073741824) != 0) {
                    i4 = 0;
                }
                black2 = black(black2, iArr5);
            }
        }
        this.oscar += i4;
    }

    public final void kilo() {
        if (this.november <= 0) {
            J.bravo("Unbalanced begin/end insert");
        }
        int i4 = this.november - 1;
        this.november = i4;
        if (i4 == 0) {
            if (this.romeo.bravo != this.papa.bravo) {
                r.charlie("startGroup/endGroup mismatch while inserting");
            }
            this.uniform = (oscar() - this.hotel) - this.quebec.bravo();
        }
    }

    public final void lavender(Object obj) {
        int romeo = romeo(this.tango);
        int i4 = (romeo * 5) + 1;
        if ((this.bravo[i4] & 268435456) == 0) {
            r.charlie("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.charlie;
        int[] iArr = this.bravo;
        objArr[hotel(Integer.bitCount(iArr[i4] >> 29) + golf(romeo, iArr))] = obj;
    }

    public final void lima(int i4) {
        boolean z2;
        boolean z10 = false;
        if (this.november <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            r.charlie("Cannot call ensureStarted() while inserting");
        }
        int i5 = this.victor;
        if (i5 != i4) {
            if (i4 >= i5 && i4 < this.uniform) {
                z10 = true;
            }
            if (!z10) {
                r.charlie("Started group at " + i4 + " must be a subgroup of the group at " + i5);
            }
            int i10 = this.tango;
            int i11 = this.india;
            int i12 = this.juliet;
            this.tango = i4;
            indigo();
            this.tango = i10;
            this.india = i11;
            this.juliet = i12;
        }
    }

    public final void lime(int i4) {
        if (i4 >= 0) {
            bv.z zVar = this.xray;
            if (zVar == null) {
                zVar = new bv.z();
                this.xray = zVar;
            }
            C0564b.kilo(zVar, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void magenta(int i4, Object obj) {
        boolean z2;
        int romeo = romeo(i4);
        int[] iArr = this.bravo;
        if (romeo < iArr.length) {
            z2 = true;
        }
        z2 = false;
        if (!z2) {
            r.charlie("Updating the node of a group at " + i4 + " that was not created with as a node group");
        }
        this.charlie[hotel(golf(romeo, this.bravo))] = obj;
    }

    public final void mike(int i4, int i5, int i10) {
        if (i4 >= this.golf) {
            i4 = -((papa() - i4) + 2);
        }
        while (i10 < i5) {
            this.bravo[(romeo(i10) * 5) + 2] = i4;
            int i11 = this.bravo[(romeo(i10) * 5) + 3] + i10;
            mike(i10, i11, i10 + 1);
            i10 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void november(int i4, Xd.l lVar) {
        int i5;
        int i10;
        int i11;
        C0562a c0562a;
        Xd.l lVar2 = lVar;
        int black = black(i4, this.bravo);
        int papa = papa();
        int tango = tango(i4) + i4;
        int i12 = i4;
        bv.ab abVar = null;
        bv.z zVar = null;
        loop0: while (i12 < tango) {
            int i13 = i12 + 1;
            int foxtrot = foxtrot(i13);
            for (int foxtrot2 = foxtrot(i12); foxtrot2 < foxtrot; foxtrot2++) {
                Object obj = this.charlie[hotel(foxtrot2)];
                if ((obj instanceof C0565b0) && (c0562a = ((C0565b0) obj).bravo) != null && c0562a.alpha()) {
                    int charlie = charlie(c0562a);
                    if (abVar == null) {
                        int[] iArr = bv.p.alpha;
                        abVar = new bv.ab();
                    }
                    if (zVar == null) {
                        zVar = new bv.z();
                    }
                    abVar.alpha(charlie);
                    zVar.charlie(charlie);
                    zVar.charlie(foxtrot2);
                } else {
                    lVar2.invoke(Integer.valueOf(foxtrot2), obj);
                }
            }
            if (i13 < papa) {
                i5 = black(i13, this.bravo);
            } else {
                i5 = -1;
            }
            if (i5 != i12) {
                while (true) {
                    if (zVar != null && abVar != null && abVar.echo(i12)) {
                        int i14 = zVar.bravo;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = papa;
                            int alpha = zVar.alpha(i18);
                            if (alpha == i12) {
                                int alpha2 = zVar.alpha(i18 + 1);
                                lVar2.invoke(Integer.valueOf(alpha2), this.charlie[hotel(alpha2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                zVar.foxtrot(i17, alpha);
                                i17 += 2;
                                zVar.foxtrot(i20, zVar.alpha(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            lVar2 = lVar;
                            papa = i19;
                        }
                        i10 = papa;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i11 = zVar.bravo) || i14 < 0 || i14 > i11) {
                                break loop0;
                            }
                            if (i14 >= i17) {
                                if (i14 != i17) {
                                    if (i14 < i11) {
                                        int[] iArr2 = zVar.alpha;
                                        ArraysKt.zulu(i17, i14, iArr2, iArr2, i11);
                                    }
                                    zVar.bravo -= i14 - i17;
                                }
                            } else {
                                bw.a.charlie("The end index must be < start index");
                                throw null;
                            }
                        }
                    } else {
                        i10 = papa;
                    }
                    if (i12 != i4 && black != i5) {
                        i12 = black;
                        papa = i10;
                        black = black(black, this.bravo);
                        lVar2 = lVar;
                    }
                }
            } else {
                i10 = papa;
            }
            lVar2 = lVar;
            black = i5;
            i12 = i13;
            papa = i10;
        }
    }

    public final int oscar() {
        return this.bravo.length / 5;
    }

    public final int papa() {
        return oscar() - this.hotel;
    }

    public final Object quebec(int i4) {
        int romeo = romeo(i4);
        int[] iArr = this.bravo;
        int i5 = (romeo * 5) + 1;
        if ((iArr[i5] & 268435456) != 0) {
            return this.charlie[Integer.bitCount(iArr[i5] >> 29) + golf(romeo, iArr)];
        }
        return C0580l.alpha;
    }

    public final int romeo(int i4) {
        int i5;
        int i10 = this.hotel;
        if (i4 < this.golf) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        return (i10 * i5) + i4;
    }

    public final Object sierra(int i4) {
        int romeo = romeo(i4);
        int[] iArr = this.bravo;
        int i5 = romeo * 5;
        int i10 = iArr[i5 + 1];
        if ((536870912 & i10) != 0) {
            return this.charlie[Integer.bitCount(i10 >> 30) + iArr[i5 + 4]];
        }
        return null;
    }

    public final int tango(int i4) {
        return i0.alpha(romeo(i4), this.bravo);
    }

    public final String toString() {
        return "SlotWriter(current = " + this.tango + " end=" + this.uniform + " size = " + papa() + " gap=" + this.golf + NumberOnlyZipVisualTransformation.HYPHEN + (this.golf + this.hotel) + ')';
    }

    public final boolean uniform(int i4, int i5) {
        int oscar;
        int tango;
        if (i5 == this.victor) {
            oscar = this.uniform;
        } else {
            al alVar = this.papa;
            if (i5 > alVar.alpha(0)) {
                tango = tango(i5);
            } else {
                int[] iArr = alVar.alpha;
                int min = Math.min(iArr.length, alVar.bravo);
                int i10 = 0;
                while (true) {
                    if (i10 < min) {
                        if (iArr[i10] == i5) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 < 0) {
                    tango = tango(i5);
                } else {
                    oscar = (oscar() - this.hotel) - this.quebec.alpha[i10];
                }
            }
            oscar = tango + i5;
        }
        if (i4 <= i5 || i4 >= oscar) {
            return false;
        }
        return true;
    }

    public final void victor(int i4) {
        int i5;
        if (i4 > 0) {
            int i10 = this.tango;
            amber(i10);
            int i11 = this.golf;
            int i12 = this.hotel;
            int[] iArr = this.bravo;
            int length = iArr.length / 5;
            int i13 = length - i12;
            int i14 = 0;
            if (i12 < i4) {
                int max = Math.max(Math.max(length * 2, i13 + i4), 32);
                int[] iArr2 = new int[max * 5];
                int i15 = max - i13;
                ArraysKt.zulu(0, 0, iArr, iArr2, i11 * 5);
                ArraysKt.zulu((i11 + i15) * 5, (i12 + i11) * 5, iArr, iArr2, length * 5);
                this.bravo = iArr2;
                i12 = i15;
            }
            int i16 = this.uniform;
            if (i16 >= i11) {
                this.uniform = i16 + i4;
            }
            int i17 = i11 + i4;
            this.golf = i17;
            this.hotel = i12 - i4;
            if (i13 > 0) {
                i5 = foxtrot(i10 + i4);
            } else {
                i5 = 0;
            }
            if (this.mike >= i11) {
                i14 = this.kilo;
            }
            int india = india(i5, i14, this.lima, this.charlie.length);
            for (int i18 = i11; i18 < i17; i18++) {
                this.bravo[(i18 * 5) + 4] = india;
            }
            int i19 = this.mike;
            if (i19 >= i11) {
                this.mike = i19 + i4;
            }
        }
    }

    public final void whiskey(int i4, int i5) {
        if (i4 > 0) {
            azure(this.india, i5);
            int i10 = this.kilo;
            int i11 = this.lima;
            if (i11 < i4) {
                Object[] objArr = this.charlie;
                int length = objArr.length;
                int i12 = length - i11;
                int max = Math.max(Math.max(length * 2, i12 + i4), 32);
                Object[] objArr2 = new Object[max];
                for (int i13 = 0; i13 < max; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = max - i12;
                int i15 = i11 + i10;
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(objArr, i15, objArr2, i10 + i14, length - i15);
                this.charlie = objArr2;
                i11 = i14;
            }
            int i16 = this.juliet;
            if (i16 >= i10) {
                this.juliet = i16 + i4;
            }
            this.kilo = i10 + i4;
            this.lima = i11 - i4;
        }
    }

    public final boolean xray(int i4) {
        if ((this.bravo[(romeo(i4) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final void zulu(C0575g0 c0575g0, int i4) {
        if (this.november <= 0) {
            r.charlie("Check failed");
        }
        if (i4 == 0 && this.tango == 0 && this.alpha.purple == 0) {
            int[] iArr = c0575g0.alpha;
            int i5 = iArr[(i4 * 5) + 3];
            int i10 = c0575g0.purple;
            if (i5 == i10) {
                int[] iArr2 = this.bravo;
                Object[] objArr = this.charlie;
                ArrayList arrayList = this.delta;
                HashMap hashMap = this.echo;
                bv.aa aaVar = this.foxtrot;
                Object[] objArr2 = c0575g0.red;
                int i11 = c0575g0.silver;
                HashMap hashMap2 = c0575g0.f3005c;
                bv.aa aaVar2 = c0575g0.f3006d;
                this.bravo = iArr;
                this.charlie = objArr2;
                this.delta = c0575g0.f3004b;
                this.golf = i10;
                this.hotel = (iArr.length / 5) - i10;
                this.kilo = i11;
                this.lima = objArr2.length - i11;
                this.mike = i10;
                this.echo = hashMap2;
                this.foxtrot = aaVar2;
                c0575g0.alpha = iArr2;
                c0575g0.purple = 0;
                c0575g0.red = objArr;
                c0575g0.silver = 0;
                c0575g0.f3004b = arrayList;
                c0575g0.f3005c = hashMap;
                c0575g0.f3006d = aaVar;
                return;
            }
        }
        j0 hotel = c0575g0.hotel();
        try {
            C0564b.uniform(hotel, i4, this, true, true, false);
            hotel.echo(true);
        } catch (Throwable th) {
            hotel.echo(false);
            throw th;
        }
    }
}
