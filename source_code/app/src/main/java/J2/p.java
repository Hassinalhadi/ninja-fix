package J2;

import A2.z;
import androidx.appcompat.widget.P0;
import androidx.work.OverwritingInputMerger;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import pe.AbstractC2327c;
import s6.J4;

/* loaded from: classes3.dex */
public final class p {
    public static final String yankee;
    public final String alpha;
    public int bravo;
    public final String charlie;
    public final String delta;
    public final A2.j echo;
    public final A2.j foxtrot;
    public final long golf;
    public long hotel;
    public long india;
    public A2.d juliet;
    public final int kilo;
    public final int lima;
    public final long mike;
    public long november;
    public final long oscar;
    public final long papa;
    public boolean quebec;
    public final int romeo;
    public final int sierra;
    public final int tango;
    public long uniform;
    public int victor;
    public final int whiskey;
    public String xray;

    static {
        String golf = z.golf("WorkSpec");
        Intrinsics.delta(golf, "tagWithPrefix(\"WorkSpec\")");
        yankee = golf;
    }

    public p(String id2, int i4, String workerClassName, String inputMergerClassName, A2.j input, A2.j output, long j5, long j6, long j7, A2.d constraints, int i5, int i10, long j10, long j11, long j12, long j13, boolean z2, int i11, int i12, int i13, long j14, int i14, int i15, String str) {
        Intrinsics.echo(id2, "id");
        com.google.android.material.datepicker.j.papa(i4, "state");
        Intrinsics.echo(workerClassName, "workerClassName");
        Intrinsics.echo(inputMergerClassName, "inputMergerClassName");
        Intrinsics.echo(input, "input");
        Intrinsics.echo(output, "output");
        Intrinsics.echo(constraints, "constraints");
        com.google.android.material.datepicker.j.papa(i10, "backoffPolicy");
        com.google.android.material.datepicker.j.papa(i11, "outOfQuotaPolicy");
        this.alpha = id2;
        this.bravo = i4;
        this.charlie = workerClassName;
        this.delta = inputMergerClassName;
        this.echo = input;
        this.foxtrot = output;
        this.golf = j5;
        this.hotel = j6;
        this.india = j7;
        this.juliet = constraints;
        this.kilo = i5;
        this.lima = i10;
        this.mike = j10;
        this.november = j11;
        this.oscar = j12;
        this.papa = j13;
        this.quebec = z2;
        this.romeo = i11;
        this.sierra = i12;
        this.tango = i13;
        this.uniform = j14;
        this.victor = i14;
        this.whiskey = i15;
        this.xray = str;
    }

    public static p bravo(p pVar, String str, int i4, String str2, A2.j jVar, int i5, long j5, int i10, int i11, long j6, int i12, int i13) {
        String id2;
        int i14;
        String workerClassName;
        A2.j input;
        int i15;
        long j7;
        int i16;
        int i17;
        long j10;
        int i18;
        if ((i13 & 1) != 0) {
            id2 = pVar.alpha;
        } else {
            id2 = str;
        }
        if ((i13 & 2) != 0) {
            i14 = pVar.bravo;
        } else {
            i14 = i4;
        }
        if ((i13 & 4) != 0) {
            workerClassName = pVar.charlie;
        } else {
            workerClassName = str2;
        }
        String inputMergerClassName = pVar.delta;
        if ((i13 & 16) != 0) {
            input = pVar.echo;
        } else {
            input = jVar;
        }
        A2.j output = pVar.foxtrot;
        long j11 = pVar.golf;
        long j12 = pVar.hotel;
        long j13 = pVar.india;
        A2.d constraints = pVar.juliet;
        if ((i13 & Barcode.FORMAT_UPC_E) != 0) {
            i15 = pVar.kilo;
        } else {
            i15 = i5;
        }
        int i19 = pVar.lima;
        long j14 = pVar.mike;
        if ((i13 & 8192) != 0) {
            j7 = pVar.november;
        } else {
            j7 = j5;
        }
        long j15 = pVar.oscar;
        long j16 = pVar.papa;
        boolean z2 = pVar.quebec;
        int i20 = pVar.romeo;
        if ((i13 & 262144) != 0) {
            i16 = pVar.sierra;
        } else {
            i16 = i10;
        }
        if ((i13 & 524288) != 0) {
            i17 = pVar.tango;
        } else {
            i17 = i11;
        }
        if ((i13 & 1048576) != 0) {
            j10 = pVar.uniform;
        } else {
            j10 = j6;
        }
        if ((i13 & 2097152) != 0) {
            i18 = pVar.victor;
        } else {
            i18 = i12;
        }
        int i21 = pVar.whiskey;
        String str3 = pVar.xray;
        pVar.getClass();
        Intrinsics.echo(id2, "id");
        com.google.android.material.datepicker.j.papa(i14, "state");
        Intrinsics.echo(workerClassName, "workerClassName");
        Intrinsics.echo(inputMergerClassName, "inputMergerClassName");
        Intrinsics.echo(input, "input");
        Intrinsics.echo(output, "output");
        Intrinsics.echo(constraints, "constraints");
        com.google.android.material.datepicker.j.papa(i19, "backoffPolicy");
        com.google.android.material.datepicker.j.papa(i20, "outOfQuotaPolicy");
        return new p(id2, i14, workerClassName, inputMergerClassName, input, output, j11, j12, j13, constraints, i15, i19, j14, j7, j15, j16, z2, i20, i16, i17, j10, i18, i21, str3);
    }

