package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.di.DiComponent;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class ak implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1788a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.e f1791d;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ ak(T.s sVar, DiComponent diComponent, Xd.l lVar, Xd.l lVar2, Xd.n nVar, PrimitiveStateRepository primitiveStateRepository, Xd.l lVar3, Function0 function0, Function0 function02, int i4) {
        this.teal = sVar;
        this.white = diComponent;
        this.yellow = lVar;
        this.f1788a = lVar2;
        this.f1789b = nVar;
        this.f1790c = primitiveStateRepository;
        this.f1791d = lVar3;
        this.purple = function0;
        this.red = function02;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                OrdersFragmentV2 ordersFragmentV2 = (OrdersFragmentV2) this.teal;
                androidx.lifecycle.az azVar = (androidx.lifecycle.az) this.white;
                Function0 function0 = this.red;
                Function0 function02 = (Function0) this.f1791d;
                AbstractC0220c.quebec(ordersFragmentV2, azVar, (yf.N) this.yellow, (yf.av) this.f1788a, (T.p) this.f1789b, (Function1) this.f1790c, this.purple, function0, function02, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                return AbstractC0979s0.a((T.s) this.teal, (DiComponent) this.white, (Xd.l) this.yellow, (Xd.l) this.f1788a, (Xd.n) this.f1789b, (PrimitiveStateRepository) this.f1790c, (Xd.l) this.f1791d, this.purple, this.red, this.silver, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ ak(OrdersFragmentV2 ordersFragmentV2, androidx.lifecycle.az azVar, yf.N n5, yf.av avVar, T.p pVar, Function1 function1, Function0 function0, Function0 function02, Function0 function03, int i4) {
        this.teal = ordersFragmentV2;
        this.white = azVar;
        this.yellow = n5;
        this.f1788a = avVar;
        this.f1789b = pVar;
        this.f1790c = function1;
        this.purple = function0;
        this.red = function02;
        this.f1791d = function03;
        this.silver = i4;
    }
}
