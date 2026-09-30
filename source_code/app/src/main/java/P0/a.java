package P0;

import android.util.Log;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import fe.C1714f;
import fe.C1715g;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import s6.J4;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method alpha(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        boolean z2;
        int length = methodArr.length;
        boolean z10 = false;
        int i4 = 0;
        loop0: while (true) {
            if (i4 < length) {
                method = methodArr[i4];
                if (Intrinsics.areEqual(str, method.getName()) || r.quebec(method.getName(), str.concat("-"), z10)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                    if (parameterTypes.length == clsArr2.length) {
                        ArrayList arrayList = new ArrayList(parameterTypes.length);
                        int length2 = parameterTypes.length;
                        boolean z11 = z10;
                        ?? r12 = z11;
                        for (?? r11 = z11; r11 < length2; r11++) {
                            Class<?> cls = parameterTypes[r11];
                            int i5 = r12 + 1;
                            Class<?> cls2 = clsArr2[r12];
                            if (!Intrinsics.areEqual(AbstractC3062u.echo(cls), AbstractC3062u.echo(cls2)) && !cls.isAssignableFrom(cls2)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            arrayList.add(Boolean.valueOf(z2));
                            r12 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) it.next()).booleanValue()) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    continue;
                }
                i4++;
                z10 = false;
            } else {
                method = null;
                break;
            }
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method bravo(Class cls, String str, Object... objArr) {
        int ceil;
        int collectionSizeOrDefault;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i4 = 0;
        while (true) {
            Class<?> cls2 = null;
            if (i4 >= length) {
                break;
            }
            Object obj = objArr[i4];
            if (obj != null) {
                cls2 = obj.getClass();
            }
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i4++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                if (length2 == 0) {
                    ceil = 1;
                } else {
                    ceil = (int) Math.ceil(length2 / 10.0d);
                }
                Class cls3 = Integer.TYPE;
                C1715g hotel = J4.hotel(0, ceil);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(hotel, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = hotel.iterator();
                while (((C1714f) it).red) {
                    ((x) it).alpha();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                T3.b bVar = new T3.b(3);
                ArrayList arrayList3 = bVar.alpha;
                bVar.bravo(clsArr);
                bVar.alpha(InterfaceC0581m.class);
                bVar.bravo(clsArr2);
                return alpha(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Intrinsics.areEqual(method.getName(), str)) {
                    if (!r.quebec(method.getName(), str + NumberOnlyZipVisualTransformation.HYPHEN, false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    public static void charlie(String str, String str2, C0585q c0585q, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method bravo = bravo(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (bravo != null) {
                bravo.setAccessible(true);
                if (Modifier.isStatic(bravo.getModifiers())) {
                    delta(bravo, null, c0585q, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    delta(bravo, cls.getConstructor(null).newInstance(null), c0585q, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e;
        }
    }

    public static void delta(Method method, Object obj, C0585q c0585q, Object... objArr) {
        int i4;
        int ceil;
        int i5;
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i10 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], InterfaceC0581m.class)) {
                    i10 = length;
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length = i11;
                }
            }
        }
        if (obj != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i10 == 0) {
            ceil = 1;
        } else {
            ceil = (int) Math.ceil((i4 + i10) / 10.0d);
        }
        int i12 = i10 + 1;
        int i13 = ceil + i12;
        int length2 = method.getParameterTypes().length;
        if (length2 != i13) {
            i5 = (int) Math.ceil(i10 / 31.0d);
        } else {
            i5 = 0;
        }
        if (i5 + i13 == length2) {
            Object[] objArr2 = new Object[length2];
            for (int i14 = 0; i14 < length2; i14++) {
                if (i14 >= 0 && i14 < i10) {
                    if (i14 >= 0 && i14 < objArr.length) {
                        obj2 = objArr[i14];
                    } else {
                        String name = method.getParameterTypes()[i14].getName();
                        switch (name.hashCode()) {
                            case -1325958191:
                                if (name.equals("double")) {
                                    obj2 = Double.valueOf(0.0d);
                                    break;
                                }
                                break;
                            case 104431:
                                if (name.equals("int")) {
                                    obj2 = 0;
                                    break;
                                }
                                break;
                            case 3039496:
                                if (name.equals("byte")) {
                                    obj2 = (byte) 0;
                                    break;
                                }
                                break;
                            case 3052374:
                                if (name.equals("char")) {
                                    obj2 = (char) 0;
                                    break;
                                }
                                break;
                            case 3327612:
                                if (name.equals("long")) {
                                    obj2 = 0L;
                                    break;
                                }
                                break;
                            case 64711720:
                                if (name.equals(CTVariableUtils.BOOLEAN)) {
                                    obj2 = Boolean.FALSE;
                                    break;
                                }
                                break;
                            case 97526364:
                                if (name.equals("float")) {
                                    obj2 = Float.valueOf(0.0f);
                                    break;
                                }
                                break;
                            case 109413500:
                                if (name.equals("short")) {
                                    obj2 = (short) 0;
                                    break;
                                }
                                break;
                        }
                        obj2 = null;
                    }
                } else if (i14 == i10) {
                    obj2 = c0585q;
                } else if (i12 <= i14 && i14 < i13) {
                    obj2 = 0;
                } else if (i13 <= i14 && i14 < length2) {
                    obj2 = 2097151;
                } else {
                    throw new IllegalStateException("Unexpected index");
                }
                objArr2[i14] = obj2;
            }
            method.invoke(obj, Arrays.copyOf(objArr2, length2));
            return;
        }
        throw new IllegalStateException("params don't add up to total params");
    }
}
