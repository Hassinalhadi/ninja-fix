package com.checkout.components.core;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.checkout.components.core.ui.FlowComponent;
import com.checkout.components.core.ui.FlowComponentViewRenderer;
import com.checkout.components.core.ui.model.FlowComponentConfig;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.core.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0922l extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f4815a;

    /* renamed from: b, reason: collision with root package name */
    public SnapshotStateList f4816b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f4817c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4818d;
    public PaymentMethodComponent e;

    /* renamed from: f, reason: collision with root package name */
    public int f4819f;

    /* renamed from: g, reason: collision with root package name */
    public int f4820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlowComponentViewRenderer f4821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f4822i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0922l(FlowComponentViewRenderer flowComponentViewRenderer, SnapshotStateList snapshotStateList, Nd.c cVar) {
        super(2, cVar);
        this.f4821h = flowComponentViewRenderer;
        this.f4822i = snapshotStateList;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0922l(this.f4821h, this.f4822i, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0922l(this.f4821h, this.f4822i, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005c -> B:5:0x005f). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowComponentConfig flowComponentConfig;
        Iterator it;
        SnapshotStateList snapshotStateList;
        int i4;
        FlowComponentConfig flowComponentConfig2;
        FlowComponent flowComponent;
        Od.a aVar = Od.a.alpha;
        int i5 = this.f4820g;
        if (i5 != 0) {
            if (i5 == 1) {
                i4 = this.f4819f;
                PaymentMethodComponent paymentMethodComponent = this.e;
                it = this.f4817c;
                snapshotStateList = this.f4816b;
                ResultKt.alpha(obj);
                if (((Boolean) obj).booleanValue()) {
                    snapshotStateList.add(new Pair(paymentMethodComponent.getName(), paymentMethodComponent));
                }
                if (it.hasNext()) {
                    paymentMethodComponent = (PaymentMethodComponent) it.next();
                    this.f4815a = null;
                    this.f4816b = snapshotStateList;
                    this.f4817c = it;
                    this.f4818d = null;
                    this.e = paymentMethodComponent;
                    this.f4819f = i4;
                    this.f4820g = 1;
                    obj = paymentMethodComponent.isAvailable(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                    if (it.hasNext()) {
                        flowComponentConfig2 = this.f4821h.f5035a;
                        Function1<PaymentMethodComponent, Unit> onReady = flowComponentConfig2.getComponentCallback$core_standardRelease().getOnReady();
                        if (onReady != null) {
                            flowComponent = this.f4821h.f5037c;
                            onReady.invoke(flowComponent);
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            flowComponentConfig = this.f4821h.f5035a;
            Collection<PaymentMethodComponent> values = flowComponentConfig.getComponents$core_standardRelease().values();
            SnapshotStateList snapshotStateList2 = this.f4822i;
            it = values.iterator();
            snapshotStateList = snapshotStateList2;
            i4 = 0;
            if (it.hasNext()) {
            }
        }
    }
}
