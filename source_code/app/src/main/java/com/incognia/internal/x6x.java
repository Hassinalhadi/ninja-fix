package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class x6x extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f11775W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f11776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x6x(Function1 function1, SQLiteDatabase sQLiteDatabase) {
        super(0);
        this.f11776b = (Lambda) function1;
        this.f11775W = sQLiteDatabase;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f11776b.invoke(this.f11775W);
        return Unit.INSTANCE;
    }
}
