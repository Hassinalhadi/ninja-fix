package j1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i1.C1884e;
import i1.C1885f;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s6.E5;

/* loaded from: classes3.dex */
public class j extends h {
    public final Class foxtrot;
    public final Constructor golf;
    public final Method hotel;
    public final Method india;
    public final Method juliet;
    public final Method kilo;
    public final Method lima;

    public j() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = quebec(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = romeo(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.foxtrot = cls;
        this.golf = constructor;
        this.hotel = method2;
        this.india = method3;
        this.juliet = method4;
        this.kilo = method5;
        this.lima = method;
    }

    public static Method quebec(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // j1.h, s6.D5
    public final Typeface alpha(Context context, C1884e c1884e, Resources resources, int i4) {
        Method method = this.hotel;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            Object papa = papa();
            if (papa != null) {
                C1885f[] c1885fArr = c1884e.alpha;
                int length = c1885fArr.length;
                int i5 = 0;
                while (i5 < length) {
                    C1885f c1885f = c1885fArr[i5];
                    String str = c1885f.alpha;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c1885f.delta);
                    Context context2 = context;
                    if (!mike(context2, papa, str, c1885f.echo, c1885f.bravo, c1885f.charlie ? 1 : 0, fromFontVariationSettings)) {
                        lima(papa);
                        return null;
                    }
                    i5++;
                    context = context2;
                }
                if (oscar(papa)) {
                    return november(papa);
                }
            }
            return null;
        }
        return super.alpha(context, c1884e, resources, i4);
    }

    @Override // j1.h, s6.D5
    public final Typeface bravo(Context context, p1.h[] hVarArr, int i4) {
        Typeface november;
        boolean z2;
        if (hVarArr.length >= 1) {
            Method method = this.hotel;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (p1.h hVar : hVarArr) {
                    if (hVar.foxtrot == 0) {
                        Uri uri = hVar.alpha;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, E5.foxtrot(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object papa = papa();
                if (papa != null) {
                    int length = hVarArr.length;
                    int i5 = 0;
                    boolean z10 = false;
                    while (i5 < length) {
                        p1.h hVar2 = hVarArr[i5];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.alpha);
                        if (byteBuffer != null) {
                            try {
                                z2 = ((Boolean) this.india.invoke(papa, byteBuffer, Integer.valueOf(hVar2.bravo), null, Integer.valueOf(hVar2.charlie), Integer.valueOf(hVar2.delta ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z2 = false;
                            }
                            if (!z2) {
                                lima(papa);
                                return null;
                            }
                            z10 = true;
                        }
                        i5++;
                        z10 = z10;
                    }
                    if (!z10) {
                        lima(papa);
                        return null;
                    }
                    if (oscar(papa) && (november = november(papa)) != null) {
                        return Typeface.create(november, i4);
                    }
                }
            } else {
                p1.h hotel = hotel(hVarArr, i4);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(hotel.alpha, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(hotel.charlie).setItalic(hotel.delta).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // s6.D5
    public final Typeface echo(Context context, Resources resources, int i4, String str, int i5) {
        Method method = this.hotel;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            Object papa = papa();
            if (papa != null) {
                if (!mike(context, papa, str, 0, -1, -1, null)) {
                    lima(papa);
                    return null;
                }
                if (oscar(papa)) {
                    return november(papa);
                }
            }
            return null;
        }
        return super.echo(context, resources, i4, str, i5);
    }

    public final void lima(Object obj) {
        try {
            this.kilo.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean mike(Context context, Object obj, String str, int i4, int i5, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.hotel.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface november(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.foxtrot, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.lima.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean oscar(Object obj) {
        try {
            return ((Boolean) this.juliet.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object papa() {
        try {
            return this.golf.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method romeo(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
