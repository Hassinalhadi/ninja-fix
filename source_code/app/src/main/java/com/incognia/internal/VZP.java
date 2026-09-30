package com.incognia.internal;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class VZP extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ nfR f9782W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f9783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VZP(kotlin.jvm.internal.q qVar, nfR nfr) {
        super(1);
        this.f9783b = qVar;
        this.f9782W = nfr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        kotlin.jvm.internal.q qVar = this.f9783b;
        long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, this.f9782W.f10962W.gmP());
        this.f9782W.getClass();
        if (queryNumEntries < 500) {
            long length = new File(sQLiteDatabase.getPath()).length();
            this.f9782W.getClass();
            if (length < 1048576) {
                z2 = false;
                qVar.alpha = z2;
                return Unit.INSTANCE;
            }
        }
        z2 = true;
        qVar.alpha = z2;
        return Unit.INSTANCE;
    }
}
