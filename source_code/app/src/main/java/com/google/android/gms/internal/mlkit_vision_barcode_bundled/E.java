package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
public final class E implements M {
    public static final int[] lima = new int[0];
    public static final Unsafe mike = W.hotel();
    public final int[] alpha;
    public final Object[] bravo;
    public final int charlie;
    public final int delta;
    public final B echo;
    public final boolean foxtrot;
    public final int[] golf;
    public final int hotel;
    public final int india;
    public final ah juliet;
    public final ah kilo;

    public E(int[] iArr, Object[] objArr, int i4, int i5, B b2, int[] iArr2, int i10, int i11, ah ahVar, ah ahVar2) {
        this.alpha = iArr;
        this.bravo = objArr;
        this.charlie = i4;
        this.delta = i5;
        boolean z2 = false;
        if (ahVar2 != null && (b2 instanceof aj)) {
            z2 = true;
        }
        this.foxtrot = z2;
        this.golf = iArr2;
        this.hotel = i10;
        this.india = i11;
        this.juliet = ahVar;
        this.kilo = ahVar2;
        this.echo = b2;
    }

    public static long amber(long j5, Object obj) {
        return ((Long) W.golf(j5, obj)).longValue();
    }

    public static Field bronze(Class cls, String str) {
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
        if (obj instanceof am) {
            return ((am) obj).kilo();
        }
        return true;
    }

