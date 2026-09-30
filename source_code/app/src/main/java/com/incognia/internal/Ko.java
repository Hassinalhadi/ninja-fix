package com.incognia.internal;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Ko extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f9023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ko(kotlin.jvm.internal.q qVar) {
        super(1);
        this.f9023b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        kotlin.jvm.internal.q qVar = this.f9023b;
        if (DatabaseUtils.queryNumEntries((SQLiteDatabase) obj, hJ.f10534W) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        qVar.alpha = z2;
        return Unit.INSTANCE;
    }
}
