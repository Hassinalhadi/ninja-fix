package delivery.samurai.android.ui.auth.signup;

import A0.z;
import B9.AbstractC0063s;
import B9.ab;
import Ba.h;
import Jb.C0211t;
import L9.d;
import X9.g;
import a4.s;
import a4.t;
import a4.w;
import a4.y;
import ah.a;
import ah.b;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Bank;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.PlatformListResponse;
import com.canhub.cropper.CropImageOptions;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import k4.C2007a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import s6.L5;
import sb.C2844c;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.AbstractC3056s3;
import t6.S2;
import t6.T2;
import va.C3180a;
import wa.j;
import wa.m;
import wa.p;
import wa.q;
import y9.C3403a;
import y9.C3404b;
import z3.C3462a;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signup/SignUpActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class SignUpActivity extends k {

    /* renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f12184d0 = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12185H = false;

    /* renamed from: I, reason: collision with root package name */
    public final b f12186I;

    /* renamed from: J, reason: collision with root package name */
    public final ab f12187J;

    /* renamed from: K, reason: collision with root package name */
    public AbstractC0063s f12188K;

    /* renamed from: L, reason: collision with root package name */
    public int f12189L;

    /* renamed from: M, reason: collision with root package name */
    public Country f12190M;

    /* renamed from: N, reason: collision with root package name */
    public Bank f12191N;

    /* renamed from: O, reason: collision with root package name */
    public String f12192O;

    /* renamed from: P, reason: collision with root package name */
    public PlatformListResponse f12193P;
    public Country Q;

    /* renamed from: R, reason: collision with root package name */
    public City f12194R;

    /* renamed from: S, reason: collision with root package name */
    public String f12195S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f12196T;

    /* renamed from: U, reason: collision with root package name */
    public final az f12197U;

    /* renamed from: V, reason: collision with root package name */
    public L5 f12198V;

    /* renamed from: W, reason: collision with root package name */
    public final b f12199W;

    /* renamed from: X, reason: collision with root package name */
    public final b f12200X;

    /* renamed from: Y, reason: collision with root package name */
    public final h f12201Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C0211t f12202Z;

    /* renamed from: a0, reason: collision with root package name */
    public final j f12203a0;

    /* renamed from: b0, reason: collision with root package name */
    public final j f12204b0;

    /* renamed from: c0, reason: collision with root package name */
    public final j f12205c0;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public SignUpActivity() {
        addOnContextAvailableListener(new C3180a(this, 4));
        final int i4 = 0;
        this.f12186I = registerForActivityResult(new s(0), new a(this) { // from class: wa.l
            public final /* synthetic */ SignUpActivity purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                boolean z2;
                SignUpActivity signUpActivity = this.purple;
                String str = null;
                switch (i4) {
                    case 0:
                        w result = (w) obj;
                        int i5 = SignUpActivity.f12184d0;
                        Intrinsics.echo(result, "result");
                        Exception exc = result.red;
                        if (exc == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Uri uri = result.purple;
                            if (uri != null) {
                                File file = new File(signUpActivity.getCacheDir().getAbsolutePath() + "/samurai_" + System.currentTimeMillis() + ".jpg");
                                file.createNewFile();
                                String uri2 = uri.toString();
                                Intrinsics.delta(uri2, "toString(...)");
                                L9.d.crimson(signUpActivity, uri2, new C2007a(15, file, signUpActivity), 512);
                                return;
                            }
                            return;
                        }
                        if (exc != null) {
                            str = exc.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (!StringsKt.beige(str, "canceled", true) && !StringsKt.beige(str, "cancelled", true) && !StringsKt.gray(str)) {
                            L9.d.pink(signUpActivity, str);
                            return;
                        }
                        return;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i10 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Camera permission result received. Granted=" + booleanValue, null);
                        L5 l52 = signUpActivity.f12198V;
                        if (l52 != null) {
                            l52.alpha(booleanValue);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i11 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Gallery permission result received. Granted=" + booleanValue2, null);
                        L5 l53 = signUpActivity.f12198V;
                        if (l53 != null) {
                            l53.bravo(booleanValue2);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12187J = new ab(u.alpha.bravo(AuthViewModel.class), new p(this, 1), new p(this, 0), new p(this, 2));
        this.f12189L = -1;
        this.f12197U = new au(new HashMap());
        final int i5 = 1;
        this.f12199W = registerForActivityResult(new s(4), new a(this) { // from class: wa.l
            public final /* synthetic */ SignUpActivity purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                boolean z2;
                SignUpActivity signUpActivity = this.purple;
                String str = null;
                switch (i5) {
                    case 0:
                        w result = (w) obj;
                        int i52 = SignUpActivity.f12184d0;
                        Intrinsics.echo(result, "result");
                        Exception exc = result.red;
                        if (exc == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Uri uri = result.purple;
                            if (uri != null) {
                                File file = new File(signUpActivity.getCacheDir().getAbsolutePath() + "/samurai_" + System.currentTimeMillis() + ".jpg");
                                file.createNewFile();
                                String uri2 = uri.toString();
                                Intrinsics.delta(uri2, "toString(...)");
                                L9.d.crimson(signUpActivity, uri2, new C2007a(15, file, signUpActivity), 512);
                                return;
                            }
                            return;
                        }
                        if (exc != null) {
                            str = exc.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (!StringsKt.beige(str, "canceled", true) && !StringsKt.beige(str, "cancelled", true) && !StringsKt.gray(str)) {
                            L9.d.pink(signUpActivity, str);
                            return;
                        }
                        return;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i10 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Camera permission result received. Granted=" + booleanValue, null);
                        L5 l52 = signUpActivity.f12198V;
                        if (l52 != null) {
                            l52.alpha(booleanValue);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i11 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Gallery permission result received. Granted=" + booleanValue2, null);
                        L5 l53 = signUpActivity.f12198V;
                        if (l53 != null) {
                            l53.bravo(booleanValue2);
                            return;
                        }
                        return;
                }
            }
        });
        final int i10 = 2;
        this.f12200X = registerForActivityResult(new s(4), new a(this) { // from class: wa.l
            public final /* synthetic */ SignUpActivity purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                boolean z2;
                SignUpActivity signUpActivity = this.purple;
                String str = null;
                switch (i10) {
                    case 0:
                        w result = (w) obj;
                        int i52 = SignUpActivity.f12184d0;
                        Intrinsics.echo(result, "result");
                        Exception exc = result.red;
                        if (exc == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Uri uri = result.purple;
                            if (uri != null) {
                                File file = new File(signUpActivity.getCacheDir().getAbsolutePath() + "/samurai_" + System.currentTimeMillis() + ".jpg");
                                file.createNewFile();
                                String uri2 = uri.toString();
                                Intrinsics.delta(uri2, "toString(...)");
                                L9.d.crimson(signUpActivity, uri2, new C2007a(15, file, signUpActivity), 512);
                                return;
                            }
                            return;
                        }
                        if (exc != null) {
                            str = exc.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (!StringsKt.beige(str, "canceled", true) && !StringsKt.beige(str, "cancelled", true) && !StringsKt.gray(str)) {
                            L9.d.pink(signUpActivity, str);
                            return;
                        }
                        return;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i102 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Camera permission result received. Granted=" + booleanValue, null);
                        L5 l52 = signUpActivity.f12198V;
                        if (l52 != null) {
                            l52.alpha(booleanValue);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i11 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Gallery permission result received. Granted=" + booleanValue2, null);
                        L5 l53 = signUpActivity.f12198V;
                        if (l53 != null) {
                            l53.bravo(booleanValue2);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12201Y = new h(7, this);
        this.f12202Z = new C0211t(4, this);
        this.f12203a0 = new j(this, 16);
        this.f12204b0 = new j(this, 17);
        this.f12205c0 = new j(this, 18);
    }

    public static Unit gold(SignUpActivity signUpActivity) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return indigo();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12185H) {
            this.f12185H = true;
            q qVar = (q) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            SignUpActivity signUpActivity = (SignUpActivity) UnsafeCasts.unsafeCast(this);
            w9.p pVar = ((w9.j) qVar).alpha;
            signUpActivity.teal = (C3403a) pVar.sierra.get();
            signUpActivity.f12038c = (C3490g) pVar.uniform.get();
            signUpActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            signUpActivity.e = (InterfaceC2960e) pVar.xray.get();
            signUpActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            signUpActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            signUpActivity.f12042h = (l) pVar.amber.get();
            signUpActivity.f12043i = (A9.a) pVar.azure.get();
            signUpActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            signUpActivity.f12045k = (C3488e) pVar.bronze.get();
            signUpActivity.f12046l = (C3484a) pVar.coral.get();
            signUpActivity.f12047m = (i) pVar.crimson.get();
            signUpActivity.f12048n = (z9.k) pVar.cyan.get();
            signUpActivity.f12049o = (C3404b) pVar.emerald.get();
            signUpActivity.f12050p = (g) pVar.gold.get();
        }
    }

    public final void gray(int i4) {
        this.f12189L = i4;
        C3462a.alpha("SIGNUP", 12, z.juliet("captureImage requestId=", i4, i4, " currentImageRequest="), null);
        wa.h hVar = new wa.h(this, 1);
        wa.h hVar2 = new wa.h(this, 2);
        final int i5 = 0;
        Xd.l lVar = new Xd.l(this) { // from class: wa.o
            public final /* synthetic */ SignUpActivity purple;

            {
                this.purple = this;
            }

            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                int i10;
                SignUpActivity signUpActivity = this.purple;
                switch (i5) {
                    case 0:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        int i11 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Launching cropper includeCamera=" + booleanValue + " includeGallery=" + booleanValue2, null);
                        signUpActivity.getClass();
                        CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
                        cropImageOptions.purple = booleanValue;
                        cropImageOptions.alpha = booleanValue2;
                        signUpActivity.f12186I.alpha(new t(cropImageOptions));
                        return Unit.INSTANCE;
                    default:
                        String which = (String) obj;
                        Function0 onOpen = (Function0) obj2;
                        int i12 = SignUpActivity.f12184d0;
                        Intrinsics.echo(which, "which");
                        Intrinsics.echo(onOpen, "onOpen");
                        if (Intrinsics.areEqual(which, "android.permission.CAMERA")) {
                            i10 = R.string.permission_required_msg_camera;
                        } else {
                            i10 = R.string.permission_required_msg_gallery;
                        }
                        C3462a.alpha("SIGNUP", 12, "Show settings dialog for ".concat(which), null);
                        new AlertDialog.Builder(signUpActivity).setTitle(R.string.permission_required_title).setMessage(i10).setPositiveButton(R.string.open_settings, new Da.l(onOpen, 4)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                        return Unit.INSTANCE;
                }
            }
        };
        final int i10 = 1;
        L5 l52 = new L5(this, hVar, hVar2, lVar, new Xd.l(this) { // from class: wa.o
            public final /* synthetic */ SignUpActivity purple;

            {
                this.purple = this;
            }

            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                int i102;
                SignUpActivity signUpActivity = this.purple;
                switch (i10) {
                    case 0:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        int i11 = SignUpActivity.f12184d0;
                        C3462a.alpha("SIGNUP", 12, "Launching cropper includeCamera=" + booleanValue + " includeGallery=" + booleanValue2, null);
                        signUpActivity.getClass();
                        CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
                        cropImageOptions.purple = booleanValue;
                        cropImageOptions.alpha = booleanValue2;
                        signUpActivity.f12186I.alpha(new t(cropImageOptions));
                        return Unit.INSTANCE;
                    default:
                        String which = (String) obj;
                        Function0 onOpen = (Function0) obj2;
                        int i12 = SignUpActivity.f12184d0;
                        Intrinsics.echo(which, "which");
                        Intrinsics.echo(onOpen, "onOpen");
                        if (Intrinsics.areEqual(which, "android.permission.CAMERA")) {
                            i102 = R.string.permission_required_msg_camera;
                        } else {
                            i102 = R.string.permission_required_msg_gallery;
                        }
                        C3462a.alpha("SIGNUP", 12, "Show settings dialog for ".concat(which), null);
                        new AlertDialog.Builder(signUpActivity).setTitle(R.string.permission_required_title).setMessage(i102).setPositiveButton(R.string.open_settings, new Da.l(onOpen, 4)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                        return Unit.INSTANCE;
                }
            }
        });
        this.f12198V = l52;
        l52.charlie();
    }

    public final AbstractC0063s green() {
        AbstractC0063s abstractC0063s = this.f12188K;
        if (abstractC0063s != null) {
            return abstractC0063s;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final AuthViewModel indigo() {
        return (AuthViewModel) this.f12187J.getValue();
    }

    public final Fc.b ivory() {
        Fc.b bVar;
        this.f12196T = false;
        HashMap hashMap = (HashMap) this.f12197U.getValue();
        if (hashMap == null) {
            return Fc.b.purple;
        }
        TextInputLayout ilFName = green().f635S;
        Intrinsics.delta(ilFName, "ilFName");
        if (StringsKt.gray(S2.bravo(ilFName))) {
            bVar = Fc.b.red;
        } else {
            TextInputLayout ilLName = green().f640X;
            Intrinsics.delta(ilLName, "ilLName");
            if (StringsKt.gray(S2.bravo(ilLName))) {
                bVar = Fc.b.silver;
            } else {
                TextInputLayout ilIDNumber = green().f637U;
                Intrinsics.delta(ilIDNumber, "ilIDNumber");
                if (StringsKt.gray(S2.bravo(ilIDNumber))) {
                    bVar = Fc.b.teal;
                } else {
                    TextInputLayout ilDob = green().f634R;
                    Intrinsics.delta(ilDob, "ilDob");
                    if (StringsKt.gray(S2.bravo(ilDob))) {
                        bVar = Fc.b.white;
                    } else {
                        TextInputLayout ilPreference = green().f644b0;
                        Intrinsics.delta(ilPreference, "ilPreference");
                        if (StringsKt.gray(S2.bravo(ilPreference))) {
                            bVar = Fc.b.yellow;
                        } else {
                            TextInputLayout ilPlatform = green().f643a0;
                            Intrinsics.delta(ilPlatform, "ilPlatform");
                            if (StringsKt.gray(S2.bravo(ilPlatform))) {
                                bVar = Fc.b.f1296a;
                            } else {
                                TextInputLayout ilNationality = green().f642Z;
                                Intrinsics.delta(ilNationality, "ilNationality");
                                if (StringsKt.gray(S2.bravo(ilNationality))) {
                                    bVar = Fc.b.f1299d;
                                } else {
                                    TextInputLayout ilCountry = green().Q;
                                    Intrinsics.delta(ilCountry, "ilCountry");
                                    if (StringsKt.gray(S2.bravo(ilCountry))) {
                                        bVar = Fc.b.e;
                                    } else {
                                        TextInputLayout ilCity = green().f633P;
                                        Intrinsics.delta(ilCity, "ilCity");
                                        if (StringsKt.gray(S2.bravo(ilCity))) {
                                            bVar = Fc.b.f1300f;
                                        } else {
                                            TextInputLayout ilMobileNo = green().f641Y;
                                            Intrinsics.delta(ilMobileNo, "ilMobileNo");
                                            if (StringsKt.gray(S2.bravo(ilMobileNo))) {
                                                bVar = Fc.b.f1301g;
                                            } else {
                                                TextInputLayout ilFintechId = green().f636T;
                                                Intrinsics.delta(ilFintechId, "ilFintechId");
                                                if (StringsKt.gray(S2.bravo(ilFintechId))) {
                                                    bVar = Fc.b.f1302h;
                                                } else {
                                                    TextInputLayout ilVehiclePlate = green().f646d0;
                                                    Intrinsics.delta(ilVehiclePlate, "ilVehiclePlate");
                                                    if (StringsKt.gray(S2.bravo(ilVehiclePlate))) {
                                                        bVar = Fc.b.f1297b;
                                                    } else {
                                                        TextInputLayout ilVehicleSequenceNumber = green().f647e0;
                                                        Intrinsics.delta(ilVehicleSequenceNumber, "ilVehicleSequenceNumber");
                                                        if (StringsKt.gray(S2.bravo(ilVehicleSequenceNumber))) {
                                                            bVar = Fc.b.f1298c;
                                                        } else {
                                                            boolean containsKey = hashMap.containsKey(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY));
                                                            if (this.f12195S != null) {
                                                                return Fc.b.purple;
                                                            }
                                                            if (!containsKey) {
                                                                bVar = Fc.b.f1303i;
                                                            } else if (!hashMap.containsKey(1002)) {
                                                                bVar = Fc.b.f1304j;
                                                            } else if (!hashMap.containsKey(1003)) {
                                                                bVar = Fc.b.f1305k;
                                                            } else if (!hashMap.containsKey(1004)) {
                                                                bVar = Fc.b.f1306l;
                                                            } else {
                                                                bVar = Fc.b.purple;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f12196T = true;
        return bVar;
    }

    @Override // ae.o, android.app.Activity
    public final void onBackPressed() {
        if ((((HashMap) this.f12197U.getValue()) != null && (!r0.isEmpty())) || this.f12196T) {
            String string = getString(R.string.attention);
            Intrinsics.delta(string, "getString(...)");
            String string2 = getString(R.string.there_is_some_unsaved_progress);
            Intrinsics.delta(string2, "getString(...)");
            String string3 = getString(R.string.yes);
            Intrinsics.delta(string3, "getString(...)");
            d.olive(this, string, string2, string3, new wa.h(this, 0), getString(R.string.no), new C2844c(9), 64);
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TextInputEditText textInputEditText;
        int i4;
        int i5;
        int i10 = 3;
        int i11 = 2;
        int i12 = 11;
        int i13 = 10;
        int i14 = 9;
        int i15 = 8;
        int i16 = 15;
        int i17 = 0;
        int i18 = 14;
        int i19 = 1;
        super.onCreate(bundle);
        int i20 = 13;
        LayoutInflater layoutInflater = getLayoutInflater();
        int i21 = AbstractC0063s.f620w0;
        int i22 = 12;
        AbstractC0063s abstractC0063s = (AbstractC0063s) z1.d.charlie(layoutInflater, R.layout.activity_sign_up, null, false);
        Intrinsics.delta(abstractC0063s, "inflate(...)");
        this.f12188K = abstractC0063s;
        setContentView(green().red);
        ImageButton imageButton = green().f660l;
        j jVar = this.f12203a0;
        imageButton.setOnClickListener(jVar);
        green().f673r0.setOnClickListener(jVar);
        ImageButton imageButton2 = green().f648f;
        j jVar2 = this.f12204b0;
        imageButton2.setOnClickListener(jVar2);
        green().f669p0.setOnClickListener(jVar2);
        ImageButton imageButton3 = green().f658k;
        j jVar3 = this.f12205c0;
        imageButton3.setOnClickListener(jVar3);
        green().f671q0.setOnClickListener(jVar3);
        green().f667o0.setNavigationOnClickListener(new j(this, i17));
        green().f628K.setOnClickListener(new j(this, 4));
        green().f627J.setOnClickListener(new j(this, 5));
        green().f629L.setOnClickListener(new j(this, 6));
        green().f630M.setOnClickListener(new j(this, 7));
        if (this.f12195S == null && d.whiskey(this)) {
            textInputEditText = green().C;
        } else {
            textInputEditText = green().f683y;
        }
        textInputEditText.setOnEditorActionListener(new Ba.l(i19, this));
        green().f674s.setOnClickListener(new j(this, i15));
        green().f684z.setOnClickListener(new j(this, i14));
        green().f672r.setOnClickListener(new j(this, i13));
        green().f670q.setOnClickListener(new j(this, i12));
        green().f668p.setOnClickListener(new j(this, i19));
        green().B.setOnClickListener(new Object());
        green().A.setOnClickListener(new j(this, i11));
        green().f662m.setOnClickListener(new j(this, i10));
        for (EditText editText : CollectionsKt.listOf(green().f635S.getEditText(), green().f640X.getEditText(), green().f637U.getEditText(), green().f634R.getEditText(), green().f644b0.getEditText(), green().f643a0.getEditText(), green().f646d0.getEditText(), green().f647e0.getEditText(), green().f642Z.getEditText(), green().Q.getEditText(), green().f633P.getEditText(), green().f641Y.getEditText(), green().f636T.getEditText(), green().f638V.getEditText(), green().f639W.getEditText(), green().f632O.getEditText())) {
            if (editText != null) {
                editText.addTextChangedListener(this.f12201Y);
            }
        }
        indigo().getSignUpValidation().observe(this, this.f12202Z);
        this.f12195S = getIntent().getStringExtra("request_id");
        boolean whiskey = d.whiskey(this);
        TextView lbReferral = green().f659k0;
        Intrinsics.delta(lbReferral, "lbReferral");
        if (whiskey) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        lbReferral.setVisibility(i4);
        TextInputLayout ilReferralCode = green().f645c0;
        Intrinsics.delta(ilReferralCode, "ilReferralCode");
        if (whiskey) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        ilReferralCode.setVisibility(i5);
        String str = this.f12195S;
        if (str != null) {
            indigo().getSignUpRequestDetail(str).observe(this, new Dc.t(20, new wa.i(this, i17)));
            AbstractC3056s3.alpha(green().f649f0, "What went Wrong?");
            TextInputLayout ilReferralCode2 = green().f645c0;
            Intrinsics.delta(ilReferralCode2, "ilReferralCode");
            ilReferralCode2.setVisibility(8);
        }
        String stringExtra = getIntent().getStringExtra("referral");
        if (stringExtra != null && d.whiskey(this)) {
            green().C.setText(stringExtra);
        }
        green().f660l.postDelayed(new m(this, 1), 1000L);
        Toolbar toolbar = green().f667o0;
        Intrinsics.delta(toolbar, "toolbar");
        T2.delta(toolbar);
        this.f12197U.observe(this, new Dc.t(20, new wa.i(this, 1)));
        green().f652h.setOnClickListener(new j(this, i22));
        green().f650g.setOnClickListener(new j(this, i20));
        green().f656j.setOnClickListener(new j(this, i18));
        green().f654i.setOnClickListener(new j(this, i16));
    }

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onDestroy() {
        Collection<String> values;
        super.onDestroy();
        HashMap hashMap = (HashMap) this.f12197U.getValue();
        if (hashMap != null && (values = hashMap.values()) != null) {
            for (String str : values) {
                if (new File(str).exists()) {
                    new File(str).delete();
                }
            }
        }
    }
}
