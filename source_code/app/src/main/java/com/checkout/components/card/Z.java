package com.checkout.components.card;

import Od.a;
import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;
import yf.at;

/* loaded from: classes3.dex */
public final class Z extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveCardContainerViewModel f3984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(SaveCardContainerViewModel saveCardContainerViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3984b = saveCardContainerViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Z(this.f3984b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new Z(this.f3984b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentStateManager paymentStateManager;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3983a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            paymentStateManager = this.f3984b.f4544b;
            final at isCardValidationTriggered = paymentStateManager.getIsCardValidationTriggered();
            InterfaceC3439i interfaceC3439i = new InterfaceC3439i() { // from class: com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModel$observeValidationTriggered$1$1$invokeSuspend$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModel$observeValidationTriggered$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2<T> implements InterfaceC3440j {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC3440j f4547a;

                    @e(c = "com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModel$observeValidationTriggered$1$1$invokeSuspend$$inlined$filter$1$2", f = "SaveCardContainerViewModel.kt", l = {50}, m = "emit")
                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    /* renamed from: com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModel$observeValidationTriggered$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass1 extends c {

                        /* renamed from: a, reason: collision with root package name */
                        /* synthetic */ Object f4548a;

                        /* renamed from: b, reason: collision with root package name */
                        int f4549b;

                        /* renamed from: c, reason: collision with root package name */
                        Object f4550c;

                        /* renamed from: d, reason: collision with root package name */
                        Object f4551d;

                        /* renamed from: f, reason: collision with root package name */
                        Object f4552f;

                        /* renamed from: g, reason: collision with root package name */
                        Object f4553g;

                        public AnonymousClass1(Nd.c cVar) {
                            super(cVar);
                        }

                        @Override // Pd.a
                        public final Object invokeSuspend(Object obj) {
                            this.f4548a = obj;
                            this.f4549b |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC3440j interfaceC3440j) {
                        this.f4547a = interfaceC3440j;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // yf.InterfaceC3440j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Nd.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        int i4;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i5 = anonymousClass1.f4549b;
                            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                                anonymousClass1.f4549b = i5 - RecyclerView.UNDEFINED_DURATION;
                                Object obj2 = anonymousClass1.f4548a;
                                a aVar = a.alpha;
                                i4 = anonymousClass1.f4549b;
                                if (i4 == 0) {
                                    if (i4 == 1) {
                                        ResultKt.alpha(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.alpha(obj2);
                                    InterfaceC3440j interfaceC3440j = this.f4547a;
                                    if (((Boolean) obj).booleanValue()) {
                                        anonymousClass1.f4550c = null;
                                        anonymousClass1.f4551d = null;
                                        anonymousClass1.f4552f = null;
                                        anonymousClass1.f4553g = null;
                                        anonymousClass1.f4549b = 1;
                                        if (interfaceC3440j.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        Object obj22 = anonymousClass1.f4548a;
                        a aVar2 = a.alpha;
                        i4 = anonymousClass1.f4549b;
                        if (i4 == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // yf.InterfaceC3439i
                public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
                    Object collect = InterfaceC3439i.this.collect(new AnonymousClass2(interfaceC3440j), cVar);
                    if (collect == a.alpha) {
                        return collect;
                    }
                    return Unit.INSTANCE;
                }
            };
            Y y10 = new Y(this.f3984b);
            this.f3983a = 1;
            if (interfaceC3439i.collect(y10, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
