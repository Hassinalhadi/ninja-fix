package M1;

import android.util.Log;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class c {
    public final int alpha;
    public final int bravo;
    public final long charlie;
    public final byte[] delta;

    public c(byte[] bArr, int i4, int i5) {
        this(-1L, bArr, i4, i5);
    }

    public static c alpha(String str) {
        byte[] bytes = str.concat(Json.UNSET_NAME).getBytes(g.gray);
        return new c(bytes, 2, bytes.length);
    }

    public static c bravo(long j5, ByteOrder byteOrder) {
        long[] jArr = {j5};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.black[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j6 : jArr) {
            wrap.putInt((int) j6);
        }
        return new c(wrap.array(), 4, jArr.length);
    }

    public static c charlie(e[] eVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.black[5] * eVarArr.length]);
        wrap.order(byteOrder);
        for (e eVar : eVarArr) {
            wrap.putInt((int) eVar.alpha);
            wrap.putInt((int) eVar.bravo);
        }
        return new c(wrap.array(), 5, eVarArr.length);
    }

    public static c delta(int i4, ByteOrder byteOrder) {
        int[] iArr = {i4};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.black[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i5 : iArr) {
            wrap.putShort((short) i5);
        }
        return new c(wrap.array(), 3, iArr.length);
    }

    public final double echo(ByteOrder byteOrder) {
        Object hotel = hotel(byteOrder);
        if (hotel != null) {
            if (hotel instanceof String) {
                return Double.parseDouble((String) hotel);
            }
            if (hotel instanceof long[]) {
                if (((long[]) hotel).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (hotel instanceof int[]) {
                if (((int[]) hotel).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (hotel instanceof double[]) {
                double[] dArr = (double[]) hotel;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (hotel instanceof e[]) {
                e[] eVarArr = (e[]) hotel;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.alpha / eVar.bravo;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int foxtrot(ByteOrder byteOrder) {
        Object hotel = hotel(byteOrder);
        if (hotel != null) {
            if (hotel instanceof String) {
                return Integer.parseInt((String) hotel);
            }
            if (hotel instanceof long[]) {
                long[] jArr = (long[]) hotel;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (hotel instanceof int[]) {
                int[] iArr = (int[]) hotel;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String golf(ByteOrder byteOrder) {
        Object hotel = hotel(byteOrder);
        if (hotel != null) {
            if (hotel instanceof String) {
                return (String) hotel;
            }
            StringBuilder sb2 = new StringBuilder();
            int i4 = 0;
            if (hotel instanceof long[]) {
                long[] jArr = (long[]) hotel;
                while (i4 < jArr.length) {
                    sb2.append(jArr[i4]);
                    i4++;
                    if (i4 != jArr.length) {
                        sb2.append(Constants.SEPARATOR_COMMA);
                    }
                }
                return sb2.toString();
            }
            if (hotel instanceof int[]) {
                int[] iArr = (int[]) hotel;
                while (i4 < iArr.length) {
                    sb2.append(iArr[i4]);
                    i4++;
                    if (i4 != iArr.length) {
                        sb2.append(Constants.SEPARATOR_COMMA);
                    }
                }
                return sb2.toString();
            }
            if (hotel instanceof double[]) {
                double[] dArr = (double[]) hotel;
                while (i4 < dArr.length) {
                    sb2.append(dArr[i4]);
                    i4++;
                    if (i4 != dArr.length) {
                        sb2.append(Constants.SEPARATOR_COMMA);
                    }
                }
                return sb2.toString();
            }
            if (hotel instanceof e[]) {
                e[] eVarArr = (e[]) hotel;
                while (i4 < eVarArr.length) {
                    sb2.append(eVarArr[i4].alpha);
                    sb2.append('/');
                    sb2.append(eVarArr[i4].bravo);
                    i4++;
                    if (i4 != eVarArr.length) {
                        sb2.append(Constants.SEPARATOR_COMMA);
                    }
                }
                return sb2.toString();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:162:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [M1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [M1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable hotel(ByteOrder byteOrder) {
        b bVar;
        InputStream inputStream;
        byte b2;
        String sb2;
        int i4 = 0;
        byte[] bArr = this.delta;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.red = byteOrder;
                        int i5 = this.alpha;
                        int i10 = this.bravo;
                        switch (i5) {
                            case 1:
                            case 6:
                                if (bArr.length == 1 && (b2 = bArr[0]) >= 0 && b2 <= 1) {
                                    String str = new String(new char[]{(char) (b2 + 48)});
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                        return str;
                                    }
                                }
                                String str2 = new String(bArr, g.gray);
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i10 >= g.blue.length) {
                                    int i11 = 0;
                                    while (true) {
                                        byte[] bArr2 = g.blue;
                                        if (i11 < bArr2.length) {
                                            if (bArr[i11] == bArr2[i11]) {
                                                i11++;
                                            }
                                        } else {
                                            i4 = bArr2.length;
                                        }
                                    }
                                }
                                StringBuilder sb3 = new StringBuilder();
                                try {
                                    while (i4 < i10) {
                                        byte b4 = bArr[i4];
                                        if (b4 != 0) {
                                            if (b4 >= 32) {
                                                sb3.append((char) b4);
                                            } else {
                                                sb3.append('?');
                                            }
                                            i4++;
                                        } else {
                                            sb2 = sb3.toString();
                                            bVar.close();
                                            return sb2;
                                        }
                                    }
                                    bVar.close();
                                    return sb2;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return sb2;
                                }
                                sb2 = sb3.toString();
                            case 3:
                                ?? r15 = new int[i10];
                                while (i4 < i10) {
                                    r15[i4] = bVar.readUnsignedShort();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r15;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return r15;
                                }
                            case 4:
                                ?? r152 = new long[i10];
                                while (i4 < i10) {
                                    r152[i4] = bVar.readInt() & 4294967295L;
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r152;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return r152;
                                }
                            case 5:
                                ?? r153 = new e[i10];
                                while (i4 < i10) {
                                    r153[i4] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r153;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r153;
                                }
                            case 8:
                                ?? r154 = new int[i10];
                                while (i4 < i10) {
                                    r154[i4] = bVar.readShort();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r154;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r154;
                                }
                            case 9:
                                ?? r155 = new int[i10];
                                while (i4 < i10) {
                                    r155[i4] = bVar.readInt();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r155;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return r155;
                                }
                            case 10:
                                ?? r156 = new e[i10];
                                while (i4 < i10) {
                                    r156[i4] = new e(bVar.readInt(), bVar.readInt());
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r156;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return r156;
                                }
                            case 11:
                                ?? r157 = new double[i10];
                                while (i4 < i10) {
                                    r157[i4] = bVar.readFloat();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r157;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return r157;
                                }
                            case 12:
                                ?? r158 = new double[i10];
                                while (i4 < i10) {
                                    r158[i4] = bVar.readDouble();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return r158;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                    return r158;
                                }
                            default:
                                bVar.close();
                                return null;
                        }
                    } catch (IOException e18) {
                        e = e18;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            bVar.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e19) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                        }
                    }
                    throw th;
                }
            } catch (IOException e20) {
                e = e20;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        } catch (IOException e21) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.beige[this.alpha]);
        sb2.append(", data length:");
        return P0.cyan(sb2, this.delta.length, ")");
    }

    public c(long j5, byte[] bArr, int i4, int i5) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = j5;
        this.delta = bArr;
    }
}
