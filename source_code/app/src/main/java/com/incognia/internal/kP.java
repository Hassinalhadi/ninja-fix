package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.am;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.CRC32;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kP implements Gg {

    /* renamed from: W, reason: collision with root package name */
    public final Ssq f10755W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f10756b;

    /* renamed from: f9, reason: collision with root package name */
    public D5f f10757f9 = aNe.f10097b;
    public static final String sVU = (String) wGk.Qs.getValue();
    public static final String gmP = (String) wGk.Wjn.getValue();

    public kP(pl2 pl2Var, Ssq ssq) {
        this.f10756b = pl2Var;
        this.f10755W = ssq;
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f10757f9 = tOI.f11377b;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10756b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f10757f9 = b66.f10146b;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f10757f9;
    }

    public final void b(i1 i1Var) {
        if (njO.b(this, new am(9, this, i1Var))) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        i1Var.b(Result.m206constructorimpl(ResultKt.createFailure(new KcS(sVU))));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(kP kPVar, Function1 function1) {
        File file;
        Long l10;
        int read;
        r3 b2 = kPVar.f10755W.b();
        Long valueOf = b2 != null ? Long.valueOf(b2.f11198W) : null;
        if (b2 != null) {
            kT kTVar = QHn.f9492b;
            String str = gmP;
            if (kTVar.sVU(str) == null || !Intrinsics.areEqual(kTVar.sVU(str), valueOf)) {
                String str2 = b2.Qs;
                if (str2 != null) {
                    try {
                        file = new File(str2);
                    } catch (Throwable unused) {
                        file = null;
                    }
                    if (file != null) {
                        try {
                            CRC32 crc32 = new CRC32();
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                byte[] bArr = new byte[8192];
                                do {
                                    read = fileInputStream.read(bArr);
                                    if (read > 0) {
                                        crc32.update(bArr, 0, read);
                                    }
                                } while (read != -1);
                                l10 = Long.valueOf(crc32.getValue());
                                fileInputStream.close();
                            } finally {
                            }
                        } catch (Throwable unused2) {
                            l10 = null;
                        }
                        SO so = new SO(l10, file != null ? Long.valueOf(file.length()) : null);
                        kT kTVar2 = QHn.f9492b;
                        kTVar2.b(sVU, so, FZA.f8714b);
                        kTVar2.b(gmP, valueOf);
                    }
                    l10 = null;
                    SO so2 = new SO(l10, file != null ? Long.valueOf(file.length()) : null);
                    kT kTVar22 = QHn.f9492b;
                    kTVar22.b(sVU, so2, FZA.f8714b);
                    kTVar22.b(gmP, valueOf);
                }
                file = null;
                if (file != null) {
                }
                l10 = null;
                SO so22 = new SO(l10, file != null ? Long.valueOf(file.length()) : null);
                kT kTVar222 = QHn.f9492b;
                kTVar222.b(sVU, so22, FZA.f8714b);
                kTVar222.b(gmP, valueOf);
            }
        }
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl((SO) QHn.f9492b.b(Ob.f9321b, sVU)), function1);
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        this.f10757f9 = L4.f9041b;
        cj0.invoke();
    }
}
