package p1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import bd.ThreadFactoryC0751d;
import bv.aw;
import bv.w;
import j.q;
import j1.AbstractC1933g;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.D5;
import t6.P2;

/* loaded from: classes3.dex */
public abstract class g {
    public static final w alpha = new w(16);
    public static final ThreadPoolExecutor bravo;
    public static final Object charlie;
    public static final aw delta;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0751d(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        bravo = threadPoolExecutor;
        charlie = new Object();
        delta = new aw(0);
    }

    public static String alpha(int i4, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb2.append(((d) list.get(i5)).golf);
            sb2.append("-");
            sb2.append(i4);
            if (i5 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, all -> 0x00b1, NameNotFoundException -> 0x00b6, all -> 0x007b, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0051, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x0077, B:29:0x009c, B:32:0x00a8, B:37:0x007c, B:38:0x007f, B:39:0x0080, B:42:0x0097, B:45:0x00b2, B:46:0x00b5, B:48:0x002f, B:50:0x0037, B:53:0x003b, B:55:0x003f, B:57:0x004a, B:66:0x00b6, B:41:0x0091, B:26:0x0071), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {all -> 0x00c0, all -> 0x00b1, NameNotFoundException -> 0x00b6, all -> 0x007b, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0051, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x0077, B:29:0x009c, B:32:0x00a8, B:37:0x007c, B:38:0x007f, B:39:0x0080, B:42:0x0097, B:45:0x00b2, B:46:0x00b5, B:48:0x002f, B:50:0x0037, B:53:0x003b, B:55:0x003f, B:57:0x004a, B:66:0x00b6, B:41:0x0091, B:26:0x0071), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, all -> 0x00b1, NameNotFoundException -> 0x00b6, all -> 0x007b, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0051, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x0077, B:29:0x009c, B:32:0x00a8, B:37:0x007c, B:38:0x007f, B:39:0x0080, B:42:0x0097, B:45:0x00b2, B:46:0x00b5, B:48:0x002f, B:50:0x0037, B:53:0x003b, B:55:0x003f, B:57:0x004a, B:66:0x00b6, B:41:0x0091, B:26:0x0071), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, all -> 0x00b1, NameNotFoundException -> 0x00b6, all -> 0x007b, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0051, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x0077, B:29:0x009c, B:32:0x00a8, B:37:0x007c, B:38:0x007f, B:39:0x0080, B:42:0x0097, B:45:0x00b2, B:46:0x00b5, B:48:0x002f, B:50:0x0037, B:53:0x003b, B:55:0x003f, B:57:0x004a, B:66:0x00b6, B:41:0x0091, B:26:0x0071), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f bravo(String str, Context context, List list, int i4) {
        Typeface typeface;
        int i5;
        Typeface bravo2;
        Trace.beginSection(P2.foxtrot("getFontSync"));
        w wVar = alpha;
        try {
            typeface = (Typeface) wVar.charlie(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
        if (typeface != null) {
            return new f(typeface);
        }
        q alpha2 = c.alpha(context, list);
        int i10 = alpha2.alpha;
        List list2 = alpha2.bravo;
        if (i10 != 0) {
            if (i10 == 1) {
                i5 = -2;
                if (i5 == 0) {
                    return new f(i5);
                }
                if (list2.size() > 1 && Build.VERSION.SDK_INT >= 29) {
                    D5 d52 = AbstractC1933g.alpha;
                    Trace.beginSection(P2.foxtrot("TypefaceCompat.createFromFontInfoWithFallback"));
                    bravo2 = AbstractC1933g.alpha.charlie(i4, context, list2);
                    Trace.endSection();
                    if (bravo2 == null) {
                    }
                } else {
                    h[] hVarArr = (h[]) list2.get(0);
                    D5 d53 = AbstractC1933g.alpha;
                    Trace.beginSection(P2.foxtrot("TypefaceCompat.createFromFontInfo"));
                    bravo2 = AbstractC1933g.alpha.bravo(context, hVarArr, i4);
                    Trace.endSection();
                    if (bravo2 == null) {
                        wVar.delta(str, bravo2);
                        return new f(bravo2);
                    }
                    return new f(-3);
                }
            }
            i5 = -3;
            if (i5 == 0) {
            }
        } else {
            h[] hVarArr2 = (h[]) list2.get(0);
            if (hVarArr2 != null && hVarArr2.length != 0) {
                int length = hVarArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        int i12 = hVarArr2[i11].foxtrot;
                        if (i12 != 0) {
                            if (i12 >= 0) {
                                i5 = i12;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                if (i5 == 0) {
                }
            }
            i5 = 1;
            if (i5 == 0) {
            }
        }
        Trace.endSection();
    }
}
