package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import bv.C0762a;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class o {
    public static final K2.i alpha = new K2.i((n) new Object());
    public static final int purple = -100;
    public static o1.e red = null;
    public static o1.e silver = null;
    public static Boolean teal = null;
    public static boolean white = false;
    public static final bv.f yellow = new bv.f(0);

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2750a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2751b = new Object();

    public static boolean charlie(Context context) {
        int i4;
        if (teal == null) {
            try {
                int i5 = ai.alpha;
                if (Build.VERSION.SDK_INT >= 24) {
                    i4 = ah.alpha() | 128;
                } else {
                    i4 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ai.class), i4).metaData;
                if (bundle != null) {
                    teal = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                teal = Boolean.FALSE;
            }
        }
        return teal.booleanValue();
    }

    public static void foxtrot(ab abVar) {
        synchronized (f2750a) {
            try {
                bv.f fVar = yellow;
                fVar.getClass();
                C0762a c0762a = new C0762a(fVar);
                while (c0762a.hasNext()) {
                    o oVar = (o) ((WeakReference) c0762a.next()).get();
                    if (oVar == abVar || oVar == null) {
                        c0762a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void alpha();

    public abstract void bravo();

    public abstract void delta();

    public abstract void echo();

    public abstract boolean golf(int i4);

    public abstract void hotel(int i4);

    public abstract void india(View view);

    public abstract void juliet(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void kilo(CharSequence charSequence);

    public abstract an.b lima(an.a aVar);
}
