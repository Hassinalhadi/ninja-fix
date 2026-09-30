package com.google.android.gms.common.server.response;

import V5.x;
import Y5.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import e6.AbstractC1630b;
import e6.AbstractC1631c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import t6.AbstractC3038p;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new b(12);
    public final int alpha;
    public final Parcel purple;
    public final int red;
    public final zan silver;
    public final String teal;
    public int white;
    public int yellow;

    public SafeParcelResponse(int i4, Parcel parcel, zan zanVar) {
        String str;
        this.alpha = i4;
        x.hotel(parcel);
        this.purple = parcel;
        this.red = 2;
        this.silver = zanVar;
        if (zanVar == null) {
            str = null;
        } else {
            str = zanVar.red;
        }
        this.teal = str;
        this.white = 2;
    }

    public static void kilo(StringBuilder sb2, Map map, Parcel parcel) {
        BigInteger bigInteger;
        String encodeToString;
        String encodeToString2;
        Parcel obtain;
        BigInteger[] bigIntegerArr;
        long[] createLongArray;
        double[] createDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] createBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).yellow, entry);
        }
        sb2.append('{');
        int amber = AbstractC3038p.amber(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < amber) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z2) {
                    sb2.append(Constants.SEPARATOR_COMMA);
                }
                String str = (String) entry2.getKey();
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f6655d;
                int i4 = fastJsonResponse$Field.silver;
                if (stringToIntConverter != null) {
                    switch (i4) {
                        case 0:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, Integer.valueOf(AbstractC3038p.uniform(parcel, readInt))));
                            break;
                        case 1:
                            int yankee = AbstractC3038p.yankee(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (yankee == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + yankee);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, bigInteger2));
                            break;
                        case 2:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, Long.valueOf(AbstractC3038p.whiskey(parcel, readInt))));
                            break;
                        case 3:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, Float.valueOf(AbstractC3038p.romeo(parcel, readInt))));
                            break;
                        case 4:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, Double.valueOf(AbstractC3038p.quebec(parcel, readInt))));
                            break;
                        case 5:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, AbstractC3038p.bravo(parcel, readInt)));
                            break;
                        case 6:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, Boolean.valueOf(AbstractC3038p.oscar(parcel, readInt))));
                            break;
                        case 7:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, AbstractC3038p.india(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, AbstractC3038p.delta(parcel, readInt)));
                            break;
                        case 10:
                            Bundle charlie = AbstractC3038p.charlie(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : charlie.keySet()) {
                                String string = charlie.getString(str2);
                                x.hotel(string);
                                hashMap.put(str2, string);
                            }
                            mike(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.hotel(fastJsonResponse$Field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(ad.zulu(i4, "Unknown field out type = "));
                    }
                } else {
                    boolean z10 = fastJsonResponse$Field.teal;
                    String str3 = fastJsonResponse$Field.f6653b;
                    if (z10) {
                        sb2.append(Constants.AES_PREFIX);
                        switch (i4) {
                            case 0:
                                int[] foxtrot = AbstractC3038p.foxtrot(parcel, readInt);
                                int length = foxtrot.length;
                                for (int i5 = 0; i5 < length; i5++) {
                                    if (i5 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append(foxtrot[i5]);
                                }
                                break;
                            case 1:
                                int yankee2 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition2 = parcel.dataPosition();
                                if (yankee2 == 0) {
                                    bigIntegerArr = null;
                                } else {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i10 = 0; i10 < readInt2; i10++) {
                                        bigIntegerArr[i10] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + yankee2);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i11 = 0; i11 < length2; i11++) {
                                    if (i11 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append(bigIntegerArr[i11]);
                                }
                                break;
                            case 2:
                                int yankee3 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition3 = parcel.dataPosition();
                                if (yankee3 == 0) {
                                    createLongArray = null;
                                } else {
                                    createLongArray = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + yankee3);
                                }
                                int length3 = createLongArray.length;
                                for (int i12 = 0; i12 < length3; i12++) {
                                    if (i12 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append(createLongArray[i12]);
                                }
                                break;
                            case 3:
                                float[] echo = AbstractC3038p.echo(parcel, readInt);
                                int length4 = echo.length;
                                for (int i13 = 0; i13 < length4; i13++) {
                                    if (i13 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append(echo[i13]);
                                }
                                break;
                            case 4:
                                int yankee4 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition4 = parcel.dataPosition();
                                if (yankee4 == 0) {
                                    createDoubleArray = null;
                                } else {
                                    createDoubleArray = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition4 + yankee4);
                                }
                                int length5 = createDoubleArray.length;
                                for (int i14 = 0; i14 < length5; i14++) {
                                    if (i14 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append(createDoubleArray[i14]);
                                }
                                break;
                            case 5:
                                int yankee5 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition5 = parcel.dataPosition();
                                if (yankee5 == 0) {
                                    bigDecimalArr = null;
                                } else {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i15 = 0; i15 < readInt3; i15++) {
                                        bigDecimalArr[i15] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition5 + yankee5);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i16 = 0; i16 < length6; i16++) {
                                    if (i16 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append(bigDecimalArr[i16]);
                                }
                                break;
                            case 6:
                                int yankee6 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition6 = parcel.dataPosition();
                                if (yankee6 == 0) {
                                    createBooleanArray = null;
                                } else {
                                    createBooleanArray = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition6 + yankee6);
                                }
                                int length7 = createBooleanArray.length;
                                for (int i17 = 0; i17 < length7; i17++) {
                                    if (i17 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append(createBooleanArray[i17]);
                                }
                                break;
                            case 7:
                                String[] juliet = AbstractC3038p.juliet(parcel, readInt);
                                int length8 = juliet.length;
                                for (int i18 = 0; i18 < length8; i18++) {
                                    if (i18 != 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append("\"");
                                    sb2.append(juliet[i18]);
                                    sb2.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int yankee7 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition7 = parcel.dataPosition();
                                if (yankee7 == 0) {
                                    parcelArr = null;
                                } else {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i19 = 0; i19 < readInt4; i19++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition8 = parcel.dataPosition();
                                            Parcel obtain2 = Parcel.obtain();
                                            obtain2.appendFrom(parcel, dataPosition8, readInt5);
                                            parcelArr2[i19] = obtain2;
                                            parcel.setDataPosition(dataPosition8 + readInt5);
                                        } else {
                                            parcelArr2[i19] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition7 + yankee7);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i20 = 0; i20 < length9; i20++) {
                                    if (i20 > 0) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    parcelArr[i20].setDataPosition(0);
                                    x.hotel(str3);
                                    x.hotel(fastJsonResponse$Field.f6654c);
                                    Map map2 = (Map) fastJsonResponse$Field.f6654c.purple.get(str3);
                                    x.hotel(map2);
                                    kilo(sb2, map2, parcelArr[i20]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb2.append(Constants.AES_SUFFIX);
                    } else {
                        switch (i4) {
                            case 0:
                                sb2.append(AbstractC3038p.uniform(parcel, readInt));
                                break;
                            case 1:
                                int yankee8 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition9 = parcel.dataPosition();
                                if (yankee8 == 0) {
                                    bigInteger = null;
                                } else {
                                    byte[] createByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition9 + yankee8);
                                    bigInteger = new BigInteger(createByteArray2);
                                }
                                sb2.append(bigInteger);
                                break;
                            case 2:
                                sb2.append(AbstractC3038p.whiskey(parcel, readInt));
                                break;
                            case 3:
                                sb2.append(AbstractC3038p.romeo(parcel, readInt));
                                break;
                            case 4:
                                sb2.append(AbstractC3038p.quebec(parcel, readInt));
                                break;
                            case 5:
                                sb2.append(AbstractC3038p.bravo(parcel, readInt));
                                break;
                            case 6:
                                sb2.append(AbstractC3038p.oscar(parcel, readInt));
                                break;
                            case 7:
                                String india = AbstractC3038p.india(parcel, readInt);
                                sb2.append("\"");
                                sb2.append(AbstractC1631c.alpha(india));
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] delta = AbstractC3038p.delta(parcel, readInt);
                                sb2.append("\"");
                                if (delta == null) {
                                    encodeToString = null;
                                } else {
                                    encodeToString = Base64.encodeToString(delta, 0);
                                }
                                sb2.append(encodeToString);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] delta2 = AbstractC3038p.delta(parcel, readInt);
                                sb2.append("\"");
                                if (delta2 == null) {
                                    encodeToString2 = null;
                                } else {
                                    encodeToString2 = Base64.encodeToString(delta2, 10);
                                }
                                sb2.append(encodeToString2);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle charlie2 = AbstractC3038p.charlie(parcel, readInt);
                                Set<String> keySet = charlie2.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : keySet) {
                                    if (!z11) {
                                        sb2.append(Constants.SEPARATOR_COMMA);
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(AbstractC1631c.alpha(charlie2.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                sb2.append("}");
                                break;
                            case 11:
                                int yankee9 = AbstractC3038p.yankee(parcel, readInt);
                                int dataPosition10 = parcel.dataPosition();
                                if (yankee9 == 0) {
                                    obtain = null;
                                } else {
                                    obtain = Parcel.obtain();
                                    obtain.appendFrom(parcel, dataPosition10, yankee9);
                                    parcel.setDataPosition(dataPosition10 + yankee9);
                                }
                                obtain.setDataPosition(0);
                                x.hotel(str3);
                                x.hotel(fastJsonResponse$Field.f6654c);
                                Map map3 = (Map) fastJsonResponse$Field.f6654c.purple.get(str3);
                                x.hotel(map3);
                                kilo(sb2, map3, obtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z2 = true;
            }
        }
        if (parcel.dataPosition() == amber) {
            sb2.append('}');
            return;
        }
        throw new SafeParcelReader$ParseException(ad.zulu(amber, "Overread allowed size end="), parcel);
    }

    public static final void lima(StringBuilder sb2, int i4, Object obj) {
        String str = null;
        switch (i4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                x.hotel(obj);
                sb2.append(AbstractC1631c.alpha(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    str = Base64.encodeToString(bArr, 0);
                }
                sb2.append(str);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    str = Base64.encodeToString(bArr2, 10);
                }
                sb2.append(str);
                sb2.append("\"");
                return;
            case 10:
                x.hotel(obj);
                AbstractC1630b.hotel(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(ad.zulu(i4, "Unknown type = "));
        }
    }

    public static final void mike(StringBuilder sb2, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        boolean z2 = fastJsonResponse$Field.red;
        int i4 = fastJsonResponse$Field.purple;
        if (z2) {
            ArrayList arrayList = (ArrayList) obj;
            sb2.append(Constants.AES_PREFIX);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (i5 != 0) {
                    sb2.append(Constants.SEPARATOR_COMMA);
                }
                lima(sb2, i4, arrayList.get(i5));
            }
            sb2.append(Constants.AES_SUFFIX);
            return;
        }
        lima(sb2, i4, obj);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Map charlie() {
        zan zanVar = this.silver;
        if (zanVar == null) {
            return null;
        }
        String str = this.teal;
        x.hotel(str);
        return (Map) zanVar.purple.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object echo() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean golf() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel juliet() {
        int i4 = this.white;
        Parcel parcel = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                return parcel;
            }
            AbstractC3043q.romeo(parcel, this.yellow);
            this.white = 2;
            return parcel;
        }
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        this.yellow = quebec;
        AbstractC3043q.romeo(parcel, quebec);
        this.white = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final String toString() {
        zan zanVar = this.silver;
        x.india(zanVar, "Cannot convert to JSON on client side.");
        Parcel juliet = juliet();
        juliet.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.teal;
        x.hotel(str);
        Map map = (Map) zanVar.purple.get(str);
        x.hotel(map);
        kilo(sb2, map, juliet);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        zan zanVar;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        Parcel juliet = juliet();
        if (juliet != null) {
            int quebec2 = AbstractC3043q.quebec(parcel, 2);
            parcel.appendFrom(juliet, 0, juliet.dataSize());
            AbstractC3043q.romeo(parcel, quebec2);
        }
        if (this.red != 0) {
            zanVar = this.silver;
        } else {
            zanVar = null;
        }
        AbstractC3043q.kilo(parcel, 3, zanVar, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
