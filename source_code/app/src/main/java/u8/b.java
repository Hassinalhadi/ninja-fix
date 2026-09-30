package u8;

import G6.g;
import I7.e;
import K0.c;
import K1.z;
import R3.i;
import android.content.Context;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import av.InterfaceC0684d;
import com.bumptech.glide.load.engine.v;
import com.google.android.gms.internal.measurement.C1346l2;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.C1393x2;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.InterfaceC1438d;
import com.google.android.gms.measurement.internal.aa;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.tasks.Task;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import s6.V4;

/* loaded from: classes2.dex */
public final class b implements c, g, R3.g, e, T1.b, InterfaceC0684d, Z3.a, InterfaceC1438d, aa {
    public static b purple;
    public static volatile b red;
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (kotlin.text.StringsKt.gray(r5) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r4.equals("order") == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return W9.e.teal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        if (r4.equals("new_order") == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
    
        if (r4.equals("tickets") == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return W9.e.f2195b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
    
        if (r4.equals("allocationwindow") == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        if (r4.equals("support") == false) goto L95;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00c3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static W9.e foxtrot(String str, String str2) {
        String str3;
        int length;
        W9.e eVar;
        int i4;
        Object obj;
        String str4;
        int i5 = 0;
        if (r.hotel(str, "chat", true)) {
            return W9.e.f2195b;
        }
        String str5 = null;
        if (str2 != null && !StringsKt.gray(str2)) {
            try {
                str3 = Uri.parse(str2).getQueryParameter("screen");
                if (str3 != null) {
                }
            } catch (Exception unused) {
            }
            try {
                int emerald = StringsKt.emerald(str2, '?', 0, 6);
                Integer valueOf = Integer.valueOf(emerald);
                if (emerald < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i4 = valueOf.intValue();
                } else {
                    i4 = 0;
                }
                if (i4 > 0) {
                    str2 = str2.substring(i4 + 1);
                    Intrinsics.delta(str2, "substring(...)");
                }
                Iterator it = StringsKt.navy(str2, new char[]{'&'}).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        String str6 = (String) obj;
                        if (StringsKt.beige(str6, "=", false) && StringsKt.silver(str6, "=").equalsIgnoreCase("screen")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                String str7 = (String) obj;
                if (str7 != null) {
                    str4 = URLDecoder.decode(StringsKt.pink('=', str7, str7), StandardCharsets.UTF_8.name());
                } else {
                    str4 = null;
                }
                str3 = str4;
            } catch (Exception unused2) {
            }
            W9.e[] values = W9.e.values();
            length = values.length;
            while (true) {
                if (i5 < length) {
                    eVar = values[i5];
                    String str8 = eVar.alpha;
                    if (str8 != null && str8.equalsIgnoreCase(str3)) {
                        break;
                    }
                    i5++;
                } else {
                    eVar = null;
                    break;
                }
            }
            if (eVar != null) {
                if (str != null) {
                    str5 = str.toLowerCase(Locale.ROOT);
                    Intrinsics.delta(str5, "toLowerCase(...)");
                }
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -1854767153:
                            break;
                        case -1853487920:
                            break;
                        case -1590110411:
                            if (str5.equals("envelop")) {
                                return W9.e.white;
                            }
                            break;
                        case -1322977561:
                            break;
                        case -940242166:
                            if (str5.equals("withdraw")) {
                                return W9.e.yellow;
                            }
                            break;
                        case -903338959:
                            if (str5.equals("shifts")) {
                                return W9.e.f2196c;
                            }
                            break;
                        case -256779281:
                            break;
                        case 93921311:
                            if (str5.equals("bonus")) {
                                return W9.e.f2194a;
                            }
                            break;
                        case 106006350:
                            break;
                        case 1152706235:
                            if (str5.equals("points_home")) {
                                return W9.e.f2197d;
                            }
                            break;
                    }
                }
                return W9.e.f2198f;
            }
            return eVar;
        }
        str3 = null;
        W9.e[] values2 = W9.e.values();
        length = values2.length;
        while (true) {
            if (i5 < length) {
            }
            i5++;
        }
        if (eVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean golf(L1.b bVar, Editable editable, int i4, int i5, boolean z2) {
        int min;
        if (editable != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z2) {
                    int max = Math.max(i4, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z10) {
                                        selectionStart = 0;
                                    }
                                } else {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z10) {
                                        break;
                                    }
                                    if (Character.isSurrogate(charAt)) {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z10 = true;
                                    } else {
                                        max--;
                                    }
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i5, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z11) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z11 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i4, 0);
                    min = Math.min(selectionEnd + i5, editable.length());
                }
                z[] zVarArr = (z[]) editable.getSpans(selectionStart, min, z.class);
                if (zVarArr != null && zVarArr.length > 0) {
                    for (z zVar : zVarArr) {
                        int spanStart = editable.getSpanStart(zVar);
                        int spanEnd = editable.getSpanEnd(zVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // R3.g
    public void alpha(i iVar) {
        iVar.charlie();
    }

    @Override // av.InterfaceC0684d
    public CamcorderProfile bravo(int i4, int i5) {
        return CamcorderProfile.get(i4, i5);
    }

    @Override // R3.g
    public void charlie(i iVar) {
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        return new com.google.mlkit.common.sdkinternal.b(0);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1438d
    public String d(String str, String str2) {
        return null;
    }

    @Override // K0.c
    public K0.b delta() {
        return new K0.b(ab.juliet(new K0.a(Locale.getDefault())));
    }

    @Override // K0.c
    public Locale echo(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (Intrinsics.areEqual(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    @Override // av.InterfaceC0684d
    public boolean india(int i4, int i5) {
        return CamcorderProfile.hasProfile(i4, i5);
    }

    @Override // Z3.a
    public Object kilo() {
        return new v();
    }

    @Override // G6.g
    public Task then(Object obj) {
        return V4.echo(Boolean.TRUE);
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 20:
                List list = ac.alpha;
                Boolean bool = (Boolean) I3.alpha.bravo();
                bool.getClass();
                return bool;
            case 21:
                List list2 = ac.alpha;
                x3.purple.get();
                Boolean bool2 = (Boolean) z3.charlie.bravo();
                bool2.getClass();
                return bool2;
            case 22:
                List list3 = ac.alpha;
                x3.purple.get();
                Boolean bool3 = (Boolean) z3.alpha.bravo();
                bool3.getClass();
                return bool3;
            case 23:
                List list4 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.f6687c.bravo()).longValue());
            case 24:
                Boolean bool4 = (Boolean) C1393x2.charlie.bravo();
                bool4.getClass();
                return bool4;
            case 25:
                Boolean bool5 = (Boolean) C1346l2.bravo.bravo();
                bool5.getClass();
                return bool5;
            case 26:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.papa.bravo()).longValue());
            case 27:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.lavender.bravo();
                l10.getClass();
                return l10;
            case 28:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.ivory.bravo();
                l11.getClass();
                return l11;
            default:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                Long l12 = (Long) C1369r2.silver.bravo();
                l12.getClass();
                return l12;
        }
    }

    public b(Context context, S7.a aVar) {
        this.alpha = 17;
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new bq.a(0, this));
    }
}
