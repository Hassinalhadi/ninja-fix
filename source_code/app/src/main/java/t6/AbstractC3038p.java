package t6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: t6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3038p {
    public static final void alpha(String str, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        T.p pVar = T.p.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1632885408);
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.d.alpha);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            F.G2.bravo(str, null, Db.c.zulu, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, ((F.S2) c0585q.kilo(F.T2.alpha)).juliet, c0585q, 390, 0, 65018);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.i(str, i4, 15);
        }
    }

    public static int amber(Parcel parcel) {
        int readInt = parcel.readInt();
        int yankee = yankee(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 == 20293) {
            int i4 = yankee + dataPosition;
            if (i4 >= dataPosition && i4 <= parcel.dataSize()) {
                return i4;
            }
            throw new SafeParcelReader$ParseException(A0.z.juliet("Size read is invalid start=", dataPosition, i4, " end="), parcel);
        }
        throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void azure(Parcel parcel, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        throw new SafeParcelReader$ParseException(androidx.appcompat.widget.P0.gold(av.q.hotel(i5, i4, "Expected size ", " got ", " (0x"), Integer.toHexString(i4), ")"), parcel);
    }

    public static void beige(Parcel parcel, int i4, int i5) {
        int yankee = yankee(parcel, i4);
        if (yankee == i5) {
            return;
        }
        throw new SafeParcelReader$ParseException(androidx.appcompat.widget.P0.gold(av.q.hotel(i5, yankee, "Expected size ", " got ", " (0x"), Integer.toHexString(yankee), ")"), parcel);
    }

    public static BigDecimal bravo(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + yankee);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle charlie(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + yankee);
        return readBundle;
    }

    public static byte[] delta(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + yankee);
        return createByteArray;
    }

    public static float[] echo(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + yankee);
        return createFloatArray;
    }

    public static int[] foxtrot(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + yankee);
        return createIntArray;
    }

    public static ArrayList golf(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + yankee);
        return arrayList;
    }

    public static Parcelable hotel(Parcel parcel, int i4, Parcelable.Creator creator) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + yankee);
        return parcelable;
    }

    public static String india(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + yankee);
        return readString;
    }

    public static String[] juliet(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + yankee);
        return createStringArray;
    }

    public static ArrayList kilo(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + yankee);
        return createStringArrayList;
    }

    public static Object[] lima(Parcel parcel, int i4, Parcelable.Creator creator) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + yankee);
        return createTypedArray;
    }

    public static ArrayList mike(Parcel parcel, int i4, Parcelable.Creator creator) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + yankee);
        return createTypedArrayList;
    }

    public static void november(Parcel parcel, int i4) {
        if (parcel.dataPosition() == i4) {
        } else {
            throw new SafeParcelReader$ParseException(ao.ad.zulu(i4, "Overread allowed size end="), parcel);
        }
    }

    public static boolean oscar(Parcel parcel, int i4) {
        beige(parcel, i4, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static byte papa(Parcel parcel, int i4) {
        beige(parcel, i4, 4);
        return (byte) parcel.readInt();
    }

    public static double quebec(Parcel parcel, int i4) {
        beige(parcel, i4, 8);
        return parcel.readDouble();
    }

    public static float romeo(Parcel parcel, int i4) {
        beige(parcel, i4, 4);
        return parcel.readFloat();
    }

    public static Float sierra(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        if (yankee == 0) {
            return null;
        }
        azure(parcel, yankee, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder tango(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (yankee == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + yankee);
        return readStrongBinder;
    }

    public static int uniform(Parcel parcel, int i4) {
        beige(parcel, i4, 4);
        return parcel.readInt();
    }

    public static Integer victor(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        if (yankee == 0) {
            return null;
        }
        azure(parcel, yankee, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long whiskey(Parcel parcel, int i4) {
        beige(parcel, i4, 8);
        return parcel.readLong();
    }

    public static Long xray(Parcel parcel, int i4) {
        int yankee = yankee(parcel, i4);
        if (yankee == 0) {
            return null;
        }
        azure(parcel, yankee, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int yankee(Parcel parcel, int i4) {
        if ((i4 & (-65536)) != -65536) {
            return (char) (i4 >> 16);
        }
        return parcel.readInt();
    }

    public static void zulu(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + yankee(parcel, i4));
    }
}
