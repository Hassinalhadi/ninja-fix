package G3;

import android.graphics.Bitmap;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class l {
    public static final Bitmap.Config[] delta;
    public static final Bitmap.Config[] echo;
    public static final Bitmap.Config[] foxtrot;
    public static final Bitmap.Config[] golf;
    public static final Bitmap.Config[] hotel;
    public final f alpha = new f(1);
    public final J2.e bravo = new J2.e();
    public final HashMap charlie = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        delta = configArr;
        echo = configArr;
        foxtrot = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        golf = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        hotel = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String charlie(int i4, Bitmap.Config config) {
        return Constants.AES_PREFIX + i4 + "](" + config + ")";
    }

    public final void alpha(Integer num, Bitmap bitmap) {
        NavigableMap delta2 = delta(bitmap.getConfig());
        Integer num2 = (Integer) delta2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                delta2.remove(num);
                return;
            } else {
                delta2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + charlie(Y3.l.charlie(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:20:0x00a6 BREAK  A[LOOP:0: B:10:0x0058->B:32:0x00a4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap bravo(int i4, int i5, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int length;
        Bitmap bitmap;
        Bitmap.Config config2;
        int i10 = 0;
        int delta2 = Y3.l.delta(config) * i4 * i5;
        f fVar = this.alpha;
        i iVar = (i) ((ArrayDeque) fVar.alpha).poll();
        if (iVar == null) {
            iVar = fVar.X();
        }
        k kVar = (k) iVar;
        kVar.bravo = delta2;
        kVar.charlie = config;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                configArr = echo;
                length = configArr.length;
                while (true) {
                    if (i10 < length) {
                        break;
                    }
                    Bitmap.Config config3 = configArr[i10];
                    Integer num = (Integer) delta(config3).ceilingKey(Integer.valueOf(delta2));
                    if (num != null && num.intValue() <= delta2 * 8) {
                        if (num.intValue() != delta2 || (config3 != null ? !config3.equals(config) : config != null)) {
                            fVar.O(kVar);
                            int intValue = num.intValue();
                            Object obj = (i) ((ArrayDeque) fVar.alpha).poll();
                            if (obj == null) {
                                obj = fVar.X();
                            }
                            kVar = (k) obj;
                            kVar.bravo = intValue;
                            kVar.charlie = config3;
                        }
                    } else {
                        i10++;
                    }
                }
                bitmap = (Bitmap) this.bravo.B(kVar);
                if (bitmap != null) {
                    alpha(Integer.valueOf(kVar.bravo), bitmap);
                    bitmap.reconfigure(i4, i5, config);
                }
                return bitmap;
            }
        }
        int i11 = j.alpha[config.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        configArr = new Bitmap.Config[]{config};
                    } else {
                        configArr = hotel;
                    }
                } else {
                    configArr = golf;
                }
            } else {
                configArr = foxtrot;
            }
        } else {
            configArr = delta;
        }
        length = configArr.length;
        while (true) {
            if (i10 < length) {
            }
            i10++;
        }
        bitmap = (Bitmap) this.bravo.B(kVar);
        if (bitmap != null) {
        }
        return bitmap;
    }

    public final NavigableMap delta(Bitmap.Config config) {
        HashMap hashMap = this.charlie;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final void echo(Bitmap bitmap) {
        int charlie = Y3.l.charlie(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        f fVar = this.alpha;
        i iVar = (i) ((ArrayDeque) fVar.alpha).poll();
        if (iVar == null) {
            iVar = fVar.X();
        }
        k kVar = (k) iVar;
        kVar.bravo = charlie;
        kVar.charlie = config;
        this.bravo.H(kVar, bitmap);
        NavigableMap delta2 = delta(bitmap.getConfig());
        Integer num = (Integer) delta2.get(Integer.valueOf(kVar.bravo));
        Integer valueOf = Integer.valueOf(kVar.bravo);
        int i4 = 1;
        if (num != null) {
            i4 = 1 + num.intValue();
        }
        delta2.put(valueOf, Integer.valueOf(i4));
    }

    public final String toString() {
        StringBuilder tango = Q0.c.tango("SizeConfigStrategy{groupedMap=");
        tango.append(this.bravo);
        tango.append(", sortedSizes=(");
        HashMap hashMap = this.charlie;
        for (Map.Entry entry : hashMap.entrySet()) {
            tango.append(entry.getKey());
            tango.append('[');
            tango.append(entry.getValue());
            tango.append("], ");
        }
        if (!hashMap.isEmpty()) {
            tango.replace(tango.length() - 2, tango.length(), "");
        }
        tango.append(")}");
        return tango.toString();
    }
}
