package delivery.samurai.android.ui.zones;

import A9.a;
import Eb.b;
import X9.g;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
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
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/zones/ZonesActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ZonesActivity extends k {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f12553I = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12554H = false;

    public ZonesActivity() {
        addOnContextAvailableListener(new b(this, 20));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12554H) {
            this.f12554H = true;
            Xc.b bVar = (Xc.b) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ZonesActivity zonesActivity = (ZonesActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) bVar).alpha;
            zonesActivity.teal = (C3403a) pVar.sierra.get();
            zonesActivity.f12038c = (C3490g) pVar.uniform.get();
            zonesActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            zonesActivity.e = (InterfaceC2960e) pVar.xray.get();
            zonesActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            zonesActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            zonesActivity.f12042h = (l) pVar.amber.get();
            zonesActivity.f12043i = (a) pVar.azure.get();
            zonesActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            zonesActivity.f12045k = (C3488e) pVar.bronze.get();
            zonesActivity.f12046l = (C3484a) pVar.coral.get();
            zonesActivity.f12047m = (i) pVar.crimson.get();
            zonesActivity.f12048n = (z9.k) pVar.cyan.get();
            zonesActivity.f12049o = (C3404b) pVar.emerald.get();
            zonesActivity.f12050p = (g) pVar.gold.get();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_zones);
        ZonesFragment zonesFragment = new ZonesFragment();
        zonesFragment.setArguments(getIntent().getExtras());
        L supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0606a c0606a = new C0606a(supportFragmentManager);
        c0606a.echo(zonesFragment, null, R.id.nav_zones_fragment);
        c0606a.india();
        ((Toolbar) findViewById(R.id.toolbar)).setNavigationOnClickListener(new Fb.b(this, 23));
    }
}
