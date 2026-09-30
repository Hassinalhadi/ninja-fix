package com.google.android.gms.measurement.internal;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.internal.measurement.C1302c3;
import com.google.android.gms.internal.measurement.C1312e3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C1469t implements aa, G6.c, T5.m {
    public static final /* synthetic */ C1469t purple = new C1469t(13);
    public static final /* synthetic */ C1469t red = new C1469t(14);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1469t(int i4) {
        this.alpha = i4;
    }

    public static RectF alpha(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.f8155x && (view instanceof k7.j)) {
            k7.j jVar = (k7.j) view;
            int contentWidth = jVar.getContentWidth();
            int contentHeight = jVar.getContentHeight();
            int delta = (int) com.google.android.material.internal.z.delta(24, jVar.getContext());
            if (contentWidth < delta) {
                contentWidth = delta;
            }
            int right = (jVar.getRight() + jVar.getLeft()) / 2;
            int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
            int i4 = contentWidth / 2;
            return new RectF(right - i4, bottom - (contentHeight / 2), i4 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Path bravo(float f5, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f5, f10);
        path.lineTo(f11, f12);
        return path;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        p6.q qVar = (p6.q) obj;
        if (qVar.black(com.google.android.gms.location.n.delta)) {
            p6.ab abVar = (p6.ab) qVar.tango();
            p6.l lVar = new p6.l(Boolean.TRUE, hVar);
            Parcel ivory = abVar.ivory();
            int i4 = p6.e.alpha;
            ivory.writeInt(0);
            ivory.writeStrongBinder(lVar);
            abVar.lavender(ivory, 84);
            return;
        }
        p6.ab abVar2 = (p6.ab) qVar.tango();
        Parcel ivory2 = abVar2.ivory();
        int i5 = p6.e.alpha;
        ivory2.writeInt(0);
        abVar2.lavender(ivory2, 12);
        hVar.bravo(Boolean.TRUE);
    }

    public void charlie(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable) {
        RectF alpha = alpha(tabLayout, view);
        RectF alpha2 = alpha(tabLayout, view2);
        drawable.setBounds(M6.a.charlie((int) alpha.left, (int) alpha2.left, f5), drawable.getBounds().top, M6.a.charlie((int) alpha.right, (int) alpha2.right, f5), drawable.getBounds().bottom);
    }

    @Override // G6.c
    public /* synthetic */ Object ivory(Task task) {
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 0:
                List list = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.xray.bravo();
                l10.getClass();
                return l10;
            case 1:
                Boolean bool = (Boolean) w3.alpha.bravo();
                bool.getClass();
                return bool;
            case 2:
                List list2 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.bronze.bravo();
                l11.getClass();
                return l11;
            case 3:
                List list3 = ac.alpha;
                C1302c3.purple.get();
                return Integer.valueOf((int) ((Long) C1312e3.delta.bravo()).longValue());
            case 4:
                List list4 = ac.alpha;
                C1362p2.purple.get();
                Long l12 = (Long) C1369r2.plum.bravo();
                l12.getClass();
                return l12;
            case 5:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.olive.bravo();
            case 6:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.white.bravo()).longValue());
            default:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                Boolean bool2 = (Boolean) C1369r2.amber.bravo();
                bool2.getClass();
                return bool2;
        }
    }

    public C1469t(int i4, int i5) {
        this.alpha = 10;
    }
}
