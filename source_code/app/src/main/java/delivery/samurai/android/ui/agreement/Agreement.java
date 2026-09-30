package delivery.samurai.android.ui.agreement;

import A9.a;
import B9.ab;
import Eb.b;
import X9.g;
import Yb.V;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AppAgreementSignatureOwnerTypeEnum;
import com.app.network.network.models.AppAgreementTypeEnum;
import com.app.network.network.models.agreement.AppAgreement;
import com.app.network.network.models.agreement.SignAppAgreementRequest;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.google.android.material.button.MaterialButton;
import com.google.gson.reflect.TypeToken;
import d.C1534h0;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.agreement.Agreement;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import h5.C1809a;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import la.c;
import la.d;
import la.h;
import okhttp3.internal.url._UrlKt;
import r3.C2492a;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/agreement/Agreement;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class Agreement extends k {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f12120R = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12121H = false;

    /* renamed from: I, reason: collision with root package name */
    public Toolbar f12122I;

    /* renamed from: J, reason: collision with root package name */
    public WebView f12123J;

    /* renamed from: K, reason: collision with root package name */
    public CheckBox f12124K;

    /* renamed from: L, reason: collision with root package name */
    public MaterialButton f12125L;

    /* renamed from: M, reason: collision with root package name */
    public final ab f12126M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f12127N;

    /* renamed from: O, reason: collision with root package name */
    public int f12128O;

    /* renamed from: P, reason: collision with root package name */
    public AppAgreementTypeEnum f12129P;
    public Long Q;

    public Agreement() {
        addOnContextAvailableListener(new b(this, 25));
        this.f12126M = new ab(u.alpha.bravo(AgreementViewModel.class), new d(this, 1), new d(this, 0), new d(this, 2));
    }

    public static Unit gold(Agreement agreement) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    public static Unit gray(Agreement agreement) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AgreementViewModel) this.f12126M.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12121H) {
            this.f12121H = true;
            h hVar = (h) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            Agreement agreement = (Agreement) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) hVar).alpha;
            agreement.teal = (C3403a) pVar.sierra.get();
            agreement.f12038c = (C3490g) pVar.uniform.get();
            agreement.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            agreement.e = (InterfaceC2960e) pVar.xray.get();
            agreement.f12040f = (InterfaceC2956a) pVar.yankee.get();
            agreement.f12041g = (InterfaceC1628b) pVar.zulu.get();
            agreement.f12042h = (l) pVar.amber.get();
            agreement.f12043i = (a) pVar.azure.get();
            agreement.f12044j = (InterfaceC1627a) pVar.black.get();
            agreement.f12045k = (C3488e) pVar.bronze.get();
            agreement.f12046l = (C3484a) pVar.coral.get();
            agreement.f12047m = (i) pVar.crimson.get();
            agreement.f12048n = (z9.k) pVar.cyan.get();
            agreement.f12049o = (C3404b) pVar.emerald.get();
            agreement.f12050p = (g) pVar.gold.get();
        }
    }

    public final void green() {
        long j5;
        int i4 = this.f12128O;
        ArrayList arrayList = this.f12127N;
        if (arrayList != null) {
            if (i4 < arrayList.size()) {
                ArrayList arrayList2 = this.f12127N;
                if (arrayList2 != null) {
                    Object obj = arrayList2.get(this.f12128O);
                    Intrinsics.delta(obj, "get(...)");
                    AppAgreement appAgreement = (AppAgreement) obj;
                    String content = appAgreement.getContent();
                    if (content == null) {
                        content = "";
                    }
                    String str = content;
                    WebView webView = this.f12123J;
                    if (webView != null) {
                        webView.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
                        CheckBox checkBox = this.f12124K;
                        if (checkBox != null) {
                            checkBox.setChecked(false);
                            MaterialButton materialButton = this.f12125L;
                            if (materialButton != null) {
                                materialButton.setEnabled(false);
                                if (appAgreement.getReadingTimeInSeconds() != null) {
                                    j5 = r2.intValue() * 1000;
                                } else {
                                    j5 = OkHttpConstants.READ_TIMEOUT_MS;
                                }
                                new V(j5, this).start();
                                ArrayList arrayList3 = this.f12127N;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() == 1) {
                                        Toolbar toolbar = this.f12122I;
                                        if (toolbar != null) {
                                            toolbar.setTitle(getString(R.string.agreement_title_screen));
                                        } else {
                                            Intrinsics.lima("toolbar");
                                            throw null;
                                        }
                                    } else {
                                        Toolbar toolbar2 = this.f12122I;
                                        if (toolbar2 != null) {
                                            Integer valueOf = Integer.valueOf(this.f12128O + 1);
                                            ArrayList arrayList4 = this.f12127N;
                                            if (arrayList4 != null) {
                                                toolbar2.setTitle(getString(R.string.agreement_title, valueOf, Integer.valueOf(arrayList4.size())));
                                            } else {
                                                Intrinsics.lima("agreements");
                                                throw null;
                                            }
                                        } else {
                                            Intrinsics.lima("toolbar");
                                            throw null;
                                        }
                                    }
                                    int i5 = this.f12128O;
                                    ArrayList arrayList5 = this.f12127N;
                                    if (arrayList5 != null) {
                                        if (i5 == arrayList5.size() - 1) {
                                            MaterialButton materialButton2 = this.f12125L;
                                            if (materialButton2 != null) {
                                                materialButton2.setText(getString(R.string.i_agree_with_timer, Integer.valueOf((int) (j5 / 1000))));
                                                return;
                                            } else {
                                                Intrinsics.lima("buttonNext");
                                                throw null;
                                            }
                                        }
                                        MaterialButton materialButton3 = this.f12125L;
                                        if (materialButton3 != null) {
                                            materialButton3.setText(getString(R.string.next_with_timer, Integer.valueOf((int) (j5 / 1000))));
                                            return;
                                        } else {
                                            Intrinsics.lima("buttonNext");
                                            throw null;
                                        }
                                    }
                                    Intrinsics.lima("agreements");
                                    throw null;
                                }
                                Intrinsics.lima("agreements");
                                throw null;
                            }
                            Intrinsics.lima("buttonNext");
                            throw null;
                        }
                        Intrinsics.lima("checkBoxAgree");
                        throw null;
                    }
                    Intrinsics.lima("htmlContentTextView");
                    throw null;
                }
                Intrinsics.lima("agreements");
                throw null;
            }
            AppAgreementTypeEnum appAgreementTypeEnum = this.f12129P;
            if (appAgreementTypeEnum != null) {
                if (appAgreementTypeEnum == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                    setResult(-1);
                }
                finish();
                return;
            }
            Intrinsics.lima("agreementType");
            throw null;
        }
        Intrinsics.lima("agreements");
        throw null;
    }

    @Override // ae.o, android.app.Activity
    public final void onBackPressed() {
        AppAgreementTypeEnum appAgreementTypeEnum = this.f12129P;
        if (appAgreementTypeEnum != null) {
            if (appAgreementTypeEnum != AppAgreementTypeEnum.ONE_SHOT && appAgreementTypeEnum == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                String string = getString(R.string.app_name);
                Intrinsics.delta(string, "getString(...)");
                String string2 = getString(R.string.confirm_back_without_sign);
                Intrinsics.delta(string2, "getString(...)");
                String string3 = getString(R.string.no);
                Intrinsics.delta(string3, "getString(...)");
                L9.d.ochre(this, string, string2, string3, new C1809a(15), getString(R.string.yes), new c(this, 0), true);
                return;
            }
            return;
        }
        Intrinsics.lima("agreementType");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, android.widget.CompoundButton$OnCheckedChangeListener] */
    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i4 = 0;
        final int i5 = 1;
        super.onCreate(bundle);
        setContentView(R.layout.activity_agreement);
        View findViewById = findViewById(R.id.toolbar);
        Intrinsics.delta(findViewById, "findViewById(...)");
        this.f12122I = (Toolbar) findViewById;
        View findViewById2 = findViewById(R.id.htmlContentTextView);
        Intrinsics.delta(findViewById2, "findViewById(...)");
        this.f12123J = (WebView) findViewById2;
        View findViewById3 = findViewById(R.id.checkBoxAgree);
        Intrinsics.delta(findViewById3, "findViewById(...)");
        this.f12124K = (CheckBox) findViewById3;
        View findViewById4 = findViewById(R.id.buttonNext);
        Intrinsics.delta(findViewById4, "findViewById(...)");
        this.f12125L = (MaterialButton) findViewById4;
        String stringExtra = getIntent().getStringExtra("agreements");
        if (stringExtra == null) {
            stringExtra = _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        Object echo = new com.google.gson.l().echo(stringExtra, new TypeToken<ArrayList<AppAgreement>>() { // from class: delivery.samurai.android.ui.agreement.Agreement$onCreate$1
        }.getType());
        Intrinsics.delta(echo, "fromJson(...)");
        this.f12127N = (ArrayList) echo;
        Serializable serializableExtra = getIntent().getSerializableExtra("agreement_type");
        Intrinsics.charlie(serializableExtra, "null cannot be cast to non-null type com.app.network.network.models.AppAgreementTypeEnum");
        this.f12129P = (AppAgreementTypeEnum) serializableExtra;
        ArrayList arrayList = this.f12127N;
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                Toolbar toolbar = this.f12122I;
                if (toolbar != null) {
                    toolbar.setTitle(getString(R.string.agreement_title_screen));
                } else {
                    Intrinsics.lima("toolbar");
                    throw null;
                }
            } else {
                Toolbar toolbar2 = this.f12122I;
                if (toolbar2 != null) {
                    Integer valueOf = Integer.valueOf(this.f12128O + 1);
                    ArrayList arrayList2 = this.f12127N;
                    if (arrayList2 != null) {
                        toolbar2.setTitle(getString(R.string.agreement_title, valueOf, Integer.valueOf(arrayList2.size())));
                    } else {
                        Intrinsics.lima("agreements");
                        throw null;
                    }
                } else {
                    Intrinsics.lima("toolbar");
                    throw null;
                }
            }
            Toolbar toolbar3 = this.f12122I;
            if (toolbar3 != null) {
                toolbar3.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: la.b
                    public final /* synthetic */ Agreement purple;

                    {
                        this.purple = this;
                    }

                    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SignAppAgreementRequest signAppAgreementRequest;
                        long j5;
                        switch (i5) {
                            case 0:
                                Agreement agreement = this.purple;
                                CheckBox checkBox = agreement.f12124K;
                                if (checkBox != null) {
                                    if (checkBox.isChecked()) {
                                        ArrayList arrayList3 = agreement.f12127N;
                                        if (arrayList3 != null) {
                                            AppAgreement appAgreement = (AppAgreement) CollectionsKt.jade(agreement.f12128O, arrayList3);
                                            if (appAgreement == null) {
                                                AppAgreementTypeEnum appAgreementTypeEnum = agreement.f12129P;
                                                if (appAgreementTypeEnum != null) {
                                                    if (appAgreementTypeEnum == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                                                        agreement.setResult(-1);
                                                    }
                                                    agreement.finish();
                                                    return;
                                                }
                                                Intrinsics.lima("agreementType");
                                                throw null;
                                            }
                                            if (appAgreement.getType() == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                                                signAppAgreementRequest = new SignAppAgreementRequest(AppAgreementSignatureOwnerTypeEnum.SHIFT, agreement.Q);
                                            } else {
                                                signAppAgreementRequest = new SignAppAgreementRequest(null, null);
                                            }
                                            SignAppAgreementRequest signAppAgreementRequest2 = signAppAgreementRequest;
                                            AgreementViewModel agreementViewModel = (AgreementViewModel) agreement.f12126M.getValue();
                                            Long id2 = appAgreement.getId();
                                            if (id2 != null) {
                                                j5 = id2.longValue();
                                            } else {
                                                j5 = 0;
                                            }
                                            long j6 = j5;
                                            ?? auVar = new au(new C2492a(2, "loading"));
                                            BaseViewModel.launchApi$default(agreementViewModel, null, new ma.f(agreementViewModel, j6, signAppAgreementRequest2, auVar, null), 1, null);
                                            auVar.observe(agreement, new Aa.f(27, new C1534h0(25, agreement)));
                                            return;
                                        }
                                        Intrinsics.lima("agreements");
                                        throw null;
                                    }
                                    String string = agreement.getString(R.string.check_agreement_to_continue);
                                    Intrinsics.delta(string, "getString(...)");
                                    L9.d.pink(agreement, string);
                                    return;
                                }
                                Intrinsics.lima("checkBoxAgree");
                                throw null;
                            default:
                                Agreement agreement2 = this.purple;
                                AppAgreementTypeEnum appAgreementTypeEnum2 = agreement2.f12129P;
                                if (appAgreementTypeEnum2 != null) {
                                    if (appAgreementTypeEnum2 != AppAgreementTypeEnum.ONE_SHOT && appAgreementTypeEnum2 == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                                        String string2 = agreement2.getString(R.string.app_name);
                                        Intrinsics.delta(string2, "getString(...)");
                                        String string3 = agreement2.getString(R.string.confirm_back_without_sign);
                                        Intrinsics.delta(string3, "getString(...)");
                                        String string4 = agreement2.getString(R.string.no);
                                        Intrinsics.delta(string4, "getString(...)");
                                        L9.d.ochre(agreement2, string2, string3, string4, new C1809a(16), agreement2.getString(R.string.yes), new c(agreement2, 1), true);
                                        return;
                                    }
                                    return;
                                }
                                Intrinsics.lima("agreementType");
                                throw null;
                        }
                    }
                });
                WebView webView = this.f12123J;
                if (webView != null) {
                    WebSettings settings = webView.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setLoadWithOverviewMode(true);
                    settings.setUseWideViewPort(true);
                    settings.setDomStorageEnabled(true);
                    settings.setBuiltInZoomControls(true);
                    settings.setDisplayZoomControls(false);
                    settings.setTextZoom(185);
                    WebView webView2 = this.f12123J;
                    if (webView2 != null) {
                        webView2.setPadding(40, 40, 40, 40);
                        WebView webView3 = this.f12123J;
                        if (webView3 != null) {
                            webView3.setInitialScale(1);
                            WebView webView4 = this.f12123J;
                            if (webView4 != null) {
                                webView4.setWebViewClient(new WebViewClient());
                                WebView webView5 = this.f12123J;
                                if (webView5 != null) {
                                    webView5.setVerticalScrollBarEnabled(false);
                                    WebView webView6 = this.f12123J;
                                    if (webView6 != null) {
                                        webView6.setHorizontalScrollBarEnabled(false);
                                        green();
                                        CheckBox checkBox = this.f12124K;
                                        if (checkBox != 0) {
                                            checkBox.setOnCheckedChangeListener(new Object());
                                            this.Q = Long.valueOf(getIntent().getLongExtra("owner_id", -1L));
                                            MaterialButton materialButton = this.f12125L;
                                            if (materialButton != null) {
                                                materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: la.b
                                                    public final /* synthetic */ Agreement purple;

                                                    {
                                                        this.purple = this;
                                                    }

                                                    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        SignAppAgreementRequest signAppAgreementRequest;
                                                        long j5;
                                                        switch (i4) {
                                                            case 0:
                                                                Agreement agreement = this.purple;
                                                                CheckBox checkBox2 = agreement.f12124K;
                                                                if (checkBox2 != null) {
                                                                    if (checkBox2.isChecked()) {
                                                                        ArrayList arrayList3 = agreement.f12127N;
                                                                        if (arrayList3 != null) {
                                                                            AppAgreement appAgreement = (AppAgreement) CollectionsKt.jade(agreement.f12128O, arrayList3);
                                                                            if (appAgreement == null) {
                                                                                AppAgreementTypeEnum appAgreementTypeEnum = agreement.f12129P;
                                                                                if (appAgreementTypeEnum != null) {
                                                                                    if (appAgreementTypeEnum == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                                                                                        agreement.setResult(-1);
                                                                                    }
                                                                                    agreement.finish();
                                                                                    return;
                                                                                }
                                                                                Intrinsics.lima("agreementType");
                                                                                throw null;
                                                                            }
                                                                            if (appAgreement.getType() == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                                                                                signAppAgreementRequest = new SignAppAgreementRequest(AppAgreementSignatureOwnerTypeEnum.SHIFT, agreement.Q);
                                                                            } else {
                                                                                signAppAgreementRequest = new SignAppAgreementRequest(null, null);
                                                                            }
                                                                            SignAppAgreementRequest signAppAgreementRequest2 = signAppAgreementRequest;
                                                                            AgreementViewModel agreementViewModel = (AgreementViewModel) agreement.f12126M.getValue();
                                                                            Long id2 = appAgreement.getId();
                                                                            if (id2 != null) {
                                                                                j5 = id2.longValue();
                                                                            } else {
                                                                                j5 = 0;
                                                                            }
                                                                            long j6 = j5;
                                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                                            BaseViewModel.launchApi$default(agreementViewModel, null, new ma.f(agreementViewModel, j6, signAppAgreementRequest2, auVar, null), 1, null);
                                                                            auVar.observe(agreement, new Aa.f(27, new C1534h0(25, agreement)));
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("agreements");
                                                                        throw null;
                                                                    }
                                                                    String string = agreement.getString(R.string.check_agreement_to_continue);
                                                                    Intrinsics.delta(string, "getString(...)");
                                                                    L9.d.pink(agreement, string);
                                                                    return;
                                                                }
                                                                Intrinsics.lima("checkBoxAgree");
                                                                throw null;
                                                            default:
                                                                Agreement agreement2 = this.purple;
                                                                AppAgreementTypeEnum appAgreementTypeEnum2 = agreement2.f12129P;
                                                                if (appAgreementTypeEnum2 != null) {
                                                                    if (appAgreementTypeEnum2 != AppAgreementTypeEnum.ONE_SHOT && appAgreementTypeEnum2 == AppAgreementTypeEnum.ON_SHIFT_JOIN) {
                                                                        String string2 = agreement2.getString(R.string.app_name);
                                                                        Intrinsics.delta(string2, "getString(...)");
                                                                        String string3 = agreement2.getString(R.string.confirm_back_without_sign);
                                                                        Intrinsics.delta(string3, "getString(...)");
                                                                        String string4 = agreement2.getString(R.string.no);
                                                                        Intrinsics.delta(string4, "getString(...)");
                                                                        L9.d.ochre(agreement2, string2, string3, string4, new C1809a(16), agreement2.getString(R.string.yes), new c(agreement2, 1), true);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                Intrinsics.lima("agreementType");
                                                                throw null;
                                                        }
                                                    }
                                                });
                                                return;
                                            } else {
                                                Intrinsics.lima("buttonNext");
                                                throw null;
                                            }
                                        }
                                        Intrinsics.lima("checkBoxAgree");
                                        throw null;
                                    }
                                    Intrinsics.lima("htmlContentTextView");
                                    throw null;
                                }
                                Intrinsics.lima("htmlContentTextView");
                                throw null;
                            }
                            Intrinsics.lima("htmlContentTextView");
                            throw null;
                        }
                        Intrinsics.lima("htmlContentTextView");
                        throw null;
                    }
                    Intrinsics.lima("htmlContentTextView");
                    throw null;
                }
                Intrinsics.lima("htmlContentTextView");
                throw null;
            }
            Intrinsics.lima("toolbar");
            throw null;
        }
        Intrinsics.lima("agreements");
        throw null;
    }
}
