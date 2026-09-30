package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.P0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
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

/* loaded from: classes3.dex */
public final class aj implements as {
    public static final int[] november = new int[0];
    public static final Unsafe oscar = D.india();
    public final int[] alpha;
    public final Object[] bravo;
    public final int charlie;
    public final int delta;
    public final s echo;
    public final boolean foxtrot;
    public final int[] golf;
    public final int hotel;
    public final int india;
    public final al juliet;
    public final x kilo;
    public final aw lima;
    public final ae mike;

    public aj(int[] iArr, Object[] objArr, int i4, int i5, s sVar, int[] iArr2, int i10, int i11, al alVar, x xVar, aw awVar, C0605l c0605l, ae aeVar) {
        this.alpha = iArr;
        this.bravo = objArr;
        this.charlie = i4;
        this.delta = i5;
        this.foxtrot = av.q.kilo(sVar);
        this.golf = iArr2;
        this.hotel = i10;
        this.india = i11;
        this.juliet = alVar;
        this.kilo = xVar;
        this.lima = awVar;
        this.echo = sVar;
        this.mike = aeVar;
    }

    public static long amber(long j5, Object obj) {
        return ((Long) D.charlie.hotel(j5, obj)).longValue();
    }

    public static Field coral(Class cls, String str) {
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

    public static int gold(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static boolean papa(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof s) {
            return ((s) obj).foxtrot();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aj xray(ar arVar, al alVar, x xVar, aw awVar, C0605l c0605l, ae aeVar) {
        int i4;
        int charAt;
        int i5;
        int i10;
        int i11;
        int[] iArr;
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
        int[] iArr2;
        int i25;
        int i26;
        int objectFieldOffset;
        int i27;
        int i28;
        int i29;
        int i30;
        Field coral;
        char charAt10;
        int i31;
        int i32;
        Field coral2;
        Field coral3;
        int i33;
        char charAt11;
        int i34;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        String str = arVar.bravo;
        int length = str.length();
        int i38 = 55296;
        if (str.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i4 = i39 + 1;
                if (str.charAt(i39) < 55296) {
                    break;
                }
                i39 = i4;
            }
        } else {
            i4 = 1;
        }
        int i40 = i4 + 1;
        int charAt15 = str.charAt(i4);
        if (charAt15 >= 55296) {
            int i41 = charAt15 & 8191;
            int i42 = 13;
            while (true) {
                i37 = i40 + 1;
                charAt14 = str.charAt(i40);
                if (charAt14 < 55296) {
                    break;
                }
                i41 |= (charAt14 & 8191) << i42;
                i42 += 13;
                i40 = i37;
            }
            charAt15 = i41 | (charAt14 << i42);
            i40 = i37;
        }
        if (charAt15 == 0) {
            i10 = 0;
            i13 = 0;
            charAt = 0;
            i5 = 0;
            i12 = 0;
            i14 = 0;
            iArr = november;
            i11 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt16 = str.charAt(i40);
            if (charAt16 >= 55296) {
                int i44 = charAt16 & 8191;
                int i45 = 13;
                while (true) {
                    i22 = i43 + 1;
                    charAt9 = str.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i22;
                }
                charAt16 = i44 | (charAt9 << i45);
                i43 = i22;
            }
            int i46 = i43 + 1;
            int charAt17 = str.charAt(i43);
            if (charAt17 >= 55296) {
                int i47 = charAt17 & 8191;
                int i48 = 13;
                while (true) {
                    i21 = i46 + 1;
                    charAt8 = str.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i21;
                }
                charAt17 = i47 | (charAt8 << i48);
                i46 = i21;
            }
            int i49 = i46 + 1;
            int charAt18 = str.charAt(i46);
            if (charAt18 >= 55296) {
                int i50 = charAt18 & 8191;
                int i51 = 13;
                while (true) {
                    i20 = i49 + 1;
                    charAt7 = str.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i20;
                }
                charAt18 = i50 | (charAt7 << i51);
                i49 = i20;
            }
            int i52 = i49 + 1;
            int charAt19 = str.charAt(i49);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i19 = i52 + 1;
                    charAt6 = str.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i19;
                }
                charAt19 = i53 | (charAt6 << i54);
                i52 = i19;
            }
            int i55 = i52 + 1;
            charAt = str.charAt(i52);
            if (charAt >= 55296) {
                int i56 = charAt & 8191;
                int i57 = 13;
                while (true) {
                    i18 = i55 + 1;
                    charAt5 = str.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i18;
                }
                charAt = i56 | (charAt5 << i57);
                i55 = i18;
            }
            int i58 = i55 + 1;
            int charAt20 = str.charAt(i55);
            if (charAt20 >= 55296) {
                int i59 = charAt20 & 8191;
                int i60 = 13;
                while (true) {
                    i17 = i58 + 1;
                    charAt4 = str.charAt(i58);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i17;
                }
                charAt20 = i59 | (charAt4 << i60);
                i58 = i17;
            }
            int i61 = i58 + 1;
            int charAt21 = str.charAt(i58);
            if (charAt21 >= 55296) {
                int i62 = charAt21 & 8191;
                int i63 = 13;
                while (true) {
                    i16 = i61 + 1;
                    charAt3 = str.charAt(i61);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i62 |= (charAt3 & 8191) << i63;
                    i63 += 13;
                    i61 = i16;
                }
                charAt21 = i62 | (charAt3 << i63);
                i61 = i16;
            }
            int i64 = i61 + 1;
            int charAt22 = str.charAt(i61);
            if (charAt22 >= 55296) {
                int i65 = charAt22 & 8191;
                int i66 = 13;
                while (true) {
                    i15 = i64 + 1;
                    charAt2 = str.charAt(i64);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i65 |= (charAt2 & 8191) << i66;
                    i66 += 13;
                    i64 = i15;
                }
                charAt22 = i65 | (charAt2 << i66);
                i64 = i15;
            }
            int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
            int i67 = (charAt16 * 2) + charAt17;
            int i68 = charAt20;
            i5 = charAt18;
            i10 = i68;
            i11 = charAt16;
            i40 = i64;
            iArr = iArr3;
            i12 = charAt19;
            i13 = i67;
            i14 = charAt22;
        }
        Unsafe unsafe = oscar;
        Class<?> cls = arVar.alpha.getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i69 = i14 + i10;
        int i70 = i69;
        int i71 = i14;
        int i72 = 0;
        int i73 = 0;
        while (i40 < length) {
            int i74 = i40 + 1;
            int charAt23 = str.charAt(i40);
            if (charAt23 >= i38) {
                int i75 = charAt23 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    charAt13 = str.charAt(i76);
                    i23 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i75 |= (charAt13 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                    length = i23;
                }
                charAt23 = i75 | (charAt13 << i77);
                i24 = i36;
            } else {
                i23 = length;
                i24 = i74;
            }
            int i78 = i24 + 1;
            int charAt24 = str.charAt(i24);
            int i79 = charAt23;
            char c3 = 55296;
            if (charAt24 >= 55296) {
                int i80 = charAt24 & 8191;
                int i81 = 13;
                while (true) {
                    i35 = i78 + 1;
                    charAt12 = str.charAt(i78);
                    if (charAt12 < c3) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i81;
                    i81 += 13;
                    i78 = i35;
                    c3 = 55296;
                }
                charAt24 = i80 | (charAt12 << i81);
                i78 = i35;
            }
            int i82 = charAt24 & 255;
            int i83 = i11;
            if ((charAt24 & Barcode.FORMAT_UPC_E) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            Object[] objArr2 = arVar.charlie;
            if (i82 >= 51) {
                int i84 = i78 + 1;
                int charAt25 = str.charAt(i78);
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i33 = i86 + 1;
                        charAt11 = str.charAt(i86);
                        i34 = i85;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i85 = i34 | ((charAt11 & 8191) << i87);
                        i87 += 13;
                        i86 = i33;
                    }
                    charAt25 = i34 | (charAt11 << i87);
                    i32 = i33;
                } else {
                    i32 = i84;
                }
                int i88 = charAt25;
                int i89 = i82 - 51;
                int i90 = i32;
                if (i89 != 9 && i89 != 17) {
                    if (i89 == 12 && (av.q.bravo(arVar.alpha(), 1) || (charAt24 & 2048) != 0)) {
                        iArr2 = iArr4;
                        objArr[P0.zulu(i72, 3, 2, 1)] = objArr2[i13];
                        i13++;
                    }
                    iArr2 = iArr4;
                } else {
                    iArr2 = iArr4;
                    objArr[P0.zulu(i72, 3, 2, 1)] = objArr2[i13];
                    i13++;
                }
                int i91 = i88 * 2;
                Object obj = objArr2[i91];
                if (obj instanceof Field) {
                    coral2 = (Field) obj;
                } else {
                    coral2 = coral(cls, (String) obj);
                    objArr2[i91] = coral2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(coral2);
                int i92 = i91 + 1;
                Object obj2 = objArr2[i92];
                if (obj2 instanceof Field) {
                    coral3 = (Field) obj2;
                } else {
                    coral3 = coral(cls, (String) obj2);
                    objArr2[i92] = coral3;
                }
                i25 = i69;
                i30 = objectFieldOffset2;
                i28 = i90;
                i27 = (int) unsafe.objectFieldOffset(coral3);
                i29 = 0;
            } else {
                iArr2 = iArr4;
                int i93 = i13 + 1;
                Field coral4 = coral(cls, (String) objArr2[i13]);
                if (i82 == 9 || i82 == 17) {
                    i25 = i69;
                    objArr[P0.zulu(i72, 3, 2, 1)] = coral4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i25 = i69;
                        i31 = i13 + 2;
                        objArr[P0.zulu(i72, 3, 2, 1)] = objArr2[i93];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i25 = i69;
                        if (arVar.alpha() == 1 || (charAt24 & 2048) != 0) {
                            i31 = i13 + 2;
                            objArr[P0.zulu(i72, 3, 2, 1)] = objArr2[i93];
                        }
                    } else if (i82 == 50) {
                        int i94 = i71 + 1;
                        iArr[i71] = i72;
                        int i95 = (i72 / 3) * 2;
                        int i96 = i13 + 2;
                        objArr[i95] = objArr2[i93];
                        if ((charAt24 & 2048) != 0) {
                            i26 = i13 + 3;
                            objArr[i95 + 1] = objArr2[i96];
                            i25 = i69;
                            i71 = i94;
                        } else {
                            i26 = i96;
                            i71 = i94;
                            i25 = i69;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(coral4);
                        if ((charAt24 & 4096) != 0 || i82 > 17) {
                            i27 = 1048575;
                            i28 = i78;
                            i29 = 0;
                        } else {
                            int i97 = i78 + 1;
                            int charAt26 = str.charAt(i78);
                            if (charAt26 >= 55296) {
                                int i98 = charAt26 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i28 = i97 + 1;
                                    charAt10 = str.charAt(i97);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i98 |= (charAt10 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i28;
                                }
                                charAt26 = i98 | (charAt10 << i99);
                            } else {
                                i28 = i97;
                            }
                            int i100 = (charAt26 / 32) + (i83 * 2);
                            Object obj3 = objArr2[i100];
                            if (obj3 instanceof Field) {
                                coral = (Field) obj3;
                            } else {
                                coral = coral(cls, (String) obj3);
                                objArr2[i100] = coral;
                            }
                            i27 = (int) unsafe.objectFieldOffset(coral);
                            i29 = charAt26 % 32;
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i70] = objectFieldOffset;
                            i70++;
                        }
                        i13 = i26;
                        i30 = objectFieldOffset;
                    } else {
                        i25 = i69;
                    }
                    i26 = i31;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(coral4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i27 = 1048575;
                    i28 = i78;
                    i29 = 0;
                    if (i82 >= 18) {
                        iArr[i70] = objectFieldOffset;
                        i70++;
                    }
                    i13 = i26;
                    i30 = objectFieldOffset;
                }
                i26 = i93;
                objectFieldOffset = (int) unsafe.objectFieldOffset(coral4);
                if ((charAt24 & 4096) != 0) {
                }
                i27 = 1048575;
                i28 = i78;
                i29 = 0;
                if (i82 >= 18) {
                }
                i13 = i26;
                i30 = objectFieldOffset;
            }
            int i101 = i72 + 1;
            iArr2[i72] = i79;
            int i102 = i72 + 2;
            String str2 = str;
            iArr2[i101] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? RecyclerView.UNDEFINED_DURATION : 0) | (i82 << 20) | i30;
            i72 += 3;
            iArr2[i102] = (i29 << 20) | i27;
            str = str2;
            i11 = i83;
            length = i23;
            i40 = i28;
            i69 = i25;
            iArr4 = iArr2;
            i38 = 55296;
        }
        return new aj(iArr4, objArr, i5, i12, arVar.alpha, iArr, i14, i69, alVar, xVar, awVar, c0605l, aeVar);
    }

    public static long yankee(int i4) {
        return i4 & 1048575;
    }

    public static int zulu(long j5, Object obj) {
        return ((Integer) D.charlie.hotel(j5, obj)).intValue();
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void alpha(Object obj) {
        if (papa(obj)) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                sVar.juliet(LottieConstants.IterateForever);
                sVar.memoizedHashCode = 0;
                sVar.golf();
            }
            int[] iArr = this.alpha;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int gray = gray(i4);
                long j5 = 1048575 & gray;
                int gold = gold(gray);
                if (gold != 9) {
                    if (gold != 60 && gold != 68) {
                        switch (gold) {
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
                                this.kilo.getClass();
                                AbstractC0595b abstractC0595b = (AbstractC0595b) ((t) D.charlie.hotel(j5, obj));
                                if (abstractC0595b.alpha) {
                                    abstractC0595b.alpha = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = oscar;
                                Object object = unsafe.getObject(obj, j5);
                                if (object != null) {
                                    this.mike.getClass();
                                    ((ad) object).alpha = false;
                                    unsafe.putObject(obj, j5, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (quebec(iArr[i4], i4, obj)) {
                        mike(i4).alpha(oscar.getObject(obj, j5));
                    }
                }
                if (november(i4, obj)) {
                    mike(i4).alpha(oscar.getObject(obj, j5));
                }
            }
            ((ay) this.lima).getClass();
            ax axVar = ((s) obj).unknownFields;
            if (axVar.echo) {
                axVar.echo = false;
            }
        }
    }

    public final int azure(int i4) {
        if (i4 >= this.charlie && i4 <= this.delta) {
            int[] iArr = this.alpha;
            int length = (iArr.length / 3) - 1;
            int i5 = 0;
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
        }
        return -1;
    }

    public final void beige(Object obj, long j5, C0601h c0601h, as asVar, C0604k c0604k) {
        int yankee;
        this.kilo.getClass();
        t alpha = x.alpha(j5, obj);
        int i4 = c0601h.bravo;
        if ((i4 & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            s charlie = asVar.charlie();
            c0601h.bravo(charlie, asVar, c0604k);
            asVar.alpha(charlie);
            ((aq) alpha).add(charlie);
            Pf.g gVar = c0601h.alpha;
            if (!gVar.charlie() && c0601h.delta == 0) {
                yankee = gVar.yankee();
            } else {
                return;
            }
        } while (yankee == i4);
        c0601h.delta = yankee;
    }

    public final void black(Object obj, int i4, C0601h c0601h, as asVar, C0604k c0604k) {
        int yankee;
        this.kilo.getClass();
        t alpha = x.alpha(i4 & 1048575, obj);
        int i5 = c0601h.bravo;
        if ((i5 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            s charlie = asVar.charlie();
            c0601h.charlie(charlie, asVar, c0604k);
            asVar.alpha(charlie);
            ((aq) alpha).add(charlie);
            Pf.g gVar = c0601h.alpha;
            if (!gVar.charlie() && c0601h.delta == 0) {
                yankee = gVar.yankee();
            } else {
                return;
            }
        } while (yankee == i5);
        c0601h.delta = yankee;
    }

    public final void blue(int i4, C0601h c0601h, Object obj) {
        boolean z2;
        if ((536870912 & i4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c0601h.whiskey(2);
            D.oscar(obj, i4 & 1048575, c0601h.alpha.xray());
        } else if (this.foxtrot) {
            c0601h.whiskey(2);
            D.oscar(obj, i4 & 1048575, c0601h.alpha.whiskey());
        } else {
            D.oscar(obj, i4 & 1048575, c0601h.echo());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final boolean bravo(Object obj) {
        int i4;
        int i5;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.hotel) {
            int i14 = this.golf[i13];
            int[] iArr = this.alpha;
            int i15 = iArr[i14];
            int gray = gray(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = oscar.getInt(obj, i17);
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
            if ((268435456 & gray) == 0 || oscar(obj, i5, i4, i10, i18)) {
                int gold = gold(gray);
                if (gold != 9 && gold != 17) {
                    if (gold != 27) {
                        if (gold != 60 && gold != 68) {
                            if (gold != 49) {
                                if (gold != 50) {
                                    continue;
                                } else {
                                    Object hotel = D.charlie.hotel(gray & 1048575, obj);
                                    this.mike.getClass();
                                    ad adVar = (ad) hotel;
                                    if (adVar.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((ac) this.bravo[(i5 / 3) * 2]).alpha.bravo.alpha != L.MESSAGE) {
                                            continue;
                                        } else {
                                            as asVar = null;
                                            for (Object obj2 : adVar.values()) {
                                                if (asVar == null) {
                                                    asVar = ap.charlie.alpha(obj2.getClass());
                                                }
                                                if (!asVar.bravo(obj2)) {
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
                            if (quebec(i15, i5, obj)) {
                                if (!mike(i5).bravo(D.charlie.hotel(gray & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i13++;
                            i11 = i4;
                            i12 = i10;
                        }
                    }
                    List list = (List) D.charlie.hotel(gray & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        as mike = mike(i5);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (mike.bravo(list.get(i20))) {
                            }
                        }
                    }
                    i13++;
                    i11 = i4;
                    i12 = i10;
                } else {
                    if (oscar(obj, i5, i4, i10, i18)) {
                        if (!mike(i5).bravo(D.charlie.hotel(gray & 1048575, obj))) {
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

    public final void bronze(int i4, C0601h c0601h, Object obj) {
        boolean z2;
        if ((536870912 & i4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x xVar = this.kilo;
        if (z2) {
            xVar.getClass();
            c0601h.sierra(x.alpha(i4 & 1048575, obj), true);
        } else {
            xVar.getClass();
            c0601h.sierra(x.alpha(i4 & 1048575, obj), false);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final s charlie() {
        this.juliet.getClass();
        return this.echo.hotel();
    }

    public final void crimson(int i4, Object obj) {
        int i5 = this.alpha[i4 + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        D.mike(j5, (1 << (i5 >>> 20)) | D.charlie.foxtrot(j5, obj), obj);
    }

    public final void cyan(int i4, int i5, Object obj) {
        D.mike(this.alpha[i5 + 2] & 1048575, i4, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void delta(Object obj, Object obj2) {
        Object obj3;
        if (papa(obj)) {
            obj2.getClass();
            int i4 = 0;
            while (true) {
                int[] iArr = this.alpha;
                if (i4 < iArr.length) {
                    int gray = gray(i4);
                    long j5 = 1048575 & gray;
                    int i5 = iArr[i4];
                    switch (gold(gray)) {
                        case 0:
                            if (november(i4, obj2)) {
                                C c3 = D.charlie;
                                obj3 = obj;
                                c3.lima(obj3, j5, c3.delta(j5, obj2));
                                crimson(i4, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (november(i4, obj2)) {
                                C c4 = D.charlie;
                                c4.mike(obj, j5, c4.echo(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (november(i4, obj2)) {
                                D.november(obj, j5, D.charlie.golf(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (november(i4, obj2)) {
                                D.november(obj, j5, D.charlie.golf(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (november(i4, obj2)) {
                                D.mike(j5, D.charlie.foxtrot(j5, obj2), obj);
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (november(i4, obj2)) {
                                D.november(obj, j5, D.charlie.golf(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (november(i4, obj2)) {
                                D.mike(j5, D.charlie.foxtrot(j5, obj2), obj);
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (november(i4, obj2)) {
                                C c10 = D.charlie;
                                c10.juliet(obj, j5, c10.charlie(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (november(i4, obj2)) {
                                D.oscar(obj, j5, D.charlie.hotel(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 9:
                            tango(i4, obj, obj2);
                            break;
                        case 10:
                            if (november(i4, obj2)) {
                                D.oscar(obj, j5, D.charlie.hotel(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (november(i4, obj2)) {
                                D.mike(j5, D.charlie.foxtrot(j5, obj2), obj);
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (november(i4, obj2)) {
                                D.mike(j5, D.charlie.foxtrot(j5, obj2), obj);
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (november(i4, obj2)) {
                                D.mike(j5, D.charlie.foxtrot(j5, obj2), obj);
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (november(i4, obj2)) {
                                D.november(obj, j5, D.charlie.golf(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (november(i4, obj2)) {
                                D.mike(j5, D.charlie.foxtrot(j5, obj2), obj);
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (november(i4, obj2)) {
                                D.november(obj, j5, D.charlie.golf(j5, obj2));
                                crimson(i4, obj);
                                break;
                            }
                            break;
                        case 17:
                            tango(i4, obj, obj2);
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
                            this.kilo.getClass();
                            C c11 = D.charlie;
                            t tVar = (t) c11.hotel(j5, obj);
                            t tVar2 = (t) c11.hotel(j5, obj2);
                            aq aqVar = (aq) tVar;
                            int i10 = aqVar.red;
                            int i11 = ((aq) tVar2).red;
                            if (i10 > 0 && i11 > 0) {
                                if (!((AbstractC0595b) tVar).alpha) {
                                    tVar = aqVar.delta(i11 + i10);
                                }
                                ((AbstractC0595b) tVar).addAll(tVar2);
                            }
                            if (i10 > 0) {
                                tVar2 = tVar;
                            }
                            D.oscar(obj, j5, tVar2);
                            break;
                        case 50:
                            Class cls = at.alpha;
                            C c12 = D.charlie;
                            Object hotel = c12.hotel(j5, obj);
                            Object hotel2 = c12.hotel(j5, obj2);
                            this.mike.getClass();
                            D.oscar(obj, j5, ae.alpha(hotel, hotel2));
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
                            if (quebec(i5, i4, obj2)) {
                                D.oscar(obj, j5, D.charlie.hotel(j5, obj2));
                                cyan(i5, i4, obj);
                                break;
                            }
                            break;
                        case 60:
                            uniform(i4, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (quebec(i5, i4, obj2)) {
                                D.oscar(obj, j5, D.charlie.hotel(j5, obj2));
                                cyan(i5, i4, obj);
                                break;
                            }
                            break;
                        case 68:
                            uniform(i4, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i4 += 3;
                    obj = obj3;
                } else {
                    at.kilo(this.lima, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(P0.bronze(obj, "Mutating immutable message: "));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void echo(Object obj, aa aaVar) {
        aaVar.getClass();
        green(obj, aaVar);
    }

    public final void emerald(Object obj, int i4, ah ahVar) {
        oscar.putObject(obj, gray(i4) & 1048575, ahVar);
        crimson(i4, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x032a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x0223. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032d A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.as
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int foxtrot(s sVar) {
        int i4;
        int i5;
        int juliet;
        int juliet2;
        int juliet3;
        int lima;
        int juliet4;
        int lima2;
        int juliet5;
        int juliet6;
        int india;
        int hotel;
        int i10;
        int charlie;
        int i11;
        int i12;
        int juliet7;
        int size;
        int india2;
        int juliet8;
        int juliet9;
        int juliet10;
        int size2;
        int juliet11;
        int kilo;
        int i13;
        int i14;
        Iterator it;
        int lima3;
        int size3;
        int kilo2;
        I i15;
        int lima4;
        int size4;
        int kilo3;
        int juliet12;
        int juliet13;
        int juliet14;
        int lima5;
        int juliet15;
        int lima6;
        int juliet16;
        int india3;
        int kilo4;
        aj ajVar = this;
        s sVar2 = sVar;
        int i16 = 2;
        int i17 = 1;
        Unsafe unsafe = oscar;
        int i18 = 1048575;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            int[] iArr = ajVar.alpha;
            if (i20 < iArr.length) {
                int gray = ajVar.gray(i20);
                int gold = gold(gray);
                int i23 = iArr[i20];
                int i24 = iArr[i20 + 2];
                int i25 = i24 & i18;
                int i26 = i16;
                if (gold <= 17) {
                    if (i25 != i19) {
                        if (i25 == i18) {
                            i21 = 0;
                        } else {
                            i21 = unsafe.getInt(sVar2, i25);
                        }
                        i19 = i25;
                    }
                    i4 = i17 << (i24 >>> 20);
                } else {
                    i4 = 0;
                }
                long j5 = gray & i18;
                if (gold >= o.purple.alpha) {
                    int i27 = o.red.alpha;
                }
                char c3 = '?';
                switch (gold) {
                    case 0:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            juliet = C0602i.juliet(i23) + 8;
                            i22 += juliet;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        } else {
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                    case 1:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            juliet2 = C0602i.juliet(i23);
                            juliet6 = juliet2 + 4;
                            i22 += juliet6;
                        }
                        ajVar = this;
                        sVar2 = sVar;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 2:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            long j6 = unsafe.getLong(sVar2, j5);
                            juliet3 = C0602i.juliet(i23);
                            lima = C0602i.lima(j6);
                            i22 += lima + juliet3;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 3:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            long j7 = unsafe.getLong(sVar2, j5);
                            juliet3 = C0602i.juliet(i23);
                            lima = C0602i.lima(j7);
                            i22 += lima + juliet3;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 4:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            int i28 = unsafe.getInt(sVar2, j5);
                            juliet4 = C0602i.juliet(i23);
                            lima2 = C0602i.lima(i28);
                            hotel = lima2 + juliet4;
                            i22 += hotel;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 5:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            juliet5 = C0602i.juliet(i23);
                            juliet6 = juliet5 + 8;
                            i22 += juliet6;
                        }
                        ajVar = this;
                        sVar2 = sVar;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 6:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            juliet2 = C0602i.juliet(i23);
                            juliet6 = juliet2 + 4;
                            i22 += juliet6;
                        }
                        ajVar = this;
                        sVar2 = sVar;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 7:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            juliet6 = C0602i.juliet(i23) + 1;
                            i22 += juliet6;
                        }
                        ajVar = this;
                        sVar2 = sVar;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 8:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            Object object = unsafe.getObject(sVar2, j5);
                            if (object instanceof C0599f) {
                                india = C0602i.hotel(i23, (C0599f) object);
                            } else {
                                india = C0602i.india((String) object) + C0602i.juliet(i23);
                            }
                            i22 = india + i22;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 9:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            Object object2 = unsafe.getObject(sVar2, j5);
                            as mike = ajVar.mike(i20);
                            Class cls = at.alpha;
                            int juliet17 = C0602i.juliet(i23);
                            int alpha = ((AbstractC0594a) ((ah) object2)).alpha(mike);
                            i22 += C0602i.kilo(alpha) + alpha + juliet17;
                        }
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 10:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            hotel = C0602i.hotel(i23, (C0599f) unsafe.getObject(sVar2, j5));
                            i22 += hotel;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 11:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            int i29 = unsafe.getInt(sVar2, j5);
                            juliet4 = C0602i.juliet(i23);
                            lima2 = C0602i.kilo(i29);
                            hotel = lima2 + juliet4;
                            i22 += hotel;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 12:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            int i30 = unsafe.getInt(sVar2, j5);
                            juliet4 = C0602i.juliet(i23);
                            lima2 = C0602i.lima(i30);
                            hotel = lima2 + juliet4;
                            i22 += hotel;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 13:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            juliet2 = C0602i.juliet(i23);
                            juliet6 = juliet2 + 4;
                            i22 += juliet6;
                        }
                        ajVar = this;
                        sVar2 = sVar;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 14:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            juliet5 = C0602i.juliet(i23);
                            juliet6 = juliet5 + 8;
                            i22 += juliet6;
                        }
                        ajVar = this;
                        sVar2 = sVar;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 15:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            int i31 = unsafe.getInt(sVar2, j5);
                            juliet4 = C0602i.juliet(i23);
                            lima2 = C0602i.kilo((i31 >> 31) ^ (i31 << 1));
                            hotel = lima2 + juliet4;
                            i22 += hotel;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 16:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            long j10 = unsafe.getLong(sVar2, j5);
                            juliet3 = C0602i.juliet(i23);
                            lima = C0602i.lima((j10 >> 63) ^ (j10 << i5));
                            i22 += lima + juliet3;
                        }
                        ajVar = this;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 17:
                        i5 = i17;
                        if (ajVar.oscar(sVar2, i20, i19, i21, i4)) {
                            ah ahVar = (ah) unsafe.getObject(sVar2, j5);
                            juliet = ((AbstractC0594a) ahVar).alpha(ajVar.mike(i20)) + (C0602i.juliet(i23) * 2);
                            i22 += juliet;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        } else {
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                    case 18:
                        i10 = i19;
                        i5 = i17;
                        charlie = at.charlie(i23, (List) unsafe.getObject(sVar2, j5));
                        i22 += charlie;
                        i19 = i10;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 19:
                        i10 = i19;
                        i5 = i17;
                        charlie = at.bravo(i23, (List) unsafe.getObject(sVar2, j5));
                        i22 += charlie;
                        i19 = i10;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 20:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list = (List) unsafe.getObject(sVar2, j5);
                        Class cls2 = at.alpha;
                        if (list.size() != 0) {
                            juliet7 = (C0602i.juliet(i23) * list.size()) + at.echo(list);
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 21:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list2 = (List) unsafe.getObject(sVar2, j5);
                        Class cls3 = at.alpha;
                        size = list2.size();
                        if (size != 0) {
                            india2 = at.india(list2);
                            juliet8 = C0602i.juliet(i23);
                            juliet7 = (juliet8 * size) + india2;
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 22:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list3 = (List) unsafe.getObject(sVar2, j5);
                        Class cls4 = at.alpha;
                        size = list3.size();
                        if (size != 0) {
                            india2 = at.delta(list3);
                            juliet8 = C0602i.juliet(i23);
                            juliet7 = (juliet8 * size) + india2;
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 23:
                        i10 = i19;
                        i5 = i17;
                        charlie = at.charlie(i23, (List) unsafe.getObject(sVar2, j5));
                        i22 += charlie;
                        i19 = i10;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 24:
                        i10 = i19;
                        i5 = i17;
                        charlie = at.bravo(i23, (List) unsafe.getObject(sVar2, j5));
                        i22 += charlie;
                        i19 = i10;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 25:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list4 = (List) unsafe.getObject(sVar2, j5);
                        Class cls5 = at.alpha;
                        int size5 = list4.size();
                        if (size5 == 0) {
                            juliet9 = 0;
                        } else {
                            juliet9 = (C0602i.juliet(i23) + 1) * size5;
                        }
                        i22 += juliet9;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 26:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list5 = (List) unsafe.getObject(sVar2, j5);
                        Class cls6 = at.alpha;
                        int size6 = list5.size();
                        if (size6 != 0) {
                            juliet7 = C0602i.juliet(i23) * size6;
                            for (int i32 = 0; i32 < size6; i32++) {
                                Object obj = list5.get(i32);
                                if (obj instanceof C0599f) {
                                    int size7 = ((C0599f) obj).size();
                                    juliet7 = C0602i.kilo(size7) + size7 + juliet7;
                                } else {
                                    juliet7 = C0602i.india((String) obj) + juliet7;
                                }
                            }
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 27:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list6 = (List) unsafe.getObject(sVar2, j5);
                        as mike2 = ajVar.mike(i20);
                        Class cls7 = at.alpha;
                        int size8 = list6.size();
                        if (size8 == 0) {
                            juliet10 = 0;
                        } else {
                            juliet10 = C0602i.juliet(i23) * size8;
                            for (int i33 = 0; i33 < size8; i33++) {
                                int alpha2 = ((AbstractC0594a) ((ah) list6.get(i33))).alpha(mike2);
                                juliet10 += C0602i.kilo(alpha2) + alpha2;
                            }
                        }
                        i22 += juliet10;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 28:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list7 = (List) unsafe.getObject(sVar2, j5);
                        Class cls8 = at.alpha;
                        int size9 = list7.size();
                        if (size9 != 0) {
                            juliet7 = C0602i.juliet(i23) * size9;
                            for (int i34 = 0; i34 < list7.size(); i34++) {
                                int size10 = ((C0599f) list7.get(i34)).size();
                                juliet7 += C0602i.kilo(size10) + size10;
                            }
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 29:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list8 = (List) unsafe.getObject(sVar2, j5);
                        Class cls9 = at.alpha;
                        size = list8.size();
                        if (size != 0) {
                            india2 = at.hotel(list8);
                            juliet8 = C0602i.juliet(i23);
                            juliet7 = (juliet8 * size) + india2;
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 30:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list9 = (List) unsafe.getObject(sVar2, j5);
                        Class cls10 = at.alpha;
                        size = list9.size();
                        if (size != 0) {
                            india2 = at.alpha(list9);
                            juliet8 = C0602i.juliet(i23);
                            juliet7 = (juliet8 * size) + india2;
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 31:
                        i10 = i19;
                        i5 = i17;
                        charlie = at.bravo(i23, (List) unsafe.getObject(sVar2, j5));
                        i22 += charlie;
                        i19 = i10;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 32:
                        i10 = i19;
                        i5 = i17;
                        charlie = at.charlie(i23, (List) unsafe.getObject(sVar2, j5));
                        i22 += charlie;
                        i19 = i10;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 33:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list10 = (List) unsafe.getObject(sVar2, j5);
                        Class cls11 = at.alpha;
                        size = list10.size();
                        if (size != 0) {
                            india2 = at.foxtrot(list10);
                            juliet8 = C0602i.juliet(i23);
                            juliet7 = (juliet8 * size) + india2;
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 34:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list11 = (List) unsafe.getObject(sVar2, j5);
                        Class cls12 = at.alpha;
                        size = list11.size();
                        if (size != 0) {
                            india2 = at.golf(list11);
                            juliet8 = C0602i.juliet(i23);
                            juliet7 = (juliet8 * size) + india2;
                            i22 += juliet7;
                            i19 = i11;
                            i21 = i12;
                            i20 += 3;
                            i16 = i26;
                            i17 = i5;
                            i18 = 1048575;
                        }
                        juliet7 = 0;
                        i22 += juliet7;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 35:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list12 = (List) unsafe.getObject(sVar2, j5);
                        Class cls13 = at.alpha;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 36:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list13 = (List) unsafe.getObject(sVar2, j5);
                        Class cls14 = at.alpha;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 37:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        size2 = at.echo((List) unsafe.getObject(sVar2, j5));
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 38:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        size2 = at.india((List) unsafe.getObject(sVar2, j5));
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 39:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        size2 = at.delta((List) unsafe.getObject(sVar2, j5));
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 40:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list14 = (List) unsafe.getObject(sVar2, j5);
                        Class cls15 = at.alpha;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 41:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list15 = (List) unsafe.getObject(sVar2, j5);
                        Class cls16 = at.alpha;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 42:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list16 = (List) unsafe.getObject(sVar2, j5);
                        Class cls17 = at.alpha;
                        size2 = list16.size();
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 43:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        size2 = at.hotel((List) unsafe.getObject(sVar2, j5));
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 44:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        size2 = at.alpha((List) unsafe.getObject(sVar2, j5));
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 45:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list17 = (List) unsafe.getObject(sVar2, j5);
                        Class cls18 = at.alpha;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 46:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list18 = (List) unsafe.getObject(sVar2, j5);
                        Class cls19 = at.alpha;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 47:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        size2 = at.foxtrot((List) unsafe.getObject(sVar2, j5));
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 48:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        size2 = at.golf((List) unsafe.getObject(sVar2, j5));
                        if (size2 > 0) {
                            juliet11 = C0602i.juliet(i23);
                            kilo = C0602i.kilo(size2);
                            i22 += kilo + juliet11 + size2;
                        }
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 49:
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        List list19 = (List) unsafe.getObject(sVar2, j5);
                        as mike3 = ajVar.mike(i20);
                        Class cls20 = at.alpha;
                        int size11 = list19.size();
                        if (size11 == 0) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            for (int i35 = 0; i35 < size11; i35++) {
                                i13 += ((AbstractC0594a) ((ah) list19.get(i35))).alpha(mike3) + (C0602i.juliet(i23) * 2);
                            }
                        }
                        i22 += i13;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 50:
                        Object object3 = unsafe.getObject(sVar2, j5);
                        Object obj2 = ajVar.bravo[(i20 / 3) * 2];
                        ajVar.mike.getClass();
                        ad adVar = (ad) object3;
                        ac acVar = (ac) obj2;
                        if (adVar.isEmpty()) {
                            i14 = 0;
                        } else {
                            Iterator it2 = adVar.entrySet().iterator();
                            i14 = 0;
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                char c4 = c3;
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                acVar.getClass();
                                int juliet18 = C0602i.juliet(i23);
                                int i36 = i17;
                                ab abVar = acVar.alpha;
                                int i37 = n.charlie;
                                int juliet19 = C0602i.juliet(i36);
                                H h4 = K.silver;
                                G g2 = abVar.alpha;
                                if (g2 == h4) {
                                    juliet19 *= 2;
                                }
                                int i38 = i19;
                                int i39 = i21;
                                switch (g2.ordinal()) {
                                    case 0:
                                        it = it2;
                                        ((Double) key).getClass();
                                        lima3 = 8;
                                        int i40 = lima3 + juliet19;
                                        int juliet20 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                            juliet20 *= 2;
                                        }
                                        switch (i15.ordinal()) {
                                            case 0:
                                                ((Double) value).getClass();
                                                lima4 = 8;
                                                int i41 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i41) + i41 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 1:
                                                ((Float) value).getClass();
                                                lima4 = 4;
                                                int i412 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i412) + i412 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 2:
                                                lima4 = C0602i.lima(((Long) value).longValue());
                                                int i4122 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i4122) + i4122 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 3:
                                                lima4 = C0602i.lima(((Long) value).longValue());
                                                int i41222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i41222) + i41222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 4:
                                                lima4 = C0602i.lima(((Integer) value).intValue());
                                                int i412222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i412222) + i412222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 5:
                                                ((Long) value).getClass();
                                                lima4 = 8;
                                                int i4122222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i4122222) + i4122222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 6:
                                                ((Integer) value).getClass();
                                                lima4 = 4;
                                                int i41222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i41222222) + i41222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 7:
                                                ((Boolean) value).getClass();
                                                lima4 = i36;
                                                int i412222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i412222222) + i412222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 8:
                                                if (value instanceof C0599f) {
                                                    size4 = ((C0599f) value).size();
                                                    kilo3 = C0602i.kilo(size4);
                                                    lima4 = size4 + kilo3;
                                                    int i4122222222 = lima4 + juliet20 + i40;
                                                    i14 += C0602i.kilo(i4122222222) + i4122222222 + juliet18;
                                                    it2 = it;
                                                    c3 = c4;
                                                    i17 = i36;
                                                    i19 = i38;
                                                    i21 = i39;
                                                } else {
                                                    lima4 = C0602i.india((String) value);
                                                    int i41222222222 = lima4 + juliet20 + i40;
                                                    i14 += C0602i.kilo(i41222222222) + i41222222222 + juliet18;
                                                    it2 = it;
                                                    c3 = c4;
                                                    i17 = i36;
                                                    i19 = i38;
                                                    i21 = i39;
                                                }
                                            case 9:
                                                lima4 = ((s) ((ah) value)).alpha(null);
                                                int i412222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i412222222222) + i412222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 10:
                                                size4 = ((s) ((ah) value)).alpha(null);
                                                kilo3 = C0602i.kilo(size4);
                                                lima4 = size4 + kilo3;
                                                int i4122222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i4122222222222) + i4122222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 11:
                                                if (value instanceof C0599f) {
                                                    size4 = ((C0599f) value).size();
                                                    kilo3 = C0602i.kilo(size4);
                                                } else {
                                                    size4 = ((byte[]) value).length;
                                                    kilo3 = C0602i.kilo(size4);
                                                }
                                                lima4 = size4 + kilo3;
                                                int i41222222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i41222222222222) + i41222222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 12:
                                                lima4 = C0602i.kilo(((Integer) value).intValue());
                                                int i412222222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i412222222222222) + i412222222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 13:
                                                lima4 = C0602i.lima(((Integer) value).intValue());
                                                int i4122222222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i4122222222222222) + i4122222222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 14:
                                                ((Integer) value).getClass();
                                                lima4 = 4;
                                                int i41222222222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i41222222222222222) + i41222222222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 15:
                                                ((Long) value).getClass();
                                                lima4 = 8;
                                                int i412222222222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i412222222222222222) + i412222222222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 16:
                                                int intValue = ((Integer) value).intValue();
                                                lima4 = C0602i.kilo((intValue >> 31) ^ (intValue << 1));
                                                int i4122222222222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i4122222222222222222) + i4122222222222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            case 17:
                                                long longValue = ((Long) value).longValue();
                                                lima4 = C0602i.lima((longValue << i36) ^ (longValue >> c4));
                                                int i41222222222222222222 = lima4 + juliet20 + i40;
                                                i14 += C0602i.kilo(i41222222222222222222) + i41222222222222222222 + juliet18;
                                                it2 = it;
                                                c3 = c4;
                                                i17 = i36;
                                                i19 = i38;
                                                i21 = i39;
                                            default:
                                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                        }
                                    case 1:
                                        it = it2;
                                        ((Float) key).getClass();
                                        lima3 = 4;
                                        int i402 = lima3 + juliet19;
                                        int juliet202 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 2:
                                        it = it2;
                                        lima3 = C0602i.lima(((Long) key).longValue());
                                        int i4022 = lima3 + juliet19;
                                        int juliet2022 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 3:
                                        it = it2;
                                        lima3 = C0602i.lima(((Long) key).longValue());
                                        int i40222 = lima3 + juliet19;
                                        int juliet20222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 4:
                                        it = it2;
                                        lima3 = C0602i.lima(((Integer) key).intValue());
                                        int i402222 = lima3 + juliet19;
                                        int juliet202222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 5:
                                        it = it2;
                                        ((Long) key).getClass();
                                        lima3 = 8;
                                        int i4022222 = lima3 + juliet19;
                                        int juliet2022222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 6:
                                        it = it2;
                                        ((Integer) key).getClass();
                                        lima3 = 4;
                                        int i40222222 = lima3 + juliet19;
                                        int juliet20222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 7:
                                        it = it2;
                                        ((Boolean) key).getClass();
                                        lima3 = i36;
                                        int i402222222 = lima3 + juliet19;
                                        int juliet202222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 8:
                                        it = it2;
                                        if (key instanceof C0599f) {
                                            size3 = ((C0599f) key).size();
                                            kilo2 = C0602i.kilo(size3);
                                            lima3 = kilo2 + size3;
                                            int i4022222222 = lima3 + juliet19;
                                            int juliet2022222222 = C0602i.juliet(i26);
                                            i15 = abVar.bravo;
                                            if (i15 == h4) {
                                            }
                                            switch (i15.ordinal()) {
                                            }
                                        } else {
                                            lima3 = C0602i.india((String) key);
                                            int i40222222222 = lima3 + juliet19;
                                            int juliet20222222222 = C0602i.juliet(i26);
                                            i15 = abVar.bravo;
                                            if (i15 == h4) {
                                            }
                                            switch (i15.ordinal()) {
                                            }
                                        }
                                    case 9:
                                        it = it2;
                                        lima3 = ((s) ((ah) key)).alpha(null);
                                        int i402222222222 = lima3 + juliet19;
                                        int juliet202222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 10:
                                        it = it2;
                                        int alpha3 = ((s) ((ah) key)).alpha(null);
                                        lima3 = C0602i.kilo(alpha3) + alpha3;
                                        int i4022222222222 = lima3 + juliet19;
                                        int juliet2022222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 11:
                                        it = it2;
                                        if (key instanceof C0599f) {
                                            size3 = ((C0599f) key).size();
                                            kilo2 = C0602i.kilo(size3);
                                        } else {
                                            size3 = ((byte[]) key).length;
                                            kilo2 = C0602i.kilo(size3);
                                        }
                                        lima3 = kilo2 + size3;
                                        int i40222222222222 = lima3 + juliet19;
                                        int juliet20222222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 12:
                                        it = it2;
                                        lima3 = C0602i.kilo(((Integer) key).intValue());
                                        int i402222222222222 = lima3 + juliet19;
                                        int juliet202222222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 13:
                                        it = it2;
                                        lima3 = C0602i.lima(((Integer) key).intValue());
                                        int i4022222222222222 = lima3 + juliet19;
                                        int juliet2022222222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 14:
                                        ((Integer) key).getClass();
                                        it = it2;
                                        lima3 = 4;
                                        int i40222222222222222 = lima3 + juliet19;
                                        int juliet20222222222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 15:
                                        ((Long) key).getClass();
                                        it = it2;
                                        lima3 = 8;
                                        int i402222222222222222 = lima3 + juliet19;
                                        int juliet202222222222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 16:
                                        int intValue2 = ((Integer) key).intValue();
                                        lima3 = C0602i.kilo((intValue2 >> 31) ^ (intValue2 << 1));
                                        it = it2;
                                        int i4022222222222222222 = lima3 + juliet19;
                                        int juliet2022222222222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    case 17:
                                        long longValue2 = ((Long) key).longValue();
                                        lima3 = C0602i.lima((longValue2 << i36) ^ (longValue2 >> c4));
                                        it = it2;
                                        int i40222222222222222222 = lima3 + juliet19;
                                        int juliet20222222222222222222 = C0602i.juliet(i26);
                                        i15 = abVar.bravo;
                                        if (i15 == h4) {
                                        }
                                        switch (i15.ordinal()) {
                                        }
                                    default:
                                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                }
                            }
                        }
                        i11 = i19;
                        i12 = i21;
                        i5 = i17;
                        i22 += i14;
                        i19 = i11;
                        i21 = i12;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 51:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet12 = C0602i.juliet(i23);
                            juliet16 = juliet12 + 8;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 52:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet13 = C0602i.juliet(i23);
                            juliet16 = juliet13 + 4;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 53:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            long amber = amber(j5, sVar2);
                            juliet14 = C0602i.juliet(i23);
                            lima5 = C0602i.lima(amber);
                            juliet16 = lima5 + juliet14;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 54:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            long amber2 = amber(j5, sVar2);
                            juliet14 = C0602i.juliet(i23);
                            lima5 = C0602i.lima(amber2);
                            juliet16 = lima5 + juliet14;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 55:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            int zulu = zulu(j5, sVar2);
                            juliet15 = C0602i.juliet(i23);
                            lima6 = C0602i.lima(zulu);
                            juliet16 = lima6 + juliet15;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 56:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet12 = C0602i.juliet(i23);
                            juliet16 = juliet12 + 8;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 57:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet13 = C0602i.juliet(i23);
                            juliet16 = juliet13 + 4;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 58:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet16 = C0602i.juliet(i23) + i17;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 59:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            Object object4 = unsafe.getObject(sVar2, j5);
                            if (object4 instanceof C0599f) {
                                india3 = C0602i.hotel(i23, (C0599f) object4);
                            } else {
                                india3 = C0602i.india((String) object4) + C0602i.juliet(i23);
                            }
                            i22 = india3 + i22;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 60:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            Object object5 = unsafe.getObject(sVar2, j5);
                            as mike4 = ajVar.mike(i20);
                            Class cls21 = at.alpha;
                            int juliet21 = C0602i.juliet(i23);
                            int alpha4 = ((AbstractC0594a) ((ah) object5)).alpha(mike4);
                            kilo4 = C0602i.kilo(alpha4) + alpha4 + juliet21;
                            i22 += kilo4;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 61:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet16 = C0602i.hotel(i23, (C0599f) unsafe.getObject(sVar2, j5));
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 62:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            int zulu2 = zulu(j5, sVar2);
                            juliet15 = C0602i.juliet(i23);
                            lima6 = C0602i.kilo(zulu2);
                            juliet16 = lima6 + juliet15;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 63:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            int zulu3 = zulu(j5, sVar2);
                            juliet15 = C0602i.juliet(i23);
                            lima6 = C0602i.lima(zulu3);
                            juliet16 = lima6 + juliet15;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 64:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet13 = C0602i.juliet(i23);
                            juliet16 = juliet13 + 4;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 65:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            juliet12 = C0602i.juliet(i23);
                            juliet16 = juliet12 + 8;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 66:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            int zulu4 = zulu(j5, sVar2);
                            juliet15 = C0602i.juliet(i23);
                            lima6 = C0602i.kilo((zulu4 >> 31) ^ (zulu4 << 1));
                            juliet16 = lima6 + juliet15;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 67:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            long amber3 = amber(j5, sVar2);
                            kilo4 = C0602i.lima((amber3 >> 63) ^ (amber3 << i17)) + C0602i.juliet(i23);
                            i22 += kilo4;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    case 68:
                        if (ajVar.quebec(i23, i20, sVar2)) {
                            ah ahVar2 = (ah) unsafe.getObject(sVar2, j5);
                            as mike5 = ajVar.mike(i20);
                            juliet14 = C0602i.juliet(i23) * 2;
                            lima5 = ((AbstractC0594a) ahVar2).alpha(mike5);
                            juliet16 = lima5 + juliet14;
                            i22 += juliet16;
                        }
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                    default:
                        i5 = i17;
                        i20 += 3;
                        i16 = i26;
                        i17 = i5;
                        i18 = 1048575;
                }
            } else {
                ((ay) ajVar.lima).getClass();
                return sVar2.unknownFields.bravo() + i22;
            }
        }
    }

    public final void fuchsia(Object obj, int i4, int i5, ah ahVar) {
        oscar.putObject(obj, gray(i5) & 1048575, ahVar);
        cyan(i4, i5, obj);
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
    @Override // androidx.datastore.preferences.protobuf.as
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int golf(s sVar) {
        int i4;
        int bravo;
        int i5;
        int[] iArr = this.alpha;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int gray = gray(i11);
            int i12 = iArr[i11];
            long j5 = 1048575 & gray;
            int i13 = 1237;
            int i14 = 37;
            switch (gold(gray)) {
                case 0:
                    i4 = i10 * 53;
                    bravo = u.bravo(Double.doubleToLongBits(D.charlie.delta(j5, sVar)));
                    i10 = bravo + i4;
                    break;
                case 1:
                    i4 = i10 * 53;
                    bravo = Float.floatToIntBits(D.charlie.echo(j5, sVar));
                    i10 = bravo + i4;
                    break;
                case 2:
                    i4 = i10 * 53;
                    bravo = u.bravo(D.charlie.golf(j5, sVar));
                    i10 = bravo + i4;
                    break;
                case 3:
                    i4 = i10 * 53;
                    bravo = u.bravo(D.charlie.golf(j5, sVar));
                    i10 = bravo + i4;
                    break;
                case 4:
                    i4 = i10 * 53;
                    bravo = D.charlie.foxtrot(j5, sVar);
                    i10 = bravo + i4;
                    break;
                case 5:
                    i4 = i10 * 53;
                    bravo = u.bravo(D.charlie.golf(j5, sVar));
                    i10 = bravo + i4;
                    break;
                case 6:
                    i4 = i10 * 53;
                    bravo = D.charlie.foxtrot(j5, sVar);
                    i10 = bravo + i4;
                    break;
                case 7:
                    i5 = i10 * 53;
                    boolean charlie = D.charlie.charlie(j5, sVar);
                    Charset charset = u.alpha;
                    break;
                case 8:
                    i4 = i10 * 53;
                    bravo = ((String) D.charlie.hotel(j5, sVar)).hashCode();
                    i10 = bravo + i4;
                    break;
                case 9:
                    Object hotel = D.charlie.hotel(j5, sVar);
                    if (hotel != null) {
                        i14 = hotel.hashCode();
                    }
                    i10 = (i10 * 53) + i14;
                    break;
                case 10:
                    i4 = i10 * 53;
                    bravo = D.charlie.hotel(j5, sVar).hashCode();
                    i10 = bravo + i4;
                    break;
                case 11:
                    i4 = i10 * 53;
                    bravo = D.charlie.foxtrot(j5, sVar);
                    i10 = bravo + i4;
                    break;
                case 12:
                    i4 = i10 * 53;
                    bravo = D.charlie.foxtrot(j5, sVar);
                    i10 = bravo + i4;
                    break;
                case 13:
                    i4 = i10 * 53;
                    bravo = D.charlie.foxtrot(j5, sVar);
                    i10 = bravo + i4;
                    break;
                case 14:
                    i4 = i10 * 53;
                    bravo = u.bravo(D.charlie.golf(j5, sVar));
                    i10 = bravo + i4;
                    break;
                case 15:
                    i4 = i10 * 53;
                    bravo = D.charlie.foxtrot(j5, sVar);
                    i10 = bravo + i4;
                    break;
                case 16:
                    i4 = i10 * 53;
                    bravo = u.bravo(D.charlie.golf(j5, sVar));
                    i10 = bravo + i4;
                    break;
                case 17:
                    Object hotel2 = D.charlie.hotel(j5, sVar);
                    if (hotel2 != null) {
                        i14 = hotel2.hashCode();
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
                    bravo = D.charlie.hotel(j5, sVar).hashCode();
                    i10 = bravo + i4;
                    break;
                case 50:
                    i4 = i10 * 53;
                    bravo = D.charlie.hotel(j5, sVar).hashCode();
                    i10 = bravo + i4;
                    break;
                case 51:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = u.bravo(Double.doubleToLongBits(((Double) D.charlie.hotel(j5, sVar)).doubleValue()));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = Float.floatToIntBits(((Float) D.charlie.hotel(j5, sVar)).floatValue());
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = u.bravo(amber(j5, sVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = u.bravo(amber(j5, sVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = zulu(j5, sVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = u.bravo(amber(j5, sVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = zulu(j5, sVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (quebec(i12, i11, sVar)) {
                        i5 = i10 * 53;
                        boolean booleanValue = ((Boolean) D.charlie.hotel(j5, sVar)).booleanValue();
                        Charset charset2 = u.alpha;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = ((String) D.charlie.hotel(j5, sVar)).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = D.charlie.hotel(j5, sVar).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = D.charlie.hotel(j5, sVar).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = zulu(j5, sVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = zulu(j5, sVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = zulu(j5, sVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = u.bravo(amber(j5, sVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = zulu(j5, sVar);
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = u.bravo(amber(j5, sVar));
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (quebec(i12, i11, sVar)) {
                        i4 = i10 * 53;
                        bravo = D.charlie.hotel(j5, sVar).hashCode();
                        i10 = bravo + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((ay) this.lima).getClass();
        return sVar.unknownFields.hashCode() + (i10 * 53);
    }

    public final int gray(int i4) {
        return this.alpha[i4 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x004a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x024f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x036c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void green(Object obj, aa aaVar) {
        int i4;
        int i5;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int lima;
        int size;
        int kilo;
        int alpha;
        int kilo2;
        I i20;
        int i21;
        int i22;
        int lima2;
        int size2;
        int kilo3;
        aj ajVar = this;
        int i23 = 2;
        int[] iArr2 = ajVar.alpha;
        int length = iArr2.length;
        Unsafe unsafe = oscar;
        int i24 = 1048575;
        int i25 = 1048575;
        int i26 = 0;
        int i27 = 0;
        while (i26 < length) {
            int gray = ajVar.gray(i26);
            int i28 = iArr2[i26];
            int gold = gold(gray);
            if (gold <= 17) {
                int i29 = iArr2[i26 + 2];
                i4 = 1;
                int i30 = i29 & i24;
                if (i30 != i25) {
                    if (i30 == i24) {
                        i27 = 0;
                    } else {
                        i27 = unsafe.getInt(obj, i30);
                    }
                    i25 = i30;
                }
                i5 = gray;
                i10 = 1 << (i29 >>> 20);
            } else {
                i4 = 1;
                i5 = gray;
                i10 = 0;
            }
            int i31 = i23;
            long j5 = i5 & i24;
            switch (gold) {
                case 0:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        double delta = D.charlie.delta(j5, obj);
                        C0602i c0602i = (C0602i) aaVar.alpha;
                        c0602i.getClass();
                        c0602i.victor(i28, Double.doubleToRawLongBits(delta));
                    }
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 1:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        float echo = D.charlie.echo(j5, obj);
                        C0602i c0602i2 = (C0602i) aaVar.alpha;
                        c0602i2.getClass();
                        c0602i2.tango(i28, Float.floatToRawIntBits(echo));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 2:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).bronze(i28, unsafe.getLong(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 3:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).bronze(i28, unsafe.getLong(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 4:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).xray(i28, unsafe.getInt(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 5:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).victor(i28, unsafe.getLong(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 6:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).tango(i28, unsafe.getInt(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 7:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).quebec(i28, D.charlie.charlie(j5, obj));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 8:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof String) {
                            ((C0602i) aaVar.alpha).amber(i28, (String) object);
                        } else {
                            ((C0602i) aaVar.alpha).romeo(i28, (C0599f) object);
                        }
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 9:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).zulu(i28, (ah) unsafe.getObject(obj, j5), ajVar.mike(i26));
                    }
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 10:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).romeo(i28, (C0599f) unsafe.getObject(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 11:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).black(i28, unsafe.getInt(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 12:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).xray(i28, unsafe.getInt(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 13:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).tango(i28, unsafe.getInt(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 14:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        ((C0602i) aaVar.alpha).victor(i28, unsafe.getLong(obj, j5));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 15:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        int i32 = unsafe.getInt(obj, j5);
                        ((C0602i) aaVar.alpha).black(i28, (i32 >> 31) ^ (i32 << 1));
                        ajVar = this;
                        i26 += 3;
                        i23 = i12;
                        length = i11;
                        iArr2 = iArr;
                        i24 = 1048575;
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 16:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        long j6 = unsafe.getLong(obj, j5);
                        ((C0602i) aaVar.alpha).bronze(i28, (j6 >> 63) ^ (j6 << 1));
                    }
                    ajVar = this;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 17:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    if (ajVar.oscar(obj, i26, i25, i27, i10)) {
                        aaVar.alpha(i28, unsafe.getObject(obj, j5), ajVar.mike(i26));
                    }
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 18:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.november(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 19:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.romeo(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 20:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.tango(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 21:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.zulu(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 22:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.sierra(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 23:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.quebec(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 24:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.papa(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 25:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    at.mike(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 26:
                    i15 = i25;
                    i16 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    int i33 = iArr[i26];
                    List list = (List) unsafe.getObject(obj, j5);
                    Class cls = at.alpha;
                    if (list != null && !list.isEmpty()) {
                        aaVar.getClass();
                        for (int i34 = 0; i34 < list.size(); i34++) {
                            ((C0602i) aaVar.alpha).amber(i33, (String) list.get(i34));
                        }
                    }
                    i25 = i15;
                    i27 = i16;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                    break;
                case 27:
                    i15 = i25;
                    i16 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    int i35 = iArr[i26];
                    List list2 = (List) unsafe.getObject(obj, j5);
                    as mike = ajVar.mike(i26);
                    Class cls2 = at.alpha;
                    if (list2 != null && !list2.isEmpty()) {
                        aaVar.getClass();
                        for (int i36 = 0; i36 < list2.size(); i36++) {
                            ((C0602i) aaVar.alpha).zulu(i35, (ah) list2.get(i36), mike);
                        }
                    }
                    i25 = i15;
                    i27 = i16;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                    break;
                case 28:
                    i15 = i25;
                    i16 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    int i37 = iArr[i26];
                    List list3 = (List) unsafe.getObject(obj, j5);
                    Class cls3 = at.alpha;
                    if (list3 != null && !list3.isEmpty()) {
                        aaVar.getClass();
                        for (int i38 = 0; i38 < list3.size(); i38++) {
                            ((C0602i) aaVar.alpha).romeo(i37, (C0599f) list3.get(i38));
                        }
                    }
                    i25 = i15;
                    i27 = i16;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                    break;
                case 29:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    z2 = false;
                    at.yankee(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 30:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    z2 = false;
                    at.oscar(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 31:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    z2 = false;
                    at.uniform(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 32:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    z2 = false;
                    at.victor(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 33:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    z2 = false;
                    at.whiskey(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 34:
                    i13 = i25;
                    i14 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    z2 = false;
                    at.xray(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, false);
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 35:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z11 = i4;
                    at.november(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z11);
                    z10 = z11;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 36:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z12 = i4;
                    at.romeo(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z12);
                    z10 = z12;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 37:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z13 = i4;
                    at.tango(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z13);
                    z10 = z13;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 38:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z14 = i4;
                    at.zulu(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z14);
                    z10 = z14;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 39:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z15 = i4;
                    at.sierra(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z15);
                    z10 = z15;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 40:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z16 = i4;
                    at.quebec(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z16);
                    z10 = z16;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 41:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z17 = i4;
                    at.papa(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z17);
                    z10 = z17;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 42:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z18 = i4;
                    at.mike(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z18);
                    z10 = z18;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 43:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z19 = i4;
                    at.yankee(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z19);
                    z10 = z19;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 44:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z20 = i4;
                    at.oscar(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z20);
                    z10 = z20;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 45:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z21 = i4;
                    at.uniform(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z21);
                    z10 = z21;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 46:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z22 = i4;
                    at.victor(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z22);
                    z10 = z22;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 47:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z23 = i4;
                    at.whiskey(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z23);
                    z10 = z23;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 48:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    boolean z24 = i4;
                    at.xray(iArr[i26], (List) unsafe.getObject(obj, j5), aaVar, z24);
                    z10 = z24;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 49:
                    i17 = i25;
                    i18 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    int i39 = iArr[i26];
                    List list4 = (List) unsafe.getObject(obj, j5);
                    as mike2 = ajVar.mike(i26);
                    Class cls4 = at.alpha;
                    if (list4 != null && !list4.isEmpty()) {
                        aaVar.getClass();
                        for (int i40 = 0; i40 < list4.size(); i40++) {
                            aaVar.alpha(i39, list4.get(i40), mike2);
                        }
                    }
                    z10 = true;
                    i25 = i17;
                    i27 = i18;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j5);
                    if (object2 != null) {
                        Object obj2 = ajVar.bravo[(i26 / 3) * i31];
                        ajVar.mike.getClass();
                        ab abVar = ((ac) obj2).alpha;
                        C0602i c0602i3 = (C0602i) aaVar.alpha;
                        c0602i3.getClass();
                        Iterator it = ((ad) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            c0602i3.beige(i28, i31);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i41 = n.charlie;
                            int juliet = C0602i.juliet(i4);
                            int i42 = i25;
                            H h4 = K.silver;
                            int i43 = i27;
                            G g2 = abVar.alpha;
                            if (g2 == h4) {
                                juliet *= 2;
                            }
                            Iterator it2 = it;
                            int[] iArr3 = iArr2;
                            switch (g2.ordinal()) {
                                case 0:
                                    i19 = length;
                                    ((Double) key).getClass();
                                    lima = 8;
                                    int i44 = lima + juliet;
                                    int juliet2 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                        juliet2 *= 2;
                                    }
                                    switch (i20.ordinal()) {
                                        case 0:
                                            i21 = i44;
                                            i22 = juliet2;
                                            ((Double) value).getClass();
                                            lima2 = 8;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key2);
                                            n.bravo(c0602i3, i20, 2, value2);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 1:
                                            i21 = i44;
                                            i22 = juliet2;
                                            ((Float) value).getClass();
                                            lima2 = 4;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key22);
                                            n.bravo(c0602i3, i20, 2, value22);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 2:
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = C0602i.lima(((Long) value).longValue());
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key222);
                                            n.bravo(c0602i3, i20, 2, value222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 3:
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = C0602i.lima(((Long) value).longValue());
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key2222);
                                            n.bravo(c0602i3, i20, 2, value2222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 4:
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = C0602i.lima(((Integer) value).intValue());
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key22222);
                                            n.bravo(c0602i3, i20, 2, value22222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 5:
                                            i21 = i44;
                                            i22 = juliet2;
                                            ((Long) value).getClass();
                                            lima2 = 8;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key222222);
                                            n.bravo(c0602i3, i20, 2, value222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 6:
                                            i21 = i44;
                                            i22 = juliet2;
                                            ((Integer) value).getClass();
                                            lima2 = 4;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key2222222);
                                            n.bravo(c0602i3, i20, 2, value2222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 7:
                                            i21 = i44;
                                            i22 = juliet2;
                                            ((Boolean) value).getClass();
                                            lima2 = i4;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key22222222);
                                            n.bravo(c0602i3, i20, 2, value22222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 8:
                                            i21 = i44;
                                            i22 = juliet2;
                                            if (value instanceof C0599f) {
                                                size2 = ((C0599f) value).size();
                                                kilo3 = C0602i.kilo(size2);
                                                lima2 = size2 + kilo3;
                                                c0602i3.blue(lima2 + i22 + i21);
                                                Object key222222222 = entry.getKey();
                                                Object value222222222 = entry.getValue();
                                                n.bravo(c0602i3, g2, i4, key222222222);
                                                n.bravo(c0602i3, i20, 2, value222222222);
                                                i31 = 2;
                                                i25 = i42;
                                                i27 = i43;
                                                length = i19;
                                                it = it2;
                                                iArr2 = iArr3;
                                                i4 = 1;
                                            } else {
                                                lima2 = C0602i.india((String) value);
                                                c0602i3.blue(lima2 + i22 + i21);
                                                Object key2222222222 = entry.getKey();
                                                Object value2222222222 = entry.getValue();
                                                n.bravo(c0602i3, g2, i4, key2222222222);
                                                n.bravo(c0602i3, i20, 2, value2222222222);
                                                i31 = 2;
                                                i25 = i42;
                                                i27 = i43;
                                                length = i19;
                                                it = it2;
                                                iArr2 = iArr3;
                                                i4 = 1;
                                            }
                                        case 9:
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = ((s) ((ah) value)).alpha(null);
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key22222222222);
                                            n.bravo(c0602i3, i20, 2, value22222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 10:
                                            i21 = i44;
                                            i22 = juliet2;
                                            size2 = ((s) ((ah) value)).alpha(null);
                                            kilo3 = C0602i.kilo(size2);
                                            lima2 = size2 + kilo3;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key222222222222 = entry.getKey();
                                            Object value222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key222222222222);
                                            n.bravo(c0602i3, i20, 2, value222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 11:
                                            i21 = i44;
                                            i22 = juliet2;
                                            if (value instanceof C0599f) {
                                                size2 = ((C0599f) value).size();
                                                kilo3 = C0602i.kilo(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                kilo3 = C0602i.kilo(size2);
                                            }
                                            lima2 = size2 + kilo3;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key2222222222222 = entry.getKey();
                                            Object value2222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key2222222222222);
                                            n.bravo(c0602i3, i20, 2, value2222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 12:
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = C0602i.kilo(((Integer) value).intValue());
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key22222222222222);
                                            n.bravo(c0602i3, i20, 2, value22222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 13:
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = C0602i.lima(((Integer) value).intValue());
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key222222222222222);
                                            n.bravo(c0602i3, i20, 2, value222222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 14:
                                            ((Integer) value).getClass();
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = 4;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key2222222222222222);
                                            n.bravo(c0602i3, i20, 2, value2222222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 15:
                                            ((Long) value).getClass();
                                            i21 = i44;
                                            i22 = juliet2;
                                            lima2 = 8;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key22222222222222222);
                                            n.bravo(c0602i3, i20, 2, value22222222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            lima2 = C0602i.kilo((intValue >> 31) ^ (intValue << 1));
                                            i21 = i44;
                                            i22 = juliet2;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key222222222222222222);
                                            n.bravo(c0602i3, i20, 2, value222222222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            lima2 = C0602i.lima((longValue << i4) ^ (longValue >> 63));
                                            i21 = i44;
                                            i22 = juliet2;
                                            c0602i3.blue(lima2 + i22 + i21);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            n.bravo(c0602i3, g2, i4, key2222222222222222222);
                                            n.bravo(c0602i3, i20, 2, value2222222222222222222);
                                            i31 = 2;
                                            i25 = i42;
                                            i27 = i43;
                                            length = i19;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i4 = 1;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i19 = length;
                                    ((Float) key).getClass();
                                    lima = 4;
                                    int i442 = lima + juliet;
                                    int juliet22 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 2:
                                    i19 = length;
                                    lima = C0602i.lima(((Long) key).longValue());
                                    int i4422 = lima + juliet;
                                    int juliet222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 3:
                                    i19 = length;
                                    lima = C0602i.lima(((Long) key).longValue());
                                    int i44222 = lima + juliet;
                                    int juliet2222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 4:
                                    i19 = length;
                                    lima = C0602i.lima(((Integer) key).intValue());
                                    int i442222 = lima + juliet;
                                    int juliet22222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 5:
                                    i19 = length;
                                    ((Long) key).getClass();
                                    lima = 8;
                                    int i4422222 = lima + juliet;
                                    int juliet222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 6:
                                    i19 = length;
                                    ((Integer) key).getClass();
                                    lima = 4;
                                    int i44222222 = lima + juliet;
                                    int juliet2222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 7:
                                    i19 = length;
                                    ((Boolean) key).getClass();
                                    lima = i4;
                                    int i442222222 = lima + juliet;
                                    int juliet22222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 8:
                                    i19 = length;
                                    if (key instanceof C0599f) {
                                        size = ((C0599f) key).size();
                                        kilo = C0602i.kilo(size);
                                        lima = size + kilo;
                                        int i4422222222 = lima + juliet;
                                        int juliet222222222 = C0602i.juliet(2);
                                        i20 = abVar.bravo;
                                        if (i20 == h4) {
                                        }
                                        switch (i20.ordinal()) {
                                        }
                                    } else {
                                        lima = C0602i.india((String) key);
                                        int i44222222222 = lima + juliet;
                                        int juliet2222222222 = C0602i.juliet(2);
                                        i20 = abVar.bravo;
                                        if (i20 == h4) {
                                        }
                                        switch (i20.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i19 = length;
                                    alpha = ((s) ((ah) key)).alpha(null);
                                    lima = alpha;
                                    int i442222222222 = lima + juliet;
                                    int juliet22222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 10:
                                    i19 = length;
                                    int alpha2 = ((s) ((ah) key)).alpha(null);
                                    alpha = alpha2 + C0602i.kilo(alpha2);
                                    lima = alpha;
                                    int i4422222222222 = lima + juliet;
                                    int juliet222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 11:
                                    i19 = length;
                                    if (key instanceof C0599f) {
                                        size = ((C0599f) key).size();
                                        kilo = C0602i.kilo(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        kilo = C0602i.kilo(size);
                                    }
                                    lima = size + kilo;
                                    int i44222222222222 = lima + juliet;
                                    int juliet2222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 12:
                                    i19 = length;
                                    lima = C0602i.kilo(((Integer) key).intValue());
                                    int i442222222222222 = lima + juliet;
                                    int juliet22222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 13:
                                    i19 = length;
                                    lima = C0602i.lima(((Integer) key).intValue());
                                    int i4422222222222222 = lima + juliet;
                                    int juliet222222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i19 = length;
                                    lima = 4;
                                    int i44222222222222222 = lima + juliet;
                                    int juliet2222222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i19 = length;
                                    lima = 8;
                                    int i442222222222222222 = lima + juliet;
                                    int juliet22222222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    kilo2 = C0602i.kilo((intValue2 << 1) ^ (intValue2 >> 31));
                                    i19 = length;
                                    lima = kilo2;
                                    int i4422222222222222222 = lima + juliet;
                                    int juliet222222222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    kilo2 = C0602i.lima((longValue2 << i4) ^ (longValue2 >> 63));
                                    i19 = length;
                                    lima = kilo2;
                                    int i44222222222222222222 = lima + juliet;
                                    int juliet2222222222222222222 = C0602i.juliet(2);
                                    i20 = abVar.bravo;
                                    if (i20 == h4) {
                                    }
                                    switch (i20.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i15 = i25;
                    i16 = i27;
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i25 = i15;
                    i27 = i16;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 51:
                    if (ajVar.quebec(i28, i26, obj)) {
                        double doubleValue = ((Double) D.charlie.hotel(j5, obj)).doubleValue();
                        C0602i c0602i4 = (C0602i) aaVar.alpha;
                        c0602i4.getClass();
                        c0602i4.victor(i28, Double.doubleToRawLongBits(doubleValue));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 52:
                    if (ajVar.quebec(i28, i26, obj)) {
                        float floatValue = ((Float) D.charlie.hotel(j5, obj)).floatValue();
                        C0602i c0602i5 = (C0602i) aaVar.alpha;
                        c0602i5.getClass();
                        c0602i5.tango(i28, Float.floatToRawIntBits(floatValue));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 53:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).bronze(i28, amber(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 54:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).bronze(i28, amber(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 55:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).xray(i28, zulu(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 56:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).victor(i28, amber(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 57:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).tango(i28, zulu(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 58:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).quebec(i28, ((Boolean) D.charlie.hotel(j5, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 59:
                    if (ajVar.quebec(i28, i26, obj)) {
                        Object object3 = unsafe.getObject(obj, j5);
                        if (object3 instanceof String) {
                            ((C0602i) aaVar.alpha).amber(i28, (String) object3);
                        } else {
                            ((C0602i) aaVar.alpha).romeo(i28, (C0599f) object3);
                        }
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 60:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).zulu(i28, (ah) unsafe.getObject(obj, j5), ajVar.mike(i26));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 61:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).romeo(i28, (C0599f) unsafe.getObject(obj, j5));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 62:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).black(i28, zulu(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 63:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).xray(i28, zulu(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 64:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).tango(i28, zulu(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 65:
                    if (ajVar.quebec(i28, i26, obj)) {
                        ((C0602i) aaVar.alpha).victor(i28, amber(j5, obj));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 66:
                    if (ajVar.quebec(i28, i26, obj)) {
                        int zulu = zulu(j5, obj);
                        ((C0602i) aaVar.alpha).black(i28, (zulu >> 31) ^ (zulu << 1));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 67:
                    if (ajVar.quebec(i28, i26, obj)) {
                        long amber = amber(j5, obj);
                        ((C0602i) aaVar.alpha).bronze(i28, (amber << i4) ^ (amber >> 63));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                case 68:
                    if (ajVar.quebec(i28, i26, obj)) {
                        aaVar.alpha(i28, unsafe.getObject(obj, j5), ajVar.mike(i26));
                    }
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
                default:
                    iArr = iArr2;
                    i11 = length;
                    i12 = i31;
                    i26 += 3;
                    i23 = i12;
                    length = i11;
                    iArr2 = iArr;
                    i24 = 1048575;
            }
        }
        ((ay) ajVar.lima).getClass();
        ((s) obj).unknownFields.delta(aaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.at.lima(r5.hotel(r7, r12), r5.hotel(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.foxtrot(r7, r12) == r5.foxtrot(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.foxtrot(r7, r12) == r5.foxtrot(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.foxtrot(r7, r12) == r5.foxtrot(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.foxtrot(r7, r12) == r5.foxtrot(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.at.lima(r5.hotel(r7, r12), r5.hotel(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.at.lima(r5.hotel(r7, r12), r5.hotel(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.at.lima(r5.hotel(r7, r12), r5.hotel(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.charlie(r7, r12) == r5.charlie(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.foxtrot(r7, r12) == r5.foxtrot(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.foxtrot(r7, r12) == r5.foxtrot(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.golf(r7, r12) == r5.golf(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.echo(r7, r12)) == java.lang.Float.floatToIntBits(r5.echo(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.delta(r7, r12)) == java.lang.Double.doubleToLongBits(r5.delta(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.at.lima(r9.hotel(r7, r12), r9.hotel(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.as
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hotel(s sVar, s sVar2) {
        int[] iArr = this.alpha;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 < length) {
                int gray = gray(i4);
                long j5 = gray & 1048575;
                switch (gold(gray)) {
                    case 0:
                        if (juliet(sVar, sVar2, i4)) {
                            C c3 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 1:
                        if (juliet(sVar, sVar2, i4)) {
                            C c4 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 2:
                        if (juliet(sVar, sVar2, i4)) {
                            C c10 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 3:
                        if (juliet(sVar, sVar2, i4)) {
                            C c11 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 4:
                        if (juliet(sVar, sVar2, i4)) {
                            C c12 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 5:
                        if (juliet(sVar, sVar2, i4)) {
                            C c13 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 6:
                        if (juliet(sVar, sVar2, i4)) {
                            C c14 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 7:
                        if (juliet(sVar, sVar2, i4)) {
                            C c15 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 8:
                        if (juliet(sVar, sVar2, i4)) {
                            C c16 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 9:
                        if (juliet(sVar, sVar2, i4)) {
                            C c17 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 10:
                        if (juliet(sVar, sVar2, i4)) {
                            C c18 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 11:
                        if (juliet(sVar, sVar2, i4)) {
                            C c19 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 12:
                        if (juliet(sVar, sVar2, i4)) {
                            C c20 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 13:
                        if (juliet(sVar, sVar2, i4)) {
                            C c21 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 14:
                        if (juliet(sVar, sVar2, i4)) {
                            C c22 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 15:
                        if (juliet(sVar, sVar2, i4)) {
                            C c23 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 16:
                        if (juliet(sVar, sVar2, i4)) {
                            C c24 = D.charlie;
                            break;
                        }
                        z2 = false;
                        break;
                    case 17:
                        if (juliet(sVar, sVar2, i4)) {
                            C c25 = D.charlie;
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
                        C c26 = D.charlie;
                        z2 = at.lima(c26.hotel(j5, sVar), c26.hotel(j5, sVar2));
                        break;
                    case 50:
                        C c27 = D.charlie;
                        z2 = at.lima(c27.hotel(j5, sVar), c27.hotel(j5, sVar2));
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
                        C c28 = D.charlie;
                        if (c28.foxtrot(j6, sVar) == c28.foxtrot(j6, sVar2)) {
                            break;
                        }
                        z2 = false;
                        break;
                }
                if (z2) {
                    i4 += 3;
                }
            } else {
                ay ayVar = (ay) this.lima;
                ayVar.getClass();
                ax axVar = sVar.unknownFields;
                ayVar.getClass();
                if (axVar.equals(sVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void india(Object obj, C0601h c0601h, C0604k c0604k) {
        c0604k.getClass();
        if (papa(obj)) {
            romeo(this.lima, obj, c0601h, c0604k);
            return;
        }
        throw new IllegalArgumentException(P0.bronze(obj, "Mutating immutable message: "));
    }

    public final boolean juliet(s sVar, s sVar2, int i4) {
        if (november(i4, sVar) == november(i4, sVar2)) {
            return true;
        }
        return false;
    }

    public final void kilo(int i4, Object obj, Object obj2) {
        int i5 = this.alpha[i4];
        if (D.charlie.hotel(gray(i4) & 1048575, obj) == null) {
            return;
        }
        lima(i4);
    }

    public final void lima(int i4) {
        if (this.bravo[P0.zulu(i4, 3, 2, 1)] == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public final as mike(int i4) {
        int i5 = (i4 / 3) * 2;
        Object[] objArr = this.bravo;
        as asVar = (as) objArr[i5];
        if (asVar != null) {
            return asVar;
        }
        as alpha = ap.charlie.alpha((Class) objArr[i5 + 1]);
        objArr[i5] = alpha;
        return alpha;
    }

    public final boolean november(int i4, Object obj) {
        int i5 = this.alpha[i4 + 2];
        long j5 = i5 & 1048575;
        if (j5 == 1048575) {
            int gray = gray(i4);
            long j6 = gray & 1048575;
            switch (gold(gray)) {
                case 0:
                    if (Double.doubleToRawLongBits(D.charlie.delta(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(D.charlie.echo(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (D.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (D.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (D.charlie.foxtrot(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (D.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (D.charlie.foxtrot(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return D.charlie.charlie(j6, obj);
                case 8:
                    Object hotel = D.charlie.hotel(j6, obj);
                    if (hotel instanceof String) {
                        return !((String) hotel).isEmpty();
                    }
                    if (hotel instanceof C0599f) {
                        return !C0599f.red.equals(hotel);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (D.charlie.hotel(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0599f.red.equals(D.charlie.hotel(j6, obj));
                case 11:
                    if (D.charlie.foxtrot(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (D.charlie.foxtrot(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (D.charlie.foxtrot(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (D.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (D.charlie.foxtrot(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (D.charlie.golf(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (D.charlie.hotel(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & D.charlie.foxtrot(j5, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean oscar(Object obj, int i4, int i5, int i10, int i11) {
        if (i5 == 1048575) {
            return november(i4, obj);
        }
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public final boolean quebec(int i4, int i5, Object obj) {
        if (D.charlie.foxtrot(this.alpha[i5 + 2] & 1048575, obj) == i4) {
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
    public final void romeo(androidx.datastore.preferences.protobuf.aw r19, java.lang.Object r20, androidx.datastore.preferences.protobuf.C0601h r21, androidx.datastore.preferences.protobuf.C0604k r22) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.aj.romeo(androidx.datastore.preferences.protobuf.aw, java.lang.Object, androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.k):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        r0.hotel(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sierra(Object obj, int i4, Object obj2, C0604k c0604k, C0601h c0601h) {
        long gray = gray(i4) & 1048575;
        Object hotel = D.charlie.hotel(gray, obj);
        ae aeVar = this.mike;
        if (hotel == null) {
            aeVar.getClass();
            hotel = ad.purple.bravo();
            D.oscar(obj, gray, hotel);
        } else {
            aeVar.getClass();
            if (!((ad) hotel).alpha) {
                ad bravo = ad.purple.bravo();
                ae.alpha(bravo, hotel);
                D.oscar(obj, gray, bravo);
                hotel = bravo;
            }
        }
        aeVar.getClass();
        ad adVar = (ad) hotel;
        ab abVar = ((ac) obj2).alpha;
        c0601h.whiskey(2);
        Pf.g gVar = c0601h.alpha;
        int india = gVar.india(gVar.zulu());
        Object obj3 = "";
        F1.g gVar2 = abVar.charlie;
        Object obj4 = gVar2;
        while (true) {
            try {
                int alpha = c0601h.alpha();
                if (alpha == Integer.MAX_VALUE || gVar.charlie()) {
                    break;
                }
                if (alpha != 1) {
                    if (alpha != 2) {
                        try {
                            if (!c0601h.xray()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!c0601h.xray()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj4 = c0601h.india(abVar.bravo, gVar2.getClass(), c0604k);
                    }
                } else {
                    obj3 = c0601h.india(abVar.alpha, null, null);
                }
            } catch (Throwable th) {
                gVar.hotel(india);
                throw th;
            }
        }
    }

    public final void tango(int i4, Object obj, Object obj2) {
        if (!november(i4, obj2)) {
            return;
        }
        long gray = gray(i4) & 1048575;
        Unsafe unsafe = oscar;
        Object object = unsafe.getObject(obj2, gray);
        if (object != null) {
            as mike = mike(i4);
            if (!november(i4, obj)) {
                if (!papa(object)) {
                    unsafe.putObject(obj, gray, object);
                } else {
                    s charlie = mike.charlie();
                    mike.delta(charlie, object);
                    unsafe.putObject(obj, gray, charlie);
                }
                crimson(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, gray);
            if (!papa(object2)) {
                s charlie2 = mike.charlie();
                mike.delta(charlie2, object2);
                unsafe.putObject(obj, gray, charlie2);
                object2 = charlie2;
            }
            mike.delta(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.alpha[i4] + " is present but null: " + obj2);
    }

    public final void uniform(int i4, Object obj, Object obj2) {
        int[] iArr = this.alpha;
        int i5 = iArr[i4];
        if (!quebec(i5, i4, obj2)) {
            return;
        }
        long gray = gray(i4) & 1048575;
        Unsafe unsafe = oscar;
        Object object = unsafe.getObject(obj2, gray);
        if (object != null) {
            as mike = mike(i4);
            if (!quebec(i5, i4, obj)) {
                if (!papa(object)) {
                    unsafe.putObject(obj, gray, object);
                } else {
                    s charlie = mike.charlie();
                    mike.delta(charlie, object);
                    unsafe.putObject(obj, gray, charlie);
                }
                cyan(i5, i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, gray);
            if (!papa(object2)) {
                s charlie2 = mike.charlie();
                mike.delta(charlie2, object2);
                unsafe.putObject(obj, gray, charlie2);
                object2 = charlie2;
            }
            mike.delta(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2);
    }

    public final Object victor(int i4, Object obj) {
        as mike = mike(i4);
        long gray = gray(i4) & 1048575;
        if (!november(i4, obj)) {
            return mike.charlie();
        }
        Object object = oscar.getObject(obj, gray);
        if (papa(object)) {
            return object;
        }
        s charlie = mike.charlie();
        if (object != null) {
            mike.delta(charlie, object);
        }
        return charlie;
    }

    public final Object whiskey(int i4, int i5, Object obj) {
        as mike = mike(i5);
        if (!quebec(i4, i5, obj)) {
            return mike.charlie();
        }
        Object object = oscar.getObject(obj, gray(i5) & 1048575);
        if (papa(object)) {
            return object;
        }
        s charlie = mike.charlie();
        if (object != null) {
            mike.delta(charlie, object);
        }
        return charlie;
    }
}
