package s6;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class Y6 {
    public static Q0.e alpha() {
        return new Q0.e(1.0f, 1.0f);
    }

    public static final boolean bravo(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !Intrinsics.areEqual(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!bravo((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!kotlin.collections.ab.foxtrot((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int charlie(Bundle bundle) {
        int i4;
        Iterator<String> it = bundle.keySet().iterator();
        int i5 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                i4 = charlie((Bundle) obj);
            } else if (obj instanceof Object[]) {
                i4 = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                i4 = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                i4 = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                i4 = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                i4 = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                i4 = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                i4 = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                i4 = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                i4 = Arrays.hashCode((boolean[]) obj);
            } else if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i5 = (i5 * 31) + i4;
        }
        return i5;
    }
}
