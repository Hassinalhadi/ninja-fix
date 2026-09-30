package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.RunnableC0643m;
import bd.ExecutorC0753f;
import bv.aw;
import bv.w;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.google.android.material.internal.s;
import d0.AbstractC1568f;
import g3.z;
import i1.AbstractC1881b;
import i1.C1884e;
import i1.InterfaceC1883d;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s6.D5;
import t6.P2;

/* renamed from: j1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1933g {
    public static final D5 alpha;
    public static final w bravo;
    public static Paint charlie;

    static {
        Trace.beginSection(P2.foxtrot("TypefaceCompat static init"));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            alpha = new D5();
        } else if (i4 >= 29) {
            alpha = new D5();
        } else if (i4 >= 28) {
            alpha = new j();
        } else if (i4 >= 26) {
            alpha = new j();
        } else {
            if (i4 >= 24) {
                Method method = i.charlie;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    alpha = new D5();
                }
            }
            alpha = new D5();
        }
        bravo = new w(16);
        charlie = null;
        Trace.endSection();
    }

    public static Typeface alpha(Context context, InterfaceC1883d interfaceC1883d, Resources resources, int i4, String str, int i5, int i10, AbstractC1881b abstractC1881b, boolean z2) {
        Typeface alpha2;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z10;
        int i11;
        Handler handler;
        int i12 = 2;
        int i13 = 15;
        int i14 = 23;
        boolean z11 = false;
        int i15 = -3;
        if (interfaceC1883d instanceof i1.g) {
            i1.g gVar = (i1.g) interfaceC1883d;
            String str2 = gVar.delta;
            if (TextUtils.isEmpty(str2) || (build = charlie(str2)) == null) {
                ArrayList arrayList = gVar.alpha;
                if (arrayList.size() == 1) {
                    build = charlie(((p1.d) arrayList.get(0)).echo);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < arrayList.size()) {
                                if (charlie(((p1.d) arrayList.get(i16)).echo) == null) {
                                    break;
                                }
                                i16++;
                            } else {
                                int i17 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i17 >= arrayList.size()) {
                                        break;
                                    }
                                    p1.d dVar = (p1.d) arrayList.get(i17);
                                    if (i17 == arrayList.size() - 1 && TextUtils.isEmpty(dVar.foxtrot)) {
                                        customFallbackBuilder.setSystemFallback(dVar.echo);
                                        break;
                                    }
                                    Font delta = delta(charlie(dVar.echo));
                                    if (delta == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + dVar.echo + ". Falling back to provider font.");
                                        break;
                                    }
                                    String str3 = dVar.foxtrot;
                                    if (!TextUtils.isEmpty(str3)) {
                                        build3 = AbstractC1568f.hotel(delta).build();
                                    } else {
                                        try {
                                            AbstractC1568f.india();
                                            AbstractC1932f.november();
                                            fontVariationSettings = z.hotel(delta).setFontVariationSettings(str3);
                                            build2 = fontVariationSettings.build();
                                            build3 = AbstractC1568f.hotel(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder != null) {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    } else {
                                        customFallbackBuilder = AbstractC1568f.golf(build3);
                                    }
                                    i17++;
                                }
                                build = customFallbackBuilder.build();
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (abstractC1881b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0643m(i14, abstractC1881b, build));
                }
                bravo.delta(bravo(resources, i4, str, i5, i10), build);
                return build;
            }
            if (!z2 ? abstractC1881b == null : gVar.charlie == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2) {
                i11 = gVar.bravo;
            } else {
                i11 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            s sVar = new s(14, z11);
            sVar.purple = abstractC1881b;
            ArrayList arrayList2 = gVar.alpha;
            ExecutorC0753f executorC0753f = new ExecutorC0753f(handler2, 4);
            com.google.android.play.core.integrity.k kVar = new com.google.android.play.core.integrity.k(5, sVar, executorC0753f);
            if (z10) {
                if (arrayList2.size() <= 1) {
                    p1.d dVar2 = (p1.d) arrayList2.get(0);
                    w wVar = p1.g.alpha;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj = new Object[]{dVar2}[0];
                    Objects.requireNonNull(obj);
                    arrayList3.add(obj);
                    String alpha3 = p1.g.alpha(i10, Collections.unmodifiableList(arrayList3));
                    alpha2 = (Typeface) p1.g.alpha.charlie(alpha3);
                    if (alpha2 != null) {
                        executorC0753f.execute(new com.google.common.util.concurrent.d(i13, sVar, alpha2));
                    } else if (i11 == -1) {
                        Object[] objArr = {dVar2};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj2 = objArr[0];
                        Objects.requireNonNull(obj2);
                        arrayList4.add(obj2);
                        p1.f bravo2 = p1.g.bravo(alpha3, context, Collections.unmodifiableList(arrayList4), i10);
                        kVar.golf(bravo2);
                        alpha2 = bravo2.alpha;
                    } else {
                        try {
                            try {
                                try {
                                    p1.f fVar = (p1.f) p1.g.bravo.submit(new p1.e(alpha3, context, dVar2, i10, 0)).get(i11, TimeUnit.MILLISECONDS);
                                    kVar.golf(fVar);
                                    alpha2 = fVar.alpha;
                                } catch (InterruptedException e) {
                                    throw e;
                                }
                            } catch (ExecutionException e4) {
                                throw new RuntimeException(e4);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused3) {
                            ((ExecutorC0753f) kVar.red).execute(new K1.i((s) kVar.purple, i15, i12));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
            } else {
                String alpha4 = p1.g.alpha(i10, arrayList2);
                Typeface typeface = (Typeface) p1.g.alpha.charlie(alpha4);
                if (typeface != null) {
                    executorC0753f.execute(new com.google.common.util.concurrent.d(i13, sVar, typeface));
                    alpha2 = typeface;
                } else {
                    bj.d dVar3 = new bj.d(1, kVar);
                    synchronized (p1.g.charlie) {
                        try {
                            aw awVar = p1.g.delta;
                            ArrayList arrayList5 = (ArrayList) awVar.get(alpha4);
                            if (arrayList5 != null) {
                                arrayList5.add(dVar3);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(dVar3);
                                awVar.put(alpha4, arrayList6);
                                p1.e eVar = new p1.e(alpha4, context, arrayList2, i10, 1);
                                ThreadPoolExecutor threadPoolExecutor = p1.g.bravo;
                                bj.d dVar4 = new bj.d(2, alpha4);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                D2.d dVar5 = new D2.d();
                                dVar5.red = eVar;
                                dVar5.purple = dVar4;
                                dVar5.silver = handler;
                                threadPoolExecutor.execute(dVar5);
                            }
                        } finally {
                        }
                    }
                    alpha2 = null;
                }
            }
        } else {
            alpha2 = alpha.alpha(context, (C1884e) interfaceC1883d, resources, i10);
            if (abstractC1881b != null) {
                if (alpha2 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0643m(i14, abstractC1881b, alpha2));
                } else {
                    abstractC1881b.alpha(-3);
                }
            }
        }
        if (alpha2 != null) {
            bravo.delta(bravo(resources, i4, str, i5, i10), alpha2);
        }
        return alpha2;
    }

    public static String bravo(Resources resources, int i4, String str, int i5, int i10) {
        return resources.getResourcePackageName(i4) + NumberOnlyZipVisualTransformation.HYPHEN + str + NumberOnlyZipVisualTransformation.HYPHEN + i5 + NumberOnlyZipVisualTransformation.HYPHEN + i4 + NumberOnlyZipVisualTransformation.HYPHEN + i10;
    }

    public static Typeface charlie(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font delta(Typeface typeface) {
        if (charlie == null) {
            charlie = new Paint();
        }
        charlie.setTextSize(10.0f);
        charlie.setTypeface(typeface);
        PositionedGlyphs juliet = z.juliet(charlie);
        if (z.delta(juliet) == 0) {
            return null;
        }
        return z.india(juliet);
    }
}
