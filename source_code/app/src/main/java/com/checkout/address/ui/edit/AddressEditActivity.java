package com.checkout.address.ui.edit;

import P.d;
import ae.ak;
import ae.al;
import ae.o;
import ae.q;
import af.AbstractC0434e;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.address.di.AddressStyleModule;
import com.checkout.address.di.AddressValidatorModule;
import com.checkout.address.di.RTLModule;
import com.checkout.address.di.ResourceModule;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.ui.navigation.a;
import com.checkout.address.utils.IntentUtils;
import com.checkout.address.utils.Utils;
import com.checkout.components.address.C0861b;
import com.checkout.components.address.C0862c;
import com.checkout.components.address.L;
import com.checkout.components.interfaces.localisation.ContextExtensionsKt;
import com.checkout.components.interfaces.model.contact.Address;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.ui.ResourceProvider;
import ge.InterfaceC1775g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/checkout/address/ui/edit/AddressEditActivity;", "Lae/o;", "<init>", "()V", "Companion", "com/checkout/components/address/b", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressEditActivity extends o {
    public static final int $stable = 8;

    @NotNull
    public static final C0861b Companion = new C0861b();

    @NotNull
    public static final String EXTRA_KEY_APPEARANCE = "EXTRA_KEY_DESIGN_TOKENS";

    @NotNull
    public static final String EXTRA_KEY_CONTACT_DATA = "EXTRA_KEY_CONTACT_DATA";

    @NotNull
    public static final String EXTRA_KEY_FIELDS = "EXTRA_KEY_FIELDS";

    @NotNull
    public static final String EXTRA_KEY_LOCALE = "EXTRA_KEY_LOCALE";

    @NotNull
    public static final String EXTRA_KEY_TRANSLATION = "EXTRA_KEY_TRANSLATION";

    /* renamed from: a, reason: collision with root package name */
    private L f3795a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(AddressEditActivity addressEditActivity, AddressEditState addressEditState, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            L l10 = addressEditActivity.f3795a;
            Address address = null;
            if (l10 != null) {
                Utils utils = Utils.INSTANCE;
                ResourceProvider resourceProvider = (ResourceProvider) l10.f3863i.get();
                ContactData prefilledData = addressEditState.getPrefilledData();
                if (prefilledData != null) {
                    address = prefilledData.getAddress();
                }
                String formTitle$address_standardRelease = utils.getFormTitle$address_standardRelease(resourceProvider, address);
                boolean india = c0585q.india(addressEditActivity);
                Object jade = c0585q.jade();
                if (india || jade == C0580l.alpha) {
                    jade = new C0862c(addressEditActivity);
                    c0585q.f(jade);
                }
                a.a(addressEditState, l10, (Function1) ((InterfaceC1775g) jade), formTitle$address_standardRelease, c0585q, 0);
            } else {
                Intrinsics.lima("diComponent");
                throw null;
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final void access$setResultAndFinish(AddressEditActivity addressEditActivity, ContactData contactData) {
        addressEditActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_KEY_CONTACT_DATA, contactData);
        addressEditActivity.setResult(-1, intent);
        addressEditActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [t6.g3] */
    @Override // ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        int i4 = q.alpha;
        ak detectDarkMode = ak.alpha;
        Intrinsics.echo(detectDarkMode, "detectDarkMode");
        al alVar = new al(0, 0, detectDarkMode);
        int i5 = q.alpha;
        int i10 = q.bravo;
        Intrinsics.echo(detectDarkMode, "detectDarkMode");
        al alVar2 = new al(i5, i10, detectDarkMode);
        View decorView = getWindow().getDecorView();
        Intrinsics.delta(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        Intrinsics.delta(resources, "view.resources");
        boolean booleanValue = ((Boolean) detectDarkMode.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        Intrinsics.delta(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) detectDarkMode.invoke(resources2)).booleanValue();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            obj = new Object();
        } else if (i11 >= 29) {
            obj = new Object();
        } else if (i11 >= 28) {
            obj = new Object();
        } else if (i11 >= 26) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        ?? r12 = obj;
        Window window = getWindow();
        Intrinsics.delta(window, "window");
        r12.charlie(alVar, alVar2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        Intrinsics.delta(window2, "window");
        r12.alpha(window2);
        IntentUtils intentUtils = IntentUtils.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.delta(intent, "getIntent(...)");
        AddressEditState initialState$address_standardRelease = intentUtils.getInitialState$address_standardRelease(intent);
        Context configContext = ContextExtensionsKt.toConfigContext(this, initialState$address_standardRelease.getLocale());
        configContext.getClass();
        this.f3795a = new L(new AddressStyleModule(), new ResourceModule(), new AddressValidatorModule(), new RTLModule(), configContext, initialState$address_standardRelease.getTranslation(), initialState$address_standardRelease.getAppearance());
        AbstractC0434e.alpha(this, new d(new Cb.a(27, this, initialState$address_standardRelease), 1595569595, true));
    }
}
