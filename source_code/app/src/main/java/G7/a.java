package G7;

import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.google.android.gms.measurement.internal.W;
import com.google.common.collect.d;
import com.google.common.collect.f;
import com.google.common.collect.h;
import java.util.Arrays;
import s6.V;
import s6.X;
import s6.Y;

/* loaded from: classes2.dex */
public abstract class a {
    public static final f alpha;
    public static final h bravo;
    public static final h charlie;
    public static final h delta;
    public static final h echo;
    public static final h foxtrot;

    static {
        int i4 = f.red;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        alpha = f.lima(15, objArr);
        com.google.common.collect.b bVar = d.purple;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        Y.alpha(7, objArr2);
        bravo = d.india(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        Y.alpha(3, objArr3);
        charlie = d.india(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        Y.alpha(2, objArr4);
        delta = d.india(2, objArr4);
        V.bravo(4, "initialCapacity");
        String[] strArr = W.india;
        Y.alpha(15, strArr);
        Object[] copyOf = Arrays.copyOf(new Object[4], X.alpha(4, 15));
        System.arraycopy(strArr, 0, copyOf, 0, 15);
        String[] strArr2 = W.juliet;
        Y.alpha(15, strArr2);
        if (copyOf.length < 30) {
            copyOf = Arrays.copyOf(copyOf, X.alpha(copyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, copyOf, 15, 15);
        echo = d.india(30, copyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        Y.alpha(2, objArr5);
        foxtrot = d.india(2, objArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean alpha(String str, String str2, Bundle bundle) {
        char c3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (charlie(str) && bundle != null) {
            h hVar = delta;
            int i4 = hVar.silver;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    boolean containsKey = bundle.containsKey((String) hVar.get(i5));
                    i5++;
                    if (containsKey) {
                        break;
                    }
                } else {
                    int hashCode = str.hashCode();
                    if (hashCode != 101200) {
                        if (hashCode != 101230) {
                            if (hashCode == 3142703 && str.equals("fiam")) {
                                c3 = 2;
                                if (c3 == 0) {
                                    if (c3 != 1) {
                                        if (c3 == 2) {
                                            bundle.putString("_cis", "fiam_integration");
                                            return true;
                                        }
                                    } else {
                                        bundle.putString("_cis", "fdl_integration");
                                        return true;
                                    }
                                } else {
                                    bundle.putString("_cis", "fcm_integration");
                                    return true;
                                }
                            }
                            c3 = 65535;
                            if (c3 == 0) {
                            }
                        } else {
                            if (str.equals("fdl")) {
                                c3 = 1;
                                if (c3 == 0) {
                                }
                            }
                            c3 = 65535;
                            if (c3 == 0) {
                            }
                        }
                    } else {
                        if (str.equals(PushConstants.FCM_DELIVERY_TYPE)) {
                            c3 = 0;
                            if (c3 == 0) {
                            }
                        }
                        c3 = 65535;
                        if (c3 == 0) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean bravo(Bundle bundle, String str) {
        if (!bravo.contains(str)) {
            if (bundle != null) {
                h hVar = delta;
                int i4 = hVar.silver;
                int i5 = 0;
                while (i5 < i4) {
                    boolean containsKey = bundle.containsKey((String) hVar.get(i5));
                    i5++;
                    if (containsKey) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean charlie(String str) {
        if (!charlie.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean delta(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals(PushConstants.FCM_DELIVERY_TYPE) || str.equals("fiam")) {
                    return true;
                }
            } else if (!echo.contains(str2)) {
                h hVar = foxtrot;
                int i4 = hVar.silver;
                int i5 = 0;
                while (i5 < i4) {
                    boolean matches = str2.matches((String) hVar.get(i5));
                    i5++;
                    if (matches) {
                    }
                }
                return true;
            }
        } else if (str.equals(PushConstants.FCM_DELIVERY_TYPE) || str.equals("frc")) {
            return true;
        }
        return false;
    }
}
