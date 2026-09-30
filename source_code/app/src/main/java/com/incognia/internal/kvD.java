package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class kvD extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10788W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f10789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvD(Set set, ArrayList arrayList) {
        super(1);
        this.f10789b = set;
        this.f10788W = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Iterator it = this.f10789b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (StringsKt.beige(lowerCase, (String) it.next(), false)) {
                this.f10788W.add(str);
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
