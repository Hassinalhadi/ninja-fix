package i6;

import F8.q;
import V5.x;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.measurement.internal.C1471u;
import com.google.android.gms.measurement.internal.C1473v;
import com.google.android.gms.measurement.internal.C1475w;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.gms.measurement.internal.r;
import dalvik.system.PathClassLoader;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import o6.AbstractC2197a;

/* renamed from: i6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1894c {
    public static Boolean foxtrot = null;
    public static String golf = null;
    public static boolean hotel = false;
    public static int india = -1;
    public static Boolean juliet;
    public static h november;
    public static i oscar;
    public final Context alpha;
    public static final ThreadLocal kilo = new ThreadLocal();
    public static final A7.a lima = new A7.a(7);
    public static final C1471u mike = new C1471u(9);
    public static final C1473v bravo = new C1473v(9);
    public static final C1475w charlie = new C1475w(9);
    public static final C1477x delta = new C1477x(9);
    public static final r echo = new r(10);

    public C1894c(Context context) {
        this.alpha = context;
    }

    public static int alpha(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!x.lima(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [i6.f, java.lang.Object] */
    public static C1894c charlie(Context context, InterfaceC1893b interfaceC1893b, String str) {
        long j5;
        H3.e alpha;
        int i4;
        C1894c c1894c;
        Boolean bool;
        InterfaceC1812b magenta;
        C1894c c1894c2;
        i iVar;
        boolean z2;
        InterfaceC1812b magenta2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = kilo;
            f fVar = (f) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            A7.a aVar = lima;
            Long l10 = (Long) aVar.get();
            long longValue = l10.longValue();
            try {
                aVar.set(Long.valueOf(SystemClock.uptimeMillis()));
                alpha = interfaceC1893b.alpha(context, str, mike);
                i4 = alpha.alpha;
                j5 = longValue;
            } catch (Throwable th) {
                th = th;
                j5 = longValue;
            }
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i4 + " and remote module " + str + ":" + alpha.bravo);
                int i5 = alpha.charlie;
                if (i5 != 0) {
                    if (i5 == -1) {
                        if (alpha.alpha != 0) {
                            i5 = -1;
                        }
                    }
                    if (i5 != 1 || alpha.bravo != 0) {
                        if (i5 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            c1894c = new C1894c(applicationContext);
                        } else if (i5 == 1) {
                            try {
                                int i10 = alpha.bravo;
                                try {
                                    synchronized (C1894c.class) {
                                        if (golf(context)) {
                                            bool = foxtrot;
                                        } else {
                                            throw new DynamiteModule$LoadingException("Remote loading disabled", null);
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            synchronized (C1894c.class) {
                                                iVar = oscar;
                                            }
                                            if (iVar != null) {
                                                f fVar2 = (f) threadLocal.get();
                                                if (fVar2 != null && fVar2.alpha != null) {
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor = fVar2.alpha;
                                                    new BinderC1814d(null);
                                                    synchronized (C1894c.class) {
                                                        if (india >= 2) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (z2) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        magenta2 = iVar.maroon(new BinderC1814d(applicationContext2), str, i10, new BinderC1814d(cursor));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        magenta2 = iVar.magenta(new BinderC1814d(applicationContext2), str, i10, new BinderC1814d(cursor));
                                                    }
                                                    Context context2 = (Context) BinderC1814d.magenta(magenta2);
                                                    if (context2 != null) {
                                                        c1894c2 = new C1894c(context2);
                                                    } else {
                                                        throw new DynamiteModule$LoadingException("Failed to get module context", null);
                                                    }
                                                } else {
                                                    throw new DynamiteModule$LoadingException("No result cursor", null);
                                                }
                                            } else {
                                                throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            h hotel2 = hotel(context);
                                            if (hotel2 != null) {
                                                Parcel charlie2 = hotel2.charlie(hotel2.ivory(), 6);
                                                int readInt = charlie2.readInt();
                                                charlie2.recycle();
                                                if (readInt >= 3) {
                                                    f fVar3 = (f) threadLocal.get();
                                                    if (fVar3 != null) {
                                                        magenta = hotel2.maroon(new BinderC1814d(context), str, i10, new BinderC1814d(fVar3.alpha));
                                                    } else {
                                                        throw new DynamiteModule$LoadingException("No cached result cursor holder", null);
                                                    }
                                                } else if (readInt == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    magenta = hotel2.navy(new BinderC1814d(context), str, i10);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    magenta = hotel2.magenta(new BinderC1814d(context), str, i10);
                                                }
                                                Object magenta3 = BinderC1814d.magenta(magenta);
                                                if (magenta3 != null) {
                                                    c1894c2 = new C1894c((Context) magenta3);
                                                } else {
                                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", null);
                                                }
                                            } else {
                                                throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                        }
                                        c1894c = c1894c2;
                                    } else {
                                        throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                } catch (RemoteException e) {
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", e, null);
                                } catch (DynamiteModule$LoadingException e4) {
                                    throw e4;
                                } catch (Throwable th2) {
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", th2, null);
                                }
                            } catch (DynamiteModule$LoadingException e5) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e5.getMessage());
                                int i11 = alpha.alpha;
                                if (i11 != 0 && interfaceC1893b.alpha(context, str, new q(i11)).charlie == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                    c1894c = new C1894c(applicationContext);
                                } else {
                                    throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e5, null);
                                }
                            }
                        } else {
                            throw new DynamiteModule$LoadingException("VersionPolicy returned invalid code:" + i5, null);
                        }
                        if (j5 == 0) {
                            lima.remove();
                        } else {
                            lima.set(l10);
                        }
                        Cursor cursor2 = obj.alpha;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        kilo.set(fVar);
                        return c1894c;
                    }
                }
                throw new DynamiteModule$LoadingException("No acceptable module " + str + " found. Local version is " + alpha.alpha + " and remote version is " + alpha.bravo + ".", null);
            } catch (Throwable th3) {
                th = th3;
                if (j5 == 0) {
                    lima.remove();
                } else {
                    lima.set(l10);
                }
                Cursor cursor3 = obj.alpha;
                if (cursor3 != null) {
                    cursor3.close();
                }
                kilo.set(fVar);
                throw th;
            }
        }
        throw new DynamiteModule$LoadingException("null application Context", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x017c, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int delta(Context context, String str, boolean z2) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (C1894c.class) {
                Boolean bool = foxtrot;
                boolean z10 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                foxtrot(classLoader);
                            } catch (DynamiteModule$LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!golf(context)) {
                                return 0;
                            }
                            if (!hotel) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int echo2 = echo(context, str, z2, true);
                                        String str2 = golf;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader bravo2 = d.bravo();
                                            if (bravo2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    U.h.charlie();
                                                    String str3 = golf;
                                                    x.hotel(str3);
                                                    bravo2 = U.h.bravo(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = golf;
                                                    x.hotel(str4);
                                                    bravo2 = new PathClassLoader(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            foxtrot(bravo2);
                                            declaredField.set(null, bravo2);
                                            foxtrot = bool2;
                                            return echo2;
                                        }
                                        return echo2;
                                    } catch (DynamiteModule$LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        foxtrot = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return echo(context, str, z2, false);
                    } catch (DynamiteModule$LoadingException e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                h hotel2 = hotel(context);
                try {
                    if (hotel2 == null) {
                        return 0;
                    }
                    try {
                        Parcel charlie2 = hotel2.charlie(hotel2.ivory(), 6);
                        int readInt2 = charlie2.readInt();
                        charlie2.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = kilo;
                            f fVar = (f) threadLocal.get();
                            if (fVar != null && (cursor = fVar.alpha) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) BinderC1814d.magenta(hotel2.ochre(new BinderC1814d(context), str, z2, ((Long) lima.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            f fVar2 = (f) threadLocal.get();
                                            if (fVar2 != null && fVar2.alpha == null) {
                                                fVar2.alpha = cursor3;
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    remoteException = e5;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                        throw th;
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            BinderC1814d binderC1814d = new BinderC1814d(context);
                            Parcel ivory = hotel2.ivory();
                            AbstractC2197a.charlie(ivory, binderC1814d);
                            ivory.writeString(str);
                            ivory.writeInt(z2 ? 1 : 0);
                            Parcel charlie3 = hotel2.charlie(ivory, 5);
                            readInt = charlie3.readInt();
                            charlie3.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC1814d binderC1814d2 = new BinderC1814d(context);
                            Parcel ivory2 = hotel2.ivory();
                            AbstractC2197a.charlie(ivory2, binderC1814d2);
                            ivory2.writeString(str);
                            ivory2.writeInt(z2 ? 1 : 0);
                            Parcel charlie4 = hotel2.charlie(ivory2, 3);
                            readInt = charlie4.readInt();
                            charlie4.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e10) {
                        remoteException = e10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0154: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:341), block:B:121:0x0153 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int echo(Context context, String str, boolean z2, boolean z10) {
        Throwable th;
        Exception exc;
        Cursor cursor;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z11;
        Cursor cursor2 = null;
        try {
            try {
                long longValue = ((Long) lima.get()).longValue();
                String str2 = "api_force_staging";
                boolean z12 = true;
                if (true != z2) {
                    str2 = "api";
                }
                Uri build = new Uri.Builder().scheme(Constants.KEY_CONTENT).authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(longValue)).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z13 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i4 = 0; i4 < count; i4++) {
                                if (query.moveToPosition(i4)) {
                                    Object[] objArr = new Object[columnCount];
                                    for (int i5 = 0; i5 < columnCount; i5++) {
                                        int type = query.getType(i5);
                                        if (type != 0) {
                                            if (type != 1) {
                                                if (type != 2) {
                                                    if (type != 3) {
                                                        if (type == 4) {
                                                            objArr[i5] = query.getBlob(i5);
                                                        } else {
                                                            throw new RemoteException("Unknown column type");
                                                        }
                                                    } else {
                                                        objArr[i5] = query.getString(i5);
                                                    }
                                                } else {
                                                    objArr[i5] = Double.valueOf(query.getDouble(i5));
                                                }
                                            } else {
                                                objArr[i5] = Long.valueOf(query.getLong(i5));
                                            }
                                        } else {
                                            objArr[i5] = null;
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                } else {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i10 = matrixCursor.getInt(0);
                                        if (i10 > 0) {
                                            synchronized (C1894c.class) {
                                                try {
                                                    golf = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        india = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        if (matrixCursor.getInt(columnIndex2) != 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        hotel = z11;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            f fVar = (f) kilo.get();
                                            if (fVar != null && fVar.alpha == null) {
                                                fVar.alpha = matrixCursor;
                                            } else {
                                                z12 = false;
                                            }
                                            z13 = z11;
                                            if (z12) {
                                                matrixCursor = null;
                                            }
                                        }
                                        if (z10 && z13) {
                                            throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl", null);
                                        }
                                        return i10;
                                    }
                                } catch (Exception e) {
                                    exc = e;
                                    if (exc instanceof DynamiteModule$LoadingException) {
                                        throw exc;
                                    }
                                    throw new DynamiteModule$LoadingException("V2 version check failed: " + exc.getMessage(), exc, null);
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.", null);
                        } catch (Throwable th3) {
                            try {
                                query.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Throwable th5) {
                th = th5;
                cursor2 = cursor;
                if (cursor2 == null) {
                    cursor2.close();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e4) {
            exc = e4;
        } catch (Throwable th6) {
            th = th6;
            if (cursor2 == null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void foxtrot(ClassLoader classLoader) {
        i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                iVar = 0;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof i) {
                    iVar = (i) queryLocalInterface;
                } else {
                    iVar = new AbstractC1394y(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
                }
            }
            oscar = iVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e5) {
            e = e5;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    public static boolean golf(Context context) {
        int i4;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(juliet)) {
            return true;
        }
        boolean z2 = false;
        if (juliet == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i4 = 268435456;
            } else {
                i4 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i4);
            if (com.google.android.gms.common.d.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z2 = true;
            }
            juliet = Boolean.valueOf(z2);
            if (z2 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                hotel = true;
            }
        }
        if (!z2) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h hotel(Context context) {
        h hVar;
        synchronized (C1894c.class) {
            h hVar2 = november;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof h) {
                        hVar = (h) queryLocalInterface;
                    } else {
                        hVar = new AbstractC1394y(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                    }
                }
                if (hVar != 0) {
                    november = hVar;
                    return hVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    public final IBinder bravo(String str) {
        try {
            return (IBinder) this.alpha.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
