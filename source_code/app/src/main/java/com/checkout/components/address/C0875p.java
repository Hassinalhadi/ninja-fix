package com.checkout.components.address;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.address.utils.ContactDataUtilsKt;
import com.checkout.components.interfaces.model.contact.Country;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* renamed from: com.checkout.components.address.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0875p implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f3903a;

    public C0875p(InterfaceC3440j interfaceC3440j) {
        this.f3903a = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        C0874o c0874o;
        int i4;
        if (cVar instanceof C0874o) {
            c0874o = (C0874o) cVar;
            int i5 = c0874o.f3898b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0874o.f3898b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c0874o.f3897a;
                Od.a aVar = Od.a.alpha;
                i4 = c0874o.f3898b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f3903a;
                    Boolean valueOf = Boolean.valueOf(ContactDataUtilsKt.getPAYOUT_REQUIRED_COUNTRIES().contains((Country) obj));
                    c0874o.f3899c = null;
                    c0874o.e = null;
                    c0874o.f3901f = null;
                    c0874o.f3902g = null;
                    c0874o.f3898b = 1;
                    if (interfaceC3440j.emit(valueOf, c0874o) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c0874o = new C0874o(this, cVar);
        Object obj22 = c0874o.f3897a;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0874o.f3898b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
