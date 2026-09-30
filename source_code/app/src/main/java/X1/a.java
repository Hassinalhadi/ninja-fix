package X1;

import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import delivery.samurai.android.AndroidApp;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public abstract class a {
    public static final HashSet alpha = new HashSet();
    public static final boolean bravo;

    static {
        String str;
        String str2;
        String property = System.getProperty("java.vm.version");
        boolean z2 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str3 = null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 != null && str3 != null) {
                try {
                    int parseInt = Integer.parseInt(str2);
                    int parseInt2 = Integer.parseInt(str3);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z2 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("VM with version ");
        sb2.append(property);
        if (z2) {
            str = " has multidex support";
        } else {
            str = " does not have multidex support";
        }
        sb2.append(str);
        Log.i("MultiDex", sb2.toString());
        bravo = z2;
    }

    public static void alpha(AndroidApp androidApp) {
        File file = new File(androidApp.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: all -> 0x0011, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0011, blocks: (B:4:0x0009, B:6:0x000f, B:9:0x0014, B:12:0x003e, B:13:0x0042, B:17:0x0057, B:21:0x0065, B:23:0x006c, B:24:0x007c, B:32:0x00a7, B:34:0x00ae, B:36:0x00b0, B:43:0x00b2, B:44:0x00b5, B:48:0x0070, B:51:0x005e, B:52:0x0047, B:56:0x004f, B:27:0x008a, B:29:0x008e, B:40:0x0096, B:20:0x0059), top: B:3:0x0009, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(AndroidApp androidApp, File file, File file2) {
        ClassLoader classLoader;
        HashSet hashSet = alpha;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(file)) {
                    return;
                }
                hashSet.add(file);
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                IOException e = null;
                try {
                    classLoader = androidApp.getClassLoader();
                } catch (RuntimeException e4) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e4);
                }
                if (!(classLoader instanceof BaseDexClassLoader)) {
                    Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                    classLoader = null;
                    if (classLoader == null) {
                    }
                } else if (classLoader == null) {
                    try {
                        alpha(androidApp);
                    } catch (Throwable th) {
                        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File file3 = new File(file2, "code_cache");
                    try {
                        echo(file3);
                    } catch (IOException unused) {
                        file3 = new File(androidApp.getFilesDir(), "code_cache");
                        echo(file3);
                    }
                    File file4 = new File(file3, "secondary-dexes");
                    echo(file4);
                    d dVar = new d(file, file4);
                    try {
                        try {
                            delta((BaseDexClassLoader) classLoader, file4, dVar.golf(androidApp, false));
                        } catch (IOException e5) {
                            Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e5);
                            delta((BaseDexClassLoader) classLoader, file4, dVar.golf(androidApp, true));
                        }
                        try {
                        } catch (IOException e10) {
                            e = e10;
                        }
                        if (e == null) {
                        } else {
                            throw e;
                        }
                    } finally {
                        try {
                            dVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Field charlie(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder victor = Q0.c.victor("Field ", str, " not found in ");
        victor.append(obj.getClass());
        throw new NoSuchFieldException(victor.toString());
    }

    public static void delta(BaseDexClassLoader baseDexClassLoader, File file, ArrayList arrayList) {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = charlie(baseDexClassLoader, "pathList").get(baseDexClassLoader);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                    Field charlie = charlie(obj, "dexElements");
                    Object[] objArr2 = (Object[]) charlie.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    charlie.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field charlie2 = charlie(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) charlie2.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        charlie2.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList2.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
    }

    public static void echo(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
