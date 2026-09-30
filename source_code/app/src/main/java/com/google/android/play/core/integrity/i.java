package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1467s;
import com.google.android.gms.measurement.internal.C1469t;
import java.util.ArrayList;
import p7.C2285b;
import p7.t;
import s6.AbstractC2717m7;

/* loaded from: classes2.dex */
public final class i {
    public final t alpha;
    public final String bravo;
    public final G6.h charlie;
    public final C1469t delta;
    public final C2285b echo;

    public i(Context context, t tVar, C1469t c1469t) {
        G6.h hVar = new G6.h();
        this.charlie = hVar;
        this.bravo = context.getPackageName();
        this.alpha = tVar;
        this.delta = c1469t;
        C2285b c2285b = new C2285b(context, tVar, j.alpha, new C1467s(8));
        this.echo = c2285b;
        c2285b.alpha().post(new d(this, hVar, context));
    }

    public static Bundle alpha(i iVar, p pVar, long j5) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", iVar.bravo);
        bundle.putLong("cloud.prj", 244414812773L);
        bundle.putString("nonce", pVar.alpha);
        bundle.putLong("warm.up.sid", j5);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(pVar.bravo));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p7.o(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC2717m7.alpha(arrayList)));
        return bundle;
    }

    public static Bundle bravo(i iVar) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", iVar.bravo);
        bundle.putLong("cloud.prj", 244414812773L);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p7.o(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC2717m7.alpha(arrayList)));
        return bundle;
    }

    public static boolean charlie(i iVar) {
        if (iVar.charlie.alpha.juliet() && ((Integer) iVar.charlie.alpha.hotel()).intValue() < 83420000) {
            return true;
        }
        return false;
    }

    public static boolean delta(i iVar) {
        if (iVar.charlie.alpha.juliet() && ((Integer) iVar.charlie.alpha.hotel()).intValue() == 0) {
            return true;
        }
        return false;
    }
}
