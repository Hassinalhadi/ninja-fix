package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class Q1 implements X1 {
    public static final int[] juliet = new int[0];
    public static final Unsafe kilo = AbstractC1311e2.hotel();
    public final int[] alpha;
    public final Object[] bravo;
    public final int charlie;
    public final int delta;
    public final O1 echo;
    public final int[] foxtrot;
    public final int golf;
    public final int hotel;
    public final C1384v1 india;

    public Q1(int[] iArr, Object[] objArr, int i4, int i5, O1 o12, int[] iArr2, int i10, int i11, C1384v1 c1384v1, C1384v1 c1384v12) {
        this.alpha = iArr;
        this.bravo = objArr;
        this.charlie = i4;
        this.delta = i5;
        this.foxtrot = iArr2;
        this.golf = i10;
        this.hotel = i11;
        this.india = c1384v1;
        this.echo = o12;
    }

    public static Field blue(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder india = av.q.india("Field ", str, " for ", name, " not found. Known fields are ");
            india.append(arrays);
            throw new RuntimeException(india.toString());
        }
    }

    public static boolean romeo(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1392x1) {
            return ((AbstractC1392x1) obj).lima();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Q1 uniform(W1 w12, C1384v1 c1384v1, C1384v1 c1384v12) {
        int i4;
        int charAt;
        int i5;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt2;
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
        int i24;
        int i25;
        Object[] objArr;
        int i26;
        int i27;
        int i28;
        int objectFieldOffset;
        int i29;
        String str;
        char c3;
        int i30;
        int i31;
        int i32;
        int i33;
        Field blue;
        int i34;
        char charAt10;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        Object obj;
        Field blue2;
        Object obj2;
        Field blue3;
        int i44;
        char charAt11;
        int i45;
        int i46;
        char charAt12;
        int i47;
        char charAt13;
        int i48;
        char charAt14;
        if (w12 instanceof W1) {
            String str2 = w12.bravo;
            int length = str2.length();
            char c4 = 55296;
            if (str2.charAt(0) >= 55296) {
                int i49 = 1;
                while (true) {
                    i4 = i49 + 1;
                    if (str2.charAt(i49) < 55296) {
                        break;
                    }
                    i49 = i4;
                }
            } else {
                i4 = 1;
            }
            int i50 = i4 + 1;
            int charAt15 = str2.charAt(i4);
            if (charAt15 >= 55296) {
                int i51 = charAt15 & 8191;
                int i52 = 13;
                while (true) {
                    i48 = i50 + 1;
                    charAt14 = str2.charAt(i50);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i51 |= (charAt14 & 8191) << i52;
                    i52 += 13;
                    i50 = i48;
                }
                charAt15 = i51 | (charAt14 << i52);
                i50 = i48;
            }
            if (charAt15 == 0) {
                i11 = 0;
                i13 = 0;
                charAt = 0;
                i10 = 0;
                i12 = 0;
                i14 = 0;
                iArr = juliet;
                i5 = 0;
            } else {
                int i53 = i50 + 1;
                int charAt16 = str2.charAt(i50);
                if (charAt16 >= 55296) {
                    int i54 = charAt16 & 8191;
                    int i55 = 13;
                    while (true) {
                        i22 = i53 + 1;
                        charAt9 = str2.charAt(i53);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i54 |= (charAt9 & 8191) << i55;
                        i55 += 13;
                        i53 = i22;
                    }
                    charAt16 = i54 | (charAt9 << i55);
                    i53 = i22;
                }
                int i56 = i53 + 1;
                int charAt17 = str2.charAt(i53);
                if (charAt17 >= 55296) {
                    int i57 = charAt17 & 8191;
                    int i58 = 13;
                    while (true) {
                        i21 = i56 + 1;
                        charAt8 = str2.charAt(i56);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i57 |= (charAt8 & 8191) << i58;
                        i58 += 13;
                        i56 = i21;
                    }
                    charAt17 = i57 | (charAt8 << i58);
                    i56 = i21;
                }
                int i59 = i56 + 1;
                int charAt18 = str2.charAt(i56);
                if (charAt18 >= 55296) {
                    int i60 = charAt18 & 8191;
                    int i61 = 13;
                    while (true) {
                        i20 = i59 + 1;
                        charAt7 = str2.charAt(i59);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i60 |= (charAt7 & 8191) << i61;
                        i61 += 13;
                        i59 = i20;
                    }
                    charAt18 = i60 | (charAt7 << i61);
                    i59 = i20;
                }
                int i62 = i59 + 1;
                int charAt19 = str2.charAt(i59);
                if (charAt19 >= 55296) {
                    int i63 = charAt19 & 8191;
                    int i64 = 13;
                    while (true) {
                        i19 = i62 + 1;
                        charAt6 = str2.charAt(i62);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i63 |= (charAt6 & 8191) << i64;
                        i64 += 13;
                        i62 = i19;
                    }
                    charAt19 = i63 | (charAt6 << i64);
                    i62 = i19;
                }
                int i65 = i62 + 1;
                charAt = str2.charAt(i62);
                if (charAt >= 55296) {
                    int i66 = charAt & 8191;
                    int i67 = 13;
                    while (true) {
                        i18 = i65 + 1;
                        charAt5 = str2.charAt(i65);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i66 |= (charAt5 & 8191) << i67;
                        i67 += 13;
                        i65 = i18;
                    }
                    charAt = i66 | (charAt5 << i67);
                    i65 = i18;
                }
                int i68 = i65 + 1;
                int charAt20 = str2.charAt(i65);
                if (charAt20 >= 55296) {
                    int i69 = charAt20 & 8191;
                    int i70 = 13;
                    while (true) {
                        i17 = i68 + 1;
                        charAt4 = str2.charAt(i68);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i69 |= (charAt4 & 8191) << i70;
                        i70 += 13;
                        i68 = i17;
                    }
                    charAt20 = i69 | (charAt4 << i70);
                    i68 = i17;
                }
                int i71 = i68 + 1;
                int charAt21 = str2.charAt(i68);
                if (charAt21 >= 55296) {
                    int i72 = charAt21 & 8191;
                    int i73 = 13;
                    while (true) {
                        i16 = i71 + 1;
                        charAt3 = str2.charAt(i71);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i72 |= (charAt3 & 8191) << i73;
                        i73 += 13;
                        i71 = i16;
                    }
                    charAt21 = i72 | (charAt3 << i73);
                    i71 = i16;
                }
                int i74 = i71 + 1;
                int charAt22 = str2.charAt(i71);
                if (charAt22 >= 55296) {
                    int i75 = charAt22 & 8191;
                    int i76 = 13;
                    while (true) {
                        i15 = i74 + 1;
                        charAt2 = str2.charAt(i74);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i75 |= (charAt2 & 8191) << i76;
                        i76 += 13;
                        i74 = i15;
                    }
                    charAt22 = i75 | (charAt2 << i76);
                    i74 = i15;
                }
                int i77 = charAt16 + charAt16 + charAt17;
                i5 = charAt16;
                i50 = i74;
                iArr = new int[charAt22 + charAt20 + charAt21];
                int i78 = charAt20;
                i10 = charAt18;
                i11 = i78;
                i12 = charAt19;
                i13 = i77;
                i14 = charAt22;
            }
            Unsafe unsafe = kilo;
            Class<?> cls = w12.alpha.getClass();
            int i79 = i14 + i11;
            int i80 = charAt + charAt;
            int[] iArr2 = new int[charAt * 3];
            Object[] objArr2 = new Object[i80];
            int i81 = i79;
            int i82 = i14;
            int i83 = 0;
            int i84 = 0;
            while (i50 < length) {
                int i85 = i50 + 1;
                int charAt23 = str2.charAt(i50);
                if (charAt23 >= c4) {
                    int i86 = charAt23 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i47 = i87 + 1;
                        charAt13 = str2.charAt(i87);
                        if (charAt13 < c4) {
                            break;
                        }
                        i86 |= (charAt13 & 8191) << i88;
                        i88 += 13;
                        i87 = i47;
                    }
                    charAt23 = i86 | (charAt13 << i88);
                    i23 = i47;
                } else {
                    i23 = i85;
                }
                int i89 = i23 + 1;
                int charAt24 = str2.charAt(i23);
                if (charAt24 >= c4) {
                    int i90 = charAt24 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i46 = i91 + 1;
                        charAt12 = str2.charAt(i91);
                        i24 = length;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i90 |= (charAt12 & 8191) << i92;
                        i92 += 13;
                        i91 = i46;
                        length = i24;
                    }
                    charAt24 = i90 | (charAt12 << i92);
                    i25 = i46;
                } else {
                    i24 = length;
                    i25 = i89;
                }
                if ((charAt24 & Barcode.FORMAT_UPC_E) != 0) {
                    iArr[i83] = i84;
                    i83++;
                }
                int i93 = charAt24 & 255;
                int i94 = charAt23;
                int i95 = charAt24 & 2048;
                Object[] objArr3 = w12.charlie;
                if (i93 >= 51) {
                    int i96 = i25 + 1;
                    int charAt25 = str2.charAt(i25);
                    if (charAt25 >= 55296) {
                        int i97 = charAt25 & 8191;
                        int i98 = i96;
                        int i99 = 13;
                        while (true) {
                            i44 = i98 + 1;
                            charAt11 = str2.charAt(i98);
                            i45 = i97;
                            if (charAt11 < 55296) {
                                break;
                            }
                            i97 = i45 | ((charAt11 & 8191) << i99);
                            i99 += 13;
                            i98 = i44;
                        }
                        charAt25 = i45 | (charAt11 << i99);
                        i41 = i44;
                    } else {
                        i41 = i96;
                    }
                    int i100 = charAt25;
                    int i101 = i93 - 51;
                    int i102 = i41;
                    if (i101 != 9 && i101 != 17) {
                        if (i101 == 12) {
                            if (w12.alpha() != 1 && i95 == 0) {
                                i43 = 0;
                                int i103 = i100 + i100;
                                obj = objArr3[i103];
                                int i104 = i43;
                                if (obj instanceof Field) {
                                    blue2 = (Field) obj;
                                } else {
                                    blue2 = blue(cls, (String) obj);
                                    objArr3[i103] = blue2;
                                }
                                int i105 = i5;
                                objArr = objArr2;
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(blue2);
                                int i106 = i103 + 1;
                                obj2 = objArr3[i106];
                                if (obj2 instanceof Field) {
                                    blue3 = (Field) obj2;
                                } else {
                                    blue3 = blue(cls, (String) obj2);
                                    objArr3[i106] = blue3;
                                }
                                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(blue3);
                                i26 = i105;
                                i28 = i104;
                                str = str2;
                                i27 = i13;
                                i30 = i102;
                                i32 = 0;
                                c3 = 55296;
                                i29 = objectFieldOffset3;
                                i33 = objectFieldOffset2;
                            } else {
                                i42 = i13 + 1;
                                int i107 = i84 / 3;
                                objArr2[i107 + i107 + 1] = objArr3[i13];
                            }
                        }
                        i43 = i95;
                        int i1032 = i100 + i100;
                        obj = objArr3[i1032];
                        int i1042 = i43;
                        if (obj instanceof Field) {
                        }
                        int i1052 = i5;
                        objArr = objArr2;
                        int objectFieldOffset22 = (int) unsafe.objectFieldOffset(blue2);
                        int i1062 = i1032 + 1;
                        obj2 = objArr3[i1062];
                        if (obj2 instanceof Field) {
                        }
                        int objectFieldOffset32 = (int) unsafe.objectFieldOffset(blue3);
                        i26 = i1052;
                        i28 = i1042;
                        str = str2;
                        i27 = i13;
                        i30 = i102;
                        i32 = 0;
                        c3 = 55296;
                        i29 = objectFieldOffset32;
                        i33 = objectFieldOffset22;
                    } else {
                        i42 = i13 + 1;
                        int i108 = i84 / 3;
                        objArr2[i108 + i108 + 1] = objArr3[i13];
                    }
                    i13 = i42;
                    i43 = i95;
                    int i10322 = i100 + i100;
                    obj = objArr3[i10322];
                    int i10422 = i43;
                    if (obj instanceof Field) {
                    }
                    int i10522 = i5;
                    objArr = objArr2;
                    int objectFieldOffset222 = (int) unsafe.objectFieldOffset(blue2);
                    int i10622 = i10322 + 1;
                    obj2 = objArr3[i10622];
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset322 = (int) unsafe.objectFieldOffset(blue3);
                    i26 = i10522;
                    i28 = i10422;
                    str = str2;
                    i27 = i13;
                    i30 = i102;
                    i32 = 0;
                    c3 = 55296;
                    i29 = objectFieldOffset322;
                    i33 = objectFieldOffset222;
                } else {
                    int i109 = i5;
                    objArr = objArr2;
                    int i110 = i13 + 1;
                    Field blue4 = blue(cls, (String) objArr3[i13]);
                    i26 = i109;
                    if (i93 == 9 || i93 == 17) {
                        i27 = i110;
                        int i111 = i84 / 3;
                        objArr[i111 + i111 + 1] = blue4.getType();
                    } else {
                        if (i93 != 27) {
                            if (i93 == 49) {
                                i37 = i13 + 2;
                                i35 = i110;
                                i36 = 1;
                            } else {
                                if (i93 != 12 && i93 != 30 && i93 != 44) {
                                    if (i93 == 50) {
                                        int i112 = i13 + 2;
                                        int i113 = i82 + 1;
                                        iArr[i82] = i84;
                                        int i114 = i84 / 3;
                                        int i115 = i114 + i114;
                                        objArr[i115] = objArr3[i110];
                                        if (i95 != 0) {
                                            objArr[i115 + 1] = objArr3[i112];
                                            i28 = i95;
                                            i82 = i113;
                                            i27 = i13 + 3;
                                            objectFieldOffset = (int) unsafe.objectFieldOffset(blue4);
                                            i29 = 1048575;
                                            if ((charAt24 & 4096) == 0 && i93 <= 17) {
                                                i30 = i25 + 1;
                                                int charAt26 = str2.charAt(i25);
                                                if (charAt26 >= 55296) {
                                                    int i116 = charAt26 & 8191;
                                                    int i117 = 13;
                                                    while (true) {
                                                        i34 = i30 + 1;
                                                        charAt10 = str2.charAt(i30);
                                                        if (charAt10 < 55296) {
                                                            break;
                                                        }
                                                        i116 |= (charAt10 & 8191) << i117;
                                                        i117 += 13;
                                                        i30 = i34;
                                                    }
                                                    charAt26 = i116 | (charAt10 << i117);
                                                    i30 = i34;
                                                }
                                                int i118 = (charAt26 / 32) + i26 + i26;
                                                Object obj3 = objArr3[i118];
                                                str = str2;
                                                if (obj3 instanceof Field) {
                                                    blue = (Field) obj3;
                                                } else {
                                                    blue = blue(cls, (String) obj3);
                                                    objArr3[i118] = blue;
                                                }
                                                i31 = charAt26 % 32;
                                                i29 = (int) unsafe.objectFieldOffset(blue);
                                                c3 = 55296;
                                            } else {
                                                str = str2;
                                                c3 = 55296;
                                                i30 = i25;
                                                i31 = 0;
                                            }
                                            if (i93 >= 18 && i93 <= 49) {
                                                iArr[i81] = objectFieldOffset;
                                                i81++;
                                            }
                                            i32 = i31;
                                            i33 = objectFieldOffset;
                                        } else {
                                            i82 = i113;
                                            i27 = i112;
                                        }
                                    } else {
                                        i27 = i110;
                                    }
                                } else {
                                    i27 = i110;
                                    if (w12.alpha() == 1 || i95 != 0) {
                                        i37 = i13 + 2;
                                        int i119 = i84 / 3;
                                        objArr[i119 + i119 + 1] = objArr3[i27];
                                        i27 = i37;
                                    }
                                }
                                i28 = 0;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(blue4);
                                i29 = 1048575;
                                if ((charAt24 & 4096) == 0) {
                                }
                                str = str2;
                                c3 = 55296;
                                i30 = i25;
                                i31 = 0;
                                if (i93 >= 18) {
                                    iArr[i81] = objectFieldOffset;
                                    i81++;
                                }
                                i32 = i31;
                                i33 = objectFieldOffset;
                            }
                        } else {
                            i35 = i110;
                            i36 = 1;
                            i37 = i13 + 2;
                        }
                        int i120 = i84 / 3;
                        objArr[i120 + i120 + i36] = objArr3[i35];
                        i27 = i37;
                    }
                    i28 = i95;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(blue4);
                    i29 = 1048575;
                    if ((charAt24 & 4096) == 0) {
                    }
                    str = str2;
                    c3 = 55296;
                    i30 = i25;
                    i31 = 0;
                    if (i93 >= 18) {
                    }
                    i32 = i31;
                    i33 = objectFieldOffset;
                }
                int i121 = i84 + 1;
                iArr2[i84] = i94;
                int i122 = i84 + 2;
                int i123 = i32;
                if ((charAt24 & 512) != 0) {
                    i38 = 536870912;
                } else {
                    i38 = 0;
                }
                if ((charAt24 & Barcode.FORMAT_QR_CODE) != 0) {
                    i39 = 268435456;
                } else {
                    i39 = 0;
                }
                if (i28 != 0) {
                    i40 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    i40 = 0;
                }
                iArr2[i121] = i38 | i39 | i40 | (i93 << 20) | i33;
                i84 += 3;
                iArr2[i122] = (i123 << 20) | i29;
                i50 = i30;
                c4 = c3;
                length = i24;
                i5 = i26;
                i13 = i27;
                str2 = str;
                objArr2 = objArr;
            }
            return new Q1(iArr2, objArr2, i10, i12, w12.alpha, iArr, i14, i79, c1384v1, c1384v12);
        }
        w12.getClass();
        throw new ClassCastException();
    }

    public static int victor(long j5, Object obj) {
        return ((Integer) AbstractC1311e2.golf(j5, obj)).intValue();
    }

    public static int xray(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static long zulu(long j5, Object obj) {
        return ((Long) AbstractC1311e2.golf(j5, obj)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final AbstractC1392x1 alpha() {
        return (AbstractC1392x1) ((AbstractC1392x1) this.echo).mike(4);
    }

    public final A1 amber(int i4) {
        int i5 = i4 / 3;
        return (A1) this.bravo[i5 + i5 + 1];
    }

    public final X1 azure(int i4) {
        int i5 = i4 / 3;
        int i10 = i5 + i5;
        Object[] objArr = this.bravo;
        X1 x12 = (X1) objArr[i10];
        if (x12 != null) {
            return x12;
        }
        X1 alpha = U1.charlie.alpha((Class) objArr[i10 + 1]);
        objArr[i10] = alpha;
        return alpha;
    }

    public final Object beige(int i4, Object obj) {
        X1 azure = azure(i4);
        int yankee = yankee(i4) & 1048575;
        if (!papa(i4, obj)) {
            return azure.alpha();
        }
        Object object = kilo.getObject(obj, yankee);
        if (romeo(object)) {
            return object;
        }
        AbstractC1392x1 alpha = azure.alpha();
        if (object != null) {
            azure.delta(alpha, object);
        }
        return alpha;
    }

    public final Object black(int i4, int i5, Object obj) {
        X1 azure = azure(i5);
        if (!sierra(i4, i5, obj)) {
            return azure.alpha();
        }
        Object object = kilo.getObject(obj, yankee(i5) & 1048575);
        if (romeo(object)) {
            return object;
        }
        AbstractC1392x1 alpha = azure.alpha();
        if (object != null) {
            azure.delta(alpha, object);
        }
        return alpha;
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final void bravo(Object obj) {
        if (romeo(obj)) {
            if (obj instanceof AbstractC1392x1) {
                AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) obj;
                abstractC1392x1.kilo();
                abstractC1392x1.zza = 0;
                abstractC1392x1.india();
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.alpha;
                if (i4 < iArr.length) {
                    int yankee = yankee(i4);
                    int i5 = 1048575 & yankee;
                    int xray = xray(yankee);
                    long j5 = i5;
                    if (xray != 9) {
                        if (xray != 60 && xray != 68) {
                            switch (xray) {
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
                                    AbstractC1345l1 abstractC1345l1 = (AbstractC1345l1) ((D1) AbstractC1311e2.golf(j5, obj));
                                    if (!abstractC1345l1.alpha) {
                                        break;
                                    } else {
                                        abstractC1345l1.alpha = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = kilo;
                                    Object object = unsafe.getObject(obj, j5);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((L1) object).alpha = false;
                                        unsafe.putObject(obj, j5, object);
                                        break;
                                    }
                            }
                        } else if (sierra(iArr[i4], i4, obj)) {
                            azure(i4).bravo(kilo.getObject(obj, j5));
                        }
                        i4 += 3;
                    }
                    if (papa(i4, obj)) {
                        azure(i4).bravo(kilo.getObject(obj, j5));
                    }
                    i4 += 3;
                } else {
                    this.india.getClass();
                    Z1 z12 = ((AbstractC1392x1) obj).zzc;
                    if (z12.echo) {
                        z12.echo = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final boolean charlie(Object obj) {
        int i4;
        int i5;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.golf) {
            int i14 = this.foxtrot[i12];
            int[] iArr = this.alpha;
            int i15 = iArr[i14];
            int yankee = yankee(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i13) {
                if (i17 != 1048575) {
                    i11 = kilo.getInt(obj, i17);
                }
                i5 = i14;
                i10 = i11;
                i4 = i17;
            } else {
                int i19 = i11;
                i4 = i13;
                i5 = i14;
                i10 = i19;
            }
            if ((268435456 & yankee) == 0 || quebec(obj, i5, i4, i10, i18)) {
                int xray = xray(yankee);
                if (xray != 9 && xray != 17) {
                    if (xray != 27) {
                        if (xray != 60 && xray != 68) {
                            if (xray != 49) {
                                if (xray == 50 && !((L1) AbstractC1311e2.golf(yankee & 1048575, obj)).isEmpty()) {
                                    int i20 = i5 / 3;
                                    throw A0.z.hotel(this.bravo[i20 + i20]);
                                }
                            }
                        } else if (sierra(i15, i5, obj) && !azure(i5).charlie(AbstractC1311e2.golf(yankee & 1048575, obj))) {
                        }
                        i12++;
                        i13 = i4;
                        i11 = i10;
                    }
                    List list = (List) AbstractC1311e2.golf(yankee & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        X1 azure = azure(i5);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (azure.charlie(list.get(i21))) {
                            }
                        }
                    }
                    i12++;
                    i13 = i4;
                    i11 = i10;
                } else {
                    if (quebec(obj, i5, i4, i10, i18) && !azure(i5).charlie(AbstractC1311e2.golf(yankee & 1048575, obj))) {
                    }
                    i12++;
                    i13 = i4;
                    i11 = i10;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final void delta(Object obj, Object obj2) {
        Object obj3;
        if (romeo(obj)) {
            obj2.getClass();
            int i4 = 0;
            while (true) {
                int[] iArr = this.alpha;
                if (i4 < iArr.length) {
                    int yankee = yankee(i4);
                    int i5 = yankee & 1048575;
                    int xray = xray(yankee);
                    int i10 = iArr[i4];
                    long j5 = i5;
                    switch (xray) {
                        case 0:
                            if (papa(i4, obj2)) {
                                AbstractC1306d2 abstractC1306d2 = AbstractC1311e2.charlie;
                                obj3 = obj;
                                abstractC1306d2.echo(obj3, j5, abstractC1306d2.alpha(j5, obj2));
                                lima(i4, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (papa(i4, obj2)) {
                                AbstractC1306d2 abstractC1306d22 = AbstractC1311e2.charlie;
                                abstractC1306d22.foxtrot(obj, j5, abstractC1306d22.bravo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.juliet(obj, j5, AbstractC1311e2.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.juliet(obj, j5, AbstractC1311e2.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.india(j5, AbstractC1311e2.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.juliet(obj, j5, AbstractC1311e2.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.india(j5, AbstractC1311e2.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (papa(i4, obj2)) {
                                AbstractC1306d2 abstractC1306d23 = AbstractC1311e2.charlie;
                                abstractC1306d23.charlie(obj, j5, abstractC1306d23.golf(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.kilo(obj, j5, AbstractC1311e2.golf(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 9:
                            juliet(i4, obj, obj2);
                            break;
                        case 10:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.kilo(obj, j5, AbstractC1311e2.golf(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.india(j5, AbstractC1311e2.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.india(j5, AbstractC1311e2.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.india(j5, AbstractC1311e2.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.juliet(obj, j5, AbstractC1311e2.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.india(j5, AbstractC1311e2.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (papa(i4, obj2)) {
                                AbstractC1311e2.juliet(obj, j5, AbstractC1311e2.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 17:
                            juliet(i4, obj, obj2);
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
                            D1 d12 = (D1) AbstractC1311e2.golf(j5, obj);
                            D1 d13 = (D1) AbstractC1311e2.golf(j5, obj2);
                            int size = d12.size();
                            int size2 = d13.size();
                            if (size > 0 && size2 > 0) {
                                if (!((AbstractC1345l1) d12).alpha) {
                                    d12 = d12.foxtrot(size2 + size);
                                }
                                d12.addAll(d13);
                            }
                            if (size > 0) {
                                d13 = d12;
                            }
                            AbstractC1311e2.kilo(obj, j5, d13);
                            break;
                        case 50:
                            C1384v1 c1384v1 = Y1.alpha;
                            AbstractC1311e2.kilo(obj, j5, C1384v1.charlie(AbstractC1311e2.golf(j5, obj), AbstractC1311e2.golf(j5, obj2)));
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
                            if (sierra(i10, i4, obj2)) {
                                AbstractC1311e2.kilo(obj, j5, AbstractC1311e2.golf(j5, obj2));
                                AbstractC1311e2.india(iArr[i4 + 2] & 1048575, i10, obj);
                                break;
                            }
                            break;
                        case 60:
                            kilo(i4, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (sierra(i10, i4, obj2)) {
                                AbstractC1311e2.kilo(obj, j5, AbstractC1311e2.golf(j5, obj2));
                                AbstractC1311e2.india(iArr[i4 + 2] & 1048575, i10, obj);
                                break;
                            }
                            break;
                        case 68:
                            kilo(i4, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i4 += 3;
                    obj = obj3;
                } else {
                    Y1.papa(obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003f. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.X1
    public final void echo(Object obj, J1 j12) {
        int i4;
        int i5;
        boolean z2;
        Q1 q12 = this;
        Unsafe unsafe = kilo;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = q12.alpha;
            if (i12 < iArr.length) {
                int yankee = q12.yankee(i12);
                int xray = xray(yankee);
                int i14 = iArr[i12];
                if (xray <= 17) {
                    int i15 = iArr[i12 + 2];
                    int i16 = i15 & i10;
                    if (i16 != i11) {
                        if (i16 == i10) {
                            i13 = 0;
                        } else {
                            i13 = unsafe.getInt(obj, i16);
                        }
                        i11 = i16;
                    }
                    i4 = 1 << (i15 >>> 20);
                } else {
                    i4 = 0;
                }
                long j5 = yankee & i10;
                switch (xray) {
                    case 0:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).golf(i14, Double.doubleToRawLongBits(AbstractC1311e2.charlie.alpha(j5, obj)));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 1:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).echo(i14, Float.floatToRawIntBits(AbstractC1311e2.charlie.bravo(j5, obj)));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 2:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).oscar(i14, unsafe.getLong(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 3:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).oscar(i14, unsafe.getLong(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 4:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).india(i14, unsafe.getInt(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 5:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).golf(i14, unsafe.getLong(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 6:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).echo(i14, unsafe.getInt(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 7:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            byte golf = AbstractC1311e2.charlie.golf(j5, obj);
                            C1365q1 c1365q1 = (C1365q1) j12.alpha;
                            c1365q1.november(i14 << 3);
                            int i17 = c1365q1.golf;
                            try {
                                i5 = i17 + 1;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                            }
                            try {
                                c1365q1.echo[i17] = golf;
                                c1365q1.golf = i5;
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                i17 = i5;
                                throw new zzli(i17, c1365q1.foxtrot, 1, e);
                            }
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 8:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            Object object = unsafe.getObject(obj, j5);
                            if (object instanceof String) {
                                ((C1365q1) j12.alpha).kilo(i14, (String) object);
                            } else {
                                ((C1365q1) j12.alpha).delta(i14, (C1361p1) object);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 9:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            j12.echo(i14, unsafe.getObject(obj, j5), q12.azure(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 10:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).delta(i14, (C1361p1) unsafe.getObject(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 11:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).mike(i14, unsafe.getInt(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 12:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).india(i14, unsafe.getInt(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 13:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).echo(i14, unsafe.getInt(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 14:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            ((C1365q1) j12.alpha).golf(i14, unsafe.getLong(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 15:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            int i18 = unsafe.getInt(obj, j5);
                            ((C1365q1) j12.alpha).mike(i14, (i18 >> 31) ^ (i18 + i18));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 16:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            long j6 = unsafe.getLong(obj, j5);
                            ((C1365q1) j12.alpha).oscar(i14, (j6 + j6) ^ (j6 >> 63));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 17:
                        if (q12.quebec(obj, i12, i11, i13, i4)) {
                            j12.delta(i14, unsafe.getObject(obj, j5), q12.azure(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 18:
                        Y1.romeo(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 19:
                        Y1.victor(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 20:
                        Y1.xray(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 21:
                        Y1.delta(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 22:
                        Y1.whiskey(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 23:
                        Y1.uniform(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 24:
                        Y1.tango(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 25:
                        Y1.quebec(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 26:
                        int i19 = iArr[i12];
                        List list = (List) unsafe.getObject(obj, j5);
                        C1384v1 c1384v1 = Y1.alpha;
                        if (list != null && !list.isEmpty()) {
                            j12.getClass();
                            for (int i20 = 0; i20 < list.size(); i20++) {
                                ((C1365q1) j12.alpha).kilo(i19, (String) list.get(i20));
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                        break;
                    case 27:
                        int i21 = iArr[i12];
                        List list2 = (List) unsafe.getObject(obj, j5);
                        X1 azure = q12.azure(i12);
                        C1384v1 c1384v12 = Y1.alpha;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i22 = 0; i22 < list2.size(); i22++) {
                                j12.echo(i21, list2.get(i22), azure);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                        break;
                    case 28:
                        int i23 = iArr[i12];
                        List list3 = (List) unsafe.getObject(obj, j5);
                        C1384v1 c1384v13 = Y1.alpha;
                        if (list3 != null && !list3.isEmpty()) {
                            j12.getClass();
                            for (int i24 = 0; i24 < list3.size(); i24++) {
                                ((C1365q1) j12.alpha).delta(i23, (C1361p1) list3.get(i24));
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                        break;
                    case 29:
                        z2 = false;
                        Y1.charlie(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 30:
                        z2 = false;
                        Y1.sierra(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 31:
                        z2 = false;
                        Y1.yankee(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 32:
                        z2 = false;
                        Y1.zulu(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 33:
                        z2 = false;
                        Y1.alpha(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 34:
                        z2 = false;
                        Y1.bravo(iArr[i12], (List) unsafe.getObject(obj, j5), j12, false);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 35:
                        Y1.romeo(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 36:
                        Y1.victor(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 37:
                        Y1.xray(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 38:
                        Y1.delta(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 39:
                        Y1.whiskey(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 40:
                        Y1.uniform(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 41:
                        Y1.tango(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 42:
                        Y1.quebec(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 43:
                        Y1.charlie(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 44:
                        Y1.sierra(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 45:
                        Y1.yankee(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 46:
                        Y1.zulu(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 47:
                        Y1.alpha(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 48:
                        Y1.bravo(iArr[i12], (List) unsafe.getObject(obj, j5), j12, true);
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 49:
                        int i25 = iArr[i12];
                        List list4 = (List) unsafe.getObject(obj, j5);
                        X1 azure2 = q12.azure(i12);
                        C1384v1 c1384v14 = Y1.alpha;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i26 = 0; i26 < list4.size(); i26++) {
                                j12.delta(i25, list4.get(i26), azure2);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j5) != null) {
                            int i27 = i12 / 3;
                            throw A0.z.hotel(q12.bravo[i27 + i27]);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 51:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).golf(i14, Double.doubleToRawLongBits(((Double) AbstractC1311e2.golf(j5, obj)).doubleValue()));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 52:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).echo(i14, Float.floatToRawIntBits(((Float) AbstractC1311e2.golf(j5, obj)).floatValue()));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 53:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).oscar(i14, zulu(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 54:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).oscar(i14, zulu(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 55:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).india(i14, victor(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 56:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).golf(i14, zulu(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 57:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).echo(i14, victor(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 58:
                        if (q12.sierra(i14, i12, obj)) {
                            byte booleanValue = ((Boolean) AbstractC1311e2.golf(j5, obj)).booleanValue();
                            C1365q1 c1365q12 = (C1365q1) j12.alpha;
                            c1365q12.november(i14 << 3);
                            int i28 = c1365q12.golf;
                            try {
                                int i29 = i28 + 1;
                                try {
                                    c1365q12.echo[i28] = booleanValue;
                                    c1365q12.golf = i29;
                                } catch (IndexOutOfBoundsException e5) {
                                    e = e5;
                                    i28 = i29;
                                    throw new zzli(i28, c1365q12.foxtrot, 1, e);
                                }
                            } catch (IndexOutOfBoundsException e10) {
                                e = e10;
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 59:
                        if (q12.sierra(i14, i12, obj)) {
                            Object object2 = unsafe.getObject(obj, j5);
                            if (object2 instanceof String) {
                                ((C1365q1) j12.alpha).kilo(i14, (String) object2);
                            } else {
                                ((C1365q1) j12.alpha).delta(i14, (C1361p1) object2);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 60:
                        if (q12.sierra(i14, i12, obj)) {
                            j12.echo(i14, unsafe.getObject(obj, j5), q12.azure(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 61:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).delta(i14, (C1361p1) unsafe.getObject(obj, j5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 62:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).mike(i14, victor(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 63:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).india(i14, victor(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 64:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).echo(i14, victor(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 65:
                        if (q12.sierra(i14, i12, obj)) {
                            ((C1365q1) j12.alpha).golf(i14, zulu(j5, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 66:
                        if (q12.sierra(i14, i12, obj)) {
                            int victor = victor(j5, obj);
                            ((C1365q1) j12.alpha).mike(i14, (victor >> 31) ^ (victor + victor));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 67:
                        if (q12.sierra(i14, i12, obj)) {
                            long zulu = zulu(j5, obj);
                            ((C1365q1) j12.alpha).oscar(i14, (zulu + zulu) ^ (zulu >> 63));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    case 68:
                        if (q12.sierra(i14, i12, obj)) {
                            j12.delta(i14, unsafe.getObject(obj, j5), q12.azure(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                    default:
                        i12 += 3;
                        i10 = 1048575;
                        q12 = this;
                }
            } else {
                ((AbstractC1392x1) obj).zzc.delta(j12);
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.X1
    public final int foxtrot(AbstractC1392x1 abstractC1392x1) {
        int i4;
        int romeo;
        int bravo;
        int i5;
        int i10;
        int alpha;
        int romeo2;
        int size;
        int november;
        int romeo3;
        int romeo4;
        int romeo5;
        int i11;
        int romeo6;
        int bravo2;
        Q1 q12 = this;
        AbstractC1392x1 abstractC1392x12 = abstractC1392x1;
        Unsafe unsafe = kilo;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = q12.alpha;
            if (i13 < iArr.length) {
                int yankee = q12.yankee(i13);
                int xray = xray(yankee);
                int i16 = iArr[i13];
                int i17 = iArr[i13 + 2];
                int i18 = i17 & 1048575;
                if (xray <= 17) {
                    if (i18 != i12) {
                        if (i18 == 1048575) {
                            i14 = 0;
                        } else {
                            i14 = unsafe.getInt(abstractC1392x12, i18);
                        }
                        i12 = i18;
                    }
                    i4 = 1 << (i17 >>> 20);
                } else {
                    i4 = 0;
                }
                int i19 = yankee & 1048575;
                if (xray >= EnumC1376t1.purple.alpha) {
                    EnumC1376t1.red.getClass();
                }
                long j5 = i19;
                switch (xray) {
                    case 0:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 1:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(i16 << 3, 4, i15);
                        }
                        abstractC1392x12 = abstractC1392x1;
                        i13 += 3;
                        q12 = this;
                    case 2:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            long j6 = unsafe.getLong(abstractC1392x12, j5);
                            romeo = C1365q1.romeo(i16 << 3);
                            bravo = C1365q1.bravo(j6);
                            i5 = bravo + romeo;
                            i15 += i5;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 3:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            long j7 = unsafe.getLong(abstractC1392x12, j5);
                            romeo = C1365q1.romeo(i16 << 3);
                            bravo = C1365q1.bravo(j7);
                            i5 = bravo + romeo;
                            i15 += i5;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 4:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            long j10 = unsafe.getInt(abstractC1392x12, j5);
                            romeo = C1365q1.romeo(i16 << 3);
                            bravo = C1365q1.bravo(j10);
                            i5 = bravo + romeo;
                            i15 += i5;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 5:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(i16 << 3, 8, i15);
                        }
                        abstractC1392x12 = abstractC1392x1;
                        i13 += 3;
                        q12 = this;
                    case 6:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(i16 << 3, 4, i15);
                        }
                        abstractC1392x12 = abstractC1392x1;
                        i13 += 3;
                        q12 = this;
                    case 7:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(i16 << 3, 1, i15);
                        }
                        abstractC1392x12 = abstractC1392x1;
                        i13 += 3;
                        q12 = this;
                    case 8:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            int i20 = i16 << 3;
                            Object object = unsafe.getObject(abstractC1392x12, j5);
                            if (object instanceof C1361p1) {
                                int romeo7 = C1365q1.romeo(i20);
                                int delta = ((C1361p1) object).delta();
                                i15 = ao.ad.gold(delta, delta, romeo7, i15);
                            } else {
                                romeo = C1365q1.romeo(i20);
                                bravo = C1365q1.quebec((String) object);
                                i5 = bravo + romeo;
                                i15 += i5;
                            }
                        }
                        i13 += 3;
                        q12 = this;
                    case 9:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            Object object2 = unsafe.getObject(abstractC1392x12, j5);
                            X1 azure = q12.azure(i13);
                            C1384v1 c1384v1 = Y1.alpha;
                            int romeo8 = C1365q1.romeo(i16 << 3);
                            int alpha2 = ((AbstractC1340k1) ((O1) object2)).alpha(azure);
                            i15 = ao.ad.gold(alpha2, alpha2, romeo8, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 10:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            C1361p1 c1361p1 = (C1361p1) unsafe.getObject(abstractC1392x12, j5);
                            int romeo9 = C1365q1.romeo(i16 << 3);
                            int delta2 = c1361p1.delta();
                            i15 = ao.ad.gold(delta2, delta2, romeo9, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 11:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(unsafe.getInt(abstractC1392x12, j5), C1365q1.romeo(i16 << 3), i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 12:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            long j11 = unsafe.getInt(abstractC1392x12, j5);
                            romeo = C1365q1.romeo(i16 << 3);
                            bravo = C1365q1.bravo(j11);
                            i5 = bravo + romeo;
                            i15 += i5;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 13:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(i16 << 3, 4, i15);
                        }
                        abstractC1392x12 = abstractC1392x1;
                        i13 += 3;
                        q12 = this;
                    case 14:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            i15 = ao.ad.uniform(i16 << 3, 8, i15);
                        }
                        abstractC1392x12 = abstractC1392x1;
                        i13 += 3;
                        q12 = this;
                    case 15:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            int i21 = unsafe.getInt(abstractC1392x12, j5);
                            i15 = ao.ad.uniform((i21 >> 31) ^ (i21 + i21), C1365q1.romeo(i16 << 3), i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 16:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            long j12 = unsafe.getLong(abstractC1392x12, j5);
                            romeo = C1365q1.romeo(i16 << 3);
                            bravo = C1365q1.bravo((j12 >> 63) ^ (j12 + j12));
                            i5 = bravo + romeo;
                            i15 += i5;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 17:
                        if (q12.quebec(abstractC1392x12, i13, i12, i14, i4)) {
                            O1 o12 = (O1) unsafe.getObject(abstractC1392x12, j5);
                            X1 azure2 = q12.azure(i13);
                            int romeo10 = C1365q1.romeo(i16 << 3);
                            i10 = romeo10 + romeo10;
                            alpha = ((AbstractC1340k1) o12).alpha(azure2);
                            i5 = alpha + i10;
                            i15 += i5;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 18:
                        i5 = Y1.hotel(i16, (List) unsafe.getObject(abstractC1392x12, j5));
                        i15 += i5;
                        i13 += 3;
                        q12 = this;
                    case 19:
                        i5 = Y1.golf(i16, (List) unsafe.getObject(abstractC1392x12, j5));
                        i15 += i5;
                        i13 += 3;
                        q12 = this;
                    case 20:
                        List list = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v12 = Y1.alpha;
                        if (list.size() != 0) {
                            romeo2 = (C1365q1.romeo(i16 << 3) * list.size()) + Y1.juliet(list);
                            i15 += romeo2;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo2 = 0;
                        i15 += romeo2;
                        i13 += 3;
                        q12 = this;
                    case 21:
                        List list2 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v13 = Y1.alpha;
                        size = list2.size();
                        if (size != 0) {
                            november = Y1.november(list2);
                            romeo3 = C1365q1.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 22:
                        List list3 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v14 = Y1.alpha;
                        size = list3.size();
                        if (size != 0) {
                            november = Y1.india(list3);
                            romeo3 = C1365q1.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 23:
                        i5 = Y1.hotel(i16, (List) unsafe.getObject(abstractC1392x12, j5));
                        i15 += i5;
                        i13 += 3;
                        q12 = this;
                    case 24:
                        i5 = Y1.golf(i16, (List) unsafe.getObject(abstractC1392x12, j5));
                        i15 += i5;
                        i13 += 3;
                        q12 = this;
                    case 25:
                        List list4 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v15 = Y1.alpha;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            romeo2 = (C1365q1.romeo(i16 << 3) + 1) * size2;
                            i15 += romeo2;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo2 = 0;
                        i15 += romeo2;
                        i13 += 3;
                        q12 = this;
                    case 26:
                        List list5 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v16 = Y1.alpha;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            romeo4 = C1365q1.romeo(i16 << 3) * size3;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj = list5.get(i22);
                                if (obj instanceof C1361p1) {
                                    int delta3 = ((C1361p1) obj).delta();
                                    romeo4 = ao.ad.uniform(delta3, delta3, romeo4);
                                } else {
                                    romeo4 = C1365q1.quebec((String) obj) + romeo4;
                                }
                            }
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 27:
                        List list6 = (List) unsafe.getObject(abstractC1392x12, j5);
                        X1 azure3 = q12.azure(i13);
                        C1384v1 c1384v17 = Y1.alpha;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            romeo5 = 0;
                        } else {
                            romeo5 = C1365q1.romeo(i16 << 3) * size4;
                            for (int i23 = 0; i23 < size4; i23++) {
                                int alpha3 = ((AbstractC1340k1) ((O1) list6.get(i23))).alpha(azure3);
                                romeo5 = ao.ad.uniform(alpha3, alpha3, romeo5);
                            }
                        }
                        i15 += romeo5;
                        i13 += 3;
                        q12 = this;
                    case 28:
                        List list7 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v18 = Y1.alpha;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            romeo4 = C1365q1.romeo(i16 << 3) * size5;
                            for (int i24 = 0; i24 < list7.size(); i24++) {
                                int delta4 = ((C1361p1) list7.get(i24)).delta();
                                romeo4 = ao.ad.uniform(delta4, delta4, romeo4);
                            }
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 29:
                        List list8 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v19 = Y1.alpha;
                        size = list8.size();
                        if (size != 0) {
                            november = Y1.mike(list8);
                            romeo3 = C1365q1.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 30:
                        List list9 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v110 = Y1.alpha;
                        size = list9.size();
                        if (size != 0) {
                            november = Y1.foxtrot(list9);
                            romeo3 = C1365q1.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 31:
                        i5 = Y1.golf(i16, (List) unsafe.getObject(abstractC1392x12, j5));
                        i15 += i5;
                        i13 += 3;
                        q12 = this;
                    case 32:
                        i5 = Y1.hotel(i16, (List) unsafe.getObject(abstractC1392x12, j5));
                        i15 += i5;
                        i13 += 3;
                        q12 = this;
                    case 33:
                        List list10 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v111 = Y1.alpha;
                        size = list10.size();
                        if (size != 0) {
                            november = Y1.kilo(list10);
                            romeo3 = C1365q1.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 34:
                        List list11 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v112 = Y1.alpha;
                        size = list11.size();
                        if (size != 0) {
                            november = Y1.lima(list11);
                            romeo3 = C1365q1.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            q12 = this;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        q12 = this;
                    case 35:
                        List list12 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v113 = Y1.alpha;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i15 = ao.ad.gold(size6, C1365q1.romeo(i16 << 3), size6, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 36:
                        List list13 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v114 = Y1.alpha;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i15 = ao.ad.gold(size7, C1365q1.romeo(i16 << 3), size7, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 37:
                        int juliet2 = Y1.juliet((List) unsafe.getObject(abstractC1392x12, j5));
                        if (juliet2 > 0) {
                            i15 = ao.ad.gold(juliet2, C1365q1.romeo(i16 << 3), juliet2, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 38:
                        int november2 = Y1.november((List) unsafe.getObject(abstractC1392x12, j5));
                        if (november2 > 0) {
                            i15 = ao.ad.gold(november2, C1365q1.romeo(i16 << 3), november2, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 39:
                        int india = Y1.india((List) unsafe.getObject(abstractC1392x12, j5));
                        if (india > 0) {
                            i15 = ao.ad.gold(india, C1365q1.romeo(i16 << 3), india, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 40:
                        List list14 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v115 = Y1.alpha;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i15 = ao.ad.gold(size8, C1365q1.romeo(i16 << 3), size8, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 41:
                        List list15 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v116 = Y1.alpha;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i15 = ao.ad.gold(size9, C1365q1.romeo(i16 << 3), size9, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 42:
                        List list16 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v117 = Y1.alpha;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i15 = ao.ad.gold(size10, C1365q1.romeo(i16 << 3), size10, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 43:
                        int mike = Y1.mike((List) unsafe.getObject(abstractC1392x12, j5));
                        if (mike > 0) {
                            i15 = ao.ad.gold(mike, C1365q1.romeo(i16 << 3), mike, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 44:
                        int foxtrot = Y1.foxtrot((List) unsafe.getObject(abstractC1392x12, j5));
                        if (foxtrot > 0) {
                            i15 = ao.ad.gold(foxtrot, C1365q1.romeo(i16 << 3), foxtrot, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 45:
                        List list17 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v118 = Y1.alpha;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i15 = ao.ad.gold(size11, C1365q1.romeo(i16 << 3), size11, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 46:
                        List list18 = (List) unsafe.getObject(abstractC1392x12, j5);
                        C1384v1 c1384v119 = Y1.alpha;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i15 = ao.ad.gold(size12, C1365q1.romeo(i16 << 3), size12, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 47:
                        int kilo2 = Y1.kilo((List) unsafe.getObject(abstractC1392x12, j5));
                        if (kilo2 > 0) {
                            i15 = ao.ad.gold(kilo2, C1365q1.romeo(i16 << 3), kilo2, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 48:
                        int lima = Y1.lima((List) unsafe.getObject(abstractC1392x12, j5));
                        if (lima > 0) {
                            i15 = ao.ad.gold(lima, C1365q1.romeo(i16 << 3), lima, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 49:
                        List list19 = (List) unsafe.getObject(abstractC1392x12, j5);
                        X1 azure4 = q12.azure(i13);
                        C1384v1 c1384v120 = Y1.alpha;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            for (int i25 = 0; i25 < size13; i25++) {
                                O1 o13 = (O1) list19.get(i25);
                                int romeo11 = C1365q1.romeo(i16 << 3);
                                i11 += ((AbstractC1340k1) o13).alpha(azure4) + romeo11 + romeo11;
                            }
                        }
                        i15 += i11;
                        i13 += 3;
                        q12 = this;
                    case 50:
                        int i26 = i13 / 3;
                        L1 l12 = (L1) unsafe.getObject(abstractC1392x12, j5);
                        if (q12.bravo[i26 + i26] == null) {
                            if (l12.isEmpty()) {
                                continue;
                            } else {
                                Iterator it = l12.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getKey();
                                    entry.getValue();
                                    throw null;
                                }
                            }
                            i13 += 3;
                            q12 = this;
                        } else {
                            throw new ClassCastException();
                        }
                    case 51:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 52:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(i16 << 3, 4, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 53:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            long zulu = zulu(j5, abstractC1392x12);
                            romeo6 = C1365q1.romeo(i16 << 3);
                            bravo2 = C1365q1.bravo(zulu);
                            i15 += bravo2 + romeo6;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 54:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            long zulu2 = zulu(j5, abstractC1392x12);
                            romeo6 = C1365q1.romeo(i16 << 3);
                            bravo2 = C1365q1.bravo(zulu2);
                            i15 += bravo2 + romeo6;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 55:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            long victor = victor(j5, abstractC1392x12);
                            romeo6 = C1365q1.romeo(i16 << 3);
                            bravo2 = C1365q1.bravo(victor);
                            i15 += bravo2 + romeo6;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 56:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 57:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(i16 << 3, 4, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 58:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(i16 << 3, 1, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 59:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            int i27 = i16 << 3;
                            Object object3 = unsafe.getObject(abstractC1392x12, j5);
                            if (object3 instanceof C1361p1) {
                                int romeo12 = C1365q1.romeo(i27);
                                int delta5 = ((C1361p1) object3).delta();
                                i15 = ao.ad.gold(delta5, delta5, romeo12, i15);
                            } else {
                                romeo6 = C1365q1.romeo(i27);
                                bravo2 = C1365q1.quebec((String) object3);
                                i15 += bravo2 + romeo6;
                            }
                        }
                        i13 += 3;
                        q12 = this;
                    case 60:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            Object object4 = unsafe.getObject(abstractC1392x12, j5);
                            X1 azure5 = q12.azure(i13);
                            C1384v1 c1384v121 = Y1.alpha;
                            int romeo13 = C1365q1.romeo(i16 << 3);
                            int alpha4 = ((AbstractC1340k1) ((O1) object4)).alpha(azure5);
                            i15 = ao.ad.gold(alpha4, alpha4, romeo13, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 61:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            C1361p1 c1361p12 = (C1361p1) unsafe.getObject(abstractC1392x12, j5);
                            int romeo14 = C1365q1.romeo(i16 << 3);
                            int delta6 = c1361p12.delta();
                            i15 = ao.ad.gold(delta6, delta6, romeo14, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 62:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(victor(j5, abstractC1392x12), C1365q1.romeo(i16 << 3), i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 63:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            long victor2 = victor(j5, abstractC1392x12);
                            romeo6 = C1365q1.romeo(i16 << 3);
                            bravo2 = C1365q1.bravo(victor2);
                            i15 += bravo2 + romeo6;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 64:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(i16 << 3, 4, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 65:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            i15 = ao.ad.uniform(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 66:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            int victor3 = victor(j5, abstractC1392x12);
                            i15 = ao.ad.uniform((victor3 >> 31) ^ (victor3 + victor3), C1365q1.romeo(i16 << 3), i15);
                        }
                        i13 += 3;
                        q12 = this;
                    case 67:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            long zulu3 = zulu(j5, abstractC1392x12);
                            romeo6 = C1365q1.romeo(i16 << 3);
                            bravo2 = C1365q1.bravo((zulu3 >> 63) ^ (zulu3 + zulu3));
                            i15 += bravo2 + romeo6;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    case 68:
                        if (q12.sierra(i16, i13, abstractC1392x12)) {
                            O1 o14 = (O1) unsafe.getObject(abstractC1392x12, j5);
                            X1 azure6 = q12.azure(i13);
                            int romeo15 = C1365q1.romeo(i16 << 3);
                            i10 = romeo15 + romeo15;
                            alpha = ((AbstractC1340k1) o14).alpha(azure6);
                            i5 = alpha + i10;
                            i15 += i5;
                            i13 += 3;
                            q12 = this;
                        } else {
                            i13 += 3;
                            q12 = this;
                        }
                    default:
                        i13 += 3;
                        q12 = this;
                }
            } else {
                return abstractC1392x12.zzc.alpha() + i15;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.X1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int golf(AbstractC1392x1 abstractC1392x1) {
        int i4;
        long doubleToLongBits;
        int i5;
        int floatToIntBits;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.alpha;
            if (i12 < iArr.length) {
                int yankee = yankee(i12);
                int i14 = 1048575 & yankee;
                int xray = xray(yankee);
                int i15 = iArr[i12];
                long j5 = i14;
                int i16 = 1237;
                int i17 = 37;
                switch (xray) {
                    case 0:
                        i4 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(AbstractC1311e2.charlie.alpha(j5, abstractC1392x1));
                        Charset charset = E1.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i5 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(AbstractC1311e2.charlie.bravo(j5, abstractC1392x1));
                        i13 = floatToIntBits + i5;
                        break;
                    case 2:
                        i4 = i13 * 53;
                        doubleToLongBits = AbstractC1311e2.echo(j5, abstractC1392x1);
                        Charset charset2 = E1.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i4 = i13 * 53;
                        doubleToLongBits = AbstractC1311e2.echo(j5, abstractC1392x1);
                        Charset charset3 = E1.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.delta(j5, abstractC1392x1);
                        i13 = floatToIntBits + i5;
                        break;
                    case 5:
                        i4 = i13 * 53;
                        doubleToLongBits = AbstractC1311e2.echo(j5, abstractC1392x1);
                        Charset charset4 = E1.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.delta(j5, abstractC1392x1);
                        i13 = floatToIntBits + i5;
                        break;
                    case 7:
                        i10 = i13 * 53;
                        boolean golf = AbstractC1311e2.charlie.golf(j5, abstractC1392x1);
                        Charset charset5 = E1.alpha;
                        break;
                    case 8:
                        i5 = i13 * 53;
                        floatToIntBits = ((String) AbstractC1311e2.golf(j5, abstractC1392x1)).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 9:
                        i11 = i13 * 53;
                        Object golf2 = AbstractC1311e2.golf(j5, abstractC1392x1);
                        if (golf2 != null) {
                            i17 = golf2.hashCode();
                        }
                        i13 = i11 + i17;
                        break;
                    case 10:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.golf(j5, abstractC1392x1).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 11:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.delta(j5, abstractC1392x1);
                        i13 = floatToIntBits + i5;
                        break;
                    case 12:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.delta(j5, abstractC1392x1);
                        i13 = floatToIntBits + i5;
                        break;
                    case 13:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.delta(j5, abstractC1392x1);
                        i13 = floatToIntBits + i5;
                        break;
                    case 14:
                        i4 = i13 * 53;
                        doubleToLongBits = AbstractC1311e2.echo(j5, abstractC1392x1);
                        Charset charset6 = E1.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.delta(j5, abstractC1392x1);
                        i13 = floatToIntBits + i5;
                        break;
                    case 16:
                        i4 = i13 * 53;
                        doubleToLongBits = AbstractC1311e2.echo(j5, abstractC1392x1);
                        Charset charset7 = E1.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 17:
                        i11 = i13 * 53;
                        Object golf3 = AbstractC1311e2.golf(j5, abstractC1392x1);
                        if (golf3 != null) {
                            i17 = golf3.hashCode();
                        }
                        i13 = i11 + i17;
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
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.golf(j5, abstractC1392x1).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 50:
                        i5 = i13 * 53;
                        floatToIntBits = AbstractC1311e2.golf(j5, abstractC1392x1).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 51:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = Double.doubleToLongBits(((Double) AbstractC1311e2.golf(j5, abstractC1392x1)).doubleValue());
                            Charset charset8 = E1.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 52:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = Float.floatToIntBits(((Float) AbstractC1311e2.golf(j5, abstractC1392x1)).floatValue());
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 53:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = zulu(j5, abstractC1392x1);
                            Charset charset9 = E1.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 54:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = zulu(j5, abstractC1392x1);
                            Charset charset10 = E1.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 55:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = victor(j5, abstractC1392x1);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 56:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = zulu(j5, abstractC1392x1);
                            Charset charset11 = E1.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 57:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = victor(j5, abstractC1392x1);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 58:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i10 = i13 * 53;
                            boolean booleanValue = ((Boolean) AbstractC1311e2.golf(j5, abstractC1392x1)).booleanValue();
                            Charset charset12 = E1.alpha;
                            break;
                        }
                    case 59:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = ((String) AbstractC1311e2.golf(j5, abstractC1392x1)).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 60:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = AbstractC1311e2.golf(j5, abstractC1392x1).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 61:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = AbstractC1311e2.golf(j5, abstractC1392x1).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 62:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = victor(j5, abstractC1392x1);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 63:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = victor(j5, abstractC1392x1);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 64:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = victor(j5, abstractC1392x1);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 65:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = zulu(j5, abstractC1392x1);
                            Charset charset13 = E1.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 66:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = victor(j5, abstractC1392x1);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 67:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = zulu(j5, abstractC1392x1);
                            Charset charset14 = E1.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 68:
                        if (!sierra(i15, i12, abstractC1392x1)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = AbstractC1311e2.golf(j5, abstractC1392x1).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                }
                i12 += 3;
            } else {
                return abstractC1392x1.zzc.hashCode() + (i13 * 53);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.X1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hotel(AbstractC1392x1 abstractC1392x1, AbstractC1392x1 abstractC1392x12) {
        boolean echo;
        int i4 = 0;
        while (true) {
            int[] iArr = this.alpha;
            if (i4 < iArr.length) {
                int yankee = yankee(i4);
                long j5 = yankee & 1048575;
                switch (xray(yankee)) {
                    case 0:
                        if (!oscar(abstractC1392x1, abstractC1392x12, i4)) {
                            break;
                        } else {
                            AbstractC1306d2 abstractC1306d2 = AbstractC1311e2.charlie;
                            if (Double.doubleToLongBits(abstractC1306d2.alpha(j5, abstractC1392x1)) != Double.doubleToLongBits(abstractC1306d2.alpha(j5, abstractC1392x12))) {
                                break;
                            } else {
                                i4 += 3;
                            }
                        }
                    case 1:
                        if (!oscar(abstractC1392x1, abstractC1392x12, i4)) {
                            break;
                        } else {
                            AbstractC1306d2 abstractC1306d22 = AbstractC1311e2.charlie;
                            if (Float.floatToIntBits(abstractC1306d22.bravo(j5, abstractC1392x1)) != Float.floatToIntBits(abstractC1306d22.bravo(j5, abstractC1392x12))) {
                                break;
                            } else {
                                i4 += 3;
                            }
                        }
                    case 2:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.echo(j5, abstractC1392x1) == AbstractC1311e2.echo(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 3:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.echo(j5, abstractC1392x1) == AbstractC1311e2.echo(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 4:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.delta(j5, abstractC1392x1) == AbstractC1311e2.delta(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 5:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.echo(j5, abstractC1392x1) == AbstractC1311e2.echo(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 6:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.delta(j5, abstractC1392x1) == AbstractC1311e2.delta(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 7:
                        if (!oscar(abstractC1392x1, abstractC1392x12, i4)) {
                            break;
                        } else {
                            AbstractC1306d2 abstractC1306d23 = AbstractC1311e2.charlie;
                            if (abstractC1306d23.golf(j5, abstractC1392x1) != abstractC1306d23.golf(j5, abstractC1392x12)) {
                                break;
                            } else {
                                i4 += 3;
                            }
                        }
                    case 8:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && Y1.echo(AbstractC1311e2.golf(j5, abstractC1392x1), AbstractC1311e2.golf(j5, abstractC1392x12))) {
                            i4 += 3;
                        }
                        break;
                    case 9:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && Y1.echo(AbstractC1311e2.golf(j5, abstractC1392x1), AbstractC1311e2.golf(j5, abstractC1392x12))) {
                            i4 += 3;
                        }
                        break;
                    case 10:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && Y1.echo(AbstractC1311e2.golf(j5, abstractC1392x1), AbstractC1311e2.golf(j5, abstractC1392x12))) {
                            i4 += 3;
                        }
                        break;
                    case 11:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.delta(j5, abstractC1392x1) == AbstractC1311e2.delta(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 12:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.delta(j5, abstractC1392x1) == AbstractC1311e2.delta(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 13:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.delta(j5, abstractC1392x1) == AbstractC1311e2.delta(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 14:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.echo(j5, abstractC1392x1) == AbstractC1311e2.echo(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 15:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.delta(j5, abstractC1392x1) == AbstractC1311e2.delta(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 16:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && AbstractC1311e2.echo(j5, abstractC1392x1) == AbstractC1311e2.echo(j5, abstractC1392x12)) {
                            i4 += 3;
                        }
                        break;
                    case 17:
                        if (oscar(abstractC1392x1, abstractC1392x12, i4) && Y1.echo(AbstractC1311e2.golf(j5, abstractC1392x1), AbstractC1311e2.golf(j5, abstractC1392x12))) {
                            i4 += 3;
                        }
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
                        echo = Y1.echo(AbstractC1311e2.golf(j5, abstractC1392x1), AbstractC1311e2.golf(j5, abstractC1392x12));
                        if (echo) {
                            break;
                        } else {
                            i4 += 3;
                        }
                    case 50:
                        echo = Y1.echo(AbstractC1311e2.golf(j5, abstractC1392x1), AbstractC1311e2.golf(j5, abstractC1392x12));
                        if (echo) {
                        }
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
                        if (AbstractC1311e2.delta(j6, abstractC1392x1) == AbstractC1311e2.delta(j6, abstractC1392x12) && Y1.echo(AbstractC1311e2.golf(j5, abstractC1392x1), AbstractC1311e2.golf(j5, abstractC1392x12))) {
                            i4 += 3;
                        }
                        break;
                    default:
                        i4 += 3;
                }
            } else if (abstractC1392x1.zzc.equals(abstractC1392x12.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final void india(Object obj, byte[] bArr, int i4, int i5, androidx.compose.foundation.layout.ag agVar) {
        tango(obj, bArr, i4, i5, 0, agVar);
    }

    public final void juliet(int i4, Object obj, Object obj2) {
        if (!papa(i4, obj2)) {
            return;
        }
        int yankee = yankee(i4) & 1048575;
        Unsafe unsafe = kilo;
        long j5 = yankee;
        Object object = unsafe.getObject(obj2, j5);
        if (object != null) {
            X1 azure = azure(i4);
            if (!papa(i4, obj)) {
                if (!romeo(object)) {
                    unsafe.putObject(obj, j5, object);
                } else {
                    AbstractC1392x1 alpha = azure.alpha();
                    azure.delta(alpha, object);
                    unsafe.putObject(obj, j5, alpha);
                }
                lima(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!romeo(object2)) {
                AbstractC1392x1 alpha2 = azure.alpha();
                azure.delta(alpha2, object2);
                unsafe.putObject(obj, j5, alpha2);
                object2 = alpha2;
            }
            azure.delta(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.alpha[i4] + " is present but null: " + obj2.toString());
    }

    public final void kilo(int i4, Object obj, Object obj2) {
        int[] iArr = this.alpha;
        int i5 = iArr[i4];
        if (!sierra(i5, i4, obj2)) {
            return;
        }
        int yankee = yankee(i4) & 1048575;
        Unsafe unsafe = kilo;
        long j5 = yankee;
        Object object = unsafe.getObject(obj2, j5);
        if (object != null) {
            X1 azure = azure(i4);
            if (!sierra(i5, i4, obj)) {
                if (!romeo(object)) {
                    unsafe.putObject(obj, j5, object);
                } else {
                    AbstractC1392x1 alpha = azure.alpha();
                    azure.delta(alpha, object);
                    unsafe.putObject(obj, j5, alpha);
                }
                AbstractC1311e2.india(iArr[i4 + 2] & 1048575, i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!romeo(object2)) {
                AbstractC1392x1 alpha2 = azure.alpha();
                azure.delta(alpha2, object2);
                unsafe.putObject(obj, j5, alpha2);
                object2 = alpha2;
            }
            azure.delta(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2.toString());
    }

    public final void lima(int i4, Object obj) {
        int i5 = this.alpha[i4 + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        AbstractC1311e2.india(j5, (1 << (i5 >>> 20)) | AbstractC1311e2.delta(j5, obj), obj);
    }

    public final void mike(int i4, Object obj, Object obj2) {
        kilo.putObject(obj, yankee(i4) & 1048575, obj2);
        lima(i4, obj);
    }

    public final void november(int i4, int i5, Object obj, Object obj2) {
        kilo.putObject(obj, yankee(i5) & 1048575, obj2);
        AbstractC1311e2.india(this.alpha[i5 + 2] & 1048575, i4, obj);
    }

    public final boolean oscar(AbstractC1392x1 abstractC1392x1, AbstractC1392x1 abstractC1392x12, int i4) {
        if (papa(i4, abstractC1392x1) == papa(i4, abstractC1392x12)) {
            return true;
        }
        return false;
    }

    public final boolean papa(int i4, Object obj) {
        int i5 = this.alpha[i4 + 2];
        long j5 = i5 & 1048575;
        if (j5 == 1048575) {
            int yankee = yankee(i4);
            long j6 = yankee & 1048575;
            switch (xray(yankee)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1311e2.charlie.alpha(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1311e2.charlie.bravo(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1311e2.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1311e2.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1311e2.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1311e2.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1311e2.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1311e2.charlie.golf(j6, obj);
                case 8:
                    Object golf = AbstractC1311e2.golf(j6, obj);
                    if (golf instanceof String) {
                        if (((String) golf).isEmpty()) {
                            return false;
                        }
                    } else if (golf instanceof C1361p1) {
                        if (C1361p1.red.equals(golf)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case 9:
                    if (AbstractC1311e2.golf(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C1361p1.red.equals(AbstractC1311e2.golf(j6, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC1311e2.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1311e2.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1311e2.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1311e2.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1311e2.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1311e2.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC1311e2.golf(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & AbstractC1311e2.delta(j5, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean quebec(Object obj, int i4, int i5, int i10, int i11) {
        if (i5 == 1048575) {
            return papa(i4, obj);
        }
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public final boolean sierra(int i4, int i5, Object obj) {
        if (AbstractC1311e2.delta(this.alpha[i5 + 2] & 1048575, obj) == i4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0d2e, code lost:
    
        r0 = r41;
        r5 = r42;
        r4 = r1;
        r3 = r2;
        r15 = r14;
        r9 = r19;
        r14 = r8;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0ff1, code lost:
    
        if (r15 != r0) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0ff3, code lost:
    
        if (r0 == 0) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0ff5, code lost:
    
        r5 = r40;
        r7 = r3;
        r2 = r21;
        r1 = r24;
        r14 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0439, code lost:
    
        r8 = r1;
        r9 = r4;
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x057a, code lost:
    
        r29 = r4;
        r0 = r41;
        r3 = r2;
        r4 = r8;
        r5 = r9;
        r9 = r12;
        r28 = r14;
        r15 = r19;
        r14 = r25;
        r12 = r11;
        r11 = r10;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x04bf, code lost:
    
        r5 = r40;
        r3 = r8;
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x04c3, code lost:
    
        r8 = r11;
        r9 = r12;
        r11 = r24;
        r16 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x04ef, code lost:
    
        r5 = r40;
        r2 = r1;
        r3 = r8;
        r6 = r9;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0130, code lost:
    
        r19 = r10;
        r9 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0134, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x013d, code lost:
    
        r25 = r8;
        r19 = r10;
        r24 = r11;
        r9 = r13;
        r21 = 1048575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0146, code lost:
    
        r11 = r7;
        r10 = r2;
        r2 = r4;
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0170, code lost:
    
        r5 = r2;
        r2 = r1;
        r1 = r5;
        r5 = r7;
        r7 = r3;
        r3 = r5;
        r5 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x01c3, code lost:
    
        r25 = r8;
        r19 = r10;
        r24 = r11;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x01f6, code lost:
    
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x03b8, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0fff, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.AbstractC1392x1) r10;
        r2 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x1004, code lost:
    
        if (r2 != r14) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x0349, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x1006, code lost:
    
        r2 = com.google.android.gms.internal.measurement.Z1.bravo();
        r1.zzc = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x100c, code lost:
    
        r1 = r15;
        r7 = com.google.common.util.concurrent.c.foxtrot(r1, r4, r3, r40, r2, r5);
        r5 = r40;
        r0 = r36;
        r3 = r38;
        r6 = r42;
        r19 = r1;
        r2 = r10;
        r1 = r11;
        r8 = r12;
        r11 = r24;
        r14 = r28;
        r16 = 1;
        r17 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04c9, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x02ee, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:176:0x062a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0d4a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:585:0x00c0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0ca1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0cbb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0fec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x029d  */
    /* JADX WARN: Type inference failed for: r4v118, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.L1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int tango(Object obj, byte[] bArr, int i4, int i5, int i10, androidx.compose.foundation.layout.ag agVar) {
        int i11;
        Object obj2;
        Object[] objArr;
        int[] iArr;
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int whiskey;
        androidx.compose.foundation.layout.ag agVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        Z1 z12;
        androidx.compose.foundation.layout.ag agVar3;
        Unsafe unsafe2;
        Object obj3;
        Z1 z13;
        int i19;
        int i20;
        byte[] bArr3;
        androidx.compose.foundation.layout.ag agVar4;
        Object obj4;
        byte[] bArr4;
        int golf;
        int i21;
        byte b2;
        int i22;
        Unsafe unsafe3;
        byte[] bArr5;
        androidx.compose.foundation.layout.ag agVar5;
        int i23;
        int i24;
        int golf2;
        byte[] bArr6;
        int i25;
        int i26;
        int i27;
        int i28;
        androidx.compose.foundation.layout.ag agVar6;
        Unsafe unsafe4;
        int i29;
        int i30;
        int i31;
        int i32;
        byte[] bArr7;
        byte[] bArr8;
        int i33;
        int i34;
        int i35;
        androidx.compose.foundation.layout.ag agVar7;
        int echo;
        int i36;
        int i37;
        int i38;
        androidx.compose.foundation.layout.ag agVar8;
        Object obj5;
        int i39;
        int i40;
        int i41;
        androidx.compose.foundation.layout.ag agVar9;
        Object obj6;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int golf3;
        int golf4;
        L1 l12;
        int i47;
        int i48;
        int juliet2;
        int i49;
        byte[] bArr9;
        int i50;
        androidx.compose.foundation.layout.ag agVar10;
        int bravo;
        byte[] bArr10;
        int i51;
        androidx.compose.foundation.layout.ag agVar11;
        int i52;
        int golf5;
        Q1 q12 = this;
        Object obj7 = obj;
        byte[] bArr11 = bArr;
        int i53 = i5;
        androidx.compose.foundation.layout.ag agVar12 = agVar;
        if (romeo(obj7)) {
            int i54 = 1;
            Unsafe unsafe5 = kilo;
            int i55 = i4;
            int i56 = -1;
            int i57 = 0;
            int i58 = 1048575;
            int i59 = 0;
            int i60 = 10;
            int i61 = 2;
            int i62 = 0;
            while (true) {
                int i63 = 3;
                while (true) {
                    int[] iArr2 = q12.alpha;
                    int i64 = 1048575;
                    Object[] objArr2 = q12.bravo;
                    if (i55 < i53) {
                        int i65 = i55 + 1;
                        int i66 = bArr11[i55];
                        if (i66 < 0) {
                            i65 = com.google.common.util.concurrent.c.hotel(i66, bArr11, i65, agVar12);
                            i66 = agVar12.alpha;
                        }
                        i62 = i66;
                        int i67 = i62 >>> 3;
                        int i68 = q12.delta;
                        int i69 = q12.charlie;
                        if (i67 > i56) {
                            whiskey = (i67 < i69 || i67 > i68) ? -1 : q12.whiskey(i67, i57 / 3);
                        } else {
                            whiskey = (i67 < i69 || i67 > i68) ? -1 : q12.whiskey(i67, 0);
                        }
                        Z1 z14 = Z1.foxtrot;
                        if (whiskey != -1) {
                            int i70 = i62 & 7;
                            int i71 = iArr2[whiskey + 1];
                            int xray = xray(i71);
                            long j5 = i71 & 1048575;
                            int i72 = i65;
                            if (xray > 17) {
                                Unsafe unsafe6 = unsafe5;
                                Object obj8 = obj7;
                                iArr = iArr2;
                                int i73 = i72;
                                i16 = i58;
                                int i74 = i67;
                                if (xray != 27) {
                                    if (xray <= 49) {
                                        i18 = i59;
                                        long j6 = i71;
                                        D1 d12 = (D1) unsafe6.getObject(obj8, j5);
                                        if (!((AbstractC1345l1) d12).alpha) {
                                            int size = d12.size();
                                            d12 = d12.foxtrot(size + size);
                                            unsafe6.putObject(obj8, j5, d12);
                                        }
                                        D1 d13 = d12;
                                        Object obj9 = null;
                                        switch (xray) {
                                            case 18:
                                            case 35:
                                                i28 = i5;
                                                agVar6 = agVar;
                                                unsafe4 = unsafe6;
                                                i29 = i74;
                                                i30 = i62;
                                                i31 = i73;
                                                objArr = objArr2;
                                                obj2 = obj8;
                                                i32 = whiskey;
                                                bArr7 = bArr;
                                                if (i70 == 2) {
                                                    if (d13 == null) {
                                                        if (com.google.common.util.concurrent.c.golf(bArr7, i31, agVar6) + agVar6.alpha > bArr7.length) {
                                                            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        throw null;
                                                    }
                                                    throw new ClassCastException();
                                                }
                                                if (i70 == 1) {
                                                    if (d13 == null) {
                                                        Double.longBitsToDouble(com.google.common.util.concurrent.c.mike(i31, bArr7));
                                                        throw null;
                                                    }
                                                    throw new ClassCastException();
                                                }
                                                i55 = i31;
                                                if (i55 == i31) {
                                                    i11 = i10;
                                                    agVar2 = agVar6;
                                                    i17 = i55;
                                                    i12 = i30;
                                                    i57 = i32;
                                                    z12 = z14;
                                                    unsafe = unsafe4;
                                                    i15 = i29;
                                                    bArr2 = bArr7;
                                                    break;
                                                } else {
                                                    bArr11 = bArr7;
                                                    agVar12 = agVar6;
                                                    obj7 = obj2;
                                                    i53 = i28;
                                                    i57 = i32;
                                                    i58 = i16;
                                                    unsafe5 = unsafe4;
                                                    i56 = i29;
                                                    i54 = 1;
                                                    i60 = 10;
                                                    i61 = 2;
                                                    i63 = 3;
                                                    i62 = i30;
                                                    i59 = i18;
                                                }
                                            case 19:
                                            case 36:
                                                i28 = i5;
                                                agVar6 = agVar;
                                                unsafe4 = unsafe6;
                                                i29 = i74;
                                                i30 = i62;
                                                i31 = i73;
                                                objArr = objArr2;
                                                obj2 = obj8;
                                                i32 = whiskey;
                                                bArr7 = bArr;
                                                if (i70 == 2) {
                                                    if (d13 == null) {
                                                        if (com.google.common.util.concurrent.c.golf(bArr7, i31, agVar6) + agVar6.alpha > bArr7.length) {
                                                            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        throw null;
                                                    }
                                                    throw new ClassCastException();
                                                }
                                                if (i70 == 5) {
                                                    if (d13 == null) {
                                                        Float.intBitsToFloat(com.google.common.util.concurrent.c.charlie(i31, bArr7));
                                                        throw null;
                                                    }
                                                    throw new ClassCastException();
                                                }
                                                i55 = i31;
                                                if (i55 == i31) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                i28 = i5;
                                                agVar6 = agVar;
                                                unsafe4 = unsafe6;
                                                i30 = i62;
                                                i31 = i73;
                                                objArr = objArr2;
                                                obj2 = obj8;
                                                bArr7 = bArr;
                                                if (i70 == 2) {
                                                    I1 i110 = (I1) d13;
                                                    int golf6 = com.google.common.util.concurrent.c.golf(bArr7, i31, agVar6);
                                                    int i75 = agVar6.alpha + golf6;
                                                    while (golf6 < i75) {
                                                        golf6 = com.google.common.util.concurrent.c.juliet(bArr7, golf6, agVar6);
                                                        i110.hotel(agVar6.bravo);
                                                        whiskey = whiskey;
                                                        i74 = i74;
                                                    }
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    if (golf6 != i75) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i55 = golf6;
                                                } else {
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    if (i70 == 0) {
                                                        I1 i111 = (I1) d13;
                                                        int juliet3 = com.google.common.util.concurrent.c.juliet(bArr7, i31, agVar6);
                                                        i111.hotel(agVar6.bravo);
                                                        while (juliet3 < i28) {
                                                            int golf7 = com.google.common.util.concurrent.c.golf(bArr7, juliet3, agVar6);
                                                            if (i30 == agVar6.alpha) {
                                                                juliet3 = com.google.common.util.concurrent.c.juliet(bArr7, golf7, agVar6);
                                                                i111.hotel(agVar6.bravo);
                                                            } else {
                                                                i55 = juliet3;
                                                            }
                                                        }
                                                        i55 = juliet3;
                                                    }
                                                    i55 = i31;
                                                }
                                                if (i55 == i31) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                bArr8 = bArr;
                                                i33 = i5;
                                                unsafe4 = unsafe6;
                                                i34 = i62;
                                                i35 = i73;
                                                objArr = objArr2;
                                                agVar7 = agVar;
                                                if (i70 == 2) {
                                                    echo = com.google.common.util.concurrent.c.echo(bArr8, i35, d13, agVar7);
                                                    i55 = echo;
                                                    bArr7 = bArr8;
                                                    i30 = i34;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    i31 = i35;
                                                    obj2 = obj;
                                                    i28 = i33;
                                                    agVar6 = agVar7;
                                                    if (i55 == i31) {
                                                    }
                                                } else if (i70 == 0) {
                                                    obj2 = obj;
                                                    int india = com.google.common.util.concurrent.c.india(i34, bArr8, i35, i33, d13, agVar7);
                                                    i30 = i34;
                                                    bArr7 = bArr8;
                                                    i28 = i33;
                                                    agVar6 = agVar7;
                                                    i31 = i35;
                                                    i55 = india;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    if (i55 == i31) {
                                                    }
                                                } else {
                                                    bArr7 = bArr8;
                                                    i30 = i34;
                                                    i31 = i35;
                                                    obj2 = obj;
                                                    i28 = i33;
                                                    agVar6 = agVar7;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                bArr8 = bArr;
                                                i33 = i5;
                                                unsafe4 = unsafe6;
                                                i34 = i62;
                                                int i76 = i73;
                                                objArr = objArr2;
                                                agVar7 = agVar;
                                                if (i70 == 2) {
                                                    I1 i112 = (I1) d13;
                                                    int golf8 = com.google.common.util.concurrent.c.golf(bArr8, i76, agVar7);
                                                    int i77 = agVar7.alpha;
                                                    int i78 = golf8 + i77;
                                                    if (i78 <= bArr8.length) {
                                                        int i79 = (i77 / 8) + i112.red;
                                                        int length = i112.purple.length;
                                                        if (i79 > length) {
                                                            if (length != 0) {
                                                                while (length < i79) {
                                                                    length = Math.max(((length * 3) / 2) + 1, 10);
                                                                }
                                                                i112.purple = Arrays.copyOf(i112.purple, length);
                                                            } else {
                                                                i112.purple = new long[Math.max(i79, 10)];
                                                            }
                                                            while (golf8 < i78) {
                                                                i112.hotel(com.google.common.util.concurrent.c.mike(golf8, bArr8));
                                                                golf8 += 8;
                                                                i76 = i76;
                                                            }
                                                            i31 = i76;
                                                            if (golf8 != i78) {
                                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i55 = golf8;
                                                            i28 = i33;
                                                            bArr7 = bArr8;
                                                            agVar6 = agVar7;
                                                            i30 = i34;
                                                            i29 = i74;
                                                            i32 = whiskey;
                                                            obj2 = obj;
                                                            if (i55 == i31) {
                                                            }
                                                        }
                                                    } else {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    i31 = i76;
                                                    if (i70 == 1) {
                                                        i36 = i31 + 8;
                                                        I1 i113 = (I1) d13;
                                                        i35 = i31;
                                                        i113.hotel(com.google.common.util.concurrent.c.mike(i35, bArr8));
                                                        while (i36 < i33) {
                                                            int golf9 = com.google.common.util.concurrent.c.golf(bArr8, i36, agVar7);
                                                            if (i34 == agVar7.alpha) {
                                                                i113.hotel(com.google.common.util.concurrent.c.mike(golf9, bArr8));
                                                                i36 = golf9 + 8;
                                                            } else {
                                                                bArr7 = bArr8;
                                                                i30 = i34;
                                                                i29 = i74;
                                                                i32 = whiskey;
                                                                i55 = i36;
                                                                i31 = i35;
                                                                obj2 = obj;
                                                                i28 = i33;
                                                                agVar6 = agVar7;
                                                                if (i55 == i31) {
                                                                }
                                                            }
                                                        }
                                                        bArr7 = bArr8;
                                                        i30 = i34;
                                                        i29 = i74;
                                                        i32 = whiskey;
                                                        i55 = i36;
                                                        i31 = i35;
                                                        obj2 = obj;
                                                        i28 = i33;
                                                        agVar6 = agVar7;
                                                        if (i55 == i31) {
                                                        }
                                                    } else {
                                                        i28 = i33;
                                                        bArr7 = bArr8;
                                                        agVar6 = agVar7;
                                                        i30 = i34;
                                                        i29 = i74;
                                                        i32 = whiskey;
                                                        obj2 = obj;
                                                        i55 = i31;
                                                        if (i55 == i31) {
                                                        }
                                                    }
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                bArr8 = bArr;
                                                i33 = i5;
                                                unsafe4 = unsafe6;
                                                i34 = i62;
                                                i35 = i73;
                                                objArr = objArr2;
                                                agVar7 = agVar;
                                                if (i70 == 2) {
                                                    C1396y1 c1396y1 = (C1396y1) d13;
                                                    int golf10 = com.google.common.util.concurrent.c.golf(bArr8, i35, agVar7);
                                                    int i80 = agVar7.alpha;
                                                    int i81 = golf10 + i80;
                                                    if (i81 <= bArr8.length) {
                                                        int i82 = (i80 / 4) + c1396y1.red;
                                                        int length2 = c1396y1.purple.length;
                                                        if (i82 > length2) {
                                                            if (length2 != 0) {
                                                                while (length2 < i82) {
                                                                    int i83 = i60;
                                                                    length2 = Math.max(((length2 * 3) / 2) + 1, i83);
                                                                    i60 = i83;
                                                                }
                                                                c1396y1.purple = Arrays.copyOf(c1396y1.purple, length2);
                                                            } else {
                                                                c1396y1.purple = new int[Math.max(i82, i60)];
                                                            }
                                                        }
                                                        while (golf10 < i81) {
                                                            c1396y1.hotel(com.google.common.util.concurrent.c.charlie(golf10, bArr8));
                                                            golf10 += 4;
                                                        }
                                                        if (golf10 != i81) {
                                                            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i55 = golf10;
                                                        bArr7 = bArr8;
                                                        i30 = i34;
                                                        i29 = i74;
                                                        i32 = whiskey;
                                                        i31 = i35;
                                                        obj2 = obj;
                                                        i28 = i33;
                                                        agVar6 = agVar7;
                                                        if (i55 == i31) {
                                                        }
                                                    } else {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    if (i70 == 5) {
                                                        i36 = i35 + 4;
                                                        C1396y1 c1396y12 = (C1396y1) d13;
                                                        c1396y12.hotel(com.google.common.util.concurrent.c.charlie(i35, bArr8));
                                                        while (i36 < i33) {
                                                            int golf11 = com.google.common.util.concurrent.c.golf(bArr8, i36, agVar7);
                                                            if (i34 == agVar7.alpha) {
                                                                c1396y12.hotel(com.google.common.util.concurrent.c.charlie(golf11, bArr8));
                                                                i36 = golf11 + 4;
                                                            } else {
                                                                bArr7 = bArr8;
                                                                i30 = i34;
                                                                i29 = i74;
                                                                i32 = whiskey;
                                                                i55 = i36;
                                                                i31 = i35;
                                                                obj2 = obj;
                                                                i28 = i33;
                                                                agVar6 = agVar7;
                                                                if (i55 == i31) {
                                                                }
                                                            }
                                                        }
                                                        bArr7 = bArr8;
                                                        i30 = i34;
                                                        i29 = i74;
                                                        i32 = whiskey;
                                                        i55 = i36;
                                                        i31 = i35;
                                                        obj2 = obj;
                                                        i28 = i33;
                                                        agVar6 = agVar7;
                                                        if (i55 == i31) {
                                                        }
                                                    }
                                                    bArr7 = bArr8;
                                                    i30 = i34;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    i31 = i35;
                                                    obj2 = obj;
                                                    i28 = i33;
                                                    agVar6 = agVar7;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                bArr8 = bArr;
                                                i33 = i5;
                                                unsafe4 = unsafe6;
                                                i34 = i62;
                                                i35 = i73;
                                                objArr = objArr2;
                                                agVar7 = agVar;
                                                if (i70 != 2) {
                                                    if (i70 == 0) {
                                                        if (d13 == null) {
                                                            com.google.common.util.concurrent.c.juliet(bArr8, i35, agVar7);
                                                            throw null;
                                                        }
                                                        throw new ClassCastException();
                                                    }
                                                    bArr7 = bArr8;
                                                    i30 = i34;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    i31 = i35;
                                                    obj2 = obj;
                                                    i28 = i33;
                                                    agVar6 = agVar7;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                } else if (d13 == null) {
                                                    echo = com.google.common.util.concurrent.c.golf(bArr8, i35, agVar7);
                                                    int i84 = agVar7.alpha + echo;
                                                    if (echo < i84) {
                                                        com.google.common.util.concurrent.c.juliet(bArr8, echo, agVar7);
                                                        throw null;
                                                    }
                                                    if (echo != i84) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i55 = echo;
                                                    bArr7 = bArr8;
                                                    i30 = i34;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    i31 = i35;
                                                    obj2 = obj;
                                                    i28 = i33;
                                                    agVar6 = agVar7;
                                                    if (i55 == i31) {
                                                    }
                                                } else {
                                                    throw new ClassCastException();
                                                }
                                                break;
                                            case 26:
                                                Q1 q13 = q12;
                                                unsafe4 = unsafe6;
                                                i34 = i62;
                                                objArr = objArr2;
                                                if (i70 != 2) {
                                                    i31 = i73;
                                                    i28 = i5;
                                                    bArr7 = bArr;
                                                    agVar6 = agVar;
                                                    q12 = q13;
                                                    i30 = i34;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                } else if ((j6 & 536870912) == 0) {
                                                    int golf12 = com.google.common.util.concurrent.c.golf(bArr, i73, agVar);
                                                    int i85 = agVar.alpha;
                                                    if (i85 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i85 == 0) {
                                                        d13.add("");
                                                    } else {
                                                        d13.add(new String(bArr, golf12, i85, E1.alpha));
                                                        golf12 += i85;
                                                    }
                                                    while (golf12 < i5) {
                                                        int golf13 = com.google.common.util.concurrent.c.golf(bArr, golf12, agVar);
                                                        if (i34 == agVar.alpha) {
                                                            golf12 = com.google.common.util.concurrent.c.golf(bArr, golf13, agVar);
                                                            int i86 = agVar.alpha;
                                                            if (i86 < 0) {
                                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i86 == 0) {
                                                                d13.add("");
                                                            } else {
                                                                d13.add(new String(bArr, golf12, i86, E1.alpha));
                                                                golf12 += i86;
                                                            }
                                                        } else {
                                                            i55 = golf12;
                                                            i31 = i73;
                                                            i28 = i5;
                                                            bArr7 = bArr;
                                                            agVar6 = agVar;
                                                            q12 = q13;
                                                            i30 = i34;
                                                            i29 = i74;
                                                            i32 = whiskey;
                                                            obj2 = obj;
                                                            if (i55 == i31) {
                                                            }
                                                        }
                                                    }
                                                    i55 = golf12;
                                                    i31 = i73;
                                                    i28 = i5;
                                                    bArr7 = bArr;
                                                    agVar6 = agVar;
                                                    q12 = q13;
                                                    i30 = i34;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj;
                                                    if (i55 == i31) {
                                                    }
                                                } else {
                                                    int golf14 = com.google.common.util.concurrent.c.golf(bArr, i73, agVar);
                                                    int i87 = agVar.alpha;
                                                    if (i87 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i87 == 0) {
                                                        d13.add("");
                                                        i37 = i73;
                                                    } else {
                                                        int i88 = golf14 + i87;
                                                        if (AbstractC1316f2.delta(bArr, golf14, i88)) {
                                                            i37 = i73;
                                                            d13.add(new String(bArr, golf14, i87, E1.alpha));
                                                            golf14 = i88;
                                                        } else {
                                                            throw new zzmm("Protocol message had invalid UTF-8.");
                                                        }
                                                    }
                                                    while (golf14 < i5) {
                                                        int golf15 = com.google.common.util.concurrent.c.golf(bArr, golf14, agVar);
                                                        if (i34 == agVar.alpha) {
                                                            golf14 = com.google.common.util.concurrent.c.golf(bArr, golf15, agVar);
                                                            int i89 = agVar.alpha;
                                                            if (i89 < 0) {
                                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i89 == 0) {
                                                                d13.add("");
                                                            } else {
                                                                int i90 = golf14 + i89;
                                                                if (AbstractC1316f2.delta(bArr, golf14, i90)) {
                                                                    d13.add(new String(bArr, golf14, i89, E1.alpha));
                                                                    golf14 = i90;
                                                                } else {
                                                                    throw new zzmm("Protocol message had invalid UTF-8.");
                                                                }
                                                            }
                                                        } else {
                                                            i55 = golf14;
                                                            i28 = i5;
                                                            bArr7 = bArr;
                                                            agVar6 = agVar;
                                                            q12 = q13;
                                                            i30 = i34;
                                                            i29 = i74;
                                                            i31 = i37;
                                                            obj2 = obj;
                                                            i32 = whiskey;
                                                            if (i55 == i31) {
                                                            }
                                                        }
                                                    }
                                                    i55 = golf14;
                                                    i28 = i5;
                                                    bArr7 = bArr;
                                                    agVar6 = agVar;
                                                    q12 = q13;
                                                    i30 = i34;
                                                    i29 = i74;
                                                    i31 = i37;
                                                    obj2 = obj;
                                                    i32 = whiskey;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                break;
                                            case 27:
                                                i38 = i5;
                                                agVar8 = agVar;
                                                obj5 = obj8;
                                                unsafe4 = unsafe6;
                                                i39 = i62;
                                                i40 = i73;
                                                bArr7 = bArr;
                                                objArr = objArr2;
                                                if (i70 == 2) {
                                                    int delta = com.google.common.util.concurrent.c.delta(azure(whiskey), i39, bArr, i40, i38, d13, agVar8);
                                                    i31 = i40;
                                                    i28 = i38;
                                                    agVar6 = agVar8;
                                                    q12 = this;
                                                    i30 = i39;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj5;
                                                    i55 = delta;
                                                    bArr7 = bArr;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                androidx.compose.foundation.layout.ag agVar13 = agVar8;
                                                i31 = i40;
                                                agVar6 = agVar13;
                                                q12 = this;
                                                i28 = i38;
                                                i30 = i39;
                                                i29 = i74;
                                                i32 = whiskey;
                                                obj2 = obj5;
                                                i55 = i31;
                                                if (i55 == i31) {
                                                }
                                                break;
                                            case 28:
                                                i38 = i5;
                                                agVar8 = agVar;
                                                obj5 = obj8;
                                                unsafe4 = unsafe6;
                                                i39 = i62;
                                                i40 = i73;
                                                bArr7 = bArr;
                                                objArr = objArr2;
                                                if (i70 == 2) {
                                                    int golf16 = com.google.common.util.concurrent.c.golf(bArr7, i40, agVar8);
                                                    int i91 = agVar8.alpha;
                                                    if (i91 >= 0) {
                                                        if (i91 > bArr7.length - golf16) {
                                                            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i91 == 0) {
                                                            d13.add(C1361p1.red);
                                                        } else {
                                                            d13.add(C1361p1.india(bArr7, golf16, i91));
                                                            golf16 += i91;
                                                        }
                                                        while (golf16 < i38) {
                                                            int golf17 = com.google.common.util.concurrent.c.golf(bArr7, golf16, agVar8);
                                                            if (i39 == agVar8.alpha) {
                                                                golf16 = com.google.common.util.concurrent.c.golf(bArr7, golf17, agVar8);
                                                                int i92 = agVar8.alpha;
                                                                if (i92 >= 0) {
                                                                    if (i92 > bArr7.length - golf16) {
                                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                    }
                                                                    if (i92 == 0) {
                                                                        d13.add(C1361p1.red);
                                                                    } else {
                                                                        d13.add(C1361p1.india(bArr7, golf16, i92));
                                                                        golf16 += i92;
                                                                    }
                                                                } else {
                                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
                                                            } else {
                                                                i31 = i40;
                                                                agVar6 = agVar8;
                                                                i55 = golf16;
                                                                i28 = i38;
                                                                i30 = i39;
                                                                i29 = i74;
                                                                i32 = whiskey;
                                                                obj2 = obj5;
                                                                q12 = this;
                                                                if (i55 == i31) {
                                                                }
                                                            }
                                                        }
                                                        i31 = i40;
                                                        agVar6 = agVar8;
                                                        i55 = golf16;
                                                        i28 = i38;
                                                        i30 = i39;
                                                        i29 = i74;
                                                        i32 = whiskey;
                                                        obj2 = obj5;
                                                        q12 = this;
                                                        if (i55 == i31) {
                                                        }
                                                    } else {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                }
                                                androidx.compose.foundation.layout.ag agVar132 = agVar8;
                                                i31 = i40;
                                                agVar6 = agVar132;
                                                q12 = this;
                                                i28 = i38;
                                                i30 = i39;
                                                i29 = i74;
                                                i32 = whiskey;
                                                obj2 = obj5;
                                                i55 = i31;
                                                if (i55 == i31) {
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                i41 = i5;
                                                agVar9 = agVar;
                                                obj6 = obj8;
                                                unsafe4 = unsafe6;
                                                i30 = i62;
                                                i42 = i73;
                                                bArr7 = bArr;
                                                objArr = objArr2;
                                                if (i70 == 2) {
                                                    i45 = com.google.common.util.concurrent.c.echo(bArr7, i42, d13, agVar9);
                                                    i43 = i30;
                                                    i44 = i42;
                                                } else if (i70 == 0) {
                                                    int india2 = com.google.common.util.concurrent.c.india(i30, bArr7, i42, i41, d13, agVar9);
                                                    i43 = i30;
                                                    bArr7 = bArr7;
                                                    i41 = i41;
                                                    i44 = i42;
                                                    i45 = india2;
                                                } else {
                                                    q12 = this;
                                                    agVar6 = agVar9;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj6;
                                                    i31 = i42;
                                                    i28 = i41;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                A1 amber = q12.amber(whiskey);
                                                C1384v1 c1384v1 = Y1.alpha;
                                                if (amber == null) {
                                                    i46 = i45;
                                                } else if (d13 != null) {
                                                    int size2 = d13.size();
                                                    Object obj10 = null;
                                                    int i93 = 0;
                                                    int i94 = 0;
                                                    while (i93 < size2) {
                                                        int i95 = i45;
                                                        Integer num = (Integer) d13.get(i93);
                                                        int intValue = num.intValue();
                                                        if (amber.alpha(intValue)) {
                                                            if (i93 != i94) {
                                                                d13.set(i94, num);
                                                            }
                                                            i94++;
                                                        } else {
                                                            obj10 = Y1.oscar(i74, intValue, obj6, obj10);
                                                        }
                                                        i93++;
                                                        i45 = i95;
                                                    }
                                                    i46 = i45;
                                                    if (i94 != size2) {
                                                        d13.subList(i94, size2).clear();
                                                    }
                                                } else {
                                                    i46 = i45;
                                                    Iterator it = d13.iterator();
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!amber.alpha(intValue2)) {
                                                            obj9 = Y1.oscar(i74, intValue2, obj6, obj9);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                i31 = i44;
                                                agVar6 = agVar9;
                                                q12 = this;
                                                i55 = i46;
                                                i28 = i41;
                                                i30 = i43;
                                                i29 = i74;
                                                i32 = whiskey;
                                                obj2 = obj6;
                                                if (i55 == i31) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                i41 = i5;
                                                agVar9 = agVar;
                                                obj6 = obj8;
                                                unsafe4 = unsafe6;
                                                i30 = i62;
                                                i42 = i73;
                                                bArr7 = bArr;
                                                objArr = objArr2;
                                                if (i70 == 2) {
                                                    C1396y1 c1396y13 = (C1396y1) d13;
                                                    golf4 = com.google.common.util.concurrent.c.golf(bArr7, i42, agVar9);
                                                    int i96 = agVar9.alpha + golf4;
                                                    while (golf4 < i96) {
                                                        golf4 = com.google.common.util.concurrent.c.golf(bArr7, golf4, agVar9);
                                                        int i97 = agVar9.alpha;
                                                        c1396y13.hotel((i97 >>> 1) ^ (-(i97 & 1)));
                                                    }
                                                    if (golf4 != i96) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i55 = golf4;
                                                    agVar6 = agVar9;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj6;
                                                    i31 = i42;
                                                    i28 = i41;
                                                    if (i55 == i31) {
                                                    }
                                                } else {
                                                    if (i70 == 0) {
                                                        C1396y1 c1396y14 = (C1396y1) d13;
                                                        golf3 = com.google.common.util.concurrent.c.golf(bArr7, i42, agVar9);
                                                        int i98 = agVar9.alpha;
                                                        c1396y14.hotel((i98 >>> 1) ^ (-(i98 & 1)));
                                                        while (golf3 < i41) {
                                                            int golf18 = com.google.common.util.concurrent.c.golf(bArr7, golf3, agVar9);
                                                            if (i30 == agVar9.alpha) {
                                                                golf3 = com.google.common.util.concurrent.c.golf(bArr7, golf18, agVar9);
                                                                int i99 = agVar9.alpha;
                                                                c1396y14.hotel((i99 >>> 1) ^ (-(i99 & 1)));
                                                            } else {
                                                                i55 = golf3;
                                                                agVar6 = agVar9;
                                                                i29 = i74;
                                                                i32 = whiskey;
                                                                obj2 = obj6;
                                                                i31 = i42;
                                                                i28 = i41;
                                                                if (i55 == i31) {
                                                                }
                                                            }
                                                        }
                                                        i55 = golf3;
                                                        agVar6 = agVar9;
                                                        i29 = i74;
                                                        i32 = whiskey;
                                                        obj2 = obj6;
                                                        i31 = i42;
                                                        i28 = i41;
                                                        if (i55 == i31) {
                                                        }
                                                    }
                                                    agVar6 = agVar9;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj6;
                                                    i31 = i42;
                                                    i28 = i41;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                i41 = i5;
                                                agVar9 = agVar;
                                                obj6 = obj8;
                                                i30 = i62;
                                                i42 = i73;
                                                bArr7 = bArr;
                                                objArr = objArr2;
                                                if (i70 == 2) {
                                                    I1 i114 = (I1) d13;
                                                    golf4 = com.google.common.util.concurrent.c.golf(bArr7, i42, agVar9);
                                                    int i100 = agVar9.alpha + golf4;
                                                    while (golf4 < i100) {
                                                        golf4 = com.google.common.util.concurrent.c.juliet(bArr7, golf4, agVar9);
                                                        i114.hotel(ge.ah.foxtrot(agVar9.bravo));
                                                        unsafe6 = unsafe6;
                                                    }
                                                    unsafe4 = unsafe6;
                                                    if (golf4 != i100) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i55 = golf4;
                                                    agVar6 = agVar9;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj6;
                                                    i31 = i42;
                                                    i28 = i41;
                                                    if (i55 == i31) {
                                                    }
                                                } else {
                                                    unsafe4 = unsafe6;
                                                    if (i70 == 0) {
                                                        I1 i115 = (I1) d13;
                                                        golf3 = com.google.common.util.concurrent.c.juliet(bArr7, i42, agVar9);
                                                        i115.hotel(ge.ah.foxtrot(agVar9.bravo));
                                                        while (golf3 < i41) {
                                                            int golf19 = com.google.common.util.concurrent.c.golf(bArr7, golf3, agVar9);
                                                            if (i30 == agVar9.alpha) {
                                                                golf3 = com.google.common.util.concurrent.c.juliet(bArr7, golf19, agVar9);
                                                                i115.hotel(ge.ah.foxtrot(agVar9.bravo));
                                                            } else {
                                                                i55 = golf3;
                                                                agVar6 = agVar9;
                                                                i29 = i74;
                                                                i32 = whiskey;
                                                                obj2 = obj6;
                                                                i31 = i42;
                                                                i28 = i41;
                                                                if (i55 == i31) {
                                                                }
                                                            }
                                                        }
                                                        i55 = golf3;
                                                        agVar6 = agVar9;
                                                        i29 = i74;
                                                        i32 = whiskey;
                                                        obj2 = obj6;
                                                        i31 = i42;
                                                        i28 = i41;
                                                        if (i55 == i31) {
                                                        }
                                                    }
                                                    agVar6 = agVar9;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj6;
                                                    i31 = i42;
                                                    i28 = i41;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i70 == 3) {
                                                    int i101 = (i62 & (-8)) | 4;
                                                    X1 azure = q12.azure(whiskey);
                                                    AbstractC1392x1 alpha = azure.alpha();
                                                    obj6 = obj;
                                                    byte[] bArr12 = bArr;
                                                    i41 = i5;
                                                    i30 = i62;
                                                    objArr = objArr2;
                                                    int kilo2 = com.google.common.util.concurrent.c.kilo(alpha, azure, bArr12, i73, i41, i101, agVar);
                                                    i42 = i73;
                                                    int i102 = i101;
                                                    androidx.compose.foundation.layout.ag agVar14 = agVar;
                                                    azure.bravo(alpha);
                                                    agVar14.delta = alpha;
                                                    d13.add(alpha);
                                                    while (kilo2 < i41) {
                                                        int golf20 = com.google.common.util.concurrent.c.golf(bArr12, kilo2, agVar14);
                                                        if (i30 == agVar14.alpha) {
                                                            int i103 = i102;
                                                            AbstractC1392x1 alpha2 = azure.alpha();
                                                            kilo2 = com.google.common.util.concurrent.c.kilo(alpha2, azure, bArr12, golf20, i41, i103, agVar);
                                                            byte[] bArr13 = bArr12;
                                                            X1 x12 = azure;
                                                            agVar14 = agVar;
                                                            x12.bravo(alpha2);
                                                            agVar14.delta = alpha2;
                                                            d13.add(alpha2);
                                                            bArr12 = bArr13;
                                                            i102 = i103;
                                                            azure = x12;
                                                        } else {
                                                            bArr7 = bArr12;
                                                            agVar6 = agVar14;
                                                            i55 = kilo2;
                                                            unsafe4 = unsafe6;
                                                            i29 = i74;
                                                            i32 = whiskey;
                                                            obj2 = obj6;
                                                            i31 = i42;
                                                            i28 = i41;
                                                            if (i55 == i31) {
                                                            }
                                                        }
                                                    }
                                                    bArr7 = bArr12;
                                                    agVar6 = agVar14;
                                                    i55 = kilo2;
                                                    unsafe4 = unsafe6;
                                                    i29 = i74;
                                                    i32 = whiskey;
                                                    obj2 = obj6;
                                                    i31 = i42;
                                                    i28 = i41;
                                                    if (i55 == i31) {
                                                    }
                                                } else {
                                                    objArr = objArr2;
                                                    agVar6 = agVar;
                                                    unsafe4 = unsafe6;
                                                    i29 = i74;
                                                    i31 = i73;
                                                    i30 = i62;
                                                    i28 = i5;
                                                    obj2 = obj8;
                                                    i32 = whiskey;
                                                    bArr7 = bArr;
                                                    i55 = i31;
                                                    if (i55 == i31) {
                                                    }
                                                }
                                                break;
                                        }
                                    } else {
                                        i25 = i74;
                                        i27 = whiskey;
                                        obj2 = obj8;
                                        i18 = i59;
                                        bArr6 = bArr;
                                        i26 = i62;
                                        i73 = i73;
                                        objArr = objArr2;
                                        if (xray != 50) {
                                            unsafe = unsafe6;
                                            long j7 = iArr[i27 + 2] & 1048575;
                                            switch (xray) {
                                                case 51:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 1) {
                                                        i48 = i47 + 8;
                                                        unsafe.putObject(obj2, j5, Double.valueOf(Double.longBitsToDouble(com.google.common.util.concurrent.c.mike(i47, bArr2))));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = i48;
                                                        if (i55 == i47) {
                                                            i11 = i10;
                                                            i17 = i55;
                                                            i57 = i27;
                                                            break;
                                                        } else {
                                                            q12 = this;
                                                            bArr11 = bArr2;
                                                            agVar12 = agVar2;
                                                            obj7 = obj2;
                                                            unsafe5 = unsafe;
                                                            i56 = i15;
                                                            i57 = i27;
                                                            i58 = i16;
                                                            i59 = i18;
                                                            i54 = 1;
                                                            i60 = 10;
                                                            i61 = 2;
                                                            i63 = 3;
                                                            i53 = i5;
                                                            i62 = i12;
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                case 52:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 5) {
                                                        i48 = i47 + 4;
                                                        unsafe.putObject(obj2, j5, Float.valueOf(Float.intBitsToFloat(com.google.common.util.concurrent.c.charlie(i47, bArr2))));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = i48;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 0) {
                                                        juliet2 = com.google.common.util.concurrent.c.juliet(bArr2, i47, agVar2);
                                                        unsafe.putObject(obj2, j5, Long.valueOf(agVar2.bravo));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = juliet2;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 0) {
                                                        juliet2 = com.google.common.util.concurrent.c.golf(bArr2, i47, agVar2);
                                                        unsafe.putObject(obj2, j5, Integer.valueOf(agVar2.alpha));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = juliet2;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 1) {
                                                        i48 = i47 + 8;
                                                        unsafe.putObject(obj2, j5, Long.valueOf(com.google.common.util.concurrent.c.mike(i47, bArr2)));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = i48;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 5) {
                                                        i48 = i47 + 4;
                                                        unsafe.putObject(obj2, j5, Integer.valueOf(com.google.common.util.concurrent.c.charlie(i47, bArr2)));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = i48;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 58:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 0) {
                                                        juliet2 = com.google.common.util.concurrent.c.juliet(bArr2, i47, agVar2);
                                                        unsafe.putObject(obj2, j5, Boolean.valueOf(agVar2.bravo != 0));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = juliet2;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 59:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    agVar2 = agVar;
                                                    if (i70 == 2) {
                                                        juliet2 = com.google.common.util.concurrent.c.golf(bArr2, i47, agVar2);
                                                        int i104 = agVar2.alpha;
                                                        if (i104 == 0) {
                                                            unsafe.putObject(obj2, j5, "");
                                                        } else {
                                                            int i105 = juliet2 + i104;
                                                            if ((i71 & 536870912) != 0 && !AbstractC1316f2.delta(bArr2, juliet2, i105)) {
                                                                throw new zzmm("Protocol message had invalid UTF-8.");
                                                            }
                                                            unsafe.putObject(obj2, j5, new String(bArr2, juliet2, i104, E1.alpha));
                                                            juliet2 = i105;
                                                        }
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = juliet2;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 60:
                                                    i12 = i26;
                                                    i49 = i27;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 2) {
                                                        Object black = q12.black(i15, i49, obj2);
                                                        int lima = com.google.common.util.concurrent.c.lima(black, q12.azure(i49), bArr, i73, i5, agVar);
                                                        bArr2 = bArr;
                                                        q12.november(i15, i49, obj2, black);
                                                        agVar2 = agVar;
                                                        i55 = lima;
                                                        i47 = i73;
                                                        i27 = i49;
                                                        if (i55 == i47) {
                                                        }
                                                    } else {
                                                        bArr2 = bArr;
                                                        agVar2 = agVar;
                                                        i47 = i73;
                                                        i27 = i49;
                                                        i55 = i47;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    bArr9 = bArr;
                                                    i50 = i73;
                                                    agVar10 = agVar;
                                                    i12 = i26;
                                                    i49 = i27;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    if (i70 == 2) {
                                                        bravo = com.google.common.util.concurrent.c.bravo(bArr9, i50, agVar10);
                                                        unsafe.putObject(obj2, j5, agVar10.delta);
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = bravo;
                                                        i47 = i50;
                                                        bArr2 = bArr9;
                                                        agVar2 = agVar10;
                                                        i27 = i49;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    i47 = i50;
                                                    bArr2 = bArr9;
                                                    agVar2 = agVar10;
                                                    i27 = i49;
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                                case 63:
                                                    bArr9 = bArr;
                                                    i50 = i73;
                                                    agVar10 = agVar;
                                                    i49 = i27;
                                                    i15 = i25;
                                                    if (i70 == 0) {
                                                        bravo = com.google.common.util.concurrent.c.golf(bArr9, i50, agVar10);
                                                        int i106 = agVar10.alpha;
                                                        A1 amber2 = q12.amber(i49);
                                                        if (amber2 != null && !amber2.alpha(i106)) {
                                                            AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) obj2;
                                                            Z1 z15 = abstractC1392x1.zzc;
                                                            z12 = z14;
                                                            if (z15 == z12) {
                                                                z15 = Z1.bravo();
                                                                abstractC1392x1.zzc = z15;
                                                            }
                                                            i12 = i26;
                                                            z15.charlie(i12, Long.valueOf(i106));
                                                        } else {
                                                            i12 = i26;
                                                            z12 = z14;
                                                            unsafe.putObject(obj2, j5, Integer.valueOf(i106));
                                                            unsafe.putInt(obj2, j7, i15);
                                                        }
                                                        i55 = bravo;
                                                        i47 = i50;
                                                        bArr2 = bArr9;
                                                        agVar2 = agVar10;
                                                        i27 = i49;
                                                        if (i55 == i47) {
                                                        }
                                                    } else {
                                                        i12 = i26;
                                                        z12 = z14;
                                                        i47 = i50;
                                                        bArr2 = bArr9;
                                                        agVar2 = agVar10;
                                                        i27 = i49;
                                                        i55 = i47;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    break;
                                                case 66:
                                                    bArr10 = bArr;
                                                    i51 = i73;
                                                    agVar11 = agVar;
                                                    i49 = i27;
                                                    i15 = i25;
                                                    i52 = i26;
                                                    if (i70 == 0) {
                                                        golf5 = com.google.common.util.concurrent.c.golf(bArr10, i51, agVar11);
                                                        int i107 = agVar11.alpha;
                                                        unsafe.putObject(obj2, j5, Integer.valueOf((i107 >>> 1) ^ (-(i107 & 1))));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = golf5;
                                                        i47 = i51;
                                                        bArr2 = bArr10;
                                                        agVar2 = agVar11;
                                                        i12 = i52;
                                                        z12 = z14;
                                                        i27 = i49;
                                                        if (i55 == i47) {
                                                        }
                                                    } else {
                                                        i47 = i51;
                                                        bArr2 = bArr10;
                                                        agVar2 = agVar11;
                                                        i12 = i52;
                                                        z12 = z14;
                                                        i27 = i49;
                                                        i55 = i47;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    break;
                                                case 67:
                                                    bArr10 = bArr;
                                                    i51 = i73;
                                                    agVar11 = agVar;
                                                    i49 = i27;
                                                    i15 = i25;
                                                    if (i70 == 0) {
                                                        golf5 = com.google.common.util.concurrent.c.juliet(bArr10, i51, agVar11);
                                                        i52 = i26;
                                                        unsafe.putObject(obj2, j5, Long.valueOf(ge.ah.foxtrot(agVar11.bravo)));
                                                        unsafe.putInt(obj2, j7, i15);
                                                        i55 = golf5;
                                                        i47 = i51;
                                                        bArr2 = bArr10;
                                                        agVar2 = agVar11;
                                                        i12 = i52;
                                                        z12 = z14;
                                                        i27 = i49;
                                                        if (i55 == i47) {
                                                        }
                                                    } else {
                                                        i47 = i51;
                                                        bArr2 = bArr10;
                                                        agVar2 = agVar11;
                                                        i27 = i49;
                                                        i12 = i26;
                                                        z12 = z14;
                                                        i55 = i47;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    break;
                                                case 68:
                                                    if (i70 == 3) {
                                                        i15 = i25;
                                                        Object black2 = q12.black(i15, i27, obj2);
                                                        int kilo3 = com.google.common.util.concurrent.c.kilo(black2, q12.azure(i27), bArr, i73, i5, (i26 & (-8)) | 4, agVar);
                                                        q12.november(i15, i27, obj2, black2);
                                                        i55 = kilo3;
                                                        i47 = i73;
                                                        bArr2 = bArr;
                                                        agVar2 = agVar;
                                                        i12 = i26;
                                                        z12 = z14;
                                                        if (i55 == i47) {
                                                        }
                                                    } else {
                                                        i15 = i25;
                                                        bArr2 = bArr;
                                                        i47 = i73;
                                                        agVar2 = agVar;
                                                        i12 = i26;
                                                        z12 = z14;
                                                        i55 = i47;
                                                        if (i55 == i47) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    bArr2 = bArr;
                                                    i47 = i73;
                                                    agVar2 = agVar;
                                                    i12 = i26;
                                                    z12 = z14;
                                                    i15 = i25;
                                                    i55 = i47;
                                                    if (i55 == i47) {
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i70 == 2) {
                                                int i108 = i27 / 3;
                                                Object obj11 = objArr[i108 + i108];
                                                Object object = unsafe6.getObject(obj2, j5);
                                                if (!((L1) object).alpha) {
                                                    L1 l13 = L1.purple;
                                                    if (l13.isEmpty()) {
                                                        l12 = new L1();
                                                    } else {
                                                        ?? linkedHashMap = new LinkedHashMap(l13);
                                                        linkedHashMap.alpha = true;
                                                        l12 = linkedHashMap;
                                                    }
                                                    C1384v1.charlie(l12, object);
                                                    unsafe6.putObject(obj2, j5, l12);
                                                }
                                                throw A0.z.hotel(obj11);
                                            }
                                            unsafe = unsafe6;
                                        }
                                    }
                                } else if (i70 == 2) {
                                    D1 d14 = (D1) unsafe6.getObject(obj8, j5);
                                    if (!((AbstractC1345l1) d14).alpha) {
                                        int size3 = d14.size();
                                        d14 = d14.foxtrot(size3 == 0 ? i60 : size3 + size3);
                                        unsafe6.putObject(obj8, j5, d14);
                                    }
                                    D1 d15 = d14;
                                    bArr11 = bArr;
                                    i53 = i5;
                                    int delta2 = com.google.common.util.concurrent.c.delta(q12.azure(whiskey), i62, bArr11, i73, i53, d15, agVar);
                                    agVar12 = agVar;
                                    i55 = delta2;
                                    unsafe5 = unsafe6;
                                    i56 = i74;
                                    i57 = whiskey;
                                    i58 = i16;
                                    i54 = 1;
                                    i61 = 2;
                                    i63 = 3;
                                    obj7 = obj;
                                } else {
                                    bArr6 = bArr;
                                    objArr = objArr2;
                                    i25 = i74;
                                    i18 = i59;
                                    i26 = i62;
                                    unsafe = unsafe6;
                                    i27 = whiskey;
                                    obj2 = obj;
                                }
                            } else {
                                int i109 = iArr2[whiskey + 2];
                                int i116 = i54 << (i109 >>> 20);
                                int i117 = i109 & 1048575;
                                iArr = iArr2;
                                if (i117 != i58) {
                                    if (i58 != 1048575) {
                                        unsafe5.putInt(obj7, i58, i59);
                                    }
                                    i58 = i117;
                                    i59 = i117 == 1048575 ? 0 : unsafe5.getInt(obj7, i117);
                                }
                                switch (xray) {
                                    case 0:
                                        agVar3 = agVar;
                                        unsafe2 = unsafe5;
                                        obj3 = obj7;
                                        i64 = 1048575;
                                        i20 = i72;
                                        z13 = z14;
                                        i16 = i58;
                                        i19 = i67;
                                        bArr3 = bArr;
                                        if (i70 == i54) {
                                            i55 = i20 + 8;
                                            i59 |= i116;
                                            AbstractC1311e2.charlie.echo(obj, j5, Double.longBitsToDouble(com.google.common.util.concurrent.c.mike(i20, bArr3)));
                                            obj3 = obj;
                                            break;
                                        }
                                        break;
                                    case 1:
                                        agVar3 = agVar;
                                        unsafe2 = unsafe5;
                                        obj3 = obj7;
                                        i64 = 1048575;
                                        i20 = i72;
                                        z13 = z14;
                                        i16 = i58;
                                        i19 = i67;
                                        bArr3 = bArr;
                                        if (i70 == 5) {
                                            i55 = i20 + 4;
                                            i59 |= i116;
                                            AbstractC1311e2.charlie.foxtrot(obj3, j5, Float.intBitsToFloat(com.google.common.util.concurrent.c.charlie(i20, bArr3)));
                                            break;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        agVar3 = agVar;
                                        unsafe2 = unsafe5;
                                        obj3 = obj7;
                                        i64 = 1048575;
                                        i20 = i72;
                                        z13 = z14;
                                        i16 = i58;
                                        i19 = i67;
                                        bArr3 = bArr;
                                        if (i70 == 0) {
                                            i59 |= i116;
                                            i55 = com.google.common.util.concurrent.c.juliet(bArr3, i20, agVar3);
                                            obj7 = obj3;
                                            unsafe5 = unsafe2;
                                            unsafe5.putLong(obj7, j5, agVar3.bravo);
                                            break;
                                        }
                                        break;
                                    case 4:
                                    case 11:
                                        agVar3 = agVar;
                                        unsafe2 = unsafe5;
                                        obj3 = obj7;
                                        i64 = 1048575;
                                        i20 = i72;
                                        z13 = z14;
                                        i16 = i58;
                                        i19 = i67;
                                        bArr3 = bArr;
                                        if (i70 == 0) {
                                            i59 |= i116;
                                            i55 = com.google.common.util.concurrent.c.golf(bArr3, i20, agVar3);
                                            unsafe2.putInt(obj3, j5, agVar3.alpha);
                                            break;
                                        }
                                        break;
                                    case 5:
                                    case 14:
                                        z13 = z14;
                                        agVar4 = agVar;
                                        unsafe2 = unsafe5;
                                        obj4 = obj7;
                                        i16 = i58;
                                        i64 = 1048575;
                                        i19 = i67;
                                        i20 = i72;
                                        bArr4 = bArr;
                                        if (i70 == i54) {
                                            i55 = i20 + 8;
                                            i59 |= i116;
                                            long mike = com.google.common.util.concurrent.c.mike(i20, bArr4);
                                            agVar3 = agVar4;
                                            obj7 = obj;
                                            bArr3 = bArr4;
                                            unsafe5 = unsafe2;
                                            unsafe5.putLong(obj7, j5, mike);
                                            break;
                                        }
                                        break;
                                    case 6:
                                    case 13:
                                        z13 = z14;
                                        agVar4 = agVar;
                                        unsafe2 = unsafe5;
                                        obj4 = obj7;
                                        i16 = i58;
                                        i64 = 1048575;
                                        i19 = i67;
                                        i20 = i72;
                                        bArr4 = bArr;
                                        if (i70 != 5) {
                                            break;
                                        } else {
                                            i55 = i20 + 4;
                                            i59 |= i116;
                                            unsafe2.putInt(obj4, j5, com.google.common.util.concurrent.c.charlie(i20, bArr4));
                                            bArr11 = bArr4;
                                            agVar12 = agVar4;
                                            obj7 = obj4;
                                            unsafe5 = unsafe2;
                                            i56 = i19;
                                            i57 = whiskey;
                                            i58 = i16;
                                            i61 = 2;
                                            i63 = 3;
                                            i53 = i5;
                                        }
                                    case 7:
                                        z13 = z14;
                                        agVar4 = agVar;
                                        unsafe2 = unsafe5;
                                        obj4 = obj7;
                                        i16 = i58;
                                        i64 = 1048575;
                                        i19 = i67;
                                        i20 = i72;
                                        bArr4 = bArr;
                                        if (i70 != 0) {
                                            break;
                                        } else {
                                            i59 |= i116;
                                            i55 = com.google.common.util.concurrent.c.juliet(bArr4, i20, agVar4);
                                            AbstractC1311e2.charlie.charlie(obj4, j5, agVar4.bravo != 0 ? i54 : 0);
                                            bArr11 = bArr4;
                                            agVar12 = agVar4;
                                            obj7 = obj4;
                                            unsafe5 = unsafe2;
                                            i56 = i19;
                                            i57 = whiskey;
                                            i58 = i16;
                                            i61 = 2;
                                            i63 = 3;
                                            i53 = i5;
                                        }
                                    case 8:
                                        agVar4 = agVar;
                                        unsafe2 = unsafe5;
                                        obj4 = obj7;
                                        i64 = 1048575;
                                        i20 = i72;
                                        bArr4 = bArr;
                                        z13 = z14;
                                        i16 = i58;
                                        i19 = i67;
                                        if (i70 != i61) {
                                            break;
                                        } else {
                                            if ((i71 & 536870912) != 0) {
                                                golf = com.google.common.util.concurrent.c.golf(bArr4, i20, agVar4);
                                                int i118 = agVar4.alpha;
                                                if (i118 < 0) {
                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i119 = i59 | i116;
                                                if (i118 == 0) {
                                                    agVar4.delta = "";
                                                    i21 = i119;
                                                } else {
                                                    int i120 = AbstractC1316f2.alpha;
                                                    int length3 = bArr4.length;
                                                    if ((((length3 - golf) - i118) | golf | i118) >= 0) {
                                                        int i121 = golf + i118;
                                                        char[] cArr = new char[i118];
                                                        int i122 = 0;
                                                        while (golf < i121) {
                                                            byte b4 = bArr4[golf];
                                                            if (b4 >= 0) {
                                                                golf++;
                                                                cArr[i122] = (char) b4;
                                                                i122++;
                                                            } else {
                                                                while (golf < i121) {
                                                                    int i123 = golf + 1;
                                                                    int i124 = golf;
                                                                    byte b6 = bArr4[i124];
                                                                    if (b6 >= 0) {
                                                                        int i125 = i122 + 1;
                                                                        cArr[i122] = (char) b6;
                                                                        golf = i123;
                                                                        while (true) {
                                                                            i122 = i125;
                                                                            if (golf < i121 && (b2 = bArr4[golf]) >= 0) {
                                                                                golf++;
                                                                                i125 = i122 + 1;
                                                                                cArr[i122] = (char) b2;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        int i126 = i119;
                                                                        if (b6 >= -32) {
                                                                            int i127 = i121;
                                                                            if (b6 < -16) {
                                                                                if (i123 < i127 - 1) {
                                                                                    int i128 = i122 + 1;
                                                                                    int i129 = i124 + 2;
                                                                                    byte b10 = bArr4[i123];
                                                                                    int i130 = i124 + 3;
                                                                                    byte b11 = bArr4[i129];
                                                                                    if (i6.d.charlie(b10)) {
                                                                                        break;
                                                                                    } else {
                                                                                        if (b6 == -32) {
                                                                                            if (b10 < -96) {
                                                                                                break;
                                                                                            } else {
                                                                                                b6 = -32;
                                                                                            }
                                                                                        }
                                                                                        if (b6 == -19) {
                                                                                            if (b10 >= -96) {
                                                                                                break;
                                                                                            } else {
                                                                                                b6 = -19;
                                                                                            }
                                                                                        }
                                                                                        if (i6.d.charlie(b11)) {
                                                                                            break;
                                                                                        } else {
                                                                                            cArr[i122] = (char) (((b6 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                                                                                            i119 = i126;
                                                                                            golf = i130;
                                                                                            i121 = i127;
                                                                                            i122 = i128;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    throw new zzmm("Protocol message had invalid UTF-8.");
                                                                                }
                                                                            } else if (i123 < i127 - 2) {
                                                                                byte b12 = bArr4[i123];
                                                                                int i131 = i124 + 3;
                                                                                byte b13 = bArr4[i124 + 2];
                                                                                int i132 = i124 + 4;
                                                                                byte b14 = bArr4[i131];
                                                                                if (i6.d.charlie(b12)) {
                                                                                    break;
                                                                                } else if ((((b12 + 112) + (b6 << 28)) >> 30) == 0 && !i6.d.charlie(b13) && !i6.d.charlie(b14)) {
                                                                                    int i133 = ((b6 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
                                                                                    cArr[i122] = (char) ((i133 >>> 10) + 55232);
                                                                                    cArr[i122 + 1] = (char) ((i133 & 1023) + 56320);
                                                                                    i122 += 2;
                                                                                    i119 = i126;
                                                                                    golf = i132;
                                                                                    i121 = i127;
                                                                                }
                                                                            } else {
                                                                                throw new zzmm("Protocol message had invalid UTF-8.");
                                                                            }
                                                                        } else if (i123 < i121) {
                                                                            int i134 = i122 + 1;
                                                                            int i135 = i124 + 2;
                                                                            byte b15 = bArr4[i123];
                                                                            int i136 = i121;
                                                                            if (b6 >= -62 && !i6.d.charlie(b15)) {
                                                                                cArr[i122] = (char) (((b6 & 31) << 6) | (b15 & 63));
                                                                                i122 = i134;
                                                                                golf = i135;
                                                                                i121 = i136;
                                                                                i119 = i126;
                                                                            }
                                                                        } else {
                                                                            throw new zzmm("Protocol message had invalid UTF-8.");
                                                                        }
                                                                    }
                                                                }
                                                                i21 = i119;
                                                                agVar4.delta = new String(cArr, 0, i122);
                                                                golf = i121;
                                                            }
                                                        }
                                                        while (golf < i121) {
                                                        }
                                                        i21 = i119;
                                                        agVar4.delta = new String(cArr, 0, i122);
                                                        golf = i121;
                                                    } else {
                                                        Integer valueOf = Integer.valueOf(length3);
                                                        Integer valueOf2 = Integer.valueOf(golf);
                                                        Integer valueOf3 = Integer.valueOf(i118);
                                                        Object[] objArr3 = new Object[3];
                                                        objArr3[0] = valueOf;
                                                        objArr3[i54] = valueOf2;
                                                        objArr3[2] = valueOf3;
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArr3));
                                                    }
                                                }
                                                i59 = i21;
                                            } else {
                                                golf = com.google.common.util.concurrent.c.golf(bArr4, i20, agVar4);
                                                int i137 = agVar4.alpha;
                                                if (i137 < 0) {
                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i138 = i59 | i116;
                                                if (i137 == 0) {
                                                    agVar4.delta = "";
                                                } else {
                                                    agVar4.delta = new String(bArr4, golf, i137, E1.alpha);
                                                    golf += i137;
                                                }
                                                i59 = i138;
                                            }
                                            i55 = golf;
                                            unsafe2.putObject(obj4, j5, agVar4.delta);
                                            bArr11 = bArr4;
                                            agVar12 = agVar4;
                                            obj7 = obj4;
                                            unsafe5 = unsafe2;
                                            i56 = i19;
                                            i57 = whiskey;
                                            i58 = i16;
                                            i61 = 2;
                                            i63 = 3;
                                            i53 = i5;
                                        }
                                        break;
                                    case 9:
                                        Object obj12 = obj7;
                                        Unsafe unsafe7 = unsafe5;
                                        i64 = 1048575;
                                        i22 = i61;
                                        if (i70 == i22) {
                                            i59 |= i116;
                                            Object beige = q12.beige(whiskey, obj12);
                                            agVar12 = agVar;
                                            i53 = i5;
                                            int lima2 = com.google.common.util.concurrent.c.lima(beige, q12.azure(whiskey), bArr, i72, i53, agVar12);
                                            q12.mike(whiskey, obj12, beige);
                                            i55 = lima2;
                                            obj7 = obj12;
                                            bArr11 = bArr;
                                            unsafe5 = unsafe7;
                                            i62 = i62;
                                            i57 = whiskey;
                                            break;
                                        } else {
                                            i20 = i72;
                                            z13 = z14;
                                            i62 = i62;
                                            i16 = i58;
                                            i19 = i67;
                                            bArr3 = bArr;
                                            obj3 = obj12;
                                            unsafe2 = unsafe7;
                                            agVar3 = agVar;
                                            break;
                                        }
                                    case 10:
                                        Object obj13 = obj7;
                                        unsafe3 = unsafe5;
                                        obj3 = obj13;
                                        bArr5 = bArr;
                                        agVar5 = agVar;
                                        i64 = 1048575;
                                        i22 = i61;
                                        i23 = i62;
                                        i24 = i72;
                                        if (i70 == i22) {
                                            i59 |= i116;
                                            int bravo2 = com.google.common.util.concurrent.c.bravo(bArr5, i24, agVar5);
                                            unsafe3.putObject(obj3, j5, agVar5.delta);
                                            obj7 = obj3;
                                            unsafe5 = unsafe3;
                                            i55 = bravo2;
                                            bArr11 = bArr5;
                                            i53 = i5;
                                            i62 = i23;
                                            i57 = whiskey;
                                            agVar12 = agVar5;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 12:
                                        Object obj14 = obj7;
                                        unsafe3 = unsafe5;
                                        obj3 = obj14;
                                        bArr5 = bArr;
                                        agVar5 = agVar;
                                        i64 = 1048575;
                                        int i139 = i54;
                                        i23 = i62;
                                        i24 = i72;
                                        if (i70 == 0) {
                                            golf2 = com.google.common.util.concurrent.c.golf(bArr5, i24, agVar5);
                                            int i140 = agVar5.alpha;
                                            i54 = i139;
                                            A1 amber3 = q12.amber(whiskey);
                                            if ((i71 & RecyclerView.UNDEFINED_DURATION) != 0 && amber3 != null && !amber3.alpha(i140)) {
                                                AbstractC1392x1 abstractC1392x12 = (AbstractC1392x1) obj3;
                                                Z1 z16 = abstractC1392x12.zzc;
                                                if (z16 == z14) {
                                                    z16 = Z1.bravo();
                                                    abstractC1392x12.zzc = z16;
                                                }
                                                z16.charlie(i23, Long.valueOf(i140));
                                                break;
                                            } else {
                                                i59 |= i116;
                                                unsafe3.putInt(obj3, j5, i140);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        Object obj15 = obj7;
                                        unsafe3 = unsafe5;
                                        obj3 = obj15;
                                        bArr5 = bArr;
                                        agVar5 = agVar;
                                        i23 = i62;
                                        i24 = i72;
                                        if (i70 == 0) {
                                            i59 |= i116;
                                            golf2 = com.google.common.util.concurrent.c.golf(bArr5, i24, agVar5);
                                            int i141 = agVar5.alpha;
                                            unsafe3.putInt(obj3, j5, (i141 >>> 1) ^ (-(i141 & 1)));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 16:
                                        bArr5 = bArr;
                                        agVar5 = agVar;
                                        i23 = i62;
                                        i24 = i72;
                                        if (i70 == 0) {
                                            i59 |= i116;
                                            int juliet4 = com.google.common.util.concurrent.c.juliet(bArr5, i24, agVar5);
                                            unsafe5.putLong(obj7, j5, ge.ah.foxtrot(agVar5.bravo));
                                            obj7 = obj7;
                                            unsafe5 = unsafe5;
                                            i53 = i5;
                                            bArr11 = bArr5;
                                            i55 = juliet4;
                                            break;
                                        } else {
                                            Object obj16 = obj7;
                                            unsafe3 = unsafe5;
                                            obj3 = obj16;
                                            break;
                                        }
                                    default:
                                        if (i70 != i63) {
                                            agVar3 = agVar;
                                            unsafe2 = unsafe5;
                                            obj3 = obj7;
                                            z13 = z14;
                                            i16 = i58;
                                            i64 = 1048575;
                                            i19 = i67;
                                            i20 = i72;
                                            bArr3 = bArr;
                                            break;
                                        } else {
                                            i59 |= i116;
                                            Object beige2 = q12.beige(whiskey, obj7);
                                            int kilo4 = com.google.common.util.concurrent.c.kilo(beige2, q12.azure(whiskey), bArr, i72, i5, (i67 << 3) | 4, agVar);
                                            q12.mike(whiskey, obj7, beige2);
                                            i53 = i5;
                                            bArr11 = bArr;
                                            i57 = whiskey;
                                            agVar12 = agVar;
                                            i56 = i67;
                                            i63 = 3;
                                            i55 = kilo4;
                                        }
                                }
                            }
                        } else {
                            i11 = i10;
                            obj2 = obj7;
                            objArr = objArr2;
                            agVar2 = agVar12;
                            i15 = i67;
                            i16 = i58;
                            i17 = i65;
                            i18 = i59;
                            iArr = iArr2;
                            i12 = i62;
                            i57 = 0;
                            bArr2 = bArr;
                            unsafe = unsafe5;
                            z12 = z14;
                        }
                    } else {
                        i11 = i10;
                        obj2 = obj7;
                        objArr = objArr2;
                        int i142 = i58;
                        iArr = iArr2;
                        unsafe = unsafe5;
                        i12 = i62;
                        i13 = 1048575;
                        i14 = i142;
                    }
                }
            }
            if (i14 != i13) {
                unsafe.putInt(obj2, i14, i59);
            }
            for (int i143 = this.golf; i143 < this.hotel; i143++) {
                int i144 = this.foxtrot[i143];
                int i145 = iArr[i144];
                Object golf21 = AbstractC1311e2.golf(yankee(i144) & 1048575, obj2);
                if (golf21 != null && amber(i144) != null) {
                    int i146 = i144 / 3;
                    throw A0.z.hotel(objArr[i146 + i146]);
                }
            }
            if (i11 == 0) {
                if (i55 != i53) {
                    throw new zzmm("Failed to parse the message.");
                }
            } else if (i55 > i53 || i12 != i11) {
                throw new zzmm("Failed to parse the message.");
            }
            return i55;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj7)));
    }

    public final int whiskey(int i4, int i5) {
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

    public final int yankee(int i4) {
        return this.alpha[i4 + 1];
    }
}
