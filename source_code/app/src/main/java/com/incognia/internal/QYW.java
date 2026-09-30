package com.incognia.internal;

import android.location.Location;
import h9.C1827e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class QYW extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ toE f9502W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2 f9503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QYW(V2 v22, toE toe) {
        super(1);
        this.f9503b = v22;
        this.f9502W = toe;
    }

    public final void b(Location location) {
        V2 v22 = this.f9503b;
        njO.b(v22, new C1827e(location, this.f9502W, v22, 4));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Location) obj);
        return Unit.INSTANCE;
    }

    public static final void b(Location location, toE toe, V2 v22) {
        if (location == null) {
            toe.b(null);
        } else {
            toe.b(v22.olU.b(new Pair(location, v22.PqK.b(location))));
        }
    }
}
