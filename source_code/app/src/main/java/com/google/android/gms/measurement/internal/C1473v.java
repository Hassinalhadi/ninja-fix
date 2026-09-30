package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.C1302c3;
import com.google.android.gms.internal.measurement.C1312e3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.C1393x2;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import ge.InterfaceC1772d;
import i6.InterfaceC1892a;
import i6.InterfaceC1893b;
import j2.InterfaceC1935b;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ne.C2180d;
import ne.EnumC2181e;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1473v implements aa, OnFailureListener, InterfaceC1893b, InterfaceC1935b, G6.c, com.google.android.gms.location.i {
    public static final /* synthetic */ C1473v purple = new C1473v(13);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1473v(int i4) {
        this.alpha = i4;
    }

    public static void bravo(C1473v c1473v, InterfaceC1772d kClass) {
        List typeArgumentsSerializers = CollectionsKt.emptyList();
        c1473v.getClass();
        Intrinsics.echo(kClass, "kClass");
        Intrinsics.echo(typeArgumentsSerializers, "typeArgumentsSerializers");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2180d delta(String str, Ne.c packageFqName) {
        EnumC2181e enumC2181e;
        Integer valueOf;
        Intrinsics.echo(packageFqName, "packageFqName");
        EnumC2181e[] values = EnumC2181e.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                enumC2181e = values[i4];
                if (Intrinsics.areEqual(enumC2181e.alpha, packageFqName) && kotlin.text.r.quebec(str, enumC2181e.purple, false)) {
                    break;
                }
                i4++;
            } else {
                enumC2181e = null;
                break;
            }
        }
        if (enumC2181e != null) {
            String substring = str.substring(enumC2181e.purple.length());
            Intrinsics.delta(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() != 0) {
                int length2 = substring.length();
                int i5 = 0;
                for (int i10 = 0; i10 < length2; i10++) {
                    int charAt = substring.charAt(i10) - '0';
                    if (charAt >= 0 && charAt < 10) {
                        i5 = (i5 * 10) + charAt;
                    }
                }
                valueOf = Integer.valueOf(i5);
                if (valueOf != null) {
                    return new C2180d(enumC2181e, valueOf.intValue());
                }
            }
            valueOf = null;
            if (valueOf != null) {
            }
        }
        return null;
    }

    @Override // i6.InterfaceC1893b
    public H3.e alpha(Context context, String str, InterfaceC1892a interfaceC1892a) {
        H3.e eVar = new H3.e();
        int bravo = interfaceC1892a.bravo(context, str, true);
        eVar.bravo = bravo;
        if (bravo != 0) {
            eVar.charlie = 1;
            return eVar;
        }
        int charlie = interfaceC1892a.charlie(context, str);
        eVar.alpha = charlie;
        if (charlie != 0) {
            eVar.charlie = -1;
        }
        return eVar;
    }

    @Override // j2.InterfaceC1935b
    public void charlie(int i4, Serializable serializable) {
    }

    @Override // G6.c
    public /* synthetic */ Object ivory(Task task) {
        return null;
    }

    @Override // j2.InterfaceC1935b
    public void lima() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 0:
                List list = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.lime.bravo();
                l10.getClass();
                return l10;
            case 1:
                List list2 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.e.bravo();
                l11.getClass();
                return l11;
            case 2:
                List list3 = ac.alpha;
                C1302c3.purple.get();
                return (String) C1312e3.foxtrot.bravo();
            case 3:
                List list4 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.quebec.bravo()).longValue());
            case 4:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.foxtrot.bravo();
            case 5:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.azure.bravo();
            case 6:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.magenta.bravo()).longValue());
            default:
                List list8 = ac.alpha;
                Boolean bool = (Boolean) C1393x2.bravo.bravo();
                bool.getClass();
                return bool;
        }
    }
}
