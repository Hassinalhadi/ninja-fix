package F;

import a0.C0366t;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public abstract class Q {
    public static final androidx.compose.runtime.E0 alpha = new androidx.compose.runtime.N(P.purple);
    public static final androidx.compose.runtime.E0 bravo = new androidx.compose.runtime.N(P.red);

    public static final long alpha(O o5, long j5) {
        if (C0366t.charlie(j5, o5.alpha)) {
            return o5.bravo;
        }
        if (C0366t.charlie(j5, o5.foxtrot)) {
            return o5.golf;
        }
        if (C0366t.charlie(j5, o5.juliet)) {
            return o5.kilo;
        }
        if (C0366t.charlie(j5, o5.november)) {
            return o5.oscar;
        }
        if (C0366t.charlie(j5, o5.whiskey)) {
            return o5.xray;
        }
        if (C0366t.charlie(j5, o5.charlie)) {
            return o5.delta;
        }
        if (C0366t.charlie(j5, o5.hotel)) {
            return o5.india;
        }
        if (C0366t.charlie(j5, o5.lima)) {
            return o5.mike;
        }
        if (C0366t.charlie(j5, o5.yankee)) {
            return o5.zulu;
        }
        if (C0366t.charlie(j5, o5.uniform)) {
            return o5.victor;
        }
        boolean charlie = C0366t.charlie(j5, o5.papa);
        long j6 = o5.quebec;
        if (charlie) {
            return j6;
        }
        if (C0366t.charlie(j5, o5.romeo)) {
            return o5.sierra;
        }
        if (C0366t.charlie(j5, o5.black)) {
            return j6;
        }
        if (C0366t.charlie(j5, o5.bronze)) {
            return j6;
        }
        if (C0366t.charlie(j5, o5.coral)) {
            return j6;
        }
        if (C0366t.charlie(j5, o5.crimson)) {
            return j6;
        }
        if (C0366t.charlie(j5, o5.cyan)) {
            return j6;
        }
        if (C0366t.charlie(j5, o5.emerald)) {
            return j6;
        }
        int i4 = C0366t.lima;
        return C0366t.kilo;
    }

    public static final long bravo(long j5, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.purple(-1680936624);
        long alpha2 = alpha((O) c0585q.kilo(alpha), j5);
        if (alpha2 == 16) {
            alpha2 = ((C0366t) c0585q.kilo(Y.alpha)).alpha;
        }
        c0585q.quebec(false);
        return alpha2;
    }

    public static final long charlie(O o5, int i4) {
        switch (av.q.mike(i4)) {
            case 0:
                return o5.november;
            case 1:
                return o5.whiskey;
            case 2:
                return o5.yankee;
            case 3:
                return o5.victor;
            case 4:
                return o5.echo;
            case 5:
                return o5.uniform;
            case 6:
                return o5.oscar;
            case 7:
                return o5.xray;
            case 8:
                return o5.zulu;
            case 9:
                return o5.bravo;
            case 10:
                return o5.delta;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return C0366t.kilo;
            case 13:
                return o5.golf;
            case 14:
                return o5.india;
            case 17:
                return o5.quebec;
            case 18:
                return o5.sierra;
            case 19:
                return o5.kilo;
            case 20:
                return o5.mike;
            case 23:
                return o5.amber;
            case 24:
                return o5.azure;
            case 25:
                return o5.alpha;
            case 26:
                return o5.charlie;
            case 29:
                return o5.beige;
            case 30:
                return o5.foxtrot;
            case 31:
                return o5.hotel;
            case 34:
                return o5.papa;
            case 35:
                return o5.black;
            case 36:
                return o5.bronze;
            case 37:
                return o5.coral;
            case 38:
                return o5.crimson;
            case 39:
                return o5.cyan;
            case 40:
                return o5.emerald;
            case 41:
                return o5.blue;
            case 42:
                return o5.tango;
            case 43:
                return o5.romeo;
            case 44:
                return o5.juliet;
            case 45:
                return o5.lima;
        }
    }

    public static final long delta(InterfaceC0581m interfaceC0581m, int i4) {
        return charlie((O) ((C0585q) interfaceC0581m).kilo(alpha), i4);
    }

    public static O echo(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, int i4) {
        long j34 = (i4 & 1) != 0 ? H.c.tango : j5;
        return new O(j34, (i4 & 2) != 0 ? H.c.juliet : j6, (i4 & 4) != 0 ? H.c.uniform : j7, (i4 & 8) != 0 ? H.c.kilo : j10, (i4 & 16) != 0 ? H.c.echo : j11, (i4 & 32) != 0 ? H.c.whiskey : j12, (i4 & 64) != 0 ? H.c.lima : j13, (i4 & 128) != 0 ? H.c.xray : j14, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? H.c.mike : j15, (i4 & 512) != 0 ? H.c.crimson : j16, (i4 & Barcode.FORMAT_UPC_E) != 0 ? H.c.papa : j17, H.c.cyan, H.c.quebec, (i4 & 8192) != 0 ? H.c.alpha : j18, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? H.c.golf : j19, (32768 & i4) != 0 ? H.c.yankee : j20, (65536 & i4) != 0 ? H.c.november : j21, (131072 & i4) != 0 ? H.c.coral : j22, (262144 & i4) != 0 ? H.c.oscar : j23, (524288 & i4) != 0 ? j34 : j24, (1048576 & i4) != 0 ? H.c.foxtrot : j25, (2097152 & i4) != 0 ? H.c.delta : j26, (4194304 & i4) != 0 ? H.c.bravo : j27, (8388608 & i4) != 0 ? H.c.hotel : j28, (16777216 & i4) != 0 ? H.c.charlie : j29, (33554432 & i4) != 0 ? H.c.india : j30, (67108864 & i4) != 0 ? H.c.romeo : j31, (134217728 & i4) != 0 ? H.c.sierra : j32, (i4 & 268435456) != 0 ? H.c.victor : j33, H.c.zulu, H.c.bronze, H.c.amber, H.c.azure, H.c.beige, H.c.black, H.c.blue);
    }
}
