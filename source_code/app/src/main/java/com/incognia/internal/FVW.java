package com.incognia.internal;

import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import kotlin.text.StringsKt;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class FVW {
    public static BufferedReader W() {
        try {
            return new BufferedReader(new FileReader(String.format((String) wGk.jB.getValue(), Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r2 = kotlin.text.StringsKt.b((java.lang.String) r2.get(1)).toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b() {
        String str;
        try {
            Scanner scanner = new Scanner(new File((String) wGk.MwX.getValue()));
            while (true) {
                try {
                    if (scanner.hasNextLine()) {
                        List maroon = StringsKt.maroon(scanner.nextLine(), new String[]{": "}, 6);
                        if (maroon.size() > 1 && StringsKt.beige((CharSequence) maroon.get(0), (String) wGk.RFH.getValue(), false)) {
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC2716m6.alpha(scanner, th);
                        throw th2;
                    }
                }
            }
            scanner.close();
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
