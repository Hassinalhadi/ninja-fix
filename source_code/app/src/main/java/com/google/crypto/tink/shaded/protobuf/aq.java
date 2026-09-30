package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.P0;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class aq implements A {
    public static final int[] oscar = new int[0];
    public static final Unsafe papa = M.india();
    public final int[] alpha;
    public final Object[] bravo;
    public final int charlie;
    public final int delta;
    public final ao echo;
    public final boolean foxtrot;
    public final boolean golf;
    public final int[] hotel;
    public final int india;
    public final int juliet;
    public final as kilo;
    public final ah lima;
    public final C mike;
    public final al november;

    public aq(int[] iArr, Object[] objArr, int i4, int i5, ao aoVar, boolean z2, int[] iArr2, int i10, int i11, as asVar, ah ahVar, C c3, q qVar, al alVar) {
        this.alpha = iArr;
        this.bravo = objArr;
        this.charlie = i4;
        this.delta = i5;
        this.foxtrot = aoVar instanceof x;
        this.golf = z2;
        this.hotel = iArr2;
        this.india = i10;
        this.juliet = i11;
        this.kilo = asVar;
        this.lima = ahVar;
        this.mike = c3;
        this.echo = aoVar;
        this.november = alVar;
    }

    public static long amber(int i4) {
        return i4 & 1048575;
    }

    public static int azure(long j5, Object obj) {
        return ((Integer) M.delta.india(j5, obj)).intValue();
    }

    public static long beige(long j5, Object obj) {
        return ((Long) M.delta.india(j5, obj)).longValue();
    }

    public static Field gray(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder victor = Q0.c.victor("Field ", str, " for ");
            victor.append(cls.getName());
            victor.append(" not found. Known fields are ");
            victor.append(Arrays.toString(declaredFields));
            throw new RuntimeException(victor.toString());
        }
    }

    public static int jade(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static void magenta(int i4, Object obj, C1495m c1495m) {
        if (obj instanceof String) {
            String str = (String) obj;
            C1494l c1494l = (C1494l) c1495m.alpha;
            c1494l.jade(i4, 2);
            int i5 = c1494l.delta;
            try {
                int crimson = C1494l.crimson(str.length() * 3);
                int crimson2 = C1494l.crimson(str.length());
                byte[] bArr = c1494l.bravo;
                int i10 = c1494l.charlie;
                if (crimson2 == crimson) {
                    int i11 = i5 + crimson2;
                    c1494l.delta = i11;
                    int sierra = O.alpha.sierra(str, bArr, i11, i10 - i11);
                    c1494l.delta = i5;
                    c1494l.lavender((sierra - i5) - crimson2);
                    c1494l.delta = sierra;
                    return;
                }
                c1494l.lavender(O.bravo(str));
                int i12 = c1494l.delta;
                c1494l.delta = O.alpha.sierra(str, bArr, i12, i10 - i12);
                return;
            } catch (Utf8$UnpairedSurrogateException e) {
                c1494l.delta = i5;
                C1494l.echo.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(ab.alpha);
                try {
                    c1494l.lavender(bytes.length);
                    c1494l.fuchsia(bytes, 0, bytes.length);
                    return;
                } catch (CodedOutputStream$OutOfSpaceException e4) {
                    throw e4;
                } catch (IndexOutOfBoundsException e5) {
                    throw new CodedOutputStream$OutOfSpaceException(e5);
                }
            } catch (IndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        }
        c1495m.alpha(i4, (AbstractC1490h) obj);
    }

    public static List tango(AbstractC1483a abstractC1483a, long j5) {
        return (List) M.delta.india(j5, abstractC1483a);
    }

    public static aq yankee(ay ayVar, as asVar, ah ahVar, C c3, q qVar, al alVar) {
        if (ayVar instanceof ay) {
            return zulu(ayVar, asVar, ahVar, c3, qVar, alVar);
        }
        ayVar.getClass();
        throw new ClassCastException();
    }

    public static aq zulu(ay ayVar, as asVar, ah ahVar, C c3, q qVar, al alVar) {
        char c4;
        boolean z2;
        int i4;
        int charAt;
        int charAt2;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z10;
        int i30;
        int objectFieldOffset;
        Class<?> cls;
        int i31;
        int i32;
        int i33;
        Field gray;
        int i34;
        char charAt11;
        int i35;
        int i36;
        int i37;
        int i38;
        Field gray2;
        Field gray3;
        int i39;
        char charAt12;
        int i40;
        int i41;
        char charAt13;
        int i42;
        int i43;
        char charAt14;
        int i44;
        char charAt15;
        char charAt16;
        if ((ayVar.delta & 1) == 1) {
            c4 = 1;
        } else {
            c4 = 2;
        }
        int i45 = 0;
        if (c4 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = ayVar.bravo;
        int length = str.length();
        int charAt17 = str.charAt(0);
        if (charAt17 >= 55296) {
            int i46 = charAt17 & 8191;
            int i47 = 1;
            int i48 = 13;
            while (true) {
                i4 = i47 + 1;
                charAt16 = str.charAt(i47);
                if (charAt16 < 55296) {
                    break;
                }
                i46 |= (charAt16 & 8191) << i48;
                i48 += 13;
                i47 = i4;
            }
            charAt17 = i46 | (charAt16 << i48);
        } else {
            i4 = 1;
        }
        int i49 = i4 + 1;
        int charAt18 = str.charAt(i4);
        if (charAt18 >= 55296) {
            int i50 = charAt18 & 8191;
            int i51 = 13;
            while (true) {
                i44 = i49 + 1;
                charAt15 = str.charAt(i49);
                if (charAt15 < 55296) {
                    break;
                }
                i50 |= (charAt15 & 8191) << i51;
                i51 += 13;
                i49 = i44;
            }
            charAt18 = i50 | (charAt15 << i51);
            i49 = i44;
        }
        if (charAt18 == 0) {
            i11 = 2;
            i15 = 0;
            i14 = 0;
            i13 = 0;
            charAt = 0;
            charAt2 = 0;
            iArr = oscar;
            i12 = 0;
        } else {
            int i52 = i49 + 1;
            int charAt19 = str.charAt(i49);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i23 = i52 + 1;
                    charAt10 = str.charAt(i52);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i53 |= (charAt10 & 8191) << i54;
                    i54 += 13;
                    i52 = i23;
                }
                charAt19 = i53 | (charAt10 << i54);
                i52 = i23;
            }
            int i55 = i52 + 1;
            int charAt20 = str.charAt(i52);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i22 = i55 + 1;
                    charAt9 = str.charAt(i55);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i56 |= (charAt9 & 8191) << i57;
                    i57 += 13;
                    i55 = i22;
                }
                charAt20 = i56 | (charAt9 << i57);
                i55 = i22;
            }
            int i58 = i55 + 1;
            int charAt21 = str.charAt(i55);
            if (charAt21 >= 55296) {
                int i59 = charAt21 & 8191;
                int i60 = 13;
                while (true) {
                    i21 = i58 + 1;
                    charAt8 = str.charAt(i58);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i59 |= (charAt8 & 8191) << i60;
                    i60 += 13;
                    i58 = i21;
                }
                charAt21 = i59 | (charAt8 << i60);
                i58 = i21;
            }
            int i61 = i58 + 1;
            int charAt22 = str.charAt(i58);
            if (charAt22 >= 55296) {
                int i62 = charAt22 & 8191;
                int i63 = 13;
                while (true) {
                    i20 = i61 + 1;
                    charAt7 = str.charAt(i61);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i62 |= (charAt7 & 8191) << i63;
                    i63 += 13;
                    i61 = i20;
                }
                charAt22 = i62 | (charAt7 << i63);
                i61 = i20;
            }
            int i64 = i61 + 1;
            charAt = str.charAt(i61);
            if (charAt >= 55296) {
                int i65 = charAt & 8191;
                int i66 = 13;
                while (true) {
                    i19 = i64 + 1;
                    charAt6 = str.charAt(i64);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i65 |= (charAt6 & 8191) << i66;
                    i66 += 13;
                    i64 = i19;
                }
                charAt = i65 | (charAt6 << i66);
                i64 = i19;
            }
            int i67 = i64 + 1;
            charAt2 = str.charAt(i64);
            if (charAt2 >= 55296) {
                int i68 = charAt2 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i18 = i69 + 1;
                    charAt5 = str.charAt(i69);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i68 |= (charAt5 & 8191) << i70;
                    i70 += 13;
                    i69 = i18;
                }
                charAt2 = i68 | (charAt5 << i70);
                i5 = i18;
            } else {
                i5 = i67;
            }
            int i71 = i5 + 1;
            int charAt23 = str.charAt(i5);
            if (charAt23 >= 55296) {
                int i72 = charAt23 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i17 = i73 + 1;
                    charAt4 = str.charAt(i73);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i72 |= (charAt4 & 8191) << i74;
                    i74 += 13;
                    i73 = i17;
                }
                charAt23 = i72 | (charAt4 << i74);
                i10 = i17;
            } else {
                i10 = i71;
            }
            int i75 = i10 + 1;
            int charAt24 = str.charAt(i10);
            if (charAt24 >= 55296) {
                int i76 = charAt24 & 8191;
                i11 = 2;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i16 = i77 + 1;
                    charAt3 = str.charAt(i77);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i76 |= (charAt3 & 8191) << i78;
                    i78 += 13;
                    i77 = i16;
                }
                charAt24 = i76 | (charAt3 << i78);
                i75 = i16;
            } else {
                i11 = 2;
            }
            int[] iArr2 = new int[charAt24 + charAt2 + charAt23];
            i45 = (charAt19 * 2) + charAt20;
            i12 = charAt22;
            i13 = charAt24;
            i14 = charAt21;
            iArr = iArr2;
            i15 = charAt19;
            i49 = i75;
        }
        Unsafe unsafe = papa;
        Class<?> cls2 = ayVar.alpha.getClass();
        int i79 = i15;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i80 = charAt2 + i13;
        int i81 = i13;
        int i82 = i80;
        int i83 = 0;
        int i84 = 0;
        while (i49 < length) {
            int i85 = i49 + 1;
            int charAt25 = str.charAt(i49);
            int i86 = i45;
            if (charAt25 >= 55296) {
                int i87 = charAt25 & 8191;
                int i88 = i85;
                int i89 = 13;
                while (true) {
                    i43 = i88 + 1;
                    charAt14 = str.charAt(i88);
                    i24 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i87 |= (charAt14 & 8191) << i89;
                    i89 += 13;
                    i88 = i43;
                    length = i24;
                }
                charAt25 = i87 | (charAt14 << i89);
                i25 = i43;
            } else {
                i24 = length;
                i25 = i85;
            }
            int i90 = i25 + 1;
            int charAt26 = str.charAt(i25);
            if (charAt26 >= 55296) {
                int i91 = charAt26 & 8191;
                int i92 = i90;
                int i93 = 13;
                while (true) {
                    i41 = i92 + 1;
                    charAt13 = str.charAt(i92);
                    i42 = i91;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i91 = i42 | ((charAt13 & 8191) << i93);
                    i93 += 13;
                    i92 = i41;
                }
                charAt26 = i42 | (charAt13 << i93);
                i26 = i41;
            } else {
                i26 = i90;
            }
            int i94 = charAt17;
            int i95 = charAt26 & 255;
            int i96 = i14;
            if ((charAt26 & Barcode.FORMAT_UPC_E) != 0) {
                iArr[i84] = i83;
                i84++;
            }
            Object[] objArr2 = ayVar.charlie;
            if (i95 >= 51) {
                int i97 = i26 + 1;
                int charAt27 = str.charAt(i26);
                if (charAt27 >= 55296) {
                    int i98 = charAt27 & 8191;
                    int i99 = i97;
                    int i100 = 13;
                    while (true) {
                        i39 = i99 + 1;
                        charAt12 = str.charAt(i99);
                        i40 = i98;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i98 = i40 | ((charAt12 & 8191) << i100);
                        i100 += 13;
                        i99 = i39;
                    }
                    charAt27 = i40 | (charAt12 << i100);
                    i38 = i39;
                } else {
                    i38 = i97;
                }
                int i101 = charAt27;
                int i102 = i95 - 51;
                int i103 = i38;
                if (i102 == 9 || i102 == 17) {
                    i27 = charAt25;
                    objArr[P0.zulu(i83, 3, i11, 1)] = objArr2[i86];
                    i86++;
                } else {
                    if (i102 == 12 && (i94 & 1) == 1) {
                        i27 = charAt25;
                        objArr[P0.zulu(i83, 3, i11, 1)] = objArr2[i86];
                        i86++;
                    }
                    i27 = charAt25;
                }
                int i104 = i101 * 2;
                Object obj = objArr2[i104];
                if (obj instanceof Field) {
                    gray2 = (Field) obj;
                } else {
                    gray2 = gray(cls2, (String) obj);
                    objArr2[i104] = gray2;
                }
                i28 = i12;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(gray2);
                int i105 = i104 + 1;
                Object obj2 = objArr2[i105];
                if (obj2 instanceof Field) {
                    gray3 = (Field) obj2;
                } else {
                    gray3 = gray(cls2, (String) obj2);
                    objArr2[i105] = gray3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(gray3);
                objectFieldOffset = objectFieldOffset2;
                z10 = z2;
                i29 = i86;
                i31 = i103;
                i11 = 2;
                i33 = objectFieldOffset3;
                cls = cls2;
                i32 = 0;
            } else {
                i27 = charAt25;
                i28 = i12;
                int i106 = i86 + 1;
                Field gray4 = gray(cls2, (String) objArr2[i86]);
                if (i95 == 9 || i95 == 17) {
                    i29 = i106;
                    z10 = z2;
                    i30 = 1;
                    objArr[P0.zulu(i83, 3, 2, 1)] = gray4.getType();
                } else {
                    if (i95 == 27 || i95 == 49) {
                        z10 = z2;
                        i30 = 1;
                        i35 = i86 + 2;
                        objArr[P0.zulu(i83, 3, 2, 1)] = objArr2[i106];
                    } else if (i95 != 12 && i95 != 30 && i95 != 44) {
                        if (i95 == 50) {
                            int i107 = i81 + 1;
                            iArr[i81] = i83;
                            int i108 = (i83 / 3) * 2;
                            i29 = i86 + 2;
                            objArr[i108] = objArr2[i106];
                            if ((charAt26 & 2048) != 0) {
                                objArr[i108 + 1] = objArr2[i29];
                                i29 = i86 + 3;
                            }
                            i81 = i107;
                        } else {
                            i29 = i106;
                        }
                        z10 = z2;
                        i30 = 1;
                    } else {
                        i29 = i106;
                        i30 = 1;
                        if ((i94 & 1) == 1) {
                            z10 = z2;
                            i35 = i86 + 2;
                            objArr[P0.zulu(i83, 3, 2, 1)] = objArr2[i29];
                        } else {
                            z10 = z2;
                        }
                    }
                    i29 = i35;
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(gray4);
                if ((i94 & 1) == i30 && i95 <= 17) {
                    i31 = i26 + 1;
                    int charAt28 = str.charAt(i26);
                    if (charAt28 >= 55296) {
                        int i109 = charAt28 & 8191;
                        int i110 = 13;
                        while (true) {
                            i34 = i31 + 1;
                            charAt11 = str.charAt(i31);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i109 |= (charAt11 & 8191) << i110;
                            i110 += 13;
                            i31 = i34;
                        }
                        charAt28 = i109 | (charAt11 << i110);
                        i31 = i34;
                    }
                    i11 = 2;
                    int i111 = (charAt28 / 32) + (i79 * 2);
                    Object obj3 = objArr2[i111];
                    if (obj3 instanceof Field) {
                        gray = (Field) obj3;
                    } else {
                        gray = gray(cls2, (String) obj3);
                        objArr2[i111] = gray;
                    }
                    cls = cls2;
                    i33 = (int) unsafe.objectFieldOffset(gray);
                    i32 = charAt28 % 32;
                } else {
                    cls = cls2;
                    i11 = 2;
                    i31 = i26;
                    i32 = 0;
                    i33 = 0;
                }
                if (i95 >= 18 && i95 <= 49) {
                    iArr[i82] = objectFieldOffset;
                    i82++;
                }
            }
            int i112 = i83 + 1;
            iArr3[i83] = i27;
            int i113 = i83 + 2;
            String str2 = str;
            if ((charAt26 & 512) != 0) {
                i36 = 536870912;
            } else {
                i36 = 0;
            }
            if ((charAt26 & Barcode.FORMAT_QR_CODE) != 0) {
                i37 = 268435456;
            } else {
                i37 = 0;
            }
            iArr3[i112] = i36 | i37 | (i95 << 20) | objectFieldOffset;
            i83 += 3;
            iArr3[i113] = (i32 << 20) | i33;
            i49 = i31;
            cls2 = cls;
            z2 = z10;
            charAt17 = i94;
            i14 = i96;
            length = i24;
            i12 = i28;
            i45 = i29;
            str = str2;
        }
        return new aq(iArr3, objArr, i14, i12, ayVar.alpha, z2, iArr, i13, i80, asVar, ahVar, c3, qVar, alVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void alpha(Object obj) {
        int[] iArr;
        int i4;
        int i5 = this.india;
        while (true) {
            iArr = this.hotel;
            i4 = this.juliet;
            if (i5 >= i4) {
                break;
            }
            long lavender = lavender(iArr[i5]) & 1048575;
            Object india = M.delta.india(lavender, obj);
            if (india != null) {
                this.november.getClass();
                ((ak) india).alpha = false;
                M.oscar(obj, lavender, india);
            }
            i5++;
        }
        int length = iArr.length;
        while (i4 < length) {
            this.lima.alpha(iArr[i4], obj);
            i4++;
        }
        ((E) this.mike).getClass();
        ((x) obj).unknownFields.echo = false;
    }

    public final void black(long j5, int i4, Object obj) {
        Unsafe unsafe = papa;
        Object november = november(i4);
        Object object = unsafe.getObject(obj, j5);
        this.november.getClass();
        if (!((ak) object).alpha) {
            ak charlie = ak.purple.charlie();
            al.bravo(charlie, object);
            unsafe.putObject(obj, j5, charlie);
        }
        ao.ad.cyan(november);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001d. Please report as an issue. */
    public final int blue(Object obj, byte[] bArr, int i4, int i5, int i10, int i11, int i12, int i13, int i14, long j5, int i15, C5.b bVar) {
        Unsafe unsafe = papa;
        long j6 = this.alpha[i15 + 2] & 1048575;
        Object obj2 = null;
        boolean z2 = true;
        switch (i14) {
            case 51:
                if (i12 != 1) {
                    return i4;
                }
                unsafe.putObject(obj, j5, Double.valueOf(Double.longBitsToDouble(ap.golf(i4, bArr))));
                int i16 = i4 + 8;
                unsafe.putInt(obj, j6, i11);
                return i16;
            case 52:
                if (i12 != 5) {
                    return i4;
                }
                unsafe.putObject(obj, j5, Float.valueOf(Float.intBitsToFloat(ap.foxtrot(i4, bArr))));
                int i17 = i4 + 4;
                unsafe.putInt(obj, j6, i11);
                return i17;
            case 53:
            case 54:
                if (i12 != 0) {
                    return i4;
                }
                int romeo = ap.romeo(bArr, i4, bVar);
                unsafe.putObject(obj, j5, Long.valueOf(bVar.bravo));
                unsafe.putInt(obj, j6, i11);
                return romeo;
            case 55:
            case 62:
                if (i12 != 0) {
                    return i4;
                }
                int papa2 = ap.papa(bArr, i4, bVar);
                unsafe.putObject(obj, j5, Integer.valueOf(bVar.alpha));
                unsafe.putInt(obj, j6, i11);
                return papa2;
            case 56:
            case 65:
                if (i12 != 1) {
                    return i4;
                }
                unsafe.putObject(obj, j5, Long.valueOf(ap.golf(i4, bArr)));
                int i18 = i4 + 8;
                unsafe.putInt(obj, j6, i11);
                return i18;
            case 57:
            case 64:
                if (i12 != 5) {
                    return i4;
                }
                unsafe.putObject(obj, j5, Integer.valueOf(ap.foxtrot(i4, bArr)));
                int i19 = i4 + 4;
                unsafe.putInt(obj, j6, i11);
                return i19;
            case 58:
                if (i12 != 0) {
                    return i4;
                }
                int romeo2 = ap.romeo(bArr, i4, bVar);
                if (bVar.bravo == 0) {
                    z2 = false;
                }
                unsafe.putObject(obj, j5, Boolean.valueOf(z2));
                unsafe.putInt(obj, j6, i11);
                return romeo2;
            case 59:
                if (i12 != 2) {
                    return i4;
                }
                int papa3 = ap.papa(bArr, i4, bVar);
                int i20 = bVar.alpha;
                if (i20 == 0) {
                    unsafe.putObject(obj, j5, "");
                } else {
                    if ((i13 & 536870912) != 0) {
                        if (!O.alpha.victor(bArr, papa3, papa3 + i20)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(obj, j5, new String(bArr, papa3, i20, ab.alpha));
                    papa3 += i20;
                }
                unsafe.putInt(obj, j6, i11);
                return papa3;
            case 60:
                if (i12 != 2) {
                    return i4;
                }
                int india = ap.india(oscar(i15), bArr, i4, i5, bVar);
                if (unsafe.getInt(obj, j6) == i11) {
                    obj2 = unsafe.getObject(obj, j5);
                }
                if (obj2 == null) {
                    unsafe.putObject(obj, j5, bVar.charlie);
                } else {
                    unsafe.putObject(obj, j5, ab.charlie(obj2, bVar.charlie));
                }
                unsafe.putInt(obj, j6, i11);
                return india;
            case 61:
                if (i12 != 2) {
                    return i4;
                }
                int echo = ap.echo(bArr, i4, bVar);
                unsafe.putObject(obj, j5, bVar.charlie);
                unsafe.putInt(obj, j6, i11);
                return echo;
            case 63:
                if (i12 != 0) {
                    return i4;
                }
                int papa4 = ap.papa(bArr, i4, bVar);
                int i21 = bVar.alpha;
                mike(i15);
                unsafe.putObject(obj, j5, Integer.valueOf(i21));
                unsafe.putInt(obj, j6, i11);
                return papa4;
            case 66:
                if (i12 != 0) {
                    return i4;
                }
                int papa5 = ap.papa(bArr, i4, bVar);
                unsafe.putObject(obj, j5, Integer.valueOf(AbstractC1492j.alpha(bVar.alpha)));
                unsafe.putInt(obj, j6, i11);
                return papa5;
            case 67:
                if (i12 != 0) {
                    return i4;
                }
                int romeo3 = ap.romeo(bArr, i4, bVar);
                unsafe.putObject(obj, j5, Long.valueOf(AbstractC1492j.bravo(bVar.bravo)));
                unsafe.putInt(obj, j6, i11);
                return romeo3;
            case 68:
                if (i12 == 3) {
                    int hotel = ap.hotel(oscar(i15), bArr, i4, i5, (i10 & (-8)) | 4, bVar);
                    if (unsafe.getInt(obj, j6) == i11) {
                        obj2 = unsafe.getObject(obj, j5);
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j5, bVar.charlie);
                    } else {
                        unsafe.putObject(obj, j5, ab.charlie(obj2, bVar.charlie));
                    }
                    unsafe.putInt(obj, j6, i11);
                    return hotel;
                }
            default:
                return i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f2, code lost:
    
        return false;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo(Object obj) {
        int i4;
        boolean z2;
        int i5 = -1;
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            boolean z10 = true;
            if (i10 >= this.india) {
                return true;
            }
            int i12 = this.hotel[i10];
            int[] iArr = this.alpha;
            int i13 = iArr[i12];
            int lavender = lavender(i12);
            boolean z11 = this.golf;
            if (!z11) {
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                i4 = 1 << (i14 >>> 20);
                if (i15 != i5) {
                    i11 = papa.getInt(obj, i15);
                    i5 = i15;
                }
            } else {
                i4 = 0;
            }
            if ((268435456 & lavender) != 0) {
                if (z11) {
                    z2 = romeo(i12, obj);
                } else if ((i11 & i4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
            }
            int jade = jade(lavender);
            if (jade != 9 && jade != 17) {
                if (jade != 27) {
                    if (jade != 60 && jade != 68) {
                        if (jade != 49) {
                            if (jade != 50) {
                                continue;
                            } else {
                                Object india = M.delta.india(lavender & 1048575, obj);
                                this.november.getClass();
                                if (!((ak) india).isEmpty()) {
                                    ao.ad.cyan(november(i12));
                                    throw null;
                                }
                            }
                        }
                    } else if (sierra(i13, i12, obj)) {
                        if (!oscar(i12).bravo(M.delta.india(lavender & 1048575, obj))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i10++;
                }
                List list = (List) M.delta.india(lavender & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    A oscar2 = oscar(i12);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!oscar2.bravo(list.get(i16))) {
                            break loop0;
                        }
                    }
                }
                i10++;
            } else {
                if (z11) {
                    z10 = romeo(i12, obj);
                } else if ((i4 & i11) == 0) {
                    z10 = false;
                }
                if (z10) {
                    if (!oscar(i12).bravo(M.delta.india(lavender & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x0098. Please report as an issue. */
    public final int bronze(Object obj, byte[] bArr, int i4, int i5, int i10, C5.b bVar) {
        aq aqVar;
        Object obj2;
        Unsafe unsafe;
        Object obj3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe2;
        int i17;
        C5.b bVar2;
        byte[] bArr2;
        int i18;
        Unsafe unsafe3;
        int i19;
        C5.b bVar3;
        Unsafe unsafe4;
        int i20;
        boolean z2;
        int lima;
        int i21;
        Object obj4;
        int i22;
        int i23;
        aq aqVar2 = this;
        Object obj5 = obj;
        byte[] bArr3 = bArr;
        int i24 = i5;
        C5.b bVar4 = bVar;
        Unsafe unsafe5 = papa;
        int i25 = i4;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        int i30 = 0;
        while (true) {
            if (i25 < i24) {
                int i31 = i25 + 1;
                int i32 = bArr3[i25];
                if (i32 < 0) {
                    i31 = ap.oscar(i32, bArr3, i31, bVar4);
                    i32 = bVar4.alpha;
                }
                int i33 = i32;
                i25 = i31;
                int i34 = i33 >>> 3;
                int i35 = i27;
                int i36 = i33 & 7;
                int i37 = aqVar2.delta;
                int i38 = aqVar2.charlie;
                if (i34 > i26) {
                    int i39 = i35 / 3;
                    if (i34 >= i38 && i34 <= i37) {
                        i12 = aqVar2.ivory(i34, i39);
                    } else {
                        i12 = -1;
                    }
                    i11 = 0;
                } else if (i34 >= i38 && i34 <= i37) {
                    i11 = 0;
                    i12 = aqVar2.ivory(i34, 0);
                } else {
                    i11 = 0;
                    i12 = -1;
                }
                int i40 = i12;
                if (i40 == -1) {
                    aqVar = aqVar2;
                    obj2 = obj5;
                    i13 = i34;
                    unsafe = unsafe5;
                    i14 = i33;
                    obj3 = null;
                } else {
                    int[] iArr = aqVar2.alpha;
                    int i41 = iArr[i40 + 1];
                    int jade = jade(i41);
                    long j5 = i41 & 1048575;
                    if (jade <= 17) {
                        int i42 = iArr[i40 + 2];
                        int i43 = 1 << (i42 >>> 20);
                        int i44 = i42 & 1048575;
                        if (i44 != i29) {
                            if (i29 != -1) {
                                unsafe5.putInt(obj5, i29, i30);
                            }
                            i15 = unsafe5.getInt(obj5, i44);
                            i16 = i44;
                        } else {
                            i15 = i30;
                            i16 = i29;
                        }
                        switch (jade) {
                            case 0:
                                i13 = i34;
                                unsafe2 = unsafe5;
                                i17 = i25;
                                if (i36 != 1) {
                                    obj2 = obj5;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    M.delta.mike(obj5, j5, Double.longBitsToDouble(ap.golf(i17, bArr)));
                                    i25 = i17 + 8;
                                    i24 = i5;
                                    i29 = i16;
                                    unsafe5 = unsafe2;
                                    obj5 = obj5;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i15 | i43;
                                    bArr3 = bArr;
                                    bVar4 = bVar;
                                    i28 = i33;
                                    break;
                                }
                            case 1:
                                bVar2 = bVar;
                                i13 = i34;
                                bArr2 = bArr;
                                unsafe2 = unsafe5;
                                i17 = i25;
                                if (i36 != 5) {
                                    obj2 = obj5;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    M.delta.november(obj5, j5, Float.intBitsToFloat(ap.foxtrot(i17, bArr2)));
                                    i25 = i17 + 4;
                                    i18 = i15 | i43;
                                    i24 = i5;
                                    bVar4 = bVar2;
                                    i29 = i16;
                                    unsafe5 = unsafe2;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 2:
                            case 3:
                                bVar2 = bVar;
                                i13 = i34;
                                unsafe3 = unsafe5;
                                i17 = i25;
                                bArr2 = bArr;
                                if (i36 != 0) {
                                    unsafe2 = unsafe3;
                                    obj2 = obj5;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    int romeo = ap.romeo(bArr2, i17, bVar2);
                                    unsafe3.putLong(obj5, j5, bVar2.bravo);
                                    unsafe2 = unsafe3;
                                    i18 = i15 | i43;
                                    i24 = i5;
                                    i25 = romeo;
                                    bVar4 = bVar2;
                                    i29 = i16;
                                    unsafe5 = unsafe2;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 4:
                            case 11:
                                i13 = i34;
                                unsafe3 = unsafe5;
                                i17 = i25;
                                if (i36 == 0) {
                                    int papa2 = ap.papa(bArr, i17, bVar);
                                    unsafe3.putInt(obj5, j5, bVar.alpha);
                                    unsafe5 = unsafe3;
                                    bArr3 = bArr;
                                    i24 = i5;
                                    bVar4 = bVar;
                                    i29 = i16;
                                    i27 = i40;
                                    i28 = i33;
                                    i30 = i15 | i43;
                                    i25 = papa2;
                                    i26 = i13;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj2 = obj5;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                }
                            case 5:
                            case 14:
                                i13 = i34;
                                unsafe4 = unsafe5;
                                if (i36 == 1) {
                                    unsafe4.putLong(obj5, j5, ap.golf(i25, bArr));
                                    i25 += 8;
                                    int i45 = i16;
                                    i30 = i15 | i43;
                                    i24 = i5;
                                    i29 = i45;
                                    unsafe5 = unsafe4;
                                    bArr3 = bArr;
                                    bVar4 = bVar;
                                    i27 = i40;
                                    i28 = i33;
                                    i26 = i13;
                                    break;
                                } else {
                                    i17 = i25;
                                    obj2 = obj5;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                }
                            case 6:
                            case 13:
                                i19 = i5;
                                bVar3 = bVar;
                                i13 = i34;
                                unsafe4 = unsafe5;
                                i20 = i25;
                                bArr2 = bArr;
                                if (i36 != 5) {
                                    obj2 = obj5;
                                    i17 = i20;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    unsafe4.putInt(obj5, j5, ap.foxtrot(i20, bArr2));
                                    i25 = i20 + 4;
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 7:
                                i19 = i5;
                                bVar3 = bVar;
                                i13 = i34;
                                unsafe4 = unsafe5;
                                i20 = i25;
                                bArr2 = bArr;
                                if (i36 != 0) {
                                    obj2 = obj5;
                                    i17 = i20;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    i25 = ap.romeo(bArr2, i20, bVar3);
                                    if (bVar3.bravo != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    M.delta.kilo(obj5, j5, z2);
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 8:
                                i19 = i5;
                                bVar3 = bVar;
                                i13 = i34;
                                unsafe4 = unsafe5;
                                i20 = i25;
                                bArr2 = bArr;
                                if (i36 != 2) {
                                    obj2 = obj5;
                                    i17 = i20;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    if ((536870912 & i41) == 0) {
                                        lima = ap.kilo(bArr2, i20, bVar3);
                                    } else {
                                        lima = ap.lima(bArr2, i20, bVar3);
                                    }
                                    i25 = lima;
                                    unsafe4.putObject(obj5, j5, bVar3.charlie);
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 9:
                                i19 = i5;
                                bVar3 = bVar;
                                i13 = i34;
                                unsafe4 = unsafe5;
                                i20 = i25;
                                bArr2 = bArr;
                                if (i36 != 2) {
                                    obj2 = obj5;
                                    i17 = i20;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    i25 = ap.india(aqVar2.oscar(i40), bArr2, i20, i19, bVar3);
                                    if ((i15 & i43) == 0) {
                                        unsafe4.putObject(obj5, j5, bVar3.charlie);
                                    } else {
                                        unsafe4.putObject(obj5, j5, ab.charlie(unsafe4.getObject(obj5, j5), bVar3.charlie));
                                    }
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 10:
                                i19 = i5;
                                bVar3 = bVar;
                                i13 = i34;
                                unsafe4 = unsafe5;
                                i20 = i25;
                                bArr2 = bArr;
                                if (i36 != 2) {
                                    obj2 = obj5;
                                    i17 = i20;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    i25 = ap.echo(bArr2, i20, bVar3);
                                    unsafe4.putObject(obj5, j5, bVar3.charlie);
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 12:
                                i19 = i5;
                                bVar3 = bVar;
                                i13 = i34;
                                unsafe4 = unsafe5;
                                i20 = i25;
                                bArr2 = bArr;
                                if (i36 != 0) {
                                    obj2 = obj5;
                                    i17 = i20;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                } else {
                                    i25 = ap.papa(bArr2, i20, bVar3);
                                    int i46 = bVar3.alpha;
                                    aqVar2.mike(i40);
                                    unsafe4.putInt(obj5, j5, i46);
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                }
                            case 15:
                                i19 = i5;
                                bVar3 = bVar;
                                i13 = i34;
                                unsafe4 = unsafe5;
                                i20 = i25;
                                bArr2 = bArr;
                                if (i36 == 0) {
                                    i25 = ap.papa(bArr2, i20, bVar3);
                                    unsafe4.putInt(obj5, j5, AbstractC1492j.alpha(bVar3.alpha));
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                } else {
                                    obj2 = obj5;
                                    i17 = i20;
                                    unsafe2 = unsafe4;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                }
                            case 16:
                                i13 = i34;
                                bArr2 = bArr;
                                if (i36 == 0) {
                                    int romeo2 = ap.romeo(bArr2, i25, bVar);
                                    Unsafe unsafe6 = unsafe5;
                                    unsafe6.putLong(obj5, j5, AbstractC1492j.bravo(bVar.bravo));
                                    i18 = i15 | i43;
                                    unsafe5 = unsafe6;
                                    i24 = i5;
                                    bVar4 = bVar;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i25 = romeo2;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                } else {
                                    obj2 = obj5;
                                    unsafe2 = unsafe5;
                                    i17 = i25;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                }
                            case 17:
                                if (i36 == 3) {
                                    i13 = i34;
                                    i25 = ap.hotel(aqVar2.oscar(i40), bArr, i25, i5, (i34 << 3) | 4, bVar);
                                    bArr2 = bArr;
                                    bVar3 = bVar;
                                    i19 = i5;
                                    if ((i15 & i43) == 0) {
                                        unsafe5.putObject(obj5, j5, bVar3.charlie);
                                    } else {
                                        unsafe5.putObject(obj5, j5, ab.charlie(unsafe5.getObject(obj5, j5), bVar3.charlie));
                                    }
                                    i18 = i15 | i43;
                                    i24 = i19;
                                    bVar4 = bVar3;
                                    i29 = i16;
                                    i27 = i40;
                                    i26 = i13;
                                    i30 = i18;
                                    bArr3 = bArr2;
                                    i28 = i33;
                                    break;
                                } else {
                                    i13 = i34;
                                    obj2 = obj5;
                                    unsafe2 = unsafe5;
                                    i17 = i25;
                                    aqVar = aqVar2;
                                    i25 = i17;
                                    i29 = i16;
                                    unsafe = unsafe2;
                                    i11 = i40;
                                    i14 = i33;
                                    i30 = i15;
                                    obj3 = null;
                                    break;
                                }
                            default:
                                obj2 = obj5;
                                i13 = i34;
                                unsafe2 = unsafe5;
                                i17 = i25;
                                aqVar = aqVar2;
                                i25 = i17;
                                i29 = i16;
                                unsafe = unsafe2;
                                i11 = i40;
                                i14 = i33;
                                i30 = i15;
                                obj3 = null;
                                break;
                        }
                    } else {
                        i13 = i34;
                        Object obj6 = obj5;
                        Unsafe unsafe7 = unsafe5;
                        if (jade == 27) {
                            if (i36 == 2) {
                                aa aaVar = (aa) unsafe7.getObject(obj6, j5);
                                if (!((AbstractC1484b) aaVar).alpha) {
                                    int size = aaVar.size();
                                    if (size == 0) {
                                        i23 = 10;
                                    } else {
                                        i23 = size * 2;
                                    }
                                    aaVar = aaVar.golf(i23);
                                    unsafe7.putObject(obj6, j5, aaVar);
                                }
                                i24 = i5;
                                i25 = ap.juliet(aqVar2.oscar(i40), i33, bArr, i25, i5, aaVar, bVar);
                                i28 = i33;
                                unsafe5 = unsafe7;
                                obj5 = obj6;
                                i27 = i40;
                                i26 = i13;
                                bArr3 = bArr;
                                bVar4 = bVar;
                            } else {
                                i21 = i29;
                                i25 = i25;
                                unsafe = unsafe7;
                                obj4 = obj6;
                                i11 = i40;
                                i14 = i33;
                                obj3 = null;
                                i22 = i30;
                                i29 = i21;
                                aqVar = aqVar2;
                                obj2 = obj4;
                                i30 = i22;
                            }
                        } else {
                            i14 = i33;
                            if (jade <= 49) {
                                int i47 = i29;
                                int i48 = i30;
                                unsafe = unsafe7;
                                obj3 = null;
                                int crimson = aqVar2.crimson(obj6, bArr, i25, i5, i14, i36, i40, i41, jade, j5, bVar);
                                i14 = i14;
                                i11 = i40;
                                if (crimson != i25) {
                                    i29 = i47;
                                    i24 = i5;
                                    bVar4 = bVar;
                                    i28 = i14;
                                    i25 = crimson;
                                    i27 = i11;
                                    i30 = i48;
                                    i26 = i13;
                                    unsafe5 = unsafe;
                                    obj5 = obj6;
                                    bArr3 = bArr;
                                } else {
                                    i29 = i47;
                                    obj2 = obj6;
                                    i25 = crimson;
                                    i30 = i48;
                                    aqVar = aqVar2;
                                }
                            } else {
                                i21 = i29;
                                i22 = i30;
                                unsafe = unsafe7;
                                obj4 = obj6;
                                i11 = i40;
                                obj3 = null;
                                i25 = i25;
                                if (jade == 50) {
                                    if (i36 == 2) {
                                        aqVar2.black(j5, i11, obj4);
                                        throw null;
                                    }
                                    i29 = i21;
                                    aqVar = aqVar2;
                                    obj2 = obj4;
                                    i30 = i22;
                                } else {
                                    int blue = aqVar2.blue(obj4, bArr, i25, i5, i14, i13, i36, i41, jade, j5, i11, bVar);
                                    obj2 = obj4;
                                    i14 = i14;
                                    aqVar = aqVar2;
                                    if (blue != i25) {
                                        bArr3 = bArr;
                                        i29 = i21;
                                        i24 = i5;
                                        aqVar2 = aqVar;
                                        i25 = blue;
                                        i27 = i11;
                                        i30 = i22;
                                        i26 = i13;
                                        unsafe5 = unsafe;
                                        i28 = i14;
                                        obj5 = obj2;
                                        bVar4 = bVar;
                                    } else {
                                        i29 = i21;
                                        i25 = blue;
                                        i30 = i22;
                                    }
                                }
                            }
                        }
                    }
                }
                if (i14 == i10 && i10 != 0) {
                    i24 = i5;
                    i28 = i14;
                } else {
                    x xVar = (x) obj2;
                    D d4 = xVar.unknownFields;
                    if (d4 == D.foxtrot) {
                        d4 = D.bravo();
                        xVar.unknownFields = d4;
                    }
                    int i49 = i14;
                    int mike = ap.mike(i49, bArr, i25, i5, d4, bVar);
                    i24 = i5;
                    bArr3 = bArr;
                    i25 = mike;
                    i28 = i49;
                    aqVar2 = aqVar;
                    i27 = i11;
                    obj5 = obj2;
                    i26 = i13;
                    unsafe5 = unsafe;
                    bVar4 = bVar;
                }
            } else {
                aqVar = aqVar2;
                obj2 = obj5;
                unsafe = unsafe5;
                obj3 = null;
            }
        }
        if (i29 != -1) {
            unsafe.putInt(obj2, i29, i30);
        }
        for (int i50 = aqVar.india; i50 < aqVar.juliet; i50++) {
            aqVar.lima(aqVar.hotel[i50], obj2, obj3);
        }
        if (i10 == 0) {
            if (i25 != i24) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i25 > i24 || i28 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i25;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final Object charlie() {
        this.kilo.getClass();
        return ((x) this.echo).delta(4);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0060. Please report as an issue. */
    public final void coral(Object obj, byte[] bArr, int i4, int i5, C5.b bVar) {
        int ivory;
        Unsafe unsafe;
        int i10;
        int i11;
        Object obj2;
        Unsafe unsafe2;
        int i12;
        int i13;
        int i14;
        Object obj3;
        int i15;
        int romeo;
        int i16;
        Unsafe unsafe3;
        boolean z2;
        int i17;
        aq aqVar = this;
        byte[] bArr2 = bArr;
        int i18 = i5;
        C5.b bVar2 = bVar;
        Unsafe unsafe4 = papa;
        int i19 = -1;
        int i20 = 0;
        int i21 = i4;
        int i22 = -1;
        int i23 = 0;
        while (i21 < i18) {
            int i24 = i21 + 1;
            int i25 = bArr2[i21];
            if (i25 < 0) {
                i24 = ap.oscar(i25, bArr2, i24, bVar2);
                i25 = bVar2.alpha;
            }
            int i26 = i24;
            int i27 = i25;
            int i28 = i27 >>> 3;
            int i29 = i27 & 7;
            int i30 = aqVar.delta;
            int i31 = aqVar.charlie;
            if (i28 > i22) {
                int i32 = i23 / 3;
                if (i28 >= i31 && i28 <= i30) {
                    ivory = aqVar.ivory(i28, i32);
                }
                ivory = i19;
            } else {
                if (i28 >= i31 && i28 <= i30) {
                    ivory = aqVar.ivory(i28, i20);
                }
                ivory = i19;
            }
            int i33 = ivory;
            if (i33 == i19) {
                unsafe = unsafe4;
                i10 = i26;
                i11 = i28;
                i33 = i20;
            } else {
                int i34 = aqVar.alpha[i33 + 1];
                i11 = i28;
                int jade = jade(i34);
                long j5 = 1048575 & i34;
                if (jade <= 17) {
                    switch (jade) {
                        case 0:
                            obj2 = obj;
                            unsafe2 = unsafe4;
                            i12 = i27;
                            if (i29 == 1) {
                                M.delta.mike(obj2, j5, Double.longBitsToDouble(ap.golf(i26, bArr2)));
                                i21 = i26 + 8;
                                unsafe4 = unsafe2;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i13 = i26;
                            i14 = i11;
                            i27 = i12;
                            unsafe = unsafe2;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 1:
                            obj2 = obj;
                            unsafe2 = unsafe4;
                            i12 = i27;
                            if (i29 == 5) {
                                M.delta.november(obj2, j5, Float.intBitsToFloat(ap.foxtrot(i26, bArr2)));
                                i21 = i26 + 4;
                                unsafe4 = unsafe2;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i13 = i26;
                            i14 = i11;
                            i27 = i12;
                            unsafe = unsafe2;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 2:
                        case 3:
                            obj3 = obj;
                            i15 = i27;
                            if (i29 == 0) {
                                romeo = ap.romeo(bArr2, i26, bVar2);
                                unsafe4.putLong(obj3, j5, bVar2.bravo);
                                i21 = romeo;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i13 = i26;
                            i14 = i11;
                            i27 = i15;
                            unsafe = unsafe4;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 4:
                        case 11:
                            obj3 = obj;
                            i15 = i27;
                            if (i29 == 0) {
                                int papa2 = ap.papa(bArr2, i26, bVar2);
                                unsafe4.putInt(obj3, j5, bVar2.alpha);
                                i21 = papa2;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i13 = i26;
                            i14 = i11;
                            i27 = i15;
                            unsafe = unsafe4;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 5:
                        case 14:
                            i16 = i27;
                            unsafe3 = unsafe4;
                            if (i29 != 1) {
                                i14 = i11;
                                i27 = i16;
                                unsafe = unsafe3;
                                i13 = i26;
                                i10 = i13;
                                i11 = i14;
                                break;
                            } else {
                                unsafe4 = unsafe3;
                                unsafe4.putLong(obj, j5, ap.golf(i26, bArr2));
                                i21 = i26 + 8;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                        case 6:
                        case 13:
                            i16 = i27;
                            unsafe3 = unsafe4;
                            if (i29 == 5) {
                                unsafe3.putInt(obj, j5, ap.foxtrot(i26, bArr2));
                                i21 = i26 + 4;
                                unsafe4 = unsafe3;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i14 = i11;
                            i27 = i16;
                            unsafe = unsafe3;
                            i13 = i26;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 7:
                            i16 = i27;
                            unsafe3 = unsafe4;
                            if (i29 == 0) {
                                i21 = ap.romeo(bArr2, i26, bVar2);
                                if (bVar2.bravo != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                M.delta.kilo(obj, j5, z2);
                                unsafe4 = unsafe3;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i14 = i11;
                            i27 = i16;
                            unsafe = unsafe3;
                            i13 = i26;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 8:
                            i16 = i27;
                            unsafe3 = unsafe4;
                            if (i29 == 2) {
                                if ((i34 & 536870912) == 0) {
                                    i21 = ap.kilo(bArr2, i26, bVar2);
                                } else {
                                    i21 = ap.lima(bArr2, i26, bVar2);
                                }
                                unsafe3.putObject(obj, j5, bVar2.charlie);
                                unsafe4 = unsafe3;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i14 = i11;
                            i27 = i16;
                            unsafe = unsafe3;
                            i13 = i26;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 9:
                            i16 = i27;
                            unsafe3 = unsafe4;
                            if (i29 == 2) {
                                i21 = ap.india(aqVar.oscar(i33), bArr2, i26, i18, bVar2);
                                Object object = unsafe3.getObject(obj, j5);
                                if (object == null) {
                                    unsafe3.putObject(obj, j5, bVar2.charlie);
                                } else {
                                    unsafe3.putObject(obj, j5, ab.charlie(object, bVar2.charlie));
                                }
                                unsafe4 = unsafe3;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i14 = i11;
                            i27 = i16;
                            unsafe = unsafe3;
                            i13 = i26;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 10:
                            i16 = i27;
                            unsafe3 = unsafe4;
                            if (i29 == 2) {
                                i21 = ap.echo(bArr2, i26, bVar2);
                                unsafe3.putObject(obj, j5, bVar2.charlie);
                                unsafe4 = unsafe3;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            i14 = i11;
                            i27 = i16;
                            unsafe = unsafe3;
                            i13 = i26;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 12:
                            unsafe3 = unsafe4;
                            if (i29 == 0) {
                                i21 = ap.papa(bArr2, i26, bVar2);
                                unsafe3.putInt(obj, j5, bVar2.alpha);
                                unsafe4 = unsafe3;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            unsafe = unsafe3;
                            i13 = i26;
                            i14 = i11;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 15:
                            unsafe3 = unsafe4;
                            if (i29 == 0) {
                                i21 = ap.papa(bArr2, i26, bVar2);
                                unsafe3.putInt(obj, j5, AbstractC1492j.alpha(bVar2.alpha));
                                unsafe4 = unsafe3;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                            unsafe = unsafe3;
                            i13 = i26;
                            i14 = i11;
                            i10 = i13;
                            i11 = i14;
                            break;
                        case 16:
                            if (i29 == 0) {
                                romeo = ap.romeo(bArr2, i26, bVar2);
                                unsafe4.putLong(obj, j5, AbstractC1492j.bravo(bVar2.bravo));
                                unsafe4 = unsafe4;
                                i21 = romeo;
                                i22 = i11;
                                i23 = i33;
                                break;
                            }
                        default:
                            unsafe = unsafe4;
                            i13 = i26;
                            i14 = i11;
                            i10 = i13;
                            i11 = i14;
                            break;
                    }
                    i19 = -1;
                    i20 = 0;
                } else if (jade == 27) {
                    if (i29 == 2) {
                        aa aaVar = (aa) unsafe4.getObject(obj, j5);
                        if (!((AbstractC1484b) aaVar).alpha) {
                            int size = aaVar.size();
                            if (size == 0) {
                                i17 = 10;
                            } else {
                                i17 = size * 2;
                            }
                            aaVar = aaVar.golf(i17);
                            unsafe4.putObject(obj, j5, aaVar);
                        }
                        unsafe = unsafe4;
                        i21 = ap.juliet(aqVar.oscar(i33), i27, bArr2, i26, i18, aaVar, bVar2);
                        bArr2 = bArr;
                        i18 = i5;
                        bVar2 = bVar;
                        i22 = i11;
                        i23 = i33;
                        unsafe4 = unsafe;
                        i19 = -1;
                        i20 = 0;
                    } else {
                        i27 = i27;
                        unsafe = unsafe4;
                        i13 = i26;
                        i14 = i11;
                        i10 = i13;
                        i11 = i14;
                    }
                } else {
                    i27 = i27;
                    unsafe = unsafe4;
                    if (jade <= 49) {
                        i14 = i11;
                        int crimson = aqVar.crimson(obj, bArr, i26, i5, i27, i29, i33, i34, jade, j5, bVar);
                        i33 = i33;
                        if (crimson != i26) {
                            bArr2 = bArr;
                            i18 = i5;
                            bVar2 = bVar;
                            i21 = crimson;
                            i23 = i33;
                            i22 = i14;
                            unsafe4 = unsafe;
                            i19 = -1;
                            i20 = 0;
                        } else {
                            i10 = crimson;
                            i11 = i14;
                        }
                    } else {
                        i13 = i26;
                        i14 = i11;
                        if (jade == 50) {
                            if (i29 == 2) {
                                aqVar.black(j5, i33, obj);
                                throw null;
                            }
                            i10 = i13;
                            i11 = i14;
                        } else {
                            int blue = aqVar.blue(obj, bArr, i13, i5, i27, i14, i29, i34, jade, j5, i33, bVar);
                            i11 = i14;
                            if (blue != i13) {
                                aqVar = this;
                                i18 = i5;
                                bVar2 = bVar;
                                i21 = blue;
                                i22 = i11;
                                i23 = i33;
                                unsafe4 = unsafe;
                                i19 = -1;
                                i20 = 0;
                                bArr2 = bArr;
                            } else {
                                i10 = blue;
                            }
                        }
                    }
                }
            }
            x xVar = (x) obj;
            D d4 = xVar.unknownFields;
            if (d4 == D.foxtrot) {
                d4 = D.bravo();
                xVar.unknownFields = d4;
            }
            i21 = ap.mike(i27, bArr, i10, i5, d4, bVar);
            aqVar = this;
            bArr2 = bArr;
            bVar2 = bVar;
            i18 = i5;
            i22 = i11;
            i23 = i33;
            unsafe4 = unsafe;
            i19 = -1;
            i20 = 0;
        }
        if (i21 == i18) {
        } else {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int crimson(Object obj, byte[] bArr, int i4, int i5, int i10, int i11, int i12, long j5, int i13, long j6, C5.b bVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        int quebec;
        int i14;
        Unsafe unsafe = papa;
        aa aaVar = (aa) unsafe.getObject(obj, j6);
        if (!((AbstractC1484b) aaVar).alpha) {
            int size = aaVar.size();
            if (size == 0) {
                i14 = 10;
            } else {
                i14 = size * 2;
            }
            aaVar = aaVar.golf(i14);
            unsafe.putObject(obj, j6, aaVar);
        }
        aa aaVar2 = aaVar;
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    AbstractC1496n abstractC1496n = (AbstractC1496n) aaVar2;
                    int papa2 = ap.papa(bArr, i4, bVar);
                    int i15 = bVar.alpha + papa2;
                    while (papa2 < i15) {
                        abstractC1496n.bravo(Double.longBitsToDouble(ap.golf(papa2, bArr)));
                        papa2 += 8;
                    }
                    if (papa2 == i15) {
                        return papa2;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 1) {
                    AbstractC1496n abstractC1496n2 = (AbstractC1496n) aaVar2;
                    abstractC1496n2.bravo(Double.longBitsToDouble(ap.golf(i4, bArr)));
                    int i16 = i4 + 8;
                    while (i16 < i5) {
                        int papa3 = ap.papa(bArr, i16, bVar);
                        if (i10 == bVar.alpha) {
                            abstractC1496n2.bravo(Double.longBitsToDouble(ap.golf(papa3, bArr)));
                            i16 = papa3 + 8;
                        } else {
                            return i16;
                        }
                    }
                    return i16;
                }
                return i4;
            case 19:
            case 36:
                if (i11 == 2) {
                    t tVar = (t) aaVar2;
                    int papa4 = ap.papa(bArr, i4, bVar);
                    int i17 = bVar.alpha + papa4;
                    while (papa4 < i17) {
                        tVar.bravo(Float.intBitsToFloat(ap.foxtrot(papa4, bArr)));
                        papa4 += 4;
                    }
                    if (papa4 == i17) {
                        return papa4;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 5) {
                    t tVar2 = (t) aaVar2;
                    tVar2.bravo(Float.intBitsToFloat(ap.foxtrot(i4, bArr)));
                    int i18 = i4 + 4;
                    while (i18 < i5) {
                        int papa5 = ap.papa(bArr, i18, bVar);
                        if (i10 == bVar.alpha) {
                            tVar2.bravo(Float.intBitsToFloat(ap.foxtrot(papa5, bArr)));
                            i18 = papa5 + 4;
                        } else {
                            return i18;
                        }
                    }
                    return i18;
                }
                return i4;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    ai aiVar = (ai) aaVar2;
                    int papa6 = ap.papa(bArr, i4, bVar);
                    int i19 = bVar.alpha + papa6;
                    while (papa6 < i19) {
                        papa6 = ap.romeo(bArr, papa6, bVar);
                        aiVar.bravo(bVar.bravo);
                    }
                    if (papa6 == i19) {
                        return papa6;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 0) {
                    ai aiVar2 = (ai) aaVar2;
                    int romeo = ap.romeo(bArr, i4, bVar);
                    aiVar2.bravo(bVar.bravo);
                    while (romeo < i5) {
                        int papa7 = ap.papa(bArr, romeo, bVar);
                        if (i10 == bVar.alpha) {
                            romeo = ap.romeo(bArr, papa7, bVar);
                            aiVar2.bravo(bVar.bravo);
                        } else {
                            return romeo;
                        }
                    }
                    return romeo;
                }
                return i4;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    y yVar = (y) aaVar2;
                    int papa8 = ap.papa(bArr, i4, bVar);
                    int i20 = bVar.alpha + papa8;
                    while (papa8 < i20) {
                        papa8 = ap.papa(bArr, papa8, bVar);
                        yVar.bravo(bVar.alpha);
                    }
                    if (papa8 == i20) {
                        return papa8;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 0) {
                    return ap.quebec(i10, bArr, i4, i5, aaVar2, bVar);
                }
                return i4;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    ai aiVar3 = (ai) aaVar2;
                    int papa9 = ap.papa(bArr, i4, bVar);
                    int i21 = bVar.alpha + papa9;
                    while (papa9 < i21) {
                        aiVar3.bravo(ap.golf(papa9, bArr));
                        papa9 += 8;
                    }
                    if (papa9 == i21) {
                        return papa9;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 1) {
                    ai aiVar4 = (ai) aaVar2;
                    aiVar4.bravo(ap.golf(i4, bArr));
                    int i22 = i4 + 8;
                    while (i22 < i5) {
                        int papa10 = ap.papa(bArr, i22, bVar);
                        if (i10 == bVar.alpha) {
                            aiVar4.bravo(ap.golf(papa10, bArr));
                            i22 = papa10 + 8;
                        } else {
                            return i22;
                        }
                    }
                    return i22;
                }
                return i4;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    y yVar2 = (y) aaVar2;
                    int papa11 = ap.papa(bArr, i4, bVar);
                    int i23 = bVar.alpha + papa11;
                    while (papa11 < i23) {
                        yVar2.bravo(ap.foxtrot(papa11, bArr));
                        papa11 += 4;
                    }
                    if (papa11 == i23) {
                        return papa11;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 5) {
                    y yVar3 = (y) aaVar2;
                    yVar3.bravo(ap.foxtrot(i4, bArr));
                    int i24 = i4 + 4;
                    while (i24 < i5) {
                        int papa12 = ap.papa(bArr, i24, bVar);
                        if (i10 == bVar.alpha) {
                            yVar3.bravo(ap.foxtrot(papa12, bArr));
                            i24 = papa12 + 4;
                        } else {
                            return i24;
                        }
                    }
                    return i24;
                }
                return i4;
            case 25:
            case 42:
                if (i11 == 2) {
                    AbstractC1486d abstractC1486d = (AbstractC1486d) aaVar2;
                    int papa13 = ap.papa(bArr, i4, bVar);
                    int i25 = bVar.alpha + papa13;
                    while (papa13 < i25) {
                        papa13 = ap.romeo(bArr, papa13, bVar);
                        if (bVar.bravo != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        abstractC1486d.bravo(z11);
                    }
                    if (papa13 == i25) {
                        return papa13;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 0) {
                    AbstractC1486d abstractC1486d2 = (AbstractC1486d) aaVar2;
                    int romeo2 = ap.romeo(bArr, i4, bVar);
                    if (bVar.bravo != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    abstractC1486d2.bravo(z2);
                    while (romeo2 < i5) {
                        int papa14 = ap.papa(bArr, romeo2, bVar);
                        if (i10 == bVar.alpha) {
                            romeo2 = ap.romeo(bArr, papa14, bVar);
                            if (bVar.bravo != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            abstractC1486d2.bravo(z10);
                        } else {
                            return romeo2;
                        }
                    }
                    return romeo2;
                }
                return i4;
            case 26:
                if (i11 == 2) {
                    if ((j5 & 536870912) == 0) {
                        int papa15 = ap.papa(bArr, i4, bVar);
                        int i26 = bVar.alpha;
                        if (i26 >= 0) {
                            if (i26 == 0) {
                                aaVar2.add("");
                            } else {
                                aaVar2.add(new String(bArr, papa15, i26, ab.alpha));
                                papa15 += i26;
                            }
                            while (papa15 < i5) {
                                int papa16 = ap.papa(bArr, papa15, bVar);
                                if (i10 == bVar.alpha) {
                                    papa15 = ap.papa(bArr, papa16, bVar);
                                    int i27 = bVar.alpha;
                                    if (i27 >= 0) {
                                        if (i27 == 0) {
                                            aaVar2.add("");
                                        } else {
                                            aaVar2.add(new String(bArr, papa15, i27, ab.alpha));
                                            papa15 += i27;
                                        }
                                    } else {
                                        throw InvalidProtocolBufferException.negativeSize();
                                    }
                                } else {
                                    return papa15;
                                }
                            }
                            return papa15;
                        }
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    int papa17 = ap.papa(bArr, i4, bVar);
                    int i28 = bVar.alpha;
                    if (i28 >= 0) {
                        if (i28 == 0) {
                            aaVar2.add("");
                        } else {
                            int i29 = papa17 + i28;
                            if (O.alpha.victor(bArr, papa17, i29)) {
                                aaVar2.add(new String(bArr, papa17, i28, ab.alpha));
                                papa17 = i29;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        }
                        while (papa17 < i5) {
                            int papa18 = ap.papa(bArr, papa17, bVar);
                            if (i10 == bVar.alpha) {
                                papa17 = ap.papa(bArr, papa18, bVar);
                                int i30 = bVar.alpha;
                                if (i30 >= 0) {
                                    if (i30 == 0) {
                                        aaVar2.add("");
                                    } else {
                                        int i31 = papa17 + i30;
                                        if (O.alpha.victor(bArr, papa17, i31)) {
                                            aaVar2.add(new String(bArr, papa17, i30, ab.alpha));
                                            papa17 = i31;
                                        } else {
                                            throw InvalidProtocolBufferException.invalidUtf8();
                                        }
                                    }
                                } else {
                                    throw InvalidProtocolBufferException.negativeSize();
                                }
                            } else {
                                return papa17;
                            }
                        }
                        return papa17;
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return i4;
            case 27:
                if (i11 == 2) {
                    return ap.juliet(oscar(i12), i10, bArr, i4, i5, aaVar2, bVar);
                }
                return i4;
            case 28:
                if (i11 == 2) {
                    int papa19 = ap.papa(bArr, i4, bVar);
                    int i32 = bVar.alpha;
                    if (i32 >= 0) {
                        if (i32 <= bArr.length - papa19) {
                            if (i32 == 0) {
                                aaVar2.add(AbstractC1490h.purple);
                            } else {
                                aaVar2.add(AbstractC1490h.delta(bArr, papa19, i32));
                                papa19 += i32;
                            }
                            while (papa19 < i5) {
                                int papa20 = ap.papa(bArr, papa19, bVar);
                                if (i10 == bVar.alpha) {
                                    papa19 = ap.papa(bArr, papa20, bVar);
                                    int i33 = bVar.alpha;
                                    if (i33 >= 0) {
                                        if (i33 <= bArr.length - papa19) {
                                            if (i33 == 0) {
                                                aaVar2.add(AbstractC1490h.purple);
                                            } else {
                                                aaVar2.add(AbstractC1490h.delta(bArr, papa19, i33));
                                                papa19 += i33;
                                            }
                                        } else {
                                            throw InvalidProtocolBufferException.truncatedMessage();
                                        }
                                    } else {
                                        throw InvalidProtocolBufferException.negativeSize();
                                    }
                                } else {
                                    return papa19;
                                }
                            }
                            return papa19;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return i4;
            case 30:
            case 44:
                if (i11 == 2) {
                    y yVar4 = (y) aaVar2;
                    quebec = ap.papa(bArr, i4, bVar);
                    int i34 = bVar.alpha + quebec;
                    while (quebec < i34) {
                        quebec = ap.papa(bArr, quebec, bVar);
                        yVar4.bravo(bVar.alpha);
                    }
                    if (quebec != i34) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                } else {
                    if (i11 == 0) {
                        quebec = ap.quebec(i10, bArr, i4, i5, aaVar2, bVar);
                    }
                    return i4;
                }
                x xVar = (x) obj;
                D d4 = xVar.unknownFields;
                if (d4 == D.foxtrot) {
                    d4 = null;
                }
                mike(i12);
                Class cls = B.alpha;
                if (d4 != null) {
                    xVar.unknownFields = d4;
                }
                return quebec;
            case 33:
            case 47:
                if (i11 == 2) {
                    y yVar5 = (y) aaVar2;
                    int papa21 = ap.papa(bArr, i4, bVar);
                    int i35 = bVar.alpha + papa21;
                    while (papa21 < i35) {
                        papa21 = ap.papa(bArr, papa21, bVar);
                        yVar5.bravo(AbstractC1492j.alpha(bVar.alpha));
                    }
                    if (papa21 == i35) {
                        return papa21;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 0) {
                    y yVar6 = (y) aaVar2;
                    int papa22 = ap.papa(bArr, i4, bVar);
                    yVar6.bravo(AbstractC1492j.alpha(bVar.alpha));
                    while (papa22 < i5) {
                        int papa23 = ap.papa(bArr, papa22, bVar);
                        if (i10 == bVar.alpha) {
                            papa22 = ap.papa(bArr, papa23, bVar);
                            yVar6.bravo(AbstractC1492j.alpha(bVar.alpha));
                        } else {
                            return papa22;
                        }
                    }
                    return papa22;
                }
                return i4;
            case 34:
            case 48:
                if (i11 == 2) {
                    ai aiVar5 = (ai) aaVar2;
                    int papa24 = ap.papa(bArr, i4, bVar);
                    int i36 = bVar.alpha + papa24;
                    while (papa24 < i36) {
                        papa24 = ap.romeo(bArr, papa24, bVar);
                        aiVar5.bravo(AbstractC1492j.bravo(bVar.bravo));
                    }
                    if (papa24 == i36) {
                        return papa24;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 == 0) {
                    ai aiVar6 = (ai) aaVar2;
                    int romeo3 = ap.romeo(bArr, i4, bVar);
                    aiVar6.bravo(AbstractC1492j.bravo(bVar.bravo));
                    while (romeo3 < i5) {
                        int papa25 = ap.papa(bArr, romeo3, bVar);
                        if (i10 == bVar.alpha) {
                            romeo3 = ap.romeo(bArr, papa25, bVar);
                            aiVar6.bravo(AbstractC1492j.bravo(bVar.bravo));
                        } else {
                            return romeo3;
                        }
                    }
                    return romeo3;
                }
                return i4;
            case 49:
                if (i11 == 3) {
                    A oscar2 = oscar(i12);
                    int i37 = (i10 & (-8)) | 4;
                    int hotel = ap.hotel(oscar2, bArr, i4, i5, i37, bVar);
                    A a6 = oscar2;
                    aaVar2.add(bVar.charlie);
                    while (hotel < i5) {
                        int papa26 = ap.papa(bArr, hotel, bVar);
                        if (i10 == bVar.alpha) {
                            A a8 = a6;
                            hotel = ap.hotel(a8, bArr, papa26, i5, i37, bVar);
                            aaVar2.add(bVar.charlie);
                            a6 = a8;
                        } else {
                            return hotel;
                        }
                    }
                    return hotel;
                }
                return i4;
            default:
                return i4;
        }
    }

    public final void cyan(Object obj, long j5, az azVar, A a6, p pVar) {
        azVar.cyan(this.lima.charlie(j5, obj), a6, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void delta(Object obj, byte[] bArr, int i4, int i5, C5.b bVar) {
        if (this.golf) {
            coral(obj, bArr, i4, i5, bVar);
        } else {
            bronze(obj, bArr, i4, i5, 0, bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.B.yankee(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.hotel(r7, r12) == r5.hotel(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.hotel(r7, r12) == r5.hotel(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.B.yankee(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.B.yankee(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.B.yankee(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.charlie(r7, r12) == r5.charlie(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.hotel(r7, r12) == r5.hotel(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.hotel(r7, r12) == r5.hotel(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.hotel(r7, r12) == r5.hotel(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.foxtrot(r7, r12)) == java.lang.Float.floatToIntBits(r5.foxtrot(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.echo(r7, r12)) == java.lang.Double.doubleToLongBits(r5.echo(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.B.yankee(r9.india(r7, r12), r9.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean echo(x xVar, x xVar2) {
        int[] iArr = this.alpha;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 < length) {
                int lavender = lavender(i4);
                long j5 = lavender & 1048575;
                switch (jade(lavender)) {
                    case 0:
                        if (kilo(xVar, xVar2, i4)) {
                            L l10 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 1:
                        if (kilo(xVar, xVar2, i4)) {
                            L l11 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 2:
                        if (kilo(xVar, xVar2, i4)) {
                            L l12 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 3:
                        if (kilo(xVar, xVar2, i4)) {
                            L l13 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 4:
                        if (kilo(xVar, xVar2, i4)) {
                            L l14 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 5:
                        if (kilo(xVar, xVar2, i4)) {
                            L l15 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 6:
                        if (kilo(xVar, xVar2, i4)) {
                            L l16 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 7:
                        if (kilo(xVar, xVar2, i4)) {
                            L l17 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 8:
                        if (kilo(xVar, xVar2, i4)) {
                            L l18 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 9:
                        if (kilo(xVar, xVar2, i4)) {
                            L l19 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 10:
                        if (kilo(xVar, xVar2, i4)) {
                            L l20 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 11:
                        if (kilo(xVar, xVar2, i4)) {
                            L l21 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 12:
                        if (kilo(xVar, xVar2, i4)) {
                            L l22 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 13:
                        if (kilo(xVar, xVar2, i4)) {
                            L l23 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 14:
                        if (kilo(xVar, xVar2, i4)) {
                            L l24 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 15:
                        if (kilo(xVar, xVar2, i4)) {
                            L l25 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 16:
                        if (kilo(xVar, xVar2, i4)) {
                            L l26 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 17:
                        if (kilo(xVar, xVar2, i4)) {
                            L l27 = M.delta;
                            break;
                        }
                        z2 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        L l28 = M.delta;
                        z2 = B.yankee(l28.india(j5, xVar), l28.india(j5, xVar2));
                        break;
                    case 50:
                        L l29 = M.delta;
                        z2 = B.yankee(l29.india(j5, xVar), l29.india(j5, xVar2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j6 = iArr[i4 + 2] & 1048575;
                        L l30 = M.delta;
                        if (l30.golf(j6, xVar) == l30.golf(j6, xVar2)) {
                            break;
                        }
                        z2 = false;
                        break;
                }
                if (z2) {
                    i4 += 3;
                }
            } else {
                E e = (E) this.mike;
                e.getClass();
                D d4 = xVar.unknownFields;
                e.getClass();
                if (d4.equals(xVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void emerald(Object obj, int i4, az azVar, A a6, p pVar) {
        azVar.golf(this.lima.charlie(i4 & 1048575, obj), a6, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void foxtrot(Object obj, C1495m c1495m) {
        c1495m.getClass();
        if (this.golf) {
            int[] iArr = this.alpha;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int lavender = lavender(i4);
                int i5 = iArr[i4];
                int jade = jade(lavender);
                C1494l c1494l = (C1494l) c1495m.alpha;
                switch (jade) {
                    case 0:
                        if (romeo(i4, obj)) {
                            double echo = M.delta.echo(lavender & 1048575, obj);
                            c1494l.getClass();
                            c1494l.green(i5, Double.doubleToRawLongBits(echo));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (romeo(i4, obj)) {
                            float foxtrot = M.delta.foxtrot(lavender & 1048575, obj);
                            c1494l.getClass();
                            c1494l.gold(i5, Float.floatToRawIntBits(foxtrot));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (romeo(i4, obj)) {
                            c1494l.lime(i5, M.delta.hotel(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (romeo(i4, obj)) {
                            c1494l.lime(i5, M.delta.hotel(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (romeo(i4, obj)) {
                            int golf = M.delta.golf(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.ivory(golf);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (romeo(i4, obj)) {
                            c1494l.green(i5, M.delta.hotel(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (romeo(i4, obj)) {
                            c1494l.gold(i5, M.delta.golf(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (romeo(i4, obj)) {
                            boolean charlie = M.delta.charlie(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.emerald(charlie ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (romeo(i4, obj)) {
                            magenta(i5, M.delta.india(lavender & 1048575, obj), c1495m);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (romeo(i4, obj)) {
                            c1495m.charlie(i5, M.delta.india(lavender & 1048575, obj), oscar(i4));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (romeo(i4, obj)) {
                            c1495m.alpha(i5, (AbstractC1490h) M.delta.india(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (romeo(i4, obj)) {
                            int golf2 = M.delta.golf(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.lavender(golf2);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (romeo(i4, obj)) {
                            int golf3 = M.delta.golf(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.ivory(golf3);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (romeo(i4, obj)) {
                            c1494l.gold(i5, M.delta.golf(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (romeo(i4, obj)) {
                            c1494l.green(i5, M.delta.hotel(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (romeo(i4, obj)) {
                            int golf4 = M.delta.golf(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.lavender((golf4 >> 31) ^ (golf4 << 1));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (romeo(i4, obj)) {
                            long hotel = M.delta.hotel(lavender & 1048575, obj);
                            c1494l.lime(i5, (hotel >> 63) ^ (hotel << 1));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (romeo(i4, obj)) {
                            c1495m.bravo(i5, M.delta.india(lavender & 1048575, obj), oscar(i4));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        B.azure(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 19:
                        B.bronze(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 20:
                        B.cyan(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 21:
                        B.jade(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 22:
                        B.crimson(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 23:
                        B.blue(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 24:
                        B.black(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 25:
                        B.zulu(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 26:
                        B.indigo(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m);
                        break;
                    case 27:
                        B.emerald(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, oscar(i4));
                        break;
                    case 28:
                        B.amber(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m);
                        break;
                    case 29:
                        B.ivory(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 30:
                        B.beige(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 31:
                        B.fuchsia(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 32:
                        B.gold(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 33:
                        B.gray(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 34:
                        B.green(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, false);
                        break;
                    case 35:
                        B.azure(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 36:
                        B.bronze(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 37:
                        B.cyan(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 38:
                        B.jade(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 39:
                        B.crimson(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 40:
                        B.blue(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 41:
                        B.black(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 42:
                        B.zulu(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 43:
                        B.ivory(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 44:
                        B.beige(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 45:
                        B.fuchsia(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 46:
                        B.gold(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 47:
                        B.gray(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 48:
                        B.green(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, true);
                        break;
                    case 49:
                        B.coral(iArr[i4], (List) M.delta.india(lavender & 1048575, obj), c1495m, oscar(i4));
                        break;
                    case 50:
                        if (M.delta.india(lavender & 1048575, obj) != null) {
                            Object november = november(i4);
                            this.november.getClass();
                            ao.ad.cyan(november);
                            throw null;
                        }
                        break;
                    case 51:
                        if (sierra(i5, i4, obj)) {
                            double doubleValue = ((Double) M.delta.india(lavender & 1048575, obj)).doubleValue();
                            c1494l.getClass();
                            c1494l.green(i5, Double.doubleToRawLongBits(doubleValue));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (sierra(i5, i4, obj)) {
                            float floatValue = ((Float) M.delta.india(lavender & 1048575, obj)).floatValue();
                            c1494l.getClass();
                            c1494l.gold(i5, Float.floatToRawIntBits(floatValue));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (sierra(i5, i4, obj)) {
                            c1494l.lime(i5, beige(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (sierra(i5, i4, obj)) {
                            c1494l.lime(i5, beige(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (sierra(i5, i4, obj)) {
                            int azure = azure(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.ivory(azure);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (sierra(i5, i4, obj)) {
                            c1494l.green(i5, beige(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (sierra(i5, i4, obj)) {
                            c1494l.gold(i5, azure(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (sierra(i5, i4, obj)) {
                            boolean booleanValue = ((Boolean) M.delta.india(lavender & 1048575, obj)).booleanValue();
                            c1494l.jade(i5, 0);
                            c1494l.emerald(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (sierra(i5, i4, obj)) {
                            magenta(i5, M.delta.india(lavender & 1048575, obj), c1495m);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (sierra(i5, i4, obj)) {
                            c1495m.charlie(i5, M.delta.india(lavender & 1048575, obj), oscar(i4));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (sierra(i5, i4, obj)) {
                            c1495m.alpha(i5, (AbstractC1490h) M.delta.india(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (sierra(i5, i4, obj)) {
                            int azure2 = azure(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.lavender(azure2);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (sierra(i5, i4, obj)) {
                            int azure3 = azure(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.ivory(azure3);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (sierra(i5, i4, obj)) {
                            c1494l.gold(i5, azure(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (sierra(i5, i4, obj)) {
                            c1494l.green(i5, beige(lavender & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (sierra(i5, i4, obj)) {
                            int azure4 = azure(lavender & 1048575, obj);
                            c1494l.jade(i5, 0);
                            c1494l.lavender((azure4 >> 31) ^ (azure4 << 1));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (sierra(i5, i4, obj)) {
                            long beige = beige(lavender & 1048575, obj);
                            c1494l.lime(i5, (beige >> 63) ^ (beige << 1));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (sierra(i5, i4, obj)) {
                            c1495m.bravo(i5, M.delta.india(lavender & 1048575, obj), oscar(i4));
                            break;
                        } else {
                            break;
                        }
                }
            }
            ((E) this.mike).getClass();
            ((x) obj).unknownFields.delta(c1495m);
            return;
        }
        lime(obj, c1495m);
    }

    public final void fuchsia(Object obj, int i4, az azVar) {
        boolean z2;
        if ((536870912 & i4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            M.oscar(obj, i4 & 1048575, azVar.fuchsia());
        } else if (this.foxtrot) {
            M.oscar(obj, i4 & 1048575, azVar.yankee());
        } else {
            M.oscar(obj, i4 & 1048575, azVar.beige());
        }
    }

    public final void gold(Object obj, int i4, az azVar) {
        boolean z2;
        if ((536870912 & i4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ah ahVar = this.lima;
        if (z2) {
            azVar.azure(ahVar.charlie(i4 & 1048575, obj));
        } else {
            azVar.amber(ahVar.charlie(i4 & 1048575, obj));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int golf(x xVar) {
        int i4;
        int bravo;
        int i5;
        int[] iArr = this.alpha;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int lavender = lavender(i11);
            int i12 = iArr[i11];
            long j5 = 1048575 & lavender;
            int i13 = 1237;
            int i14 = 37;
            switch (jade(lavender)) {
                case 0:
                    i4 = i10 * 53;
                    bravo = ab.bravo(Double.doubleToLongBits(M.delta.echo(j5, xVar)));
                    i10 = bravo + i4;
                    break;
                case 1:
                    i4 = i10 * 53;
                    bravo = Float.floatToIntBits(M.delta.foxtrot(j5, xVar));
                    i10 = bravo + i4;
                    break;
                case 2:
                    i4 = i10 * 53;
                    bravo = ab.bravo(M.delta.hotel(j5, xVar));
                    i10 = bravo + i4;
                    break;
                case 3:
                    i4 = i10 * 53;
                    bravo = ab.bravo(M.delta.hotel(j5, xVar));
                    i10 = bravo + i4;
                    break;
                case 4:
                    i4 = i10 * 53;
                    bravo = M.delta.golf(j5, xVar);
                    i10 = bravo + i4;
                    break;
                case 5:
                    i4 = i10 * 53;
                    bravo = ab.bravo(M.delta.hotel(j5, xVar));
                    i10 = bravo + i4;
                    break;
                case 6:
                    i4 = i10 * 53;
                    bravo = M.delta.golf(j5, xVar);
                    i10 = bravo + i4;
                    break;
                case 7:
                    i5 = i10 * 53;
                    boolean charlie = M.delta.charlie(j5, xVar);
                    Charset charset = ab.alpha;
                    break;
                case 8:
                    i4 = i10 * 53;
                    bravo = ((String) M.delta.india(j5, xVar)).hashCode();
                    i10 = bravo + i4;
                    break;
                case 9:
                    Object india = M.delta.india(j5, xVar);
                    if (india != null) {
                        i14 = india.hashCode();
                    }
                    i10 = (i10 * 53) + i14;
                    break;
                case 10:
                    i4 = i10 * 53;
                    bravo = M.delta.india(j5, xVar).hashCode();
                    i10 = bravo + i4;
                    break;
                case 11:
                    i4 = i10 * 53;
                    bravo = M.delta.golf(j5, xVar);
                    i10 = bravo + i4;
                    break;
                case 12:
                    i4 = i10 * 53;
                    bravo = M.delta.golf(j5, xVar);
                    i10 = bravo + i4;
                    break;
                case 13:
                    i4 = i10 * 53;
                    bravo = M.delta.golf(j5, xVar);
                    i10 = bravo + i4;
                    break;
                case 14:
                    i4 = i10 * 53;
                    bravo = ab.bravo(M.delta.hotel(j5, xVar));
                    i10 = bravo + i4;
                    break;
                case 15:
                    i4 = i10 * 53;
                    bravo = M.delta.golf(j5, xVar);
                    i10 = bravo + i4;
                    break;
                case 16:
                    i4 = i10 * 53;
                    bravo = ab.bravo(M.delta.hotel(j5, xVar));
                    i10 = bravo + i4;
                    break;
                case 17:
                    Object india2 = M.delta.india(j5, xVar);
                    if (india2 != null) {
                        i14 = india2.hashCode();
                    }
                    i10 = (i10 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i10 * 53;
                    bravo = M.delta.india(j5, xVar).hashCode();
                    i10 = bravo + i4;
                    break;
                case 50:
                    i4 = i10 * 53;
                    bravo = M.delta.india(j5, xVar).hashCode();
                    i10 = bravo + i4;
                    break;
                case 51:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = ab.bravo(Double.doubleToLongBits(((Double) M.delta.india(j5, xVar)).doubleValue()));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = Float.floatToIntBits(((Float) M.delta.india(j5, xVar)).floatValue());
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = ab.bravo(beige(j5, xVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = ab.bravo(beige(j5, xVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = azure(j5, xVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = ab.bravo(beige(j5, xVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = azure(j5, xVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (sierra(i12, i11, xVar)) {
                        i5 = i10 * 53;
                        boolean booleanValue = ((Boolean) M.delta.india(j5, xVar)).booleanValue();
                        Charset charset2 = ab.alpha;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = ((String) M.delta.india(j5, xVar)).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = M.delta.india(j5, xVar).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = M.delta.india(j5, xVar).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = azure(j5, xVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = azure(j5, xVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = azure(j5, xVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = ab.bravo(beige(j5, xVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = azure(j5, xVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = ab.bravo(beige(j5, xVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (sierra(i12, i11, xVar)) {
                        i4 = i10 * 53;
                        bravo = M.delta.india(j5, xVar).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((E) this.mike).getClass();
        return xVar.unknownFields.hashCode() + (i10 * 53);
    }

    public final void green(int i4, Object obj) {
        if (this.golf) {
            return;
        }
        int i5 = this.alpha[i4 + 2];
        long j5 = i5 & 1048575;
        M.mike(j5, M.delta.golf(j5, obj) | (1 << (i5 >>> 20)), obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void hotel(Object obj, az azVar, p pVar) {
        pVar.getClass();
        uniform(this.mike, obj, azVar, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final int india(AbstractC1483a abstractC1483a) {
        if (this.golf) {
            return quebec(abstractC1483a);
        }
        return papa(abstractC1483a);
    }

    public final void indigo(int i4, int i5, Object obj) {
        M.mike(this.alpha[i5 + 2] & 1048575, i4, obj);
    }

    public final int ivory(int i4, int i5) {
        int[] iArr = this.alpha;
        int length = (iArr.length / 3) - 1;
        while (i5 <= length) {
            int i10 = (length + i5) >>> 1;
            int i11 = i10 * 3;
            int i12 = iArr[i11];
            if (i4 == i12) {
                return i11;
            }
            if (i4 < i12) {
                length = i10 - 1;
            } else {
                i5 = i10 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void juliet(x xVar, x xVar2) {
        x xVar3;
        xVar2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.alpha;
            if (i4 < iArr.length) {
                int lavender = lavender(i4);
                long j5 = 1048575 & lavender;
                int i5 = iArr[i4];
                switch (jade(lavender)) {
                    case 0:
                        if (romeo(i4, xVar2)) {
                            L l10 = M.delta;
                            xVar3 = xVar;
                            l10.mike(xVar3, j5, l10.echo(j5, xVar2));
                            green(i4, xVar3);
                            break;
                        }
                        break;
                    case 1:
                        if (romeo(i4, xVar2)) {
                            L l11 = M.delta;
                            l11.november(xVar, j5, l11.foxtrot(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 2:
                        if (romeo(i4, xVar2)) {
                            M.november(xVar, j5, M.delta.hotel(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 3:
                        if (romeo(i4, xVar2)) {
                            M.november(xVar, j5, M.delta.hotel(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 4:
                        if (romeo(i4, xVar2)) {
                            M.mike(j5, M.delta.golf(j5, xVar2), xVar);
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 5:
                        if (romeo(i4, xVar2)) {
                            M.november(xVar, j5, M.delta.hotel(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 6:
                        if (romeo(i4, xVar2)) {
                            M.mike(j5, M.delta.golf(j5, xVar2), xVar);
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 7:
                        if (romeo(i4, xVar2)) {
                            L l12 = M.delta;
                            l12.kilo(xVar, j5, l12.charlie(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 8:
                        if (romeo(i4, xVar2)) {
                            M.oscar(xVar, j5, M.delta.india(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 9:
                        whiskey(xVar, xVar2, i4);
                        break;
                    case 10:
                        if (romeo(i4, xVar2)) {
                            M.oscar(xVar, j5, M.delta.india(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 11:
                        if (romeo(i4, xVar2)) {
                            M.mike(j5, M.delta.golf(j5, xVar2), xVar);
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 12:
                        if (romeo(i4, xVar2)) {
                            M.mike(j5, M.delta.golf(j5, xVar2), xVar);
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 13:
                        if (romeo(i4, xVar2)) {
                            M.mike(j5, M.delta.golf(j5, xVar2), xVar);
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 14:
                        if (romeo(i4, xVar2)) {
                            M.november(xVar, j5, M.delta.hotel(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 15:
                        if (romeo(i4, xVar2)) {
                            M.mike(j5, M.delta.golf(j5, xVar2), xVar);
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 16:
                        if (romeo(i4, xVar2)) {
                            M.november(xVar, j5, M.delta.hotel(j5, xVar2));
                            green(i4, xVar);
                            break;
                        }
                        break;
                    case 17:
                        whiskey(xVar, xVar2, i4);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.lima.bravo(xVar, xVar2, j5);
                        break;
                    case 50:
                        Class cls = B.alpha;
                        L l13 = M.delta;
                        Object india = l13.india(j5, xVar);
                        Object india2 = l13.india(j5, xVar2);
                        this.november.getClass();
                        M.oscar(xVar, j5, al.bravo(india, india2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (sierra(i5, i4, xVar2)) {
                            M.oscar(xVar, j5, M.delta.india(j5, xVar2));
                            indigo(i5, i4, xVar);
                            break;
                        }
                        break;
                    case 60:
                        xray(xVar, xVar2, i4);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (sierra(i5, i4, xVar2)) {
                            M.oscar(xVar, j5, M.delta.india(j5, xVar2));
                            indigo(i5, i4, xVar);
                            break;
                        }
                        break;
                    case 68:
                        xray(xVar, xVar2, i4);
                        break;
                }
                xVar3 = xVar;
                i4 += 3;
                xVar = xVar3;
            } else {
                B.xray(this.mike, xVar, xVar2);
                return;
            }
        }
    }

    public final boolean kilo(x xVar, x xVar2, int i4) {
        if (romeo(i4, xVar) == romeo(i4, xVar2)) {
            return true;
        }
        return false;
    }

    public final int lavender(int i4) {
        return this.alpha[i4 + 1];
    }

    public final void lima(int i4, Object obj, Object obj2) {
        int i5 = this.alpha[i4];
        if (M.delta.india(lavender(i4) & 1048575, obj) == null) {
            return;
        }
        mike(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [long] */
    /* JADX WARN: Type inference failed for: r17v3 */
    public final void lime(Object obj, C1495m c1495m) {
        int i4;
        boolean z2;
        int i5;
        int[] iArr = this.alpha;
        int length = iArr.length;
        Unsafe unsafe = papa;
        int i10 = -1;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int lavender = lavender(i12);
            int i13 = iArr[i12];
            int jade = jade(lavender);
            if (!this.golf && jade <= 17) {
                int i14 = iArr[i12 + 2];
                i4 = 1048575;
                int i15 = i14 & 1048575;
                z2 = 1;
                if (i15 != i10) {
                    i11 = unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i5 = 1 << (i14 >>> 20);
            } else {
                i4 = 1048575;
                z2 = 1;
                i5 = 0;
            }
            long j5 = lavender & i4;
            switch (jade) {
                case 0:
                    if ((i11 & i5) != 0) {
                        double echo = M.delta.echo(j5, obj);
                        C1494l c1494l = (C1494l) c1495m.alpha;
                        c1494l.getClass();
                        c1494l.green(i13, Double.doubleToRawLongBits(echo));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i11 & i5) != 0) {
                        float foxtrot = M.delta.foxtrot(j5, obj);
                        C1494l c1494l2 = (C1494l) c1495m.alpha;
                        c1494l2.getClass();
                        c1494l2.gold(i13, Float.floatToRawIntBits(foxtrot));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i11 & i5) != 0) {
                        ((C1494l) c1495m.alpha).lime(i13, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i11 & i5) != 0) {
                        ((C1494l) c1495m.alpha).lime(i13, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i11 & i5) != 0) {
                        int i16 = unsafe.getInt(obj, j5);
                        C1494l c1494l3 = (C1494l) c1495m.alpha;
                        c1494l3.jade(i13, 0);
                        c1494l3.ivory(i16);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i11 & i5) != 0) {
                        ((C1494l) c1495m.alpha).green(i13, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i11 & i5) != 0) {
                        ((C1494l) c1495m.alpha).gold(i13, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i11 & i5) != 0) {
                        boolean charlie = M.delta.charlie(j5, obj);
                        C1494l c1494l4 = (C1494l) c1495m.alpha;
                        c1494l4.jade(i13, 0);
                        c1494l4.emerald(charlie ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i11 & i5) != 0) {
                        magenta(i13, unsafe.getObject(obj, j5), c1495m);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i11 & i5) != 0) {
                        c1495m.charlie(i13, unsafe.getObject(obj, j5), oscar(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i11 & i5) != 0) {
                        c1495m.alpha(i13, (AbstractC1490h) unsafe.getObject(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i11 & i5) != 0) {
                        int i17 = unsafe.getInt(obj, j5);
                        C1494l c1494l5 = (C1494l) c1495m.alpha;
                        c1494l5.jade(i13, 0);
                        c1494l5.lavender(i17);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i11 & i5) != 0) {
                        int i18 = unsafe.getInt(obj, j5);
                        C1494l c1494l6 = (C1494l) c1495m.alpha;
                        c1494l6.jade(i13, 0);
                        c1494l6.ivory(i18);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i11 & i5) != 0) {
                        ((C1494l) c1495m.alpha).gold(i13, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i11 & i5) != 0) {
                        ((C1494l) c1495m.alpha).green(i13, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i11 & i5) != 0) {
                        int i19 = unsafe.getInt(obj, j5);
                        C1494l c1494l7 = (C1494l) c1495m.alpha;
                        c1494l7.jade(i13, 0);
                        c1494l7.lavender((i19 >> 31) ^ (i19 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i11 & i5) != 0) {
                        long j6 = unsafe.getLong(obj, j5);
                        ((C1494l) c1495m.alpha).lime(i13, (j6 >> 63) ^ (j6 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i11 & i5) != 0) {
                        c1495m.bravo(i13, unsafe.getObject(obj, j5), oscar(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    B.azure(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 19:
                    B.bronze(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 20:
                    B.cyan(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 21:
                    B.jade(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 22:
                    B.crimson(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 23:
                    B.blue(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 24:
                    B.black(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 25:
                    B.zulu(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 26:
                    B.indigo(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m);
                    break;
                case 27:
                    B.emerald(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, oscar(i12));
                    break;
                case 28:
                    B.amber(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m);
                    break;
                case 29:
                    B.ivory(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 30:
                    B.beige(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 31:
                    B.fuchsia(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 32:
                    B.gold(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 33:
                    B.gray(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 34:
                    B.green(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, false);
                    break;
                case 35:
                    B.azure(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 36:
                    B.bronze(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 37:
                    B.cyan(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 38:
                    B.jade(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 39:
                    B.crimson(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 40:
                    B.blue(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 41:
                    B.black(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 42:
                    B.zulu(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 43:
                    B.ivory(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 44:
                    B.beige(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 45:
                    B.fuchsia(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 46:
                    B.gold(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 47:
                    B.gray(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 48:
                    B.green(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, z2);
                    break;
                case 49:
                    B.coral(iArr[i12], (List) unsafe.getObject(obj, j5), c1495m, oscar(i12));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j5) != null) {
                        Object november = november(i12);
                        this.november.getClass();
                        ao.ad.cyan(november);
                        throw null;
                    }
                    break;
                case 51:
                    if (sierra(i13, i12, obj)) {
                        double doubleValue = ((Double) M.delta.india(j5, obj)).doubleValue();
                        C1494l c1494l8 = (C1494l) c1495m.alpha;
                        c1494l8.getClass();
                        c1494l8.green(i13, Double.doubleToRawLongBits(doubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (sierra(i13, i12, obj)) {
                        float floatValue = ((Float) M.delta.india(j5, obj)).floatValue();
                        C1494l c1494l9 = (C1494l) c1495m.alpha;
                        c1494l9.getClass();
                        c1494l9.gold(i13, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (sierra(i13, i12, obj)) {
                        ((C1494l) c1495m.alpha).lime(i13, beige(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (sierra(i13, i12, obj)) {
                        ((C1494l) c1495m.alpha).lime(i13, beige(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (sierra(i13, i12, obj)) {
                        int azure = azure(j5, obj);
                        C1494l c1494l10 = (C1494l) c1495m.alpha;
                        c1494l10.jade(i13, 0);
                        c1494l10.ivory(azure);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (sierra(i13, i12, obj)) {
                        ((C1494l) c1495m.alpha).green(i13, beige(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (sierra(i13, i12, obj)) {
                        ((C1494l) c1495m.alpha).gold(i13, azure(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (sierra(i13, i12, obj)) {
                        boolean booleanValue = ((Boolean) M.delta.india(j5, obj)).booleanValue();
                        C1494l c1494l11 = (C1494l) c1495m.alpha;
                        c1494l11.jade(i13, 0);
                        c1494l11.emerald(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (sierra(i13, i12, obj)) {
                        magenta(i13, unsafe.getObject(obj, j5), c1495m);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (sierra(i13, i12, obj)) {
                        c1495m.charlie(i13, unsafe.getObject(obj, j5), oscar(i12));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (sierra(i13, i12, obj)) {
                        c1495m.alpha(i13, (AbstractC1490h) unsafe.getObject(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (sierra(i13, i12, obj)) {
                        int azure2 = azure(j5, obj);
                        C1494l c1494l12 = (C1494l) c1495m.alpha;
                        c1494l12.jade(i13, 0);
                        c1494l12.lavender(azure2);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (sierra(i13, i12, obj)) {
                        int azure3 = azure(j5, obj);
                        C1494l c1494l13 = (C1494l) c1495m.alpha;
                        c1494l13.jade(i13, 0);
                        c1494l13.ivory(azure3);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (sierra(i13, i12, obj)) {
                        ((C1494l) c1495m.alpha).gold(i13, azure(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (sierra(i13, i12, obj)) {
                        ((C1494l) c1495m.alpha).green(i13, beige(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (sierra(i13, i12, obj)) {
                        int azure4 = azure(j5, obj);
                        C1494l c1494l14 = (C1494l) c1495m.alpha;
                        c1494l14.jade(i13, 0);
                        c1494l14.lavender((azure4 >> 31) ^ (azure4 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (sierra(i13, i12, obj)) {
                        long beige = beige(j5, obj);
                        ((C1494l) c1495m.alpha).lime(i13, (beige >> 63) ^ (beige << z2));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (sierra(i13, i12, obj)) {
                        c1495m.bravo(i13, unsafe.getObject(obj, j5), oscar(i12));
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((E) this.mike).getClass();
        ((x) obj).unknownFields.delta(c1495m);
    }

    public final void mike(int i4) {
        if (this.bravo[P0.zulu(i4, 3, 2, 1)] == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public final Object november(int i4) {
        return this.bravo[(i4 / 3) * 2];
    }

    public final A oscar(int i4) {
        int i5 = (i4 / 3) * 2;
        Object[] objArr = this.bravo;
        A a6 = (A) objArr[i5];
        if (a6 != null) {
            return a6;
        }
        A alpha = aw.charlie.alpha((Class) objArr[i5 + 1]);
        objArr[i5] = alpha;
        return alpha;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    public final int papa(AbstractC1483a abstractC1483a) {
        int i4;
        int coral;
        int cyan;
        int coral2;
        int blue;
        int beige;
        int coral3;
        int bronze;
        int zulu;
        int coral4;
        int i5;
        Unsafe unsafe = papa;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.alpha;
            if (i11 < iArr.length) {
                int lavender = lavender(i11);
                int i14 = iArr[i11];
                int jade = jade(lavender);
                if (jade <= 17) {
                    int i15 = iArr[i11 + 2];
                    int i16 = i15 & 1048575;
                    i4 = 1 << (i15 >>> 20);
                    if (i16 != i10) {
                        i13 = unsafe.getInt(abstractC1483a, i16);
                        i10 = i16;
                    }
                } else {
                    i4 = 0;
                }
                long j5 = lavender & 1048575;
                switch (jade) {
                    case 0:
                        if ((i13 & i4) != 0) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 8, i12);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i4 & i13) != 0) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 4, i12);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i13 & i4) != 0) {
                            long j6 = unsafe.getLong(abstractC1483a, j5);
                            coral = C1494l.coral(i14);
                            cyan = C1494l.cyan(j6);
                            coral4 = cyan + coral;
                            i12 += coral4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i13 & i4) != 0) {
                            long j7 = unsafe.getLong(abstractC1483a, j5);
                            coral = C1494l.coral(i14);
                            cyan = C1494l.cyan(j7);
                            coral4 = cyan + coral;
                            i12 += coral4;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i13 & i4) != 0) {
                            int i17 = unsafe.getInt(abstractC1483a, j5);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.blue(i17);
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i13 & i4) != 0) {
                            beige = C1494l.beige(i14);
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if ((i13 & i4) != 0) {
                            beige = C1494l.azure(i14);
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i13 & i4) != 0) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 1, i12);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i13 & i4) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(abstractC1483a, j5);
                            if (object instanceof AbstractC1490h) {
                                zulu = C1494l.zulu(i14, (AbstractC1490h) object);
                                i12 = zulu + i12;
                                break;
                            } else {
                                coral3 = C1494l.coral(i14);
                                bronze = C1494l.bronze((String) object);
                                zulu = bronze + coral3;
                                i12 = zulu + i12;
                            }
                        }
                    case 9:
                        if ((i13 & i4) != 0) {
                            Object object2 = unsafe.getObject(abstractC1483a, j5);
                            A oscar2 = oscar(i11);
                            Class cls = B.alpha;
                            int coral5 = C1494l.coral(i14);
                            AbstractC1483a abstractC1483a2 = (AbstractC1483a) ((ao) object2);
                            abstractC1483a2.getClass();
                            x xVar = (x) abstractC1483a2;
                            int i18 = xVar.memoizedSerializedSize;
                            if (i18 == -1) {
                                i18 = oscar2.india(abstractC1483a2);
                                xVar.memoizedSerializedSize = i18;
                            }
                            i12 = com.google.android.material.datepicker.j.foxtrot(i18, i18, coral5, i12);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if ((i13 & i4) != 0) {
                            beige = C1494l.zulu(i14, (AbstractC1490h) unsafe.getObject(abstractC1483a, j5));
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if ((i13 & i4) != 0) {
                            int i19 = unsafe.getInt(abstractC1483a, j5);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.crimson(i19);
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if ((i13 & i4) != 0) {
                            int i20 = unsafe.getInt(abstractC1483a, j5);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.blue(i20);
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if ((i4 & i13) != 0) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 4, i12);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i13 & i4) != 0) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 8, i12);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if ((i13 & i4) != 0) {
                            int i21 = unsafe.getInt(abstractC1483a, j5);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.crimson((i21 >> 31) ^ (i21 << 1));
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if ((i13 & i4) != 0) {
                            long j10 = unsafe.getLong(abstractC1483a, j5);
                            coral = C1494l.coral(i14);
                            cyan = C1494l.cyan((j10 >> 63) ^ (j10 << 1));
                            coral4 = cyan + coral;
                            i12 += coral4;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i13 & i4) != 0) {
                            beige = C1494l.black(i14, (ao) unsafe.getObject(abstractC1483a, j5), oscar(i11));
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        beige = B.foxtrot(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 19:
                        beige = B.delta(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 20:
                        beige = B.juliet(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 21:
                        beige = B.tango(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 22:
                        beige = B.hotel(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 23:
                        beige = B.foxtrot(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 24:
                        beige = B.delta(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 25:
                        List list = (List) unsafe.getObject(abstractC1483a, j5);
                        Class cls2 = B.alpha;
                        int size = list.size();
                        if (size == 0) {
                            coral4 = 0;
                        } else {
                            coral4 = (C1494l.coral(i14) + 1) * size;
                        }
                        i12 += coral4;
                        break;
                    case 26:
                        beige = B.quebec(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 27:
                        beige = B.lima(i14, (List) unsafe.getObject(abstractC1483a, j5), oscar(i11));
                        i12 += beige;
                        break;
                    case 28:
                        beige = B.alpha(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 29:
                        beige = B.romeo(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 30:
                        beige = B.bravo(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 31:
                        beige = B.delta(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 32:
                        beige = B.foxtrot(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 33:
                        beige = B.mike(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 34:
                        beige = B.oscar(i14, (List) unsafe.getObject(abstractC1483a, j5));
                        i12 += beige;
                        break;
                    case 35:
                        int golf = B.golf((List) unsafe.getObject(abstractC1483a, j5));
                        if (golf > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(golf, C1494l.coral(i14), golf, i12);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int echo = B.echo((List) unsafe.getObject(abstractC1483a, j5));
                        if (echo > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(echo, C1494l.coral(i14), echo, i12);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int kilo = B.kilo((List) unsafe.getObject(abstractC1483a, j5));
                        if (kilo > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(kilo, C1494l.coral(i14), kilo, i12);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int uniform = B.uniform((List) unsafe.getObject(abstractC1483a, j5));
                        if (uniform > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(uniform, C1494l.coral(i14), uniform, i12);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int india = B.india((List) unsafe.getObject(abstractC1483a, j5));
                        if (india > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(india, C1494l.coral(i14), india, i12);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int golf2 = B.golf((List) unsafe.getObject(abstractC1483a, j5));
                        if (golf2 > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(golf2, C1494l.coral(i14), golf2, i12);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int echo2 = B.echo((List) unsafe.getObject(abstractC1483a, j5));
                        if (echo2 > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(echo2, C1494l.coral(i14), echo2, i12);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list2 = (List) unsafe.getObject(abstractC1483a, j5);
                        Class cls3 = B.alpha;
                        int size2 = list2.size();
                        if (size2 > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(size2, C1494l.coral(i14), size2, i12);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int sierra = B.sierra((List) unsafe.getObject(abstractC1483a, j5));
                        if (sierra > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(sierra, C1494l.coral(i14), sierra, i12);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int charlie = B.charlie((List) unsafe.getObject(abstractC1483a, j5));
                        if (charlie > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(charlie, C1494l.coral(i14), charlie, i12);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int echo3 = B.echo((List) unsafe.getObject(abstractC1483a, j5));
                        if (echo3 > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(echo3, C1494l.coral(i14), echo3, i12);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int golf3 = B.golf((List) unsafe.getObject(abstractC1483a, j5));
                        if (golf3 > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(golf3, C1494l.coral(i14), golf3, i12);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int november = B.november((List) unsafe.getObject(abstractC1483a, j5));
                        if (november > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(november, C1494l.coral(i14), november, i12);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int papa2 = B.papa((List) unsafe.getObject(abstractC1483a, j5));
                        if (papa2 > 0) {
                            i12 = com.google.android.material.datepicker.j.foxtrot(papa2, C1494l.coral(i14), papa2, i12);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list3 = (List) unsafe.getObject(abstractC1483a, j5);
                        A oscar3 = oscar(i11);
                        Class cls4 = B.alpha;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i22 = 0; i22 < size3; i22++) {
                                i5 += C1494l.black(i14, (ao) list3.get(i22), oscar3);
                            }
                        }
                        i12 += i5;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(abstractC1483a, j5);
                        Object november2 = november(i11);
                        this.november.getClass();
                        al.alpha(object3, november2);
                        break;
                    case 51:
                        if (sierra(i14, i11, abstractC1483a)) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 8, i12);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (sierra(i14, i11, abstractC1483a)) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 4, i12);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (sierra(i14, i11, abstractC1483a)) {
                            long beige2 = beige(j5, abstractC1483a);
                            coral = C1494l.coral(i14);
                            cyan = C1494l.cyan(beige2);
                            coral4 = cyan + coral;
                            i12 += coral4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (sierra(i14, i11, abstractC1483a)) {
                            long beige3 = beige(j5, abstractC1483a);
                            coral = C1494l.coral(i14);
                            cyan = C1494l.cyan(beige3);
                            coral4 = cyan + coral;
                            i12 += coral4;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (sierra(i14, i11, abstractC1483a)) {
                            int azure = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.blue(azure);
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (sierra(i14, i11, abstractC1483a)) {
                            beige = C1494l.beige(i14);
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (sierra(i14, i11, abstractC1483a)) {
                            beige = C1494l.azure(i14);
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (sierra(i14, i11, abstractC1483a)) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 1, i12);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!sierra(i14, i11, abstractC1483a)) {
                            break;
                        } else {
                            Object object4 = unsafe.getObject(abstractC1483a, j5);
                            if (object4 instanceof AbstractC1490h) {
                                zulu = C1494l.zulu(i14, (AbstractC1490h) object4);
                                i12 = zulu + i12;
                                break;
                            } else {
                                coral3 = C1494l.coral(i14);
                                bronze = C1494l.bronze((String) object4);
                                zulu = bronze + coral3;
                                i12 = zulu + i12;
                            }
                        }
                    case 60:
                        if (sierra(i14, i11, abstractC1483a)) {
                            Object object5 = unsafe.getObject(abstractC1483a, j5);
                            A oscar4 = oscar(i11);
                            Class cls5 = B.alpha;
                            int coral6 = C1494l.coral(i14);
                            AbstractC1483a abstractC1483a3 = (AbstractC1483a) ((ao) object5);
                            abstractC1483a3.getClass();
                            x xVar2 = (x) abstractC1483a3;
                            int i23 = xVar2.memoizedSerializedSize;
                            if (i23 == -1) {
                                i23 = oscar4.india(abstractC1483a3);
                                xVar2.memoizedSerializedSize = i23;
                            }
                            i12 = com.google.android.material.datepicker.j.foxtrot(i23, i23, coral6, i12);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (sierra(i14, i11, abstractC1483a)) {
                            beige = C1494l.zulu(i14, (AbstractC1490h) unsafe.getObject(abstractC1483a, j5));
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (sierra(i14, i11, abstractC1483a)) {
                            int azure2 = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.crimson(azure2);
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (sierra(i14, i11, abstractC1483a)) {
                            int azure3 = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.blue(azure3);
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (sierra(i14, i11, abstractC1483a)) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 4, i12);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (sierra(i14, i11, abstractC1483a)) {
                            i12 = com.google.android.material.datepicker.j.echo(i14, 8, i12);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (sierra(i14, i11, abstractC1483a)) {
                            int azure4 = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i14);
                            blue = C1494l.crimson((azure4 >> 31) ^ (azure4 << 1));
                            beige = blue + coral2;
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (sierra(i14, i11, abstractC1483a)) {
                            long beige4 = beige(j5, abstractC1483a);
                            coral = C1494l.coral(i14);
                            cyan = C1494l.cyan((beige4 >> 63) ^ (beige4 << 1));
                            coral4 = cyan + coral;
                            i12 += coral4;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (sierra(i14, i11, abstractC1483a)) {
                            beige = C1494l.black(i14, (ao) unsafe.getObject(abstractC1483a, j5), oscar(i11));
                            i12 += beige;
                            break;
                        } else {
                            break;
                        }
                }
                i11 += 3;
            } else {
                ((E) this.mike).getClass();
                return ((x) abstractC1483a).unknownFields.alpha() + i12;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0030. Please report as an issue. */
    public final int quebec(AbstractC1483a abstractC1483a) {
        int coral;
        int cyan;
        int coral2;
        int blue;
        int beige;
        int coral3;
        int bronze;
        int zulu;
        int coral4;
        int cyan2;
        int coral5;
        int i4;
        Unsafe unsafe = papa;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.alpha;
            if (i5 < iArr.length) {
                int lavender = lavender(i5);
                int jade = jade(lavender);
                int i11 = iArr[i5];
                long j5 = lavender & 1048575;
                if (jade >= s.purple.alpha && jade <= s.red.alpha) {
                    int i12 = iArr[i5 + 2];
                }
                switch (jade) {
                    case 0:
                        if (romeo(i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (romeo(i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (romeo(i5, abstractC1483a)) {
                            long hotel = M.delta.hotel(j5, abstractC1483a);
                            coral = C1494l.coral(i11);
                            cyan = C1494l.cyan(hotel);
                            beige = cyan + coral;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (romeo(i5, abstractC1483a)) {
                            long hotel2 = M.delta.hotel(j5, abstractC1483a);
                            coral = C1494l.coral(i11);
                            cyan = C1494l.cyan(hotel2);
                            beige = cyan + coral;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (romeo(i5, abstractC1483a)) {
                            int golf = M.delta.golf(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.blue(golf);
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (romeo(i5, abstractC1483a)) {
                            beige = C1494l.beige(i11);
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (romeo(i5, abstractC1483a)) {
                            beige = C1494l.azure(i11);
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (romeo(i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!romeo(i5, abstractC1483a)) {
                            break;
                        } else {
                            Object india = M.delta.india(j5, abstractC1483a);
                            if (india instanceof AbstractC1490h) {
                                zulu = C1494l.zulu(i11, (AbstractC1490h) india);
                                i10 = zulu + i10;
                                break;
                            } else {
                                coral3 = C1494l.coral(i11);
                                bronze = C1494l.bronze((String) india);
                                zulu = bronze + coral3;
                                i10 = zulu + i10;
                            }
                        }
                    case 9:
                        if (romeo(i5, abstractC1483a)) {
                            Object india2 = M.delta.india(j5, abstractC1483a);
                            A oscar2 = oscar(i5);
                            Class cls = B.alpha;
                            int coral6 = C1494l.coral(i11);
                            AbstractC1483a abstractC1483a2 = (AbstractC1483a) ((ao) india2);
                            abstractC1483a2.getClass();
                            x xVar = (x) abstractC1483a2;
                            int i13 = xVar.memoizedSerializedSize;
                            if (i13 == -1) {
                                i13 = oscar2.india(abstractC1483a2);
                                xVar.memoizedSerializedSize = i13;
                            }
                            i10 = com.google.android.material.datepicker.j.foxtrot(i13, i13, coral6, i10);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (romeo(i5, abstractC1483a)) {
                            beige = C1494l.zulu(i11, (AbstractC1490h) M.delta.india(j5, abstractC1483a));
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (romeo(i5, abstractC1483a)) {
                            int golf2 = M.delta.golf(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.crimson(golf2);
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (romeo(i5, abstractC1483a)) {
                            int golf3 = M.delta.golf(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.blue(golf3);
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (romeo(i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (romeo(i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (romeo(i5, abstractC1483a)) {
                            int golf4 = M.delta.golf(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.crimson((golf4 >> 31) ^ (golf4 << 1));
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (romeo(i5, abstractC1483a)) {
                            long hotel3 = M.delta.hotel(j5, abstractC1483a);
                            coral4 = C1494l.coral(i11);
                            cyan2 = C1494l.cyan((hotel3 << 1) ^ (hotel3 >> 63));
                            coral5 = cyan2 + coral4;
                            i10 += coral5;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (romeo(i5, abstractC1483a)) {
                            beige = C1494l.black(i11, (ao) M.delta.india(j5, abstractC1483a), oscar(i5));
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        beige = B.foxtrot(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 19:
                        beige = B.delta(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 20:
                        beige = B.juliet(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 21:
                        beige = B.tango(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 22:
                        beige = B.hotel(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 23:
                        beige = B.foxtrot(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 24:
                        beige = B.delta(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 25:
                        List tango = tango(abstractC1483a, j5);
                        Class cls2 = B.alpha;
                        int size = tango.size();
                        if (size == 0) {
                            coral5 = 0;
                        } else {
                            coral5 = (C1494l.coral(i11) + 1) * size;
                        }
                        i10 += coral5;
                        break;
                    case 26:
                        beige = B.quebec(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 27:
                        beige = B.lima(i11, tango(abstractC1483a, j5), oscar(i5));
                        i10 += beige;
                        break;
                    case 28:
                        beige = B.alpha(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 29:
                        beige = B.romeo(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 30:
                        beige = B.bravo(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 31:
                        beige = B.delta(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 32:
                        beige = B.foxtrot(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 33:
                        beige = B.mike(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 34:
                        beige = B.oscar(i11, tango(abstractC1483a, j5));
                        i10 += beige;
                        break;
                    case 35:
                        int golf5 = B.golf((List) unsafe.getObject(abstractC1483a, j5));
                        if (golf5 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(golf5, C1494l.coral(i11), golf5, i10);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int echo = B.echo((List) unsafe.getObject(abstractC1483a, j5));
                        if (echo > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(echo, C1494l.coral(i11), echo, i10);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int kilo = B.kilo((List) unsafe.getObject(abstractC1483a, j5));
                        if (kilo > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(kilo, C1494l.coral(i11), kilo, i10);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int uniform = B.uniform((List) unsafe.getObject(abstractC1483a, j5));
                        if (uniform > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(uniform, C1494l.coral(i11), uniform, i10);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int india3 = B.india((List) unsafe.getObject(abstractC1483a, j5));
                        if (india3 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(india3, C1494l.coral(i11), india3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int golf6 = B.golf((List) unsafe.getObject(abstractC1483a, j5));
                        if (golf6 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(golf6, C1494l.coral(i11), golf6, i10);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int echo2 = B.echo((List) unsafe.getObject(abstractC1483a, j5));
                        if (echo2 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(echo2, C1494l.coral(i11), echo2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(abstractC1483a, j5);
                        Class cls3 = B.alpha;
                        int size2 = list.size();
                        if (size2 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(size2, C1494l.coral(i11), size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int sierra = B.sierra((List) unsafe.getObject(abstractC1483a, j5));
                        if (sierra > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(sierra, C1494l.coral(i11), sierra, i10);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int charlie = B.charlie((List) unsafe.getObject(abstractC1483a, j5));
                        if (charlie > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(charlie, C1494l.coral(i11), charlie, i10);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int echo3 = B.echo((List) unsafe.getObject(abstractC1483a, j5));
                        if (echo3 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(echo3, C1494l.coral(i11), echo3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int golf7 = B.golf((List) unsafe.getObject(abstractC1483a, j5));
                        if (golf7 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(golf7, C1494l.coral(i11), golf7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int november = B.november((List) unsafe.getObject(abstractC1483a, j5));
                        if (november > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(november, C1494l.coral(i11), november, i10);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int papa2 = B.papa((List) unsafe.getObject(abstractC1483a, j5));
                        if (papa2 > 0) {
                            i10 = com.google.android.material.datepicker.j.foxtrot(papa2, C1494l.coral(i11), papa2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List tango2 = tango(abstractC1483a, j5);
                        A oscar3 = oscar(i5);
                        Class cls4 = B.alpha;
                        int size3 = tango2.size();
                        if (size3 == 0) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                            for (int i14 = 0; i14 < size3; i14++) {
                                i4 += C1494l.black(i11, (ao) tango2.get(i14), oscar3);
                            }
                        }
                        i10 += i4;
                        break;
                    case 50:
                        Object india4 = M.delta.india(j5, abstractC1483a);
                        Object november2 = november(i5);
                        this.november.getClass();
                        al.alpha(india4, november2);
                        break;
                    case 51:
                        if (sierra(i11, i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (sierra(i11, i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (sierra(i11, i5, abstractC1483a)) {
                            long beige2 = beige(j5, abstractC1483a);
                            coral = C1494l.coral(i11);
                            cyan = C1494l.cyan(beige2);
                            beige = cyan + coral;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (sierra(i11, i5, abstractC1483a)) {
                            long beige3 = beige(j5, abstractC1483a);
                            coral = C1494l.coral(i11);
                            cyan = C1494l.cyan(beige3);
                            beige = cyan + coral;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (sierra(i11, i5, abstractC1483a)) {
                            int azure = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.blue(azure);
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (sierra(i11, i5, abstractC1483a)) {
                            beige = C1494l.beige(i11);
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (sierra(i11, i5, abstractC1483a)) {
                            beige = C1494l.azure(i11);
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (sierra(i11, i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!sierra(i11, i5, abstractC1483a)) {
                            break;
                        } else {
                            Object india5 = M.delta.india(j5, abstractC1483a);
                            if (india5 instanceof AbstractC1490h) {
                                zulu = C1494l.zulu(i11, (AbstractC1490h) india5);
                                i10 = zulu + i10;
                                break;
                            } else {
                                coral3 = C1494l.coral(i11);
                                bronze = C1494l.bronze((String) india5);
                                zulu = bronze + coral3;
                                i10 = zulu + i10;
                            }
                        }
                    case 60:
                        if (sierra(i11, i5, abstractC1483a)) {
                            Object india6 = M.delta.india(j5, abstractC1483a);
                            A oscar4 = oscar(i5);
                            Class cls5 = B.alpha;
                            int coral7 = C1494l.coral(i11);
                            AbstractC1483a abstractC1483a3 = (AbstractC1483a) ((ao) india6);
                            abstractC1483a3.getClass();
                            x xVar2 = (x) abstractC1483a3;
                            int i15 = xVar2.memoizedSerializedSize;
                            if (i15 == -1) {
                                i15 = oscar4.india(abstractC1483a3);
                                xVar2.memoizedSerializedSize = i15;
                            }
                            i10 = com.google.android.material.datepicker.j.foxtrot(i15, i15, coral7, i10);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (sierra(i11, i5, abstractC1483a)) {
                            beige = C1494l.zulu(i11, (AbstractC1490h) M.delta.india(j5, abstractC1483a));
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (sierra(i11, i5, abstractC1483a)) {
                            int azure2 = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.crimson(azure2);
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (sierra(i11, i5, abstractC1483a)) {
                            int azure3 = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.blue(azure3);
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (sierra(i11, i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (sierra(i11, i5, abstractC1483a)) {
                            i10 = com.google.android.material.datepicker.j.echo(i11, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (sierra(i11, i5, abstractC1483a)) {
                            int azure4 = azure(j5, abstractC1483a);
                            coral2 = C1494l.coral(i11);
                            blue = C1494l.crimson((azure4 >> 31) ^ (azure4 << 1));
                            beige = blue + coral2;
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (sierra(i11, i5, abstractC1483a)) {
                            long beige4 = beige(j5, abstractC1483a);
                            coral4 = C1494l.coral(i11);
                            cyan2 = C1494l.cyan((beige4 << 1) ^ (beige4 >> 63));
                            coral5 = cyan2 + coral4;
                            i10 += coral5;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (sierra(i11, i5, abstractC1483a)) {
                            beige = C1494l.black(i11, (ao) M.delta.india(j5, abstractC1483a), oscar(i5));
                            i10 += beige;
                            break;
                        } else {
                            break;
                        }
                }
                i5 += 3;
            } else {
                ((E) this.mike).getClass();
                return ((x) abstractC1483a).unknownFields.alpha() + i10;
            }
        }
    }

    public final boolean romeo(int i4, Object obj) {
        if (this.golf) {
            int lavender = lavender(i4);
            long j5 = lavender & 1048575;
            switch (jade(lavender)) {
                case 0:
                    if (M.delta.echo(j5, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (M.delta.foxtrot(j5, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (M.delta.hotel(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (M.delta.hotel(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (M.delta.golf(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (M.delta.hotel(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (M.delta.golf(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return M.delta.charlie(j5, obj);
                case 8:
                    Object india = M.delta.india(j5, obj);
                    if (india instanceof String) {
                        return !((String) india).isEmpty();
                    }
                    if (india instanceof AbstractC1490h) {
                        return !AbstractC1490h.purple.equals(india);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (M.delta.india(j5, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC1490h.purple.equals(M.delta.india(j5, obj));
                case 11:
                    if (M.delta.golf(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (M.delta.golf(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (M.delta.golf(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (M.delta.hotel(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (M.delta.golf(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (M.delta.hotel(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (M.delta.india(j5, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((M.delta.golf(r6 & 1048575, obj) & (1 << (this.alpha[i4 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean sierra(int i4, int i5, Object obj) {
        if (M.delta.golf(this.alpha[i5 + 2] & 1048575, obj) == i4) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void uniform(com.google.crypto.tink.shaded.protobuf.C r21, java.lang.Object r22, com.google.crypto.tink.shaded.protobuf.az r23, com.google.crypto.tink.shaded.protobuf.p r24) {
        /*
            Method dump skipped, instructions count: 2032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.aq.uniform(com.google.crypto.tink.shaded.protobuf.C, java.lang.Object, com.google.crypto.tink.shaded.protobuf.az, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    public final void victor(int i4, Object obj, Object obj2) {
        long lavender = lavender(i4) & 1048575;
        Object india = M.delta.india(lavender, obj);
        al alVar = this.november;
        if (india != null) {
            alVar.getClass();
            if (!((ak) india).alpha) {
                ak charlie = ak.purple.charlie();
                al.bravo(charlie, india);
                M.oscar(obj, lavender, charlie);
                india = charlie;
            }
        } else {
            alVar.getClass();
            india = ak.purple.charlie();
            M.oscar(obj, lavender, india);
        }
        alVar.getClass();
        ao.ad.cyan(obj2);
        throw null;
    }

    public final void whiskey(x xVar, x xVar2, int i4) {
        long lavender = lavender(i4) & 1048575;
        if (romeo(i4, xVar2)) {
            L l10 = M.delta;
            Object india = l10.india(lavender, xVar);
            Object india2 = l10.india(lavender, xVar2);
            if (india != null && india2 != null) {
                M.oscar(xVar, lavender, ab.charlie(india, india2));
                green(i4, xVar);
            } else if (india2 != null) {
                M.oscar(xVar, lavender, india2);
                green(i4, xVar);
            }
        }
    }

    public final void xray(x xVar, x xVar2, int i4) {
        int lavender = lavender(i4);
        int i5 = this.alpha[i4];
        long j5 = lavender & 1048575;
        if (sierra(i5, i4, xVar2)) {
            L l10 = M.delta;
            Object india = l10.india(j5, xVar);
            Object india2 = l10.india(j5, xVar2);
            if (india != null && india2 != null) {
                M.oscar(xVar, j5, ab.charlie(india, india2));
                indigo(i5, i4, xVar);
            } else if (india2 != null) {
                M.oscar(xVar, j5, india2);
                indigo(i5, i4, xVar);
            }
        }
    }
}
