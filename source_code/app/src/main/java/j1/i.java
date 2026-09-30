package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import bv.aw;
import i1.C1884e;
import i1.C1885f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import s6.D5;
import s6.E5;

/* loaded from: classes3.dex */
public final class i extends D5 {
    public static final Class alpha;
    public static final Constructor bravo;
    public static final Method charlie;
    public static final Method delta;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        bravo = constructor;
        alpha = cls;
        charlie = method2;
        delta = method;
    }

    public static boolean juliet(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z2) {
        try {
            return ((Boolean) charlie.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface kilo(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) alpha, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) delta.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[SYNTHETIC] */
    @Override // s6.D5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface alpha(Context context, C1884e c1884e, Resources resources, int i4) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = bravo.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C1885f c1885f : c1884e.alpha) {
                int i5 = c1885f.foxtrot;
                File echo = E5.echo(context);
                if (echo != null) {
                    try {
                        if (E5.bravo(echo, resources, i5)) {
                            try {
                                fileInputStream = new FileInputStream(echo);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer == null) {
                                    if (juliet(obj, mappedByteBuffer, c1885f.echo, c1885f.bravo, c1885f.charlie)) {
                                    }
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        echo.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return kilo(obj);
        }
        return null;
    }

    @Override // s6.D5
    public final Typeface bravo(Context context, p1.h[] hVarArr, int i4) {
        Object obj;
        try {
            obj = bravo.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i5 = 0;
            aw awVar = new aw(0);
            int length = hVarArr.length;
            while (true) {
                if (i5 < length) {
                    p1.h hVar = hVarArr[i5];
                    Uri uri = hVar.alpha;
                    ByteBuffer byteBuffer = (ByteBuffer) awVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = E5.foxtrot(context, uri);
                        awVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!juliet(obj, byteBuffer, hVar.bravo, hVar.charlie, hVar.delta)) {
                        break;
                    }
                    i5++;
                } else {
                    Typeface kilo = kilo(obj);
                    if (kilo != null) {
                        return Typeface.create(kilo, i4);
                    }
                }
            }
        }
        return null;
    }
}
