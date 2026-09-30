package delivery.samurai.android.ui.deeplink;

import Eb.a;
import Eb.b;
import X9.g;
import X9.m;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.app.base.BaseViewModel;
import com.clevertap.android.sdk.Constants;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z3.C3462a;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/deeplink/DeepLinkEntryActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class DeepLinkEntryActivity extends k {

    /* renamed from: H, reason: collision with root package name */
    public boolean f12245H = false;

    public DeepLinkEntryActivity() {
        addOnContextAvailableListener(new b(this, 0));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12245H) {
            this.f12245H = true;
            a aVar = (a) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            DeepLinkEntryActivity deepLinkEntryActivity = (DeepLinkEntryActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) aVar).alpha;
            deepLinkEntryActivity.teal = (C3403a) pVar.sierra.get();
            deepLinkEntryActivity.f12038c = (C3490g) pVar.uniform.get();
            deepLinkEntryActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            deepLinkEntryActivity.e = (InterfaceC2960e) pVar.xray.get();
            deepLinkEntryActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            deepLinkEntryActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            deepLinkEntryActivity.f12042h = (l) pVar.amber.get();
            deepLinkEntryActivity.f12043i = (A9.a) pVar.azure.get();
            deepLinkEntryActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            deepLinkEntryActivity.f12045k = (C3488e) pVar.bronze.get();
            deepLinkEntryActivity.f12046l = (C3484a) pVar.coral.get();
            deepLinkEntryActivity.f12047m = (i) pVar.crimson.get();
            deepLinkEntryActivity.f12048n = (z9.k) pVar.cyan.get();
            deepLinkEntryActivity.f12049o = (C3404b) pVar.emerald.get();
            deepLinkEntryActivity.f12050p = (g) pVar.gold.get();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri uri;
        super.onCreate(bundle);
        if (m.alpha(this, "deeplink_entry_on_create")) {
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri == null) {
            Log.w("DeepLinkEntry", "No deep link URL found in intent.data");
            finish();
            return;
        }
        if (!Intrinsics.areEqual(uri.getScheme(), "samuraicaptain")) {
            C3462a.alpha("DeepLinkEntry", 12, "Rejected deep link with invalid scheme: " + uri.getScheme(), null);
            finish();
            return;
        }
        String queryParameter = uri.getQueryParameter("screen");
        String queryParameter2 = uri.getQueryParameter(Constants.KEY_ACTION);
        if (queryParameter == null && queryParameter2 == null) {
            C3462a.alpha("DeepLinkEntry", 12, "Rejected deep link without screen or action param", null);
            finish();
            return;
        }
        String uri2 = uri.toString();
        Intrinsics.delta(uri2, "toString(...)");
        C3462a.alpha("DeepLinkEntry", 12, "Routing deep link: ".concat(uri2), null);
        Intent addFlags = new Intent(this, (Class<?>) HomeActivityV2.class).addFlags(32768).addFlags(268435456);
        Intrinsics.delta(addFlags, "addFlags(...)");
        addFlags.putExtra("deeplink", uri2);
        addFlags.addFlags(335544320);
        startActivity(addFlags);
        finish();
    }
}
