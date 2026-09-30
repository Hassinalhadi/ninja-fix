package com.fingerprintjs.android.fpjs_pro_internal;

import android.net.Uri;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.T0;
import com.fingerprintjs.android.fpjs_pro_internal.getRightG17489;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class E17257D21259 implements cf {
    public static int papa = 0;
    public static int quebec = 1;
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final String foxtrot;
    public final Function1 golf;
    public final Map hotel;
    public final String india;
    public final String juliet;
    public final boolean kilo;
    public final List lima;
    public final String mike;
    public final T0.b november = T0.b.alpha;
    public final Map oscar = kotlin.collections.y.romeo(new Pair(P28427.D4.echo.vD14832N6715(), P28427.ag.echo.vD14832N6715()));

    public E17257D21259(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull Function1<? super ca, ? extends List<? extends gF31878<? extends Object>>> function1, @NotNull Map<String, ? extends Object> map, @NotNull String str7, @Nullable String str8, boolean z2, @NotNull List<Pair<String, String>> list, @NotNull String str9) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = str4;
        this.echo = str5;
        this.foxtrot = str6;
        this.golf = function1;
        this.hotel = map;
        this.india = str7;
        this.juliet = str8;
        this.kilo = z2;
        this.lima = list;
        this.mike = str9;
    }

    public static Object bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i13;
        int i15 = ~i5;
        int i16 = (~((~i4) | i15)) | i14;
        int i17 = i13 | i15;
        int i18 = (~(i4 | i14 | i15)) | (~(i5 | i13));
        int i19 = ((-895483904) * i10) + ((-243269632) * i12) + ((-1205862400) * i11) + (1605645861 * i18) + (1083675574 * i17) + (i16 * 1605645861) + (2005429323 * i13) + ((1483459036 * i5) - 1284505600);
        int papa2 = AbstractC2327c.papa(i10, -609071723, (2049387148 * i12) + i5 + i13 + i11);
        int i20 = i18 * 933;
        int i21 = i11 * 335896449;
        int i22 = i12 * (-616405876);
        int i23 = i10 * 126640917;
        int quebec2 = AbstractC2327c.quebec(papa2, 2020605952, i23 + i22 + i21 + i20 + (i17 * (-1866)) + (i16 * 933) + (i13 * 335898315) + ((i5 * 335895516) - 1139737737), -544210944, ((-1334837248) * papa2) + i19);
        if (quebec2 != 1) {
            if (quebec2 != 2) {
                E17257D21259 e17257d21259 = (E17257D21259) objArr[0];
                int i24 = quebec;
                int i25 = (i24 & 65) + (i24 | 65);
                papa = i25 % 128;
                if (i25 % 2 == 0) {
                    T0.b bVar = (T0.b) bravo(new Object[]{e17257d21259}, getRightG17489.g.D8871(), 1259382195, getRightG17489.g.D8871(), getRightG17489.g.D8871(), getRightG17489.g.D8871(), -1259382193);
                    int i26 = quebec;
                    int i27 = ((i26 | 115) << 1) - (i26 ^ 115);
                    papa = i27 % 128;
                    if (i27 % 2 == 0) {
                        return bVar;
                    }
                    throw null;
                }
                throw null;
            }
            E17257D21259 e17257d212592 = (E17257D21259) objArr[0];
            int i28 = papa;
            quebec = ((i28 ^ 19) + ((i28 & 19) << 1)) % 128;
            T0.b bVar2 = e17257d212592.november;
            int i29 = i28 + 75;
            quebec = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 42 / 0;
            }
            return bVar2;
        }
        E17257D21259 e17257d212593 = (E17257D21259) objArr[0];
        papa = (quebec + 57) % 128;
        e17257d212593.getClass();
        int i31 = papa;
        quebec = ((i31 ^ 89) + ((i31 & 89) << 1)) % 128;
        Uri parse = Uri.parse(e17257d212593.alpha);
        Intrinsics.checkNotNull(parse);
        Uri.Builder buildUpon = parse.buildUpon();
        Intrinsics.checkNotNull(buildUpon);
        String vD14832N6715 = P28427.ak.echo.vD14832N6715();
        Y0 y02 = Y0.alpha;
        buildUpon.appendQueryParameter(vD14832N6715, Y0.alpha(e17257d212593.india));
        buildUpon.appendQueryParameter(P28427.B1.echo.vD14832N6715(), e17257d212593.bravo);
        Iterator it = e17257d212593.lima.iterator();
        int i32 = papa;
        int i33 = (i32 | 45) << 1;
        int i34 = i32 ^ 45;
        while (true) {
            quebec = (i33 - i34) % 128;
            if (!it.hasNext()) {
                break;
            }
            quebec = (papa + 19) % 128;
            Pair pair = (Pair) it.next();
            buildUpon.appendQueryParameter(P28427.C1137t0.echo.vD14832N6715(), pair.getFirst() + "/" + pair.getSecond());
            int i35 = papa;
            i33 = (i35 | 41) << 1;
            i34 = i35 ^ 41;
        }
        String obj = buildUpon.build().toString();
        int i36 = quebec;
        int i37 = ((i36 | 65) << 1) - (i36 ^ 65);
        papa = i37 % 128;
        if (i37 % 2 != 0) {
            int i38 = 29 / 0;
        }
        return obj;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    public final Map D8871() {
        int i4 = quebec + 41;
        papa = i4 % 128;
        if (i4 % 2 == 0) {
            return this.oscar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01c4, code lost:
    
        if (r7.length() == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01ce, code lost:
    
        r4.put(com.fingerprintjs.android.fpjs_pro_internal.AbstractC1237n.bravo(com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9(), com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9(), -1110570877, com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9(), 1110570879, com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9()), kotlin.collections.y.sierra(new kotlin.Pair(r6.vD14832N6715(), 0), new kotlin.Pair(r5.vD14832N6715(), r7)));
        r7 = com.fingerprintjs.android.fpjs_pro_internal.E17257D21259.papa;
        com.fingerprintjs.android.fpjs_pro_internal.E17257D21259.quebec = ((r7 ^ 91) + ((r7 & 91) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0260, code lost:
    
        if (r7.length() == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x026a, code lost:
    
        r4.put(com.fingerprintjs.android.fpjs_pro_internal.AbstractC1237n.bravo(com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9(), com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9(), -1001534988, com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9(), 1001534992, com.fingerprintjs.android.fpjs_pro_internal.yY18494.component9()), kotlin.collections.y.sierra(new kotlin.Pair(r6.vD14832N6715(), 0), new kotlin.Pair(r5.vD14832N6715(), r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0267, code lost:
    
        if (r7.length() == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cb, code lost:
    
        if (r7.length() == 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map alpha(ca caVar) {
        boolean z2;
        String str;
        String str2;
        int i4;
        String str3;
        Map map;
        Iterator it;
        int i5;
        HashMap hashMap = new HashMap();
        P28427.C1065i5 c1065i5 = P28427.C1065i5.echo;
        String vD14832N6715 = c1065i5.vD14832N6715();
        String bravo = AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), 303595368, yY18494.component9(), -303595365, yY18494.component9());
        String str4 = "";
        String str5 = this.foxtrot;
        if (str5 == null) {
            str5 = "";
        }
        Pair pair = new Pair(bravo, str5);
        int i10 = AbstractC1237n.quebec + 27;
        AbstractC1237n.papa = i10 % 128;
        if (i10 % 2 == 0) {
            Pair pair2 = new Pair(vD14832N6715, kotlin.collections.y.sierra(pair, new Pair(AbstractC1237n.kilo, P28427.a6.echo.vD14832N6715())));
            P28427.E1 e12 = P28427.E1.echo;
            Map sierra = kotlin.collections.y.sierra(pair2, new Pair(e12.vD14832N6715(), 0));
            hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), -694947039, yY18494.component9(), 694947039, yY18494.component9()), this.bravo);
            String bravo2 = AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), -1299482257, yY18494.component9(), 1299482258, yY18494.component9());
            String str6 = this.juliet;
            if (str6 == null) {
                int i11 = quebec;
                int i12 = (i11 ^ 65) + ((i11 & 65) << 1);
                papa = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } else {
                str4 = str6;
            }
            hashMap.put(bravo2, str4);
            int i13 = AbstractC1237n.papa;
            int i14 = ((i13 ^ 69) + ((i13 & 69) << 1)) % 128;
            AbstractC1237n.quebec = i14;
            AbstractC1237n.papa = ((i14 & 79) + (i14 | 79)) % 128;
            hashMap.put(AbstractC1237n.golf, sierra);
            String str7 = this.charlie;
            if (str7 != null) {
                int i15 = quebec + 69;
                papa = i15 % 128;
                if (i15 % 2 == 0) {
                    if (str7.length() != 0) {
                        z2 = false;
                        if (!z2) {
                            int i16 = papa + 29;
                            quebec = i16 % 128;
                            if (i16 % 2 != 0) {
                                hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), 1877528160, yY18494.component9(), -1877528154, yY18494.component9()), kotlin.collections.y.romeo(new Pair(e12.vD14832N6715(), -1)));
                                papa = (quebec + 35) % 128;
                            } else {
                                hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), 1877528160, yY18494.component9(), -1877528154, yY18494.component9()), kotlin.collections.y.romeo(new Pair(e12.vD14832N6715(), -1)));
                                throw null;
                            }
                        } else {
                            hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), 1877528160, yY18494.component9(), -1877528154, yY18494.component9()), kotlin.collections.y.sierra(new Pair(e12.vD14832N6715(), 0), new Pair(c1065i5.vD14832N6715(), str7)));
                        }
                        str = this.delta;
                        if (str != null) {
                            int i17 = papa + 89;
                            quebec = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 83 / 0;
                            }
                            str2 = this.echo;
                            if (str2 != null) {
                                int i19 = papa;
                                int i20 = (i19 ^ 119) + ((i19 & 119) << 1);
                                quebec = i20 % 128;
                                if (i20 % 2 == 0) {
                                    int i21 = 35 / 0;
                                }
                                if (this.kilo) {
                                    int i22 = AbstractC1237n.papa;
                                    int i23 = i22 + 37;
                                    AbstractC1237n.quebec = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        int i24 = ((i22 | 111) << 1) - (i22 ^ 111);
                                        AbstractC1237n.quebec = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            hashMap.put(AbstractC1237n.hotel, 1);
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                                str3 = this.mike;
                                if (str3.length() <= 0) {
                                    int i25 = quebec;
                                    int i26 = ((i25 | 67) << 1) - (i25 ^ 67);
                                    papa = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        hashMap.put(AbstractC1237n.charlie(), str3);
                                    } else {
                                        hashMap.put(AbstractC1237n.charlie(), str3);
                                        throw null;
                                    }
                                } else {
                                    quebec = (papa + 49) % 128;
                                }
                                map = this.hotel;
                                if (!map.isEmpty()) {
                                    int i27 = papa;
                                    quebec = (((i27 | 11) << 1) - (i27 ^ 11)) % 128;
                                    int i28 = AbstractC1237n.quebec;
                                    int i29 = (((i28 | 109) << 1) - (i28 ^ 109)) % 128;
                                    AbstractC1237n.papa = i29;
                                    AbstractC1237n.quebec = ((i29 ^ 121) + ((i29 & 121) << 1)) % 128;
                                    hashMap.put(AbstractC1237n.bravo, map);
                                }
                                it = ((Iterable) this.golf.invoke(caVar)).iterator();
                                while (it.hasNext()) {
                                    int i30 = papa;
                                    int i31 = ((i30 | 25) << 1) - (i30 ^ 25);
                                    quebec = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        gF31878 gf31878 = (gF31878) it.next();
                                        hashMap.put(gf31878.alpha(), gf31878.bravo());
                                    } else {
                                        gF31878 gf318782 = (gF31878) it.next();
                                        hashMap.put(gf318782.alpha(), gf318782.bravo());
                                        throw null;
                                    }
                                }
                                int i32 = quebec;
                                i5 = ((i32 | 41) << 1) - (i32 ^ 41);
                                papa = i5 % 128;
                                if (i5 % 2 != 0) {
                                    return hashMap;
                                }
                                throw null;
                            }
                            int i33 = papa;
                            i4 = ((i33 | 31) << 1) - (i33 ^ 31);
                            quebec = i4 % 128;
                            if (i4 % 2 != 0) {
                                hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), -1001534988, yY18494.component9(), 1001534992, yY18494.component9()), kotlin.collections.y.romeo(new Pair(e12.vD14832N6715(), -1)));
                                if (this.kilo) {
                                }
                                str3 = this.mike;
                                if (str3.length() <= 0) {
                                }
                                map = this.hotel;
                                if (!map.isEmpty()) {
                                }
                                it = ((Iterable) this.golf.invoke(caVar)).iterator();
                                while (it.hasNext()) {
                                }
                                int i322 = quebec;
                                i5 = ((i322 | 41) << 1) - (i322 ^ 41);
                                papa = i5 % 128;
                                if (i5 % 2 != 0) {
                                }
                            } else {
                                hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), -1001534988, yY18494.component9(), 1001534992, yY18494.component9()), kotlin.collections.y.romeo(new Pair(e12.vD14832N6715(), -1)));
                                throw null;
                            }
                        }
                        hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), -1110570877, yY18494.component9(), 1110570879, yY18494.component9()), kotlin.collections.y.romeo(new Pair(e12.vD14832N6715(), -1)));
                        str2 = this.echo;
                        if (str2 != null) {
                        }
                        int i332 = papa;
                        i4 = ((i332 | 31) << 1) - (i332 ^ 31);
                        quebec = i4 % 128;
                        if (i4 % 2 != 0) {
                        }
                    }
                } else {
                    throw null;
                }
            }
            z2 = true;
            if (!z2) {
            }
            str = this.delta;
            if (str != null) {
            }
            hashMap.put(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), -1110570877, yY18494.component9(), 1110570879, yY18494.component9()), kotlin.collections.y.romeo(new Pair(e12.vD14832N6715(), -1)));
            str2 = this.echo;
            if (str2 != null) {
            }
            int i3322 = papa;
            i4 = ((i3322 | 31) << 1) - (i3322 ^ 31);
            quebec = i4 % 128;
            if (i4 % 2 != 0) {
            }
        } else {
            throw null;
        }
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    public final String component5() {
        return (String) bravo(new Object[]{this}, getRightG17489.g.D8871(), -326160366, getRightG17489.g.D8871(), getRightG17489.g.D8871(), getRightG17489.g.D8871(), 326160367);
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    public final /* synthetic */ T0 setPivotYN16904() {
        return (T0) bravo(new Object[]{this}, getRightG17489.g.D8871(), 1659724203, getRightG17489.g.D8871(), getRightG17489.g.D8871(), getRightG17489.g.D8871(), -1659724203);
    }
}
