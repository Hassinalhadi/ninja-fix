package com.google.firebase;

import B7.g;
import E8.k;
import I7.a;
import I7.b;
import I7.j;
import I7.p;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import g8.c;
import g8.d;
import g8.e;
import g8.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import s6.H0;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String alpha(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        int i4 = 2;
        ArrayList arrayList = new ArrayList();
        a bravo = b.bravo(D8.b.class);
        bravo.alpha(new j(2, 0, D8.a.class));
        bravo.foxtrot = new A8.a(8);
        arrayList.add(bravo.bravo());
        p pVar = new p(H7.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{e.class, f.class});
        aVar.alpha(j.charlie(Context.class));
        aVar.alpha(j.charlie(g.class));
        aVar.alpha(new j(2, 0, d.class));
        aVar.alpha(new j(1, 1, D8.b.class));
        aVar.alpha(new j(pVar, 1, 0));
        aVar.foxtrot = new k(pVar, i4);
        arrayList.add(aVar.bravo());
        arrayList.add(H0.alpha("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(H0.alpha("fire-core", "21.0.0"));
        arrayList.add(H0.alpha("device-name", alpha(Build.PRODUCT)));
        arrayList.add(H0.alpha("device-model", alpha(Build.DEVICE)));
        arrayList.add(H0.alpha("device-brand", alpha(Build.BRAND)));
        arrayList.add(H0.bravo("android-target-sdk", new A8.a(1)));
        arrayList.add(H0.bravo("android-min-sdk", new A8.a(i4)));
        arrayList.add(H0.bravo("android-platform", new A8.a(3)));
        arrayList.add(H0.bravo("android-installer", new A8.a(4)));
        try {
            str = kotlin.g.teal.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(H0.alpha("kotlin", str));
        }
        return arrayList;
    }
}
