package com.incognia.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import kotlin.collections.o;
import pf.AbstractC2360j;

/* loaded from: classes2.dex */
public final class CF {
    public static Integer W() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return Integer.valueOf(runningAppProcessInfo.importance);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f9() {
        String processName;
        String myProcessName;
        try {
            if (CnH.b(CnH.f8484b, 33, 0, 2)) {
                myProcessName = Process.myProcessName();
                return myProcessName;
            }
            int i4 = CnH.IB;
            if (28 <= i4 && i4 <= 32) {
                processName = Application.getProcessName();
                return processName;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format((String) wGk.bvt.getValue(), Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))));
            try {
                String str = (String) AbstractC2360j.india(AbstractC2360j.papa(AbstractC2360j.delta(new o(2, bufferedReader)), new F6(this)));
                bufferedReader.close();
                return str;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
