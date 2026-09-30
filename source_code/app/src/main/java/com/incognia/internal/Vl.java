package com.incognia.internal;

import android.os.Process;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class Vl {

    /* renamed from: b, reason: collision with root package name */
    public Runtime f9797b;

    public final synchronized Runtime b() {
        try {
            if (this.f9797b == null) {
                this.f9797b = Runtime.getRuntime();
            }
        } catch (Throwable unused) {
            return null;
        }
        return this.f9797b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(String str, Set set) {
        InputStream inputStream;
        Runtime b2;
        Process exec;
        ArrayList arrayList = new ArrayList();
        if (!set.isEmpty()) {
            try {
                b2 = b();
            } catch (Throwable unused) {
            }
            if (b2 != null && (exec = b2.exec(String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1)))) != null) {
                inputStream = exec.getInputStream();
                if (inputStream != null) {
                    return null;
                }
                Scanner scanner = new Scanner(inputStream);
                while (scanner.hasNextLine()) {
                    String lowerCase = scanner.nextLine().toLowerCase(Locale.ROOT);
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (StringsKt.beige(lowerCase, (String) it.next(), false)) {
                            arrayList.add(lowerCase);
                            break;
                        }
                    }
                }
                scanner.close();
            }
            inputStream = null;
            if (inputStream != null) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(String[] strArr, String[] strArr2) {
        InputStream inputStream;
        Scanner scanner;
        Process exec;
        String str = null;
        try {
            Runtime b2 = b();
            if (b2 != null && (exec = b2.exec(strArr, strArr2)) != null) {
                inputStream = exec.getInputStream();
                if (inputStream != null) {
                    try {
                        scanner = new Scanner(inputStream);
                    } catch (Throwable unused) {
                        scanner = null;
                        if (scanner != null) {
                            scanner.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return str;
                    }
                    try {
                        if (scanner.hasNext()) {
                            str = scanner.nextLine();
                        } else {
                            str = "";
                        }
                        scanner.close();
                        inputStream.close();
                    } catch (Throwable unused2) {
                        if (scanner != null) {
                        }
                        if (inputStream != null) {
                        }
                        return str;
                    }
                }
            }
            return str;
        } catch (Throwable unused3) {
            inputStream = null;
        }
    }
}
