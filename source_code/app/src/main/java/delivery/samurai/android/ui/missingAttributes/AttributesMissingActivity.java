package delivery.samurai.android.ui.missingAttributes;

import A9.a;
import B9.ab;
import Eb.b;
import L9.d;
import Ob.e;
import Ob.h;
import Ob.i;
import Ob.j;
import S.t;
import X9.g;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.r0;
import androidx.compose.ui.platform.ComposeView;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Attribute;
import com.app.network.network.models.AttributeActionType;
import com.app.network.network.models.AttributeGroup;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import okhttp3.internal.url._UrlKt;
import t0.A0;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/missingAttributes/AttributesMissingActivity;", "Ld3/k;", "<init>", "()V", "Ob/h", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AttributesMissingActivity extends k {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f12319a0 = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12320H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12321I;

    /* renamed from: J, reason: collision with root package name */
    public final l f12322J;

    /* renamed from: K, reason: collision with root package name */
    public AttributeGroup f12323K;

    /* renamed from: L, reason: collision with root package name */
    public List f12324L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12325M;

    /* renamed from: N, reason: collision with root package name */
    public final ax f12326N;

    /* renamed from: O, reason: collision with root package name */
    public final t f12327O;

    /* renamed from: P, reason: collision with root package name */
    public final t f12328P;
    public final ax Q;

    /* renamed from: R, reason: collision with root package name */
    public final p0 f12329R;

    /* renamed from: S, reason: collision with root package name */
    public final r0 f12330S;

    /* renamed from: T, reason: collision with root package name */
    public final ax f12331T;

    /* renamed from: U, reason: collision with root package name */
    public final ax f12332U;

    /* renamed from: V, reason: collision with root package name */
    public final ax f12333V;

    /* renamed from: W, reason: collision with root package name */
    public final ax f12334W;

    /* renamed from: X, reason: collision with root package name */
    public final ax f12335X;

    /* renamed from: Y, reason: collision with root package name */
    public final ax f12336Y;

    /* renamed from: Z, reason: collision with root package name */
    public final ax f12337Z;

    public AttributesMissingActivity() {
        addOnContextAvailableListener(new b(this, 9));
        this.f12321I = new ab(u.alpha.bravo(AttributeMissingViewModel.class), new i(this, 1), new i(this, 0), new i(this, 2));
        this.f12322J = new l();
        this.f12324L = CollectionsKt.emptyList();
        this.f12326N = C0564b.zulu(h.alpha);
        this.f12327O = new t();
        this.f12328P = new t();
        this.Q = C0564b.zulu("");
        this.f12329R = C0564b.whiskey(3);
        this.f12330S = C0564b.xray(0L);
        this.f12331T = C0564b.zulu(Boolean.FALSE);
        this.f12332U = C0564b.zulu(null);
        this.f12333V = C0564b.zulu("");
        this.f12334W = C0564b.zulu(null);
        this.f12335X = C0564b.zulu(null);
        this.f12336Y = C0564b.zulu(null);
        this.f12337Z = C0564b.zulu(null);
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AttributeMissingViewModel) this.f12321I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12320H) {
            this.f12320H = true;
            j jVar = (j) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            AttributesMissingActivity attributesMissingActivity = (AttributesMissingActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((w9.j) jVar).alpha;
            attributesMissingActivity.teal = (C3403a) pVar.sierra.get();
            attributesMissingActivity.f12038c = (C3490g) pVar.uniform.get();
            attributesMissingActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            attributesMissingActivity.e = (InterfaceC2960e) pVar.xray.get();
            attributesMissingActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            attributesMissingActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            attributesMissingActivity.f12042h = (z9.l) pVar.amber.get();
            attributesMissingActivity.f12043i = (a) pVar.azure.get();
            attributesMissingActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            attributesMissingActivity.f12045k = (C3488e) pVar.bronze.get();
            attributesMissingActivity.f12046l = (C3484a) pVar.coral.get();
            attributesMissingActivity.f12047m = (z9.i) pVar.crimson.get();
            attributesMissingActivity.f12048n = (z9.k) pVar.cyan.get();
            attributesMissingActivity.f12049o = (C3404b) pVar.emerald.get();
            attributesMissingActivity.f12050p = (g) pVar.gold.get();
        }
    }

    public final void gold() {
        if (!this.f12324L.isEmpty()) {
            Intent intent = new Intent(this, (Class<?>) AttributesMissingActivity.class);
            intent.putExtra("EXTRA_PENDING_FORCE_GROUPS", this.f12322J.india(this.f12324L));
            startActivity(intent);
            finish();
            return;
        }
        uniform(getIntent());
    }

    @Override // ae.o, android.app.Activity
    public final void onBackPressed() {
        AttributeGroup attributeGroup = this.f12323K;
        if (attributeGroup != null) {
            if (Intrinsics.areEqual(attributeGroup.getActionType(), AttributeActionType.FORCE)) {
                d.blue(lima());
                return;
            }
            return;
        }
        Intrinsics.lima("currentGroup");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("EXTRA_PENDING_FORCE_GROUPS");
        if (stringExtra == null) {
            stringExtra = _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        List list = (List) this.f12322J.echo(stringExtra, new TypeToken<List<? extends AttributeGroup>>() { // from class: delivery.samurai.android.ui.missingAttributes.AttributesMissingActivity$onCreate$listType$1
        }.getType());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            uniform(getIntent());
            return;
        }
        this.f12323K = (AttributeGroup) CollectionsKt.gold(list);
        this.f12324L = CollectionsKt.crimson(list);
        AttributeGroup attributeGroup = this.f12323K;
        if (attributeGroup != null) {
            List<Attribute> attributes = attributeGroup.getAttributes();
            if (attributes != null) {
                Iterator<T> it = attributes.iterator();
                while (it.hasNext()) {
                    String key = ((Attribute) it.next()).getKey();
                    if (key == null) {
                        key = "";
                    }
                    this.f12327O.put(key, "");
                }
            }
            ComposeView composeView = new ComposeView(this, null, 6);
            composeView.setViewCompositionStrategy(A0.alpha);
            composeView.setContent(new P.d(new e(this, 0), -719090245, true));
            setContentView(composeView);
            return;
        }
        Intrinsics.lima("currentGroup");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onDestroy() {
        AttributeGroup attributeGroup = this.f12323K;
        if (attributeGroup != null) {
            if (Intrinsics.areEqual(attributeGroup.getActionType(), AttributeActionType.FORCE) && !this.f12325M) {
                d.blue(lima());
            }
            super.onDestroy();
            return;
        }
        Intrinsics.lima("currentGroup");
        throw null;
    }
}
