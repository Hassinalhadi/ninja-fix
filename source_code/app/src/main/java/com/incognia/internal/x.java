package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class x extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ List f11771W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nfR f11772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(nfR nfr, List list) {
        super(1);
        this.f11772b = nfr;
        this.f11771W = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f11772b.b((SQLiteDatabase) obj, this.f11771W);
        return Unit.INSTANCE;
    }
}
