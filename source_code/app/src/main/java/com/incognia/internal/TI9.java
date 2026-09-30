package com.incognia.internal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes2.dex */
public final class TI9 {

    /* renamed from: W, reason: collision with root package name */
    public final FW f9651W;

    /* renamed from: b, reason: collision with root package name */
    public final Vl f9652b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f9653f9 = LazyKt.lazy(new qHY(this));

    public TI9(Vl vl, FW fw) {
        this.f9652b = vl;
        this.f9651W = fw;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|3)|(7:(6:5|6|(1:8)|9|10|11)|24|25|(1:27)|29|30|(3:(1:36)|(0)|(0)))|12|13|14|(1:16)(1:48)|18|19|(1:21)(1:45)|22) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r8 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        return new com.incognia.internal.fKN(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        r8.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r8 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #2 {all -> 0x0088, blocks: (B:14:0x004a, B:16:0x0055), top: B:13:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x0089, TryCatch #3 {all -> 0x0089, blocks: (B:19:0x005b, B:21:0x0061, B:22:0x0067), top: B:18:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #5 {all -> 0x008a, blocks: (B:25:0x006d, B:27:0x0073), top: B:24:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fKN b(TI9 ti9) {
        BufferedReader bufferedReader;
        String str;
        Process process;
        BufferedReader bufferedReader2;
        StringBuilder sb2;
        Runtime b2;
        InputStream inputStream;
        String readLine;
        StringBuilder sb3;
        FW fw = ti9.f9651W;
        String str2 = (String) wGk.igw.getValue();
        fw.getClass();
        String str3 = null;
        try {
            sb3 = new StringBuilder(512);
            bufferedReader = new BufferedReader(new FileReader(str2));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            try {
                try {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 != null) {
                        sb3.append((CharSequence) readLine2, 0, Math.min(readLine2.length(), 512));
                    }
                    str = sb3.toString();
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    str = null;
                    Vl vl = ti9.f9652b;
                    String str4 = (String) wGk.mC.getValue();
                    sb2 = new StringBuilder();
                    b2 = vl.b();
                    if (b2 == null) {
                    }
                    if (process == null) {
                    }
                    bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                    }
                    bufferedReader2.close();
                }
                bufferedReader2.close();
            } catch (Throwable unused5) {
            }
            readLine = bufferedReader2.readLine();
            if (readLine != null) {
                sb2.append((CharSequence) readLine, 0, Math.min(readLine.length(), 512));
                str3 = sb2.toString();
            }
        } catch (Throwable unused6) {
            if (bufferedReader2 != null) {
            }
        }
        Vl vl2 = ti9.f9652b;
        String str42 = (String) wGk.mC.getValue();
        sb2 = new StringBuilder();
        b2 = vl2.b();
        if (b2 == null) {
            process = b2.exec(str42);
        } else {
            process = null;
        }
        if (process == null) {
            inputStream = process.getInputStream();
        } else {
            inputStream = null;
        }
        bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
    }
}