    public static Q uniform(Object obj) {
        am amVar = (am) obj;
        Q q4 = amVar.zzc;
        if (q4 == Q.foxtrot) {
            Q bravo = Q.bravo();
            amVar.zzc = bravo;
            return bravo;
        }
        return q4;
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
    public static E victor(J j5, ah ahVar, ah ahVar2) {
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
        Field bronze;
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
        Field bronze2;
        Object obj2;
        Field bronze3;
        int i44;
        char charAt11;
        int i45;
        int i46;
        char charAt12;
        int i47;
        char charAt13;
        int i48;
        char charAt14;
        if (j5 instanceof J) {
            String str2 = j5.bravo;
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
                iArr = lima;
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
            Unsafe unsafe = mike;
            Class<?> cls = j5.alpha.getClass();
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
                Object[] objArr3 = j5.charlie;
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
                            if (j5.alpha() != 1 && i95 == 0) {
                                i43 = 0;
                                int i103 = i100 + i100;
                                obj = objArr3[i103];
                                int i104 = i43;
                                if (obj instanceof Field) {
                                    bronze2 = (Field) obj;
                                } else {
                                    bronze2 = bronze(cls, (String) obj);
                                    objArr3[i103] = bronze2;
                                }
                                int i105 = i5;
                                objArr = objArr2;
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(bronze2);
                                int i106 = i103 + 1;
                                obj2 = objArr3[i106];
                                if (obj2 instanceof Field) {
                                    bronze3 = (Field) obj2;
                                } else {
                                    bronze3 = bronze(cls, (String) obj2);
                                    objArr3[i106] = bronze3;
                                }
                                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(bronze3);
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
                        int objectFieldOffset22 = (int) unsafe.objectFieldOffset(bronze2);
                        int i1062 = i1032 + 1;
                        obj2 = objArr3[i1062];
                        if (obj2 instanceof Field) {
                        }
                        int objectFieldOffset32 = (int) unsafe.objectFieldOffset(bronze3);
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
                    int objectFieldOffset222 = (int) unsafe.objectFieldOffset(bronze2);
                    int i10622 = i10322 + 1;
                    obj2 = objArr3[i10622];
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset322 = (int) unsafe.objectFieldOffset(bronze3);
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
                    Field bronze4 = bronze(cls, (String) objArr3[i13]);
                    i26 = i109;
                    if (i93 == 9 || i93 == 17) {
                        i27 = i110;
                        int i111 = i84 / 3;
                        objArr[i111 + i111 + 1] = bronze4.getType();
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
                                            objectFieldOffset = (int) unsafe.objectFieldOffset(bronze4);
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
                                                    bronze = (Field) obj3;
                                                } else {
                                                    bronze = bronze(cls, (String) obj3);
                                                    objArr3[i118] = bronze;
                                                }
                                                i31 = charAt26 % 32;
                                                i29 = (int) unsafe.objectFieldOffset(bronze);
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
                                    if (j5.alpha() == 1 || i95 != 0) {
                                        i37 = i13 + 2;
                                        int i119 = i84 / 3;
                                        objArr[i119 + i119 + 1] = objArr3[i27];
                                        i27 = i37;
                                    }
                                }
                                i28 = 0;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(bronze4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(bronze4);
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
            return new E(iArr2, objArr2, i10, i12, j5.alpha, iArr, i14, i79, ahVar, ahVar2);
        }
        j5.getClass();
        throw new ClassCastException();
    }

    public static int whiskey(long j5, Object obj) {
        return ((Integer) W.golf(j5, obj)).intValue();
    }

    public static int yankee(int i4) {
        return (i4 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final Object alpha() {
        return (am) ((am) this.echo).mike(4, null);
    }

    public final ap azure(int i4) {
        int i5 = i4 / 3;
        return (ap) this.bravo[i5 + i5 + 1];
    }

    public final M beige(int i4) {
        int i5 = i4 / 3;
        int i10 = i5 + i5;
        Object[] objArr = this.bravo;
        M m4 = (M) objArr[i10];
        if (m4 != null) {
            return m4;
        }
        M alpha = H.charlie.alpha((Class) objArr[i10 + 1]);
        objArr[i10] = alpha;
        return alpha;
    }

    public final Object black(int i4, Object obj) {
        M beige = beige(i4);
        int zulu = zulu(i4) & 1048575;
        if (!papa(i4, obj)) {
            return beige.alpha();
        }
        Object object = mike.getObject(obj, zulu);
        if (romeo(object)) {
            return object;
        }
        Object alpha = beige.alpha();
        if (object != null) {
            beige.delta(alpha, object);
        }
        return alpha;
    }

    public final Object blue(int i4, int i5, Object obj) {
        M beige = beige(i5);
        if (!sierra(i4, i5, obj)) {
            return beige.alpha();
        }
        Object object = mike.getObject(obj, zulu(i5) & 1048575);
        if (romeo(object)) {
            return object;
        }
        Object alpha = beige.alpha();
        if (object != null) {
            beige.delta(alpha, object);
        }
        return alpha;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final void bravo(Object obj) {
        if (romeo(obj)) {
            if (obj instanceof am) {
                am amVar = (am) obj;
                amVar.india();
                amVar.zza = 0;
                amVar.golf();
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.alpha;
                if (i4 < iArr.length) {
                    int zulu = zulu(i4);
                    int i5 = 1048575 & zulu;
                    int yankee = yankee(zulu);
                    long j5 = i5;
                    if (yankee != 9) {
                        if (yankee != 60 && yankee != 68) {
                            switch (yankee) {
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
                                    r rVar = (r) ((as) W.golf(j5, obj));
                                    if (!rVar.alpha) {
                                        break;
                                    } else {
                                        rVar.alpha = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = mike;
                                    Object object = unsafe.getObject(obj, j5);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((ay) object).alpha = false;
                                        unsafe.putObject(obj, j5, object);
                                        break;
                                    }
                            }
                        } else if (sierra(iArr[i4], i4, obj)) {
                            beige(i4).bravo(mike.getObject(obj, j5));
                        }
                        i4 += 3;
                    }
                    if (papa(i4, obj)) {
                        beige(i4).bravo(mike.getObject(obj, j5));
                    }
                    i4 += 3;
                } else {
                    this.juliet.getClass();
                    Q q4 = ((am) obj).zzc;
                    if (q4.echo) {
                        q4.echo = false;
                    }
                    if (this.foxtrot) {
                        this.kilo.getClass();
                        ((aj) obj).zzb.delta();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ee, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean charlie(Object obj) {
        int i4;
        int i5;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        loop0: while (true) {
            if (i12 < this.hotel) {
                int i14 = this.golf[i12];
                int[] iArr = this.alpha;
                int i15 = iArr[i14];
                int zulu = zulu(i14);
                int i16 = iArr[i14 + 2];
                int i17 = i16 & 1048575;
                int i18 = 1 << (i16 >>> 20);
                if (i17 != i13) {
                    if (i17 != 1048575) {
                        i11 = mike.getInt(obj, i17);
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
                if ((268435456 & zulu) != 0 && !quebec(obj, i5, i4, i10, i18)) {
                    break;
                }
                int yankee = yankee(zulu);
                if (yankee != 9 && yankee != 17) {
                    if (yankee != 27) {
                        if (yankee != 60 && yankee != 68) {
                            if (yankee != 49) {
                                if (yankee == 50 && !((ay) W.golf(zulu & 1048575, obj)).isEmpty()) {
                                    int i20 = i5 / 3;
                                    throw A0.z.hotel(this.bravo[i20 + i20]);
                                }
                            }
                        } else if (sierra(i15, i5, obj) && !beige(i5).charlie(W.golf(zulu & 1048575, obj))) {
                            break;
                        }
                        i12++;
                        i13 = i4;
                        i11 = i10;
                    }
                    List list = (List) W.golf(zulu & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        M beige = beige(i5);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (!beige.charlie(list.get(i21))) {
                                break loop0;
                            }
                        }
                    }
                    i12++;
                    i13 = i4;
                    i11 = i10;
                } else {
                    if (quebec(obj, i5, i4, i10, i18) && !beige(i5).charlie(W.golf(zulu & 1048575, obj))) {
                        break;
                    }
                    i12++;
                    i13 = i4;
                    i11 = i10;
                }
            } else if (!this.foxtrot || ((aj) obj).zzb.foxtrot()) {
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final void delta(Object obj, Object obj2) {
        Object obj3;
        if (romeo(obj)) {
            obj2.getClass();
            int i4 = 0;
            while (true) {
                int[] iArr = this.alpha;
                if (i4 < iArr.length) {
                    int zulu = zulu(i4);
                    int i5 = zulu & 1048575;
                    int yankee = yankee(zulu);
                    int i10 = iArr[i4];
                    long j5 = i5;
                    switch (yankee) {
                        case 0:
                            if (papa(i4, obj2)) {
                                V v4 = W.charlie;
                                obj3 = obj;
                                v4.echo(obj3, j5, v4.alpha(j5, obj2));
                                lima(i4, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (papa(i4, obj2)) {
                                V v6 = W.charlie;
                                v6.foxtrot(obj, j5, v6.bravo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (papa(i4, obj2)) {
                                W.juliet(obj, j5, W.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (papa(i4, obj2)) {
                                W.juliet(obj, j5, W.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (papa(i4, obj2)) {
                                W.india(j5, W.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (papa(i4, obj2)) {
                                W.juliet(obj, j5, W.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (papa(i4, obj2)) {
                                W.india(j5, W.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (papa(i4, obj2)) {
                                V v10 = W.charlie;
                                v10.charlie(obj, j5, v10.golf(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (papa(i4, obj2)) {
                                W.kilo(obj, j5, W.golf(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 9:
                            juliet(i4, obj, obj2);
                            break;
                        case 10:
                            if (papa(i4, obj2)) {
                                W.kilo(obj, j5, W.golf(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (papa(i4, obj2)) {
                                W.india(j5, W.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (papa(i4, obj2)) {
                                W.india(j5, W.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (papa(i4, obj2)) {
                                W.india(j5, W.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (papa(i4, obj2)) {
                                W.juliet(obj, j5, W.echo(j5, obj2));
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (papa(i4, obj2)) {
                                W.india(j5, W.delta(j5, obj2), obj);
                                lima(i4, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (papa(i4, obj2)) {
                                W.juliet(obj, j5, W.echo(j5, obj2));
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
                            as asVar = (as) W.golf(j5, obj);
                            as asVar2 = (as) W.golf(j5, obj2);
                            int size = asVar.size();
                            int size2 = asVar2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((r) asVar).alpha) {
                                    asVar = asVar.foxtrot(size2 + size);
                                }
                                asVar.addAll(asVar2);
                            }
                            if (size > 0) {
                                asVar2 = asVar;
                            }
                            W.kilo(obj, j5, asVar2);
                            break;
                        case 50:
                            ah ahVar = N.alpha;
                            W.kilo(obj, j5, ah.delta(W.golf(j5, obj), W.golf(j5, obj2)));
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
                                W.kilo(obj, j5, W.golf(j5, obj2));
                                W.india(iArr[i4 + 2] & 1048575, i10, obj);
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
                                W.kilo(obj, j5, W.golf(j5, obj2));
                                W.india(iArr[i4 + 2] & 1048575, i10, obj);
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
                    Object obj4 = obj;
                    N.quebec(obj4, obj2);
                    if (this.foxtrot) {
                        N.papa(obj4, obj2);
                        return;
                    }
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final void echo(Object obj, byte[] bArr, int i4, int i5, C1425t c1425t) {
        tango(obj, bArr, i4, i5, 0, c1425t);
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
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int foxtrot(am amVar) {
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
                int zulu = zulu(i12);
                int i14 = 1048575 & zulu;
                int yankee = yankee(zulu);
                int i15 = iArr[i12];
                long j5 = i14;
                int i16 = 1237;
                int i17 = 37;
                switch (yankee) {
                    case 0:
                        i4 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(W.charlie.alpha(j5, amVar));
                        Charset charset = at.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i5 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(W.charlie.bravo(j5, amVar));
                        i13 = floatToIntBits + i5;
                        break;
                    case 2:
                        i4 = i13 * 53;
                        doubleToLongBits = W.echo(j5, amVar);
                        Charset charset2 = at.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i4 = i13 * 53;
                        doubleToLongBits = W.echo(j5, amVar);
                        Charset charset3 = at.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i5 = i13 * 53;
                        floatToIntBits = W.delta(j5, amVar);
                        i13 = floatToIntBits + i5;
                        break;
                    case 5:
                        i4 = i13 * 53;
                        doubleToLongBits = W.echo(j5, amVar);
                        Charset charset4 = at.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i5 = i13 * 53;
                        floatToIntBits = W.delta(j5, amVar);
                        i13 = floatToIntBits + i5;
                        break;
                    case 7:
                        i10 = i13 * 53;
                        boolean golf = W.charlie.golf(j5, amVar);
                        Charset charset5 = at.alpha;
                        break;
                    case 8:
                        i5 = i13 * 53;
                        floatToIntBits = ((String) W.golf(j5, amVar)).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 9:
                        i11 = i13 * 53;
                        Object golf2 = W.golf(j5, amVar);
                        if (golf2 != null) {
                            i17 = golf2.hashCode();
                        }
                        i13 = i11 + i17;
                        break;
                    case 10:
                        i5 = i13 * 53;
                        floatToIntBits = W.golf(j5, amVar).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 11:
                        i5 = i13 * 53;
                        floatToIntBits = W.delta(j5, amVar);
                        i13 = floatToIntBits + i5;
                        break;
                    case 12:
                        i5 = i13 * 53;
                        floatToIntBits = W.delta(j5, amVar);
                        i13 = floatToIntBits + i5;
                        break;
                    case 13:
                        i5 = i13 * 53;
                        floatToIntBits = W.delta(j5, amVar);
                        i13 = floatToIntBits + i5;
                        break;
                    case 14:
                        i4 = i13 * 53;
                        doubleToLongBits = W.echo(j5, amVar);
                        Charset charset6 = at.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i5 = i13 * 53;
                        floatToIntBits = W.delta(j5, amVar);
                        i13 = floatToIntBits + i5;
                        break;
                    case 16:
                        i4 = i13 * 53;
                        doubleToLongBits = W.echo(j5, amVar);
                        Charset charset7 = at.alpha;
                        i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 17:
                        i11 = i13 * 53;
                        Object golf3 = W.golf(j5, amVar);
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
                        floatToIntBits = W.golf(j5, amVar).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 50:
                        i5 = i13 * 53;
                        floatToIntBits = W.golf(j5, amVar).hashCode();
                        i13 = floatToIntBits + i5;
                        break;
                    case 51:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = Double.doubleToLongBits(((Double) W.golf(j5, amVar)).doubleValue());
                            Charset charset8 = at.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 52:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = Float.floatToIntBits(((Float) W.golf(j5, amVar)).floatValue());
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 53:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = amber(j5, amVar);
                            Charset charset9 = at.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 54:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = amber(j5, amVar);
                            Charset charset10 = at.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 55:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = whiskey(j5, amVar);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 56:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = amber(j5, amVar);
                            Charset charset11 = at.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 57:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = whiskey(j5, amVar);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 58:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i10 = i13 * 53;
                            boolean booleanValue = ((Boolean) W.golf(j5, amVar)).booleanValue();
                            Charset charset12 = at.alpha;
                            break;
                        }
                    case 59:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = ((String) W.golf(j5, amVar)).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 60:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = W.golf(j5, amVar).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 61:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = W.golf(j5, amVar).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 62:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = whiskey(j5, amVar);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 63:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = whiskey(j5, amVar);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 64:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = whiskey(j5, amVar);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 65:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = amber(j5, amVar);
                            Charset charset13 = at.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 66:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = whiskey(j5, amVar);
                            i13 = floatToIntBits + i5;
                            break;
                        }
                    case 67:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i4 = i13 * 53;
                            doubleToLongBits = amber(j5, amVar);
                            Charset charset14 = at.alpha;
                            i13 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 68:
                        if (!sierra(i15, i12, amVar)) {
                            break;
                        } else {
                            i5 = i13 * 53;
                            floatToIntBits = W.golf(j5, amVar).hashCode();
                            i13 = floatToIntBits + i5;
                            break;
                        }
                }
                i12 += 3;
            } else {
                int hashCode = amVar.zzc.hashCode() + (i13 * 53);
                if (this.foxtrot) {
                    return ((aj) amVar).zzb.alpha.hashCode() + (hashCode * 53);
                }
                return hashCode;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final int golf(am amVar) {
        int i4;
        int romeo;
        int sierra;
        int i5;
        int bravo;
        int hotel;
        int romeo2;
        int size;
        int november;
        int romeo3;
        int romeo4;
        int romeo5;
        int i10;
        int romeo6;
        int sierra2;
        E e = this;
        am amVar2 = amVar;
        Unsafe unsafe = mike;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = e.alpha;
            if (i13 < iArr.length) {
                int zulu = e.zulu(i13);
                int yankee = yankee(zulu);
                int i16 = iArr[i13];
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                if (yankee <= 17) {
                    if (i18 != i12) {
                        if (i18 == i11) {
                            i14 = 0;
                        } else {
                            i14 = unsafe.getInt(amVar2, i18);
                        }
                        i12 = i18;
                    }
                    i4 = 1 << (i17 >>> 20);
                } else {
                    i4 = 0;
                }
                int i19 = zulu & i11;
                if (yankee >= af.purple.alpha) {
                    af.red.getClass();
                }
                long j5 = i19;
                switch (yankee) {
                    case 0:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 1:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 4, i15);
                        }
                        e = this;
                        amVar2 = amVar;
                        i13 += 3;
                        i11 = 1048575;
                    case 2:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            long j6 = unsafe.getLong(amVar2, j5);
                            romeo = aa.romeo(i16 << 3);
                            sierra = aa.sierra(j6);
                            i15 += sierra + romeo;
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 3:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            long j7 = unsafe.getLong(amVar2, j5);
                            romeo = aa.romeo(i16 << 3);
                            sierra = aa.sierra(j7);
                            i15 += sierra + romeo;
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 4:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            long j10 = unsafe.getInt(amVar2, j5);
                            romeo = aa.romeo(i16 << 3);
                            sierra = aa.sierra(j10);
                            i15 += sierra + romeo;
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 5:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 8, i15);
                        }
                        e = this;
                        amVar2 = amVar;
                        i13 += 3;
                        i11 = 1048575;
                    case 6:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 4, i15);
                        }
                        e = this;
                        amVar2 = amVar;
                        i13 += 3;
                        i11 = 1048575;
                    case 7:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 1, i15);
                        }
                        e = this;
                        amVar2 = amVar;
                        i13 += 3;
                        i11 = 1048575;
                    case 8:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            int i20 = i16 << 3;
                            Object object = unsafe.getObject(amVar2, j5);
                            if (object instanceof AbstractC1431z) {
                                int romeo7 = aa.romeo(i20);
                                int hotel2 = ((AbstractC1431z) object).hotel();
                                i15 = ao.ad.green(hotel2, hotel2, romeo7, i15);
                            } else {
                                romeo = aa.romeo(i20);
                                sierra = aa.cyan((String) object);
                                i15 += sierra + romeo;
                            }
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 9:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            Object object2 = unsafe.getObject(amVar2, j5);
                            M beige = e.beige(i13);
                            ah ahVar = N.alpha;
                            int romeo8 = aa.romeo(i16 << 3);
                            int bravo2 = ((AbstractC1423q) ((B) object2)).bravo(beige);
                            i15 = ao.ad.green(bravo2, bravo2, romeo8, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 10:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            AbstractC1431z abstractC1431z = (AbstractC1431z) unsafe.getObject(amVar2, j5);
                            int romeo9 = aa.romeo(i16 << 3);
                            int hotel3 = abstractC1431z.hotel();
                            i15 = ao.ad.green(hotel3, hotel3, romeo9, i15);
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 11:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(unsafe.getInt(amVar2, j5), aa.romeo(i16 << 3), i15);
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 12:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            long j11 = unsafe.getInt(amVar2, j5);
                            romeo = aa.romeo(i16 << 3);
                            sierra = aa.sierra(j11);
                            i15 += sierra + romeo;
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 13:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 4, i15);
                        }
                        e = this;
                        amVar2 = amVar;
                        i13 += 3;
                        i11 = 1048575;
                    case 14:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 8, i15);
                        }
                        e = this;
                        amVar2 = amVar;
                        i13 += 3;
                        i11 = 1048575;
                    case 15:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            int i21 = unsafe.getInt(amVar2, j5);
                            i15 = ao.ad.fuchsia((i21 >> 31) ^ (i21 + i21), aa.romeo(i16 << 3), i15);
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 16:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            long j12 = unsafe.getLong(amVar2, j5);
                            romeo = aa.romeo(i16 << 3);
                            sierra = aa.sierra((j12 >> 63) ^ (j12 + j12));
                            i15 += sierra + romeo;
                        }
                        e = this;
                        i13 += 3;
                        i11 = 1048575;
                    case 17:
                        if (e.quebec(amVar2, i13, i12, i14, i4)) {
                            B b2 = (B) unsafe.getObject(amVar2, j5);
                            M beige2 = e.beige(i13);
                            int romeo10 = aa.romeo(i16 << 3);
                            i5 = romeo10 + romeo10;
                            bravo = ((AbstractC1423q) b2).bravo(beige2);
                            hotel = bravo + i5;
                            i15 += hotel;
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            i13 += 3;
                            i11 = 1048575;
                        }
                    case 18:
                        hotel = N.hotel(i16, (List) unsafe.getObject(amVar2, j5));
                        i15 += hotel;
                        i13 += 3;
                        i11 = 1048575;
                    case 19:
                        hotel = N.golf(i16, (List) unsafe.getObject(amVar2, j5));
                        i15 += hotel;
                        i13 += 3;
                        i11 = 1048575;
                    case 20:
                        List list = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar2 = N.alpha;
                        if (list.size() != 0) {
                            romeo2 = (aa.romeo(i16 << 3) * list.size()) + N.juliet(list);
                            i15 += romeo2;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo2 = 0;
                        i15 += romeo2;
                        i13 += 3;
                        i11 = 1048575;
                    case 21:
                        List list2 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar3 = N.alpha;
                        size = list2.size();
                        if (size != 0) {
                            november = N.november(list2);
                            romeo3 = aa.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 22:
                        List list3 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar4 = N.alpha;
                        size = list3.size();
                        if (size != 0) {
                            november = N.india(list3);
                            romeo3 = aa.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 23:
                        hotel = N.hotel(i16, (List) unsafe.getObject(amVar2, j5));
                        i15 += hotel;
                        i13 += 3;
                        i11 = 1048575;
                    case 24:
                        hotel = N.golf(i16, (List) unsafe.getObject(amVar2, j5));
                        i15 += hotel;
                        i13 += 3;
                        i11 = 1048575;
                    case 25:
                        List list4 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar5 = N.alpha;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            romeo2 = (aa.romeo(i16 << 3) + 1) * size2;
                            i15 += romeo2;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo2 = 0;
                        i15 += romeo2;
                        i13 += 3;
                        i11 = 1048575;
                    case 26:
                        List list5 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar6 = N.alpha;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            romeo4 = aa.romeo(i16 << 3) * size3;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj = list5.get(i22);
                                if (obj instanceof AbstractC1431z) {
                                    int hotel4 = ((AbstractC1431z) obj).hotel();
                                    romeo4 = ao.ad.fuchsia(hotel4, hotel4, romeo4);
                                } else {
                                    romeo4 = aa.cyan((String) obj) + romeo4;
                                }
                            }
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 27:
                        List list6 = (List) unsafe.getObject(amVar2, j5);
                        M beige3 = e.beige(i13);
                        ah ahVar7 = N.alpha;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            romeo5 = 0;
                        } else {
                            romeo5 = aa.romeo(i16 << 3) * size4;
                            for (int i23 = 0; i23 < size4; i23++) {
                                int bravo3 = ((AbstractC1423q) ((B) list6.get(i23))).bravo(beige3);
                                romeo5 = ao.ad.fuchsia(bravo3, bravo3, romeo5);
                            }
                        }
                        i15 += romeo5;
                        i13 += 3;
                        i11 = 1048575;
                    case 28:
                        List list7 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar8 = N.alpha;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            romeo4 = aa.romeo(i16 << 3) * size5;
                            for (int i24 = 0; i24 < list7.size(); i24++) {
                                int hotel5 = ((AbstractC1431z) list7.get(i24)).hotel();
                                romeo4 = ao.ad.fuchsia(hotel5, hotel5, romeo4);
                            }
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 29:
                        List list8 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar9 = N.alpha;
                        size = list8.size();
                        if (size != 0) {
                            november = N.mike(list8);
                            romeo3 = aa.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 30:
                        List list9 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar10 = N.alpha;
                        size = list9.size();
                        if (size != 0) {
                            november = N.foxtrot(list9);
                            romeo3 = aa.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 31:
                        hotel = N.golf(i16, (List) unsafe.getObject(amVar2, j5));
                        i15 += hotel;
                        i13 += 3;
                        i11 = 1048575;
                    case 32:
                        hotel = N.hotel(i16, (List) unsafe.getObject(amVar2, j5));
                        i15 += hotel;
                        i13 += 3;
                        i11 = 1048575;
                    case 33:
                        List list10 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar11 = N.alpha;
                        size = list10.size();
                        if (size != 0) {
                            november = N.kilo(list10);
                            romeo3 = aa.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 34:
                        List list11 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar12 = N.alpha;
                        size = list11.size();
                        if (size != 0) {
                            november = N.lima(list11);
                            romeo3 = aa.romeo(i16 << 3);
                            romeo4 = (romeo3 * size) + november;
                            i15 += romeo4;
                            i13 += 3;
                            i11 = 1048575;
                        }
                        romeo4 = 0;
                        i15 += romeo4;
                        i13 += 3;
                        i11 = 1048575;
                    case 35:
                        List list12 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar13 = N.alpha;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i15 = ao.ad.green(size6, aa.romeo(i16 << 3), size6, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 36:
                        List list13 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar14 = N.alpha;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i15 = ao.ad.green(size7, aa.romeo(i16 << 3), size7, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 37:
                        int juliet = N.juliet((List) unsafe.getObject(amVar2, j5));
                        if (juliet > 0) {
                            i15 = ao.ad.green(juliet, aa.romeo(i16 << 3), juliet, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 38:
                        int november2 = N.november((List) unsafe.getObject(amVar2, j5));
                        if (november2 > 0) {
                            i15 = ao.ad.green(november2, aa.romeo(i16 << 3), november2, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 39:
                        int india = N.india((List) unsafe.getObject(amVar2, j5));
                        if (india > 0) {
                            i15 = ao.ad.green(india, aa.romeo(i16 << 3), india, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 40:
                        List list14 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar15 = N.alpha;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i15 = ao.ad.green(size8, aa.romeo(i16 << 3), size8, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 41:
                        List list15 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar16 = N.alpha;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i15 = ao.ad.green(size9, aa.romeo(i16 << 3), size9, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 42:
                        List list16 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar17 = N.alpha;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i15 = ao.ad.green(size10, aa.romeo(i16 << 3), size10, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 43:
                        int mike2 = N.mike((List) unsafe.getObject(amVar2, j5));
                        if (mike2 > 0) {
                            i15 = ao.ad.green(mike2, aa.romeo(i16 << 3), mike2, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 44:
                        int foxtrot = N.foxtrot((List) unsafe.getObject(amVar2, j5));
                        if (foxtrot > 0) {
                            i15 = ao.ad.green(foxtrot, aa.romeo(i16 << 3), foxtrot, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 45:
                        List list17 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar18 = N.alpha;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i15 = ao.ad.green(size11, aa.romeo(i16 << 3), size11, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 46:
                        List list18 = (List) unsafe.getObject(amVar2, j5);
                        ah ahVar19 = N.alpha;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i15 = ao.ad.green(size12, aa.romeo(i16 << 3), size12, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 47:
                        int kilo = N.kilo((List) unsafe.getObject(amVar2, j5));
                        if (kilo > 0) {
                            i15 = ao.ad.green(kilo, aa.romeo(i16 << 3), kilo, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 48:
                        int lima2 = N.lima((List) unsafe.getObject(amVar2, j5));
                        if (lima2 > 0) {
                            i15 = ao.ad.green(lima2, aa.romeo(i16 << 3), lima2, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 49:
                        List list19 = (List) unsafe.getObject(amVar2, j5);
                        M beige4 = e.beige(i13);
                        ah ahVar20 = N.alpha;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            for (int i25 = 0; i25 < size13; i25++) {
                                B b4 = (B) list19.get(i25);
                                int romeo11 = aa.romeo(i16 << 3);
                                i10 += ((AbstractC1423q) b4).bravo(beige4) + romeo11 + romeo11;
                            }
                        }
                        i15 += i10;
                        i13 += 3;
                        i11 = 1048575;
                    case 50:
                        Object object3 = unsafe.getObject(amVar2, j5);
                        int i26 = i13 / 3;
                        ay ayVar = (ay) object3;
                        if (e.bravo[i26 + i26] == null) {
                            if (ayVar.isEmpty()) {
                                continue;
                            } else {
                                Iterator it = ayVar.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getKey();
                                    entry.getValue();
                                    throw null;
                                }
                            }
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            throw new ClassCastException();
                        }
                    case 51:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 52:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 4, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 53:
                        if (e.sierra(i16, i13, amVar2)) {
                            long amber = amber(j5, amVar2);
                            romeo6 = aa.romeo(i16 << 3);
                            sierra2 = aa.sierra(amber);
                            i15 += sierra2 + romeo6;
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            i13 += 3;
                            i11 = 1048575;
                        }
                    case 54:
                        if (e.sierra(i16, i13, amVar2)) {
                            long amber2 = amber(j5, amVar2);
                            romeo6 = aa.romeo(i16 << 3);
                            sierra2 = aa.sierra(amber2);
                            i15 += sierra2 + romeo6;
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            i13 += 3;
                            i11 = 1048575;
                        }
                    case 55:
                        if (e.sierra(i16, i13, amVar2)) {
                            long whiskey = whiskey(j5, amVar2);
                            romeo6 = aa.romeo(i16 << 3);
                            sierra2 = aa.sierra(whiskey);
                            i15 += sierra2 + romeo6;
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            i13 += 3;
                            i11 = 1048575;
                        }
                    case 56:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 57:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 4, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 58:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 1, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 59:
                        if (e.sierra(i16, i13, amVar2)) {
                            int i27 = i16 << 3;
                            Object object4 = unsafe.getObject(amVar2, j5);
                            if (object4 instanceof AbstractC1431z) {
                                int romeo12 = aa.romeo(i27);
                                int hotel6 = ((AbstractC1431z) object4).hotel();
                                i15 = ao.ad.green(hotel6, hotel6, romeo12, i15);
                            } else {
                                romeo6 = aa.romeo(i27);
                                sierra2 = aa.cyan((String) object4);
                                i15 += sierra2 + romeo6;
                            }
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 60:
                        if (e.sierra(i16, i13, amVar2)) {
                            Object object5 = unsafe.getObject(amVar2, j5);
                            M beige5 = e.beige(i13);
                            ah ahVar21 = N.alpha;
                            int romeo13 = aa.romeo(i16 << 3);
                            int bravo4 = ((AbstractC1423q) ((B) object5)).bravo(beige5);
                            i15 = ao.ad.green(bravo4, bravo4, romeo13, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 61:
                        if (e.sierra(i16, i13, amVar2)) {
                            AbstractC1431z abstractC1431z2 = (AbstractC1431z) unsafe.getObject(amVar2, j5);
                            int romeo14 = aa.romeo(i16 << 3);
                            int hotel7 = abstractC1431z2.hotel();
                            i15 = ao.ad.green(hotel7, hotel7, romeo14, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 62:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(whiskey(j5, amVar2), aa.romeo(i16 << 3), i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 63:
                        if (e.sierra(i16, i13, amVar2)) {
                            long whiskey2 = whiskey(j5, amVar2);
                            romeo6 = aa.romeo(i16 << 3);
                            sierra2 = aa.sierra(whiskey2);
                            i15 += sierra2 + romeo6;
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            i13 += 3;
                            i11 = 1048575;
                        }
                    case 64:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 4, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 65:
                        if (e.sierra(i16, i13, amVar2)) {
                            i15 = ao.ad.fuchsia(i16 << 3, 8, i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 66:
                        if (e.sierra(i16, i13, amVar2)) {
                            int whiskey3 = whiskey(j5, amVar2);
                            i15 = ao.ad.fuchsia((whiskey3 >> 31) ^ (whiskey3 + whiskey3), aa.romeo(i16 << 3), i15);
                        }
                        i13 += 3;
                        i11 = 1048575;
                    case 67:
                        if (e.sierra(i16, i13, amVar2)) {
                            long amber3 = amber(j5, amVar2);
                            romeo6 = aa.romeo(i16 << 3);
                            sierra2 = aa.sierra((amber3 >> 63) ^ (amber3 + amber3));
                            i15 += sierra2 + romeo6;
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            i13 += 3;
                            i11 = 1048575;
                        }
                    case 68:
                        if (e.sierra(i16, i13, amVar2)) {
                            B b6 = (B) unsafe.getObject(amVar2, j5);
                            M beige6 = e.beige(i13);
                            int romeo15 = aa.romeo(i16 << 3);
                            i5 = romeo15 + romeo15;
                            bravo = ((AbstractC1423q) b6).bravo(beige6);
                            hotel = bravo + i5;
                            i15 += hotel;
                            i13 += 3;
                            i11 = 1048575;
                        } else {
                            i13 += 3;
                            i11 = 1048575;
                        }
                    default:
                        i13 += 3;
                        i11 = 1048575;
                }
            } else {
                int alpha = amVar2.zzc.alpha() + i15;
                if (e.foxtrot) {
                    ae aeVar = ((aj) amVar2).zzb;
                    int i28 = aeVar.alpha.purple;
                    int i29 = 0;
                    int i30 = 0;
                    while (true) {
                        O o5 = aeVar.alpha;
                        if (i29 < i28) {
                            P charlie = o5.charlie(i29);
                            i30 = ae.alpha((ak) charlie.alpha, charlie.purple) + i30;
                            i29++;
                        } else {
                            for (Map.Entry entry2 : o5.alpha()) {
                                i30 = ae.alpha((ak) entry2.getKey(), entry2.getValue()) + i30;
                            }
                            return alpha + i30;
                        }
                    }
                } else {
                    return alpha;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hotel(am amVar, am amVar2) {
        boolean echo;
        int i4 = 0;
        while (true) {
            int[] iArr = this.alpha;
            if (i4 < iArr.length) {
                int zulu = zulu(i4);
                long j5 = zulu & 1048575;
                switch (yankee(zulu)) {
                    case 0:
                        if (!oscar(amVar, amVar2, i4)) {
                            break;
                        } else {
                            V v4 = W.charlie;
                            if (Double.doubleToLongBits(v4.alpha(j5, amVar)) != Double.doubleToLongBits(v4.alpha(j5, amVar2))) {
                                break;
                            } else {
                                i4 += 3;
                            }
                        }
                    case 1:
                        if (!oscar(amVar, amVar2, i4)) {
                            break;
                        } else {
                            V v6 = W.charlie;
                            if (Float.floatToIntBits(v6.bravo(j5, amVar)) != Float.floatToIntBits(v6.bravo(j5, amVar2))) {
                                break;
                            } else {
                                i4 += 3;
                            }
                        }
                    case 2:
                        if (oscar(amVar, amVar2, i4) && W.echo(j5, amVar) == W.echo(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 3:
                        if (oscar(amVar, amVar2, i4) && W.echo(j5, amVar) == W.echo(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 4:
                        if (oscar(amVar, amVar2, i4) && W.delta(j5, amVar) == W.delta(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 5:
                        if (oscar(amVar, amVar2, i4) && W.echo(j5, amVar) == W.echo(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 6:
                        if (oscar(amVar, amVar2, i4) && W.delta(j5, amVar) == W.delta(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 7:
                        if (!oscar(amVar, amVar2, i4)) {
                            break;
                        } else {
                            V v10 = W.charlie;
                            if (v10.golf(j5, amVar) != v10.golf(j5, amVar2)) {
                                break;
                            } else {
                                i4 += 3;
                            }
                        }
                    case 8:
                        if (oscar(amVar, amVar2, i4) && N.echo(W.golf(j5, amVar), W.golf(j5, amVar2))) {
                            i4 += 3;
                        }
                        break;
                    case 9:
                        if (oscar(amVar, amVar2, i4) && N.echo(W.golf(j5, amVar), W.golf(j5, amVar2))) {
                            i4 += 3;
                        }
                        break;
                    case 10:
                        if (oscar(amVar, amVar2, i4) && N.echo(W.golf(j5, amVar), W.golf(j5, amVar2))) {
                            i4 += 3;
                        }
                        break;
                    case 11:
                        if (oscar(amVar, amVar2, i4) && W.delta(j5, amVar) == W.delta(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 12:
                        if (oscar(amVar, amVar2, i4) && W.delta(j5, amVar) == W.delta(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 13:
                        if (oscar(amVar, amVar2, i4) && W.delta(j5, amVar) == W.delta(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 14:
                        if (oscar(amVar, amVar2, i4) && W.echo(j5, amVar) == W.echo(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 15:
                        if (oscar(amVar, amVar2, i4) && W.delta(j5, amVar) == W.delta(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 16:
                        if (oscar(amVar, amVar2, i4) && W.echo(j5, amVar) == W.echo(j5, amVar2)) {
                            i4 += 3;
                        }
                        break;
                    case 17:
                        if (oscar(amVar, amVar2, i4) && N.echo(W.golf(j5, amVar), W.golf(j5, amVar2))) {
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
                        echo = N.echo(W.golf(j5, amVar), W.golf(j5, amVar2));
                        if (echo) {
                            break;
                        } else {
                            i4 += 3;
                        }
                    case 50:
                        echo = N.echo(W.golf(j5, amVar), W.golf(j5, amVar2));
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
                        if (W.delta(j6, amVar) == W.delta(j6, amVar2) && N.echo(W.golf(j5, amVar), W.golf(j5, amVar2))) {
                            i4 += 3;
                        }
                        break;
                    default:
                        i4 += 3;
                }
            } else if (amVar.zzc.equals(amVar2.zzc)) {
                if (this.foxtrot) {
                    return ((aj) amVar).zzb.equals(((aj) amVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0091. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void india(Object obj, ax axVar) {
        Map.Entry entry;
        Iterator it;
        int i4;
        int i5;
        int i10;
        int length;
        int i11;
        int i12;
        Map.Entry entry2;
        int i13;
        boolean z2;
        boolean z10;
        E e = this;
        if (e.foxtrot) {
            ae aeVar = ((aj) obj).zzb;
            if (!aeVar.alpha.isEmpty()) {
                Iterator charlie = aeVar.charlie();
                entry = (Map.Entry) charlie.next();
                it = charlie;
                Unsafe unsafe = mike;
                i4 = 1048575;
                i5 = 0;
                i10 = 0;
                while (true) {
                    int[] iArr = e.alpha;
                    length = iArr.length;
                    ah ahVar = e.kilo;
                    if (i5 >= length) {
                        int zulu = e.zulu(i5);
                        int yankee = yankee(zulu);
                        int i14 = iArr[i5];
                        if (yankee <= 17) {
                            int i15 = iArr[i5 + 2];
                            Map.Entry entry3 = entry;
                            int i16 = i15 & 1048575;
                            if (i16 != i4) {
                                if (i16 == 1048575) {
                                    i10 = 0;
                                } else {
                                    i10 = unsafe.getInt(obj, i16);
                                }
                                i4 = i16;
                            }
                            int i17 = 1 << (i15 >>> 20);
                            int i18 = i10;
                            i13 = i17;
                            i11 = i4;
                            i12 = i18;
                            entry2 = entry3;
                        } else {
                            Map.Entry entry4 = entry;
                            i11 = i4;
                            i12 = i10;
                            entry2 = entry4;
                            i13 = 0;
                        }
                        while (entry2 != null) {
                            ((ak) entry2.getKey()).getClass();
                            if (i14 >= 0) {
                                ahVar.getClass();
                                ah.echo(axVar, entry2);
                                if (it.hasNext()) {
                                    entry2 = (Map.Entry) it.next();
                                } else {
                                    entry2 = null;
                                }
                            } else {
                                long j5 = zulu & 1048575;
                                switch (yankee) {
                                    case 0:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).yankee(i14, Double.doubleToRawLongBits(W.charlie.alpha(j5, obj)));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 1:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).whiskey(i14, Float.floatToRawIntBits(W.charlie.bravo(j5, obj)));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 2:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).coral(i14, unsafe.getLong(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 3:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).coral(i14, unsafe.getLong(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 4:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).amber(i14, unsafe.getInt(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 5:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).yankee(i14, unsafe.getLong(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 6:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).whiskey(i14, unsafe.getInt(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 7:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            boolean golf = W.charlie.golf(j5, obj);
                                            aa aaVar = (aa) axVar.alpha;
                                            aaVar.bronze(i14 << 3);
                                            aaVar.tango(golf ? (byte) 1 : (byte) 0);
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 8:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            Object object = unsafe.getObject(obj, j5);
                                            if (object instanceof String) {
                                                ((aa) axVar.alpha).beige(i14, (String) object);
                                            } else {
                                                ((aa) axVar.alpha).victor(i14, (AbstractC1431z) object);
                                            }
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 9:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            axVar.echo(i14, unsafe.getObject(obj, j5), e.beige(i5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 10:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).victor(i14, (AbstractC1431z) unsafe.getObject(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 11:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).blue(i14, unsafe.getInt(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 12:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).amber(i14, unsafe.getInt(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 13:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).whiskey(i14, unsafe.getInt(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 14:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            ((aa) axVar.alpha).yankee(i14, unsafe.getLong(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 15:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            int i19 = unsafe.getInt(obj, j5);
                                            ((aa) axVar.alpha).blue(i14, (i19 >> 31) ^ (i19 + i19));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 16:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            long j6 = unsafe.getLong(obj, j5);
                                            ((aa) axVar.alpha).coral(i14, (j6 + j6) ^ (j6 >> 63));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 17:
                                        if (e.quebec(obj, i5, i11, i12, i13)) {
                                            axVar.delta(i14, unsafe.getObject(obj, j5), e.beige(i5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 18:
                                        z2 = false;
                                        N.sierra(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 19:
                                        z2 = false;
                                        N.whiskey(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 20:
                                        z2 = false;
                                        N.yankee(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 21:
                                        z2 = false;
                                        N.delta(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 22:
                                        z2 = false;
                                        N.xray(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 23:
                                        z2 = false;
                                        N.victor(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 24:
                                        z2 = false;
                                        N.uniform(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 25:
                                        z2 = false;
                                        N.romeo(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 26:
                                        int i20 = iArr[i5];
                                        List list = (List) unsafe.getObject(obj, j5);
                                        ah ahVar2 = N.alpha;
                                        if (list != null && !list.isEmpty()) {
                                            axVar.getClass();
                                            for (int i21 = 0; i21 < list.size(); i21++) {
                                                ((aa) axVar.alpha).beige(i20, (String) list.get(i21));
                                            }
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                        break;
                                    case 27:
                                        int i22 = iArr[i5];
                                        List list2 = (List) unsafe.getObject(obj, j5);
                                        M beige = e.beige(i5);
                                        ah ahVar3 = N.alpha;
                                        if (list2 != null && !list2.isEmpty()) {
                                            for (int i23 = 0; i23 < list2.size(); i23++) {
                                                axVar.echo(i22, list2.get(i23), beige);
                                            }
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                        break;
                                    case 28:
                                        int i24 = iArr[i5];
                                        List list3 = (List) unsafe.getObject(obj, j5);
                                        ah ahVar4 = N.alpha;
                                        if (list3 != null && !list3.isEmpty()) {
                                            axVar.getClass();
                                            for (int i25 = 0; i25 < list3.size(); i25++) {
                                                ((aa) axVar.alpha).victor(i24, (AbstractC1431z) list3.get(i25));
                                            }
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                        break;
                                    case 29:
                                        z10 = false;
                                        N.charlie(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 30:
                                        z10 = false;
                                        N.tango(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 31:
                                        z10 = false;
                                        N.zulu(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 32:
                                        z10 = false;
                                        N.amber(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 33:
                                        z10 = false;
                                        N.alpha(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 34:
                                        z10 = false;
                                        N.bravo(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, false);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 35:
                                        N.sierra(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 36:
                                        N.whiskey(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 37:
                                        N.yankee(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 38:
                                        N.delta(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 39:
                                        N.xray(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 40:
                                        N.victor(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 41:
                                        N.uniform(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 42:
                                        N.romeo(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 43:
                                        N.charlie(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 44:
                                        N.tango(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 45:
                                        N.zulu(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 46:
                                        N.amber(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 47:
                                        N.alpha(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 48:
                                        N.bravo(iArr[i5], (List) unsafe.getObject(obj, j5), axVar, true);
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 49:
                                        int i26 = iArr[i5];
                                        List list4 = (List) unsafe.getObject(obj, j5);
                                        M beige2 = e.beige(i5);
                                        ah ahVar5 = N.alpha;
                                        if (list4 != null && !list4.isEmpty()) {
                                            for (int i27 = 0; i27 < list4.size(); i27++) {
                                                axVar.delta(i26, list4.get(i27), beige2);
                                            }
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                        break;
                                    case 50:
                                        if (unsafe.getObject(obj, j5) != null) {
                                            int i28 = i5 / 3;
                                            throw A0.z.hotel(e.bravo[i28 + i28]);
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 51:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).yankee(i14, Double.doubleToRawLongBits(((Double) W.golf(j5, obj)).doubleValue()));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 52:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).whiskey(i14, Float.floatToRawIntBits(((Float) W.golf(j5, obj)).floatValue()));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 53:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).coral(i14, amber(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 54:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).coral(i14, amber(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 55:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).amber(i14, whiskey(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 56:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).yankee(i14, amber(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 57:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).whiskey(i14, whiskey(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 58:
                                        if (e.sierra(i14, i5, obj)) {
                                            boolean booleanValue = ((Boolean) W.golf(j5, obj)).booleanValue();
                                            int i29 = i14 << 3;
                                            aa aaVar2 = (aa) axVar.alpha;
                                            aaVar2.bronze(i29);
                                            aaVar2.tango(booleanValue ? (byte) 1 : (byte) 0);
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 59:
                                        if (e.sierra(i14, i5, obj)) {
                                            Object object2 = unsafe.getObject(obj, j5);
                                            if (object2 instanceof String) {
                                                ((aa) axVar.alpha).beige(i14, (String) object2);
                                            } else {
                                                ((aa) axVar.alpha).victor(i14, (AbstractC1431z) object2);
                                            }
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 60:
                                        if (e.sierra(i14, i5, obj)) {
                                            axVar.echo(i14, unsafe.getObject(obj, j5), e.beige(i5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 61:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).victor(i14, (AbstractC1431z) unsafe.getObject(obj, j5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 62:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).blue(i14, whiskey(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 63:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).amber(i14, whiskey(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 64:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).whiskey(i14, whiskey(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 65:
                                        if (e.sierra(i14, i5, obj)) {
                                            ((aa) axVar.alpha).yankee(i14, amber(j5, obj));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 66:
                                        if (e.sierra(i14, i5, obj)) {
                                            int whiskey = whiskey(j5, obj);
                                            ((aa) axVar.alpha).blue(i14, (whiskey >> 31) ^ (whiskey + whiskey));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 67:
                                        if (e.sierra(i14, i5, obj)) {
                                            long amber = amber(j5, obj);
                                            ((aa) axVar.alpha).coral(i14, (amber + amber) ^ (amber >> 63));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    case 68:
                                        if (e.sierra(i14, i5, obj)) {
                                            axVar.delta(i14, unsafe.getObject(obj, j5), e.beige(i5));
                                        }
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                    default:
                                        i5 += 3;
                                        e = this;
                                        i10 = i12;
                                        i4 = i11;
                                        entry = entry2;
                                }
                            }
                        }
                        long j52 = zulu & 1048575;
                        switch (yankee) {
                        }
                    } else {
                        while (entry != null) {
                            ahVar.getClass();
                            ah.echo(axVar, entry);
                            if (it.hasNext()) {
                                entry = (Map.Entry) it.next();
                            } else {
                                entry = null;
                            }
                        }
                        ((am) obj).zzc.delta(axVar);
                        return;
                    }
                }
            }
        }
        entry = null;
        it = null;
        Unsafe unsafe2 = mike;
        i4 = 1048575;
        i5 = 0;
        i10 = 0;
        while (true) {
            int[] iArr2 = e.alpha;
            length = iArr2.length;
            ah ahVar6 = e.kilo;
            if (i5 >= length) {
            }
            i5 += 3;
            e = this;
            i10 = i12;
            i4 = i11;
            entry = entry2;
        }
    }

    public final void juliet(int i4, Object obj, Object obj2) {
        if (!papa(i4, obj2)) {
            return;
        }
        int zulu = zulu(i4) & 1048575;
        Unsafe unsafe = mike;
        long j5 = zulu;
        Object object = unsafe.getObject(obj2, j5);
        if (object != null) {
            M beige = beige(i4);
            if (!papa(i4, obj)) {
                if (!romeo(object)) {
                    unsafe.putObject(obj, j5, object);
                } else {
                    Object alpha = beige.alpha();
                    beige.delta(alpha, object);
                    unsafe.putObject(obj, j5, alpha);
                }
                lima(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!romeo(object2)) {
                Object alpha2 = beige.alpha();
                beige.delta(alpha2, object2);
                unsafe.putObject(obj, j5, alpha2);
                object2 = alpha2;
            }
            beige.delta(object2, object);
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
        int zulu = zulu(i4) & 1048575;
        Unsafe unsafe = mike;
        long j5 = zulu;
        Object object = unsafe.getObject(obj2, j5);
        if (object != null) {
            M beige = beige(i4);
            if (!sierra(i5, i4, obj)) {
                if (!romeo(object)) {
                    unsafe.putObject(obj, j5, object);
                } else {
                    Object alpha = beige.alpha();
                    beige.delta(alpha, object);
                    unsafe.putObject(obj, j5, alpha);
                }
                W.india(iArr[i4 + 2] & 1048575, i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!romeo(object2)) {
                Object alpha2 = beige.alpha();
                beige.delta(alpha2, object2);
                unsafe.putObject(obj, j5, alpha2);
                object2 = alpha2;
            }
            beige.delta(object2, object);
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
        W.india(j5, (1 << (i5 >>> 20)) | W.delta(j5, obj), obj);
    }

    public final void mike(int i4, Object obj, Object obj2) {
        mike.putObject(obj, zulu(i4) & 1048575, obj2);
        lima(i4, obj);
    }

    public final void november(int i4, int i5, Object obj, Object obj2) {
        mike.putObject(obj, zulu(i5) & 1048575, obj2);
        W.india(this.alpha[i5 + 2] & 1048575, i4, obj);
    }

    public final boolean oscar(am amVar, am amVar2, int i4) {
        if (papa(i4, amVar) == papa(i4, amVar2)) {
            return true;
        }
        return false;
    }

    public final boolean papa(int i4, Object obj) {
        int i5 = this.alpha[i4 + 2];
        long j5 = i5 & 1048575;
        if (j5 == 1048575) {
            int zulu = zulu(i4);
            long j6 = zulu & 1048575;
            switch (yankee(zulu)) {
                case 0:
                    if (Double.doubleToRawLongBits(W.charlie.alpha(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(W.charlie.bravo(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (W.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (W.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (W.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (W.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (W.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return W.charlie.golf(j6, obj);
                case 8:
                    Object golf = W.golf(j6, obj);
                    if (golf instanceof String) {
                        if (((String) golf).isEmpty()) {
                            return false;
                        }
                    } else if (golf instanceof AbstractC1431z) {
                        if (AbstractC1431z.purple.equals(golf)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case 9:
                    if (W.golf(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (AbstractC1431z.purple.equals(W.golf(j6, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (W.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (W.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (W.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (W.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (W.delta(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (W.echo(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (W.golf(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & W.delta(j5, obj)) == 0) {
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
        if (W.delta(this.alpha[i5 + 2] & 1048575, obj) == i4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0cc9, code lost:
    
        r19 = r12;
        r12 = r10;
        r0 = r43;
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0c6a, code lost:
    
        r33 = r9;
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0f59, code lost:
    
        if (r10 != r0) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0f5b, code lost:
    
        if (r0 == 0) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0f5d, code lost:
    
        r11 = r38;
        r5 = r42;
        r7 = r3;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0fd1, code lost:
    
        if (r12 == 1048575) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0fd3, code lost:
    
        r30.putInt(r15, r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0fd9, code lost:
    
        r1 = r11.hotel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0fdd, code lost:
    
        if (r1 >= r11.india) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0fdf, code lost:
    
        r2 = r11.golf[r1];
        r3 = r34[r2];
        r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.W.golf(r11.zulu(r2) & 1048575, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0ff3, code lost:
    
        if (r3 != null) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0fff, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0ffc, code lost:
    
        if (r11.azure(r2) != null) goto L749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x1002, code lost:
    
        r3 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.ay) r3;
        r2 = r2 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x017c, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0637, code lost:
    
        r0 = r19;
        r19 = r12;
        r12 = r0;
        r0 = r43;
        r3 = r2;
        r6 = r10;
        r30 = r11;
        r27 = r13;
        r33 = r14;
        r10 = r21;
        r14 = r29;
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x100f, code lost:
    
        throw A0.z.hotel(r21[r2 + r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x01ba, code lost:
    
        r10 = r9;
        r21 = r11;
        r29 = r15;
        r15 = r1;
        r11 = r2;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x1012, code lost:
    
        if (r0 != 0) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x1014, code lost:
    
        if (r7 != r5) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x101c, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x036f, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x1021, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x101d, code lost:
    
        if (r7 > r5) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x03cb, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x101f, code lost:
    
        if (r10 != r0) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x1027, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0f6d, code lost:
    
        if (r38.foxtrot == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x04c0, code lost:
    
        r15 = r9;
        r11 = r10;
        r9 = r1;
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0f6f, code lost:
    
        r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.ac.bravo;
        r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.H.charlie;
        r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.ac.bravo;
        r2 = r6.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0f77, code lost:
    
        if (r2 == r1) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x055f, code lost:
    
        r15 = r1;
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0f79, code lost:
    
        r2.getClass();
        r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.al) r2.alpha.get(new com.google.android.gms.internal.mlkit_vision_barcode_bundled.ab(r38.echo, r14));
        r1 = r10;
        r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1426u.india(r1, r40, r3, r42, uniform(r15), r6);
        r5 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0f9a, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x05c5, code lost:
    
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0fad, code lost:
    
        r3 = r40;
        r6 = r44;
        r22 = r1;
        r0 = r38;
        r8 = r14;
        r2 = r15;
        r4 = r17;
        r13 = r27;
        r9 = r30;
        r14 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x06b1, code lost:
    
        r17 = 2;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0f9c, code lost:
    
        r1 = r10;
        r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1426u.india(r1, r40, r3, r42, uniform(r15), r44);
        r5 = r42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:174:0x06fe. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0ce5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:563:0x00c2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c66 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0f52 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v94, types: [java.util.LinkedHashMap, com.google.android.gms.internal.mlkit_vision_barcode_bundled.ay] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int tango(Object obj, byte[] bArr, int i4, int i5, int i10, C1425t c1425t) {
        Object[] objArr;
        Object obj2;
        Unsafe unsafe;
        int[] iArr;
        int i11;
        int i12;
        int xray;
        int i13;
        String str;
        String str2;
        int i14;
        int i15;
        int i16;
        byte[] bArr2;
        C1425t c1425t2;
        int i17;
        int i18;
        Unsafe unsafe2;
        int i19;
        int i20;
        Object obj3;
        int i21;
        Unsafe unsafe3;
        Unsafe unsafe4;
        Object obj4;
        Unsafe unsafe5;
        Object obj5;
        byte[] bArr3;
        int i22;
        int juliet;
        int i23;
        int i24;
        byte b2;
        byte b4;
        byte[] bArr4;
        int i25;
        int i26;
        int i27;
        Object obj6;
        Unsafe unsafe6;
        C1425t c1425t3;
        int alpha;
        int i28;
        String str3;
        byte[] bArr5;
        byte[] bArr6;
        int i29;
        int i30;
        int juliet2;
        byte[] bArr7;
        int i31;
        int i32;
        int hotel;
        int i33;
        byte[] bArr8;
        int i34;
        int i35;
        String str4;
        as asVar;
        int i36;
        int i37;
        int i38;
        byte[] bArr9;
        int i39;
        ay ayVar;
        int i40;
        int i41;
        byte[] bArr10;
        int juliet3;
        int i42;
        int i43;
        E e = this;
        Object obj7 = obj;
        byte[] bArr11 = bArr;
        int i44 = i5;
        C1425t c1425t4 = c1425t;
        String str5 = "CodedInputStream encountered an embedded string or message which claimed to have negative size.";
        String str6 = "";
        if (romeo(obj7)) {
            Unsafe unsafe7 = mike;
            int i45 = i4;
            int i46 = 0;
            int i47 = -1;
            int i48 = 1048575;
            int i49 = 2;
            int i50 = 1;
            int i51 = 0;
            int i52 = 3;
            int i53 = 0;
            while (true) {
                int i54 = 1048575;
                while (true) {
                    int[] iArr2 = e.alpha;
                    Object[] objArr2 = e.bravo;
                    if (i45 < i44) {
                        int i55 = i45 + 1;
                        int i56 = bArr11[i45];
                        if (i56 < 0) {
                            i55 = AbstractC1426u.kilo(i56, bArr11, i55, c1425t4);
                            i56 = c1425t4.alpha;
                        }
                        i53 = i56;
                        int i57 = i53 >>> 3;
                        int i58 = e.delta;
                        int i59 = e.charlie;
                        if (i57 > i47) {
                            int i60 = i51 / 3;
                            if (i57 >= i59 && i57 <= i58) {
                                xray = e.xray(i57, i60);
                                if (xray == -1) {
                                    int i61 = i53 & 7;
                                    int i62 = iArr2[xray + 1];
                                    int yankee = yankee(i62);
                                    long j5 = i62 & i54;
                                    if (yankee > 17) {
                                        int i63 = i48;
                                        int i64 = xray;
                                        int i65 = i57;
                                        int i66 = i55;
                                        obj2 = obj7;
                                        iArr = iArr2;
                                        Unsafe unsafe8 = unsafe7;
                                        if (yankee != 27) {
                                            i13 = i46;
                                            i28 = i66;
                                            if (yankee > 49) {
                                                bArr5 = bArr;
                                                objArr = objArr2;
                                                c1425t4 = c1425t;
                                                i12 = i53;
                                                unsafe = unsafe8;
                                                str3 = str6;
                                                i15 = i65;
                                                if (yankee != 50) {
                                                    Unsafe unsafe9 = mike;
                                                    long j6 = iArr[i64 + 2] & 1048575;
                                                    switch (yankee) {
                                                        case 51:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            if (i61 == 1) {
                                                                i45 = i41 + 8;
                                                                unsafe9.putObject(obj2, j5, Double.valueOf(Double.longBitsToDouble(AbstractC1426u.quebec(i41, bArr10))));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                if (i45 != i41) {
                                                                    i11 = i10;
                                                                    i14 = i45;
                                                                    i48 = i63;
                                                                    i51 = i40;
                                                                    break;
                                                                } else {
                                                                    e = this;
                                                                    bArr11 = bArr10;
                                                                    i47 = i15;
                                                                    obj7 = obj2;
                                                                    i46 = i13;
                                                                    i48 = i63;
                                                                    i51 = i40;
                                                                    str5 = str;
                                                                    unsafe7 = unsafe;
                                                                    str6 = str2;
                                                                    i49 = 2;
                                                                    i50 = 1;
                                                                    i52 = 3;
                                                                    i54 = 1048575;
                                                                    i44 = i5;
                                                                    i53 = i12;
                                                                    break;
                                                                }
                                                            }
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                        case 52:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            if (i61 == 5) {
                                                                i45 = i41 + 4;
                                                                unsafe9.putObject(obj2, j5, Float.valueOf(Float.intBitsToFloat(AbstractC1426u.delta(i41, bArr10))));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 53:
                                                        case 54:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            if (i61 == 0) {
                                                                i45 = AbstractC1426u.mike(bArr10, i41, c1425t4);
                                                                unsafe9.putObject(obj2, j5, Long.valueOf(c1425t4.bravo));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 55:
                                                        case 62:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            if (i61 == 0) {
                                                                i45 = AbstractC1426u.juliet(bArr10, i41, c1425t4);
                                                                unsafe9.putObject(obj2, j5, Integer.valueOf(c1425t4.alpha));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 56:
                                                        case 65:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            if (i61 == 1) {
                                                                i45 = i41 + 8;
                                                                unsafe9.putObject(obj2, j5, Long.valueOf(AbstractC1426u.quebec(i41, bArr10)));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 57:
                                                        case 64:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            if (i61 == 5) {
                                                                i45 = i41 + 4;
                                                                unsafe9.putObject(obj2, j5, Integer.valueOf(AbstractC1426u.delta(i41, bArr10)));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 58:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            if (i61 == 0) {
                                                                i45 = AbstractC1426u.mike(bArr10, i41, c1425t4);
                                                                unsafe9.putObject(obj2, j5, Boolean.valueOf(c1425t4.bravo != 0));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 59:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            if (i61 == 2) {
                                                                juliet3 = AbstractC1426u.juliet(bArr10, i41, c1425t4);
                                                                int i67 = c1425t4.alpha;
                                                                if (i67 == 0) {
                                                                    str = str5;
                                                                    unsafe9.putObject(obj2, j5, str2);
                                                                } else {
                                                                    str = str5;
                                                                    int i68 = juliet3 + i67;
                                                                    if ((i62 & 536870912) != 0) {
                                                                        X.alpha.getClass();
                                                                        if (ah.charlie(0, juliet3, i68, bArr10) != 0) {
                                                                            throw new zzer("Protocol message had invalid UTF-8.");
                                                                        }
                                                                    }
                                                                    unsafe9.putObject(obj2, j5, new String(bArr10, juliet3, i67, at.alpha));
                                                                    juliet3 = i68;
                                                                }
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                i45 = juliet3;
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            str = str5;
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 60:
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            i42 = i28;
                                                            if (i61 == 2) {
                                                                Object blue = blue(i15, i64, obj2);
                                                                int oscar = AbstractC1426u.oscar(blue, beige(i64), bArr10, i42, i5, c1425t4);
                                                                bArr10 = bArr10;
                                                                november(i15, i64, obj2, blue);
                                                                i45 = oscar;
                                                                i40 = i64;
                                                                str = str5;
                                                                i41 = i42;
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i40 = i64;
                                                            str = str5;
                                                            i41 = i42;
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 61:
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            i42 = i28;
                                                            if (i61 == 2) {
                                                                juliet3 = AbstractC1426u.alpha(bArr10, i42, c1425t4);
                                                                unsafe9.putObject(obj2, j5, c1425t4.charlie);
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                i40 = i64;
                                                                str = str5;
                                                                i41 = i42;
                                                                i45 = juliet3;
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i40 = i64;
                                                            str = str5;
                                                            i41 = i42;
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 63:
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            i42 = i28;
                                                            if (i61 == 0) {
                                                                int juliet4 = AbstractC1426u.juliet(bArr10, i42, c1425t4);
                                                                int i69 = c1425t4.alpha;
                                                                i43 = juliet4;
                                                                ap azure = azure(i64);
                                                                if (azure != null && !azure.alpha(i69)) {
                                                                    uniform(obj2).charlie(i12, Long.valueOf(i69));
                                                                } else {
                                                                    unsafe9.putObject(obj2, j5, Integer.valueOf(i69));
                                                                    unsafe9.putInt(obj2, j6, i15);
                                                                }
                                                                i40 = i64;
                                                                str = str5;
                                                                i41 = i42;
                                                                i45 = i43;
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i40 = i64;
                                                            str = str5;
                                                            i41 = i42;
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 66:
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            i42 = i28;
                                                            if (i61 == 0) {
                                                                juliet3 = AbstractC1426u.juliet(bArr10, i42, c1425t4);
                                                                unsafe9.putObject(obj2, j5, Integer.valueOf(AbstractC1426u.charlie(c1425t4.alpha)));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                i40 = i64;
                                                                str = str5;
                                                                i41 = i42;
                                                                i45 = juliet3;
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            i40 = i64;
                                                            str = str5;
                                                            i41 = i42;
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                        case 67:
                                                            bArr10 = bArr;
                                                            i42 = i28;
                                                            if (i61 == 0) {
                                                                i43 = AbstractC1426u.mike(bArr10, i42, c1425t4);
                                                                str2 = str3;
                                                                long j7 = c1425t4.bravo;
                                                                unsafe9.putObject(obj2, j5, Long.valueOf((j7 >>> 1) ^ (-(j7 & 1))));
                                                                unsafe9.putInt(obj2, j6, i15);
                                                                i40 = i64;
                                                                str = str5;
                                                                i41 = i42;
                                                                i45 = i43;
                                                                if (i45 != i41) {
                                                                }
                                                            } else {
                                                                str2 = str3;
                                                                i40 = i64;
                                                                str = str5;
                                                                i41 = i42;
                                                                i45 = i41;
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            break;
                                                        case 68:
                                                            if (i61 == 3) {
                                                                Object blue2 = blue(i15, i64, obj2);
                                                                int november = AbstractC1426u.november(blue2, beige(i64), bArr, i28, i5, (i12 & (-8)) | 4, c1425t4);
                                                                bArr10 = bArr;
                                                                c1425t4 = c1425t4;
                                                                november(i15, i64, obj2, blue2);
                                                                str2 = str3;
                                                                i40 = i64;
                                                                str = str5;
                                                                i41 = i28;
                                                                i45 = november;
                                                                if (i45 != i41) {
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            i40 = i64;
                                                            i41 = i28;
                                                            bArr10 = bArr;
                                                            str2 = str3;
                                                            str = str5;
                                                            i45 = i41;
                                                            if (i45 != i41) {
                                                            }
                                                            break;
                                                    }
                                                } else if (i61 == 2) {
                                                    Unsafe unsafe10 = mike;
                                                    int i70 = i64 / 3;
                                                    Object obj8 = objArr[i70 + i70];
                                                    Object object = unsafe10.getObject(obj2, j5);
                                                    if (!((ay) object).alpha) {
                                                        ay ayVar2 = ay.purple;
                                                        if (ayVar2.isEmpty()) {
                                                            ayVar = new ay();
                                                        } else {
                                                            ?? linkedHashMap = new LinkedHashMap(ayVar2);
                                                            linkedHashMap.alpha = true;
                                                            ayVar = linkedHashMap;
                                                        }
                                                        ah.delta(ayVar, object);
                                                        unsafe10.putObject(obj2, j5, ayVar);
                                                    }
                                                    throw A0.z.hotel(obj8);
                                                }
                                            } else {
                                                long j10 = i62;
                                                Unsafe unsafe11 = mike;
                                                as asVar2 = (as) unsafe11.getObject(obj2, j5);
                                                if (!((r) asVar2).alpha) {
                                                    int size = asVar2.size();
                                                    asVar2 = asVar2.foxtrot(size == 0 ? 10 : size + size);
                                                    unsafe11.putObject(obj2, j5, asVar2);
                                                }
                                                as asVar3 = asVar2;
                                                switch (yankee) {
                                                    case 18:
                                                    case 35:
                                                        bArr6 = bArr;
                                                        objArr = objArr2;
                                                        c1425t4 = c1425t;
                                                        i29 = i28;
                                                        i12 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        i30 = i5;
                                                        if (i61 != 2) {
                                                            if (i61 == 1) {
                                                                if (asVar3 == null) {
                                                                    Double.longBitsToDouble(AbstractC1426u.quebec(i29, bArr6));
                                                                    throw null;
                                                                }
                                                                throw new ClassCastException();
                                                            }
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else if (asVar3 == null) {
                                                            juliet2 = AbstractC1426u.juliet(bArr6, i29, c1425t4);
                                                            int i71 = c1425t4.alpha + juliet2;
                                                            if (juliet2 < i71) {
                                                                Double.longBitsToDouble(AbstractC1426u.quebec(juliet2, bArr6));
                                                                throw null;
                                                            }
                                                            if (juliet2 != i71) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i45 = juliet2;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                                i11 = i10;
                                                                i14 = i45;
                                                                break;
                                                            } else {
                                                                e = this;
                                                                bArr11 = bArr6;
                                                                i44 = i30;
                                                                i53 = i12;
                                                                i47 = i15;
                                                                obj7 = obj2;
                                                                i46 = i13;
                                                                i49 = 2;
                                                                i50 = 1;
                                                                i52 = 3;
                                                                i54 = 1048575;
                                                                str6 = str3;
                                                                unsafe7 = unsafe;
                                                                break;
                                                            }
                                                        } else {
                                                            throw new ClassCastException();
                                                        }
                                                    case 19:
                                                    case 36:
                                                        bArr6 = bArr;
                                                        objArr = objArr2;
                                                        c1425t4 = c1425t;
                                                        i29 = i28;
                                                        i12 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        i30 = i5;
                                                        if (i61 == 2) {
                                                            ag agVar = (ag) asVar3;
                                                            int juliet5 = AbstractC1426u.juliet(bArr6, i29, c1425t4);
                                                            int i72 = c1425t4.alpha + juliet5;
                                                            while (juliet5 < i72) {
                                                                agVar.bravo(Float.intBitsToFloat(AbstractC1426u.delta(juliet5, bArr6)));
                                                                juliet5 += 4;
                                                            }
                                                            if (juliet5 != i72) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i45 = juliet5;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            if (i61 == 5) {
                                                                juliet2 = i29 + 4;
                                                                ag agVar2 = (ag) asVar3;
                                                                agVar2.bravo(Float.intBitsToFloat(AbstractC1426u.delta(i29, bArr6)));
                                                                while (juliet2 < i30) {
                                                                    int juliet6 = AbstractC1426u.juliet(bArr6, juliet2, c1425t4);
                                                                    if (i12 == c1425t4.alpha) {
                                                                        agVar2.bravo(Float.intBitsToFloat(AbstractC1426u.delta(juliet6, bArr6)));
                                                                        juliet2 = juliet6 + 4;
                                                                    } else {
                                                                        i45 = juliet2;
                                                                        i51 = i64;
                                                                        i48 = i63;
                                                                        if (i45 != i29) {
                                                                        }
                                                                    }
                                                                }
                                                                i45 = juliet2;
                                                                i51 = i64;
                                                                i48 = i63;
                                                                if (i45 != i29) {
                                                                }
                                                            }
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        break;
                                                    case 20:
                                                    case 21:
                                                    case 37:
                                                    case 38:
                                                        bArr6 = bArr;
                                                        objArr = objArr2;
                                                        c1425t4 = c1425t;
                                                        i29 = i28;
                                                        i12 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        i30 = i5;
                                                        if (i61 != 2) {
                                                            if (i61 == 0) {
                                                                if (asVar3 == null) {
                                                                    AbstractC1426u.mike(bArr6, i29, c1425t4);
                                                                    throw null;
                                                                }
                                                                throw new ClassCastException();
                                                            }
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else if (asVar3 == null) {
                                                            juliet2 = AbstractC1426u.juliet(bArr6, i29, c1425t4);
                                                            int i73 = c1425t4.alpha + juliet2;
                                                            if (juliet2 < i73) {
                                                                AbstractC1426u.mike(bArr6, juliet2, c1425t4);
                                                                throw null;
                                                            }
                                                            if (juliet2 != i73) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i45 = juliet2;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            throw new ClassCastException();
                                                        }
                                                        break;
                                                    case 22:
                                                    case 29:
                                                    case 39:
                                                    case 43:
                                                        bArr7 = bArr;
                                                        objArr = objArr2;
                                                        i31 = i5;
                                                        c1425t4 = c1425t;
                                                        i32 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        if (i61 == 2) {
                                                            hotel = AbstractC1426u.hotel(bArr7, i28, asVar3, c1425t4);
                                                            i45 = hotel;
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            if (i61 == 0) {
                                                                bArr6 = bArr7;
                                                                i29 = i28;
                                                                i30 = i31;
                                                                juliet2 = AbstractC1426u.lima(i32, bArr6, i29, i30, asVar3, c1425t4);
                                                                i12 = i32;
                                                                i45 = juliet2;
                                                                i51 = i64;
                                                                i48 = i63;
                                                                if (i45 != i29) {
                                                                }
                                                            }
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        break;
                                                    case 23:
                                                    case 32:
                                                    case 40:
                                                    case 46:
                                                        bArr7 = bArr;
                                                        objArr = objArr2;
                                                        i31 = i5;
                                                        c1425t4 = c1425t;
                                                        i32 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        if (i61 != 2) {
                                                            if (i61 == 1) {
                                                                if (asVar3 == null) {
                                                                    AbstractC1426u.quebec(i28, bArr7);
                                                                    throw null;
                                                                }
                                                                throw new ClassCastException();
                                                            }
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else if (asVar3 == null) {
                                                            hotel = AbstractC1426u.juliet(bArr7, i28, c1425t4);
                                                            int i74 = c1425t4.alpha + hotel;
                                                            if (hotel < i74) {
                                                                AbstractC1426u.quebec(hotel, bArr7);
                                                                throw null;
                                                            }
                                                            if (hotel != i74) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i45 = hotel;
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            throw new ClassCastException();
                                                        }
                                                        break;
                                                    case 24:
                                                    case 31:
                                                    case 41:
                                                    case 45:
                                                        bArr7 = bArr;
                                                        objArr = objArr2;
                                                        i31 = i5;
                                                        c1425t4 = c1425t;
                                                        i32 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        if (i61 == 2) {
                                                            an anVar = (an) asVar3;
                                                            i45 = AbstractC1426u.juliet(bArr7, i28, c1425t4);
                                                            int i75 = c1425t4.alpha + i45;
                                                            while (i45 < i75) {
                                                                anVar.delta(AbstractC1426u.delta(i45, bArr7));
                                                                i45 += 4;
                                                            }
                                                            if (i45 != i75) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            if (i61 == 5) {
                                                                i33 = i28 + 4;
                                                                an anVar2 = (an) asVar3;
                                                                anVar2.delta(AbstractC1426u.delta(i28, bArr7));
                                                                while (i33 < i31) {
                                                                    int juliet7 = AbstractC1426u.juliet(bArr7, i33, c1425t4);
                                                                    if (i32 == c1425t4.alpha) {
                                                                        anVar2.delta(AbstractC1426u.delta(juliet7, bArr7));
                                                                        i33 = juliet7 + 4;
                                                                    } else {
                                                                        i45 = i33;
                                                                        i12 = i32;
                                                                        bArr6 = bArr7;
                                                                        i29 = i28;
                                                                        i30 = i31;
                                                                        i51 = i64;
                                                                        i48 = i63;
                                                                        if (i45 != i29) {
                                                                        }
                                                                    }
                                                                }
                                                                i45 = i33;
                                                                i12 = i32;
                                                                bArr6 = bArr7;
                                                                i29 = i28;
                                                                i30 = i31;
                                                                i51 = i64;
                                                                i48 = i63;
                                                                if (i45 != i29) {
                                                                }
                                                            }
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        break;
                                                    case 25:
                                                    case 42:
                                                        bArr7 = bArr;
                                                        objArr = objArr2;
                                                        i31 = i5;
                                                        c1425t4 = c1425t;
                                                        i32 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        if (i61 != 2) {
                                                            if (i61 == 0) {
                                                                if (asVar3 == null) {
                                                                    AbstractC1426u.mike(bArr7, i28, c1425t4);
                                                                    throw null;
                                                                }
                                                                throw new ClassCastException();
                                                            }
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else if (asVar3 == null) {
                                                            hotel = AbstractC1426u.juliet(bArr7, i28, c1425t4);
                                                            int i76 = c1425t4.alpha + hotel;
                                                            if (hotel < i76) {
                                                                AbstractC1426u.mike(bArr7, hotel, c1425t4);
                                                                throw null;
                                                            }
                                                            if (hotel != i76) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i45 = hotel;
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            throw new ClassCastException();
                                                        }
                                                        break;
                                                    case 26:
                                                        bArr7 = bArr;
                                                        objArr = objArr2;
                                                        i31 = i5;
                                                        c1425t4 = c1425t;
                                                        i32 = i53;
                                                        unsafe = unsafe8;
                                                        String str7 = str6;
                                                        i15 = i65;
                                                        if (i61 == 2) {
                                                            if ((j10 & 536870912) == 0) {
                                                                i33 = AbstractC1426u.juliet(bArr7, i28, c1425t4);
                                                                int i77 = c1425t4.alpha;
                                                                if (i77 < 0) {
                                                                    throw new zzer(str5);
                                                                }
                                                                if (i77 == 0) {
                                                                    str3 = str7;
                                                                    asVar3.add(str3);
                                                                } else {
                                                                    str3 = str7;
                                                                    asVar3.add(new String(bArr7, i33, i77, at.alpha));
                                                                    i33 += i77;
                                                                }
                                                                while (i33 < i31) {
                                                                    int juliet8 = AbstractC1426u.juliet(bArr7, i33, c1425t4);
                                                                    if (i32 == c1425t4.alpha) {
                                                                        i33 = AbstractC1426u.juliet(bArr7, juliet8, c1425t4);
                                                                        int i78 = c1425t4.alpha;
                                                                        if (i78 < 0) {
                                                                            throw new zzer(str5);
                                                                        }
                                                                        if (i78 == 0) {
                                                                            asVar3.add(str3);
                                                                        } else {
                                                                            asVar3.add(new String(bArr7, i33, i78, at.alpha));
                                                                            i33 += i78;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                str3 = str7;
                                                                i33 = AbstractC1426u.juliet(bArr7, i28, c1425t4);
                                                                int i79 = c1425t4.alpha;
                                                                if (i79 < 0) {
                                                                    throw new zzer(str5);
                                                                }
                                                                if (i79 == 0) {
                                                                    asVar3.add(str3);
                                                                } else {
                                                                    int i80 = i33 + i79;
                                                                    X.alpha.getClass();
                                                                    if (ah.charlie(0, i33, i80, bArr7) == 0) {
                                                                        asVar3.add(new String(bArr7, i33, i79, at.alpha));
                                                                        i33 = i80;
                                                                    } else {
                                                                        throw new zzer("Protocol message had invalid UTF-8.");
                                                                    }
                                                                }
                                                                while (i33 < i31) {
                                                                    int juliet9 = AbstractC1426u.juliet(bArr7, i33, c1425t4);
                                                                    if (i32 == c1425t4.alpha) {
                                                                        i33 = AbstractC1426u.juliet(bArr7, juliet9, c1425t4);
                                                                        int i81 = c1425t4.alpha;
                                                                        if (i81 < 0) {
                                                                            throw new zzer(str5);
                                                                        }
                                                                        if (i81 == 0) {
                                                                            asVar3.add(str3);
                                                                        } else {
                                                                            int i82 = i33 + i81;
                                                                            X.alpha.getClass();
                                                                            if (ah.charlie(0, i33, i82, bArr7) == 0) {
                                                                                asVar3.add(new String(bArr7, i33, i81, at.alpha));
                                                                                i33 = i82;
                                                                            } else {
                                                                                throw new zzer("Protocol message had invalid UTF-8.");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i45 = i33;
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            str3 = str7;
                                                            i12 = i32;
                                                            bArr6 = bArr7;
                                                            i29 = i28;
                                                            i30 = i31;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        break;
                                                    case 27:
                                                        bArr8 = bArr;
                                                        objArr = objArr2;
                                                        i34 = i5;
                                                        c1425t4 = c1425t;
                                                        i35 = i53;
                                                        unsafe = unsafe8;
                                                        str4 = str6;
                                                        i15 = i65;
                                                        if (i61 == 2) {
                                                            juliet2 = AbstractC1426u.golf(beige(i64), i35, bArr8, i28, i34, asVar3, c1425t4);
                                                            i12 = i35;
                                                            bArr6 = bArr8;
                                                            i29 = i28;
                                                            i30 = i34;
                                                            c1425t4 = c1425t4;
                                                            str3 = str4;
                                                            i45 = juliet2;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            i12 = i35;
                                                            bArr6 = bArr8;
                                                            i29 = i28;
                                                            i30 = i34;
                                                            str3 = str4;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        break;
                                                    case 28:
                                                        bArr8 = bArr;
                                                        objArr = objArr2;
                                                        i34 = i5;
                                                        c1425t4 = c1425t;
                                                        i35 = i53;
                                                        unsafe = unsafe8;
                                                        str4 = str6;
                                                        i15 = i65;
                                                        if (i61 == 2) {
                                                            int juliet10 = AbstractC1426u.juliet(bArr8, i28, c1425t4);
                                                            int i83 = c1425t4.alpha;
                                                            if (i83 >= 0) {
                                                                if (i83 > bArr8.length - juliet10) {
                                                                    throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                }
                                                                if (i83 == 0) {
                                                                    asVar3.add(AbstractC1431z.purple);
                                                                } else {
                                                                    asVar3.add(AbstractC1431z.victor(bArr8, juliet10, i83));
                                                                    juliet10 += i83;
                                                                }
                                                                while (juliet10 < i34) {
                                                                    int juliet11 = AbstractC1426u.juliet(bArr8, juliet10, c1425t4);
                                                                    if (i35 == c1425t4.alpha) {
                                                                        juliet10 = AbstractC1426u.juliet(bArr8, juliet11, c1425t4);
                                                                        int i84 = c1425t4.alpha;
                                                                        if (i84 >= 0) {
                                                                            if (i84 > bArr8.length - juliet10) {
                                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                            }
                                                                            if (i84 == 0) {
                                                                                asVar3.add(AbstractC1431z.purple);
                                                                            } else {
                                                                                asVar3.add(AbstractC1431z.victor(bArr8, juliet10, i84));
                                                                                juliet10 += i84;
                                                                            }
                                                                        } else {
                                                                            throw new zzer(str5);
                                                                        }
                                                                    } else {
                                                                        i45 = juliet10;
                                                                        i12 = i35;
                                                                        bArr6 = bArr8;
                                                                        i29 = i28;
                                                                        i30 = i34;
                                                                        str3 = str4;
                                                                        i51 = i64;
                                                                        i48 = i63;
                                                                        if (i45 != i29) {
                                                                        }
                                                                    }
                                                                }
                                                                i45 = juliet10;
                                                                i12 = i35;
                                                                bArr6 = bArr8;
                                                                i29 = i28;
                                                                i30 = i34;
                                                                str3 = str4;
                                                                i51 = i64;
                                                                i48 = i63;
                                                                if (i45 != i29) {
                                                                }
                                                            } else {
                                                                throw new zzer(str5);
                                                            }
                                                        }
                                                        i12 = i35;
                                                        bArr6 = bArr8;
                                                        i29 = i28;
                                                        i30 = i34;
                                                        str3 = str4;
                                                        i45 = i29;
                                                        i51 = i64;
                                                        i48 = i63;
                                                        if (i45 != i29) {
                                                        }
                                                        break;
                                                    case 30:
                                                    case 44:
                                                        bArr8 = bArr;
                                                        objArr = objArr2;
                                                        i34 = i5;
                                                        c1425t4 = c1425t;
                                                        if (i61 == 2) {
                                                            i36 = AbstractC1426u.hotel(bArr8, i28, asVar3, c1425t4);
                                                            asVar = asVar3;
                                                            i35 = i53;
                                                        } else if (i61 == 0) {
                                                            int lima2 = AbstractC1426u.lima(i53, bArr8, i28, i34, asVar3, c1425t4);
                                                            asVar = asVar3;
                                                            i34 = i34;
                                                            i28 = i28;
                                                            bArr8 = bArr8;
                                                            i35 = i53;
                                                            i36 = lima2;
                                                        } else {
                                                            unsafe = unsafe8;
                                                            str4 = str6;
                                                            i15 = i65;
                                                            bArr6 = bArr8;
                                                            i29 = i28;
                                                            i30 = i34;
                                                            i12 = i53;
                                                            str3 = str4;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        ap azure2 = azure(i64);
                                                        ah ahVar = N.alpha;
                                                        if (azure2 != null) {
                                                            if (asVar != null) {
                                                                int size2 = asVar.size();
                                                                i37 = i36;
                                                                unsafe = unsafe8;
                                                                Object obj9 = null;
                                                                int i85 = 0;
                                                                int i86 = 0;
                                                                while (i86 < size2) {
                                                                    String str8 = str6;
                                                                    Integer num = (Integer) asVar.get(i86);
                                                                    int intValue = num.intValue();
                                                                    if (azure2.alpha(intValue)) {
                                                                        if (i86 != i85) {
                                                                            asVar.set(i85, num);
                                                                        }
                                                                        i85++;
                                                                        i38 = i65;
                                                                    } else {
                                                                        i38 = i65;
                                                                        obj9 = N.oscar(i38, intValue, obj2, obj9);
                                                                    }
                                                                    i86++;
                                                                    i65 = i38;
                                                                    str6 = str8;
                                                                }
                                                                str4 = str6;
                                                                i15 = i65;
                                                                if (i85 != size2) {
                                                                    asVar.subList(i85, size2).clear();
                                                                }
                                                            } else {
                                                                i37 = i36;
                                                                unsafe = unsafe8;
                                                                str4 = str6;
                                                                i15 = i65;
                                                                Iterator it = asVar.iterator();
                                                                Object obj10 = null;
                                                                while (it.hasNext()) {
                                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                                    if (!azure2.alpha(intValue2)) {
                                                                        obj10 = N.oscar(i15, intValue2, obj2, obj10);
                                                                        it.remove();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i37 = i36;
                                                            unsafe = unsafe8;
                                                            str4 = str6;
                                                            i15 = i65;
                                                        }
                                                        i45 = i37;
                                                        i12 = i35;
                                                        bArr6 = bArr8;
                                                        i29 = i28;
                                                        i30 = i34;
                                                        str3 = str4;
                                                        i51 = i64;
                                                        i48 = i63;
                                                        if (i45 != i29) {
                                                        }
                                                        break;
                                                    case 33:
                                                    case 47:
                                                        bArr9 = bArr;
                                                        objArr = objArr2;
                                                        i39 = i5;
                                                        c1425t4 = c1425t;
                                                        if (i61 == 2) {
                                                            an anVar3 = (an) asVar3;
                                                            int juliet12 = AbstractC1426u.juliet(bArr9, i28, c1425t4);
                                                            int i87 = c1425t4.alpha + juliet12;
                                                            while (juliet12 < i87) {
                                                                juliet12 = AbstractC1426u.juliet(bArr9, juliet12, c1425t4);
                                                                anVar3.delta(AbstractC1426u.charlie(c1425t4.alpha));
                                                            }
                                                            if (juliet12 != i87) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i45 = juliet12;
                                                        } else {
                                                            if (i61 == 0) {
                                                                an anVar4 = (an) asVar3;
                                                                int juliet13 = AbstractC1426u.juliet(bArr9, i28, c1425t4);
                                                                anVar4.delta(AbstractC1426u.charlie(c1425t4.alpha));
                                                                while (juliet13 < i39) {
                                                                    int juliet14 = AbstractC1426u.juliet(bArr9, juliet13, c1425t4);
                                                                    if (i53 == c1425t4.alpha) {
                                                                        juliet13 = AbstractC1426u.juliet(bArr9, juliet14, c1425t4);
                                                                        anVar4.delta(AbstractC1426u.charlie(c1425t4.alpha));
                                                                    } else {
                                                                        i45 = juliet13;
                                                                    }
                                                                }
                                                                i45 = juliet13;
                                                            }
                                                            bArr6 = bArr9;
                                                            i29 = i28;
                                                            i30 = i39;
                                                            i12 = i53;
                                                            unsafe = unsafe8;
                                                            str3 = str6;
                                                            i15 = i65;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        bArr6 = bArr9;
                                                        i29 = i28;
                                                        i30 = i39;
                                                        i12 = i53;
                                                        unsafe = unsafe8;
                                                        str3 = str6;
                                                        i15 = i65;
                                                        i51 = i64;
                                                        i48 = i63;
                                                        if (i45 != i29) {
                                                        }
                                                        break;
                                                    case 34:
                                                    case 48:
                                                        bArr9 = bArr;
                                                        objArr = objArr2;
                                                        i39 = i5;
                                                        c1425t4 = c1425t;
                                                        if (i61 != 2) {
                                                            if (i61 == 0) {
                                                                if (asVar3 == null) {
                                                                    AbstractC1426u.mike(bArr9, i28, c1425t4);
                                                                    throw null;
                                                                }
                                                                throw new ClassCastException();
                                                            }
                                                            bArr6 = bArr9;
                                                            i29 = i28;
                                                            i30 = i39;
                                                            i12 = i53;
                                                            unsafe = unsafe8;
                                                            str3 = str6;
                                                            i15 = i65;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else if (asVar3 == null) {
                                                            int juliet15 = AbstractC1426u.juliet(bArr9, i28, c1425t4);
                                                            int i88 = c1425t4.alpha + juliet15;
                                                            if (juliet15 < i88) {
                                                                AbstractC1426u.mike(bArr9, juliet15, c1425t4);
                                                                throw null;
                                                            }
                                                            if (juliet15 != i88) {
                                                                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            i45 = juliet15;
                                                            bArr6 = bArr9;
                                                            i29 = i28;
                                                            i30 = i39;
                                                            i12 = i53;
                                                            unsafe = unsafe8;
                                                            str3 = str6;
                                                            i15 = i65;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            throw new ClassCastException();
                                                        }
                                                        break;
                                                    default:
                                                        if (i61 == 3) {
                                                            int i89 = (i53 & (-8)) | 4;
                                                            M beige = beige(i64);
                                                            Object alpha2 = beige.alpha();
                                                            objArr = objArr2;
                                                            int november2 = AbstractC1426u.november(alpha2, beige, bArr, i28, i5, i89, c1425t);
                                                            int i90 = i89;
                                                            c1425t4 = c1425t;
                                                            beige.bravo(alpha2);
                                                            c1425t4.charlie = alpha2;
                                                            asVar3.add(alpha2);
                                                            while (true) {
                                                                if (november2 < i5) {
                                                                    int i91 = i28;
                                                                    int juliet16 = AbstractC1426u.juliet(bArr, november2, c1425t4);
                                                                    int i92 = i90;
                                                                    if (i53 == c1425t4.alpha) {
                                                                        Object alpha3 = beige.alpha();
                                                                        C1425t c1425t5 = c1425t4;
                                                                        int november3 = AbstractC1426u.november(alpha3, beige, bArr, juliet16, i5, i92, c1425t5);
                                                                        i90 = i92;
                                                                        c1425t4 = c1425t5;
                                                                        beige.bravo(alpha3);
                                                                        c1425t4.charlie = alpha3;
                                                                        asVar3.add(alpha3);
                                                                        november2 = november3;
                                                                        i28 = i91;
                                                                    } else {
                                                                        i28 = i91;
                                                                    }
                                                                }
                                                            }
                                                            bArr6 = bArr;
                                                            i29 = i28;
                                                            i30 = i5;
                                                            i45 = november2;
                                                            i12 = i53;
                                                            unsafe = unsafe8;
                                                            str3 = str6;
                                                            i15 = i65;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        } else {
                                                            objArr = objArr2;
                                                            bArr6 = bArr;
                                                            c1425t4 = c1425t;
                                                            i29 = i28;
                                                            i12 = i53;
                                                            unsafe = unsafe8;
                                                            str3 = str6;
                                                            i15 = i65;
                                                            i30 = i5;
                                                            i45 = i29;
                                                            i51 = i64;
                                                            i48 = i63;
                                                            if (i45 != i29) {
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        } else if (i61 == 2) {
                                            as asVar4 = (as) unsafe8.getObject(obj2, j5);
                                            if (!((r) asVar4).alpha) {
                                                int size3 = asVar4.size();
                                                asVar4 = asVar4.foxtrot(size3 == 0 ? 10 : size3 + size3);
                                                unsafe8.putObject(obj2, j5, asVar4);
                                            }
                                            e = this;
                                            i44 = i5;
                                            int golf = AbstractC1426u.golf(e.beige(i64), i53, bArr, i66, i44, asVar4, c1425t);
                                            i51 = i64;
                                            i48 = i63;
                                            bArr11 = bArr;
                                            c1425t4 = c1425t;
                                            i45 = golf;
                                            i53 = i53;
                                            unsafe7 = unsafe8;
                                            obj7 = obj2;
                                            i46 = i46;
                                            i47 = i65;
                                        } else {
                                            i13 = i46;
                                            c1425t4 = c1425t;
                                            i28 = i66;
                                            unsafe = unsafe8;
                                            str3 = str6;
                                            i12 = i53;
                                            i15 = i65;
                                            bArr5 = bArr;
                                            objArr = objArr2;
                                        }
                                    } else {
                                        int i93 = iArr2[xray + 2];
                                        int i94 = i50 << (i93 >>> 20);
                                        int i95 = i93 & i54;
                                        iArr = iArr2;
                                        if (i95 != i48) {
                                            int i96 = i54;
                                            if (i48 != i96) {
                                                unsafe7.putInt(obj7, i48, i46);
                                                i96 = 1048575;
                                            }
                                            i46 = i95 == i96 ? 0 : unsafe7.getInt(obj7, i95);
                                            i48 = i95;
                                        }
                                        switch (yankee) {
                                            case 0:
                                                c1425t2 = c1425t;
                                                i13 = i46;
                                                unsafe2 = unsafe7;
                                                i19 = i53;
                                                bArr2 = bArr;
                                                i18 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                obj3 = obj7;
                                                i20 = i55;
                                                if (i61 != i50) {
                                                    break;
                                                } else {
                                                    i45 = i20 + 8;
                                                    W.charlie.echo(obj, j5, Double.longBitsToDouble(AbstractC1426u.quebec(i20, bArr2)));
                                                    i51 = i17;
                                                    i48 = i16;
                                                    i44 = i5;
                                                    i46 = i13 | i94;
                                                    bArr11 = bArr2;
                                                    c1425t4 = c1425t2;
                                                    unsafe7 = unsafe2;
                                                    obj7 = obj;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i50 = 1;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                }
                                            case 1:
                                                c1425t2 = c1425t;
                                                i13 = i46;
                                                unsafe2 = unsafe7;
                                                i19 = i53;
                                                bArr2 = bArr;
                                                i18 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                obj3 = obj7;
                                                i20 = i55;
                                                if (i61 != 5) {
                                                    break;
                                                } else {
                                                    i45 = i20 + 4;
                                                    W.charlie.foxtrot(obj3, j5, Float.intBitsToFloat(AbstractC1426u.delta(i20, bArr2)));
                                                    i51 = i17;
                                                    i48 = i16;
                                                    i44 = i5;
                                                    i46 = i13 | i94;
                                                    obj7 = obj3;
                                                    bArr11 = bArr2;
                                                    c1425t4 = c1425t2;
                                                    unsafe7 = unsafe2;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i50 = 1;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                }
                                            case 2:
                                            case 3:
                                                c1425t2 = c1425t;
                                                i13 = i46;
                                                Unsafe unsafe12 = unsafe7;
                                                i19 = i53;
                                                bArr2 = bArr;
                                                i18 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                obj3 = obj7;
                                                i20 = i55;
                                                if (i61 != 0) {
                                                    unsafe2 = unsafe12;
                                                    break;
                                                } else {
                                                    i21 = i13 | i94;
                                                    i45 = AbstractC1426u.mike(bArr2, i20, c1425t2);
                                                    obj7 = obj3;
                                                    unsafe3 = unsafe12;
                                                    unsafe3.putLong(obj7, j5, c1425t2.bravo);
                                                    int i97 = i16;
                                                    i51 = i17;
                                                    i48 = i97;
                                                    i44 = i5;
                                                    i46 = i21;
                                                    bArr11 = bArr2;
                                                    c1425t4 = c1425t2;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i50 = 1;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                    unsafe7 = unsafe3;
                                                }
                                            case 4:
                                            case 11:
                                                c1425t2 = c1425t;
                                                i13 = i46;
                                                unsafe4 = unsafe7;
                                                i19 = i53;
                                                bArr2 = bArr;
                                                i18 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                obj4 = obj7;
                                                i20 = i55;
                                                if (i61 != 0) {
                                                    break;
                                                } else {
                                                    i45 = AbstractC1426u.juliet(bArr2, i20, c1425t2);
                                                    unsafe4.putInt(obj4, j5, c1425t2.alpha);
                                                    unsafe7 = unsafe4;
                                                    bArr11 = bArr2;
                                                    i51 = i17;
                                                    i48 = i16;
                                                    i44 = i5;
                                                    i46 = i13 | i94;
                                                    obj7 = obj4;
                                                    c1425t4 = c1425t2;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i50 = 1;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                }
                                            case 5:
                                            case 14:
                                                i13 = i46;
                                                Unsafe unsafe13 = unsafe7;
                                                i19 = i53;
                                                Object obj11 = obj7;
                                                i20 = i55;
                                                i18 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                if (i61 != i50) {
                                                    bArr2 = bArr;
                                                    obj4 = obj11;
                                                    unsafe4 = unsafe13;
                                                    c1425t2 = c1425t;
                                                    break;
                                                } else {
                                                    i45 = i20 + 8;
                                                    i21 = i13 | i94;
                                                    long quebec = AbstractC1426u.quebec(i20, bArr);
                                                    obj7 = obj11;
                                                    bArr2 = bArr;
                                                    unsafe3 = unsafe13;
                                                    c1425t2 = c1425t;
                                                    unsafe3.putLong(obj7, j5, quebec);
                                                    int i972 = i16;
                                                    i51 = i17;
                                                    i48 = i972;
                                                    i44 = i5;
                                                    i46 = i21;
                                                    bArr11 = bArr2;
                                                    c1425t4 = c1425t2;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i50 = 1;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                    unsafe7 = unsafe3;
                                                }
                                            case 6:
                                            case 13:
                                                c1425t4 = c1425t;
                                                i13 = i46;
                                                unsafe5 = unsafe7;
                                                i19 = i53;
                                                obj5 = obj7;
                                                i20 = i55;
                                                i18 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                bArr3 = bArr;
                                                if (i61 != 5) {
                                                    break;
                                                } else {
                                                    i45 = i20 + 4;
                                                    i22 = i13 | i94;
                                                    unsafe5.putInt(obj5, j5, AbstractC1426u.delta(i20, bArr3));
                                                    int i98 = i16;
                                                    i51 = i17;
                                                    i48 = i98;
                                                    i44 = i5;
                                                    i46 = i22;
                                                    bArr11 = bArr3;
                                                    obj7 = obj5;
                                                    unsafe7 = unsafe5;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                }
                                            case 7:
                                                c1425t4 = c1425t;
                                                i13 = i46;
                                                unsafe5 = unsafe7;
                                                i19 = i53;
                                                obj5 = obj7;
                                                i20 = i55;
                                                i18 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                bArr3 = bArr;
                                                if (i61 != 0) {
                                                    break;
                                                } else {
                                                    i22 = i13 | i94;
                                                    i45 = AbstractC1426u.mike(bArr3, i20, c1425t4);
                                                    W.charlie.charlie(obj5, j5, c1425t4.bravo != 0 ? i50 : 0);
                                                    int i982 = i16;
                                                    i51 = i17;
                                                    i48 = i982;
                                                    i44 = i5;
                                                    i46 = i22;
                                                    bArr11 = bArr3;
                                                    obj7 = obj5;
                                                    unsafe7 = unsafe5;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                }
                                            case 8:
                                                c1425t4 = c1425t;
                                                unsafe5 = unsafe7;
                                                int i99 = i49;
                                                i19 = i53;
                                                obj5 = obj7;
                                                i13 = i46;
                                                i20 = i55;
                                                int i100 = i57;
                                                i16 = i48;
                                                i17 = xray;
                                                bArr3 = bArr;
                                                if (i61 != i99) {
                                                    i18 = i100;
                                                    break;
                                                } else {
                                                    if ((i62 & 536870912) != 0) {
                                                        juliet = AbstractC1426u.juliet(bArr3, i20, c1425t4);
                                                        int i101 = c1425t4.alpha;
                                                        if (i101 < 0) {
                                                            throw new zzer(str5);
                                                        }
                                                        int i102 = i13 | i94;
                                                        if (i101 == 0) {
                                                            c1425t4.charlie = str6;
                                                            i23 = i102;
                                                            i18 = i100;
                                                        } else {
                                                            int i103 = juliet | i101;
                                                            int length = bArr3.length;
                                                            ah ahVar2 = X.alpha;
                                                            if ((i103 | ((length - juliet) - i101)) >= 0) {
                                                                juliet += i101;
                                                                char[] cArr = new char[i101];
                                                                int i104 = juliet;
                                                                int i105 = 0;
                                                                while (true) {
                                                                    i23 = i102;
                                                                    if (i104 < juliet && (b4 = bArr3[i104]) >= 0) {
                                                                        i104++;
                                                                        cArr[i105] = (char) b4;
                                                                        i102 = i23;
                                                                        i105++;
                                                                    }
                                                                }
                                                                int i106 = i105;
                                                                while (i104 < juliet) {
                                                                    int i107 = i104;
                                                                    i104 = i107 + 1;
                                                                    int i108 = i100;
                                                                    byte b6 = bArr3[i107];
                                                                    if (b6 >= 0) {
                                                                        int i109 = i106 + 1;
                                                                        cArr[i106] = (char) b6;
                                                                        while (true) {
                                                                            i106 = i109;
                                                                            if (i104 < juliet && (b2 = bArr3[i104]) >= 0) {
                                                                                i104++;
                                                                                i109 = i106 + 1;
                                                                                cArr[i106] = (char) b2;
                                                                            }
                                                                        }
                                                                    } else if (b6 >= -32) {
                                                                        if (b6 >= -16) {
                                                                            i24 = juliet;
                                                                            if (i104 < i24 - 2) {
                                                                                byte b10 = bArr3[i104];
                                                                                int i110 = i107 + 3;
                                                                                byte b11 = bArr3[i107 + 2];
                                                                                int i111 = i107 + 4;
                                                                                byte b12 = bArr3[i110];
                                                                                if (AbstractC1426u.foxtrot(b10)) {
                                                                                    break;
                                                                                } else if ((((b10 + 112) + (b6 << 28)) >> 30) == 0 && !AbstractC1426u.foxtrot(b11) && !AbstractC1426u.foxtrot(b12)) {
                                                                                    int i112 = ((b11 & 63) << 6) | ((b10 & 63) << 12) | ((b6 & 7) << 18) | (b12 & 63);
                                                                                    cArr[i106] = (char) ((i112 >>> 10) + 55232);
                                                                                    cArr[i106 + 1] = (char) ((i112 & 1023) + 56320);
                                                                                    i106 += 2;
                                                                                    i104 = i111;
                                                                                }
                                                                            } else {
                                                                                throw new zzer("Protocol message had invalid UTF-8.");
                                                                            }
                                                                        } else if (i104 < juliet - 1) {
                                                                            int i113 = i106 + 1;
                                                                            int i114 = i107 + 2;
                                                                            byte b13 = bArr3[i104];
                                                                            int i115 = i107 + 3;
                                                                            byte b14 = bArr3[i114];
                                                                            if (!AbstractC1426u.foxtrot(b13)) {
                                                                                i24 = juliet;
                                                                                if (b6 == -32) {
                                                                                    if (b13 < -96) {
                                                                                        break;
                                                                                    } else {
                                                                                        b6 = -32;
                                                                                    }
                                                                                }
                                                                                if (b6 == -19) {
                                                                                    if (b13 >= -96) {
                                                                                        break;
                                                                                    } else {
                                                                                        b6 = -19;
                                                                                    }
                                                                                }
                                                                                if (AbstractC1426u.foxtrot(b14)) {
                                                                                    break;
                                                                                } else {
                                                                                    cArr[i106] = (char) (((b6 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                                    i104 = i115;
                                                                                    i106 = i113;
                                                                                }
                                                                            } else {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            throw new zzer("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        juliet = i24;
                                                                    } else if (i104 < juliet) {
                                                                        int i116 = i106 + 1;
                                                                        int i117 = i107 + 2;
                                                                        byte b15 = bArr3[i104];
                                                                        if (b6 >= -62 && !AbstractC1426u.foxtrot(b15)) {
                                                                            cArr[i106] = (char) (((b6 & 31) << 6) | (b15 & 63));
                                                                            i106 = i116;
                                                                            i104 = i117;
                                                                        }
                                                                    } else {
                                                                        throw new zzer("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    i100 = i108;
                                                                }
                                                                i18 = i100;
                                                                c1425t4.charlie = new String(cArr, 0, i106);
                                                            } else {
                                                                Integer valueOf = Integer.valueOf(length);
                                                                Integer valueOf2 = Integer.valueOf(juliet);
                                                                Integer valueOf3 = Integer.valueOf(i101);
                                                                Object[] objArr3 = new Object[3];
                                                                objArr3[0] = valueOf;
                                                                objArr3[i50] = valueOf2;
                                                                objArr3[2] = valueOf3;
                                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArr3));
                                                            }
                                                        }
                                                        i22 = i23;
                                                    } else {
                                                        i18 = i100;
                                                        i22 = i13 | i94;
                                                        juliet = AbstractC1426u.juliet(bArr3, i20, c1425t4);
                                                        int i118 = c1425t4.alpha;
                                                        if (i118 < 0) {
                                                            throw new zzer(str5);
                                                        }
                                                        if (i118 == 0) {
                                                            c1425t4.charlie = str6;
                                                        } else {
                                                            c1425t4.charlie = new String(bArr3, juliet, i118, at.alpha);
                                                            juliet += i118;
                                                        }
                                                    }
                                                    i45 = juliet;
                                                    unsafe5.putObject(obj5, j5, c1425t4.charlie);
                                                    int i9822 = i16;
                                                    i51 = i17;
                                                    i48 = i9822;
                                                    i44 = i5;
                                                    i46 = i22;
                                                    bArr11 = bArr3;
                                                    obj7 = obj5;
                                                    unsafe7 = unsafe5;
                                                    i53 = i19;
                                                    i47 = i18;
                                                    i49 = 2;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    e = this;
                                                }
                                                break;
                                            case 9:
                                                int i119 = i55;
                                                int i120 = i49;
                                                i13 = i46;
                                                i16 = i48;
                                                i17 = xray;
                                                Object obj12 = obj7;
                                                Unsafe unsafe14 = unsafe7;
                                                if (i61 != i120) {
                                                    i20 = i119;
                                                    i19 = i53;
                                                    c1425t2 = c1425t;
                                                    unsafe2 = unsafe14;
                                                    i18 = i57;
                                                    obj2 = obj12;
                                                    bArr2 = bArr;
                                                    break;
                                                } else {
                                                    Object black = e.black(i17, obj12);
                                                    c1425t4 = c1425t;
                                                    i44 = i5;
                                                    int oscar2 = AbstractC1426u.oscar(black, e.beige(i17), bArr, i119, i44, c1425t4);
                                                    e.mike(i17, obj12, black);
                                                    i45 = oscar2;
                                                    obj7 = obj12;
                                                    unsafe7 = unsafe14;
                                                    i51 = i17;
                                                    i48 = i16;
                                                    bArr11 = bArr;
                                                    i46 = i13 | i94;
                                                    i49 = i120;
                                                    i47 = i57;
                                                    i53 = i53;
                                                    break;
                                                }
                                            case 10:
                                                bArr4 = bArr;
                                                i25 = i55;
                                                int i121 = i49;
                                                i26 = i57;
                                                i27 = i53;
                                                i13 = i46;
                                                i16 = i48;
                                                i17 = xray;
                                                obj6 = obj7;
                                                unsafe6 = unsafe7;
                                                c1425t3 = c1425t;
                                                if (i61 != i121) {
                                                    break;
                                                } else {
                                                    alpha = AbstractC1426u.alpha(bArr4, i25, c1425t3);
                                                    unsafe6.putObject(obj6, j5, c1425t3.charlie);
                                                    i51 = i17;
                                                    i48 = i16;
                                                    i44 = i5;
                                                    bArr11 = bArr4;
                                                    i46 = i13 | i94;
                                                    i53 = i27;
                                                    i47 = i26;
                                                    i49 = 2;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    i45 = alpha;
                                                    c1425t4 = c1425t3;
                                                    unsafe7 = unsafe6;
                                                    obj7 = obj6;
                                                }
                                            case 12:
                                                bArr4 = bArr;
                                                i13 = i46;
                                                i25 = i55;
                                                i26 = i57;
                                                i27 = i53;
                                                i16 = i48;
                                                i17 = xray;
                                                obj6 = obj7;
                                                unsafe6 = unsafe7;
                                                c1425t3 = c1425t;
                                                if (i61 != 0) {
                                                    break;
                                                } else {
                                                    int juliet17 = AbstractC1426u.juliet(bArr4, i25, c1425t3);
                                                    int i122 = c1425t3.alpha;
                                                    ap azure3 = e.azure(i17);
                                                    if ((i62 & RecyclerView.UNDEFINED_DURATION) != 0 && azure3 != null && !azure3.alpha(i122)) {
                                                        uniform(obj6).charlie(i27, Long.valueOf(i122));
                                                        i51 = i17;
                                                        i48 = i16;
                                                        i44 = i5;
                                                        bArr11 = bArr4;
                                                        c1425t4 = c1425t3;
                                                        i53 = i27;
                                                        i47 = i26;
                                                        i46 = i13;
                                                    } else {
                                                        unsafe6.putInt(obj6, j5, i122);
                                                        i51 = i17;
                                                        i48 = i16;
                                                        i44 = i5;
                                                        i46 = i13 | i94;
                                                        bArr11 = bArr4;
                                                        c1425t4 = c1425t3;
                                                        i53 = i27;
                                                        i47 = i26;
                                                    }
                                                    i49 = 2;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    i45 = juliet17;
                                                    unsafe7 = unsafe6;
                                                    obj7 = obj6;
                                                }
                                            case 15:
                                                bArr4 = bArr;
                                                i13 = i46;
                                                i25 = i55;
                                                i26 = i57;
                                                i27 = i53;
                                                i16 = i48;
                                                i17 = xray;
                                                obj6 = obj7;
                                                unsafe6 = unsafe7;
                                                c1425t3 = c1425t;
                                                if (i61 != 0) {
                                                    break;
                                                } else {
                                                    alpha = AbstractC1426u.juliet(bArr4, i25, c1425t3);
                                                    unsafe6.putInt(obj6, j5, AbstractC1426u.charlie(c1425t3.alpha));
                                                    i51 = i17;
                                                    i48 = i16;
                                                    i44 = i5;
                                                    i46 = i13 | i94;
                                                    bArr11 = bArr4;
                                                    i53 = i27;
                                                    i47 = i26;
                                                    i49 = 2;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    i45 = alpha;
                                                    c1425t4 = c1425t3;
                                                    unsafe7 = unsafe6;
                                                    obj7 = obj6;
                                                }
                                            case 16:
                                                bArr4 = bArr;
                                                int i123 = i55;
                                                i16 = i48;
                                                Unsafe unsafe15 = unsafe7;
                                                if (i61 != 0) {
                                                    i17 = xray;
                                                    Object obj13 = obj7;
                                                    i20 = i123;
                                                    c1425t2 = c1425t;
                                                    i19 = i53;
                                                    i18 = i57;
                                                    unsafe2 = unsafe15;
                                                    obj2 = obj13;
                                                    i13 = i46;
                                                    break;
                                                } else {
                                                    int mike2 = AbstractC1426u.mike(bArr4, i123, c1425t);
                                                    long j11 = c1425t.bravo;
                                                    int i124 = xray;
                                                    unsafe15.putLong(obj7, j5, (-(j11 & 1)) ^ (j11 >>> i50));
                                                    Object obj14 = obj7;
                                                    unsafe6 = unsafe15;
                                                    obj6 = obj14;
                                                    i51 = i124;
                                                    i48 = i16;
                                                    i44 = i5;
                                                    bArr11 = bArr4;
                                                    i46 |= i94;
                                                    c1425t4 = c1425t;
                                                    i53 = i53;
                                                    i47 = i57;
                                                    i45 = mike2;
                                                    i49 = 2;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    unsafe7 = unsafe6;
                                                    obj7 = obj6;
                                                }
                                            default:
                                                if (i61 != i52) {
                                                    int i125 = i55;
                                                    i16 = i48;
                                                    Unsafe unsafe16 = unsafe7;
                                                    bArr2 = bArr;
                                                    c1425t2 = c1425t;
                                                    i17 = xray;
                                                    i18 = i57;
                                                    unsafe2 = unsafe16;
                                                    i19 = i53;
                                                    obj2 = obj7;
                                                    i13 = i46;
                                                    i20 = i125;
                                                    break;
                                                } else {
                                                    int i126 = i46 | i94;
                                                    Object black2 = e.black(xray, obj7);
                                                    int november4 = AbstractC1426u.november(black2, e.beige(xray), bArr, i55, i5, (i57 << 3) | 4, c1425t);
                                                    e.mike(xray, obj7, black2);
                                                    i44 = i5;
                                                    bArr11 = bArr;
                                                    c1425t4 = c1425t;
                                                    i47 = i57;
                                                    unsafe7 = unsafe7;
                                                    i52 = 3;
                                                    i54 = 1048575;
                                                    i45 = november4;
                                                    i49 = i49;
                                                    i48 = i48;
                                                    i46 = i126;
                                                    i51 = xray;
                                                }
                                        }
                                    }
                                } else {
                                    objArr = objArr2;
                                    i11 = i10;
                                    i13 = i46;
                                    unsafe = unsafe7;
                                    iArr = iArr2;
                                    str = str5;
                                    str2 = str6;
                                    i14 = i55;
                                    i12 = i53;
                                    i51 = 0;
                                    obj2 = obj7;
                                    i15 = i57;
                                }
                            }
                            xray = -1;
                            if (xray == -1) {
                            }
                        } else {
                            if (i57 >= i59 && i57 <= i58) {
                                xray = e.xray(i57, 0);
                                if (xray == -1) {
                                }
                            }
                            xray = -1;
                            if (xray == -1) {
                            }
                        }
                    } else {
                        objArr = objArr2;
                        obj2 = obj7;
                        unsafe = unsafe7;
                        iArr = iArr2;
                        E e4 = e;
                        i11 = i10;
                        i12 = i53;
                    }
                }
                i52 = 3;
            }
            throw new zzer("Protocol message had invalid UTF-8.");
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj7)));
    }

    public final int xray(int i4, int i5) {
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

    public final int zulu(int i4) {
        return this.alpha[i4 + 1];
    }
}
