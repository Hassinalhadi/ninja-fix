package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.J2;
import i6.InterfaceC1892a;
import i6.InterfaceC1893b;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1477x implements aa, p7.l, InterfaceC1893b {
    public static C1477x purple;
    public static final /* synthetic */ C1477x red = new C1477x(13);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1477x(int i4) {
        this.alpha = i4;
    }

    public static final p3.ab charlie() {
        WeakReference weakReference = p3.ab.crimson;
        if (weakReference != null) {
            return (p3.ab) weakReference.get();
        }
        return null;
    }

    @Override // i6.InterfaceC1893b
    public H3.e alpha(Context context, String str, InterfaceC1892a interfaceC1892a) {
        H3.e eVar = new H3.e();
        eVar.alpha = interfaceC1892a.charlie(context, str);
        int i4 = 1;
        int bravo = interfaceC1892a.bravo(context, str, true);
        eVar.bravo = bravo;
        int i5 = eVar.alpha;
        if (i5 == 0) {
            i5 = 0;
            if (bravo == 0) {
                i4 = 0;
                eVar.charlie = i4;
                return eVar;
            }
        }
        if (i5 >= bravo) {
            i4 = -1;
        }
        eVar.charlie = i4;
        return eVar;
    }

    @Override // p7.m
    public Object bravo() {
        return new C1475w(7);
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 0:
                List list = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.red.bravo();
                l10.getClass();
                return l10;
            case 1:
                List list2 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.mike.bravo()).longValue());
            case 2:
                List list3 = ac.alpha;
                Boolean bool = (Boolean) J2.alpha.bravo();
                bool.getClass();
                return bool;
            case 3:
                List list4 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.oscar.bravo()).longValue());
            case 4:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.november.bravo()).longValue());
            case 5:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.juliet.bravo();
            default:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.uniform.bravo()).longValue());
        }
    }

    public C1477x(E5.j jVar) {
        this.alpha = 7;
    }

    public C1477x(ImageView internalImage, FrameLayout internalImageContainer) {
        this.alpha = 15;
        Intrinsics.foxtrot(internalImage, "internalImage");
        Intrinsics.foxtrot(internalImageContainer, "internalImageContainer");
    }
}
