package com.incognia.internal;

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.o;
import kotlin.text.StringsKt;
import pf.AbstractC2360j;
import pf.C2351a;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class uJ5 implements zO {

    /* renamed from: W, reason: collision with root package name */
    public final File f11453W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11454b;

    /* renamed from: f9, reason: collision with root package name */
    public final AtomicLong f11455f9;
    public final AtomicLong sVU;

    public uJ5(Context context, String str, String str2) {
        this.f11454b = str2;
        File file = new File(context.getFilesDir(), str);
        this.f11453W = file;
        file.toString();
        this.f11455f9 = new AtomicLong(0L);
        this.sVU = new AtomicLong(0L);
    }

    @Override // com.incognia.internal.zO
    public final boolean W() {
        return this.f11453W.exists();
    }

    @Override // com.incognia.internal.zO
    public final void b(Map map) {
        FileOutputStream fileOutputStream = new FileOutputStream(this.f11453W, false);
        try {
            ez ezVar = new ez(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(ezVar, StandardCharsets.UTF_8), 8192);
            try {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Charset charset = StandardCharsets.UTF_8;
                    sb2.append(URLEncoder.encode(str, charset.name()));
                    sb2.append('=');
                    sb2.append(URLEncoder.encode(str2, charset.name()));
                    bufferedWriter.write(sb2.toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                this.f11455f9.addAndGet(ezVar.f10394b.get());
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2716m6.alpha(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // com.incognia.internal.zO
    public final s8 f9() {
        long j5;
        if (this.f11453W.exists()) {
            j5 = this.f11453W.length();
        } else {
            j5 = 0;
        }
        return new s8(this.f11454b, j5, this.sVU.getAndSet(0L), this.f11455f9.getAndSet(0L));
    }

    @Override // com.incognia.internal.zO
    public final LinkedHashMap sVU() {
        Object m206constructorimpl;
        if (!this.f11453W.exists()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FileInputStream fileInputStream = new FileInputStream(this.f11453W);
        try {
            Jb jb2 = new Jb(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jb2, StandardCharsets.UTF_8), 8192);
            try {
                Iterator it = ((C2351a) AbstractC2360j.delta(new o(2, bufferedReader))).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        int emerald = StringsKt.emerald(str, '=', 0, 6);
                        if (emerald >= 0) {
                            String yellow = StringsKt.yellow(emerald, str);
                            Charset charset = StandardCharsets.UTF_8;
                            String decode = URLDecoder.decode(yellow, charset.name());
                            String decode2 = URLDecoder.decode(str.substring(emerald + 1), charset.name());
                            if (decode2.length() == 0) {
                                decode2 = null;
                            }
                            linkedHashMap.put(decode, decode2);
                        }
                        m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    Result.m207exceptionOrNullimpl(m206constructorimpl);
                }
                bufferedReader.close();
                this.sVU.addAndGet(jb2.f8953b.get());
                fileInputStream.close();
                return linkedHashMap;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2716m6.alpha(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                AbstractC2716m6.alpha(fileInputStream, th4);
                throw th5;
            }
        }
    }

    @Override // com.incognia.internal.zO
    public final void b() {
        this.f11453W.delete();
    }
}
