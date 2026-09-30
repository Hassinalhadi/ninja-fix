package com.google.protobuf;

import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class al implements au {
    public static final int[] juliet = new int[0];
    public static final Unsafe kilo = L.juliet();
    public final int[] alpha;
    public final Object[] bravo;
    public final aj charlie;
    public final int[] delta;
    public final int echo;
    public final an foxtrot;
    public final aa golf;
    public final B hotel;
    public final ag india;

    public al(int[] iArr, Object[] objArr, aj ajVar, int[] iArr2, int i4, an anVar, aa aaVar, B b2, C1506i c1506i, ag agVar) {
        this.alpha = iArr;
        this.bravo = objArr;
        boolean z2 = ajVar instanceof AbstractC1513p;
        this.delta = iArr2;
        this.echo = i4;
        this.foxtrot = anVar;
        this.golf = aaVar;
        this.hotel = b2;
        this.charlie = ajVar;
        this.india = agVar;
    }

    public static boolean mike(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1513p) {
            return ((AbstractC1513p) obj).mike();
        }
        return true;
    }

    public static al quebec(at atVar, an anVar, aa aaVar, B b2, C1506i c1506i, ag agVar) {
        if (atVar instanceof at) {
            return romeo(atVar, anVar, aaVar, b2, c1506i, agVar);
        }
        atVar.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0392  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static al romeo(at atVar, an anVar, aa aaVar, B b2, C1506i c1506i, ag agVar) {
        int i4;
        int charAt;
        int charAt2;
        int i5;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        int i17;
        int i18;
        char charAt7;
        int i19;
        char charAt8;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Object[] objArr;
        int i25;
        int i26;
        int objectFieldOffset;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Field uniform;
        char charAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Field uniform2;
        Field uniform3;
        int i37;
        char charAt10;
        int i38;
        int i39;
        char charAt11;
        int i40;
        char charAt12;
        int i41;
        char charAt13;
        String str = atVar.bravo;
        int length = str.length();
        char c3 = 55296;
        if (str.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i4 = i42 + 1;
                if (str.charAt(i42) < 55296) {
                    break;
                }
                i42 = i4;
            }
        } else {
            i4 = 1;
        }
        int i43 = i4 + 1;
        int charAt14 = str.charAt(i4);
        if (charAt14 >= 55296) {
            int i44 = charAt14 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                charAt13 = str.charAt(i43);
                if (charAt13 < 55296) {
                    break;
                }
                i44 |= (charAt13 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            charAt14 = i44 | (charAt13 << i45);
            i43 = i41;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i10 = 0;
            i11 = 0;
            iArr = juliet;
            i5 = 0;
        } else {
            int i46 = i43 + 1;
            int charAt15 = str.charAt(i43);
            if (charAt15 >= 55296) {
                int i47 = charAt15 & 8191;
                int i48 = 13;
                while (true) {
                    i19 = i46 + 1;
                    charAt8 = str.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i19;
                }
                charAt15 = i47 | (charAt8 << i48);
                i46 = i19;
            }
            int i49 = i46 + 1;
            int charAt16 = str.charAt(i46);
            if (charAt16 >= 55296) {
                int i50 = charAt16 & 8191;
                int i51 = 13;
                while (true) {
                    i18 = i49 + 1;
                    charAt7 = str.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i18;
                }
                charAt16 = i50 | (charAt7 << i51);
                i49 = i18;
            }
            int i52 = i49 + 1;
            if (str.charAt(i49) >= 55296) {
                while (true) {
                    i17 = i52 + 1;
                    if (str.charAt(i52) < 55296) {
                        break;
                    }
                    i52 = i17;
                }
                i52 = i17;
            }
            int i53 = i52 + 1;
            if (str.charAt(i52) >= 55296) {
                while (true) {
                    i16 = i53 + 1;
                    if (str.charAt(i53) < 55296) {
                        break;
                    }
                    i53 = i16;
                }
                i53 = i16;
            }
            int i54 = i53 + 1;
            charAt = str.charAt(i53);
            if (charAt >= 55296) {
                int i55 = charAt & 8191;
                int i56 = 13;
                while (true) {
                    i15 = i54 + 1;
                    charAt6 = str.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i15;
                }
                charAt = i55 | (charAt6 << i56);
                i54 = i15;
            }
            int i57 = i54 + 1;
            charAt2 = str.charAt(i54);
            if (charAt2 >= 55296) {
                int i58 = charAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i14 = i57 + 1;
                    charAt5 = str.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i14;
                }
                charAt2 = i58 | (charAt5 << i59);
                i57 = i14;
            }
            int i60 = i57 + 1;
            int charAt17 = str.charAt(i57);
            if (charAt17 >= 55296) {
                int i61 = charAt17 & 8191;
                int i62 = 13;
                while (true) {
                    i13 = i60 + 1;
                    charAt4 = str.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i13;
                }
                charAt17 = i61 | (charAt4 << i62);
                i60 = i13;
            }
            int i63 = i60 + 1;
            int charAt18 = str.charAt(i60);
            if (charAt18 >= 55296) {
                int i64 = charAt18 & 8191;
                int i65 = 13;
                while (true) {
                    i12 = i63 + 1;
                    charAt3 = str.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i12;
                }
                charAt18 = i64 | (charAt3 << i65);
                i63 = i12;
            }
            int i66 = (charAt15 * 2) + charAt16;
            i5 = charAt15;
            i43 = i63;
            iArr = new int[charAt18 + charAt2 + charAt17];
            i10 = i66;
            i11 = charAt18;
        }
        Unsafe unsafe = kilo;
        Class<?> cls = atVar.alpha.getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i67 = charAt2 + i11;
        int i68 = i11;
        int i69 = 0;
        int i70 = 0;
        while (i43 < length) {
            int i71 = i43 + 1;
            int charAt19 = str.charAt(i43);
            if (charAt19 >= c3) {
                int i72 = charAt19 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i40 = i73 + 1;
                    charAt12 = str.charAt(i73);
                    if (charAt12 < c3) {
                        break;
                    }
                    i72 |= (charAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i40;
                }
                charAt19 = i72 | (charAt12 << i74);
                i20 = i40;
            } else {
                i20 = i71;
            }
            int i75 = i20 + 1;
            int charAt20 = str.charAt(i20);
            if (charAt20 >= c3) {
                int i76 = charAt20 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i39 = i77 + 1;
                    charAt11 = str.charAt(i77);
                    i21 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i76 |= (charAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i39;
                    length = i21;
                }
                charAt20 = i76 | (charAt11 << i78);
                i22 = i39;
            } else {
                i21 = length;
                i22 = i75;
            }
            int i79 = charAt20 & 255;
            int[] iArr3 = iArr2;
            if ((charAt20 & Barcode.FORMAT_UPC_E) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            Object[] objArr3 = atVar.charlie;
            if (i79 >= 51) {
                int i80 = i22 + 1;
                int charAt21 = str.charAt(i22);
                if (charAt21 >= 55296) {
                    int i81 = charAt21 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i37 = i82 + 1;
                        charAt10 = str.charAt(i82);
                        i38 = i81;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i81 = i38 | ((charAt10 & 8191) << i83);
                        i83 += 13;
                        i82 = i37;
                    }
                    charAt21 = i38 | (charAt10 << i83);
                    i36 = i37;
                } else {
                    i36 = i80;
                }
                int i84 = charAt21;
                int i85 = i79 - 51;
                int i86 = i36;
                if (i85 == 9 || i85 == 17) {
                    i23 = charAt19;
                    objArr2[P0.zulu(i69, 3, 2, 1)] = objArr3[i10];
                    i10++;
                } else {
                    if (i85 == 12 && (av.q.bravo(atVar.alpha(), 1) || (charAt20 & 2048) != 0)) {
                        i23 = charAt19;
                        objArr2[P0.zulu(i69, 3, 2, 1)] = objArr3[i10];
                        i10++;
                    }
                    i23 = charAt19;
                }
                int i87 = i84 * 2;
                Object obj = objArr3[i87];
                if (obj instanceof Field) {
                    uniform2 = (Field) obj;
                } else {
                    uniform2 = uniform(cls, (String) obj);
                    objArr3[i87] = uniform2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(uniform2);
                int i88 = i87 + 1;
                Object obj2 = objArr3[i88];
                if (obj2 instanceof Field) {
                    uniform3 = (Field) obj2;
                } else {
                    uniform3 = uniform(cls, (String) obj2);
                    objArr3[i88] = uniform3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(uniform3);
                i24 = i5;
                objArr = objArr2;
                i31 = objectFieldOffset2;
                i43 = i86;
                i27 = objectFieldOffset3;
                i25 = i69;
                i30 = i10;
                i29 = 0;
            } else {
                i23 = charAt19;
                int i89 = i10 + 1;
                Field uniform4 = uniform(cls, (String) objArr3[i10]);
                if (i79 == 9 || i79 == 17) {
                    i24 = i5;
                    objArr = objArr2;
                    objArr[P0.zulu(i69, 3, 2, 1)] = uniform4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i24 = i5;
                        objArr = objArr2;
                        i32 = i10 + 2;
                        objArr[P0.zulu(i69, 3, 2, 1)] = objArr3[i89];
                    } else if (i79 != 12 && i79 != 30 && i79 != 44) {
                        if (i79 == 50) {
                            int i90 = i68 + 1;
                            iArr[i68] = i69;
                            int i91 = (i69 / 3) * 2;
                            int i92 = i10 + 2;
                            objArr2[i91] = objArr3[i89];
                            if ((charAt20 & 2048) != 0) {
                                i26 = i10 + 3;
                                objArr2[i91 + 1] = objArr3[i92];
                                i24 = i5;
                                objArr = objArr2;
                                i68 = i90;
                            } else {
                                objArr = objArr2;
                                i26 = i92;
                                i68 = i90;
                                i24 = i5;
                            }
                            i25 = i69;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(uniform4);
                            if ((charAt20 & 4096) == 0 && i79 <= 17) {
                                int i93 = i22 + 1;
                                int charAt22 = str.charAt(i22);
                                if (charAt22 >= 55296) {
                                    int i94 = charAt22 & 8191;
                                    int i95 = 13;
                                    while (true) {
                                        i28 = i93 + 1;
                                        charAt9 = str.charAt(i93);
                                        if (charAt9 < 55296) {
                                            break;
                                        }
                                        i94 |= (charAt9 & 8191) << i95;
                                        i95 += 13;
                                        i93 = i28;
                                    }
                                    charAt22 = i94 | (charAt9 << i95);
                                } else {
                                    i28 = i93;
                                }
                                int i96 = (charAt22 / 32) + (i24 * 2);
                                Object obj3 = objArr3[i96];
                                if (obj3 instanceof Field) {
                                    uniform = (Field) obj3;
                                } else {
                                    uniform = uniform(cls, (String) obj3);
                                    objArr3[i96] = uniform;
                                }
                                i27 = (int) unsafe.objectFieldOffset(uniform);
                                i29 = charAt22 % 32;
                            } else {
                                i27 = 1048575;
                                i28 = i22;
                                i29 = 0;
                            }
                            if (i79 >= 18 && i79 <= 49) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i30 = i26;
                            i31 = objectFieldOffset;
                            i43 = i28;
                        } else {
                            i24 = i5;
                            objArr = objArr2;
                        }
                    } else {
                        i24 = i5;
                        if (atVar.alpha() != 1 && (charAt20 & 2048) == 0) {
                            objArr = objArr2;
                        } else {
                            objArr = objArr2;
                            i32 = i10 + 2;
                            objArr[P0.zulu(i69, 3, 2, 1)] = objArr3[i89];
                        }
                    }
                    i25 = i69;
                    i26 = i32;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(uniform4);
                    if ((charAt20 & 4096) == 0) {
                    }
                    i27 = 1048575;
                    i28 = i22;
                    i29 = 0;
                    if (i79 >= 18) {
                        iArr[i67] = objectFieldOffset;
                        i67++;
                    }
                    i30 = i26;
                    i31 = objectFieldOffset;
                    i43 = i28;
                }
                i25 = i69;
                i26 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(uniform4);
                if ((charAt20 & 4096) == 0) {
                }
                i27 = 1048575;
                i28 = i22;
                i29 = 0;
                if (i79 >= 18) {
                }
                i30 = i26;
                i31 = objectFieldOffset;
                i43 = i28;
            }
            int i97 = i25 + 1;
            iArr3[i25] = i23;
            int i98 = i25 + 2;
            if ((charAt20 & 512) != 0) {
                i33 = 536870912;
            } else {
                i33 = 0;
            }
            String str2 = str;
            if ((charAt20 & Barcode.FORMAT_QR_CODE) != 0) {
                i34 = 268435456;
            } else {
                i34 = 0;
            }
            int i99 = i34 | i33;
            if ((charAt20 & 2048) != 0) {
                i35 = RecyclerView.UNDEFINED_DURATION;
            } else {
                i35 = 0;
            }
            iArr3[i97] = i99 | i35 | (i79 << 20) | i31;
            int i100 = i25 + 3;
            iArr3[i98] = (i29 << 20) | i27;
            i10 = i30;
            iArr2 = iArr3;
            objArr2 = objArr;
            length = i21;
            i5 = i24;
            c3 = 55296;
            i69 = i100;
            str = str2;
        }
        return new al(iArr2, objArr2, atVar.alpha, iArr, i11, anVar, aaVar, b2, c1506i, agVar);
    }

    public static int sierra(long j5, Object obj) {
        return ((Integer) L.charlie.india(j5, obj)).intValue();
    }

    public static long tango(long j5, Object obj) {
        return ((Long) L.charlie.india(j5, obj)).longValue();
    }

    public static Field uniform(Class cls, String str) {
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

    public static int whiskey(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    @Override // com.google.protobuf.au
    public final void alpha(Object obj) {
        if (mike(obj)) {
            if (obj instanceof AbstractC1513p) {
                AbstractC1513p abstractC1513p = (AbstractC1513p) obj;
                abstractC1513p.quebec(LottieConstants.IterateForever);
                abstractC1513p.memoizedHashCode = 0;
                abstractC1513p.november();
            }
            int[] iArr = this.alpha;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int xray = xray(i4);
                long j5 = 1048575 & xray;
                int whiskey = whiskey(xray);
                if (whiskey != 9) {
                    if (whiskey != 60 && whiskey != 68) {
                        switch (whiskey) {
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
                                this.golf.alpha(j5, obj);
                                break;
                            case 50:
                                Unsafe unsafe = kilo;
                                Object object = unsafe.getObject(obj, j5);
                                if (object != null) {
                                    this.india.getClass();
                                    ((af) object).alpha = false;
                                    unsafe.putObject(obj, j5, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (november(iArr[i4], i4, obj)) {
                        juliet(i4).alpha(kilo.getObject(obj, j5));
                    }
                }
                if (kilo(i4, obj)) {
                    juliet(i4).alpha(kilo.getObject(obj, j5));
                }
            }
            ((D) this.hotel).getClass();
            C c3 = ((AbstractC1513p) obj).unknownFields;
            if (c3.echo) {
                c3.echo = false;
            }
        }
    }

    @Override // com.google.protobuf.au
    public final boolean bravo(Object obj) {
        int i4;
        int i5;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.echo) {
            int i14 = this.delta[i13];
            int[] iArr = this.alpha;
            int i15 = iArr[i14];
            int xray = xray(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = kilo.getInt(obj, i17);
                }
                i5 = i14;
                i10 = i12;
                i4 = i17;
            } else {
                int i19 = i12;
                i4 = i11;
                i5 = i14;
                i10 = i19;
            }
            if ((268435456 & xray) == 0 || lima(obj, i5, i4, i10, i18)) {
                int whiskey = whiskey(xray);
                if (whiskey != 9 && whiskey != 17) {
                    if (whiskey != 27) {
                        if (whiskey != 60 && whiskey != 68) {
                            if (whiskey != 49) {
                                if (whiskey != 50) {
                                    continue;
                                } else {
                                    Object india = L.charlie.india(xray & 1048575, obj);
                                    this.india.getClass();
                                    af afVar = (af) india;
                                    if (afVar.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((ae) this.bravo[(i5 / 3) * 2]).alpha.bravo.alpha != U.MESSAGE) {
                                            continue;
                                        } else {
                                            au auVar = null;
                                            for (Object obj2 : afVar.values()) {
                                                if (auVar == null) {
                                                    auVar = ar.charlie.alpha(obj2.getClass());
                                                }
                                                if (!auVar.bravo(obj2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i13++;
                                i11 = i4;
                                i12 = i10;
                            }
                        } else {
                            if (november(i15, i5, obj)) {
                                if (!juliet(i5).bravo(L.charlie.india(xray & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i13++;
                            i11 = i4;
                            i12 = i10;
                        }
                    }
                    List list = (List) L.charlie.india(xray & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        au juliet2 = juliet(i5);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (juliet2.bravo(list.get(i20))) {
                            }
                        }
                    }
                    i13++;
                    i11 = i4;
                    i12 = i10;
                } else {
                    if (lima(obj, i5, i4, i10, i18)) {
                        if (!juliet(i5).bravo(L.charlie.india(xray & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i13++;
                    i11 = i4;
                    i12 = i10;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.au
    public final AbstractC1513p charlie() {
        this.foxtrot.getClass();
        return (AbstractC1513p) ((AbstractC1513p) this.charlie).juliet(4);
    }

    @Override // com.google.protobuf.au
    public final void delta(Object obj, Object obj2) {
        Object obj3;
        if (mike(obj)) {
            obj2.getClass();
            int i4 = 0;
            while (true) {
                int[] iArr = this.alpha;
                if (i4 < iArr.length) {
                    int xray = xray(i4);
                    long j5 = xray & 1048575;
                    int i5 = iArr[i4];
                    switch (whiskey(xray)) {
                        case 0:
                            obj3 = obj;
                            if (!kilo(i4, obj2)) {
                                break;
                            } else {
                                K k6 = L.charlie;
                                k6.mike(obj3, j5, k6.echo(j5, obj2));
                                victor(i4, obj3);
                                continue;
                            }
                        case 1:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                K k10 = L.charlie;
                                k10.november(obj3, j5, k10.foxtrot(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                K k11 = L.charlie;
                                k11.papa(obj3, j5, k11.hotel(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                K k12 = L.charlie;
                                k12.papa(obj3, j5, k12.hotel(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.november(j5, L.charlie.golf(j5, obj2), obj3);
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                K k13 = L.charlie;
                                k13.papa(obj3, j5, k13.hotel(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.november(j5, L.charlie.golf(j5, obj2), obj3);
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                K k14 = L.charlie;
                                k14.kilo(obj3, j5, k14.charlie(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.oscar(obj3, j5, L.charlie.india(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            obj3 = obj;
                            oscar(i4, obj3, obj2);
                            continue;
                        case 10:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.oscar(obj3, j5, L.charlie.india(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.november(j5, L.charlie.golf(j5, obj2), obj3);
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.november(j5, L.charlie.golf(j5, obj2), obj3);
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.november(j5, L.charlie.golf(j5, obj2), obj3);
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                K k15 = L.charlie;
                                k15.papa(obj3, j5, k15.hotel(j5, obj2));
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            obj3 = obj;
                            if (kilo(i4, obj2)) {
                                L.november(j5, L.charlie.golf(j5, obj2), obj3);
                                victor(i4, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (kilo(i4, obj2)) {
                                K k16 = L.charlie;
                                obj3 = obj;
                                k16.papa(obj3, j5, k16.hotel(j5, obj2));
                                victor(i4, obj3);
                                break;
                            }
                            break;
                        case 17:
                            oscar(i4, obj, obj2);
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
                            this.golf.bravo(obj, j5, obj2);
                            break;
                        case 50:
                            Class cls = av.alpha;
                            K k17 = L.charlie;
                            Object india = k17.india(j5, obj);
                            Object india2 = k17.india(j5, obj2);
                            this.india.getClass();
                            af afVar = (af) india;
                            af afVar2 = (af) india2;
                            if (!afVar2.isEmpty()) {
                                if (!afVar.alpha) {
                                    afVar = afVar.charlie();
                                }
                                afVar.bravo();
                                if (!afVar2.isEmpty()) {
                                    afVar.putAll(afVar2);
                                }
                            }
                            L.oscar(obj, j5, afVar);
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
                            if (november(i5, i4, obj2)) {
                                L.oscar(obj, j5, L.charlie.india(j5, obj2));
                                L.november(iArr[i4 + 2] & 1048575, i5, obj);
                                break;
                            }
                            break;
                        case 60:
                            papa(i4, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (november(i5, i4, obj2)) {
                                L.oscar(obj, j5, L.charlie.india(j5, obj2));
                                L.november(iArr[i4 + 2] & 1048575, i5, obj);
                                break;
                            }
                            break;
                        case 68:
                            papa(i4, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i4 += 3;
                    obj = obj3;
                } else {
                    av.juliet(this.hotel, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(P0.bronze(obj, "Mutating immutable message: "));
        }
    }

    @Override // com.google.protobuf.au
    public final void echo(Object obj, ac acVar) {
        acVar.getClass();
        yankee(obj, acVar);
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
    @Override // com.google.protobuf.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int foxtrot(AbstractC1513p abstractC1513p) {
        int i4;
        int alpha;
        int i5;
        int[] iArr = this.alpha;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int xray = xray(i11);
            int i12 = iArr[i11];
            long j5 = 1048575 & xray;
            int i13 = 1237;
            int i14 = 37;
            switch (whiskey(xray)) {
                case 0:
                    i4 = i10 * 53;
                    alpha = AbstractC1517u.alpha(Double.doubleToLongBits(L.charlie.echo(j5, abstractC1513p)));
                    i10 = alpha + i4;
                    break;
                case 1:
                    i4 = i10 * 53;
                    alpha = Float.floatToIntBits(L.charlie.foxtrot(j5, abstractC1513p));
                    i10 = alpha + i4;
                    break;
                case 2:
                    i4 = i10 * 53;
                    alpha = AbstractC1517u.alpha(L.charlie.hotel(j5, abstractC1513p));
                    i10 = alpha + i4;
                    break;
                case 3:
                    i4 = i10 * 53;
                    alpha = AbstractC1517u.alpha(L.charlie.hotel(j5, abstractC1513p));
                    i10 = alpha + i4;
                    break;
                case 4:
                    i4 = i10 * 53;
                    alpha = L.charlie.golf(j5, abstractC1513p);
                    i10 = alpha + i4;
                    break;
                case 5:
                    i4 = i10 * 53;
                    alpha = AbstractC1517u.alpha(L.charlie.hotel(j5, abstractC1513p));
                    i10 = alpha + i4;
                    break;
                case 6:
                    i4 = i10 * 53;
                    alpha = L.charlie.golf(j5, abstractC1513p);
                    i10 = alpha + i4;
                    break;
                case 7:
                    i5 = i10 * 53;
                    boolean charlie = L.charlie.charlie(j5, abstractC1513p);
                    Charset charset = AbstractC1517u.alpha;
                    break;
                case 8:
                    i4 = i10 * 53;
                    alpha = ((String) L.charlie.india(j5, abstractC1513p)).hashCode();
                    i10 = alpha + i4;
                    break;
                case 9:
                    Object india = L.charlie.india(j5, abstractC1513p);
                    if (india != null) {
                        i14 = india.hashCode();
                    }
                    i10 = (i10 * 53) + i14;
                    break;
                case 10:
                    i4 = i10 * 53;
                    alpha = L.charlie.india(j5, abstractC1513p).hashCode();
                    i10 = alpha + i4;
                    break;
                case 11:
                    i4 = i10 * 53;
                    alpha = L.charlie.golf(j5, abstractC1513p);
                    i10 = alpha + i4;
                    break;
                case 12:
                    i4 = i10 * 53;
                    alpha = L.charlie.golf(j5, abstractC1513p);
                    i10 = alpha + i4;
                    break;
                case 13:
                    i4 = i10 * 53;
                    alpha = L.charlie.golf(j5, abstractC1513p);
                    i10 = alpha + i4;
                    break;
                case 14:
                    i4 = i10 * 53;
                    alpha = AbstractC1517u.alpha(L.charlie.hotel(j5, abstractC1513p));
                    i10 = alpha + i4;
                    break;
                case 15:
                    i4 = i10 * 53;
                    alpha = L.charlie.golf(j5, abstractC1513p);
                    i10 = alpha + i4;
                    break;
                case 16:
                    i4 = i10 * 53;
                    alpha = AbstractC1517u.alpha(L.charlie.hotel(j5, abstractC1513p));
                    i10 = alpha + i4;
                    break;
                case 17:
                    Object india2 = L.charlie.india(j5, abstractC1513p);
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
                    alpha = L.charlie.india(j5, abstractC1513p).hashCode();
                    i10 = alpha + i4;
                    break;
                case 50:
                    i4 = i10 * 53;
                    alpha = L.charlie.india(j5, abstractC1513p).hashCode();
                    i10 = alpha + i4;
                    break;
                case 51:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = AbstractC1517u.alpha(Double.doubleToLongBits(((Double) L.charlie.india(j5, abstractC1513p)).doubleValue()));
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = Float.floatToIntBits(((Float) L.charlie.india(j5, abstractC1513p)).floatValue());
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = AbstractC1517u.alpha(tango(j5, abstractC1513p));
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = AbstractC1517u.alpha(tango(j5, abstractC1513p));
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = sierra(j5, abstractC1513p);
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = AbstractC1517u.alpha(tango(j5, abstractC1513p));
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = sierra(j5, abstractC1513p);
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (november(i12, i11, abstractC1513p)) {
                        i5 = i10 * 53;
                        boolean booleanValue = ((Boolean) L.charlie.india(j5, abstractC1513p)).booleanValue();
                        Charset charset2 = AbstractC1517u.alpha;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = ((String) L.charlie.india(j5, abstractC1513p)).hashCode();
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = L.charlie.india(j5, abstractC1513p).hashCode();
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = L.charlie.india(j5, abstractC1513p).hashCode();
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = sierra(j5, abstractC1513p);
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = sierra(j5, abstractC1513p);
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = sierra(j5, abstractC1513p);
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = AbstractC1517u.alpha(tango(j5, abstractC1513p));
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = sierra(j5, abstractC1513p);
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = AbstractC1517u.alpha(tango(j5, abstractC1513p));
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (november(i12, i11, abstractC1513p)) {
                        i4 = i10 * 53;
                        alpha = L.charlie.india(j5, abstractC1513p).hashCode();
                        i10 = alpha + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((D) this.hotel).getClass();
        return abstractC1513p.unknownFields.hashCode() + (i10 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x0318. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x0222. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031b A[SYNTHETIC] */
    @Override // com.google.protobuf.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int golf(AbstractC1513p abstractC1513p) {
        int i4;
        int i5;
        int hotel;
        int hotel2;
        int hotel3;
        int juliet2;
        int hotel4;
        int foxtrot;
        int hotel5;
        int hotel6;
        int golf;
        int delta;
        int i10;
        int charlie;
        int i11;
        int i12;
        int hotel7;
        int size;
        int india;
        int hotel8;
        int hotel9;
        int golf2;
        int golf3;
        int hotel10;
        int size2;
        int hotel11;
        int india2;
        int i13;
        int i14;
        int juliet3;
        int hotel12;
        int india3;
        T t5;
        int juliet4;
        int hotel13;
        int india4;
        int hotel14;
        int hotel15;
        int hotel16;
        int juliet5;
        int hotel17;
        int foxtrot2;
        int hotel18;
        int golf4;
        int india5;
        al alVar = this;
        AbstractC1513p abstractC1513p2 = abstractC1513p;
        int i15 = 2;
        int i16 = 1;
        Unsafe unsafe = kilo;
        int i17 = 1048575;
        int i18 = 1048575;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            int[] iArr = alVar.alpha;
            if (i19 < iArr.length) {
                int xray = alVar.xray(i19);
                int whiskey = whiskey(xray);
                int i22 = iArr[i19];
                int i23 = iArr[i19 + 2];
                int i24 = i23 & i17;
                int i25 = i15;
                if (whiskey <= 17) {
                    if (i24 != i18) {
                        if (i24 == i17) {
                            i20 = 0;
                        } else {
                            i20 = unsafe.getInt(abstractC1513p2, i24);
                        }
                        i18 = i24;
                    }
                    i4 = i16 << (i23 >>> 20);
                } else {
                    i4 = 0;
                }
                long j5 = xray & i17;
                if (whiskey >= EnumC1509l.purple.alpha) {
                    int i26 = EnumC1509l.red.alpha;
                }
                char c3 = '?';
                switch (whiskey) {
                    case 0:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            hotel = C1503f.hotel(i22) + 8;
                            i21 += hotel;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        } else {
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                    case 1:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            hotel2 = C1503f.hotel(i22);
                            hotel6 = hotel2 + 4;
                            i21 += hotel6;
                        }
                        alVar = this;
                        abstractC1513p2 = abstractC1513p;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 2:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            long j6 = unsafe.getLong(abstractC1513p2, j5);
                            hotel3 = C1503f.hotel(i22);
                            juliet2 = C1503f.juliet(j6);
                            i21 += juliet2 + hotel3;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 3:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            long j7 = unsafe.getLong(abstractC1513p2, j5);
                            hotel3 = C1503f.hotel(i22);
                            juliet2 = C1503f.juliet(j7);
                            i21 += juliet2 + hotel3;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 4:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            int i27 = unsafe.getInt(abstractC1513p2, j5);
                            hotel4 = C1503f.hotel(i22);
                            foxtrot = C1503f.foxtrot(i27);
                            delta = foxtrot + hotel4;
                            i21 += delta;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 5:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            hotel5 = C1503f.hotel(i22);
                            hotel6 = hotel5 + 8;
                            i21 += hotel6;
                        }
                        alVar = this;
                        abstractC1513p2 = abstractC1513p;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 6:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            hotel2 = C1503f.hotel(i22);
                            hotel6 = hotel2 + 4;
                            i21 += hotel6;
                        }
                        alVar = this;
                        abstractC1513p2 = abstractC1513p;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 7:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            hotel6 = C1503f.hotel(i22) + 1;
                            i21 += hotel6;
                        }
                        alVar = this;
                        abstractC1513p2 = abstractC1513p;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 8:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            Object object = unsafe.getObject(abstractC1513p2, j5);
                            if (object instanceof C1502e) {
                                golf = C1503f.delta(i22, (C1502e) object);
                            } else {
                                golf = C1503f.golf((String) object) + C1503f.hotel(i22);
                            }
                            i21 = golf + i21;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 9:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            Object object2 = unsafe.getObject(abstractC1513p2, j5);
                            au juliet6 = alVar.juliet(i19);
                            Class cls = av.alpha;
                            int hotel19 = C1503f.hotel(i22);
                            int hotel20 = ((AbstractC1498a) ((aj) object2)).hotel(juliet6);
                            i21 += C1503f.india(hotel20) + hotel20 + hotel19;
                        }
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 10:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            delta = C1503f.delta(i22, (C1502e) unsafe.getObject(abstractC1513p2, j5));
                            i21 += delta;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 11:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            int i28 = unsafe.getInt(abstractC1513p2, j5);
                            hotel4 = C1503f.hotel(i22);
                            foxtrot = C1503f.india(i28);
                            delta = foxtrot + hotel4;
                            i21 += delta;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 12:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            int i29 = unsafe.getInt(abstractC1513p2, j5);
                            hotel4 = C1503f.hotel(i22);
                            foxtrot = C1503f.foxtrot(i29);
                            delta = foxtrot + hotel4;
                            i21 += delta;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 13:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            hotel2 = C1503f.hotel(i22);
                            hotel6 = hotel2 + 4;
                            i21 += hotel6;
                        }
                        alVar = this;
                        abstractC1513p2 = abstractC1513p;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 14:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            hotel5 = C1503f.hotel(i22);
                            hotel6 = hotel5 + 8;
                            i21 += hotel6;
                        }
                        alVar = this;
                        abstractC1513p2 = abstractC1513p;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 15:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            int i30 = unsafe.getInt(abstractC1513p2, j5);
                            hotel4 = C1503f.hotel(i22);
                            foxtrot = C1503f.india((i30 >> 31) ^ (i30 << 1));
                            delta = foxtrot + hotel4;
                            i21 += delta;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 16:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            long j10 = unsafe.getLong(abstractC1513p2, j5);
                            hotel3 = C1503f.hotel(i22);
                            juliet2 = C1503f.juliet((j10 >> 63) ^ (j10 << i5));
                            i21 += juliet2 + hotel3;
                        }
                        alVar = this;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 17:
                        i5 = i16;
                        if (alVar.lima(abstractC1513p2, i19, i18, i20, i4)) {
                            aj ajVar = (aj) unsafe.getObject(abstractC1513p2, j5);
                            hotel = ((AbstractC1498a) ajVar).hotel(alVar.juliet(i19)) + (C1503f.hotel(i22) * 2);
                            i21 += hotel;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        } else {
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                    case 18:
                        i10 = i18;
                        i5 = i16;
                        charlie = av.charlie(i22, (List) unsafe.getObject(abstractC1513p2, j5));
                        i21 += charlie;
                        i18 = i10;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 19:
                        i10 = i18;
                        i5 = i16;
                        charlie = av.bravo(i22, (List) unsafe.getObject(abstractC1513p2, j5));
                        i21 += charlie;
                        i18 = i10;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 20:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls2 = av.alpha;
                        if (list.size() != 0) {
                            hotel7 = (C1503f.hotel(i22) * list.size()) + av.echo(list);
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 21:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list2 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls3 = av.alpha;
                        size = list2.size();
                        if (size != 0) {
                            india = av.india(list2);
                            hotel8 = C1503f.hotel(i22);
                            hotel7 = (hotel8 * size) + india;
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 22:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list3 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls4 = av.alpha;
                        size = list3.size();
                        if (size != 0) {
                            india = av.delta(list3);
                            hotel8 = C1503f.hotel(i22);
                            hotel7 = (hotel8 * size) + india;
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 23:
                        i10 = i18;
                        i5 = i16;
                        charlie = av.charlie(i22, (List) unsafe.getObject(abstractC1513p2, j5));
                        i21 += charlie;
                        i18 = i10;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 24:
                        i10 = i18;
                        i5 = i16;
                        charlie = av.bravo(i22, (List) unsafe.getObject(abstractC1513p2, j5));
                        i21 += charlie;
                        i18 = i10;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 25:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list4 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls5 = av.alpha;
                        int size3 = list4.size();
                        if (size3 == 0) {
                            hotel9 = 0;
                        } else {
                            hotel9 = (C1503f.hotel(i22) + 1) * size3;
                        }
                        i21 += hotel9;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 26:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list5 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls6 = av.alpha;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            hotel7 = C1503f.hotel(i22) * size4;
                            if (list5 instanceof x) {
                                x xVar = (x) list5;
                                for (int i31 = 0; i31 < size4; i31++) {
                                    Object juliet7 = xVar.juliet(i31);
                                    if (juliet7 instanceof C1502e) {
                                        golf3 = C1503f.echo((C1502e) juliet7);
                                    } else {
                                        golf3 = C1503f.golf((String) juliet7);
                                    }
                                    hotel7 = golf3 + hotel7;
                                }
                            } else {
                                for (int i32 = 0; i32 < size4; i32++) {
                                    Object obj = list5.get(i32);
                                    if (obj instanceof C1502e) {
                                        golf2 = C1503f.echo((C1502e) obj);
                                    } else {
                                        golf2 = C1503f.golf((String) obj);
                                    }
                                    hotel7 = golf2 + hotel7;
                                }
                            }
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 27:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list6 = (List) unsafe.getObject(abstractC1513p2, j5);
                        au juliet8 = alVar.juliet(i19);
                        Class cls7 = av.alpha;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            hotel10 = 0;
                        } else {
                            hotel10 = C1503f.hotel(i22) * size5;
                            for (int i33 = 0; i33 < size5; i33++) {
                                int hotel21 = ((AbstractC1498a) ((aj) list6.get(i33))).hotel(juliet8);
                                hotel10 += C1503f.india(hotel21) + hotel21;
                            }
                        }
                        i21 += hotel10;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 28:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list7 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls8 = av.alpha;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            hotel7 = C1503f.hotel(i22) * size6;
                            for (int i34 = 0; i34 < list7.size(); i34++) {
                                hotel7 += C1503f.echo((C1502e) list7.get(i34));
                            }
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 29:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list8 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls9 = av.alpha;
                        size = list8.size();
                        if (size != 0) {
                            india = av.hotel(list8);
                            hotel8 = C1503f.hotel(i22);
                            hotel7 = (hotel8 * size) + india;
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 30:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list9 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls10 = av.alpha;
                        size = list9.size();
                        if (size != 0) {
                            india = av.alpha(list9);
                            hotel8 = C1503f.hotel(i22);
                            hotel7 = (hotel8 * size) + india;
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 31:
                        i10 = i18;
                        i5 = i16;
                        charlie = av.bravo(i22, (List) unsafe.getObject(abstractC1513p2, j5));
                        i21 += charlie;
                        i18 = i10;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 32:
                        i10 = i18;
                        i5 = i16;
                        charlie = av.charlie(i22, (List) unsafe.getObject(abstractC1513p2, j5));
                        i21 += charlie;
                        i18 = i10;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 33:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list10 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls11 = av.alpha;
                        size = list10.size();
                        if (size != 0) {
                            india = av.foxtrot(list10);
                            hotel8 = C1503f.hotel(i22);
                            hotel7 = (hotel8 * size) + india;
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 34:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list11 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls12 = av.alpha;
                        size = list11.size();
                        if (size != 0) {
                            india = av.golf(list11);
                            hotel8 = C1503f.hotel(i22);
                            hotel7 = (hotel8 * size) + india;
                            i21 += hotel7;
                            i18 = i11;
                            i20 = i12;
                            i19 += 3;
                            i15 = i25;
                            i16 = i5;
                            i17 = 1048575;
                        }
                        hotel7 = 0;
                        i21 += hotel7;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 35:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list12 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls13 = av.alpha;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 36:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list13 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls14 = av.alpha;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 37:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        size2 = av.echo((List) unsafe.getObject(abstractC1513p2, j5));
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 38:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        size2 = av.india((List) unsafe.getObject(abstractC1513p2, j5));
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 39:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        size2 = av.delta((List) unsafe.getObject(abstractC1513p2, j5));
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 40:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list14 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls15 = av.alpha;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 41:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list15 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls16 = av.alpha;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 42:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list16 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls17 = av.alpha;
                        size2 = list16.size();
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 43:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        size2 = av.hotel((List) unsafe.getObject(abstractC1513p2, j5));
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 44:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        size2 = av.alpha((List) unsafe.getObject(abstractC1513p2, j5));
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 45:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list17 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls18 = av.alpha;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 46:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list18 = (List) unsafe.getObject(abstractC1513p2, j5);
                        Class cls19 = av.alpha;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 47:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        size2 = av.foxtrot((List) unsafe.getObject(abstractC1513p2, j5));
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 48:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        size2 = av.golf((List) unsafe.getObject(abstractC1513p2, j5));
                        if (size2 > 0) {
                            hotel11 = C1503f.hotel(i22);
                            india2 = C1503f.india(size2);
                            i21 += india2 + hotel11 + size2;
                        }
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 49:
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        List list19 = (List) unsafe.getObject(abstractC1513p2, j5);
                        au juliet9 = alVar.juliet(i19);
                        Class cls20 = av.alpha;
                        int size7 = list19.size();
                        if (size7 == 0) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            for (int i35 = 0; i35 < size7; i35++) {
                                i13 += ((AbstractC1498a) ((aj) list19.get(i35))).hotel(juliet9) + (C1503f.hotel(i22) * 2);
                            }
                        }
                        i21 += i13;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 50:
                        Object object3 = unsafe.getObject(abstractC1513p2, j5);
                        Object obj2 = alVar.bravo[(i19 / 3) * 2];
                        alVar.india.getClass();
                        af afVar = (af) object3;
                        ae aeVar = (ae) obj2;
                        if (afVar.isEmpty()) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            for (Map.Entry entry : afVar.entrySet()) {
                                char c4 = c3;
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                aeVar.getClass();
                                int hotel22 = C1503f.hotel(i22);
                                int i36 = i16;
                                ad adVar = aeVar.alpha;
                                int i37 = C1508k.charlie;
                                int hotel23 = C1503f.hotel(i36);
                                P p4 = T.teal;
                                O o5 = adVar.alpha;
                                if (o5 == p4) {
                                    hotel23 *= 2;
                                }
                                int i38 = i18;
                                int i39 = i20;
                                switch (o5.ordinal()) {
                                    case 0:
                                        ((Double) key).getClass();
                                        juliet3 = 8;
                                        int i40 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel24 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                            hotel24 *= 2;
                                        }
                                        switch (t5.ordinal()) {
                                            case 0:
                                                ((Double) value).getClass();
                                                juliet4 = 8;
                                                int i41 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i41) + i41 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 1:
                                                ((Float) value).getClass();
                                                juliet4 = 4;
                                                int i412 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i412) + i412 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 2:
                                                juliet4 = C1503f.juliet(((Long) value).longValue());
                                                int i4122 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i4122) + i4122 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 3:
                                                juliet4 = C1503f.juliet(((Long) value).longValue());
                                                int i41222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i41222) + i41222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 4:
                                                juliet4 = C1503f.foxtrot(((Integer) value).intValue());
                                                int i412222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i412222) + i412222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 5:
                                                ((Long) value).getClass();
                                                juliet4 = 8;
                                                int i4122222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i4122222) + i4122222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 6:
                                                ((Integer) value).getClass();
                                                juliet4 = 4;
                                                int i41222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i41222222) + i41222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 7:
                                                ((Boolean) value).getClass();
                                                juliet4 = i36;
                                                int i412222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i412222222) + i412222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 8:
                                                if (value instanceof C1502e) {
                                                    juliet4 = C1503f.echo((C1502e) value);
                                                } else {
                                                    juliet4 = C1503f.golf((String) value);
                                                }
                                                int i4122222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i4122222222) + i4122222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 9:
                                                juliet4 = ((AbstractC1513p) ((aj) value)).hotel(null);
                                                int i41222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i41222222222) + i41222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 10:
                                                hotel13 = ((AbstractC1513p) ((aj) value)).hotel(null);
                                                india4 = C1503f.india(hotel13);
                                                juliet4 = hotel13 + india4;
                                                int i412222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i412222222222) + i412222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 11:
                                                if (value instanceof C1502e) {
                                                    juliet4 = C1503f.echo((C1502e) value);
                                                    int i4122222222222 = juliet4 + hotel24 + i40;
                                                    i14 += C1503f.india(i4122222222222) + i4122222222222 + hotel22;
                                                    c3 = c4;
                                                    i16 = i36;
                                                    i18 = i38;
                                                    i20 = i39;
                                                } else {
                                                    hotel13 = ((byte[]) value).length;
                                                    india4 = C1503f.india(hotel13);
                                                    juliet4 = hotel13 + india4;
                                                    int i41222222222222 = juliet4 + hotel24 + i40;
                                                    i14 += C1503f.india(i41222222222222) + i41222222222222 + hotel22;
                                                    c3 = c4;
                                                    i16 = i36;
                                                    i18 = i38;
                                                    i20 = i39;
                                                }
                                            case 12:
                                                juliet4 = C1503f.india(((Integer) value).intValue());
                                                int i412222222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i412222222222222) + i412222222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 13:
                                                if (value instanceof C8.i) {
                                                    juliet4 = C1503f.foxtrot(((C8.i) value).alpha);
                                                } else {
                                                    juliet4 = C1503f.foxtrot(((Integer) value).intValue());
                                                }
                                                int i4122222222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i4122222222222222) + i4122222222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 14:
                                                ((Integer) value).getClass();
                                                juliet4 = 4;
                                                int i41222222222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i41222222222222222) + i41222222222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 15:
                                                ((Long) value).getClass();
                                                juliet4 = 8;
                                                int i412222222222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i412222222222222222) + i412222222222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 16:
                                                int intValue = ((Integer) value).intValue();
                                                juliet4 = C1503f.india((intValue >> 31) ^ (intValue << 1));
                                                int i4122222222222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i4122222222222222222) + i4122222222222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            case 17:
                                                long longValue = ((Long) value).longValue();
                                                juliet4 = C1503f.juliet((longValue >> c4) ^ (longValue << i36));
                                                int i41222222222222222222 = juliet4 + hotel24 + i40;
                                                i14 += C1503f.india(i41222222222222222222) + i41222222222222222222 + hotel22;
                                                c3 = c4;
                                                i16 = i36;
                                                i18 = i38;
                                                i20 = i39;
                                            default:
                                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                        }
                                    case 1:
                                        ((Float) key).getClass();
                                        juliet3 = 4;
                                        int i402 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel242 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 2:
                                        juliet3 = C1503f.juliet(((Long) key).longValue());
                                        int i4022 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel2422 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 3:
                                        juliet3 = C1503f.juliet(((Long) key).longValue());
                                        int i40222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel24222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 4:
                                        juliet3 = C1503f.foxtrot(((Integer) key).intValue());
                                        int i402222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel242222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 5:
                                        ((Long) key).getClass();
                                        juliet3 = 8;
                                        int i4022222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel2422222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 6:
                                        ((Integer) key).getClass();
                                        juliet3 = 4;
                                        int i40222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel24222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 7:
                                        ((Boolean) key).getClass();
                                        juliet3 = i36;
                                        int i402222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel242222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 8:
                                        if (key instanceof C1502e) {
                                            juliet3 = C1503f.echo((C1502e) key);
                                        } else {
                                            juliet3 = C1503f.golf((String) key);
                                        }
                                        int i4022222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel2422222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 9:
                                        juliet3 = ((AbstractC1513p) ((aj) key)).hotel(null);
                                        int i40222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel24222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 10:
                                        hotel12 = ((AbstractC1513p) ((aj) key)).hotel(null);
                                        india3 = C1503f.india(hotel12);
                                        juliet3 = hotel12 + india3;
                                        int i402222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel242222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 11:
                                        if (key instanceof C1502e) {
                                            juliet3 = C1503f.echo((C1502e) key);
                                            int i4022222222222 = juliet3 + hotel23;
                                            t5 = adVar.bravo;
                                            int hotel2422222222222 = C1503f.hotel(i25);
                                            if (t5 == p4) {
                                            }
                                            switch (t5.ordinal()) {
                                            }
                                        } else {
                                            hotel12 = ((byte[]) key).length;
                                            india3 = C1503f.india(hotel12);
                                            juliet3 = hotel12 + india3;
                                            int i40222222222222 = juliet3 + hotel23;
                                            t5 = adVar.bravo;
                                            int hotel24222222222222 = C1503f.hotel(i25);
                                            if (t5 == p4) {
                                            }
                                            switch (t5.ordinal()) {
                                            }
                                        }
                                    case 12:
                                        juliet3 = C1503f.india(((Integer) key).intValue());
                                        int i402222222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel242222222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 13:
                                        if (key instanceof C8.i) {
                                            juliet3 = C1503f.foxtrot(((C8.i) key).alpha);
                                        } else {
                                            juliet3 = C1503f.foxtrot(((Integer) key).intValue());
                                        }
                                        int i4022222222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel2422222222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 14:
                                        ((Integer) key).getClass();
                                        juliet3 = 4;
                                        int i40222222222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel24222222222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 15:
                                        ((Long) key).getClass();
                                        juliet3 = 8;
                                        int i402222222222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel242222222222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 16:
                                        int intValue2 = ((Integer) key).intValue();
                                        juliet3 = C1503f.india((intValue2 >> 31) ^ (intValue2 << 1));
                                        int i4022222222222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel2422222222222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    case 17:
                                        long longValue2 = ((Long) key).longValue();
                                        juliet3 = C1503f.juliet((longValue2 << i36) ^ (longValue2 >> c4));
                                        int i40222222222222222222 = juliet3 + hotel23;
                                        t5 = adVar.bravo;
                                        int hotel24222222222222222222 = C1503f.hotel(i25);
                                        if (t5 == p4) {
                                        }
                                        switch (t5.ordinal()) {
                                        }
                                    default:
                                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                }
                            }
                        }
                        i11 = i18;
                        i12 = i20;
                        i5 = i16;
                        i21 += i14;
                        i18 = i11;
                        i20 = i12;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 51:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel14 = C1503f.hotel(i22);
                            hotel18 = hotel14 + 8;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 52:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel15 = C1503f.hotel(i22);
                            hotel18 = hotel15 + 4;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 53:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            long tango = tango(j5, abstractC1513p2);
                            hotel16 = C1503f.hotel(i22);
                            juliet5 = C1503f.juliet(tango);
                            hotel18 = juliet5 + hotel16;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 54:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            long tango2 = tango(j5, abstractC1513p2);
                            hotel16 = C1503f.hotel(i22);
                            juliet5 = C1503f.juliet(tango2);
                            hotel18 = juliet5 + hotel16;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 55:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            int sierra = sierra(j5, abstractC1513p2);
                            hotel17 = C1503f.hotel(i22);
                            foxtrot2 = C1503f.foxtrot(sierra);
                            hotel18 = foxtrot2 + hotel17;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 56:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel14 = C1503f.hotel(i22);
                            hotel18 = hotel14 + 8;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 57:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel15 = C1503f.hotel(i22);
                            hotel18 = hotel15 + 4;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 58:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel18 = C1503f.hotel(i22) + i16;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 59:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            Object object4 = unsafe.getObject(abstractC1513p2, j5);
                            if (object4 instanceof C1502e) {
                                golf4 = C1503f.delta(i22, (C1502e) object4);
                            } else {
                                golf4 = C1503f.golf((String) object4) + C1503f.hotel(i22);
                            }
                            i21 = golf4 + i21;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 60:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            Object object5 = unsafe.getObject(abstractC1513p2, j5);
                            au juliet10 = alVar.juliet(i19);
                            Class cls21 = av.alpha;
                            int hotel25 = C1503f.hotel(i22);
                            int hotel26 = ((AbstractC1498a) ((aj) object5)).hotel(juliet10);
                            india5 = C1503f.india(hotel26) + hotel26 + hotel25;
                            i21 += india5;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 61:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel18 = C1503f.delta(i22, (C1502e) unsafe.getObject(abstractC1513p2, j5));
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 62:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            int sierra2 = sierra(j5, abstractC1513p2);
                            hotel17 = C1503f.hotel(i22);
                            foxtrot2 = C1503f.india(sierra2);
                            hotel18 = foxtrot2 + hotel17;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 63:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            int sierra3 = sierra(j5, abstractC1513p2);
                            hotel17 = C1503f.hotel(i22);
                            foxtrot2 = C1503f.foxtrot(sierra3);
                            hotel18 = foxtrot2 + hotel17;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 64:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel15 = C1503f.hotel(i22);
                            hotel18 = hotel15 + 4;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 65:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            hotel14 = C1503f.hotel(i22);
                            hotel18 = hotel14 + 8;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 66:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            int sierra4 = sierra(j5, abstractC1513p2);
                            hotel17 = C1503f.hotel(i22);
                            foxtrot2 = C1503f.india((sierra4 >> 31) ^ (sierra4 << 1));
                            hotel18 = foxtrot2 + hotel17;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 67:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            long tango3 = tango(j5, abstractC1513p2);
                            india5 = C1503f.juliet((tango3 >> 63) ^ (tango3 << i16)) + C1503f.hotel(i22);
                            i21 += india5;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    case 68:
                        if (alVar.november(i22, i19, abstractC1513p2)) {
                            aj ajVar2 = (aj) unsafe.getObject(abstractC1513p2, j5);
                            au juliet11 = alVar.juliet(i19);
                            hotel16 = C1503f.hotel(i22) * 2;
                            juliet5 = ((AbstractC1498a) ajVar2).hotel(juliet11);
                            hotel18 = juliet5 + hotel16;
                            i21 += hotel18;
                        }
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                    default:
                        i5 = i16;
                        i19 += 3;
                        i15 = i25;
                        i16 = i5;
                        i17 = 1048575;
                }
            } else {
                ((D) alVar.hotel).getClass();
                return abstractC1513p2.unknownFields.alpha() + i21;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.protobuf.av.kilo(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
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
    
        if (com.google.protobuf.av.kilo(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.protobuf.av.kilo(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.protobuf.av.kilo(r5.india(r7, r12), r5.india(r7, r13)) != false) goto L105;
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
    
        if (com.google.protobuf.av.kilo(r9.india(r7, r12), r9.india(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // com.google.protobuf.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hotel(AbstractC1513p abstractC1513p, AbstractC1513p abstractC1513p2) {
        int[] iArr = this.alpha;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 < length) {
                int xray = xray(i4);
                long j5 = xray & 1048575;
                switch (whiskey(xray)) {
                    case 0:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k6 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 1:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k10 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 2:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k11 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 3:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k12 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 4:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k13 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 5:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k14 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 6:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k15 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 7:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k16 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 8:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k17 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 9:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k18 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 10:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k19 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 11:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k20 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 12:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k21 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 13:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k22 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 14:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k23 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 15:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k24 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 16:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k25 = L.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 17:
                        if (india(abstractC1513p, abstractC1513p2, i4)) {
                            K k26 = L.charlie;
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
                        K k27 = L.charlie;
                        z2 = av.kilo(k27.india(j5, abstractC1513p), k27.india(j5, abstractC1513p2));
                        break;
                    case 50:
                        K k28 = L.charlie;
                        z2 = av.kilo(k28.india(j5, abstractC1513p), k28.india(j5, abstractC1513p2));
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
                        K k29 = L.charlie;
                        if (k29.golf(j6, abstractC1513p) == k29.golf(j6, abstractC1513p2)) {
                            break;
                        }
                        z2 = false;
                        break;
                }
                if (z2) {
                    i4 += 3;
                }
            } else {
                D d4 = (D) this.hotel;
                d4.getClass();
                C c3 = abstractC1513p.unknownFields;
                d4.getClass();
                if (c3.equals(abstractC1513p2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean india(AbstractC1513p abstractC1513p, AbstractC1513p abstractC1513p2, int i4) {
        if (kilo(i4, abstractC1513p) == kilo(i4, abstractC1513p2)) {
            return true;
        }
        return false;
    }

    public final au juliet(int i4) {
        int i5 = (i4 / 3) * 2;
        Object[] objArr = this.bravo;
        au auVar = (au) objArr[i5];
        if (auVar != null) {
            return auVar;
        }
        au alpha = ar.charlie.alpha((Class) objArr[i5 + 1]);
        objArr[i5] = alpha;
        return alpha;
    }

    public final boolean kilo(int i4, Object obj) {
        int i5 = this.alpha[i4 + 2];
        long j5 = i5 & 1048575;
        if (j5 == 1048575) {
            int xray = xray(i4);
            long j6 = xray & 1048575;
            switch (whiskey(xray)) {
                case 0:
                    if (Double.doubleToRawLongBits(L.charlie.echo(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(L.charlie.foxtrot(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (L.charlie.hotel(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (L.charlie.hotel(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (L.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (L.charlie.hotel(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (L.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return L.charlie.charlie(j6, obj);
                case 8:
                    Object india = L.charlie.india(j6, obj);
                    if (india instanceof String) {
                        return !((String) india).isEmpty();
                    }
                    if (india instanceof C1502e) {
                        return !C1502e.red.equals(india);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (L.charlie.india(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C1502e.red.equals(L.charlie.india(j6, obj));
                case 11:
                    if (L.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (L.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (L.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (L.charlie.hotel(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (L.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (L.charlie.hotel(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (L.charlie.india(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & L.charlie.golf(j5, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean lima(Object obj, int i4, int i5, int i10, int i11) {
        if (i5 == 1048575) {
            return kilo(i4, obj);
        }
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public final boolean november(int i4, int i5, Object obj) {
        if (L.charlie.golf(this.alpha[i5 + 2] & 1048575, obj) == i4) {
            return true;
        }
        return false;
    }

    public final void oscar(int i4, Object obj, Object obj2) {
        if (!kilo(i4, obj2)) {
            return;
        }
        long xray = xray(i4) & 1048575;
        Unsafe unsafe = kilo;
        Object object = unsafe.getObject(obj2, xray);
        if (object != null) {
            au juliet2 = juliet(i4);
            if (!kilo(i4, obj)) {
                if (!mike(object)) {
                    unsafe.putObject(obj, xray, object);
                } else {
                    AbstractC1513p charlie = juliet2.charlie();
                    juliet2.delta(charlie, object);
                    unsafe.putObject(obj, xray, charlie);
                }
                victor(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, xray);
            if (!mike(object2)) {
                AbstractC1513p charlie2 = juliet2.charlie();
                juliet2.delta(charlie2, object2);
                unsafe.putObject(obj, xray, charlie2);
                object2 = charlie2;
            }
            juliet2.delta(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.alpha[i4] + " is present but null: " + obj2);
    }

    public final void papa(int i4, Object obj, Object obj2) {
        int[] iArr = this.alpha;
        int i5 = iArr[i4];
        if (!november(i5, i4, obj2)) {
            return;
        }
        long xray = xray(i4) & 1048575;
        Unsafe unsafe = kilo;
        Object object = unsafe.getObject(obj2, xray);
        if (object != null) {
            au juliet2 = juliet(i4);
            if (!november(i5, i4, obj)) {
                if (!mike(object)) {
                    unsafe.putObject(obj, xray, object);
                } else {
                    AbstractC1513p charlie = juliet2.charlie();
                    juliet2.delta(charlie, object);
                    unsafe.putObject(obj, xray, charlie);
                }
                L.november(iArr[i4 + 2] & 1048575, i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, xray);
            if (!mike(object2)) {
                AbstractC1513p charlie2 = juliet2.charlie();
                juliet2.delta(charlie2, object2);
                unsafe.putObject(obj, xray, charlie2);
                object2 = charlie2;
            }
            juliet2.delta(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2);
    }

    public final void victor(int i4, Object obj) {
        int i5 = this.alpha[i4 + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        L.november(j5, (1 << (i5 >>> 20)) | L.charlie.golf(j5, obj), obj);
    }

    public final int xray(int i4) {
        return this.alpha[i4 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0041. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x0268. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0365. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void yankee(Object obj, ac acVar) {
        int i4;
        int[] iArr;
        char c3;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int juliet2;
        T t5;
        int juliet3;
        int hotel;
        int india;
        al alVar = this;
        int[] iArr2 = alVar.alpha;
        int length = iArr2.length;
        Unsafe unsafe = kilo;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int xray = alVar.xray(i17);
            int i19 = iArr2[i17];
            int whiskey = whiskey(xray);
            int i20 = 1;
            if (whiskey <= 17) {
                int i21 = iArr2[i17 + 2];
                int i22 = i21 & i15;
                if (i22 != i16) {
                    if (i22 == i15) {
                        i18 = 0;
                    } else {
                        i18 = unsafe.getInt(obj, i22);
                    }
                    i16 = i22;
                }
                i4 = 1 << (i21 >>> 20);
            } else {
                i4 = 0;
            }
            long j5 = xray & i15;
            switch (whiskey) {
                case 0:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        double echo = L.charlie.echo(j5, obj);
                        C1503f c1503f = (C1503f) acVar.alpha;
                        c1503f.getClass();
                        c1503f.papa(i19, Double.doubleToRawLongBits(echo));
                    }
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 1:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        float foxtrot = L.charlie.foxtrot(j5, obj);
                        C1503f c1503f2 = (C1503f) acVar.alpha;
                        c1503f2.getClass();
                        c1503f2.november(i19, Float.floatToRawIntBits(foxtrot));
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 2:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        ((C1503f) acVar.alpha).victor(i19, unsafe.getLong(obj, j5));
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 3:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        ((C1503f) acVar.alpha).victor(i19, unsafe.getLong(obj, j5));
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 4:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        int i23 = unsafe.getInt(obj, j5);
                        C1503f c1503f3 = (C1503f) acVar.alpha;
                        c1503f3.tango(i19, 0);
                        c1503f3.romeo(i23);
                        alVar = this;
                        i17 += 3;
                        iArr2 = iArr;
                        i15 = 1048575;
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 5:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        ((C1503f) acVar.alpha).papa(i19, unsafe.getLong(obj, j5));
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 6:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        ((C1503f) acVar.alpha).november(i19, unsafe.getInt(obj, j5));
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 7:
                    iArr = iArr2;
                    c3 = 2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        boolean charlie = L.charlie.charlie(j5, obj);
                        C1503f c1503f4 = (C1503f) acVar.alpha;
                        c1503f4.tango(i19, 0);
                        c1503f4.kilo(charlie ? (byte) 1 : (byte) 0);
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 8:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof String) {
                            C1503f c1503f5 = (C1503f) acVar.alpha;
                            c3 = 2;
                            c1503f5.tango(i19, 2);
                            c1503f5.sierra((String) object);
                        } else {
                            c3 = 2;
                            C1503f c1503f6 = (C1503f) acVar.alpha;
                            c1503f6.tango(i19, 2);
                            c1503f6.mike((C1502e) object);
                        }
                    } else {
                        c3 = 2;
                    }
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 9:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        acVar.bravo(i19, unsafe.getObject(obj, j5), alVar.juliet(i17));
                    }
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 10:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        C1502e c1502e = (C1502e) unsafe.getObject(obj, j5);
                        C1503f c1503f7 = (C1503f) acVar.alpha;
                        c1503f7.tango(i19, 2);
                        c1503f7.mike(c1502e);
                    }
                    c3 = 2;
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 11:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        int i24 = unsafe.getInt(obj, j5);
                        C1503f c1503f8 = (C1503f) acVar.alpha;
                        c1503f8.tango(i19, 0);
                        c1503f8.uniform(i24);
                    }
                    c3 = 2;
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 12:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        int i25 = unsafe.getInt(obj, j5);
                        C1503f c1503f9 = (C1503f) acVar.alpha;
                        c1503f9.tango(i19, 0);
                        c1503f9.romeo(i25);
                        c3 = 2;
                        alVar = this;
                        i17 += 3;
                        iArr2 = iArr;
                        i15 = 1048575;
                    }
                    c3 = 2;
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 13:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        ((C1503f) acVar.alpha).november(i19, unsafe.getInt(obj, j5));
                    }
                    c3 = 2;
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 14:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        ((C1503f) acVar.alpha).papa(i19, unsafe.getLong(obj, j5));
                    }
                    c3 = 2;
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 15:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        int i26 = unsafe.getInt(obj, j5);
                        C1503f c1503f10 = (C1503f) acVar.alpha;
                        c1503f10.tango(i19, 0);
                        c1503f10.uniform((i26 >> 31) ^ (i26 << 1));
                    }
                    c3 = 2;
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 16:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        long j6 = unsafe.getLong(obj, j5);
                        ((C1503f) acVar.alpha).victor(i19, (j6 << 1) ^ (j6 >> 63));
                    }
                    c3 = 2;
                    alVar = this;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 17:
                    iArr = iArr2;
                    if (alVar.lima(obj, i17, i16, i18, i4)) {
                        acVar.alpha(i19, unsafe.getObject(obj, j5), alVar.juliet(i17));
                    }
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 18:
                    i5 = i16;
                    i10 = i18;
                    iArr = iArr2;
                    av.mike(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i5;
                    i18 = i10;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 19:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.quebec(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 20:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.sierra(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 21:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.yankee(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 22:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.romeo(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 23:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.papa(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 24:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.oscar(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 25:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.lima(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 26:
                    i5 = i16;
                    i10 = i18;
                    iArr = iArr2;
                    int i27 = iArr[i17];
                    List list = (List) unsafe.getObject(obj, j5);
                    Class cls = av.alpha;
                    if (list != null && !list.isEmpty()) {
                        acVar.getClass();
                        boolean z10 = list instanceof x;
                        C1503f c1503f11 = (C1503f) acVar.alpha;
                        if (z10) {
                            x xVar = (x) list;
                            for (int i28 = 0; i28 < list.size(); i28++) {
                                Object juliet4 = xVar.juliet(i28);
                                if (juliet4 instanceof String) {
                                    c1503f11.tango(i27, 2);
                                    c1503f11.sierra((String) juliet4);
                                } else {
                                    c1503f11.tango(i27, 2);
                                    c1503f11.mike((C1502e) juliet4);
                                }
                            }
                        } else {
                            for (int i29 = 0; i29 < list.size(); i29++) {
                                String str = (String) list.get(i29);
                                c1503f11.tango(i27, 2);
                                c1503f11.sierra(str);
                            }
                        }
                    }
                    i16 = i5;
                    i18 = i10;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                    break;
                case 27:
                    i5 = i16;
                    i10 = i18;
                    iArr = iArr2;
                    int i30 = iArr[i17];
                    List list2 = (List) unsafe.getObject(obj, j5);
                    au juliet5 = alVar.juliet(i17);
                    Class cls2 = av.alpha;
                    if (list2 != null && !list2.isEmpty()) {
                        acVar.getClass();
                        for (int i31 = 0; i31 < list2.size(); i31++) {
                            acVar.bravo(i30, list2.get(i31), juliet5);
                        }
                    }
                    i16 = i5;
                    i18 = i10;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                    break;
                case 28:
                    i5 = i16;
                    i10 = i18;
                    iArr = iArr2;
                    int i32 = iArr[i17];
                    List list3 = (List) unsafe.getObject(obj, j5);
                    Class cls3 = av.alpha;
                    if (list3 != null && !list3.isEmpty()) {
                        acVar.getClass();
                        for (int i33 = 0; i33 < list3.size(); i33++) {
                            C1502e c1502e2 = (C1502e) list3.get(i33);
                            C1503f c1503f12 = (C1503f) acVar.alpha;
                            c1503f12.tango(i32, 2);
                            c1503f12.mike(c1502e2);
                        }
                    }
                    i16 = i5;
                    i18 = i10;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                    break;
                case 29:
                    i5 = i16;
                    i10 = i18;
                    iArr = iArr2;
                    av.xray(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i5;
                    i18 = i10;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 30:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.november(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 31:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.tango(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 32:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.uniform(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 33:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.victor(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 34:
                    i11 = i16;
                    i12 = i18;
                    iArr = iArr2;
                    av.whiskey(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, false);
                    i16 = i11;
                    i18 = i12;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 35:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.mike(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 36:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.quebec(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 37:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.sierra(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 38:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.yankee(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 39:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.romeo(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 40:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.papa(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 41:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.oscar(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 42:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.lima(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 43:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.xray(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 44:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.november(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 45:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.tango(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 46:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.uniform(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 47:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.victor(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 48:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    z2 = true;
                    av.whiskey(iArr[i17], (List) unsafe.getObject(obj, j5), acVar, true);
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 49:
                    i13 = i16;
                    i14 = i18;
                    iArr = iArr2;
                    int i34 = iArr[i17];
                    List list4 = (List) unsafe.getObject(obj, j5);
                    au juliet6 = alVar.juliet(i17);
                    Class cls4 = av.alpha;
                    if (list4 != null && !list4.isEmpty()) {
                        acVar.getClass();
                        for (int i35 = 0; i35 < list4.size(); i35++) {
                            acVar.alpha(i34, list4.get(i35), juliet6);
                        }
                    }
                    z2 = true;
                    i16 = i13;
                    i18 = i14;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j5);
                    if (object2 != null) {
                        Object obj2 = alVar.bravo[(i17 / 3) * 2];
                        alVar.india.getClass();
                        ad adVar = ((ae) obj2).alpha;
                        C1503f c1503f13 = (C1503f) acVar.alpha;
                        c1503f13.getClass();
                        Iterator it = ((af) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            c1503f13.tango(i19, 2);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i36 = C1508k.charlie;
                            int hotel2 = C1503f.hotel(i20);
                            int i37 = i16;
                            P p4 = T.teal;
                            int i38 = i18;
                            O o5 = adVar.alpha;
                            if (o5 == p4) {
                                hotel2 *= 2;
                            }
                            Iterator it2 = it;
                            int[] iArr3 = iArr2;
                            switch (o5.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    juliet2 = 8;
                                    int i39 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel3 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                        hotel3 *= 2;
                                    }
                                    switch (t5.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            juliet3 = 8;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key2);
                                            C1508k.bravo(c1503f13, t5, 2, value2);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 1:
                                            ((Float) value).getClass();
                                            juliet3 = 4;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key22);
                                            C1508k.bravo(c1503f13, t5, 2, value22);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 2:
                                            juliet3 = C1503f.juliet(((Long) value).longValue());
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key222);
                                            C1508k.bravo(c1503f13, t5, 2, value222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 3:
                                            juliet3 = C1503f.juliet(((Long) value).longValue());
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key2222);
                                            C1508k.bravo(c1503f13, t5, 2, value2222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 4:
                                            juliet3 = C1503f.foxtrot(((Integer) value).intValue());
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key22222);
                                            C1508k.bravo(c1503f13, t5, 2, value22222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 5:
                                            ((Long) value).getClass();
                                            juliet3 = 8;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key222222);
                                            C1508k.bravo(c1503f13, t5, 2, value222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 6:
                                            ((Integer) value).getClass();
                                            juliet3 = 4;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key2222222);
                                            C1508k.bravo(c1503f13, t5, 2, value2222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            juliet3 = i20;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key22222222);
                                            C1508k.bravo(c1503f13, t5, 2, value22222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 8:
                                            if (value instanceof C1502e) {
                                                juliet3 = C1503f.echo((C1502e) value);
                                            } else {
                                                juliet3 = C1503f.golf((String) value);
                                            }
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key222222222 = entry.getKey();
                                            Object value222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 9:
                                            juliet3 = ((AbstractC1513p) ((aj) value)).hotel(null);
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key2222222222 = entry.getKey();
                                            Object value2222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key2222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value2222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 10:
                                            hotel = ((AbstractC1513p) ((aj) value)).hotel(null);
                                            india = C1503f.india(hotel);
                                            juliet3 = hotel + india;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key22222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value22222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 11:
                                            if (value instanceof C1502e) {
                                                juliet3 = C1503f.echo((C1502e) value);
                                                c1503f13.uniform(juliet3 + hotel3 + i39);
                                                Object key222222222222 = entry.getKey();
                                                Object value222222222222 = entry.getValue();
                                                C1508k.bravo(c1503f13, o5, i20, key222222222222);
                                                C1508k.bravo(c1503f13, t5, 2, value222222222222);
                                                i16 = i37;
                                                i18 = i38;
                                                it = it2;
                                                iArr2 = iArr3;
                                                i20 = 1;
                                            } else {
                                                hotel = ((byte[]) value).length;
                                                india = C1503f.india(hotel);
                                                juliet3 = hotel + india;
                                                c1503f13.uniform(juliet3 + hotel3 + i39);
                                                Object key2222222222222 = entry.getKey();
                                                Object value2222222222222 = entry.getValue();
                                                C1508k.bravo(c1503f13, o5, i20, key2222222222222);
                                                C1508k.bravo(c1503f13, t5, 2, value2222222222222);
                                                i16 = i37;
                                                i18 = i38;
                                                it = it2;
                                                iArr2 = iArr3;
                                                i20 = 1;
                                            }
                                        case 12:
                                            juliet3 = C1503f.india(((Integer) value).intValue());
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key22222222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value22222222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 13:
                                            if (value instanceof C8.i) {
                                                juliet3 = C1503f.foxtrot(((C8.i) value).alpha);
                                            } else {
                                                juliet3 = C1503f.foxtrot(((Integer) value).intValue());
                                            }
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key222222222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value222222222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 14:
                                            ((Integer) value).getClass();
                                            juliet3 = 4;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key2222222222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value2222222222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 15:
                                            ((Long) value).getClass();
                                            juliet3 = 8;
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key22222222222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value22222222222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            juliet3 = C1503f.india((intValue >> 31) ^ (intValue << 1));
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key222222222222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value222222222222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            juliet3 = C1503f.juliet((longValue << i20) ^ (longValue >> 63));
                                            c1503f13.uniform(juliet3 + hotel3 + i39);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            C1508k.bravo(c1503f13, o5, i20, key2222222222222222222);
                                            C1508k.bravo(c1503f13, t5, 2, value2222222222222222222);
                                            i16 = i37;
                                            i18 = i38;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i20 = 1;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    ((Float) key).getClass();
                                    juliet2 = 4;
                                    int i392 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel32 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 2:
                                    juliet2 = C1503f.juliet(((Long) key).longValue());
                                    int i3922 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel322 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 3:
                                    juliet2 = C1503f.juliet(((Long) key).longValue());
                                    int i39222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel3222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 4:
                                    juliet2 = C1503f.foxtrot(((Integer) key).intValue());
                                    int i392222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel32222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 5:
                                    ((Long) key).getClass();
                                    juliet2 = 8;
                                    int i3922222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel322222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 6:
                                    ((Integer) key).getClass();
                                    juliet2 = 4;
                                    int i39222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel3222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 7:
                                    ((Boolean) key).getClass();
                                    juliet2 = i20;
                                    int i392222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel32222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 8:
                                    if (key instanceof C1502e) {
                                        juliet2 = C1503f.echo((C1502e) key);
                                    } else {
                                        juliet2 = C1503f.golf((String) key);
                                    }
                                    int i3922222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel322222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 9:
                                    juliet2 = ((AbstractC1513p) ((aj) key)).hotel(null);
                                    int i39222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel3222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 10:
                                    int hotel4 = ((AbstractC1513p) ((aj) key)).hotel(null);
                                    juliet2 = C1503f.india(hotel4) + hotel4;
                                    int i392222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel32222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 11:
                                    if (key instanceof C1502e) {
                                        juliet2 = C1503f.echo((C1502e) key);
                                    } else {
                                        int length2 = ((byte[]) key).length;
                                        juliet2 = length2 + C1503f.india(length2);
                                    }
                                    int i3922222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel322222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 12:
                                    juliet2 = C1503f.india(((Integer) key).intValue());
                                    int i39222222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel3222222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 13:
                                    if (key instanceof C8.i) {
                                        juliet2 = C1503f.foxtrot(((C8.i) key).alpha);
                                    } else {
                                        juliet2 = C1503f.foxtrot(((Integer) key).intValue());
                                    }
                                    int i392222222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel32222222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    juliet2 = 4;
                                    int i3922222222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel322222222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    juliet2 = 8;
                                    int i39222222222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel3222222222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    juliet2 = C1503f.india((intValue2 << 1) ^ (intValue2 >> 31));
                                    int i392222222222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel32222222222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    juliet2 = C1503f.juliet((longValue2 << i20) ^ (longValue2 >> 63));
                                    int i3922222222222222222 = juliet2 + hotel2;
                                    t5 = adVar.bravo;
                                    int hotel322222222222222222 = C1503f.hotel(2);
                                    if (t5 == p4) {
                                    }
                                    switch (t5.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i5 = i16;
                    i10 = i18;
                    iArr = iArr2;
                    i16 = i5;
                    i18 = i10;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 51:
                    if (alVar.november(i19, i17, obj)) {
                        double doubleValue = ((Double) L.charlie.india(j5, obj)).doubleValue();
                        C1503f c1503f14 = (C1503f) acVar.alpha;
                        c1503f14.getClass();
                        c1503f14.papa(i19, Double.doubleToRawLongBits(doubleValue));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 52:
                    if (alVar.november(i19, i17, obj)) {
                        float floatValue = ((Float) L.charlie.india(j5, obj)).floatValue();
                        C1503f c1503f15 = (C1503f) acVar.alpha;
                        c1503f15.getClass();
                        c1503f15.november(i19, Float.floatToRawIntBits(floatValue));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 53:
                    if (alVar.november(i19, i17, obj)) {
                        ((C1503f) acVar.alpha).victor(i19, tango(j5, obj));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 54:
                    if (alVar.november(i19, i17, obj)) {
                        ((C1503f) acVar.alpha).victor(i19, tango(j5, obj));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 55:
                    if (alVar.november(i19, i17, obj)) {
                        int sierra = sierra(j5, obj);
                        C1503f c1503f16 = (C1503f) acVar.alpha;
                        c1503f16.tango(i19, 0);
                        c1503f16.romeo(sierra);
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 56:
                    if (alVar.november(i19, i17, obj)) {
                        ((C1503f) acVar.alpha).papa(i19, tango(j5, obj));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 57:
                    if (alVar.november(i19, i17, obj)) {
                        ((C1503f) acVar.alpha).november(i19, sierra(j5, obj));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 58:
                    if (alVar.november(i19, i17, obj)) {
                        boolean booleanValue = ((Boolean) L.charlie.india(j5, obj)).booleanValue();
                        C1503f c1503f17 = (C1503f) acVar.alpha;
                        c1503f17.tango(i19, 0);
                        c1503f17.kilo(booleanValue ? (byte) 1 : (byte) 0);
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 59:
                    if (alVar.november(i19, i17, obj)) {
                        Object object3 = unsafe.getObject(obj, j5);
                        if (object3 instanceof String) {
                            C1503f c1503f18 = (C1503f) acVar.alpha;
                            c1503f18.tango(i19, 2);
                            c1503f18.sierra((String) object3);
                        } else {
                            C1503f c1503f19 = (C1503f) acVar.alpha;
                            c1503f19.tango(i19, 2);
                            c1503f19.mike((C1502e) object3);
                        }
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 60:
                    if (alVar.november(i19, i17, obj)) {
                        acVar.bravo(i19, unsafe.getObject(obj, j5), alVar.juliet(i17));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 61:
                    if (alVar.november(i19, i17, obj)) {
                        C1502e c1502e3 = (C1502e) unsafe.getObject(obj, j5);
                        C1503f c1503f20 = (C1503f) acVar.alpha;
                        c1503f20.tango(i19, 2);
                        c1503f20.mike(c1502e3);
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 62:
                    if (alVar.november(i19, i17, obj)) {
                        int sierra2 = sierra(j5, obj);
                        C1503f c1503f21 = (C1503f) acVar.alpha;
                        c1503f21.tango(i19, 0);
                        c1503f21.uniform(sierra2);
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 63:
                    if (alVar.november(i19, i17, obj)) {
                        int sierra3 = sierra(j5, obj);
                        C1503f c1503f22 = (C1503f) acVar.alpha;
                        c1503f22.tango(i19, 0);
                        c1503f22.romeo(sierra3);
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 64:
                    if (alVar.november(i19, i17, obj)) {
                        ((C1503f) acVar.alpha).november(i19, sierra(j5, obj));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 65:
                    if (alVar.november(i19, i17, obj)) {
                        ((C1503f) acVar.alpha).papa(i19, tango(j5, obj));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 66:
                    if (alVar.november(i19, i17, obj)) {
                        int sierra4 = sierra(j5, obj);
                        C1503f c1503f23 = (C1503f) acVar.alpha;
                        c1503f23.tango(i19, 0);
                        c1503f23.uniform((sierra4 >> 31) ^ (sierra4 << 1));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 67:
                    if (alVar.november(i19, i17, obj)) {
                        long tango = tango(j5, obj);
                        ((C1503f) acVar.alpha).victor(i19, (tango << 1) ^ (tango >> 63));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                case 68:
                    if (alVar.november(i19, i17, obj)) {
                        acVar.alpha(i19, unsafe.getObject(obj, j5), alVar.juliet(i17));
                    }
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
                default:
                    iArr = iArr2;
                    c3 = 2;
                    i17 += 3;
                    iArr2 = iArr;
                    i15 = 1048575;
            }
        }
        ((D) alVar.hotel).getClass();
        ((AbstractC1513p) obj).unknownFields.bravo(acVar);
    }
}
