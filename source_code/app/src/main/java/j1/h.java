package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import i1.C1884e;
import i1.C1885f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s6.D5;
import s6.E5;

/* loaded from: classes3.dex */
public class h extends D5 {
    public static Class alpha;
    public static Constructor bravo;
    public static Method charlie;
    public static Method delta;
    public static boolean echo;

    public static boolean juliet(Object obj, String str, int i4, boolean z2) {
        kilo();
        try {
            try {
                return ((Boolean) charlie.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z2))).booleanValue();
            } catch (InvocationTargetException e) {
                e = e;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e = e4;
        }
    }

    public static void kilo() {
        Method method;
        Class<?> cls;
        Method method2;
        if (echo) {
            return;
        }
        echo = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        bravo = constructor;
        alpha = cls;
        charlie = method2;
        delta = method;
    }

    @Override // s6.D5
    public Typeface alpha(Context context, C1884e c1884e, Resources resources, int i4) {
        kilo();
        try {
            Object newInstance = bravo.newInstance(null);
            for (C1885f c1885f : c1884e.alpha) {
                File echo2 = E5.echo(context);
                if (echo2 == null) {
                    return null;
                }
                try {
                    if (!E5.bravo(echo2, resources, c1885f.foxtrot)) {
                        return null;
                    }
                    if (!juliet(newInstance, echo2.getPath(), c1885f.bravo, c1885f.charlie)) {
                        return null;
                    }
                    echo2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    echo2.delete();
                }
            }
            kilo();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) alpha, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) delta.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // s6.D5
    public Typeface bravo(Context context, p1.h[] hVarArr, int i4) {
        File file;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(hotel(hVarArr, i4).alpha, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } else {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface delta2 = delta(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return delta2;
                        }
                        Typeface delta22 = delta(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return delta22;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
