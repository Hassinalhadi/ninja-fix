package delivery.samurai.android.ui.common;

import A9.a;
import B2.q;
import B9.C0058p;
import Eb.b;
import Fe.c;
import Jb.at;
import L9.d;
import L9.h;
import Ua.f;
import Ua.j;
import Ua.l;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.g;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ao.ad;
import com.app.base.BaseViewModel;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.button.MaterialButton;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import f1.AbstractC1683c;
import g1.AbstractC1735d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.AbstractC3070v2;
import t6.S3;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ldelivery/samurai/android/ui/common/LocationInfoActivity;", "Ld3/k;", "<init>", "()V", "U8/a", "Ua/j", "Ua/i", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class LocationInfoActivity extends k {
    public static final /* synthetic */ int Q = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12236H = false;

    /* renamed from: I, reason: collision with root package name */
    public final Lazy f12237I;

    /* renamed from: J, reason: collision with root package name */
    public C0058p f12238J;

    /* renamed from: K, reason: collision with root package name */
    public j f12239K;

    /* renamed from: L, reason: collision with root package name */
    public g f12240L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12241M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f12242N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f12243O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f12244P;

    public LocationInfoActivity() {
        addOnContextAvailableListener(new b(this, 14));
        this.f12237I = LazyKt.lazy(new q(21, this));
        this.f12239K = j.alpha;
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12236H) {
            this.f12236H = true;
            l lVar = (l) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            LocationInfoActivity locationInfoActivity = (LocationInfoActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((w9.j) lVar).alpha;
            locationInfoActivity.teal = (C3403a) pVar.sierra.get();
            locationInfoActivity.f12038c = (C3490g) pVar.uniform.get();
            locationInfoActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            locationInfoActivity.e = (InterfaceC2960e) pVar.xray.get();
            locationInfoActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            locationInfoActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            locationInfoActivity.f12042h = (z9.l) pVar.amber.get();
            locationInfoActivity.f12043i = (a) pVar.azure.get();
            locationInfoActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            locationInfoActivity.f12045k = (C3488e) pVar.bronze.get();
            locationInfoActivity.f12046l = (C3484a) pVar.coral.get();
            locationInfoActivity.f12047m = (i) pVar.crimson.get();
            locationInfoActivity.f12048n = (z9.k) pVar.cyan.get();
            locationInfoActivity.f12049o = (C3404b) pVar.emerald.get();
            locationInfoActivity.f12050p = (X9.g) pVar.gold.get();
        }
    }

    public final void gold() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + getPackageName()));
                intent.setFlags(268435456);
                startActivity(intent);
                lavender();
                return;
            } catch (Exception unused) {
                String string = getString(R.string.unable_to_open_settings);
                Intrinsics.delta(string, "getString(...)");
                d.pink(this, string);
                return;
            }
        }
        if (i4 >= 29 && !d.tango(this)) {
            requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 1003);
            return;
        }
        this.f12243O = true;
        setResult(-1);
        finish();
    }

    public final boolean gray() {
        if (!getSharedPreferences("LocationPermission", 0).getBoolean("had_background_location", false)) {
            return false;
        }
        h november = d.november(this);
        h hVar = null;
        String string = getSharedPreferences("LocationPermission", 0).getString("last_background_location_state", null);
        if (string != null) {
            try {
                hVar = h.valueOf(string);
            } catch (Exception unused) {
            }
        }
        h hVar2 = h.alpha;
        if (hVar != hVar2 || november == hVar2) {
            return false;
        }
        return true;
    }

    public final C0058p green() {
        C0058p c0058p = this.f12238J;
        if (c0058p != null) {
            return c0058p;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final int indigo() {
        long j5 = getSharedPreferences("LocationPermission", 0).getLong("last_attempt_timestamp", 0L);
        if (j5 != 0 && (System.currentTimeMillis() - j5) / 3600000 >= 24) {
            maroon();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("LocationPermission", 0);
        int i4 = sharedPreferences.getInt("approximate_location_attempts", 0) + 1;
        sharedPreferences.edit().putInt("approximate_location_attempts", i4).putLong("last_attempt_timestamp", System.currentTimeMillis()).apply();
        return i4;
    }

    public final int ivory() {
        SharedPreferences sharedPreferences = getSharedPreferences("LocationPermission", 0);
        int i4 = sharedPreferences.getInt("background_location_attempts", 0) + 1;
        sharedPreferences.edit().putInt("background_location_attempts", i4).apply();
        return i4;
    }

    public final boolean jade() {
        return ((Boolean) this.f12237I.getValue()).booleanValue();
    }

    public final void lavender() {
        getSharedPreferences("LocationPermission", 0).edit().putBoolean("settings_opened_for_location", true).apply();
    }

    public final void lime() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + getPackageName()));
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            String string = getString(R.string.unable_to_open_settings);
            Intrinsics.delta(string, "getString(...)");
            d.pink(this, string);
        }
    }

    public final void magenta() {
        if (Build.VERSION.SDK_INT >= 29 && !d.tango(this)) {
            this.f12239K = j.purple;
            pink();
        } else {
            this.f12243O = true;
            setResult(-1);
            finish();
        }
    }

    public final void maroon() {
        getSharedPreferences("LocationPermission", 0).edit().remove("approximate_location_attempts").remove("settings_opened_for_location").remove("settings_opened_timestamp").remove("last_attempt_timestamp").apply();
    }

    public final void navy(final int i4, boolean z2, h hVar) {
        String string;
        int i5;
        int i10;
        int i11;
        Pair pair;
        Ua.i iVar;
        boolean z10;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 29 || this.f12244P || d.tango(this)) {
            return;
        }
        String str = "";
        if (i13 < 29) {
            String string2 = getString(R.string.background_location_downgraded_title);
            Intrinsics.delta(string2, "getString(...)");
            String string3 = getString(R.string.background_location_downgraded_message_base, getString(R.string.allow_all_the_time_text), getString(R.string.while_using_app_text), "");
            Intrinsics.delta(string3, "getString(...)");
            iVar = new Ua.i(string2, string3, R.drawable.bg_gradient_location_info, R.color.location_info_blue_dark, R.color.location_info_blue);
        } else {
            int i14 = Ua.k.$EnumSwitchMapping$1[hVar.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        string = getString(R.string.while_using_app_text);
                    } else {
                        string = getString(R.string.denied_text);
                    }
                } else {
                    string = getString(R.string.ask_every_time_text);
                }
            } else {
                string = getString(R.string.while_using_app_text);
            }
            Intrinsics.checkNotNull(string);
            if (i13 >= 31) {
                str = getString(R.string.background_location_steps_android12);
            } else if (i13 >= 29) {
                str = getString(R.string.background_location_steps_android10);
            }
            Intrinsics.checkNotNull(str);
            String string4 = getString(R.string.allow_all_the_time_text);
            Intrinsics.delta(string4, "getString(...)");
            if (i4 >= 5) {
                i11 = R.drawable.bg_gradient_location_error;
                i10 = R.color.location_error_red_dark;
                i5 = R.color.location_error_red;
            } else {
                i5 = R.color.location_warning_yellow;
                i10 = R.color.location_warning_yellow_dark;
                i11 = R.drawable.bg_gradient_location_warning;
            }
            int i15 = i11;
            int i16 = i10;
            int i17 = i5;
            if (i4 == 1) {
                pair = new Pair(getString(R.string.background_location_downgraded_title), getString(R.string.background_location_downgraded_message_base, string4, string, str));
            } else if (i4 >= 2 && i4 < 5) {
                pair = new Pair(getString(R.string.background_location_required_title_urgent), getString(R.string.background_location_downgraded_message_attempt2, string4, string, str));
            } else if (i4 >= 5) {
                pair = new Pair(getString(R.string.background_location_required_title_critical), getString(R.string.background_location_downgraded_message_attempt5, string4, string, str));
            } else {
                pair = new Pair(getString(R.string.background_location_downgraded_title), getString(R.string.background_location_downgraded_message_base, string4, string, str));
            }
            iVar = new Ua.i((String) pair.first, (String) pair.second, i15, i16, i17);
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_background_location_downgraded, (ViewGroup) null, false);
        int i18 = R.id.buttonContainer;
        if (((LinearLayout) S3.bravo(R.id.buttonContainer, inflate)) != null) {
            i18 = R.id.icon;
            ImageView imageView = (ImageView) S3.bravo(R.id.icon, inflate);
            if (imageView != null) {
                i18 = R.id.iconContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) S3.bravo(R.id.iconContainer, inflate);
                if (constraintLayout != null) {
                    i18 = R.id.message;
                    TextView textView = (TextView) S3.bravo(R.id.message, inflate);
                    if (textView != null) {
                        i18 = R.id.negativeButton;
                        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.negativeButton, inflate);
                        if (materialButton != null) {
                            i18 = R.id.neutralButton;
                            MaterialButton materialButton2 = (MaterialButton) S3.bravo(R.id.neutralButton, inflate);
                            if (materialButton2 != null) {
                                i18 = R.id.positiveButton;
                                MaterialButton materialButton3 = (MaterialButton) S3.bravo(R.id.positiveButton, inflate);
                                if (materialButton3 != null) {
                                    TextView textView2 = (TextView) S3.bravo(R.id.title, inflate);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                        constraintLayout.setBackgroundResource(iVar.charlie);
                                        imageView.setColorFilter(getColor(R.color.white));
                                        textView2.setText(iVar.alpha);
                                        textView2.setTextColor(getColor(iVar.delta));
                                        textView.setText(iVar.bravo);
                                        materialButton3.setText(getString(R.string.open_settings));
                                        materialButton3.setBackgroundColor(getColor(iVar.echo));
                                        if (i13 < 31 && !z2) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            i12 = 0;
                                        } else {
                                            i12 = 8;
                                        }
                                        materialButton2.setVisibility(i12);
                                        materialButton.setVisibility(8);
                                        if (!z10) {
                                            ViewGroup.LayoutParams layoutParams = materialButton3.getLayoutParams();
                                            Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                            layoutParams2.weight = 1.0f;
                                            layoutParams2.setMarginStart(0);
                                            materialButton3.setLayoutParams(layoutParams2);
                                        }
                                        c cVar = new c(this);
                                        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
                                        dVar.sierra = constraintLayout2;
                                        dVar.mike = false;
                                        g foxtrot = cVar.foxtrot();
                                        this.f12244P = true;
                                        materialButton3.setOnClickListener(new f(this, foxtrot, 1));
                                        materialButton2.setOnClickListener(new f(this, foxtrot, 2));
                                        foxtrot.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Ua.h
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                LocationInfoActivity locationInfoActivity = LocationInfoActivity.this;
                                                locationInfoActivity.f12244P = false;
                                                if (!locationInfoActivity.getSharedPreferences("LocationPermission", 0).getBoolean("settings_opened_for_location", false)) {
                                                    new Handler(Looper.getMainLooper()).postDelayed(new at(locationInfoActivity, i4, 1), 500L);
                                                }
                                            }
                                        });
                                        foxtrot.show();
                                        return;
                                    }
                                    i18 = R.id.title;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void ochre(int i4, boolean z2) {
        String string;
        Pair pair;
        if (this.f12242N) {
            return;
        }
        g gVar = this.f12240L;
        if (gVar != null) {
            gVar.dismiss();
        }
        this.f12240L = null;
        this.f12241M = false;
        this.f12242N = true;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            string = getString(R.string.background_location_steps_android12);
        } else if (i5 >= 29) {
            string = getString(R.string.background_location_steps_android10);
        } else {
            string = getString(R.string.background_location_steps_android9);
        }
        Intrinsics.checkNotNull(string);
        String string2 = getString(R.string.allow_all_the_time_text);
        Intrinsics.delta(string2, "getString(...)");
        if (i4 == 1) {
            pair = new Pair(getString(R.string.background_location_required_title), ad.amber(getString(R.string.background_location_required_message), "\n\n", string));
        } else if (i4 == 2) {
            pair = new Pair(getString(R.string.background_location_required_title_urgent), getString(R.string.background_location_required_message_attempt2, string2, string));
        } else if (i4 >= 3 && i4 < 5) {
            pair = new Pair(getString(R.string.background_location_required_title_urgent), getString(R.string.background_location_required_message_attempt3, string));
        } else if (i4 >= 5) {
            pair = new Pair(getString(R.string.background_location_required_title_critical), getString(R.string.background_location_required_message_attempt5, string2, string));
        } else {
            pair = new Pair(getString(R.string.background_location_required_title), ad.amber(getString(R.string.background_location_required_message), "\n\n", string));
        }
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_background_location_required, (ViewGroup) null, false);
        int i10 = R.id.buttonContainer;
        if (((LinearLayout) S3.bravo(R.id.buttonContainer, inflate)) != null) {
            i10 = R.id.icon;
            ImageView imageView = (ImageView) S3.bravo(R.id.icon, inflate);
            if (imageView != null) {
                i10 = R.id.iconContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) S3.bravo(R.id.iconContainer, inflate);
                if (constraintLayout != null) {
                    i10 = R.id.message;
                    TextView textView = (TextView) S3.bravo(R.id.message, inflate);
                    if (textView != null) {
                        i10 = R.id.negativeButton;
                        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.negativeButton, inflate);
                        if (materialButton != null) {
                            i10 = R.id.positiveButton;
                            MaterialButton materialButton2 = (MaterialButton) S3.bravo(R.id.positiveButton, inflate);
                            if (materialButton2 != null) {
                                i10 = R.id.title;
                                TextView textView2 = (TextView) S3.bravo(R.id.title, inflate);
                                if (textView2 != null) {
                                    constraintLayout.setBackgroundResource(R.drawable.bg_gradient_location_warning);
                                    imageView.setColorFilter(getColor(R.color.white));
                                    textView2.setText(str);
                                    textView2.setTextColor(getColor(R.color.location_warning_yellow_dark));
                                    textView.setText(str2);
                                    materialButton2.setText(getString(R.string.open_settings));
                                    materialButton2.setBackgroundColor(getColor(R.color.location_warning_yellow));
                                    materialButton.setVisibility(8);
                                    c cVar = new c(this);
                                    androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
                                    dVar.sierra = (ConstraintLayout) inflate;
                                    dVar.mike = false;
                                    g foxtrot = cVar.foxtrot();
                                    materialButton2.setOnClickListener(new f(this, foxtrot, 3));
                                    foxtrot.setOnDismissListener(new Ua.g(this, 1));
                                    this.f12240L = foxtrot;
                                    foxtrot.show();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    public final void olive(final int i4, final boolean z2) {
        String string;
        String string2;
        Pair pair;
        Pair pair2;
        Pair pair3;
        String string3;
        if (this.f12241M) {
            return;
        }
        g gVar = this.f12240L;
        if (gVar != null) {
            gVar.dismiss();
        }
        this.f12240L = null;
        this.f12242N = false;
        this.f12241M = true;
        U8.a.charlie("B", "LocationInfoActivity.kt:182", "Showing precise location dialog", y.sierra(new Pair("attemptCount", Integer.valueOf(i4)), new Pair("settingsOpened", Boolean.valueOf(z2)), new Pair("isFromLogin", Boolean.valueOf(jade())), new Pair("currentMessage", getString(R.string.precise_location_required_message))));
        boolean jade = jade();
        if (Build.VERSION.SDK_INT >= 31) {
            string = getString(R.string.precise_location_android12_instruction);
        } else {
            string = getString(R.string.precise_location_android11_instruction);
        }
        Intrinsics.checkNotNull(string);
        if (jade) {
            string2 = getString(R.string.precise_location_login_context);
        } else {
            string2 = getString(R.string.precise_location_ready_context);
        }
        Intrinsics.checkNotNull(string2);
        if (i4 == 1) {
            pair3 = new Pair(getString(R.string.precise_location_required_title), ad.amber(getString(R.string.precise_location_required_message), "\n\n", string2));
        } else if (i4 == 2 && !z2) {
            pair3 = new Pair(getString(R.string.precise_location_required_title), ad.amber(getString(R.string.precise_location_required_message_attempt2), "\n\n", string));
        } else {
            if (i4 == 3 && !z2) {
                pair = new Pair(getString(R.string.precise_location_required_title_urgent), getString(R.string.precise_location_required_message_attempt3));
            } else {
                if (i4 >= 5 && i4 < 10 && !z2) {
                    pair2 = new Pair(getString(R.string.precise_location_required_title_urgent), getString(R.string.precise_location_required_message_attempt5));
                } else if (i4 >= 10 && !z2) {
                    pair2 = new Pair(getString(R.string.precise_location_required_title_urgent), getString(R.string.precise_location_required_message_attempt10));
                } else if (z2 && i4 >= 2) {
                    pair2 = new Pair(getString(R.string.precise_location_required_title_urgent), getString(R.string.precise_location_required_message_after_settings));
                } else {
                    pair = new Pair(getString(R.string.precise_location_required_title_urgent), getString(R.string.precise_location_required_message_attempt3));
                }
                pair3 = pair2;
            }
            pair3 = pair;
        }
        String str = (String) pair3.first;
        String str2 = (String) pair3.second;
        U8.a.charlie("D", "LocationInfoActivity.kt:190", "Dynamic dialog content generated", y.sierra(new Pair(Constants.KEY_TITLE, str), new Pair(Constants.KEY_MESSAGE, str2), new Pair("attemptCount", Integer.valueOf(i4)), new Pair("settingsOpened", Boolean.valueOf(z2))));
        View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_precise_location_required, (ViewGroup) null, false);
        int i5 = R.id.buttonContainer;
        if (((LinearLayout) S3.bravo(R.id.buttonContainer, inflate)) != null) {
            i5 = R.id.icon;
            ImageView imageView = (ImageView) S3.bravo(R.id.icon, inflate);
            if (imageView != null) {
                i5 = R.id.iconContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) S3.bravo(R.id.iconContainer, inflate);
                if (constraintLayout != null) {
                    i5 = R.id.message;
                    TextView textView = (TextView) S3.bravo(R.id.message, inflate);
                    if (textView != null) {
                        i5 = R.id.negativeButton;
                        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.negativeButton, inflate);
                        if (materialButton != null) {
                            i5 = R.id.positiveButton;
                            MaterialButton materialButton2 = (MaterialButton) S3.bravo(R.id.positiveButton, inflate);
                            if (materialButton2 != null) {
                                i5 = R.id.stepsContainer;
                                if (((LinearLayout) S3.bravo(R.id.stepsContainer, inflate)) != null) {
                                    i5 = R.id.title;
                                    TextView textView2 = (TextView) S3.bravo(R.id.title, inflate);
                                    if (textView2 != null) {
                                        constraintLayout.setBackgroundResource(R.drawable.bg_gradient_location_error);
                                        imageView.setColorFilter(getColor(R.color.white));
                                        textView2.setText(str);
                                        textView2.setTextColor(getColor(R.color.location_error_red_dark));
                                        textView.setText(str2);
                                        materialButton2.setText(getString(R.string.open_settings));
                                        materialButton2.setBackgroundColor(getColor(R.color.location_error_red));
                                        materialButton.setVisibility(8);
                                        c cVar = new c(this);
                                        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
                                        dVar.sierra = (ConstraintLayout) inflate;
                                        dVar.mike = false;
                                        final g foxtrot = cVar.foxtrot();
                                        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: Ua.e
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i10 = LocationInfoActivity.Q;
                                                U8.a.charlie("C", "LocationInfoActivity.kt:196", "User clicked Open Settings", y.sierra(new Pair("attemptCount", Integer.valueOf(i4)), new Pair("settingsOpenedBefore", Boolean.valueOf(z2))));
                                                foxtrot.dismiss();
                                                LocationInfoActivity locationInfoActivity = this;
                                                locationInfoActivity.lavender();
                                                locationInfoActivity.getSharedPreferences("LocationPermission", 0).edit().putLong("settings_opened_timestamp", System.currentTimeMillis()).apply();
                                                locationInfoActivity.lime();
                                            }
                                        });
                                        if (i4 >= 10) {
                                            string3 = getString(R.string.contact_support);
                                        } else if (i4 >= 3) {
                                            string3 = getString(R.string.show_visual_guide);
                                        } else {
                                            string3 = getString(R.string.try_again);
                                        }
                                        Intrinsics.checkNotNull(string3);
                                        materialButton.setText(getString(android.R.string.cancel));
                                        materialButton.setVisibility(0);
                                        materialButton.setOnClickListener(new f(foxtrot, this));
                                        if (i4 < 3) {
                                            ViewGroup.LayoutParams layoutParams = materialButton2.getLayoutParams();
                                            Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                            layoutParams2.weight = 1.0f;
                                            layoutParams2.setMarginStart(0);
                                            materialButton2.setLayoutParams(layoutParams2);
                                        }
                                        foxtrot.setOnDismissListener(new Ua.g(this, 0));
                                        this.f12240L = foxtrot;
                                        foxtrot.show();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    @Override // ae.o, android.app.Activity
    public final void onBackPressed() {
        if (Build.VERSION.SDK_INT >= 29 && this.f12239K == j.purple && !d.tango(this)) {
            String string = getString(R.string.background_location_required_blocking);
            Intrinsics.delta(string, "getString(...)");
            d.pink(this, string);
            return;
        }
        super.onBackPressed();
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_location_info, (ViewGroup) null, false);
        int i4 = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnCancel, inflate);
        if (materialButton != null) {
            i4 = R.id.btnHelp;
            MaterialButton materialButton2 = (MaterialButton) S3.bravo(R.id.btnHelp, inflate);
            if (materialButton2 != null) {
                i4 = R.id.btnTurnOnLocation;
                MaterialButton materialButton3 = (MaterialButton) S3.bravo(R.id.btnTurnOnLocation, inflate);
                if (materialButton3 != null) {
                    i4 = R.id.cardWarningBanner;
                    if (((CardView) S3.bravo(R.id.cardWarningBanner, inflate)) != null) {
                        i4 = R.id.clLocationComparison;
                        LinearLayout linearLayout = (LinearLayout) S3.bravo(R.id.clLocationComparison, inflate);
                        if (linearLayout != null) {
                            i4 = R.id.imageView5;
                            if (((ImageView) S3.bravo(R.id.imageView5, inflate)) != null) {
                                i4 = R.id.imageView6;
                                if (((ImageView) S3.bravo(R.id.imageView6, inflate)) != null) {
                                    i4 = R.id.llStepIndicator;
                                    if (((LinearLayout) S3.bravo(R.id.llStepIndicator, inflate)) != null) {
                                        i4 = R.id.scrollContent;
                                        if (((NestedScrollView) S3.bravo(R.id.scrollContent, inflate)) != null) {
                                            i4 = R.id.textView26;
                                            TextView textView = (TextView) S3.bravo(R.id.textView26, inflate);
                                            if (textView != null) {
                                                i4 = R.id.tvApproximateDescription;
                                                if (((TextView) S3.bravo(R.id.tvApproximateDescription, inflate)) != null) {
                                                    i4 = R.id.tvApproximateLabel;
                                                    if (((TextView) S3.bravo(R.id.tvApproximateLabel, inflate)) != null) {
                                                        i4 = R.id.tvInfoWhyNeedLocation;
                                                        TextView textView2 = (TextView) S3.bravo(R.id.tvInfoWhyNeedLocation, inflate);
                                                        if (textView2 != null) {
                                                            i4 = R.id.tvPreciseDescription;
                                                            if (((TextView) S3.bravo(R.id.tvPreciseDescription, inflate)) != null) {
                                                                i4 = R.id.tvPreciseLabel;
                                                                if (((TextView) S3.bravo(R.id.tvPreciseLabel, inflate)) != null) {
                                                                    i4 = R.id.tvPreciseLocationWarning;
                                                                    TextView textView3 = (TextView) S3.bravo(R.id.tvPreciseLocationWarning, inflate);
                                                                    if (textView3 != null) {
                                                                        i4 = R.id.tvStepIndicator;
                                                                        TextView textView4 = (TextView) S3.bravo(R.id.tvStepIndicator, inflate);
                                                                        if (textView4 != null) {
                                                                            i4 = R.id.tvStepInstructions;
                                                                            TextView textView5 = (TextView) S3.bravo(R.id.tvStepInstructions, inflate);
                                                                            if (textView5 != null) {
                                                                                this.f12238J = new C0058p((ConstraintLayout) inflate, materialButton, materialButton2, materialButton3, linearLayout, textView, textView2, textView3, textView4, textView5);
                                                                                setContentView((ConstraintLayout) green().bravo);
                                                                                november().golf();
                                                                                november().bravo();
                                                                                peach();
                                                                                C0058p green = green();
                                                                                final int i5 = 2;
                                                                                ((MaterialButton) green.foxtrot).setOnClickListener(new View.OnClickListener(this) { // from class: Ua.c
                                                                                    public final /* synthetic */ LocationInfoActivity purple;

                                                                                    {
                                                                                        this.purple = this;
                                                                                    }

                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view) {
                                                                                        LocationInfoActivity locationInfoActivity = this.purple;
                                                                                        switch (i5) {
                                                                                            case 0:
                                                                                                int i10 = LocationInfoActivity.Q;
                                                                                                locationInfoActivity.finish();
                                                                                                return;
                                                                                            case 1:
                                                                                                int i11 = LocationInfoActivity.Q;
                                                                                                new o().romeo(locationInfoActivity.getSupportFragmentManager(), "LocationPermissionHelp");
                                                                                                return;
                                                                                            default:
                                                                                                int ordinal = locationInfoActivity.f12239K.ordinal();
                                                                                                if (ordinal != 0) {
                                                                                                    if (ordinal == 1) {
                                                                                                        locationInfoActivity.gold();
                                                                                                        return;
                                                                                                    }
                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                }
                                                                                                if (AbstractC1735d.alpha(locationInfoActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                                                                                    locationInfoActivity.magenta();
                                                                                                    return;
                                                                                                } else {
                                                                                                    locationInfoActivity.golf();
                                                                                                    return;
                                                                                                }
                                                                                        }
                                                                                    }
                                                                                });
                                                                                C0058p green2 = green();
                                                                                final int i10 = 0;
                                                                                ((MaterialButton) green2.charlie).setOnClickListener(new View.OnClickListener(this) { // from class: Ua.c
                                                                                    public final /* synthetic */ LocationInfoActivity purple;

                                                                                    {
                                                                                        this.purple = this;
                                                                                    }

                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view) {
                                                                                        LocationInfoActivity locationInfoActivity = this.purple;
                                                                                        switch (i10) {
                                                                                            case 0:
                                                                                                int i102 = LocationInfoActivity.Q;
                                                                                                locationInfoActivity.finish();
                                                                                                return;
                                                                                            case 1:
                                                                                                int i11 = LocationInfoActivity.Q;
                                                                                                new o().romeo(locationInfoActivity.getSupportFragmentManager(), "LocationPermissionHelp");
                                                                                                return;
                                                                                            default:
                                                                                                int ordinal = locationInfoActivity.f12239K.ordinal();
                                                                                                if (ordinal != 0) {
                                                                                                    if (ordinal == 1) {
                                                                                                        locationInfoActivity.gold();
                                                                                                        return;
                                                                                                    }
                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                }
                                                                                                if (AbstractC1735d.alpha(locationInfoActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                                                                                    locationInfoActivity.magenta();
                                                                                                    return;
                                                                                                } else {
                                                                                                    locationInfoActivity.golf();
                                                                                                    return;
                                                                                                }
                                                                                        }
                                                                                    }
                                                                                });
                                                                                C0058p green3 = green();
                                                                                final int i11 = 1;
                                                                                ((MaterialButton) green3.echo).setOnClickListener(new View.OnClickListener(this) { // from class: Ua.c
                                                                                    public final /* synthetic */ LocationInfoActivity purple;

                                                                                    {
                                                                                        this.purple = this;
                                                                                    }

                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view) {
                                                                                        LocationInfoActivity locationInfoActivity = this.purple;
                                                                                        switch (i11) {
                                                                                            case 0:
                                                                                                int i102 = LocationInfoActivity.Q;
                                                                                                locationInfoActivity.finish();
                                                                                                return;
                                                                                            case 1:
                                                                                                int i112 = LocationInfoActivity.Q;
                                                                                                new o().romeo(locationInfoActivity.getSupportFragmentManager(), "LocationPermissionHelp");
                                                                                                return;
                                                                                            default:
                                                                                                int ordinal = locationInfoActivity.f12239K.ordinal();
                                                                                                if (ordinal != 0) {
                                                                                                    if (ordinal == 1) {
                                                                                                        locationInfoActivity.gold();
                                                                                                        return;
                                                                                                    }
                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                }
                                                                                                if (AbstractC1735d.alpha(locationInfoActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                                                                                    locationInfoActivity.magenta();
                                                                                                    return;
                                                                                                } else {
                                                                                                    locationInfoActivity.golf();
                                                                                                    return;
                                                                                                }
                                                                                        }
                                                                                    }
                                                                                });
                                                                                return;
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] permissions, int[] grantResults) {
        boolean z2;
        Object obj;
        final int i5 = 0;
        Intrinsics.echo(permissions, "permissions");
        Intrinsics.echo(grantResults, "grantResults");
        super.onRequestPermissionsResult(i4, permissions, grantResults);
        String str = "ready_toggle";
        if (i4 != 1001) {
            if (i4 != 1003) {
                return;
            }
            if (grantResults.length != 0 && grantResults[0] == 0) {
                if (jade()) {
                    str = "login";
                }
                AbstractC3070v2.charlie(this, "location_permission_background_granted", y.sierra(new Pair("source", str), new Pair("android_version", String.valueOf(Build.VERSION.SDK_INT))));
                orange();
                this.f12243O = true;
                setResult(-1);
                finish();
                return;
            }
            if (jade()) {
                str = "login";
            }
            AbstractC3070v2.charlie(this, "location_permission_background_denied", y.sierra(new Pair("source", str), new Pair("android_version", String.valueOf(Build.VERSION.SDK_INT)), new Pair("permanently_denied", String.valueOf(!AbstractC1683c.foxtrot(this, "android.permission.ACCESS_BACKGROUND_LOCATION")))));
            ochre(ivory(), !AbstractC1683c.foxtrot(this, "android.permission.ACCESS_BACKGROUND_LOCATION"));
            return;
        }
        int jade = ArraysKt.jade(permissions, "android.permission.ACCESS_FINE_LOCATION");
        if (jade >= 0 && jade < grantResults.length && grantResults[jade] == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int jade2 = ArraysKt.jade(permissions, "android.permission.ACCESS_COARSE_LOCATION");
        if (jade2 >= 0 && jade2 < grantResults.length && grantResults[jade2] == 0 && !z2) {
            SharedPreferences sharedPreferences = getSharedPreferences("LocationPermission", 0);
            boolean z10 = sharedPreferences.getBoolean("had_precise_location", false);
            if (z10) {
                maroon();
                sharedPreferences.edit().putBoolean("had_precise_location", false).apply();
            }
            int indigo = indigo();
            boolean z11 = getSharedPreferences("LocationPermission", 0).getBoolean("settings_opened_for_location", false);
            Pair pair = new Pair("attemptCount", Integer.valueOf(indigo));
            Pair pair2 = new Pair("settingsOpened", Boolean.valueOf(z11));
            Pair pair3 = new Pair("isFromLogin", Boolean.valueOf(jade()));
            Pair pair4 = new Pair("hadPreciseBefore", Boolean.valueOf(z10));
            if (!jade()) {
                obj = "ready_toggle";
            } else {
                obj = "login";
            }
            U8.a.charlie("A", "LocationInfoActivity.kt:93", "Approximate location selected", y.sierra(pair, pair2, pair3, pair4, new Pair("source", obj)));
            if (jade()) {
                str = "login";
            }
            AbstractC3070v2.charlie(this, "location_permission_approximate_selected", y.sierra(new Pair("source", str), new Pair("android_version", String.valueOf(Build.VERSION.SDK_INT)), new Pair("attempt_count", String.valueOf(indigo)), new Pair("settings_opened", String.valueOf(z11))));
            olive(indigo, z11);
            return;
        }
        if (z2) {
            U8.a.charlie("E", "LocationInfoActivity.kt:107", "Fine location granted - resetting attempt counter", y.romeo(new Pair("isFromLogin", Boolean.valueOf(jade()))));
            maroon();
            getSharedPreferences("LocationPermission", 0).edit().putBoolean("had_precise_location", true).apply();
            if (jade()) {
                str = "login";
            }
            AbstractC3070v2.charlie(this, "location_permission_fine_granted", y.sierra(new Pair("source", str), new Pair("android_version", String.valueOf(Build.VERSION.SDK_INT))));
            getSharedPreferences("LocationPermission", 0).edit().putBoolean("had_precise_location", true).apply();
            magenta();
            return;
        }
        if (jade()) {
            str = "login";
        }
        AbstractC3070v2.charlie(this, "location_permission_fine_denied", y.sierra(new Pair("source", str), new Pair("android_version", String.valueOf(Build.VERSION.SDK_INT)), new Pair("permanently_denied", String.valueOf(!AbstractC1683c.foxtrot(this, "android.permission.ACCESS_FINE_LOCATION")))));
        c cVar = new c(this);
        String string = getString(R.string.location_permission_required_title);
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
        dVar.delta = string;
        dVar.foxtrot = getString(R.string.location_permission_required_message);
        cVar.mike(getString(R.string.open_settings), new DialogInterface.OnClickListener(this) { // from class: Ua.d
            public final /* synthetic */ LocationInfoActivity purple;

            {
                this.purple = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                LocationInfoActivity locationInfoActivity = this.purple;
                switch (i5) {
                    case 0:
                        int i11 = LocationInfoActivity.Q;
                        locationInfoActivity.lime();
                        return;
                    default:
                        int i12 = LocationInfoActivity.Q;
                        dialogInterface.dismiss();
                        if (locationInfoActivity.jade()) {
                            L9.d.blue(locationInfoActivity);
                        }
                        locationInfoActivity.finish();
                        return;
                }
            }
        });
        final int i10 = 1;
        cVar.lima(getString(android.R.string.cancel), new DialogInterface.OnClickListener(this) { // from class: Ua.d
            public final /* synthetic */ LocationInfoActivity purple;

            {
                this.purple = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i102) {
                LocationInfoActivity locationInfoActivity = this.purple;
                switch (i10) {
                    case 0:
                        int i11 = LocationInfoActivity.Q;
                        locationInfoActivity.lime();
                        return;
                    default:
                        int i12 = LocationInfoActivity.Q;
                        dialogInterface.dismiss();
                        if (locationInfoActivity.jade()) {
                            L9.d.blue(locationInfoActivity);
                        }
                        locationInfoActivity.finish();
                        return;
                }
            }
        });
        dVar.mike = false;
        cVar.november();
    }

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final void onResume() {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences("LocationPermission", 0);
        if (sharedPreferences.getBoolean("had_precise_location", false)) {
            if (AbstractC1735d.alpha(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AbstractC1735d.alpha(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && (z12 || !z12)) {
                maroon();
                sharedPreferences.edit().putBoolean("had_precise_location", false).apply();
            }
        }
        if (AbstractC1735d.alpha(this, "android.permission.ACCESS_FINE_LOCATION") == 0 && !this.f12242N && !this.f12244P) {
            if (gray()) {
                navy(ivory(), !AbstractC1683c.foxtrot(this, "android.permission.ACCESS_BACKGROUND_LOCATION"), d.november(this));
            } else if (Build.VERSION.SDK_INT >= 29 && !d.tango(this) && this.f12239K == j.purple) {
                ochre(ivory(), !AbstractC1683c.foxtrot(this, "android.permission.ACCESS_BACKGROUND_LOCATION"));
            }
        }
        if (!this.f12241M && !this.f12242N && !this.f12244P) {
            if (AbstractC1735d.alpha(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (AbstractC1735d.alpha(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (gray()) {
                navy(ivory(), !AbstractC1683c.foxtrot(this, "android.permission.ACCESS_BACKGROUND_LOCATION"), d.november(this));
                return;
            }
            if (z2 && this.f12239K == j.alpha) {
                maroon();
                getSharedPreferences("LocationPermission", 0).edit().putBoolean("had_precise_location", true).apply();
                magenta();
                return;
            }
            if (z10 && !z2) {
                olive(indigo(), getSharedPreferences("LocationPermission", 0).getBoolean("settings_opened_for_location", false));
                return;
            }
            if (z2 && this.f12239K == j.purple) {
                if (d.tango(this)) {
                    orange();
                    getSharedPreferences("LocationPermission", 0).edit().remove("background_location_attempts").apply();
                    this.f12243O = true;
                    setResult(-1);
                    finish();
                    return;
                }
                ochre(ivory(), !AbstractC1683c.foxtrot(this, "android.permission.ACCESS_BACKGROUND_LOCATION"));
            }
        }
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!this.f12243O && jade() && this.f12239K == j.alpha) {
            d.blue(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2 && getSharedPreferences("LocationPermission", 0).getBoolean("settings_opened_for_location", false) && d.tango(this)) {
            getSharedPreferences("LocationPermission", 0).edit().putBoolean("settings_opened_for_location", false).apply();
            if (this.f12244P) {
                this.f12244P = false;
            }
            g gVar = this.f12240L;
            if (gVar != null) {
                gVar.dismiss();
            }
            this.f12240L = null;
            this.f12241M = false;
            this.f12242N = false;
            peach();
        }
    }

    public final void orange() {
        getSharedPreferences("LocationPermission", 0).edit().putBoolean("had_background_location", true).putString("last_background_location_state", d.november(this).name()).apply();
    }

    public final void peach() {
        boolean z2;
        h hVar;
        if (AbstractC1735d.alpha(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC1735d.alpha(this, "android.permission.ACCESS_COARSE_LOCATION");
        if (z2) {
            hVar = d.november(this);
        } else {
            hVar = h.silver;
        }
        if (!z2) {
            this.f12239K = j.alpha;
            ((TextView) green().delta).setText(getString(R.string.step1_precise_location_title));
            ((TextView) green().hotel).setText(getString(R.string.step1_precise_location_description));
            ((MaterialButton) green().foxtrot).setText(getString(R.string.enable_precise_location));
            ((MaterialButton) green().foxtrot).setEnabled(true);
            ((TextView) green().juliet).setText(getString(R.string.step_indicator_format, 1, 2));
            return;
        }
        if (z2 && Build.VERSION.SDK_INT >= 29 && hVar != h.alpha) {
            this.f12239K = j.purple;
            pink();
            return;
        }
        if (z2 && hVar == h.alpha) {
            orange();
        }
        this.f12243O = true;
        setResult(-1);
        finish();
    }

    public final void pink() {
        ((TextView) green().delta).setText(getString(R.string.step2_background_location_title));
        ((TextView) green().hotel).setText(getString(R.string.step2_background_location_description));
        ((MaterialButton) green().foxtrot).setText(getString(R.string.enable_background_location));
        ((MaterialButton) green().foxtrot).setEnabled(true);
        ((TextView) green().juliet).setText(getString(R.string.step_indicator_format, 2, 2));
        ((LinearLayout) green().golf).setVisibility(8);
        ((TextView) green().india).setVisibility(8);
        ((TextView) green().kilo).setVisibility(8);
    }
}
