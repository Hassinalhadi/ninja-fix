package ga;

import B9.L;
import Lb.D;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;
import s6.T7;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lga/u;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class u extends i {
    public q3.g e;

    /* renamed from: f, reason: collision with root package name */
    public final B9.ab f12693f;

    /* renamed from: g, reason: collision with root package name */
    public L f12694g;

    public u() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Xe.s(20, new Xe.s(19, this)));
        this.f12693f = new B9.ab(kotlin.jvm.internal.u.alpha.bravo(MyAccountViewModel.class), new Qb.l(alpha, 28), new Xa.f(9, this, alpha), new Qb.l(alpha, 29));
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = L.f163t;
        DataBinderMapperImpl dataBinderMapperImpl = z1.d.alpha;
        L l10 = (L) z1.g.kilo(inflater, R.layout.my_account_fragment, viewGroup, false, null);
        Intrinsics.delta(l10, "inflate(...)");
        this.f12694g = l10;
        return quebec().red;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        int i4 = 0;
        int i5 = 1;
        int i10 = 2;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        q3.g gVar = this.e;
        if (gVar != null) {
            romeo().alpha().observe(getViewLifecycleOwner(), new Dc.t(16, new Ec.ad(this, ((N9.i) gVar).bravo(N9.a.foxtrot), i10)));
            Context context = getContext();
            if (context != null) {
                AtomicInteger atomicInteger = L9.d.alpha;
                if (L9.k.golf((ContextWrapper) context).getBoolean("isNaqlBlocked", false)) {
                    MyAccountViewModel romeo = romeo();
                    ?? auVar = new au(new C2492a(2, "loading"));
                    BaseViewModel.launchApi$default(romeo, null, new aj(romeo, auVar, null), 1, null);
                    auVar.observe(getViewLifecycleOwner(), new Dc.t(16, new q(this, i4)));
                }
            }
            MyAccountViewModel romeo2 = romeo();
            ?? auVar2 = new au(new C2492a(2, "loading"));
            BaseViewModel.launchApi$default(romeo2, null, new ah(romeo2, auVar2, null), 1, null);
            auVar2.observe(getViewLifecycleOwner(), new Dc.t(16, new q(this, i5)));
            return;
        }
        Intrinsics.lima("featureFlagProvider");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
        kilo().oscar().observe(getViewLifecycleOwner(), new Dc.t(16, new q(this, 2)));
        L quebec = quebec();
        final int i4 = 0;
        quebec.f166h.setOnClickListener(new View.OnClickListener(this) { // from class: ga.r
            public final /* synthetic */ u purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i4) {
                    case 0:
                        final u uVar = this.purple;
                        String str2 = null;
                        View inflate = uVar.getLayoutInflater().inflate(R.layout.dialog_edit_urpay, (ViewGroup) null);
                        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.ilDialogUrPay);
                        final TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(R.id.etDialogUrPay);
                        final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.ilDialogUrPayId);
                        final TextInputEditText textInputEditText2 = (TextInputEditText) inflate.findViewById(R.id.etDialogUrPayId);
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.ivDialogClose);
                        final MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.btnDialogSave);
                        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.btnDialogCancel);
                        CharSequence text = uVar.quebec().f176r.getText();
                        if (text != null) {
                            str = text.toString();
                        } else {
                            str = null;
                        }
                        CharSequence text2 = uVar.quebec().f175q.getText();
                        if (text2 != null) {
                            str2 = text2.toString();
                        }
                        if (str == null || StringsKt.gray(str) || Intrinsics.areEqual(str, "-")) {
                            str = "";
                        }
                        textInputEditText.setText(str);
                        if (str2 == null || StringsKt.gray(str2) || Intrinsics.areEqual(str2, "-")) {
                            str2 = "";
                        }
                        textInputEditText2.setText(str2);
                        textInputEditText.addTextChangedListener(new t(textInputLayout, 0));
                        textInputEditText2.addTextChangedListener(new t(textInputLayout2, 1));
                        T6.b bVar = new T6.b(uVar.requireContext());
                        ((androidx.appcompat.app.d) bVar.red).sierra = inflate;
                        final androidx.appcompat.app.g foxtrot = bVar.foxtrot();
                        imageView.setOnClickListener(new V9.b(foxtrot, 1));
                        materialButton2.setOnClickListener(new V9.b(foxtrot, 2));
                        materialButton.setOnClickListener(new View.OnClickListener() { // from class: ga.s
                            /* JADX WARN: Type inference failed for: r11v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                String str3;
                                String str4;
                                String str5;
                                String str6;
                                String str7;
                                String str8;
                                String str9;
                                String obj;
                                String obj2;
                                TextInputEditText textInputEditText3 = TextInputEditText.this;
                                Editable text3 = textInputEditText3.getText();
                                if (text3 != null) {
                                    str3 = text3.toString();
                                } else {
                                    str3 = null;
                                }
                                TextInputEditText textInputEditText4 = textInputEditText2;
                                Editable text4 = textInputEditText4.getText();
                                if (text4 != null) {
                                    str4 = text4.toString();
                                } else {
                                    str4 = null;
                                }
                                A3.a alpha = B3.b.alpha(str3);
                                Object obj3 = alpha.bravo;
                                if (str3 != null && !StringsKt.gray(str3) && alpha.alpha) {
                                    str5 = (String) obj3;
                                } else {
                                    str5 = null;
                                }
                                if (str4 != null) {
                                    str6 = StringsKt.b(str4).toString();
                                } else {
                                    str6 = null;
                                }
                                if (str6 == null) {
                                    str6 = "";
                                }
                                if (StringsKt.gray(str6)) {
                                    str7 = null;
                                } else {
                                    str7 = str6;
                                }
                                u uVar2 = uVar;
                                if (str5 == null && str7 == null) {
                                    CharSequence text5 = uVar2.quebec().f176r.getText();
                                    if (text5 == null || (obj2 = text5.toString()) == null || (str8 = StringsKt.b(obj2).toString()) == null || StringsKt.gray(str8) || Intrinsics.areEqual(str8, "-")) {
                                        str8 = null;
                                    }
                                    CharSequence text6 = uVar2.quebec().f175q.getText();
                                    if (text6 == null || (obj = text6.toString()) == null || (str9 = StringsKt.b(obj).toString()) == null || StringsKt.gray(str9) || Intrinsics.areEqual(str9, "-")) {
                                        str9 = null;
                                    }
                                    if ((str8 == null || StringsKt.gray(str8)) && (str9 == null || StringsKt.gray(str9))) {
                                        L9.d.peach(R.string.nothing_to_update, uVar2.kilo());
                                        return;
                                    }
                                }
                                if (str3 != null && (!StringsKt.gray(str3))) {
                                    String str10 = (String) obj3;
                                    if (str10 != null) {
                                        str3 = str10;
                                    }
                                    String upperCase = StringsKt.yellow(2, str3).toUpperCase(Locale.ROOT);
                                    Intrinsics.delta(upperCase, "toUpperCase(...)");
                                    TextInputLayout textInputLayout3 = textInputLayout;
                                    Intrinsics.checkNotNull(textInputLayout3);
                                    if (!T7.alpha(textInputLayout3, alpha, upperCase)) {
                                        textInputEditText3.requestFocus();
                                        return;
                                    }
                                }
                                if (!StringsKt.gray(str6) && (str6.length() < 9 || str6.length() > 12)) {
                                    String string = uVar2.getString(R.string.VALIDATION_URPAY_ID);
                                    TextInputLayout textInputLayout4 = textInputLayout2;
                                    textInputLayout4.setError(string);
                                    textInputLayout4.setErrorEnabled(true);
                                    textInputEditText4.requestFocus();
                                    return;
                                }
                                MaterialButton materialButton3 = materialButton;
                                materialButton3.setEnabled(true);
                                if (uVar2.getView() == null) {
                                    return;
                                }
                                MyAccountViewModel romeo = uVar2.romeo();
                                ?? auVar = new au(new C2492a(2, "loading"));
                                BaseViewModel.launchApi$default(romeo, null, new al(romeo, str5, str7, auVar, null), 1, null);
                                auVar.observe(uVar2.getViewLifecycleOwner(), new Dc.t(16, new Ec.d(uVar2, materialButton3, str5, str7, foxtrot, 3)));
                            }
                        });
                        foxtrot.show();
                        return;
                    default:
                        u uVar2 = this.purple;
                        q3.g gVar = uVar2.e;
                        String str3 = null;
                        if (gVar != null) {
                            if (((N9.i) gVar).bravo(N9.a.foxtrot)) {
                                CharSequence text3 = uVar2.quebec().f174p.getText();
                                if (text3 != null) {
                                    str3 = text3.toString();
                                }
                                D d4 = new D();
                                Bundle bundle = new Bundle();
                                bundle.putString("arg_current_value", str3);
                                d4.setArguments(bundle);
                                d4.f1710v = new q(uVar2, 3);
                                d4.romeo(uVar2.getChildFragmentManager(), "stc_pay_bottom_sheet");
                                return;
                            }
                            return;
                        }
                        Intrinsics.lima("featureFlagProvider");
                        throw null;
                }
            }
        });
        L quebec2 = quebec();
        final int i5 = 1;
        quebec2.f165g.setOnClickListener(new View.OnClickListener(this) { // from class: ga.r
            public final /* synthetic */ u purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i5) {
                    case 0:
                        final u uVar = this.purple;
                        String str2 = null;
                        View inflate = uVar.getLayoutInflater().inflate(R.layout.dialog_edit_urpay, (ViewGroup) null);
                        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.ilDialogUrPay);
                        final TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(R.id.etDialogUrPay);
                        final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.ilDialogUrPayId);
                        final TextInputEditText textInputEditText2 = (TextInputEditText) inflate.findViewById(R.id.etDialogUrPayId);
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.ivDialogClose);
                        final MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.btnDialogSave);
                        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.btnDialogCancel);
                        CharSequence text = uVar.quebec().f176r.getText();
                        if (text != null) {
                            str = text.toString();
                        } else {
                            str = null;
                        }
                        CharSequence text2 = uVar.quebec().f175q.getText();
                        if (text2 != null) {
                            str2 = text2.toString();
                        }
                        if (str == null || StringsKt.gray(str) || Intrinsics.areEqual(str, "-")) {
                            str = "";
                        }
                        textInputEditText.setText(str);
                        if (str2 == null || StringsKt.gray(str2) || Intrinsics.areEqual(str2, "-")) {
                            str2 = "";
                        }
                        textInputEditText2.setText(str2);
                        textInputEditText.addTextChangedListener(new t(textInputLayout, 0));
                        textInputEditText2.addTextChangedListener(new t(textInputLayout2, 1));
                        T6.b bVar = new T6.b(uVar.requireContext());
                        ((androidx.appcompat.app.d) bVar.red).sierra = inflate;
                        final androidx.appcompat.app.g foxtrot = bVar.foxtrot();
                        imageView.setOnClickListener(new V9.b(foxtrot, 1));
                        materialButton2.setOnClickListener(new V9.b(foxtrot, 2));
                        materialButton.setOnClickListener(new View.OnClickListener() { // from class: ga.s
                            /* JADX WARN: Type inference failed for: r11v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                String str3;
                                String str4;
                                String str5;
                                String str6;
                                String str7;
                                String str8;
                                String str9;
                                String obj;
                                String obj2;
                                TextInputEditText textInputEditText3 = TextInputEditText.this;
                                Editable text3 = textInputEditText3.getText();
                                if (text3 != null) {
                                    str3 = text3.toString();
                                } else {
                                    str3 = null;
                                }
                                TextInputEditText textInputEditText4 = textInputEditText2;
                                Editable text4 = textInputEditText4.getText();
                                if (text4 != null) {
                                    str4 = text4.toString();
                                } else {
                                    str4 = null;
                                }
                                A3.a alpha = B3.b.alpha(str3);
                                Object obj3 = alpha.bravo;
                                if (str3 != null && !StringsKt.gray(str3) && alpha.alpha) {
                                    str5 = (String) obj3;
                                } else {
                                    str5 = null;
                                }
                                if (str4 != null) {
                                    str6 = StringsKt.b(str4).toString();
                                } else {
                                    str6 = null;
                                }
                                if (str6 == null) {
                                    str6 = "";
                                }
                                if (StringsKt.gray(str6)) {
                                    str7 = null;
                                } else {
                                    str7 = str6;
                                }
                                u uVar2 = uVar;
                                if (str5 == null && str7 == null) {
                                    CharSequence text5 = uVar2.quebec().f176r.getText();
                                    if (text5 == null || (obj2 = text5.toString()) == null || (str8 = StringsKt.b(obj2).toString()) == null || StringsKt.gray(str8) || Intrinsics.areEqual(str8, "-")) {
                                        str8 = null;
                                    }
                                    CharSequence text6 = uVar2.quebec().f175q.getText();
                                    if (text6 == null || (obj = text6.toString()) == null || (str9 = StringsKt.b(obj).toString()) == null || StringsKt.gray(str9) || Intrinsics.areEqual(str9, "-")) {
                                        str9 = null;
                                    }
                                    if ((str8 == null || StringsKt.gray(str8)) && (str9 == null || StringsKt.gray(str9))) {
                                        L9.d.peach(R.string.nothing_to_update, uVar2.kilo());
                                        return;
                                    }
                                }
                                if (str3 != null && (!StringsKt.gray(str3))) {
                                    String str10 = (String) obj3;
                                    if (str10 != null) {
                                        str3 = str10;
                                    }
                                    String upperCase = StringsKt.yellow(2, str3).toUpperCase(Locale.ROOT);
                                    Intrinsics.delta(upperCase, "toUpperCase(...)");
                                    TextInputLayout textInputLayout3 = textInputLayout;
                                    Intrinsics.checkNotNull(textInputLayout3);
                                    if (!T7.alpha(textInputLayout3, alpha, upperCase)) {
                                        textInputEditText3.requestFocus();
                                        return;
                                    }
                                }
                                if (!StringsKt.gray(str6) && (str6.length() < 9 || str6.length() > 12)) {
                                    String string = uVar2.getString(R.string.VALIDATION_URPAY_ID);
                                    TextInputLayout textInputLayout4 = textInputLayout2;
                                    textInputLayout4.setError(string);
                                    textInputLayout4.setErrorEnabled(true);
                                    textInputEditText4.requestFocus();
                                    return;
                                }
                                MaterialButton materialButton3 = materialButton;
                                materialButton3.setEnabled(true);
                                if (uVar2.getView() == null) {
                                    return;
                                }
                                MyAccountViewModel romeo = uVar2.romeo();
                                ?? auVar = new au(new C2492a(2, "loading"));
                                BaseViewModel.launchApi$default(romeo, null, new al(romeo, str5, str7, auVar, null), 1, null);
                                auVar.observe(uVar2.getViewLifecycleOwner(), new Dc.t(16, new Ec.d(uVar2, materialButton3, str5, str7, foxtrot, 3)));
                            }
                        });
                        foxtrot.show();
                        return;
                    default:
                        u uVar2 = this.purple;
                        q3.g gVar = uVar2.e;
                        String str3 = null;
                        if (gVar != null) {
                            if (((N9.i) gVar).bravo(N9.a.foxtrot)) {
                                CharSequence text3 = uVar2.quebec().f174p.getText();
                                if (text3 != null) {
                                    str3 = text3.toString();
                                }
                                D d4 = new D();
                                Bundle bundle = new Bundle();
                                bundle.putString("arg_current_value", str3);
                                d4.setArguments(bundle);
                                d4.f1710v = new q(uVar2, 3);
                                d4.romeo(uVar2.getChildFragmentManager(), "stc_pay_bottom_sheet");
                                return;
                            }
                            return;
                        }
                        Intrinsics.lima("featureFlagProvider");
                        throw null;
                }
            }
        });
    }

    public final L quebec() {
        L l10 = this.f12694g;
        if (l10 != null) {
            return l10;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final MyAccountViewModel romeo() {
        return (MyAccountViewModel) this.f12693f.getValue();
    }
}
