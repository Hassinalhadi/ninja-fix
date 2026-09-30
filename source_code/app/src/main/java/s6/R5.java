package s6;

import android.net.Uri;
import android.os.Build;
import android.util.Log;
import fe.C1713e;
import fe.C1714f;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public abstract class R5 {
    public static int alpha(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return E2.e.golf(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        }
    }

    public static String bravo(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return E2.e.hotel(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon package", e5);
            return null;
        }
    }

    public static int charlie(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return E2.e.oscar(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e5);
            return -1;
        }
    }

    public static Uri delta(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return E2.e.papa(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        }
    }

    public static Je.a echo(InputStream inputStream) {
        int collectionSizeOrDefault;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C1713e c1713e = new C1713e(1, dataInputStream.readInt(), 1);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(c1713e, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = c1713e.iterator();
        while (((C1714f) it).red) {
            ((kotlin.collections.x) it).alpha();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] y10 = CollectionsKt.y(arrayList);
        return new Je.a(Arrays.copyOf(y10, y10.length));
    }
}