    public final long alpha() {
        boolean z2;
        long j5;
        long scalb;
        if (this.bravo == 1 && this.kilo > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j6 = this.november;
        boolean delta = delta();
        long j7 = this.india;
        long j10 = this.hotel;
        long j11 = this.uniform;
        int i4 = this.lima;
        com.google.android.material.datepicker.j.papa(i4, "backoffPolicy");
        int i5 = this.sierra;
        if (j11 != Long.MAX_VALUE && delta) {
            if (i5 != 0) {
                long j12 = j6 + 900000;
                if (j11 < j12) {
                    return j12;
                }
            }
            return j11;
        }
        if (z2) {
            int i10 = this.kilo;
            long j13 = this.mike;
            if (i4 == 2) {
                scalb = j13 * i10;
            } else {
                scalb = Math.scalb((float) j13, i10 - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j6 + scalb;
        }
        long j14 = this.golf;
        if (delta) {
            if (i5 == 0) {
                j5 = j6 + j14;
            } else {
                j5 = j6 + j10;
            }
            if (j7 != j10 && i5 == 0) {
                return (j10 - j7) + j5;
            }
            return j5;
        }
        if (j6 == -1) {
            return Long.MAX_VALUE;
        }
        return j6 + j14;
    }

    public final boolean charlie() {
        return !Intrinsics.areEqual(A2.d.juliet, this.juliet);
    }

    public final boolean delta() {
        if (this.hotel != 0) {
            return true;
        }
        return false;
    }

    public final void echo(long j5, long j6) {
        long j7 = 900000;
        String str = yankee;
        if (j5 < 900000) {
            z.echo().hotel(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        if (j5 >= 900000) {
            j7 = j5;
        }
        this.hotel = j7;
        if (j6 < 300000) {
            z.echo().hotel(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j6 > this.hotel) {
            z.echo().hotel(str, "Flex duration greater than interval duration; Changed to " + j5);
        }
        this.india = J4.echo(j6, 300000L, this.hotel);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (!Intrinsics.areEqual(this.alpha, pVar.alpha) || this.bravo != pVar.bravo || !Intrinsics.areEqual(this.charlie, pVar.charlie) || !Intrinsics.areEqual(this.delta, pVar.delta) || !Intrinsics.areEqual(this.echo, pVar.echo) || !Intrinsics.areEqual(this.foxtrot, pVar.foxtrot) || this.golf != pVar.golf || this.hotel != pVar.hotel || this.india != pVar.india || !Intrinsics.areEqual(this.juliet, pVar.juliet) || this.kilo != pVar.kilo || this.lima != pVar.lima || this.mike != pVar.mike || this.november != pVar.november || this.oscar != pVar.oscar || this.papa != pVar.papa || this.quebec != pVar.quebec || this.romeo != pVar.romeo || this.sierra != pVar.sierra || this.tango != pVar.tango || this.uniform != pVar.uniform || this.victor != pVar.victor || this.whiskey != pVar.whiskey || !Intrinsics.areEqual(this.xray, pVar.xray)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = (this.foxtrot.hashCode() + ((this.echo.hashCode() + AbstractC2327c.sierra(AbstractC2327c.sierra((av.q.mike(this.bravo) + (this.alpha.hashCode() * 31)) * 31, 31, this.charlie), 31, this.delta)) * 31)) * 31;
        long j5 = this.golf;
        int i5 = (hashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.hotel;
        int i10 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.india;
        int mike = (av.q.mike(this.lima) + ((((this.juliet.hashCode() + ((i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31) + this.kilo) * 31)) * 31;
        long j10 = this.mike;
        int i11 = (mike + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.november;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.oscar;
        int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.papa;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        if (this.quebec) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int mike2 = (((((av.q.mike(this.romeo) + ((i14 + i4) * 31)) * 31) + this.sierra) * 31) + this.tango) * 31;
        long j14 = this.uniform;
        int i15 = (((((mike2 + ((int) ((j14 >>> 32) ^ j14))) * 31) + this.victor) * 31) + this.whiskey) * 31;
        String str = this.xray;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i15 + hashCode;
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("{WorkSpec: "), this.alpha, '}');
    }

    public /* synthetic */ p(String str, int i4, String str2, String str3, A2.j jVar, A2.j jVar2, long j5, long j6, long j7, A2.d dVar, int i5, int i10, long j10, long j11, long j12, long j13, boolean z2, int i11, int i12, long j14, int i13, int i14, String str4, int i15) {
        this(str, (i15 & 2) != 0 ? 1 : i4, str2, (i15 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i15 & 16) != 0 ? A2.j.bravo : jVar, (i15 & 32) != 0 ? A2.j.bravo : jVar2, (i15 & 64) != 0 ? 0L : j5, (i15 & 128) != 0 ? 0L : j6, (i15 & Barcode.FORMAT_QR_CODE) != 0 ? 0L : j7, (i15 & 512) != 0 ? A2.d.juliet : dVar, (i15 & Barcode.FORMAT_UPC_E) != 0 ? 0 : i5, (i15 & 2048) != 0 ? 1 : i10, (i15 & 4096) != 0 ? OkHttpConstants.READ_TIMEOUT_MS : j10, (i15 & 8192) != 0 ? -1L : j11, (i15 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? j12 : 0L, (32768 & i15) != 0 ? -1L : j13, (65536 & i15) != 0 ? false : z2, (131072 & i15) != 0 ? 1 : i11, (262144 & i15) != 0 ? 0 : i12, 0, (1048576 & i15) != 0 ? Long.MAX_VALUE : j14, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (i15 & 8388608) != 0 ? null : str4);
    }
}
