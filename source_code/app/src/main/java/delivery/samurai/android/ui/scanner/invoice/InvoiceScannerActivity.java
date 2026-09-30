package delivery.samurai.android.ui.scanner.invoice;

import A9.a;
import P.d;
import X9.g;
import af.AbstractC0434e;
import android.os.Bundle;
import com.app.base.BaseViewModel;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import kotlin.Metadata;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.AbstractC3087z;
import va.C3180a;
import w9.j;
import w9.p;
import wc.C3258d;
import wc.InterfaceC3259e;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/scanner/invoice/InvoiceScannerActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class InvoiceScannerActivity extends k {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f12460I = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12461H = false;

    public InvoiceScannerActivity() {
        addOnContextAvailableListener(new C3180a(this, 5));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12461H) {
            this.f12461H = true;
            InterfaceC3259e interfaceC3259e = (InterfaceC3259e) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            InvoiceScannerActivity invoiceScannerActivity = (InvoiceScannerActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) interfaceC3259e).alpha;
            invoiceScannerActivity.teal = (C3403a) pVar.sierra.get();
            invoiceScannerActivity.f12038c = (C3490g) pVar.uniform.get();
            invoiceScannerActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            invoiceScannerActivity.e = (InterfaceC2960e) pVar.xray.get();
            invoiceScannerActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            invoiceScannerActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            invoiceScannerActivity.f12042h = (l) pVar.amber.get();
            invoiceScannerActivity.f12043i = (a) pVar.azure.get();
            invoiceScannerActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            invoiceScannerActivity.f12045k = (C3488e) pVar.bronze.get();
            invoiceScannerActivity.f12046l = (C3484a) pVar.coral.get();
            invoiceScannerActivity.f12047m = (i) pVar.crimson.get();
            invoiceScannerActivity.f12048n = (z9.k) pVar.cyan.get();
            invoiceScannerActivity.f12049o = (C3404b) pVar.emerald.get();
            invoiceScannerActivity.f12050p = (g) pVar.gold.get();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC3087z.charlie(getWindow(), true);
        getWindow().setStatusBarColor(getColor(R.color.coolgray_800));
        AbstractC0434e.alpha(this, new d(new C3258d(this, 0), 1199769122, true));
    }
}
