package delivery.samurai.android.ui.support;

import A9.a;
import B2.ad;
import B2.s;
import B9.ab;
import Ba.h;
import Ca.c;
import Dc.t;
import Gc.v;
import Gc.w;
import Gc.y;
import Hc.b;
import X9.g;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Action;
import com.clevertap.android.sdk.Constants;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.support.SupportViewModel;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import r3.C2492a;
import s1.al;
import s6.AbstractC2661g5;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.S3;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;
import zendesk.support.EndUserComment;
import zendesk.support.ProviderStore;
import zendesk.support.RequestProvider;
import zendesk.support.Support;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/support/ZenDeskChatActivity;", "Ld3/k;", "", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ZenDeskChatActivity extends k {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f12498T = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12499H = false;

    /* renamed from: I, reason: collision with root package name */
    public Action f12500I;

    /* renamed from: J, reason: collision with root package name */
    public final az f12501J;

    /* renamed from: K, reason: collision with root package name */
    public Action f12502K;

    /* renamed from: L, reason: collision with root package name */
    public String f12503L;

    /* renamed from: M, reason: collision with root package name */
    public ad f12504M;

    /* renamed from: N, reason: collision with root package name */
    public final ab f12505N;

    /* renamed from: O, reason: collision with root package name */
    public final b f12506O;

    /* renamed from: P, reason: collision with root package name */
    public final c f12507P;
    public final ArrayList Q;

    /* renamed from: R, reason: collision with root package name */
    public final Ac.k f12508R;

    /* renamed from: S, reason: collision with root package name */
    public final v f12509S;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public ZenDeskChatActivity() {
        addOnContextAvailableListener(new Eb.b(this, 7));
        this.f12501J = new au(new ArrayList());
        this.f12505N = new ab(u.alpha.bravo(SupportViewModel.class), new w(this, 1), new w(this, 0), new w(this, 2));
        this.f12506O = new b(0, this);
        this.f12507P = new c(4);
        this.Q = new ArrayList();
        this.f12508R = new Ac.k(7, this);
        this.f12509S = new v(0, this);
    }

    @Override // d3.k
    public final void amber(boolean z2) {
        RequestProvider requestProvider;
        super.amber(z2);
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider != null && (requestProvider = provider.requestProvider()) != null) {
            String str = this.f12503L;
            if (str != null) {
                requestProvider.getComments(str, new Gc.u(0, this));
            } else {
                Intrinsics.lima("channelId");
                throw null;
            }
        }
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (SupportViewModel) this.f12505N.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12499H) {
            this.f12499H = true;
            y yVar = (y) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ZenDeskChatActivity zenDeskChatActivity = (ZenDeskChatActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) yVar).alpha;
            zenDeskChatActivity.teal = (C3403a) pVar.sierra.get();
            zenDeskChatActivity.f12038c = (C3490g) pVar.uniform.get();
            zenDeskChatActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            zenDeskChatActivity.e = (InterfaceC2960e) pVar.xray.get();
            zenDeskChatActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            zenDeskChatActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            zenDeskChatActivity.f12042h = (l) pVar.amber.get();
            zenDeskChatActivity.f12043i = (a) pVar.azure.get();
            zenDeskChatActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            zenDeskChatActivity.f12045k = (C3488e) pVar.bronze.get();
            zenDeskChatActivity.f12046l = (C3484a) pVar.coral.get();
            zenDeskChatActivity.f12047m = (i) pVar.crimson.get();
            zenDeskChatActivity.f12048n = (z9.k) pVar.cyan.get();
            zenDeskChatActivity.f12049o = (C3404b) pVar.emerald.get();
            zenDeskChatActivity.f12050p = (g) pVar.gold.get();
        }
    }

    public final void gold() {
        ((EditText) gray().golf).getText().clear();
        this.f12501J.postValue(new ArrayList());
        this.Q.clear();
    }

    public final ad gray() {
        ad adVar = this.f12504M;
        if (adVar != null) {
            return adVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void green(ArrayList arrayList) {
        RequestProvider requestProvider;
        EndUserComment endUserComment = new EndUserComment();
        endUserComment.setValue(((EditText) gray().golf).getText().toString());
        if (arrayList != null) {
            endUserComment.setAttachments(arrayList);
        }
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider != null && (requestProvider = provider.requestProvider()) != null) {
            String str = this.f12503L;
            if (str != null) {
                requestProvider.addComment(str, endUserComment, new Gc.u(1, this));
            } else {
                Intrinsics.lima("channelId");
                throw null;
            }
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Action action;
        RequestProvider requestProvider;
        final int i4 = 2;
        final int i5 = 1;
        final int i10 = 0;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_zendesk_chat, (ViewGroup) null, false);
        int i11 = R.id.attachmentRecyclerView;
        RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.attachmentRecyclerView, inflate);
        if (recyclerView != null) {
            i11 = R.id.btnAddAttachment;
            ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnAddAttachment, inflate);
            if (imageButton != null) {
                i11 = R.id.btnSend;
                ImageButton imageButton2 = (ImageButton) S3.bravo(R.id.btnSend, inflate);
                if (imageButton2 != null) {
                    i11 = R.id.chatContentView;
                    if (((ConstraintLayout) S3.bravo(R.id.chatContentView, inflate)) != null) {
                        i11 = R.id.chatRecyclerView;
                        RecyclerView recyclerView2 = (RecyclerView) S3.bravo(R.id.chatRecyclerView, inflate);
                        if (recyclerView2 != null) {
                            i11 = R.id.emptyView;
                            LinearLayout linearLayout = (LinearLayout) S3.bravo(R.id.emptyView, inflate);
                            if (linearLayout != null) {
                                i11 = R.id.etMessage;
                                EditText editText = (EditText) S3.bravo(R.id.etMessage, inflate);
                                if (editText != null) {
                                    i11 = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) S3.bravo(R.id.toolbar, inflate);
                                    if (toolbar != null) {
                                        this.f12504M = new ad((ConstraintLayout) inflate, recyclerView, imageButton, imageButton2, recyclerView2, linearLayout, editText, toolbar);
                                        setContentView((ConstraintLayout) gray().alpha);
                                        setSupportActionBar((Toolbar) gray().hotel);
                                        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
                                        if (supportActionBar != null) {
                                            supportActionBar.oscar(true);
                                        }
                                        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
                                        if (supportActionBar2 != null) {
                                            supportActionBar2.papa(true);
                                        }
                                        ((Toolbar) gray().hotel).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Gc.s
                                            public final /* synthetic */ ZenDeskChatActivity purple;

                                            {
                                                this.purple = this;
                                            }

                                            /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.internal.s, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r12v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                boolean z2;
                                                boolean z10;
                                                Integer num;
                                                Integer num2;
                                                boolean z11 = false;
                                                int i12 = 2;
                                                int i13 = 1;
                                                ZenDeskChatActivity zenDeskChatActivity = this.purple;
                                                switch (i10) {
                                                    case 0:
                                                        int i14 = ZenDeskChatActivity.f12498T;
                                                        zenDeskChatActivity.finish();
                                                        return;
                                                    case 1:
                                                        Action action2 = zenDeskChatActivity.f12500I;
                                                        if (action2 != null) {
                                                            z11 = action2.getCameraImagesOnly();
                                                        }
                                                        t tVar = new t(zenDeskChatActivity, i13);
                                                        g gVar = new g();
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putBoolean("show_gallery", !z11);
                                                        bundle2.putBoolean("show_camera", true);
                                                        gVar.setArguments(bundle2);
                                                        gVar.f1375r = tVar;
                                                        gVar.romeo(zenDeskChatActivity.getSupportFragmentManager(), g.class.getSimpleName());
                                                        return;
                                                    default:
                                                        Action action3 = zenDeskChatActivity.f12502K;
                                                        az azVar = zenDeskChatActivity.f12501J;
                                                        if (action3 != null) {
                                                            Action action4 = zenDeskChatActivity.f12500I;
                                                            if (action4 != null) {
                                                                z10 = action4.getImageRequired();
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            if (z10) {
                                                                Collection collection = (Collection) azVar.getValue();
                                                                if (collection == null || collection.isEmpty()) {
                                                                    z11 = true;
                                                                }
                                                                if (z11) {
                                                                    String string = zenDeskChatActivity.getString(R.string.image_required_message);
                                                                    Intrinsics.delta(string, "getString(...)");
                                                                    L9.d.pink(zenDeskChatActivity, string);
                                                                    return;
                                                                }
                                                            }
                                                            SupportViewModel supportViewModel = (SupportViewModel) zenDeskChatActivity.f12505N.getValue();
                                                            Action action5 = zenDeskChatActivity.f12502K;
                                                            if (action5 != null) {
                                                                num = action5.getId();
                                                            } else {
                                                                num = null;
                                                            }
                                                            String obj = ((EditText) zenDeskChatActivity.gray().golf).getText().toString();
                                                            List list = (List) azVar.getValue();
                                                            int intExtra = zenDeskChatActivity.getIntent().getIntExtra("orderId", -1);
                                                            if (intExtra != -1) {
                                                                num2 = Integer.valueOf(intExtra);
                                                            } else {
                                                                num2 = null;
                                                            }
                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                            BaseViewModel.launchApi$default(supportViewModel, null, new k(supportViewModel, num, obj, list, num2, auVar, null), 1, null);
                                                            auVar.observe(zenDeskChatActivity, new Dc.t(2, new t(zenDeskChatActivity, i12)));
                                                            return;
                                                        }
                                                        zenDeskChatActivity.bronze();
                                                        List list2 = (List) azVar.getValue();
                                                        if (list2 != null && list2.isEmpty()) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (z2) {
                                                            zenDeskChatActivity.green(null);
                                                            return;
                                                        }
                                                        ?? obj2 = new Object();
                                                        obj2.alpha = 1;
                                                        zenDeskChatActivity.f12508R.invoke(0, new Ac.g(8, (Object) obj2, zenDeskChatActivity));
                                                        return;
                                                }
                                            }
                                        });
                                        Serializable serializableExtra = getIntent().getSerializableExtra("action_type");
                                        if (serializableExtra instanceof Action) {
                                            action = (Action) serializableExtra;
                                        } else {
                                            action = null;
                                        }
                                        this.f12502K = action;
                                        this.f12500I = action;
                                        ((RecyclerView) gray().bravo).setLayoutManager(new LinearLayoutManager(0, false));
                                        ((RecyclerView) gray().bravo).setAdapter(this.f12506O);
                                        AbstractC2661g5.alpha((RecyclerView) gray().bravo, R.dimen.spacing_6, R.dimen.spacing_6);
                                        AbstractC2661g5.charlie((RecyclerView) gray().bravo, R.dimen.spacing_zero, R.dimen.spacing_12);
                                        this.f12501J.observe(this, new t(2, new Gc.t(this, i10)));
                                        ((ImageButton) gray().delta).setEnabled(false);
                                        ((ImageButton) gray().charlie).setOnClickListener(new View.OnClickListener(this) { // from class: Gc.s
                                            public final /* synthetic */ ZenDeskChatActivity purple;

                                            {
                                                this.purple = this;
                                            }

                                            /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.internal.s, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r12v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                boolean z2;
                                                boolean z10;
                                                Integer num;
                                                Integer num2;
                                                boolean z11 = false;
                                                int i12 = 2;
                                                int i13 = 1;
                                                ZenDeskChatActivity zenDeskChatActivity = this.purple;
                                                switch (i5) {
                                                    case 0:
                                                        int i14 = ZenDeskChatActivity.f12498T;
                                                        zenDeskChatActivity.finish();
                                                        return;
                                                    case 1:
                                                        Action action2 = zenDeskChatActivity.f12500I;
                                                        if (action2 != null) {
                                                            z11 = action2.getCameraImagesOnly();
                                                        }
                                                        t tVar = new t(zenDeskChatActivity, i13);
                                                        g gVar = new g();
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putBoolean("show_gallery", !z11);
                                                        bundle2.putBoolean("show_camera", true);
                                                        gVar.setArguments(bundle2);
                                                        gVar.f1375r = tVar;
                                                        gVar.romeo(zenDeskChatActivity.getSupportFragmentManager(), g.class.getSimpleName());
                                                        return;
                                                    default:
                                                        Action action3 = zenDeskChatActivity.f12502K;
                                                        az azVar = zenDeskChatActivity.f12501J;
                                                        if (action3 != null) {
                                                            Action action4 = zenDeskChatActivity.f12500I;
                                                            if (action4 != null) {
                                                                z10 = action4.getImageRequired();
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            if (z10) {
                                                                Collection collection = (Collection) azVar.getValue();
                                                                if (collection == null || collection.isEmpty()) {
                                                                    z11 = true;
                                                                }
                                                                if (z11) {
                                                                    String string = zenDeskChatActivity.getString(R.string.image_required_message);
                                                                    Intrinsics.delta(string, "getString(...)");
                                                                    L9.d.pink(zenDeskChatActivity, string);
                                                                    return;
                                                                }
                                                            }
                                                            SupportViewModel supportViewModel = (SupportViewModel) zenDeskChatActivity.f12505N.getValue();
                                                            Action action5 = zenDeskChatActivity.f12502K;
                                                            if (action5 != null) {
                                                                num = action5.getId();
                                                            } else {
                                                                num = null;
                                                            }
                                                            String obj = ((EditText) zenDeskChatActivity.gray().golf).getText().toString();
                                                            List list = (List) azVar.getValue();
                                                            int intExtra = zenDeskChatActivity.getIntent().getIntExtra("orderId", -1);
                                                            if (intExtra != -1) {
                                                                num2 = Integer.valueOf(intExtra);
                                                            } else {
                                                                num2 = null;
                                                            }
                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                            BaseViewModel.launchApi$default(supportViewModel, null, new k(supportViewModel, num, obj, list, num2, auVar, null), 1, null);
                                                            auVar.observe(zenDeskChatActivity, new Dc.t(2, new t(zenDeskChatActivity, i12)));
                                                            return;
                                                        }
                                                        zenDeskChatActivity.bronze();
                                                        List list2 = (List) azVar.getValue();
                                                        if (list2 != null && list2.isEmpty()) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (z2) {
                                                            zenDeskChatActivity.green(null);
                                                            return;
                                                        }
                                                        ?? obj2 = new Object();
                                                        obj2.alpha = 1;
                                                        zenDeskChatActivity.f12508R.invoke(0, new Ac.g(8, (Object) obj2, zenDeskChatActivity));
                                                        return;
                                                }
                                            }
                                        });
                                        ((EditText) gray().golf).addTextChangedListener(new h(4, this));
                                        ((ImageButton) gray().delta).setOnClickListener(new View.OnClickListener(this) { // from class: Gc.s
                                            public final /* synthetic */ ZenDeskChatActivity purple;

                                            {
                                                this.purple = this;
                                            }

                                            /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.internal.s, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r12v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                boolean z2;
                                                boolean z10;
                                                Integer num;
                                                Integer num2;
                                                boolean z11 = false;
                                                int i12 = 2;
                                                int i13 = 1;
                                                ZenDeskChatActivity zenDeskChatActivity = this.purple;
                                                switch (i4) {
                                                    case 0:
                                                        int i14 = ZenDeskChatActivity.f12498T;
                                                        zenDeskChatActivity.finish();
                                                        return;
                                                    case 1:
                                                        Action action2 = zenDeskChatActivity.f12500I;
                                                        if (action2 != null) {
                                                            z11 = action2.getCameraImagesOnly();
                                                        }
                                                        t tVar = new t(zenDeskChatActivity, i13);
                                                        g gVar = new g();
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putBoolean("show_gallery", !z11);
                                                        bundle2.putBoolean("show_camera", true);
                                                        gVar.setArguments(bundle2);
                                                        gVar.f1375r = tVar;
                                                        gVar.romeo(zenDeskChatActivity.getSupportFragmentManager(), g.class.getSimpleName());
                                                        return;
                                                    default:
                                                        Action action3 = zenDeskChatActivity.f12502K;
                                                        az azVar = zenDeskChatActivity.f12501J;
                                                        if (action3 != null) {
                                                            Action action4 = zenDeskChatActivity.f12500I;
                                                            if (action4 != null) {
                                                                z10 = action4.getImageRequired();
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            if (z10) {
                                                                Collection collection = (Collection) azVar.getValue();
                                                                if (collection == null || collection.isEmpty()) {
                                                                    z11 = true;
                                                                }
                                                                if (z11) {
                                                                    String string = zenDeskChatActivity.getString(R.string.image_required_message);
                                                                    Intrinsics.delta(string, "getString(...)");
                                                                    L9.d.pink(zenDeskChatActivity, string);
                                                                    return;
                                                                }
                                                            }
                                                            SupportViewModel supportViewModel = (SupportViewModel) zenDeskChatActivity.f12505N.getValue();
                                                            Action action5 = zenDeskChatActivity.f12502K;
                                                            if (action5 != null) {
                                                                num = action5.getId();
                                                            } else {
                                                                num = null;
                                                            }
                                                            String obj = ((EditText) zenDeskChatActivity.gray().golf).getText().toString();
                                                            List list = (List) azVar.getValue();
                                                            int intExtra = zenDeskChatActivity.getIntent().getIntExtra("orderId", -1);
                                                            if (intExtra != -1) {
                                                                num2 = Integer.valueOf(intExtra);
                                                            } else {
                                                                num2 = null;
                                                            }
                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                            BaseViewModel.launchApi$default(supportViewModel, null, new k(supportViewModel, num, obj, list, num2, auVar, null), 1, null);
                                                            auVar.observe(zenDeskChatActivity, new Dc.t(2, new t(zenDeskChatActivity, i12)));
                                                            return;
                                                        }
                                                        zenDeskChatActivity.bronze();
                                                        List list2 = (List) azVar.getValue();
                                                        if (list2 != null && list2.isEmpty()) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (z2) {
                                                            zenDeskChatActivity.green(null);
                                                            return;
                                                        }
                                                        ?? obj2 = new Object();
                                                        obj2.alpha = 1;
                                                        zenDeskChatActivity.f12508R.invoke(0, new Ac.g(8, (Object) obj2, zenDeskChatActivity));
                                                        return;
                                                }
                                            }
                                        });
                                        if (this.f12502K == null) {
                                            String stringExtra = getIntent().getStringExtra(Constants.KEY_ID);
                                            if (stringExtra == null) {
                                                stringExtra = "-1";
                                            }
                                            this.f12503L = stringExtra;
                                            bronze();
                                            ((RecyclerView) gray().echo).setLayoutManager(new LinearLayoutManager(1, true));
                                            ((RecyclerView) gray().echo).setAdapter(this.f12507P);
                                            ProviderStore provider = Support.INSTANCE.provider();
                                            if (provider != null && (requestProvider = provider.requestProvider()) != null) {
                                                String str = this.f12503L;
                                                if (str != null) {
                                                    requestProvider.getComments(str, new Gc.u(i10, this));
                                                } else {
                                                    Intrinsics.lima("channelId");
                                                    throw null;
                                                }
                                            }
                                        }
                                        ad gray = gray();
                                        s sVar = new s(6, this);
                                        WeakHashMap weakHashMap = s1.au.alpha;
                                        al.lima((ConstraintLayout) gray.alpha, sVar);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final void onPause() {
        super.onPause();
        W1.b.alpha(this).delta(this.f12509S);
    }

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final void onResume() {
        super.onResume();
        W1.b.alpha(this).bravo(this.f12509S, k.f12034E);
    }
}
