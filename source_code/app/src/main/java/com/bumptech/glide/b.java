package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ai;
import androidx.fragment.app.an;
import ao.ad;
import av.ah;
import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.AbstractC2806w7;

/* loaded from: classes3.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b f3550a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f3551b;
    public final G3.b alpha;
    public final H3.c purple;
    public final f red;
    public final G3.g silver;
    public final R3.l teal;
    public final U8.a white;
    public final ArrayList yellow = new ArrayList();

    public b(Context context, com.bumptech.glide.load.engine.l lVar, H3.c cVar, G3.b bVar, G3.g gVar, R3.l lVar2, U8.a aVar, int i4, com.google.mlkit.common.sdkinternal.b bVar2, bv.e eVar, List list, List list2, S3.a aVar2, ah ahVar) {
        this.alpha = bVar;
        this.silver = gVar;
        this.purple = cVar;
        this.teal = lVar2;
        this.white = aVar;
        this.red = new f(context, gVar, new C3.d(this, list2, aVar2), new com.google.mlkit.common.sdkinternal.b(11), bVar2, eVar, list, lVar, ahVar, i4);
    }

    public static b alpha(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f3550a == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            }
            synchronized (b.class) {
                if (f3550a == null) {
                    if (!f3551b) {
                        f3551b = true;
                        try {
                            charlie(context, generatedAppGlideModule);
                            f3551b = false;
                        } catch (Throwable th) {
                            f3551b = false;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return f3550a;
    }

    public static R3.l bravo(Context context) {
        Y3.f.charlie(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return alpha(context).teal;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [H3.c, B8.h] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, I3.b] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, I3.b] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, I3.b] */
    /* JADX WARN: Type inference failed for: r7v6, types: [H3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, I3.b] */
    public static void charlie(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        ApplicationInfo applicationInfo;
        int i4;
        float f5;
        boolean z2;
        int i5;
        int i10 = 3;
        e eVar = new e();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule != null && !generatedAppGlideModule.charlie()) {
            list = list2;
        } else {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    Log.e("ManifestParser", "Failed to parse glide modules", e);
                }
            }
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        AbstractC2806w7.delta(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
                list = arrayList;
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            list = arrayList;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw ad.yankee(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw ad.yankee(it2);
            }
        }
        Iterator it3 = list.iterator();
        if (!it3.hasNext()) {
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.bravo(applicationContext, eVar);
            }
            if (eVar.golf == null) {
                ?? obj = new Object();
                if (I3.e.red == 0) {
                    I3.e.red = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i11 = I3.e.red;
                if (!TextUtils.isEmpty("source")) {
                    eVar.golf = new I3.e(new ThreadPoolExecutor(i11, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new I3.c(obj, "source", false)));
                } else {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                }
            }
            if (eVar.hotel == null) {
                int i12 = I3.e.red;
                ?? obj2 = new Object();
                if (!TextUtils.isEmpty("disk-cache")) {
                    eVar.hotel = new I3.e(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new I3.c(obj2, "disk-cache", true)));
                } else {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
            }
            if (eVar.november == null) {
                if (I3.e.red == 0) {
                    I3.e.red = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                if (I3.e.red >= 4) {
                    i5 = 2;
                } else {
                    i5 = 1;
                }
                ?? obj3 = new Object();
                if (!TextUtils.isEmpty("animation")) {
                    eVar.november = new I3.e(new ThreadPoolExecutor(i5, i5, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new I3.c(obj3, "animation", true)));
                } else {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                }
            }
            if (eVar.juliet == null) {
                H3.d dVar = new H3.d(applicationContext);
                ?? obj4 = new Object();
                Context context2 = dVar.alpha;
                ActivityManager activityManager = dVar.bravo;
                if (activityManager.isLowRamDevice()) {
                    i4 = 2097152;
                } else {
                    i4 = 4194304;
                }
                obj4.charlie = i4;
                float memoryClass = activityManager.getMemoryClass() * 1048576;
                if (activityManager.isLowRamDevice()) {
                    f5 = 0.33f;
                } else {
                    f5 = 0.4f;
                }
                int round = Math.round(memoryClass * f5);
                DisplayMetrics displayMetrics = (DisplayMetrics) dVar.charlie.purple;
                float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
                float f11 = dVar.delta;
                int round2 = Math.round(f10 * f11);
                int round3 = Math.round(f10 * 2.0f);
                int i13 = round - i4;
                int i14 = round3 + round2;
                if (i14 <= i13) {
                    obj4.bravo = round3;
                    obj4.alpha = round2;
                } else {
                    float f12 = i13 / (f11 + 2.0f);
                    obj4.bravo = Math.round(f12 * 2.0f);
                    obj4.alpha = Math.round(f12 * f11);
                }
                if (Log.isLoggable("MemorySizeCalculator", 3)) {
                    StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                    sb2.append(Formatter.formatFileSize(context2, obj4.bravo));
                    sb2.append(", pool size: ");
                    sb2.append(Formatter.formatFileSize(context2, obj4.alpha));
                    sb2.append(", byte array size: ");
                    sb2.append(Formatter.formatFileSize(context2, i4));
                    sb2.append(", memory class limited? ");
                    if (i14 > round) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sb2.append(z2);
                    sb2.append(", max size: ");
                    sb2.append(Formatter.formatFileSize(context2, round));
                    sb2.append(", memoryClass: ");
                    sb2.append(activityManager.getMemoryClass());
                    sb2.append(", isLowMemoryDevice: ");
                    sb2.append(activityManager.isLowRamDevice());
                    Log.d("MemorySizeCalculator", sb2.toString());
                }
                eVar.juliet = obj4;
            }
            if (eVar.kilo == null) {
                eVar.kilo = new U8.a(8);
            }
            if (eVar.delta == null) {
                int i15 = eVar.juliet.alpha;
                if (i15 > 0) {
                    eVar.delta = new G3.h(i15);
                } else {
                    eVar.delta = new com.google.mlkit.common.sdkinternal.b(i10);
                }
            }
            if (eVar.echo == null) {
                eVar.echo = new G3.g(eVar.juliet.charlie);
            }
            if (eVar.foxtrot == null) {
                eVar.foxtrot = new B8.h(eVar.juliet.bravo);
            }
            if (eVar.india == null) {
                eVar.india = new D8.c(applicationContext);
            }
            if (eVar.charlie == null) {
                eVar.charlie = new com.bumptech.glide.load.engine.l(eVar.foxtrot, eVar.india, eVar.hotel, eVar.golf, new I3.e(new ThreadPoolExecutor(0, LottieConstants.IterateForever, I3.e.purple, TimeUnit.MILLISECONDS, new SynchronousQueue(), new I3.c(new Object(), "source-unlimited", false))), eVar.november);
            }
            List list3 = eVar.oscar;
            if (list3 == null) {
                eVar.oscar = Collections.EMPTY_LIST;
            } else {
                eVar.oscar = Collections.unmodifiableList(list3);
            }
            V8.c cVar = eVar.bravo;
            cVar.getClass();
            ah ahVar = new ah(cVar);
            b bVar = new b(applicationContext, eVar.charlie, eVar.foxtrot, eVar.delta, eVar.echo, new R3.l(), eVar.kilo, eVar.lima, eVar.mike, eVar.alpha, eVar.oscar, list, generatedAppGlideModule, ahVar);
            applicationContext.registerComponentCallbacks(bVar);
            f3550a = bVar;
            return;
        }
        throw ad.yankee(it3);
    }

    public static m echo(Context context) {
        return bravo(context).charlie(context);
    }

    public static m foxtrot(View view) {
        boolean z2;
        R3.l bravo = bravo(view.getContext());
        bravo.getClass();
        char[] cArr = Y3.l.alpha;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return bravo.charlie(view.getContext().getApplicationContext());
        }
        Y3.f.charlie(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity alpha = R3.l.alpha(view.getContext());
        if (alpha == null) {
            return bravo.charlie(view.getContext().getApplicationContext());
        }
        if (alpha instanceof an) {
            an anVar = (an) alpha;
            bv.e eVar = bravo.bravo;
            eVar.clear();
            R3.l.bravo(anVar.getSupportFragmentManager().charlie.foxtrot(), eVar);
            View findViewById = anVar.findViewById(R.id.content);
            ai aiVar = null;
            while (!view.equals(findViewById) && (aiVar = (ai) eVar.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            eVar.clear();
            if (aiVar != null) {
                return bravo.delta(aiVar);
            }
            return bravo.echo(anVar);
        }
        return bravo.charlie(view.getContext().getApplicationContext());
    }

    public final void delta(m mVar) {
        synchronized (this.yellow) {
            try {
                if (this.yellow.contains(mVar)) {
                    this.yellow.remove(mVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Y3.l.alpha();
        this.purple.golf(0L);
        this.alpha.india();
        this.silver.bravo();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        Y3.l.alpha();
        synchronized (this.yellow) {
            try {
                Iterator it = this.yellow.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.purple.hotel(i4);
        this.alpha.alpha(i4);
        this.silver.kilo(i4);
    }
}
