package O7;

import B2.ad;
import R7.B;
import R7.as;
import R7.at;
import R7.au;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class s {
    public static final HashMap foxtrot;
    public static final String golf;
    public final Context alpha;
    public final x bravo;
    public final ad charlie;
    public final J2.e delta;
    public final D5.s echo;

    static {
        HashMap hashMap = new HashMap();
        foxtrot = hashMap;
        A0.z.oscar(5, hashMap, "armeabi", 6, "armeabi-v7a");
        A0.z.oscar(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        golf = "Crashlytics Android SDK/19.4.4";
    }

    public s(Context context, x xVar, ad adVar, J2.e eVar, D5.s sVar) {
        this.alpha = context;
        this.bravo = xVar;
        this.charlie = adVar;
        this.delta = eVar;
        this.echo = sVar;
    }

    public static at charlie(J2.i iVar, int i4) {
        String str = (String) iVar.purple;
        int i5 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) iVar.red;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        J2.i iVar2 = (J2.i) iVar.silver;
        if (i4 >= 8) {
            for (J2.i iVar3 = iVar2; iVar3 != null; iVar3 = (J2.i) iVar3.silver) {
                i5++;
            }
        }
        int i10 = i5;
        List delta = delta(stackTraceElementArr, 4);
        if (delta != null) {
            byte b2 = (byte) (0 | 1);
            at atVar = null;
            if (iVar2 != null && i10 == 0) {
                atVar = charlie(iVar2, i4 + 1);
            }
            if (b2 == 1) {
                return new at(str, (String) iVar.alpha, delta, atVar, i10);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
        }
        throw new NullPointerException("Null frames");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [R7.aw, java.lang.Object] */
    public static List delta(StackTraceElement[] stackTraceElementArr, int i4) {
        long j5;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.echo = i4;
            obj.foxtrot = (byte) (obj.foxtrot | 4);
            long j6 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j5 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j5 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j6 = stackTraceElement.getLineNumber();
            }
            obj.alpha = j5;
            byte b2 = (byte) (obj.foxtrot | 1);
            obj.foxtrot = b2;
            if (str != null) {
                obj.bravo = str;
                obj.charlie = fileName;
                obj.delta = j6;
                obj.foxtrot = (byte) (b2 | 2);
                arrayList.add(obj.alpha());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static au echo() {
        byte b2 = (byte) 1;
        if (b2 == 1) {
            return new au(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO, 0L, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b2 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }

    public final List alpha() {
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        ad adVar = this.charlie;
        String str = (String) adVar.delta;
        if (str != null) {
            if (b2 == 3) {
                return Collections.singletonList(new as(0L, 0L, str, (String) adVar.bravo));
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((b2 & 2) == 0) {
                sb2.append(" size");
            }
            throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, R7.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B bravo(int i4) {
        boolean z2;
        Float f5;
        int i5;
        long j5;
        Intent registerReceiver;
        Context context = this.alpha;
        Double d4 = null;
        boolean z10 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e) {
            e = e;
            z2 = false;
        }
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == -1 || (intExtra != 2 && intExtra != 5)) {
                z2 = false;
            } else {
                z2 = true;
            }
            try {
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    f5 = Float.valueOf(intExtra2 / intExtra3);
                }
            } catch (IllegalStateException e4) {
                e = e4;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f5 = null;
                if (f5 != null) {
                }
                if (!z2) {
                }
                i5 = 1;
                if (!f.foxtrot()) {
                    z10 = true;
                }
                long alpha = f.alpha(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j5 = alpha - memoryInfo.availMem;
                if (j5 <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                ?? obj = new Object();
                obj.alpha = d4;
                obj.bravo = i5;
                byte b2 = (byte) (obj.golf | 1);
                obj.charlie = z10;
                obj.delta = i4;
                obj.echo = j5;
                obj.foxtrot = (r7.getBlockCount() * blockSize) - (blockSize * r7.getAvailableBlocks());
                obj.golf = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
                return obj.alpha();
            }
            f5 = null;
        } else {
            f5 = null;
            z2 = false;
        }
        if (f5 != null) {
            d4 = Double.valueOf(f5.doubleValue());
        }
        if (!z2 && f5 != null) {
            if (f5.floatValue() < 0.99d) {
                i5 = 2;
            } else {
                i5 = 3;
            }
        } else {
            i5 = 1;
        }
        if (!f.foxtrot() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z10 = true;
        }
        long alpha2 = f.alpha(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j5 = alpha2 - memoryInfo2.availMem;
        if (j5 <= 0) {
            j5 = 0;
        }
        long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        ?? obj2 = new Object();
        obj2.alpha = d4;
        obj2.bravo = i5;
        byte b22 = (byte) (obj2.golf | 1);
        obj2.charlie = z10;
        obj2.delta = i4;
        obj2.echo = j5;
        obj2.foxtrot = (r7.getBlockCount() * blockSize2) - (blockSize2 * r7.getAvailableBlocks());
        obj2.golf = (byte) (((byte) (((byte) (((byte) (b22 | 2)) | 4)) | 8)) | 16);
        return obj2.alpha();
    }
}
