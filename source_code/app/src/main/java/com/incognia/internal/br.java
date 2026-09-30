package com.incognia.internal;

import android.os.SystemClock;
import h9.C1834l;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class br extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ urQ f10204W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oBS f10205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(urQ urq, oBS obs) {
        super(1);
        this.f10205b = obs;
        this.f10204W = urq;
    }

    public final void b(JMS jms) {
        JSONObject jSONObject;
        if (jms != null && (jSONObject = jms.f8947b) != null) {
            urQ urq = this.f10204W;
            njO.b(urq, new C1834l(urq, jSONObject, jms, this.f10205b, 3));
        } else if (this.f10205b != null) {
            oBS.b(urQ.DOu);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((JMS) obj);
        return Unit.INSTANCE;
    }

    public static final void b(urQ urq, JSONObject jSONObject, JMS jms, Function1 function1) {
        urq.f11503V = false;
        urq.f11504W.f9574b.set(jSONObject);
        Iterator it = urq.gmP.iterator();
        while (it.hasNext()) {
            ((sX) it.next()).b(urq.f11504W);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = jms.f8946W;
        QHn.f9491W.b(xIA.f11783b, new Am(jSONObject, elapsedRealtime, l10 != null ? l10.longValue() : 0L), jSM.f10688b);
        if (function1 != null) {
            function1.invoke(urQ.DOu);
        }
    }
}
