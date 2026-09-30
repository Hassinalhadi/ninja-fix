package delivery.samurai.android.ui.orders.note.ui;

import B9.AbstractC0028a;
import B9.J;
import B9.ab;
import Dc.t;
import E9.b;
import L9.d;
import Lb.am;
import Wb.a;
import Wb.c;
import Wb.j;
import Wb.l;
import Wb.n;
import X9.g;
import a4.s;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.C;
import androidx.fragment.app.F;
import androidx.fragment.app.L;
import androidx.lifecycle.T;
import androidx.lifecycle.ac;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import r3.C2492a;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.AbstractC3007i3;
import vf.ad;
import vf.ao;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/orders/note/ui/AddressNoteActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AddressNoteActivity extends k {

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f12347W = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12348H = false;

    /* renamed from: I, reason: collision with root package name */
    public b f12349I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0028a f12350J;

    /* renamed from: K, reason: collision with root package name */
    public final ab f12351K;

    /* renamed from: L, reason: collision with root package name */
    public int f12352L;

    /* renamed from: M, reason: collision with root package name */
    public int f12353M;

    /* renamed from: N, reason: collision with root package name */
    public int f12354N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f12355O;

    /* renamed from: P, reason: collision with root package name */
    public double f12356P;
    public double Q;

    /* renamed from: R, reason: collision with root package name */
    public Uri f12357R;

    /* renamed from: S, reason: collision with root package name */
    public long f12358S;

    /* renamed from: T, reason: collision with root package name */
    public CountDownTimer f12359T;

    /* renamed from: U, reason: collision with root package name */
    public final ah.b f12360U;

    /* renamed from: V, reason: collision with root package name */
    public final ah.b f12361V;

    public AddressNoteActivity() {
        addOnContextAvailableListener(new Eb.b(this, 15));
        this.f12351K = new ab(u.alpha.bravo(AllAddressNoteViewModel.class), new j(this, 1), new j(this, 0), new j(this, 2));
        this.f12352L = -1;
        this.f12353M = -1;
        this.f12354N = -1;
        this.f12360U = registerForActivityResult(new s(7), new a(this, 0));
        this.f12361V = registerForActivityResult(new s(4), new a(this, 1));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return ivory();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12348H) {
            this.f12348H = true;
            l lVar = (l) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            AddressNoteActivity addressNoteActivity = (AddressNoteActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((w9.j) lVar).alpha;
            addressNoteActivity.teal = (C3403a) pVar.sierra.get();
            addressNoteActivity.f12038c = (C3490g) pVar.uniform.get();
            addressNoteActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            addressNoteActivity.e = (InterfaceC2960e) pVar.xray.get();
            addressNoteActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            addressNoteActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            addressNoteActivity.f12042h = (z9.l) pVar.amber.get();
            addressNoteActivity.f12043i = (A9.a) pVar.azure.get();
            addressNoteActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            addressNoteActivity.f12045k = (C3488e) pVar.bronze.get();
            addressNoteActivity.f12046l = (C3484a) pVar.coral.get();
            addressNoteActivity.f12047m = (i) pVar.crimson.get();
            addressNoteActivity.f12048n = (z9.k) pVar.cyan.get();
            addressNoteActivity.f12049o = (C3404b) pVar.emerald.get();
            addressNoteActivity.f12050p = (g) pVar.gold.get();
            addressNoteActivity.f12349I = pVar.bravo();
        }
    }

    public final void gold(int i4) {
        String string = getString(i4);
        Intrinsics.delta(string, "getString(...)");
        d.pink(this, string);
    }

    public final String gray(int i4) {
        Editable text;
        String obj;
        String obj2;
        AbstractC0028a abstractC0028a = this.f12350J;
        String str = null;
        if (abstractC0028a != null) {
            View findViewById = abstractC0028a.f293f.findViewById(i4);
            if (findViewById != null) {
                if (findViewById instanceof TextInputEditText) {
                    Editable text2 = ((TextInputEditText) findViewById).getText();
                    if (text2 != null && (obj2 = text2.toString()) != null) {
                        str = StringsKt.b(obj2).toString();
                    }
                    if (str != null) {
                        return str;
                    }
                    return "";
                }
                if (findViewById instanceof TextInputLayout) {
                    EditText editText = ((TextInputLayout) findViewById).getEditText();
                    if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null) {
                        str = StringsKt.b(obj).toString();
                    }
                    if (str != null) {
                        return str;
                    }
                    return "";
                }
                return "";
            }
            return "";
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final String green() {
        String gray = gray(R.id.til_compound_instructions);
        if (gray.length() == 0) {
            gray = gray(R.id.til_other_instructions);
        }
        if (gray.length() == 0) {
            gray = gray(R.id.til_villa_instructions);
        }
        if (gray.length() == 0) {
            return gray(R.id.et_compound_instructions);
        }
        return gray;
    }

    public final n indigo() {
        AbstractC0028a abstractC0028a = this.f12350J;
        if (abstractC0028a != null) {
            ab abVar = abstractC0028a.f300m;
            Pair pair = new Pair(((J) abVar.purple).bravo, n.alpha);
            if (abstractC0028a != null) {
                Pair pair2 = new Pair(((J) abVar.teal).bravo, n.red);
                if (abstractC0028a != null) {
                    Pair pair3 = new Pair(((J) abVar.white).bravo, n.purple);
                    if (abstractC0028a != null) {
                        Pair pair4 = new Pair(((J) abVar.red).bravo, n.silver);
                        if (abstractC0028a != null) {
                            for (Pair pair5 : CollectionsKt.listOf(pair, pair2, pair3, pair4, new Pair(((J) abVar.silver).bravo, n.teal))) {
                                Object obj = pair5.first;
                                Intrinsics.delta(obj, "component1(...)");
                                n nVar = (n) pair5.second;
                                if (Intrinsics.areEqual(((LinearLayout) obj).getBackground().getConstantState(), getResources().getDrawable(R.drawable.bg_type_box_selected, null).getConstantState())) {
                                    return nVar;
                                }
                            }
                            return n.alpha;
                        }
                        Intrinsics.lima("binding");
                        throw null;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final AllAddressNoteViewModel ivory() {
        return (AllAddressNoteViewModel) this.f12351K.getValue();
    }

    public final void jade(View view) {
        J j5;
        AbstractC0028a abstractC0028a = this.f12350J;
        if (abstractC0028a != null) {
            ab abVar = abstractC0028a.f300m;
            J j6 = (J) abVar.purple;
            if (abstractC0028a != null) {
                J j7 = (J) abVar.teal;
                if (abstractC0028a != null) {
                    J j10 = (J) abVar.white;
                    if (abstractC0028a != null) {
                        J j11 = (J) abVar.red;
                        if (abstractC0028a != null) {
                            for (J j12 : CollectionsKt.listOf(j6, j7, j10, j11, (J) abVar.silver)) {
                                j12.bravo.setBackgroundResource(R.drawable.bg_type_box_unselected);
                                j12.alpha.setColorFilter(getColor(R.color.dark_gray_2));
                                int color = getColor(R.color.dark_gray_2);
                                TextView textView = j12.charlie;
                                textView.setTextColor(color);
                                textView.setTypeface(null, 0);
                            }
                            int id2 = view.getId();
                            AbstractC0028a abstractC0028a2 = this.f12350J;
                            if (abstractC0028a2 != null) {
                                if (id2 == ((J) abstractC0028a2.f300m.purple).bravo.getId()) {
                                    AbstractC0028a abstractC0028a3 = this.f12350J;
                                    if (abstractC0028a3 != null) {
                                        j5 = (J) abstractC0028a3.f300m.purple;
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                } else {
                                    AbstractC0028a abstractC0028a4 = this.f12350J;
                                    if (abstractC0028a4 != null) {
                                        if (id2 == ((J) abstractC0028a4.f300m.teal).bravo.getId()) {
                                            AbstractC0028a abstractC0028a5 = this.f12350J;
                                            if (abstractC0028a5 != null) {
                                                j5 = (J) abstractC0028a5.f300m.teal;
                                            } else {
                                                Intrinsics.lima("binding");
                                                throw null;
                                            }
                                        } else {
                                            AbstractC0028a abstractC0028a6 = this.f12350J;
                                            if (abstractC0028a6 != null) {
                                                if (id2 == ((J) abstractC0028a6.f300m.white).bravo.getId()) {
                                                    AbstractC0028a abstractC0028a7 = this.f12350J;
                                                    if (abstractC0028a7 != null) {
                                                        j5 = (J) abstractC0028a7.f300m.white;
                                                    } else {
                                                        Intrinsics.lima("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    AbstractC0028a abstractC0028a8 = this.f12350J;
                                                    if (abstractC0028a8 != null) {
                                                        if (id2 == ((J) abstractC0028a8.f300m.red).bravo.getId()) {
                                                            AbstractC0028a abstractC0028a9 = this.f12350J;
                                                            if (abstractC0028a9 != null) {
                                                                j5 = (J) abstractC0028a9.f300m.red;
                                                            } else {
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            }
                                                        } else {
                                                            AbstractC0028a abstractC0028a10 = this.f12350J;
                                                            if (abstractC0028a10 != null) {
                                                                j5 = (J) abstractC0028a10.f300m.silver;
                                                            } else {
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        Intrinsics.lima("binding");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Intrinsics.lima("binding");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                }
                                Intrinsics.checkNotNull(j5);
                                j5.bravo.setBackgroundResource(R.drawable.bg_type_box_selected);
                                j5.alpha.setColorFilter(getColor(R.color.black));
                                int color2 = getColor(R.color.black);
                                TextView textView2 = j5.charlie;
                                textView2.setTextColor(color2);
                                textView2.setTypeface(null, 1);
                                return;
                            }
                            Intrinsics.lima("binding");
                            throw null;
                        }
                        Intrinsics.lima("binding");
                        throw null;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void lavender(int i4) {
        AbstractC0028a abstractC0028a = this.f12350J;
        if (abstractC0028a != null) {
            abstractC0028a.f293f.removeAllViews();
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC0028a abstractC0028a2 = this.f12350J;
            if (abstractC0028a2 != null) {
                layoutInflater.inflate(i4, (ViewGroup) abstractC0028a2.f293f, true);
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void lime(boolean z2) {
        AbstractC0028a abstractC0028a = this.f12350J;
        if (abstractC0028a != null) {
            abstractC0028a.f299l.setEnabled(z2);
            AbstractC0028a abstractC0028a2 = this.f12350J;
            if (abstractC0028a2 != null) {
                abstractC0028a2.f308u.setEnabled(z2);
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void magenta(boolean z2) {
        int i4;
        AbstractC0028a abstractC0028a = this.f12350J;
        if (abstractC0028a != null) {
            ProgressBar pbSubmitLoading = abstractC0028a.f304q;
            Intrinsics.delta(pbSubmitLoading, "pbSubmitLoading");
            int i5 = 8;
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            pbSubmitLoading.setVisibility(i4);
            AbstractC0028a abstractC0028a2 = this.f12350J;
            if (abstractC0028a2 != null) {
                TextView tvSubmitButton = abstractC0028a2.f308u;
                Intrinsics.delta(tvSubmitButton, "tvSubmitButton");
                if (!z2) {
                    i5 = 0;
                }
                tvSubmitButton.setVisibility(i5);
                AbstractC0028a abstractC0028a3 = this.f12350J;
                if (abstractC0028a3 != null) {
                    abstractC0028a3.f299l.setEnabled(!z2);
                    return;
                } else {
                    Intrinsics.lima("binding");
                    throw null;
                }
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void maroon(n nVar) {
        if (Wb.d.$EnumSwitchMapping$0[nVar.ordinal()] == 5) {
            AbstractC0028a abstractC0028a = this.f12350J;
            if (abstractC0028a != null) {
                abstractC0028a.f306s.setText(getString(R.string.place_description));
                AbstractC0028a abstractC0028a2 = this.f12350J;
                if (abstractC0028a2 != null) {
                    TextInputLayout textInputLayout = (TextInputLayout) abstractC0028a2.f293f.findViewById(R.id.til_other_description);
                    if (textInputLayout != null) {
                        textInputLayout.setHint(getString(R.string.placeholder_other_examples));
                    }
                    AbstractC0028a abstractC0028a3 = this.f12350J;
                    if (abstractC0028a3 != null) {
                        abstractC0028a3.f309v.setText(getString(R.string.building_with_optional));
                        AbstractC0028a abstractC0028a4 = this.f12350J;
                        if (abstractC0028a4 != null) {
                            abstractC0028a4.f310w.setText(getString(R.string.label_door_optional));
                            return;
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        AbstractC0028a abstractC0028a5 = this.f12350J;
        if (abstractC0028a5 != null) {
            abstractC0028a5.f306s.setText(getString(R.string.address_information));
            AbstractC0028a abstractC0028a6 = this.f12350J;
            if (abstractC0028a6 != null) {
                TextInputLayout textInputLayout2 = (TextInputLayout) abstractC0028a6.f293f.findViewById(R.id.til_compound_instructions);
                if (textInputLayout2 != null) {
                    textInputLayout2.setHint(getString(R.string.label_other_instructions));
                }
                AbstractC0028a abstractC0028a7 = this.f12350J;
                if (abstractC0028a7 != null) {
                    abstractC0028a7.f309v.setText(getString(R.string.building));
                    AbstractC0028a abstractC0028a8 = this.f12350J;
                    if (abstractC0028a8 != null) {
                        abstractC0028a8.f310w.setText(getString(R.string.label_door_optional));
                        return;
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i4;
        super.onCreate(bundle);
        z1.g delta = z1.d.delta(this, R.layout.activity_address_note);
        Intrinsics.delta(delta, "setContentView(...)");
        this.f12350J = (AbstractC0028a) delta;
        this.f12358S = System.currentTimeMillis();
        int i5 = -1;
        this.f12353M = getIntent().getIntExtra("taskAddressId", -1);
        this.f12354N = getIntent().getIntExtra("orderTaskId", -1);
        this.f12355O = getIntent().getBooleanExtra("KEY_HAS_SKIP", false);
        this.f12356P = getIntent().getDoubleExtra("lat", 0.0d);
        this.Q = getIntent().getDoubleExtra("lng", 0.0d);
        int intExtra = getIntent().getIntExtra("remainingAddressNoteInputSeconds", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            String string = getString(R.string.submit_note_complete_delivery);
            Intrinsics.delta(string, "getString(...)");
            this.f12359T = new Wb.k(this, string, intValue * 1000).start();
        }
        AbstractC3007i3.alpha(getOnBackPressedDispatcher(), this, new am(25), 2);
        if (!this.f12355O) {
            AbstractC0028a abstractC0028a = this.f12350J;
            if (abstractC0028a != null) {
                abstractC0028a.f308u.setText(getString(R.string.submit_note_only));
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        AbstractC0028a abstractC0028a2 = this.f12350J;
        if (abstractC0028a2 != null) {
            MaterialCardView cvSkipNote = abstractC0028a2.f298k;
            Intrinsics.delta(cvSkipNote, "cvSkipNote");
            if (this.f12355O) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            cvSkipNote.setVisibility(i4);
            AbstractC0028a abstractC0028a3 = this.f12350J;
            if (abstractC0028a3 != null) {
                J j5 = (J) abstractC0028a3.f300m.purple;
                j5.alpha.setImageResource(R.drawable.building_4_fill);
                j5.charlie.setText(getString(R.string.building));
                AbstractC0028a abstractC0028a4 = this.f12350J;
                if (abstractC0028a4 != null) {
                    J j6 = (J) abstractC0028a4.f300m.teal;
                    j6.alpha.setImageResource(R.drawable.home_8_fill);
                    j6.charlie.setText(getString(R.string.type_villa));
                    AbstractC0028a abstractC0028a5 = this.f12350J;
                    if (abstractC0028a5 != null) {
                        J j7 = (J) abstractC0028a5.f300m.white;
                        j7.alpha.setImageResource(R.drawable.briefcase_4_fill);
                        j7.charlie.setText(getString(R.string.office));
                        AbstractC0028a abstractC0028a6 = this.f12350J;
                        if (abstractC0028a6 != null) {
                            J j10 = (J) abstractC0028a6.f300m.red;
                            j10.alpha.setImageResource(R.drawable.building2_filled_svgrepo_com_1);
                            j10.charlie.setText(getString(R.string.type_compound));
                            AbstractC0028a abstractC0028a7 = this.f12350J;
                            if (abstractC0028a7 != null) {
                                J j11 = (J) abstractC0028a7.f300m.silver;
                                j11.alpha.setImageResource(R.drawable.tent_fill);
                                j11.charlie.setText(getString(R.string.type_other));
                                AbstractC0028a abstractC0028a8 = this.f12350J;
                                if (abstractC0028a8 != null) {
                                    jade(((J) abstractC0028a8.f300m.purple).bravo);
                                    lavender(R.layout.include_form_building);
                                    AbstractC0028a abstractC0028a9 = this.f12350J;
                                    if (abstractC0028a9 != null) {
                                        abstractC0028a9.red.clearFocus();
                                        maroon(n.alpha);
                                        AbstractC0028a abstractC0028a10 = this.f12350J;
                                        if (abstractC0028a10 != null) {
                                            final int i10 = 1;
                                            ((J) abstractC0028a10.f300m.purple).bravo.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                public final /* synthetic */ AddressNoteActivity purple;

                                                {
                                                    this.purple = this;
                                                }

                                                /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    String str;
                                                    String str2;
                                                    String str3;
                                                    String str4;
                                                    ArrayList arrayList;
                                                    Pair pair;
                                                    Pair pair2;
                                                    boolean z2;
                                                    boolean z10;
                                                    boolean z11;
                                                    boolean z12;
                                                    AddressNoteActivity addressNoteActivity = this.purple;
                                                    switch (i10) {
                                                        case 0:
                                                            int i11 = AddressNoteActivity.f12347W;
                                                            Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                            if (aVar != null) {
                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                return;
                                                            }
                                                            return;
                                                        case 1:
                                                            int i12 = AddressNoteActivity.f12347W;
                                                            Intrinsics.checkNotNull(view);
                                                            addressNoteActivity.jade(view);
                                                            addressNoteActivity.lavender(R.layout.include_form_building);
                                                            AbstractC0028a abstractC0028a11 = addressNoteActivity.f12350J;
                                                            if (abstractC0028a11 != null) {
                                                                abstractC0028a11.red.clearFocus();
                                                                addressNoteActivity.maroon(n.alpha);
                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                return;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        case 2:
                                                            int i13 = AddressNoteActivity.f12347W;
                                                            Intrinsics.checkNotNull(view);
                                                            addressNoteActivity.jade(view);
                                                            addressNoteActivity.lavender(R.layout.include_form_villa);
                                                            AbstractC0028a abstractC0028a12 = addressNoteActivity.f12350J;
                                                            if (abstractC0028a12 != null) {
                                                                abstractC0028a12.red.clearFocus();
                                                                addressNoteActivity.maroon(n.red);
                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                return;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        case 3:
                                                            int i14 = AddressNoteActivity.f12347W;
                                                            Intrinsics.checkNotNull(view);
                                                            addressNoteActivity.jade(view);
                                                            addressNoteActivity.lavender(R.layout.include_form_business);
                                                            AbstractC0028a abstractC0028a13 = addressNoteActivity.f12350J;
                                                            if (abstractC0028a13 != null) {
                                                                abstractC0028a13.red.clearFocus();
                                                                addressNoteActivity.maroon(n.purple);
                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                return;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        case 4:
                                                            int i15 = AddressNoteActivity.f12347W;
                                                            Intrinsics.checkNotNull(view);
                                                            addressNoteActivity.jade(view);
                                                            addressNoteActivity.lavender(R.layout.include_form_compound);
                                                            AbstractC0028a abstractC0028a14 = addressNoteActivity.f12350J;
                                                            if (abstractC0028a14 != null) {
                                                                abstractC0028a14.red.clearFocus();
                                                                addressNoteActivity.maroon(n.silver);
                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                return;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        case 5:
                                                            int i16 = AddressNoteActivity.f12347W;
                                                            Intrinsics.checkNotNull(view);
                                                            addressNoteActivity.jade(view);
                                                            addressNoteActivity.lavender(R.layout.include_form_other);
                                                            AbstractC0028a abstractC0028a15 = addressNoteActivity.f12350J;
                                                            if (abstractC0028a15 != null) {
                                                                abstractC0028a15.red.clearFocus();
                                                                addressNoteActivity.maroon(n.teal);
                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                return;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        case 6:
                                                            int i17 = AddressNoteActivity.f12347W;
                                                            Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                            if (aVar2 == null) {
                                                                aVar2 = new Vb.a(null, null);
                                                            }
                                                            Pair pair3 = aVar2.alpha;
                                                            if (pair3 != null) {
                                                                str = (String) pair3.getSecond();
                                                            } else {
                                                                str = null;
                                                            }
                                                            Pair pair4 = aVar2.bravo;
                                                            if (pair4 != null) {
                                                                str2 = (String) pair4.getSecond();
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            int ordinal = addressNoteActivity.indigo().ordinal();
                                                            if (ordinal != 0) {
                                                                if (ordinal != 1) {
                                                                    if (ordinal != 2) {
                                                                        if (ordinal != 3) {
                                                                            if (ordinal == 4) {
                                                                                if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                    return;
                                                                                }
                                                                            } else {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                        } else {
                                                                            String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                            String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                            if (gray.length() > 0) {
                                                                                z11 = true;
                                                                            } else {
                                                                                z11 = false;
                                                                            }
                                                                            if (gray2.length() > 0) {
                                                                                z12 = true;
                                                                            } else {
                                                                                z12 = false;
                                                                            }
                                                                            if (!z11 && !z12) {
                                                                                addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                return;
                                                                            } else if (str == null || str.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                        String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                        if (gray3.length() > 0) {
                                                                            z2 = true;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                        if (gray4.length() > 0) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        if (!z2 && !z10) {
                                                                            addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                            return;
                                                                        } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                            addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                            return;
                                                                        }
                                                                    }
                                                                } else {
                                                                    String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                    String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                    String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                    if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                        if (gray5.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                            return;
                                                                        } else if (gray7.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_building_num_required);
                                                                            return;
                                                                        } else if (gray6.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                            return;
                                                                        }
                                                                    }
                                                                    if (str == null || str.length() == 0) {
                                                                        addressNoteActivity.gold(R.string.error_building_image_required);
                                                                        return;
                                                                    }
                                                                }
                                                            } else {
                                                                String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                    if (gray8.length() == 0) {
                                                                        addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                        return;
                                                                    } else if (gray9.length() == 0) {
                                                                        addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                        return;
                                                                    } else if (gray10.length() == 0) {
                                                                        addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                        return;
                                                                    }
                                                                }
                                                                if (str == null || str.length() == 0) {
                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                    return;
                                                                }
                                                            }
                                                            n indigo = addressNoteActivity.indigo();
                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                            String green = addressNoteActivity.green();
                                                            if (!StringsKt.gray(green)) {
                                                                linkedHashMap.put("otherInstructions", green);
                                                            }
                                                            int ordinal2 = indigo.ordinal();
                                                            if (ordinal2 != 0) {
                                                                if (ordinal2 != 1) {
                                                                    if (ordinal2 != 2) {
                                                                        if (ordinal2 != 3) {
                                                                            if (ordinal2 == 4) {
                                                                                linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                            } else {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                        } else {
                                                                            linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                        }
                                                                    } else {
                                                                        linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                    }
                                                                } else {
                                                                    linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                    linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                    linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                }
                                                            } else {
                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                            }
                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                if (!StringsKt.gray((String) entry.getValue())) {
                                                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                }
                                                            }
                                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                if (((String) entry2.getValue()).length() > 0) {
                                                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                }
                                                            }
                                                            String green2 = addressNoteActivity.green();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            int ordinal3 = indigo.ordinal();
                                                            if (ordinal3 != 0) {
                                                                if (ordinal3 != 1) {
                                                                    if (ordinal3 != 2) {
                                                                        if (ordinal3 != 3) {
                                                                            if (ordinal3 == 4) {
                                                                                String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                if (StringsKt.gray(gray11)) {
                                                                                    gray11 = null;
                                                                                }
                                                                                if (gray11 != null) {
                                                                                    arrayList2.add(gray11);
                                                                                }
                                                                            } else {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                        } else {
                                                                            String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                            if (StringsKt.gray(gray12)) {
                                                                                gray12 = null;
                                                                            }
                                                                            if (gray12 != null) {
                                                                                arrayList2.add("House # ".concat(gray12));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                        if (StringsKt.gray(gray13)) {
                                                                            gray13 = null;
                                                                        }
                                                                        if (gray13 != null) {
                                                                            arrayList2.add("Villa # ".concat(gray13));
                                                                        }
                                                                    }
                                                                } else {
                                                                    String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                    if (StringsKt.gray(gray14)) {
                                                                        gray14 = null;
                                                                    }
                                                                    if (gray14 != null) {
                                                                        arrayList2.add("Business: ".concat(gray14));
                                                                    }
                                                                    String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                    if (StringsKt.gray(gray15)) {
                                                                        gray15 = null;
                                                                    }
                                                                    if (gray15 != null) {
                                                                        arrayList2.add("Building # ".concat(gray15));
                                                                    }
                                                                    String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                    if (StringsKt.gray(gray16)) {
                                                                        gray16 = null;
                                                                    }
                                                                    if (gray16 != null) {
                                                                        arrayList2.add("Floor # ".concat(gray16));
                                                                    }
                                                                }
                                                            } else {
                                                                String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                if (StringsKt.gray(gray17)) {
                                                                    gray17 = null;
                                                                }
                                                                if (gray17 != null) {
                                                                    arrayList2.add("Building # ".concat(gray17));
                                                                }
                                                                String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                if (StringsKt.gray(gray18)) {
                                                                    gray18 = null;
                                                                }
                                                                if (gray18 != null) {
                                                                    arrayList2.add("Floor # ".concat(gray18));
                                                                }
                                                                String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                if (StringsKt.gray(gray19)) {
                                                                    gray19 = null;
                                                                }
                                                                if (gray19 != null) {
                                                                    arrayList2.add("Door # ".concat(gray19));
                                                                }
                                                            }
                                                            if (StringsKt.gray(green2)) {
                                                                green2 = null;
                                                            }
                                                            if (green2 != null) {
                                                                arrayList2.add("Other instructions: ".concat(green2));
                                                            }
                                                            String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                            Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                            if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                str3 = (String) pair2.getSecond();
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                            if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                str4 = (String) pair.getSecond();
                                                            } else {
                                                                str4 = null;
                                                            }
                                                            ArrayList arrayList3 = new ArrayList();
                                                            if (str3 != null) {
                                                                arrayList3.add(str3);
                                                            }
                                                            if (str4 != null) {
                                                                arrayList3.add(str4);
                                                            }
                                                            AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                            int i18 = addressNoteActivity.f12353M;
                                                            int i19 = addressNoteActivity.f12354N;
                                                            double d4 = addressNoteActivity.f12356P;
                                                            double d9 = addressNoteActivity.Q;
                                                            String addressType = indigo.name();
                                                            if (arrayList3.isEmpty()) {
                                                                arrayList = null;
                                                            } else {
                                                                arrayList = arrayList3;
                                                            }
                                                            long j12 = addressNoteActivity.f12358S;
                                                            Double valueOf2 = Double.valueOf(d4);
                                                            Double valueOf3 = Double.valueOf(d9);
                                                            Intrinsics.echo(description, "description");
                                                            Intrinsics.echo(addressType, "addressType");
                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                            V1.a hotel = T.hotel(ivory);
                                                            Cf.e eVar = ao.alpha;
                                                            ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                            auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                            return;
                                                        case 7:
                                                            AbstractC0028a abstractC0028a16 = addressNoteActivity.f12350J;
                                                            if (abstractC0028a16 != null) {
                                                                ProgressBar pbSkipLoading = abstractC0028a16.f303p;
                                                                Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                pbSkipLoading.setVisibility(0);
                                                                AbstractC0028a abstractC0028a17 = addressNoteActivity.f12350J;
                                                                if (abstractC0028a17 != null) {
                                                                    TextView tvSkipButton = abstractC0028a17.f307t;
                                                                    Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                    tvSkipButton.setVisibility(8);
                                                                    AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a18 != null) {
                                                                        abstractC0028a18.f298k.setEnabled(false);
                                                                        Intent intent = new Intent();
                                                                        intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                        addressNoteActivity.setResult(-1, intent);
                                                                        addressNoteActivity.finish();
                                                                        return;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        case 8:
                                                            int i20 = AddressNoteActivity.f12347W;
                                                            K9.b[] bVarArr = K9.b.purple;
                                                            addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                            return;
                                                        case 9:
                                                            int i21 = AddressNoteActivity.f12347W;
                                                            K9.b[] bVarArr2 = K9.b.purple;
                                                            addressNoteActivity.f12352L = 1002;
                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                            return;
                                                        default:
                                                            int i22 = AddressNoteActivity.f12347W;
                                                            Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                            if (aVar5 != null) {
                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            AbstractC0028a abstractC0028a11 = this.f12350J;
                                            if (abstractC0028a11 != null) {
                                                final int i11 = 2;
                                                ((J) abstractC0028a11.f300m.teal).bravo.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                    public final /* synthetic */ AddressNoteActivity purple;

                                                    {
                                                        this.purple = this;
                                                    }

                                                    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        String str;
                                                        String str2;
                                                        String str3;
                                                        String str4;
                                                        ArrayList arrayList;
                                                        Pair pair;
                                                        Pair pair2;
                                                        boolean z2;
                                                        boolean z10;
                                                        boolean z11;
                                                        boolean z12;
                                                        AddressNoteActivity addressNoteActivity = this.purple;
                                                        switch (i11) {
                                                            case 0:
                                                                int i112 = AddressNoteActivity.f12347W;
                                                                Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                if (aVar != null) {
                                                                    addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                    return;
                                                                }
                                                                return;
                                                            case 1:
                                                                int i12 = AddressNoteActivity.f12347W;
                                                                Intrinsics.checkNotNull(view);
                                                                addressNoteActivity.jade(view);
                                                                addressNoteActivity.lavender(R.layout.include_form_building);
                                                                AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                if (abstractC0028a112 != null) {
                                                                    abstractC0028a112.red.clearFocus();
                                                                    addressNoteActivity.maroon(n.alpha);
                                                                    addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                    return;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            case 2:
                                                                int i13 = AddressNoteActivity.f12347W;
                                                                Intrinsics.checkNotNull(view);
                                                                addressNoteActivity.jade(view);
                                                                addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                AbstractC0028a abstractC0028a12 = addressNoteActivity.f12350J;
                                                                if (abstractC0028a12 != null) {
                                                                    abstractC0028a12.red.clearFocus();
                                                                    addressNoteActivity.maroon(n.red);
                                                                    addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                    return;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            case 3:
                                                                int i14 = AddressNoteActivity.f12347W;
                                                                Intrinsics.checkNotNull(view);
                                                                addressNoteActivity.jade(view);
                                                                addressNoteActivity.lavender(R.layout.include_form_business);
                                                                AbstractC0028a abstractC0028a13 = addressNoteActivity.f12350J;
                                                                if (abstractC0028a13 != null) {
                                                                    abstractC0028a13.red.clearFocus();
                                                                    addressNoteActivity.maroon(n.purple);
                                                                    addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                    return;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            case 4:
                                                                int i15 = AddressNoteActivity.f12347W;
                                                                Intrinsics.checkNotNull(view);
                                                                addressNoteActivity.jade(view);
                                                                addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                AbstractC0028a abstractC0028a14 = addressNoteActivity.f12350J;
                                                                if (abstractC0028a14 != null) {
                                                                    abstractC0028a14.red.clearFocus();
                                                                    addressNoteActivity.maroon(n.silver);
                                                                    addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                    return;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            case 5:
                                                                int i16 = AddressNoteActivity.f12347W;
                                                                Intrinsics.checkNotNull(view);
                                                                addressNoteActivity.jade(view);
                                                                addressNoteActivity.lavender(R.layout.include_form_other);
                                                                AbstractC0028a abstractC0028a15 = addressNoteActivity.f12350J;
                                                                if (abstractC0028a15 != null) {
                                                                    abstractC0028a15.red.clearFocus();
                                                                    addressNoteActivity.maroon(n.teal);
                                                                    addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                    return;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            case 6:
                                                                int i17 = AddressNoteActivity.f12347W;
                                                                Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                if (aVar2 == null) {
                                                                    aVar2 = new Vb.a(null, null);
                                                                }
                                                                Pair pair3 = aVar2.alpha;
                                                                if (pair3 != null) {
                                                                    str = (String) pair3.getSecond();
                                                                } else {
                                                                    str = null;
                                                                }
                                                                Pair pair4 = aVar2.bravo;
                                                                if (pair4 != null) {
                                                                    str2 = (String) pair4.getSecond();
                                                                } else {
                                                                    str2 = null;
                                                                }
                                                                int ordinal = addressNoteActivity.indigo().ordinal();
                                                                if (ordinal != 0) {
                                                                    if (ordinal != 1) {
                                                                        if (ordinal != 2) {
                                                                            if (ordinal != 3) {
                                                                                if (ordinal == 4) {
                                                                                    if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                        return;
                                                                                    }
                                                                                } else {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                            } else {
                                                                                String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                if (gray.length() > 0) {
                                                                                    z11 = true;
                                                                                } else {
                                                                                    z11 = false;
                                                                                }
                                                                                if (gray2.length() > 0) {
                                                                                    z12 = true;
                                                                                } else {
                                                                                    z12 = false;
                                                                                }
                                                                                if (!z11 && !z12) {
                                                                                    addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                    return;
                                                                                } else if (str == null || str.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                            String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                            if (gray3.length() > 0) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = false;
                                                                            }
                                                                            if (gray4.length() > 0) {
                                                                                z10 = true;
                                                                            } else {
                                                                                z10 = false;
                                                                            }
                                                                            if (!z2 && !z10) {
                                                                                addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                return;
                                                                            } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                        String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                        String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                        if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                            if (gray5.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                return;
                                                                            } else if (gray7.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                return;
                                                                            } else if (gray6.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                return;
                                                                            }
                                                                        }
                                                                        if (str == null || str.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_building_image_required);
                                                                            return;
                                                                        }
                                                                    }
                                                                } else {
                                                                    String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                    String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                    String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                    if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                        if (gray8.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                            return;
                                                                        } else if (gray9.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                            return;
                                                                        } else if (gray10.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                            return;
                                                                        }
                                                                    }
                                                                    if (str == null || str.length() == 0) {
                                                                        addressNoteActivity.gold(R.string.error_building_image_required);
                                                                        return;
                                                                    }
                                                                }
                                                                n indigo = addressNoteActivity.indigo();
                                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                String green = addressNoteActivity.green();
                                                                if (!StringsKt.gray(green)) {
                                                                    linkedHashMap.put("otherInstructions", green);
                                                                }
                                                                int ordinal2 = indigo.ordinal();
                                                                if (ordinal2 != 0) {
                                                                    if (ordinal2 != 1) {
                                                                        if (ordinal2 != 2) {
                                                                            if (ordinal2 != 3) {
                                                                                if (ordinal2 == 4) {
                                                                                    linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                } else {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                            } else {
                                                                                linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                            }
                                                                        } else {
                                                                            linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                        }
                                                                    } else {
                                                                        linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                        linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                        linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                    }
                                                                } else {
                                                                    linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                    linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                    linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                }
                                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                    if (!StringsKt.gray((String) entry.getValue())) {
                                                                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                    }
                                                                }
                                                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                    if (((String) entry2.getValue()).length() > 0) {
                                                                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                    }
                                                                }
                                                                String green2 = addressNoteActivity.green();
                                                                ArrayList arrayList2 = new ArrayList();
                                                                int ordinal3 = indigo.ordinal();
                                                                if (ordinal3 != 0) {
                                                                    if (ordinal3 != 1) {
                                                                        if (ordinal3 != 2) {
                                                                            if (ordinal3 != 3) {
                                                                                if (ordinal3 == 4) {
                                                                                    String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                    if (StringsKt.gray(gray11)) {
                                                                                        gray11 = null;
                                                                                    }
                                                                                    if (gray11 != null) {
                                                                                        arrayList2.add(gray11);
                                                                                    }
                                                                                } else {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                            } else {
                                                                                String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                if (StringsKt.gray(gray12)) {
                                                                                    gray12 = null;
                                                                                }
                                                                                if (gray12 != null) {
                                                                                    arrayList2.add("House # ".concat(gray12));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                            if (StringsKt.gray(gray13)) {
                                                                                gray13 = null;
                                                                            }
                                                                            if (gray13 != null) {
                                                                                arrayList2.add("Villa # ".concat(gray13));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                        if (StringsKt.gray(gray14)) {
                                                                            gray14 = null;
                                                                        }
                                                                        if (gray14 != null) {
                                                                            arrayList2.add("Business: ".concat(gray14));
                                                                        }
                                                                        String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                        if (StringsKt.gray(gray15)) {
                                                                            gray15 = null;
                                                                        }
                                                                        if (gray15 != null) {
                                                                            arrayList2.add("Building # ".concat(gray15));
                                                                        }
                                                                        String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                        if (StringsKt.gray(gray16)) {
                                                                            gray16 = null;
                                                                        }
                                                                        if (gray16 != null) {
                                                                            arrayList2.add("Floor # ".concat(gray16));
                                                                        }
                                                                    }
                                                                } else {
                                                                    String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                    if (StringsKt.gray(gray17)) {
                                                                        gray17 = null;
                                                                    }
                                                                    if (gray17 != null) {
                                                                        arrayList2.add("Building # ".concat(gray17));
                                                                    }
                                                                    String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                    if (StringsKt.gray(gray18)) {
                                                                        gray18 = null;
                                                                    }
                                                                    if (gray18 != null) {
                                                                        arrayList2.add("Floor # ".concat(gray18));
                                                                    }
                                                                    String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                    if (StringsKt.gray(gray19)) {
                                                                        gray19 = null;
                                                                    }
                                                                    if (gray19 != null) {
                                                                        arrayList2.add("Door # ".concat(gray19));
                                                                    }
                                                                }
                                                                if (StringsKt.gray(green2)) {
                                                                    green2 = null;
                                                                }
                                                                if (green2 != null) {
                                                                    arrayList2.add("Other instructions: ".concat(green2));
                                                                }
                                                                String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                    str3 = (String) pair2.getSecond();
                                                                } else {
                                                                    str3 = null;
                                                                }
                                                                Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                    str4 = (String) pair.getSecond();
                                                                } else {
                                                                    str4 = null;
                                                                }
                                                                ArrayList arrayList3 = new ArrayList();
                                                                if (str3 != null) {
                                                                    arrayList3.add(str3);
                                                                }
                                                                if (str4 != null) {
                                                                    arrayList3.add(str4);
                                                                }
                                                                AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                int i18 = addressNoteActivity.f12353M;
                                                                int i19 = addressNoteActivity.f12354N;
                                                                double d4 = addressNoteActivity.f12356P;
                                                                double d9 = addressNoteActivity.Q;
                                                                String addressType = indigo.name();
                                                                if (arrayList3.isEmpty()) {
                                                                    arrayList = null;
                                                                } else {
                                                                    arrayList = arrayList3;
                                                                }
                                                                long j12 = addressNoteActivity.f12358S;
                                                                Double valueOf2 = Double.valueOf(d4);
                                                                Double valueOf3 = Double.valueOf(d9);
                                                                Intrinsics.echo(description, "description");
                                                                Intrinsics.echo(addressType, "addressType");
                                                                ?? auVar = new au(new C2492a(2, "loading"));
                                                                V1.a hotel = T.hotel(ivory);
                                                                Cf.e eVar = ao.alpha;
                                                                ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                return;
                                                            case 7:
                                                                AbstractC0028a abstractC0028a16 = addressNoteActivity.f12350J;
                                                                if (abstractC0028a16 != null) {
                                                                    ProgressBar pbSkipLoading = abstractC0028a16.f303p;
                                                                    Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                    pbSkipLoading.setVisibility(0);
                                                                    AbstractC0028a abstractC0028a17 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a17 != null) {
                                                                        TextView tvSkipButton = abstractC0028a17.f307t;
                                                                        Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                        tvSkipButton.setVisibility(8);
                                                                        AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a18 != null) {
                                                                            abstractC0028a18.f298k.setEnabled(false);
                                                                            Intent intent = new Intent();
                                                                            intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                            addressNoteActivity.setResult(-1, intent);
                                                                            addressNoteActivity.finish();
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            case 8:
                                                                int i20 = AddressNoteActivity.f12347W;
                                                                K9.b[] bVarArr = K9.b.purple;
                                                                addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                return;
                                                            case 9:
                                                                int i21 = AddressNoteActivity.f12347W;
                                                                K9.b[] bVarArr2 = K9.b.purple;
                                                                addressNoteActivity.f12352L = 1002;
                                                                addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                return;
                                                            default:
                                                                int i22 = AddressNoteActivity.f12347W;
                                                                Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                if (aVar5 != null) {
                                                                    addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                AbstractC0028a abstractC0028a12 = this.f12350J;
                                                if (abstractC0028a12 != null) {
                                                    final int i12 = 3;
                                                    ((J) abstractC0028a12.f300m.white).bravo.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                        public final /* synthetic */ AddressNoteActivity purple;

                                                        {
                                                            this.purple = this;
                                                        }

                                                        /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            String str;
                                                            String str2;
                                                            String str3;
                                                            String str4;
                                                            ArrayList arrayList;
                                                            Pair pair;
                                                            Pair pair2;
                                                            boolean z2;
                                                            boolean z10;
                                                            boolean z11;
                                                            boolean z12;
                                                            AddressNoteActivity addressNoteActivity = this.purple;
                                                            switch (i12) {
                                                                case 0:
                                                                    int i112 = AddressNoteActivity.f12347W;
                                                                    Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                    if (aVar != null) {
                                                                        addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 1:
                                                                    int i122 = AddressNoteActivity.f12347W;
                                                                    Intrinsics.checkNotNull(view);
                                                                    addressNoteActivity.jade(view);
                                                                    addressNoteActivity.lavender(R.layout.include_form_building);
                                                                    AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a112 != null) {
                                                                        abstractC0028a112.red.clearFocus();
                                                                        addressNoteActivity.maroon(n.alpha);
                                                                        addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                        return;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                case 2:
                                                                    int i13 = AddressNoteActivity.f12347W;
                                                                    Intrinsics.checkNotNull(view);
                                                                    addressNoteActivity.jade(view);
                                                                    addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                    AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a122 != null) {
                                                                        abstractC0028a122.red.clearFocus();
                                                                        addressNoteActivity.maroon(n.red);
                                                                        addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                        return;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                case 3:
                                                                    int i14 = AddressNoteActivity.f12347W;
                                                                    Intrinsics.checkNotNull(view);
                                                                    addressNoteActivity.jade(view);
                                                                    addressNoteActivity.lavender(R.layout.include_form_business);
                                                                    AbstractC0028a abstractC0028a13 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a13 != null) {
                                                                        abstractC0028a13.red.clearFocus();
                                                                        addressNoteActivity.maroon(n.purple);
                                                                        addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                        return;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                case 4:
                                                                    int i15 = AddressNoteActivity.f12347W;
                                                                    Intrinsics.checkNotNull(view);
                                                                    addressNoteActivity.jade(view);
                                                                    addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                    AbstractC0028a abstractC0028a14 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a14 != null) {
                                                                        abstractC0028a14.red.clearFocus();
                                                                        addressNoteActivity.maroon(n.silver);
                                                                        addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                        return;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                case 5:
                                                                    int i16 = AddressNoteActivity.f12347W;
                                                                    Intrinsics.checkNotNull(view);
                                                                    addressNoteActivity.jade(view);
                                                                    addressNoteActivity.lavender(R.layout.include_form_other);
                                                                    AbstractC0028a abstractC0028a15 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a15 != null) {
                                                                        abstractC0028a15.red.clearFocus();
                                                                        addressNoteActivity.maroon(n.teal);
                                                                        addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                        return;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                case 6:
                                                                    int i17 = AddressNoteActivity.f12347W;
                                                                    Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                    if (aVar2 == null) {
                                                                        aVar2 = new Vb.a(null, null);
                                                                    }
                                                                    Pair pair3 = aVar2.alpha;
                                                                    if (pair3 != null) {
                                                                        str = (String) pair3.getSecond();
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    Pair pair4 = aVar2.bravo;
                                                                    if (pair4 != null) {
                                                                        str2 = (String) pair4.getSecond();
                                                                    } else {
                                                                        str2 = null;
                                                                    }
                                                                    int ordinal = addressNoteActivity.indigo().ordinal();
                                                                    if (ordinal != 0) {
                                                                        if (ordinal != 1) {
                                                                            if (ordinal != 2) {
                                                                                if (ordinal != 3) {
                                                                                    if (ordinal == 4) {
                                                                                        if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                            addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                            return;
                                                                                        }
                                                                                    } else {
                                                                                        throw new NoWhenBranchMatchedException();
                                                                                    }
                                                                                } else {
                                                                                    String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                    String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                    if (gray.length() > 0) {
                                                                                        z11 = true;
                                                                                    } else {
                                                                                        z11 = false;
                                                                                    }
                                                                                    if (gray2.length() > 0) {
                                                                                        z12 = true;
                                                                                    } else {
                                                                                        z12 = false;
                                                                                    }
                                                                                    if (!z11 && !z12) {
                                                                                        addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                        return;
                                                                                    } else if (str == null || str.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                if (gray3.length() > 0) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    z2 = false;
                                                                                }
                                                                                if (gray4.length() > 0) {
                                                                                    z10 = true;
                                                                                } else {
                                                                                    z10 = false;
                                                                                }
                                                                                if (!z2 && !z10) {
                                                                                    addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                    return;
                                                                                } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                    addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                            String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                            String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                            if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                if (gray5.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                    return;
                                                                                } else if (gray7.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                    return;
                                                                                } else if (gray6.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            if (str == null || str.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                        String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                        String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                        if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                            if (gray8.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                return;
                                                                            } else if (gray9.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                return;
                                                                            } else if (gray10.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                return;
                                                                            }
                                                                        }
                                                                        if (str == null || str.length() == 0) {
                                                                            addressNoteActivity.gold(R.string.error_building_image_required);
                                                                            return;
                                                                        }
                                                                    }
                                                                    n indigo = addressNoteActivity.indigo();
                                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                    String green = addressNoteActivity.green();
                                                                    if (!StringsKt.gray(green)) {
                                                                        linkedHashMap.put("otherInstructions", green);
                                                                    }
                                                                    int ordinal2 = indigo.ordinal();
                                                                    if (ordinal2 != 0) {
                                                                        if (ordinal2 != 1) {
                                                                            if (ordinal2 != 2) {
                                                                                if (ordinal2 != 3) {
                                                                                    if (ordinal2 == 4) {
                                                                                        linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                    } else {
                                                                                        throw new NoWhenBranchMatchedException();
                                                                                    }
                                                                                } else {
                                                                                    linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                }
                                                                            } else {
                                                                                linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                            }
                                                                        } else {
                                                                            linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                            linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                            linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                        }
                                                                    } else {
                                                                        linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                        linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                        linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                    }
                                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                        if (!StringsKt.gray((String) entry.getValue())) {
                                                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                        }
                                                                    }
                                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                        if (((String) entry2.getValue()).length() > 0) {
                                                                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                        }
                                                                    }
                                                                    String green2 = addressNoteActivity.green();
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    int ordinal3 = indigo.ordinal();
                                                                    if (ordinal3 != 0) {
                                                                        if (ordinal3 != 1) {
                                                                            if (ordinal3 != 2) {
                                                                                if (ordinal3 != 3) {
                                                                                    if (ordinal3 == 4) {
                                                                                        String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                        if (StringsKt.gray(gray11)) {
                                                                                            gray11 = null;
                                                                                        }
                                                                                        if (gray11 != null) {
                                                                                            arrayList2.add(gray11);
                                                                                        }
                                                                                    } else {
                                                                                        throw new NoWhenBranchMatchedException();
                                                                                    }
                                                                                } else {
                                                                                    String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                    if (StringsKt.gray(gray12)) {
                                                                                        gray12 = null;
                                                                                    }
                                                                                    if (gray12 != null) {
                                                                                        arrayList2.add("House # ".concat(gray12));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                if (StringsKt.gray(gray13)) {
                                                                                    gray13 = null;
                                                                                }
                                                                                if (gray13 != null) {
                                                                                    arrayList2.add("Villa # ".concat(gray13));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                            if (StringsKt.gray(gray14)) {
                                                                                gray14 = null;
                                                                            }
                                                                            if (gray14 != null) {
                                                                                arrayList2.add("Business: ".concat(gray14));
                                                                            }
                                                                            String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                            if (StringsKt.gray(gray15)) {
                                                                                gray15 = null;
                                                                            }
                                                                            if (gray15 != null) {
                                                                                arrayList2.add("Building # ".concat(gray15));
                                                                            }
                                                                            String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                            if (StringsKt.gray(gray16)) {
                                                                                gray16 = null;
                                                                            }
                                                                            if (gray16 != null) {
                                                                                arrayList2.add("Floor # ".concat(gray16));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                        if (StringsKt.gray(gray17)) {
                                                                            gray17 = null;
                                                                        }
                                                                        if (gray17 != null) {
                                                                            arrayList2.add("Building # ".concat(gray17));
                                                                        }
                                                                        String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                        if (StringsKt.gray(gray18)) {
                                                                            gray18 = null;
                                                                        }
                                                                        if (gray18 != null) {
                                                                            arrayList2.add("Floor # ".concat(gray18));
                                                                        }
                                                                        String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                        if (StringsKt.gray(gray19)) {
                                                                            gray19 = null;
                                                                        }
                                                                        if (gray19 != null) {
                                                                            arrayList2.add("Door # ".concat(gray19));
                                                                        }
                                                                    }
                                                                    if (StringsKt.gray(green2)) {
                                                                        green2 = null;
                                                                    }
                                                                    if (green2 != null) {
                                                                        arrayList2.add("Other instructions: ".concat(green2));
                                                                    }
                                                                    String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                    Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                    if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                        str3 = (String) pair2.getSecond();
                                                                    } else {
                                                                        str3 = null;
                                                                    }
                                                                    Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                    if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                        str4 = (String) pair.getSecond();
                                                                    } else {
                                                                        str4 = null;
                                                                    }
                                                                    ArrayList arrayList3 = new ArrayList();
                                                                    if (str3 != null) {
                                                                        arrayList3.add(str3);
                                                                    }
                                                                    if (str4 != null) {
                                                                        arrayList3.add(str4);
                                                                    }
                                                                    AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                    int i18 = addressNoteActivity.f12353M;
                                                                    int i19 = addressNoteActivity.f12354N;
                                                                    double d4 = addressNoteActivity.f12356P;
                                                                    double d9 = addressNoteActivity.Q;
                                                                    String addressType = indigo.name();
                                                                    if (arrayList3.isEmpty()) {
                                                                        arrayList = null;
                                                                    } else {
                                                                        arrayList = arrayList3;
                                                                    }
                                                                    long j12 = addressNoteActivity.f12358S;
                                                                    Double valueOf2 = Double.valueOf(d4);
                                                                    Double valueOf3 = Double.valueOf(d9);
                                                                    Intrinsics.echo(description, "description");
                                                                    Intrinsics.echo(addressType, "addressType");
                                                                    ?? auVar = new au(new C2492a(2, "loading"));
                                                                    V1.a hotel = T.hotel(ivory);
                                                                    Cf.e eVar = ao.alpha;
                                                                    ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                    auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                    return;
                                                                case 7:
                                                                    AbstractC0028a abstractC0028a16 = addressNoteActivity.f12350J;
                                                                    if (abstractC0028a16 != null) {
                                                                        ProgressBar pbSkipLoading = abstractC0028a16.f303p;
                                                                        Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                        pbSkipLoading.setVisibility(0);
                                                                        AbstractC0028a abstractC0028a17 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a17 != null) {
                                                                            TextView tvSkipButton = abstractC0028a17.f307t;
                                                                            Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                            tvSkipButton.setVisibility(8);
                                                                            AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a18 != null) {
                                                                                abstractC0028a18.f298k.setEnabled(false);
                                                                                Intent intent = new Intent();
                                                                                intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                addressNoteActivity.setResult(-1, intent);
                                                                                addressNoteActivity.finish();
                                                                                return;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                case 8:
                                                                    int i20 = AddressNoteActivity.f12347W;
                                                                    K9.b[] bVarArr = K9.b.purple;
                                                                    addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                    addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                    return;
                                                                case 9:
                                                                    int i21 = AddressNoteActivity.f12347W;
                                                                    K9.b[] bVarArr2 = K9.b.purple;
                                                                    addressNoteActivity.f12352L = 1002;
                                                                    addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                    return;
                                                                default:
                                                                    int i22 = AddressNoteActivity.f12347W;
                                                                    Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                    if (aVar5 != null) {
                                                                        addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    AbstractC0028a abstractC0028a13 = this.f12350J;
                                                    if (abstractC0028a13 != null) {
                                                        final int i13 = 4;
                                                        ((J) abstractC0028a13.f300m.red).bravo.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                            public final /* synthetic */ AddressNoteActivity purple;

                                                            {
                                                                this.purple = this;
                                                            }

                                                            /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                String str;
                                                                String str2;
                                                                String str3;
                                                                String str4;
                                                                ArrayList arrayList;
                                                                Pair pair;
                                                                Pair pair2;
                                                                boolean z2;
                                                                boolean z10;
                                                                boolean z11;
                                                                boolean z12;
                                                                AddressNoteActivity addressNoteActivity = this.purple;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i112 = AddressNoteActivity.f12347W;
                                                                        Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                        if (aVar != null) {
                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 1:
                                                                        int i122 = AddressNoteActivity.f12347W;
                                                                        Intrinsics.checkNotNull(view);
                                                                        addressNoteActivity.jade(view);
                                                                        addressNoteActivity.lavender(R.layout.include_form_building);
                                                                        AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a112 != null) {
                                                                            abstractC0028a112.red.clearFocus();
                                                                            addressNoteActivity.maroon(n.alpha);
                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    case 2:
                                                                        int i132 = AddressNoteActivity.f12347W;
                                                                        Intrinsics.checkNotNull(view);
                                                                        addressNoteActivity.jade(view);
                                                                        addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                        AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a122 != null) {
                                                                            abstractC0028a122.red.clearFocus();
                                                                            addressNoteActivity.maroon(n.red);
                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    case 3:
                                                                        int i14 = AddressNoteActivity.f12347W;
                                                                        Intrinsics.checkNotNull(view);
                                                                        addressNoteActivity.jade(view);
                                                                        addressNoteActivity.lavender(R.layout.include_form_business);
                                                                        AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a132 != null) {
                                                                            abstractC0028a132.red.clearFocus();
                                                                            addressNoteActivity.maroon(n.purple);
                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    case 4:
                                                                        int i15 = AddressNoteActivity.f12347W;
                                                                        Intrinsics.checkNotNull(view);
                                                                        addressNoteActivity.jade(view);
                                                                        addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                        AbstractC0028a abstractC0028a14 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a14 != null) {
                                                                            abstractC0028a14.red.clearFocus();
                                                                            addressNoteActivity.maroon(n.silver);
                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    case 5:
                                                                        int i16 = AddressNoteActivity.f12347W;
                                                                        Intrinsics.checkNotNull(view);
                                                                        addressNoteActivity.jade(view);
                                                                        addressNoteActivity.lavender(R.layout.include_form_other);
                                                                        AbstractC0028a abstractC0028a15 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a15 != null) {
                                                                            abstractC0028a15.red.clearFocus();
                                                                            addressNoteActivity.maroon(n.teal);
                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    case 6:
                                                                        int i17 = AddressNoteActivity.f12347W;
                                                                        Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                        if (aVar2 == null) {
                                                                            aVar2 = new Vb.a(null, null);
                                                                        }
                                                                        Pair pair3 = aVar2.alpha;
                                                                        if (pair3 != null) {
                                                                            str = (String) pair3.getSecond();
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        Pair pair4 = aVar2.bravo;
                                                                        if (pair4 != null) {
                                                                            str2 = (String) pair4.getSecond();
                                                                        } else {
                                                                            str2 = null;
                                                                        }
                                                                        int ordinal = addressNoteActivity.indigo().ordinal();
                                                                        if (ordinal != 0) {
                                                                            if (ordinal != 1) {
                                                                                if (ordinal != 2) {
                                                                                    if (ordinal != 3) {
                                                                                        if (ordinal == 4) {
                                                                                            if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                return;
                                                                                            }
                                                                                        } else {
                                                                                            throw new NoWhenBranchMatchedException();
                                                                                        }
                                                                                    } else {
                                                                                        String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                        String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                        if (gray.length() > 0) {
                                                                                            z11 = true;
                                                                                        } else {
                                                                                            z11 = false;
                                                                                        }
                                                                                        if (gray2.length() > 0) {
                                                                                            z12 = true;
                                                                                        } else {
                                                                                            z12 = false;
                                                                                        }
                                                                                        if (!z11 && !z12) {
                                                                                            addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                            return;
                                                                                        } else if (str == null || str.length() == 0) {
                                                                                            addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                    String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                    if (gray3.length() > 0) {
                                                                                        z2 = true;
                                                                                    } else {
                                                                                        z2 = false;
                                                                                    }
                                                                                    if (gray4.length() > 0) {
                                                                                        z10 = true;
                                                                                    } else {
                                                                                        z10 = false;
                                                                                    }
                                                                                    if (!z2 && !z10) {
                                                                                        addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                        return;
                                                                                    } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                        addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                    if (gray5.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                        return;
                                                                                    } else if (gray7.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                        return;
                                                                                    } else if (gray6.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                if (str == null || str.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                            String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                            String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                            if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                if (gray8.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                    return;
                                                                                } else if (gray9.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                    return;
                                                                                } else if (gray10.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            if (str == null || str.length() == 0) {
                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                return;
                                                                            }
                                                                        }
                                                                        n indigo = addressNoteActivity.indigo();
                                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                        String green = addressNoteActivity.green();
                                                                        if (!StringsKt.gray(green)) {
                                                                            linkedHashMap.put("otherInstructions", green);
                                                                        }
                                                                        int ordinal2 = indigo.ordinal();
                                                                        if (ordinal2 != 0) {
                                                                            if (ordinal2 != 1) {
                                                                                if (ordinal2 != 2) {
                                                                                    if (ordinal2 != 3) {
                                                                                        if (ordinal2 == 4) {
                                                                                            linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                        } else {
                                                                                            throw new NoWhenBranchMatchedException();
                                                                                        }
                                                                                    } else {
                                                                                        linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                    }
                                                                                } else {
                                                                                    linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                }
                                                                            } else {
                                                                                linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                            }
                                                                        } else {
                                                                            linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                            linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                            linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                        }
                                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                            if (!StringsKt.gray((String) entry.getValue())) {
                                                                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                            }
                                                                        }
                                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                            if (((String) entry2.getValue()).length() > 0) {
                                                                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                            }
                                                                        }
                                                                        String green2 = addressNoteActivity.green();
                                                                        ArrayList arrayList2 = new ArrayList();
                                                                        int ordinal3 = indigo.ordinal();
                                                                        if (ordinal3 != 0) {
                                                                            if (ordinal3 != 1) {
                                                                                if (ordinal3 != 2) {
                                                                                    if (ordinal3 != 3) {
                                                                                        if (ordinal3 == 4) {
                                                                                            String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                            if (StringsKt.gray(gray11)) {
                                                                                                gray11 = null;
                                                                                            }
                                                                                            if (gray11 != null) {
                                                                                                arrayList2.add(gray11);
                                                                                            }
                                                                                        } else {
                                                                                            throw new NoWhenBranchMatchedException();
                                                                                        }
                                                                                    } else {
                                                                                        String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                        if (StringsKt.gray(gray12)) {
                                                                                            gray12 = null;
                                                                                        }
                                                                                        if (gray12 != null) {
                                                                                            arrayList2.add("House # ".concat(gray12));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                    if (StringsKt.gray(gray13)) {
                                                                                        gray13 = null;
                                                                                    }
                                                                                    if (gray13 != null) {
                                                                                        arrayList2.add("Villa # ".concat(gray13));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                if (StringsKt.gray(gray14)) {
                                                                                    gray14 = null;
                                                                                }
                                                                                if (gray14 != null) {
                                                                                    arrayList2.add("Business: ".concat(gray14));
                                                                                }
                                                                                String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                if (StringsKt.gray(gray15)) {
                                                                                    gray15 = null;
                                                                                }
                                                                                if (gray15 != null) {
                                                                                    arrayList2.add("Building # ".concat(gray15));
                                                                                }
                                                                                String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                if (StringsKt.gray(gray16)) {
                                                                                    gray16 = null;
                                                                                }
                                                                                if (gray16 != null) {
                                                                                    arrayList2.add("Floor # ".concat(gray16));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                            if (StringsKt.gray(gray17)) {
                                                                                gray17 = null;
                                                                            }
                                                                            if (gray17 != null) {
                                                                                arrayList2.add("Building # ".concat(gray17));
                                                                            }
                                                                            String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                            if (StringsKt.gray(gray18)) {
                                                                                gray18 = null;
                                                                            }
                                                                            if (gray18 != null) {
                                                                                arrayList2.add("Floor # ".concat(gray18));
                                                                            }
                                                                            String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                            if (StringsKt.gray(gray19)) {
                                                                                gray19 = null;
                                                                            }
                                                                            if (gray19 != null) {
                                                                                arrayList2.add("Door # ".concat(gray19));
                                                                            }
                                                                        }
                                                                        if (StringsKt.gray(green2)) {
                                                                            green2 = null;
                                                                        }
                                                                        if (green2 != null) {
                                                                            arrayList2.add("Other instructions: ".concat(green2));
                                                                        }
                                                                        String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                        Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                        if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                            str3 = (String) pair2.getSecond();
                                                                        } else {
                                                                            str3 = null;
                                                                        }
                                                                        Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                        if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                            str4 = (String) pair.getSecond();
                                                                        } else {
                                                                            str4 = null;
                                                                        }
                                                                        ArrayList arrayList3 = new ArrayList();
                                                                        if (str3 != null) {
                                                                            arrayList3.add(str3);
                                                                        }
                                                                        if (str4 != null) {
                                                                            arrayList3.add(str4);
                                                                        }
                                                                        AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                        int i18 = addressNoteActivity.f12353M;
                                                                        int i19 = addressNoteActivity.f12354N;
                                                                        double d4 = addressNoteActivity.f12356P;
                                                                        double d9 = addressNoteActivity.Q;
                                                                        String addressType = indigo.name();
                                                                        if (arrayList3.isEmpty()) {
                                                                            arrayList = null;
                                                                        } else {
                                                                            arrayList = arrayList3;
                                                                        }
                                                                        long j12 = addressNoteActivity.f12358S;
                                                                        Double valueOf2 = Double.valueOf(d4);
                                                                        Double valueOf3 = Double.valueOf(d9);
                                                                        Intrinsics.echo(description, "description");
                                                                        Intrinsics.echo(addressType, "addressType");
                                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                                        V1.a hotel = T.hotel(ivory);
                                                                        Cf.e eVar = ao.alpha;
                                                                        ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                        auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                        return;
                                                                    case 7:
                                                                        AbstractC0028a abstractC0028a16 = addressNoteActivity.f12350J;
                                                                        if (abstractC0028a16 != null) {
                                                                            ProgressBar pbSkipLoading = abstractC0028a16.f303p;
                                                                            Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                            pbSkipLoading.setVisibility(0);
                                                                            AbstractC0028a abstractC0028a17 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a17 != null) {
                                                                                TextView tvSkipButton = abstractC0028a17.f307t;
                                                                                Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                tvSkipButton.setVisibility(8);
                                                                                AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                                if (abstractC0028a18 != null) {
                                                                                    abstractC0028a18.f298k.setEnabled(false);
                                                                                    Intent intent = new Intent();
                                                                                    intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                    addressNoteActivity.setResult(-1, intent);
                                                                                    addressNoteActivity.finish();
                                                                                    return;
                                                                                }
                                                                                Intrinsics.lima("binding");
                                                                                throw null;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    case 8:
                                                                        int i20 = AddressNoteActivity.f12347W;
                                                                        K9.b[] bVarArr = K9.b.purple;
                                                                        addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                        return;
                                                                    case 9:
                                                                        int i21 = AddressNoteActivity.f12347W;
                                                                        K9.b[] bVarArr2 = K9.b.purple;
                                                                        addressNoteActivity.f12352L = 1002;
                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                        return;
                                                                    default:
                                                                        int i22 = AddressNoteActivity.f12347W;
                                                                        Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                        if (aVar5 != null) {
                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        AbstractC0028a abstractC0028a14 = this.f12350J;
                                                        if (abstractC0028a14 != null) {
                                                            final int i14 = 5;
                                                            ((J) abstractC0028a14.f300m.silver).bravo.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                                public final /* synthetic */ AddressNoteActivity purple;

                                                                {
                                                                    this.purple = this;
                                                                }

                                                                /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    String str;
                                                                    String str2;
                                                                    String str3;
                                                                    String str4;
                                                                    ArrayList arrayList;
                                                                    Pair pair;
                                                                    Pair pair2;
                                                                    boolean z2;
                                                                    boolean z10;
                                                                    boolean z11;
                                                                    boolean z12;
                                                                    AddressNoteActivity addressNoteActivity = this.purple;
                                                                    switch (i14) {
                                                                        case 0:
                                                                            int i112 = AddressNoteActivity.f12347W;
                                                                            Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                            if (aVar != null) {
                                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 1:
                                                                            int i122 = AddressNoteActivity.f12347W;
                                                                            Intrinsics.checkNotNull(view);
                                                                            addressNoteActivity.jade(view);
                                                                            addressNoteActivity.lavender(R.layout.include_form_building);
                                                                            AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a112 != null) {
                                                                                abstractC0028a112.red.clearFocus();
                                                                                addressNoteActivity.maroon(n.alpha);
                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                return;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        case 2:
                                                                            int i132 = AddressNoteActivity.f12347W;
                                                                            Intrinsics.checkNotNull(view);
                                                                            addressNoteActivity.jade(view);
                                                                            addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                            AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a122 != null) {
                                                                                abstractC0028a122.red.clearFocus();
                                                                                addressNoteActivity.maroon(n.red);
                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                return;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        case 3:
                                                                            int i142 = AddressNoteActivity.f12347W;
                                                                            Intrinsics.checkNotNull(view);
                                                                            addressNoteActivity.jade(view);
                                                                            addressNoteActivity.lavender(R.layout.include_form_business);
                                                                            AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a132 != null) {
                                                                                abstractC0028a132.red.clearFocus();
                                                                                addressNoteActivity.maroon(n.purple);
                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                return;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        case 4:
                                                                            int i15 = AddressNoteActivity.f12347W;
                                                                            Intrinsics.checkNotNull(view);
                                                                            addressNoteActivity.jade(view);
                                                                            addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                            AbstractC0028a abstractC0028a142 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a142 != null) {
                                                                                abstractC0028a142.red.clearFocus();
                                                                                addressNoteActivity.maroon(n.silver);
                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                return;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        case 5:
                                                                            int i16 = AddressNoteActivity.f12347W;
                                                                            Intrinsics.checkNotNull(view);
                                                                            addressNoteActivity.jade(view);
                                                                            addressNoteActivity.lavender(R.layout.include_form_other);
                                                                            AbstractC0028a abstractC0028a15 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a15 != null) {
                                                                                abstractC0028a15.red.clearFocus();
                                                                                addressNoteActivity.maroon(n.teal);
                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                return;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        case 6:
                                                                            int i17 = AddressNoteActivity.f12347W;
                                                                            Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                            if (aVar2 == null) {
                                                                                aVar2 = new Vb.a(null, null);
                                                                            }
                                                                            Pair pair3 = aVar2.alpha;
                                                                            if (pair3 != null) {
                                                                                str = (String) pair3.getSecond();
                                                                            } else {
                                                                                str = null;
                                                                            }
                                                                            Pair pair4 = aVar2.bravo;
                                                                            if (pair4 != null) {
                                                                                str2 = (String) pair4.getSecond();
                                                                            } else {
                                                                                str2 = null;
                                                                            }
                                                                            int ordinal = addressNoteActivity.indigo().ordinal();
                                                                            if (ordinal != 0) {
                                                                                if (ordinal != 1) {
                                                                                    if (ordinal != 2) {
                                                                                        if (ordinal != 3) {
                                                                                            if (ordinal == 4) {
                                                                                                if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                    return;
                                                                                                }
                                                                                            } else {
                                                                                                throw new NoWhenBranchMatchedException();
                                                                                            }
                                                                                        } else {
                                                                                            String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                            String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                            if (gray.length() > 0) {
                                                                                                z11 = true;
                                                                                            } else {
                                                                                                z11 = false;
                                                                                            }
                                                                                            if (gray2.length() > 0) {
                                                                                                z12 = true;
                                                                                            } else {
                                                                                                z12 = false;
                                                                                            }
                                                                                            if (!z11 && !z12) {
                                                                                                addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                                return;
                                                                                            } else if (str == null || str.length() == 0) {
                                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                        String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                        if (gray3.length() > 0) {
                                                                                            z2 = true;
                                                                                        } else {
                                                                                            z2 = false;
                                                                                        }
                                                                                        if (gray4.length() > 0) {
                                                                                            z10 = true;
                                                                                        } else {
                                                                                            z10 = false;
                                                                                        }
                                                                                        if (!z2 && !z10) {
                                                                                            addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                            return;
                                                                                        } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                            addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                    String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                    String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                    if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                        if (gray5.length() == 0) {
                                                                                            addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                            return;
                                                                                        } else if (gray7.length() == 0) {
                                                                                            addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                            return;
                                                                                        } else if (gray6.length() == 0) {
                                                                                            addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    if (str == null || str.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                    if (gray8.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                        return;
                                                                                    } else if (gray9.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                        return;
                                                                                    } else if (gray10.length() == 0) {
                                                                                        addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                if (str == null || str.length() == 0) {
                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            n indigo = addressNoteActivity.indigo();
                                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                            String green = addressNoteActivity.green();
                                                                            if (!StringsKt.gray(green)) {
                                                                                linkedHashMap.put("otherInstructions", green);
                                                                            }
                                                                            int ordinal2 = indigo.ordinal();
                                                                            if (ordinal2 != 0) {
                                                                                if (ordinal2 != 1) {
                                                                                    if (ordinal2 != 2) {
                                                                                        if (ordinal2 != 3) {
                                                                                            if (ordinal2 == 4) {
                                                                                                linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                            } else {
                                                                                                throw new NoWhenBranchMatchedException();
                                                                                            }
                                                                                        } else {
                                                                                            linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                        }
                                                                                    } else {
                                                                                        linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                    }
                                                                                } else {
                                                                                    linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                    linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                    linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                }
                                                                            } else {
                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                            }
                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                if (!StringsKt.gray((String) entry.getValue())) {
                                                                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                                }
                                                                            }
                                                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                                if (((String) entry2.getValue()).length() > 0) {
                                                                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                                }
                                                                            }
                                                                            String green2 = addressNoteActivity.green();
                                                                            ArrayList arrayList2 = new ArrayList();
                                                                            int ordinal3 = indigo.ordinal();
                                                                            if (ordinal3 != 0) {
                                                                                if (ordinal3 != 1) {
                                                                                    if (ordinal3 != 2) {
                                                                                        if (ordinal3 != 3) {
                                                                                            if (ordinal3 == 4) {
                                                                                                String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                                if (StringsKt.gray(gray11)) {
                                                                                                    gray11 = null;
                                                                                                }
                                                                                                if (gray11 != null) {
                                                                                                    arrayList2.add(gray11);
                                                                                                }
                                                                                            } else {
                                                                                                throw new NoWhenBranchMatchedException();
                                                                                            }
                                                                                        } else {
                                                                                            String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                            if (StringsKt.gray(gray12)) {
                                                                                                gray12 = null;
                                                                                            }
                                                                                            if (gray12 != null) {
                                                                                                arrayList2.add("House # ".concat(gray12));
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                        if (StringsKt.gray(gray13)) {
                                                                                            gray13 = null;
                                                                                        }
                                                                                        if (gray13 != null) {
                                                                                            arrayList2.add("Villa # ".concat(gray13));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                    if (StringsKt.gray(gray14)) {
                                                                                        gray14 = null;
                                                                                    }
                                                                                    if (gray14 != null) {
                                                                                        arrayList2.add("Business: ".concat(gray14));
                                                                                    }
                                                                                    String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                    if (StringsKt.gray(gray15)) {
                                                                                        gray15 = null;
                                                                                    }
                                                                                    if (gray15 != null) {
                                                                                        arrayList2.add("Building # ".concat(gray15));
                                                                                    }
                                                                                    String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                    if (StringsKt.gray(gray16)) {
                                                                                        gray16 = null;
                                                                                    }
                                                                                    if (gray16 != null) {
                                                                                        arrayList2.add("Floor # ".concat(gray16));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                if (StringsKt.gray(gray17)) {
                                                                                    gray17 = null;
                                                                                }
                                                                                if (gray17 != null) {
                                                                                    arrayList2.add("Building # ".concat(gray17));
                                                                                }
                                                                                String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                if (StringsKt.gray(gray18)) {
                                                                                    gray18 = null;
                                                                                }
                                                                                if (gray18 != null) {
                                                                                    arrayList2.add("Floor # ".concat(gray18));
                                                                                }
                                                                                String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                if (StringsKt.gray(gray19)) {
                                                                                    gray19 = null;
                                                                                }
                                                                                if (gray19 != null) {
                                                                                    arrayList2.add("Door # ".concat(gray19));
                                                                                }
                                                                            }
                                                                            if (StringsKt.gray(green2)) {
                                                                                green2 = null;
                                                                            }
                                                                            if (green2 != null) {
                                                                                arrayList2.add("Other instructions: ".concat(green2));
                                                                            }
                                                                            String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                            Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                            if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                                str3 = (String) pair2.getSecond();
                                                                            } else {
                                                                                str3 = null;
                                                                            }
                                                                            Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                            if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                                str4 = (String) pair.getSecond();
                                                                            } else {
                                                                                str4 = null;
                                                                            }
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            if (str3 != null) {
                                                                                arrayList3.add(str3);
                                                                            }
                                                                            if (str4 != null) {
                                                                                arrayList3.add(str4);
                                                                            }
                                                                            AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                            int i18 = addressNoteActivity.f12353M;
                                                                            int i19 = addressNoteActivity.f12354N;
                                                                            double d4 = addressNoteActivity.f12356P;
                                                                            double d9 = addressNoteActivity.Q;
                                                                            String addressType = indigo.name();
                                                                            if (arrayList3.isEmpty()) {
                                                                                arrayList = null;
                                                                            } else {
                                                                                arrayList = arrayList3;
                                                                            }
                                                                            long j12 = addressNoteActivity.f12358S;
                                                                            Double valueOf2 = Double.valueOf(d4);
                                                                            Double valueOf3 = Double.valueOf(d9);
                                                                            Intrinsics.echo(description, "description");
                                                                            Intrinsics.echo(addressType, "addressType");
                                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                                            V1.a hotel = T.hotel(ivory);
                                                                            Cf.e eVar = ao.alpha;
                                                                            ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                            auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                            return;
                                                                        case 7:
                                                                            AbstractC0028a abstractC0028a16 = addressNoteActivity.f12350J;
                                                                            if (abstractC0028a16 != null) {
                                                                                ProgressBar pbSkipLoading = abstractC0028a16.f303p;
                                                                                Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                                pbSkipLoading.setVisibility(0);
                                                                                AbstractC0028a abstractC0028a17 = addressNoteActivity.f12350J;
                                                                                if (abstractC0028a17 != null) {
                                                                                    TextView tvSkipButton = abstractC0028a17.f307t;
                                                                                    Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                    tvSkipButton.setVisibility(8);
                                                                                    AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                                    if (abstractC0028a18 != null) {
                                                                                        abstractC0028a18.f298k.setEnabled(false);
                                                                                        Intent intent = new Intent();
                                                                                        intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                        addressNoteActivity.setResult(-1, intent);
                                                                                        addressNoteActivity.finish();
                                                                                        return;
                                                                                    }
                                                                                    Intrinsics.lima("binding");
                                                                                    throw null;
                                                                                }
                                                                                Intrinsics.lima("binding");
                                                                                throw null;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        case 8:
                                                                            int i20 = AddressNoteActivity.f12347W;
                                                                            K9.b[] bVarArr = K9.b.purple;
                                                                            addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                            return;
                                                                        case 9:
                                                                            int i21 = AddressNoteActivity.f12347W;
                                                                            K9.b[] bVarArr2 = K9.b.purple;
                                                                            addressNoteActivity.f12352L = 1002;
                                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                            return;
                                                                        default:
                                                                            int i22 = AddressNoteActivity.f12347W;
                                                                            Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                            if (aVar5 != null) {
                                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                                return;
                                                                            }
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            AbstractC0028a abstractC0028a15 = this.f12350J;
                                                            if (abstractC0028a15 != null) {
                                                                setSupportActionBar(abstractC0028a15.f305r);
                                                                androidx.appcompat.app.a supportActionBar = getSupportActionBar();
                                                                if (supportActionBar != null) {
                                                                    supportActionBar.oscar(false);
                                                                }
                                                                androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
                                                                if (supportActionBar2 != null) {
                                                                    supportActionBar2.papa(false);
                                                                }
                                                                AbstractC0028a abstractC0028a16 = this.f12350J;
                                                                if (abstractC0028a16 != null) {
                                                                    abstractC0028a16.f305r.setNavigationIcon((Drawable) null);
                                                                    AbstractC0028a abstractC0028a17 = this.f12350J;
                                                                    if (abstractC0028a17 != null) {
                                                                        final int i15 = 8;
                                                                        abstractC0028a17.f296i.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                                            public final /* synthetic */ AddressNoteActivity purple;

                                                                            {
                                                                                this.purple = this;
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                String str;
                                                                                String str2;
                                                                                String str3;
                                                                                String str4;
                                                                                ArrayList arrayList;
                                                                                Pair pair;
                                                                                Pair pair2;
                                                                                boolean z2;
                                                                                boolean z10;
                                                                                boolean z11;
                                                                                boolean z12;
                                                                                AddressNoteActivity addressNoteActivity = this.purple;
                                                                                switch (i15) {
                                                                                    case 0:
                                                                                        int i112 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 1:
                                                                                        int i122 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_building);
                                                                                        AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a112 != null) {
                                                                                            abstractC0028a112.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.alpha);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 2:
                                                                                        int i132 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                                        AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a122 != null) {
                                                                                            abstractC0028a122.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.red);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 3:
                                                                                        int i142 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_business);
                                                                                        AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a132 != null) {
                                                                                            abstractC0028a132.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.purple);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 4:
                                                                                        int i152 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                                        AbstractC0028a abstractC0028a142 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a142 != null) {
                                                                                            abstractC0028a142.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.silver);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 5:
                                                                                        int i16 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_other);
                                                                                        AbstractC0028a abstractC0028a152 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a152 != null) {
                                                                                            abstractC0028a152.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.teal);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 6:
                                                                                        int i17 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar2 == null) {
                                                                                            aVar2 = new Vb.a(null, null);
                                                                                        }
                                                                                        Pair pair3 = aVar2.alpha;
                                                                                        if (pair3 != null) {
                                                                                            str = (String) pair3.getSecond();
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        Pair pair4 = aVar2.bravo;
                                                                                        if (pair4 != null) {
                                                                                            str2 = (String) pair4.getSecond();
                                                                                        } else {
                                                                                            str2 = null;
                                                                                        }
                                                                                        int ordinal = addressNoteActivity.indigo().ordinal();
                                                                                        if (ordinal != 0) {
                                                                                            if (ordinal != 1) {
                                                                                                if (ordinal != 2) {
                                                                                                    if (ordinal != 3) {
                                                                                                        if (ordinal == 4) {
                                                                                                            if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                                addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                                return;
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                        if (gray.length() > 0) {
                                                                                                            z11 = true;
                                                                                                        } else {
                                                                                                            z11 = false;
                                                                                                        }
                                                                                                        if (gray2.length() > 0) {
                                                                                                            z12 = true;
                                                                                                        } else {
                                                                                                            z12 = false;
                                                                                                        }
                                                                                                        if (!z11 && !z12) {
                                                                                                            addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if (str == null || str.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                    if (gray3.length() > 0) {
                                                                                                        z2 = true;
                                                                                                    } else {
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                    if (gray4.length() > 0) {
                                                                                                        z10 = true;
                                                                                                    } else {
                                                                                                        z10 = false;
                                                                                                    }
                                                                                                    if (!z2 && !z10) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                    if (gray5.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray7.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                                        return;
                                                                                                    } else if (gray6.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                if (str == null || str.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                if (gray8.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray9.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray10.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            if (str == null || str.length() == 0) {
                                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        n indigo = addressNoteActivity.indigo();
                                                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                        String green = addressNoteActivity.green();
                                                                                        if (!StringsKt.gray(green)) {
                                                                                            linkedHashMap.put("otherInstructions", green);
                                                                                        }
                                                                                        int ordinal2 = indigo.ordinal();
                                                                                        if (ordinal2 != 0) {
                                                                                            if (ordinal2 != 1) {
                                                                                                if (ordinal2 != 2) {
                                                                                                    if (ordinal2 != 3) {
                                                                                                        if (ordinal2 == 4) {
                                                                                                            linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                                    }
                                                                                                } else {
                                                                                                    linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                                }
                                                                                            } else {
                                                                                                linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            }
                                                                                        } else {
                                                                                            linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                            linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                            if (!StringsKt.gray((String) entry.getValue())) {
                                                                                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                                            }
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                                            if (((String) entry2.getValue()).length() > 0) {
                                                                                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                                            }
                                                                                        }
                                                                                        String green2 = addressNoteActivity.green();
                                                                                        ArrayList arrayList2 = new ArrayList();
                                                                                        int ordinal3 = indigo.ordinal();
                                                                                        if (ordinal3 != 0) {
                                                                                            if (ordinal3 != 1) {
                                                                                                if (ordinal3 != 2) {
                                                                                                    if (ordinal3 != 3) {
                                                                                                        if (ordinal3 == 4) {
                                                                                                            String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                                            if (StringsKt.gray(gray11)) {
                                                                                                                gray11 = null;
                                                                                                            }
                                                                                                            if (gray11 != null) {
                                                                                                                arrayList2.add(gray11);
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        if (StringsKt.gray(gray12)) {
                                                                                                            gray12 = null;
                                                                                                        }
                                                                                                        if (gray12 != null) {
                                                                                                            arrayList2.add("House # ".concat(gray12));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    if (StringsKt.gray(gray13)) {
                                                                                                        gray13 = null;
                                                                                                    }
                                                                                                    if (gray13 != null) {
                                                                                                        arrayList2.add("Villa # ".concat(gray13));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                if (StringsKt.gray(gray14)) {
                                                                                                    gray14 = null;
                                                                                                }
                                                                                                if (gray14 != null) {
                                                                                                    arrayList2.add("Business: ".concat(gray14));
                                                                                                }
                                                                                                String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (StringsKt.gray(gray15)) {
                                                                                                    gray15 = null;
                                                                                                }
                                                                                                if (gray15 != null) {
                                                                                                    arrayList2.add("Building # ".concat(gray15));
                                                                                                }
                                                                                                String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                if (StringsKt.gray(gray16)) {
                                                                                                    gray16 = null;
                                                                                                }
                                                                                                if (gray16 != null) {
                                                                                                    arrayList2.add("Floor # ".concat(gray16));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            if (StringsKt.gray(gray17)) {
                                                                                                gray17 = null;
                                                                                            }
                                                                                            if (gray17 != null) {
                                                                                                arrayList2.add("Building # ".concat(gray17));
                                                                                            }
                                                                                            String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            if (StringsKt.gray(gray18)) {
                                                                                                gray18 = null;
                                                                                            }
                                                                                            if (gray18 != null) {
                                                                                                arrayList2.add("Floor # ".concat(gray18));
                                                                                            }
                                                                                            String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (StringsKt.gray(gray19)) {
                                                                                                gray19 = null;
                                                                                            }
                                                                                            if (gray19 != null) {
                                                                                                arrayList2.add("Door # ".concat(gray19));
                                                                                            }
                                                                                        }
                                                                                        if (StringsKt.gray(green2)) {
                                                                                            green2 = null;
                                                                                        }
                                                                                        if (green2 != null) {
                                                                                            arrayList2.add("Other instructions: ".concat(green2));
                                                                                        }
                                                                                        String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                                        Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                                            str3 = (String) pair2.getSecond();
                                                                                        } else {
                                                                                            str3 = null;
                                                                                        }
                                                                                        Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                                            str4 = (String) pair.getSecond();
                                                                                        } else {
                                                                                            str4 = null;
                                                                                        }
                                                                                        ArrayList arrayList3 = new ArrayList();
                                                                                        if (str3 != null) {
                                                                                            arrayList3.add(str3);
                                                                                        }
                                                                                        if (str4 != null) {
                                                                                            arrayList3.add(str4);
                                                                                        }
                                                                                        AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                                        int i18 = addressNoteActivity.f12353M;
                                                                                        int i19 = addressNoteActivity.f12354N;
                                                                                        double d4 = addressNoteActivity.f12356P;
                                                                                        double d9 = addressNoteActivity.Q;
                                                                                        String addressType = indigo.name();
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            arrayList = null;
                                                                                        } else {
                                                                                            arrayList = arrayList3;
                                                                                        }
                                                                                        long j12 = addressNoteActivity.f12358S;
                                                                                        Double valueOf2 = Double.valueOf(d4);
                                                                                        Double valueOf3 = Double.valueOf(d9);
                                                                                        Intrinsics.echo(description, "description");
                                                                                        Intrinsics.echo(addressType, "addressType");
                                                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                                                        V1.a hotel = T.hotel(ivory);
                                                                                        Cf.e eVar = ao.alpha;
                                                                                        ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                                        auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                                        return;
                                                                                    case 7:
                                                                                        AbstractC0028a abstractC0028a162 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a162 != null) {
                                                                                            ProgressBar pbSkipLoading = abstractC0028a162.f303p;
                                                                                            Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                                            pbSkipLoading.setVisibility(0);
                                                                                            AbstractC0028a abstractC0028a172 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a172 != null) {
                                                                                                TextView tvSkipButton = abstractC0028a172.f307t;
                                                                                                Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                                tvSkipButton.setVisibility(8);
                                                                                                AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                                                if (abstractC0028a18 != null) {
                                                                                                    abstractC0028a18.f298k.setEnabled(false);
                                                                                                    Intent intent = new Intent();
                                                                                                    intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                                    addressNoteActivity.setResult(-1, intent);
                                                                                                    addressNoteActivity.finish();
                                                                                                    return;
                                                                                                }
                                                                                                Intrinsics.lima("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 8:
                                                                                        int i20 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    case 9:
                                                                                        int i21 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr2 = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = 1002;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    default:
                                                                                        int i22 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar5 != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i16 = 9;
                                                                        abstractC0028a17.f297j.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                                            public final /* synthetic */ AddressNoteActivity purple;

                                                                            {
                                                                                this.purple = this;
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                String str;
                                                                                String str2;
                                                                                String str3;
                                                                                String str4;
                                                                                ArrayList arrayList;
                                                                                Pair pair;
                                                                                Pair pair2;
                                                                                boolean z2;
                                                                                boolean z10;
                                                                                boolean z11;
                                                                                boolean z12;
                                                                                AddressNoteActivity addressNoteActivity = this.purple;
                                                                                switch (i16) {
                                                                                    case 0:
                                                                                        int i112 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 1:
                                                                                        int i122 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_building);
                                                                                        AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a112 != null) {
                                                                                            abstractC0028a112.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.alpha);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 2:
                                                                                        int i132 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                                        AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a122 != null) {
                                                                                            abstractC0028a122.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.red);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 3:
                                                                                        int i142 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_business);
                                                                                        AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a132 != null) {
                                                                                            abstractC0028a132.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.purple);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 4:
                                                                                        int i152 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                                        AbstractC0028a abstractC0028a142 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a142 != null) {
                                                                                            abstractC0028a142.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.silver);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 5:
                                                                                        int i162 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_other);
                                                                                        AbstractC0028a abstractC0028a152 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a152 != null) {
                                                                                            abstractC0028a152.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.teal);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 6:
                                                                                        int i17 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar2 == null) {
                                                                                            aVar2 = new Vb.a(null, null);
                                                                                        }
                                                                                        Pair pair3 = aVar2.alpha;
                                                                                        if (pair3 != null) {
                                                                                            str = (String) pair3.getSecond();
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        Pair pair4 = aVar2.bravo;
                                                                                        if (pair4 != null) {
                                                                                            str2 = (String) pair4.getSecond();
                                                                                        } else {
                                                                                            str2 = null;
                                                                                        }
                                                                                        int ordinal = addressNoteActivity.indigo().ordinal();
                                                                                        if (ordinal != 0) {
                                                                                            if (ordinal != 1) {
                                                                                                if (ordinal != 2) {
                                                                                                    if (ordinal != 3) {
                                                                                                        if (ordinal == 4) {
                                                                                                            if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                                addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                                return;
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                        if (gray.length() > 0) {
                                                                                                            z11 = true;
                                                                                                        } else {
                                                                                                            z11 = false;
                                                                                                        }
                                                                                                        if (gray2.length() > 0) {
                                                                                                            z12 = true;
                                                                                                        } else {
                                                                                                            z12 = false;
                                                                                                        }
                                                                                                        if (!z11 && !z12) {
                                                                                                            addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if (str == null || str.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                    if (gray3.length() > 0) {
                                                                                                        z2 = true;
                                                                                                    } else {
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                    if (gray4.length() > 0) {
                                                                                                        z10 = true;
                                                                                                    } else {
                                                                                                        z10 = false;
                                                                                                    }
                                                                                                    if (!z2 && !z10) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                    if (gray5.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray7.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                                        return;
                                                                                                    } else if (gray6.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                if (str == null || str.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                if (gray8.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray9.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray10.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            if (str == null || str.length() == 0) {
                                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        n indigo = addressNoteActivity.indigo();
                                                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                        String green = addressNoteActivity.green();
                                                                                        if (!StringsKt.gray(green)) {
                                                                                            linkedHashMap.put("otherInstructions", green);
                                                                                        }
                                                                                        int ordinal2 = indigo.ordinal();
                                                                                        if (ordinal2 != 0) {
                                                                                            if (ordinal2 != 1) {
                                                                                                if (ordinal2 != 2) {
                                                                                                    if (ordinal2 != 3) {
                                                                                                        if (ordinal2 == 4) {
                                                                                                            linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                                    }
                                                                                                } else {
                                                                                                    linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                                }
                                                                                            } else {
                                                                                                linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            }
                                                                                        } else {
                                                                                            linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                            linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                            if (!StringsKt.gray((String) entry.getValue())) {
                                                                                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                                            }
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                                            if (((String) entry2.getValue()).length() > 0) {
                                                                                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                                            }
                                                                                        }
                                                                                        String green2 = addressNoteActivity.green();
                                                                                        ArrayList arrayList2 = new ArrayList();
                                                                                        int ordinal3 = indigo.ordinal();
                                                                                        if (ordinal3 != 0) {
                                                                                            if (ordinal3 != 1) {
                                                                                                if (ordinal3 != 2) {
                                                                                                    if (ordinal3 != 3) {
                                                                                                        if (ordinal3 == 4) {
                                                                                                            String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                                            if (StringsKt.gray(gray11)) {
                                                                                                                gray11 = null;
                                                                                                            }
                                                                                                            if (gray11 != null) {
                                                                                                                arrayList2.add(gray11);
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        if (StringsKt.gray(gray12)) {
                                                                                                            gray12 = null;
                                                                                                        }
                                                                                                        if (gray12 != null) {
                                                                                                            arrayList2.add("House # ".concat(gray12));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    if (StringsKt.gray(gray13)) {
                                                                                                        gray13 = null;
                                                                                                    }
                                                                                                    if (gray13 != null) {
                                                                                                        arrayList2.add("Villa # ".concat(gray13));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                if (StringsKt.gray(gray14)) {
                                                                                                    gray14 = null;
                                                                                                }
                                                                                                if (gray14 != null) {
                                                                                                    arrayList2.add("Business: ".concat(gray14));
                                                                                                }
                                                                                                String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (StringsKt.gray(gray15)) {
                                                                                                    gray15 = null;
                                                                                                }
                                                                                                if (gray15 != null) {
                                                                                                    arrayList2.add("Building # ".concat(gray15));
                                                                                                }
                                                                                                String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                if (StringsKt.gray(gray16)) {
                                                                                                    gray16 = null;
                                                                                                }
                                                                                                if (gray16 != null) {
                                                                                                    arrayList2.add("Floor # ".concat(gray16));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            if (StringsKt.gray(gray17)) {
                                                                                                gray17 = null;
                                                                                            }
                                                                                            if (gray17 != null) {
                                                                                                arrayList2.add("Building # ".concat(gray17));
                                                                                            }
                                                                                            String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            if (StringsKt.gray(gray18)) {
                                                                                                gray18 = null;
                                                                                            }
                                                                                            if (gray18 != null) {
                                                                                                arrayList2.add("Floor # ".concat(gray18));
                                                                                            }
                                                                                            String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (StringsKt.gray(gray19)) {
                                                                                                gray19 = null;
                                                                                            }
                                                                                            if (gray19 != null) {
                                                                                                arrayList2.add("Door # ".concat(gray19));
                                                                                            }
                                                                                        }
                                                                                        if (StringsKt.gray(green2)) {
                                                                                            green2 = null;
                                                                                        }
                                                                                        if (green2 != null) {
                                                                                            arrayList2.add("Other instructions: ".concat(green2));
                                                                                        }
                                                                                        String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                                        Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                                            str3 = (String) pair2.getSecond();
                                                                                        } else {
                                                                                            str3 = null;
                                                                                        }
                                                                                        Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                                            str4 = (String) pair.getSecond();
                                                                                        } else {
                                                                                            str4 = null;
                                                                                        }
                                                                                        ArrayList arrayList3 = new ArrayList();
                                                                                        if (str3 != null) {
                                                                                            arrayList3.add(str3);
                                                                                        }
                                                                                        if (str4 != null) {
                                                                                            arrayList3.add(str4);
                                                                                        }
                                                                                        AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                                        int i18 = addressNoteActivity.f12353M;
                                                                                        int i19 = addressNoteActivity.f12354N;
                                                                                        double d4 = addressNoteActivity.f12356P;
                                                                                        double d9 = addressNoteActivity.Q;
                                                                                        String addressType = indigo.name();
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            arrayList = null;
                                                                                        } else {
                                                                                            arrayList = arrayList3;
                                                                                        }
                                                                                        long j12 = addressNoteActivity.f12358S;
                                                                                        Double valueOf2 = Double.valueOf(d4);
                                                                                        Double valueOf3 = Double.valueOf(d9);
                                                                                        Intrinsics.echo(description, "description");
                                                                                        Intrinsics.echo(addressType, "addressType");
                                                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                                                        V1.a hotel = T.hotel(ivory);
                                                                                        Cf.e eVar = ao.alpha;
                                                                                        ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                                        auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                                        return;
                                                                                    case 7:
                                                                                        AbstractC0028a abstractC0028a162 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a162 != null) {
                                                                                            ProgressBar pbSkipLoading = abstractC0028a162.f303p;
                                                                                            Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                                            pbSkipLoading.setVisibility(0);
                                                                                            AbstractC0028a abstractC0028a172 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a172 != null) {
                                                                                                TextView tvSkipButton = abstractC0028a172.f307t;
                                                                                                Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                                tvSkipButton.setVisibility(8);
                                                                                                AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                                                if (abstractC0028a18 != null) {
                                                                                                    abstractC0028a18.f298k.setEnabled(false);
                                                                                                    Intent intent = new Intent();
                                                                                                    intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                                    addressNoteActivity.setResult(-1, intent);
                                                                                                    addressNoteActivity.finish();
                                                                                                    return;
                                                                                                }
                                                                                                Intrinsics.lima("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 8:
                                                                                        int i20 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    case 9:
                                                                                        int i21 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr2 = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = 1002;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    default:
                                                                                        int i22 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar5 != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i17 = 10;
                                                                        abstractC0028a17.f294g.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                                            public final /* synthetic */ AddressNoteActivity purple;

                                                                            {
                                                                                this.purple = this;
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                String str;
                                                                                String str2;
                                                                                String str3;
                                                                                String str4;
                                                                                ArrayList arrayList;
                                                                                Pair pair;
                                                                                Pair pair2;
                                                                                boolean z2;
                                                                                boolean z10;
                                                                                boolean z11;
                                                                                boolean z12;
                                                                                AddressNoteActivity addressNoteActivity = this.purple;
                                                                                switch (i17) {
                                                                                    case 0:
                                                                                        int i112 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 1:
                                                                                        int i122 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_building);
                                                                                        AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a112 != null) {
                                                                                            abstractC0028a112.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.alpha);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 2:
                                                                                        int i132 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                                        AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a122 != null) {
                                                                                            abstractC0028a122.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.red);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 3:
                                                                                        int i142 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_business);
                                                                                        AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a132 != null) {
                                                                                            abstractC0028a132.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.purple);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 4:
                                                                                        int i152 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                                        AbstractC0028a abstractC0028a142 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a142 != null) {
                                                                                            abstractC0028a142.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.silver);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 5:
                                                                                        int i162 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_other);
                                                                                        AbstractC0028a abstractC0028a152 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a152 != null) {
                                                                                            abstractC0028a152.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.teal);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 6:
                                                                                        int i172 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar2 == null) {
                                                                                            aVar2 = new Vb.a(null, null);
                                                                                        }
                                                                                        Pair pair3 = aVar2.alpha;
                                                                                        if (pair3 != null) {
                                                                                            str = (String) pair3.getSecond();
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        Pair pair4 = aVar2.bravo;
                                                                                        if (pair4 != null) {
                                                                                            str2 = (String) pair4.getSecond();
                                                                                        } else {
                                                                                            str2 = null;
                                                                                        }
                                                                                        int ordinal = addressNoteActivity.indigo().ordinal();
                                                                                        if (ordinal != 0) {
                                                                                            if (ordinal != 1) {
                                                                                                if (ordinal != 2) {
                                                                                                    if (ordinal != 3) {
                                                                                                        if (ordinal == 4) {
                                                                                                            if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                                addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                                return;
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                        if (gray.length() > 0) {
                                                                                                            z11 = true;
                                                                                                        } else {
                                                                                                            z11 = false;
                                                                                                        }
                                                                                                        if (gray2.length() > 0) {
                                                                                                            z12 = true;
                                                                                                        } else {
                                                                                                            z12 = false;
                                                                                                        }
                                                                                                        if (!z11 && !z12) {
                                                                                                            addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if (str == null || str.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                    if (gray3.length() > 0) {
                                                                                                        z2 = true;
                                                                                                    } else {
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                    if (gray4.length() > 0) {
                                                                                                        z10 = true;
                                                                                                    } else {
                                                                                                        z10 = false;
                                                                                                    }
                                                                                                    if (!z2 && !z10) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                    if (gray5.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray7.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                                        return;
                                                                                                    } else if (gray6.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                if (str == null || str.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                if (gray8.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray9.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray10.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            if (str == null || str.length() == 0) {
                                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        n indigo = addressNoteActivity.indigo();
                                                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                        String green = addressNoteActivity.green();
                                                                                        if (!StringsKt.gray(green)) {
                                                                                            linkedHashMap.put("otherInstructions", green);
                                                                                        }
                                                                                        int ordinal2 = indigo.ordinal();
                                                                                        if (ordinal2 != 0) {
                                                                                            if (ordinal2 != 1) {
                                                                                                if (ordinal2 != 2) {
                                                                                                    if (ordinal2 != 3) {
                                                                                                        if (ordinal2 == 4) {
                                                                                                            linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                                    }
                                                                                                } else {
                                                                                                    linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                                }
                                                                                            } else {
                                                                                                linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            }
                                                                                        } else {
                                                                                            linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                            linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                            if (!StringsKt.gray((String) entry.getValue())) {
                                                                                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                                            }
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                                            if (((String) entry2.getValue()).length() > 0) {
                                                                                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                                            }
                                                                                        }
                                                                                        String green2 = addressNoteActivity.green();
                                                                                        ArrayList arrayList2 = new ArrayList();
                                                                                        int ordinal3 = indigo.ordinal();
                                                                                        if (ordinal3 != 0) {
                                                                                            if (ordinal3 != 1) {
                                                                                                if (ordinal3 != 2) {
                                                                                                    if (ordinal3 != 3) {
                                                                                                        if (ordinal3 == 4) {
                                                                                                            String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                                            if (StringsKt.gray(gray11)) {
                                                                                                                gray11 = null;
                                                                                                            }
                                                                                                            if (gray11 != null) {
                                                                                                                arrayList2.add(gray11);
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        if (StringsKt.gray(gray12)) {
                                                                                                            gray12 = null;
                                                                                                        }
                                                                                                        if (gray12 != null) {
                                                                                                            arrayList2.add("House # ".concat(gray12));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    if (StringsKt.gray(gray13)) {
                                                                                                        gray13 = null;
                                                                                                    }
                                                                                                    if (gray13 != null) {
                                                                                                        arrayList2.add("Villa # ".concat(gray13));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                if (StringsKt.gray(gray14)) {
                                                                                                    gray14 = null;
                                                                                                }
                                                                                                if (gray14 != null) {
                                                                                                    arrayList2.add("Business: ".concat(gray14));
                                                                                                }
                                                                                                String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (StringsKt.gray(gray15)) {
                                                                                                    gray15 = null;
                                                                                                }
                                                                                                if (gray15 != null) {
                                                                                                    arrayList2.add("Building # ".concat(gray15));
                                                                                                }
                                                                                                String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                if (StringsKt.gray(gray16)) {
                                                                                                    gray16 = null;
                                                                                                }
                                                                                                if (gray16 != null) {
                                                                                                    arrayList2.add("Floor # ".concat(gray16));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            if (StringsKt.gray(gray17)) {
                                                                                                gray17 = null;
                                                                                            }
                                                                                            if (gray17 != null) {
                                                                                                arrayList2.add("Building # ".concat(gray17));
                                                                                            }
                                                                                            String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            if (StringsKt.gray(gray18)) {
                                                                                                gray18 = null;
                                                                                            }
                                                                                            if (gray18 != null) {
                                                                                                arrayList2.add("Floor # ".concat(gray18));
                                                                                            }
                                                                                            String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (StringsKt.gray(gray19)) {
                                                                                                gray19 = null;
                                                                                            }
                                                                                            if (gray19 != null) {
                                                                                                arrayList2.add("Door # ".concat(gray19));
                                                                                            }
                                                                                        }
                                                                                        if (StringsKt.gray(green2)) {
                                                                                            green2 = null;
                                                                                        }
                                                                                        if (green2 != null) {
                                                                                            arrayList2.add("Other instructions: ".concat(green2));
                                                                                        }
                                                                                        String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                                        Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                                            str3 = (String) pair2.getSecond();
                                                                                        } else {
                                                                                            str3 = null;
                                                                                        }
                                                                                        Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                                            str4 = (String) pair.getSecond();
                                                                                        } else {
                                                                                            str4 = null;
                                                                                        }
                                                                                        ArrayList arrayList3 = new ArrayList();
                                                                                        if (str3 != null) {
                                                                                            arrayList3.add(str3);
                                                                                        }
                                                                                        if (str4 != null) {
                                                                                            arrayList3.add(str4);
                                                                                        }
                                                                                        AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                                        int i18 = addressNoteActivity.f12353M;
                                                                                        int i19 = addressNoteActivity.f12354N;
                                                                                        double d4 = addressNoteActivity.f12356P;
                                                                                        double d9 = addressNoteActivity.Q;
                                                                                        String addressType = indigo.name();
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            arrayList = null;
                                                                                        } else {
                                                                                            arrayList = arrayList3;
                                                                                        }
                                                                                        long j12 = addressNoteActivity.f12358S;
                                                                                        Double valueOf2 = Double.valueOf(d4);
                                                                                        Double valueOf3 = Double.valueOf(d9);
                                                                                        Intrinsics.echo(description, "description");
                                                                                        Intrinsics.echo(addressType, "addressType");
                                                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                                                        V1.a hotel = T.hotel(ivory);
                                                                                        Cf.e eVar = ao.alpha;
                                                                                        ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i18, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                                        auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                                        return;
                                                                                    case 7:
                                                                                        AbstractC0028a abstractC0028a162 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a162 != null) {
                                                                                            ProgressBar pbSkipLoading = abstractC0028a162.f303p;
                                                                                            Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                                            pbSkipLoading.setVisibility(0);
                                                                                            AbstractC0028a abstractC0028a172 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a172 != null) {
                                                                                                TextView tvSkipButton = abstractC0028a172.f307t;
                                                                                                Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                                tvSkipButton.setVisibility(8);
                                                                                                AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                                                if (abstractC0028a18 != null) {
                                                                                                    abstractC0028a18.f298k.setEnabled(false);
                                                                                                    Intent intent = new Intent();
                                                                                                    intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                                    addressNoteActivity.setResult(-1, intent);
                                                                                                    addressNoteActivity.finish();
                                                                                                    return;
                                                                                                }
                                                                                                Intrinsics.lima("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 8:
                                                                                        int i20 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    case 9:
                                                                                        int i21 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr2 = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = 1002;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    default:
                                                                                        int i22 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar5 != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i18 = 0;
                                                                        abstractC0028a17.f295h.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                                            public final /* synthetic */ AddressNoteActivity purple;

                                                                            {
                                                                                this.purple = this;
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                String str;
                                                                                String str2;
                                                                                String str3;
                                                                                String str4;
                                                                                ArrayList arrayList;
                                                                                Pair pair;
                                                                                Pair pair2;
                                                                                boolean z2;
                                                                                boolean z10;
                                                                                boolean z11;
                                                                                boolean z12;
                                                                                AddressNoteActivity addressNoteActivity = this.purple;
                                                                                switch (i18) {
                                                                                    case 0:
                                                                                        int i112 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 1:
                                                                                        int i122 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_building);
                                                                                        AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a112 != null) {
                                                                                            abstractC0028a112.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.alpha);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 2:
                                                                                        int i132 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                                        AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a122 != null) {
                                                                                            abstractC0028a122.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.red);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 3:
                                                                                        int i142 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_business);
                                                                                        AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a132 != null) {
                                                                                            abstractC0028a132.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.purple);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 4:
                                                                                        int i152 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                                        AbstractC0028a abstractC0028a142 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a142 != null) {
                                                                                            abstractC0028a142.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.silver);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 5:
                                                                                        int i162 = AddressNoteActivity.f12347W;
                                                                                        Intrinsics.checkNotNull(view);
                                                                                        addressNoteActivity.jade(view);
                                                                                        addressNoteActivity.lavender(R.layout.include_form_other);
                                                                                        AbstractC0028a abstractC0028a152 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a152 != null) {
                                                                                            abstractC0028a152.red.clearFocus();
                                                                                            addressNoteActivity.maroon(n.teal);
                                                                                            addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                            return;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 6:
                                                                                        int i172 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar2 == null) {
                                                                                            aVar2 = new Vb.a(null, null);
                                                                                        }
                                                                                        Pair pair3 = aVar2.alpha;
                                                                                        if (pair3 != null) {
                                                                                            str = (String) pair3.getSecond();
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        Pair pair4 = aVar2.bravo;
                                                                                        if (pair4 != null) {
                                                                                            str2 = (String) pair4.getSecond();
                                                                                        } else {
                                                                                            str2 = null;
                                                                                        }
                                                                                        int ordinal = addressNoteActivity.indigo().ordinal();
                                                                                        if (ordinal != 0) {
                                                                                            if (ordinal != 1) {
                                                                                                if (ordinal != 2) {
                                                                                                    if (ordinal != 3) {
                                                                                                        if (ordinal == 4) {
                                                                                                            if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                                addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                                return;
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                        if (gray.length() > 0) {
                                                                                                            z11 = true;
                                                                                                        } else {
                                                                                                            z11 = false;
                                                                                                        }
                                                                                                        if (gray2.length() > 0) {
                                                                                                            z12 = true;
                                                                                                        } else {
                                                                                                            z12 = false;
                                                                                                        }
                                                                                                        if (!z11 && !z12) {
                                                                                                            addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if (str == null || str.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                    if (gray3.length() > 0) {
                                                                                                        z2 = true;
                                                                                                    } else {
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                    if (gray4.length() > 0) {
                                                                                                        z10 = true;
                                                                                                    } else {
                                                                                                        z10 = false;
                                                                                                    }
                                                                                                    if (!z2 && !z10) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                                        addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                    if (gray5.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray7.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                                        return;
                                                                                                    } else if (gray6.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                if (str == null || str.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                if (gray8.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray9.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                                    return;
                                                                                                } else if (gray10.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            if (str == null || str.length() == 0) {
                                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        n indigo = addressNoteActivity.indigo();
                                                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                        String green = addressNoteActivity.green();
                                                                                        if (!StringsKt.gray(green)) {
                                                                                            linkedHashMap.put("otherInstructions", green);
                                                                                        }
                                                                                        int ordinal2 = indigo.ordinal();
                                                                                        if (ordinal2 != 0) {
                                                                                            if (ordinal2 != 1) {
                                                                                                if (ordinal2 != 2) {
                                                                                                    if (ordinal2 != 3) {
                                                                                                        if (ordinal2 == 4) {
                                                                                                            linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                                    }
                                                                                                } else {
                                                                                                    linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                                }
                                                                                            } else {
                                                                                                linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            }
                                                                                        } else {
                                                                                            linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                            linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                            linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                            if (!StringsKt.gray((String) entry.getValue())) {
                                                                                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                                            }
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                                            if (((String) entry2.getValue()).length() > 0) {
                                                                                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                                            }
                                                                                        }
                                                                                        String green2 = addressNoteActivity.green();
                                                                                        ArrayList arrayList2 = new ArrayList();
                                                                                        int ordinal3 = indigo.ordinal();
                                                                                        if (ordinal3 != 0) {
                                                                                            if (ordinal3 != 1) {
                                                                                                if (ordinal3 != 2) {
                                                                                                    if (ordinal3 != 3) {
                                                                                                        if (ordinal3 == 4) {
                                                                                                            String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                                            if (StringsKt.gray(gray11)) {
                                                                                                                gray11 = null;
                                                                                                            }
                                                                                                            if (gray11 != null) {
                                                                                                                arrayList2.add(gray11);
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                        if (StringsKt.gray(gray12)) {
                                                                                                            gray12 = null;
                                                                                                        }
                                                                                                        if (gray12 != null) {
                                                                                                            arrayList2.add("House # ".concat(gray12));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                    if (StringsKt.gray(gray13)) {
                                                                                                        gray13 = null;
                                                                                                    }
                                                                                                    if (gray13 != null) {
                                                                                                        arrayList2.add("Villa # ".concat(gray13));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                if (StringsKt.gray(gray14)) {
                                                                                                    gray14 = null;
                                                                                                }
                                                                                                if (gray14 != null) {
                                                                                                    arrayList2.add("Business: ".concat(gray14));
                                                                                                }
                                                                                                String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (StringsKt.gray(gray15)) {
                                                                                                    gray15 = null;
                                                                                                }
                                                                                                if (gray15 != null) {
                                                                                                    arrayList2.add("Building # ".concat(gray15));
                                                                                                }
                                                                                                String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                if (StringsKt.gray(gray16)) {
                                                                                                    gray16 = null;
                                                                                                }
                                                                                                if (gray16 != null) {
                                                                                                    arrayList2.add("Floor # ".concat(gray16));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                            if (StringsKt.gray(gray17)) {
                                                                                                gray17 = null;
                                                                                            }
                                                                                            if (gray17 != null) {
                                                                                                arrayList2.add("Building # ".concat(gray17));
                                                                                            }
                                                                                            String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                            if (StringsKt.gray(gray18)) {
                                                                                                gray18 = null;
                                                                                            }
                                                                                            if (gray18 != null) {
                                                                                                arrayList2.add("Floor # ".concat(gray18));
                                                                                            }
                                                                                            String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                            if (StringsKt.gray(gray19)) {
                                                                                                gray19 = null;
                                                                                            }
                                                                                            if (gray19 != null) {
                                                                                                arrayList2.add("Door # ".concat(gray19));
                                                                                            }
                                                                                        }
                                                                                        if (StringsKt.gray(green2)) {
                                                                                            green2 = null;
                                                                                        }
                                                                                        if (green2 != null) {
                                                                                            arrayList2.add("Other instructions: ".concat(green2));
                                                                                        }
                                                                                        String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                                        Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                                            str3 = (String) pair2.getSecond();
                                                                                        } else {
                                                                                            str3 = null;
                                                                                        }
                                                                                        Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                                            str4 = (String) pair.getSecond();
                                                                                        } else {
                                                                                            str4 = null;
                                                                                        }
                                                                                        ArrayList arrayList3 = new ArrayList();
                                                                                        if (str3 != null) {
                                                                                            arrayList3.add(str3);
                                                                                        }
                                                                                        if (str4 != null) {
                                                                                            arrayList3.add(str4);
                                                                                        }
                                                                                        AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                                        int i182 = addressNoteActivity.f12353M;
                                                                                        int i19 = addressNoteActivity.f12354N;
                                                                                        double d4 = addressNoteActivity.f12356P;
                                                                                        double d9 = addressNoteActivity.Q;
                                                                                        String addressType = indigo.name();
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            arrayList = null;
                                                                                        } else {
                                                                                            arrayList = arrayList3;
                                                                                        }
                                                                                        long j12 = addressNoteActivity.f12358S;
                                                                                        Double valueOf2 = Double.valueOf(d4);
                                                                                        Double valueOf3 = Double.valueOf(d9);
                                                                                        Intrinsics.echo(description, "description");
                                                                                        Intrinsics.echo(addressType, "addressType");
                                                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                                                        V1.a hotel = T.hotel(ivory);
                                                                                        Cf.e eVar = ao.alpha;
                                                                                        ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i19, i182, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                                        auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                                        return;
                                                                                    case 7:
                                                                                        AbstractC0028a abstractC0028a162 = addressNoteActivity.f12350J;
                                                                                        if (abstractC0028a162 != null) {
                                                                                            ProgressBar pbSkipLoading = abstractC0028a162.f303p;
                                                                                            Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                                            pbSkipLoading.setVisibility(0);
                                                                                            AbstractC0028a abstractC0028a172 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a172 != null) {
                                                                                                TextView tvSkipButton = abstractC0028a172.f307t;
                                                                                                Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                                tvSkipButton.setVisibility(8);
                                                                                                AbstractC0028a abstractC0028a18 = addressNoteActivity.f12350J;
                                                                                                if (abstractC0028a18 != null) {
                                                                                                    abstractC0028a18.f298k.setEnabled(false);
                                                                                                    Intent intent = new Intent();
                                                                                                    intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                                    addressNoteActivity.setResult(-1, intent);
                                                                                                    addressNoteActivity.finish();
                                                                                                    return;
                                                                                                }
                                                                                                Intrinsics.lima("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        Intrinsics.lima("binding");
                                                                                        throw null;
                                                                                    case 8:
                                                                                        int i20 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    case 9:
                                                                                        int i21 = AddressNoteActivity.f12347W;
                                                                                        K9.b[] bVarArr2 = K9.b.purple;
                                                                                        addressNoteActivity.f12352L = 1002;
                                                                                        addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                        return;
                                                                                    default:
                                                                                        int i22 = AddressNoteActivity.f12347W;
                                                                                        Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                        if (aVar5 != null) {
                                                                                            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        ivory().foxtrot.observe(this, new t(10, new c(this, 1)));
                                                                        AbstractC0028a abstractC0028a18 = this.f12350J;
                                                                        if (abstractC0028a18 != null) {
                                                                            final int i19 = 6;
                                                                            abstractC0028a18.f299l.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                                                public final /* synthetic */ AddressNoteActivity purple;

                                                                                {
                                                                                    this.purple = this;
                                                                                }

                                                                                /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    String str;
                                                                                    String str2;
                                                                                    String str3;
                                                                                    String str4;
                                                                                    ArrayList arrayList;
                                                                                    Pair pair;
                                                                                    Pair pair2;
                                                                                    boolean z2;
                                                                                    boolean z10;
                                                                                    boolean z11;
                                                                                    boolean z12;
                                                                                    AddressNoteActivity addressNoteActivity = this.purple;
                                                                                    switch (i19) {
                                                                                        case 0:
                                                                                            int i112 = AddressNoteActivity.f12347W;
                                                                                            Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar != null) {
                                                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        case 1:
                                                                                            int i122 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_building);
                                                                                            AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a112 != null) {
                                                                                                abstractC0028a112.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.alpha);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 2:
                                                                                            int i132 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                                            AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a122 != null) {
                                                                                                abstractC0028a122.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.red);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 3:
                                                                                            int i142 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_business);
                                                                                            AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a132 != null) {
                                                                                                abstractC0028a132.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.purple);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 4:
                                                                                            int i152 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                                            AbstractC0028a abstractC0028a142 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a142 != null) {
                                                                                                abstractC0028a142.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.silver);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 5:
                                                                                            int i162 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_other);
                                                                                            AbstractC0028a abstractC0028a152 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a152 != null) {
                                                                                                abstractC0028a152.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.teal);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 6:
                                                                                            int i172 = AddressNoteActivity.f12347W;
                                                                                            Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar2 == null) {
                                                                                                aVar2 = new Vb.a(null, null);
                                                                                            }
                                                                                            Pair pair3 = aVar2.alpha;
                                                                                            if (pair3 != null) {
                                                                                                str = (String) pair3.getSecond();
                                                                                            } else {
                                                                                                str = null;
                                                                                            }
                                                                                            Pair pair4 = aVar2.bravo;
                                                                                            if (pair4 != null) {
                                                                                                str2 = (String) pair4.getSecond();
                                                                                            } else {
                                                                                                str2 = null;
                                                                                            }
                                                                                            int ordinal = addressNoteActivity.indigo().ordinal();
                                                                                            if (ordinal != 0) {
                                                                                                if (ordinal != 1) {
                                                                                                    if (ordinal != 2) {
                                                                                                        if (ordinal != 3) {
                                                                                                            if (ordinal == 4) {
                                                                                                                if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                                    addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                                    return;
                                                                                                                }
                                                                                                            } else {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                        } else {
                                                                                                            String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                            String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                            if (gray.length() > 0) {
                                                                                                                z11 = true;
                                                                                                            } else {
                                                                                                                z11 = false;
                                                                                                            }
                                                                                                            if (gray2.length() > 0) {
                                                                                                                z12 = true;
                                                                                                            } else {
                                                                                                                z12 = false;
                                                                                                            }
                                                                                                            if (!z11 && !z12) {
                                                                                                                addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                                                return;
                                                                                                            } else if (str == null || str.length() == 0) {
                                                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                        String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                        if (gray3.length() > 0) {
                                                                                                            z2 = true;
                                                                                                        } else {
                                                                                                            z2 = false;
                                                                                                        }
                                                                                                        if (gray4.length() > 0) {
                                                                                                            z10 = true;
                                                                                                        } else {
                                                                                                            z10 = false;
                                                                                                        }
                                                                                                        if (!z2 && !z10) {
                                                                                                            addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                                            addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                    String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                    String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                    if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                        if (gray5.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if (gray7.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                                            return;
                                                                                                        } else if (gray6.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                    if (str == null || str.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                    if (gray8.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray9.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray10.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                if (str == null || str.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            n indigo = addressNoteActivity.indigo();
                                                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                            String green = addressNoteActivity.green();
                                                                                            if (!StringsKt.gray(green)) {
                                                                                                linkedHashMap.put("otherInstructions", green);
                                                                                            }
                                                                                            int ordinal2 = indigo.ordinal();
                                                                                            if (ordinal2 != 0) {
                                                                                                if (ordinal2 != 1) {
                                                                                                    if (ordinal2 != 2) {
                                                                                                        if (ordinal2 != 3) {
                                                                                                            if (ordinal2 == 4) {
                                                                                                                linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                                            } else {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                        } else {
                                                                                                            linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                                        }
                                                                                                    } else {
                                                                                                        linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                                    }
                                                                                                } else {
                                                                                                    linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                                    linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                    linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                                }
                                                                                            } else {
                                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                                linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                                            }
                                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                                if (!StringsKt.gray((String) entry.getValue())) {
                                                                                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                                                }
                                                                                            }
                                                                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                                            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                                                if (((String) entry2.getValue()).length() > 0) {
                                                                                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                                                }
                                                                                            }
                                                                                            String green2 = addressNoteActivity.green();
                                                                                            ArrayList arrayList2 = new ArrayList();
                                                                                            int ordinal3 = indigo.ordinal();
                                                                                            if (ordinal3 != 0) {
                                                                                                if (ordinal3 != 1) {
                                                                                                    if (ordinal3 != 2) {
                                                                                                        if (ordinal3 != 3) {
                                                                                                            if (ordinal3 == 4) {
                                                                                                                String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                                                if (StringsKt.gray(gray11)) {
                                                                                                                    gray11 = null;
                                                                                                                }
                                                                                                                if (gray11 != null) {
                                                                                                                    arrayList2.add(gray11);
                                                                                                                }
                                                                                                            } else {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                        } else {
                                                                                                            String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                            if (StringsKt.gray(gray12)) {
                                                                                                                gray12 = null;
                                                                                                            }
                                                                                                            if (gray12 != null) {
                                                                                                                arrayList2.add("House # ".concat(gray12));
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                        if (StringsKt.gray(gray13)) {
                                                                                                            gray13 = null;
                                                                                                        }
                                                                                                        if (gray13 != null) {
                                                                                                            arrayList2.add("Villa # ".concat(gray13));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                    if (StringsKt.gray(gray14)) {
                                                                                                        gray14 = null;
                                                                                                    }
                                                                                                    if (gray14 != null) {
                                                                                                        arrayList2.add("Business: ".concat(gray14));
                                                                                                    }
                                                                                                    String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                    if (StringsKt.gray(gray15)) {
                                                                                                        gray15 = null;
                                                                                                    }
                                                                                                    if (gray15 != null) {
                                                                                                        arrayList2.add("Building # ".concat(gray15));
                                                                                                    }
                                                                                                    String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                    if (StringsKt.gray(gray16)) {
                                                                                                        gray16 = null;
                                                                                                    }
                                                                                                    if (gray16 != null) {
                                                                                                        arrayList2.add("Floor # ".concat(gray16));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (StringsKt.gray(gray17)) {
                                                                                                    gray17 = null;
                                                                                                }
                                                                                                if (gray17 != null) {
                                                                                                    arrayList2.add("Building # ".concat(gray17));
                                                                                                }
                                                                                                String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                if (StringsKt.gray(gray18)) {
                                                                                                    gray18 = null;
                                                                                                }
                                                                                                if (gray18 != null) {
                                                                                                    arrayList2.add("Floor # ".concat(gray18));
                                                                                                }
                                                                                                String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                                if (StringsKt.gray(gray19)) {
                                                                                                    gray19 = null;
                                                                                                }
                                                                                                if (gray19 != null) {
                                                                                                    arrayList2.add("Door # ".concat(gray19));
                                                                                                }
                                                                                            }
                                                                                            if (StringsKt.gray(green2)) {
                                                                                                green2 = null;
                                                                                            }
                                                                                            if (green2 != null) {
                                                                                                arrayList2.add("Other instructions: ".concat(green2));
                                                                                            }
                                                                                            String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                                            Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                                                str3 = (String) pair2.getSecond();
                                                                                            } else {
                                                                                                str3 = null;
                                                                                            }
                                                                                            Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                                                str4 = (String) pair.getSecond();
                                                                                            } else {
                                                                                                str4 = null;
                                                                                            }
                                                                                            ArrayList arrayList3 = new ArrayList();
                                                                                            if (str3 != null) {
                                                                                                arrayList3.add(str3);
                                                                                            }
                                                                                            if (str4 != null) {
                                                                                                arrayList3.add(str4);
                                                                                            }
                                                                                            AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                                            int i182 = addressNoteActivity.f12353M;
                                                                                            int i192 = addressNoteActivity.f12354N;
                                                                                            double d4 = addressNoteActivity.f12356P;
                                                                                            double d9 = addressNoteActivity.Q;
                                                                                            String addressType = indigo.name();
                                                                                            if (arrayList3.isEmpty()) {
                                                                                                arrayList = null;
                                                                                            } else {
                                                                                                arrayList = arrayList3;
                                                                                            }
                                                                                            long j12 = addressNoteActivity.f12358S;
                                                                                            Double valueOf2 = Double.valueOf(d4);
                                                                                            Double valueOf3 = Double.valueOf(d9);
                                                                                            Intrinsics.echo(description, "description");
                                                                                            Intrinsics.echo(addressType, "addressType");
                                                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                                                            V1.a hotel = T.hotel(ivory);
                                                                                            Cf.e eVar = ao.alpha;
                                                                                            ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i192, i182, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                                            auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                                            return;
                                                                                        case 7:
                                                                                            AbstractC0028a abstractC0028a162 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a162 != null) {
                                                                                                ProgressBar pbSkipLoading = abstractC0028a162.f303p;
                                                                                                Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                                                pbSkipLoading.setVisibility(0);
                                                                                                AbstractC0028a abstractC0028a172 = addressNoteActivity.f12350J;
                                                                                                if (abstractC0028a172 != null) {
                                                                                                    TextView tvSkipButton = abstractC0028a172.f307t;
                                                                                                    Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                                    tvSkipButton.setVisibility(8);
                                                                                                    AbstractC0028a abstractC0028a182 = addressNoteActivity.f12350J;
                                                                                                    if (abstractC0028a182 != null) {
                                                                                                        abstractC0028a182.f298k.setEnabled(false);
                                                                                                        Intent intent = new Intent();
                                                                                                        intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                                        addressNoteActivity.setResult(-1, intent);
                                                                                                        addressNoteActivity.finish();
                                                                                                        return;
                                                                                                    }
                                                                                                    Intrinsics.lima("binding");
                                                                                                    throw null;
                                                                                                }
                                                                                                Intrinsics.lima("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 8:
                                                                                            int i20 = AddressNoteActivity.f12347W;
                                                                                            K9.b[] bVarArr = K9.b.purple;
                                                                                            addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                            return;
                                                                                        case 9:
                                                                                            int i21 = AddressNoteActivity.f12347W;
                                                                                            K9.b[] bVarArr2 = K9.b.purple;
                                                                                            addressNoteActivity.f12352L = 1002;
                                                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                            return;
                                                                                        default:
                                                                                            int i22 = AddressNoteActivity.f12347W;
                                                                                            Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar5 != null) {
                                                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            final int i20 = 7;
                                                                            abstractC0028a18.f298k.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.b
                                                                                public final /* synthetic */ AddressNoteActivity purple;

                                                                                {
                                                                                    this.purple = this;
                                                                                }

                                                                                /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    String str;
                                                                                    String str2;
                                                                                    String str3;
                                                                                    String str4;
                                                                                    ArrayList arrayList;
                                                                                    Pair pair;
                                                                                    Pair pair2;
                                                                                    boolean z2;
                                                                                    boolean z10;
                                                                                    boolean z11;
                                                                                    boolean z12;
                                                                                    AddressNoteActivity addressNoteActivity = this.purple;
                                                                                    switch (i20) {
                                                                                        case 0:
                                                                                            int i112 = AddressNoteActivity.f12347W;
                                                                                            Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar != null) {
                                                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, null, 1));
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        case 1:
                                                                                            int i122 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_building);
                                                                                            AbstractC0028a abstractC0028a112 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a112 != null) {
                                                                                                abstractC0028a112.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.alpha);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 2:
                                                                                            int i132 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_villa);
                                                                                            AbstractC0028a abstractC0028a122 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a122 != null) {
                                                                                                abstractC0028a122.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.red);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 3:
                                                                                            int i142 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_business);
                                                                                            AbstractC0028a abstractC0028a132 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a132 != null) {
                                                                                                abstractC0028a132.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.purple);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 4:
                                                                                            int i152 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_compound);
                                                                                            AbstractC0028a abstractC0028a142 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a142 != null) {
                                                                                                abstractC0028a142.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.silver);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 5:
                                                                                            int i162 = AddressNoteActivity.f12347W;
                                                                                            Intrinsics.checkNotNull(view);
                                                                                            addressNoteActivity.jade(view);
                                                                                            addressNoteActivity.lavender(R.layout.include_form_other);
                                                                                            AbstractC0028a abstractC0028a152 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a152 != null) {
                                                                                                abstractC0028a152.red.clearFocus();
                                                                                                addressNoteActivity.maroon(n.teal);
                                                                                                addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                                                                                                return;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 6:
                                                                                            int i172 = AddressNoteActivity.f12347W;
                                                                                            Vb.a aVar2 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar2 == null) {
                                                                                                aVar2 = new Vb.a(null, null);
                                                                                            }
                                                                                            Pair pair3 = aVar2.alpha;
                                                                                            if (pair3 != null) {
                                                                                                str = (String) pair3.getSecond();
                                                                                            } else {
                                                                                                str = null;
                                                                                            }
                                                                                            Pair pair4 = aVar2.bravo;
                                                                                            if (pair4 != null) {
                                                                                                str2 = (String) pair4.getSecond();
                                                                                            } else {
                                                                                                str2 = null;
                                                                                            }
                                                                                            int ordinal = addressNoteActivity.indigo().ordinal();
                                                                                            if (ordinal != 0) {
                                                                                                if (ordinal != 1) {
                                                                                                    if (ordinal != 2) {
                                                                                                        if (ordinal != 3) {
                                                                                                            if (ordinal == 4) {
                                                                                                                if (addressNoteActivity.gray(R.id.et_other_description).length() == 0) {
                                                                                                                    addressNoteActivity.gold(R.string.error_describe_place_required);
                                                                                                                    return;
                                                                                                                }
                                                                                                            } else {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                        } else {
                                                                                                            String gray = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                            String gray2 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                            if (gray.length() > 0) {
                                                                                                                z11 = true;
                                                                                                            } else {
                                                                                                                z11 = false;
                                                                                                            }
                                                                                                            if (gray2.length() > 0) {
                                                                                                                z12 = true;
                                                                                                            } else {
                                                                                                                z12 = false;
                                                                                                            }
                                                                                                            if (!z11 && !z12) {
                                                                                                                addressNoteActivity.gold(R.string.error_house_or_instructions_required);
                                                                                                                return;
                                                                                                            } else if (str == null || str.length() == 0) {
                                                                                                                addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray3 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                        String gray4 = addressNoteActivity.gray(R.id.et_compound_instructions);
                                                                                                        if (gray3.length() > 0) {
                                                                                                            z2 = true;
                                                                                                        } else {
                                                                                                            z2 = false;
                                                                                                        }
                                                                                                        if (gray4.length() > 0) {
                                                                                                            z10 = true;
                                                                                                        } else {
                                                                                                            z10 = false;
                                                                                                        }
                                                                                                        if (!z2 && !z10) {
                                                                                                            addressNoteActivity.gold(R.string.error_villa_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                                                                                                            addressNoteActivity.gold(R.string.error_villa_or_door_image_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray5 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                    String gray6 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                    String gray7 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                    if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                        if (gray5.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_business_name_or_instructions_required);
                                                                                                            return;
                                                                                                        } else if (gray7.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_building_num_required);
                                                                                                            return;
                                                                                                        } else if (gray6.length() == 0) {
                                                                                                            addressNoteActivity.gold(R.string.error_floor_num_required);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                    if (str == null || str.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray8 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                String gray9 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                String gray10 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                                if (addressNoteActivity.gray(R.id.et_compound_instructions).length() <= 0) {
                                                                                                    if (gray8.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_building_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray9.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_floor_or_instructions_required);
                                                                                                        return;
                                                                                                    } else if (gray10.length() == 0) {
                                                                                                        addressNoteActivity.gold(R.string.error_door_or_instructions_required);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                if (str == null || str.length() == 0) {
                                                                                                    addressNoteActivity.gold(R.string.error_building_image_required);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            n indigo = addressNoteActivity.indigo();
                                                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                            String green = addressNoteActivity.green();
                                                                                            if (!StringsKt.gray(green)) {
                                                                                                linkedHashMap.put("otherInstructions", green);
                                                                                            }
                                                                                            int ordinal2 = indigo.ordinal();
                                                                                            if (ordinal2 != 0) {
                                                                                                if (ordinal2 != 1) {
                                                                                                    if (ordinal2 != 2) {
                                                                                                        if (ordinal2 != 3) {
                                                                                                            if (ordinal2 == 4) {
                                                                                                                linkedHashMap.put("placeDescription", addressNoteActivity.gray(R.id.et_other_description));
                                                                                                            } else {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                        } else {
                                                                                                            linkedHashMap.put("houseNumber", addressNoteActivity.gray(R.id.et_house_num));
                                                                                                        }
                                                                                                    } else {
                                                                                                        linkedHashMap.put("villaNumber", addressNoteActivity.gray(R.id.et_villa_num));
                                                                                                    }
                                                                                                } else {
                                                                                                    linkedHashMap.put("businessName", addressNoteActivity.gray(R.id.et_business_name));
                                                                                                    linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                    linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                                }
                                                                                            } else {
                                                                                                linkedHashMap.put("buildingNumber", addressNoteActivity.gray(R.id.et_building_num));
                                                                                                linkedHashMap.put("floorNumber", addressNoteActivity.gray(R.id.et_floor_num));
                                                                                                linkedHashMap.put("doorNumber", addressNoteActivity.gray(R.id.et_door_num));
                                                                                            }
                                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                                if (!StringsKt.gray((String) entry.getValue())) {
                                                                                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                                                }
                                                                                            }
                                                                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                                                            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                                                if (((String) entry2.getValue()).length() > 0) {
                                                                                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                                                                                }
                                                                                            }
                                                                                            String green2 = addressNoteActivity.green();
                                                                                            ArrayList arrayList2 = new ArrayList();
                                                                                            int ordinal3 = indigo.ordinal();
                                                                                            if (ordinal3 != 0) {
                                                                                                if (ordinal3 != 1) {
                                                                                                    if (ordinal3 != 2) {
                                                                                                        if (ordinal3 != 3) {
                                                                                                            if (ordinal3 == 4) {
                                                                                                                String gray11 = addressNoteActivity.gray(R.id.et_other_description);
                                                                                                                if (StringsKt.gray(gray11)) {
                                                                                                                    gray11 = null;
                                                                                                                }
                                                                                                                if (gray11 != null) {
                                                                                                                    arrayList2.add(gray11);
                                                                                                                }
                                                                                                            } else {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                        } else {
                                                                                                            String gray12 = addressNoteActivity.gray(R.id.et_house_num);
                                                                                                            if (StringsKt.gray(gray12)) {
                                                                                                                gray12 = null;
                                                                                                            }
                                                                                                            if (gray12 != null) {
                                                                                                                arrayList2.add("House # ".concat(gray12));
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        String gray13 = addressNoteActivity.gray(R.id.et_villa_num);
                                                                                                        if (StringsKt.gray(gray13)) {
                                                                                                            gray13 = null;
                                                                                                        }
                                                                                                        if (gray13 != null) {
                                                                                                            arrayList2.add("Villa # ".concat(gray13));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    String gray14 = addressNoteActivity.gray(R.id.et_business_name);
                                                                                                    if (StringsKt.gray(gray14)) {
                                                                                                        gray14 = null;
                                                                                                    }
                                                                                                    if (gray14 != null) {
                                                                                                        arrayList2.add("Business: ".concat(gray14));
                                                                                                    }
                                                                                                    String gray15 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                    if (StringsKt.gray(gray15)) {
                                                                                                        gray15 = null;
                                                                                                    }
                                                                                                    if (gray15 != null) {
                                                                                                        arrayList2.add("Building # ".concat(gray15));
                                                                                                    }
                                                                                                    String gray16 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                    if (StringsKt.gray(gray16)) {
                                                                                                        gray16 = null;
                                                                                                    }
                                                                                                    if (gray16 != null) {
                                                                                                        arrayList2.add("Floor # ".concat(gray16));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String gray17 = addressNoteActivity.gray(R.id.et_building_num);
                                                                                                if (StringsKt.gray(gray17)) {
                                                                                                    gray17 = null;
                                                                                                }
                                                                                                if (gray17 != null) {
                                                                                                    arrayList2.add("Building # ".concat(gray17));
                                                                                                }
                                                                                                String gray18 = addressNoteActivity.gray(R.id.et_floor_num);
                                                                                                if (StringsKt.gray(gray18)) {
                                                                                                    gray18 = null;
                                                                                                }
                                                                                                if (gray18 != null) {
                                                                                                    arrayList2.add("Floor # ".concat(gray18));
                                                                                                }
                                                                                                String gray19 = addressNoteActivity.gray(R.id.et_door_num);
                                                                                                if (StringsKt.gray(gray19)) {
                                                                                                    gray19 = null;
                                                                                                }
                                                                                                if (gray19 != null) {
                                                                                                    arrayList2.add("Door # ".concat(gray19));
                                                                                                }
                                                                                            }
                                                                                            if (StringsKt.gray(green2)) {
                                                                                                green2 = null;
                                                                                            }
                                                                                            if (green2 != null) {
                                                                                                arrayList2.add("Other instructions: ".concat(green2));
                                                                                            }
                                                                                            String description = StringsKt.b(CollectionsKt.maroon(arrayList2, ", ", null, null, null, 62)).toString();
                                                                                            Vb.a aVar3 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar3 != null && (pair2 = aVar3.alpha) != null) {
                                                                                                str3 = (String) pair2.getSecond();
                                                                                            } else {
                                                                                                str3 = null;
                                                                                            }
                                                                                            Vb.a aVar4 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar4 != null && (pair = aVar4.bravo) != null) {
                                                                                                str4 = (String) pair.getSecond();
                                                                                            } else {
                                                                                                str4 = null;
                                                                                            }
                                                                                            ArrayList arrayList3 = new ArrayList();
                                                                                            if (str3 != null) {
                                                                                                arrayList3.add(str3);
                                                                                            }
                                                                                            if (str4 != null) {
                                                                                                arrayList3.add(str4);
                                                                                            }
                                                                                            AllAddressNoteViewModel ivory = addressNoteActivity.ivory();
                                                                                            int i182 = addressNoteActivity.f12353M;
                                                                                            int i192 = addressNoteActivity.f12354N;
                                                                                            double d4 = addressNoteActivity.f12356P;
                                                                                            double d9 = addressNoteActivity.Q;
                                                                                            String addressType = indigo.name();
                                                                                            if (arrayList3.isEmpty()) {
                                                                                                arrayList = null;
                                                                                            } else {
                                                                                                arrayList = arrayList3;
                                                                                            }
                                                                                            long j12 = addressNoteActivity.f12358S;
                                                                                            Double valueOf2 = Double.valueOf(d4);
                                                                                            Double valueOf3 = Double.valueOf(d9);
                                                                                            Intrinsics.echo(description, "description");
                                                                                            Intrinsics.echo(addressType, "addressType");
                                                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                                                            V1.a hotel = T.hotel(ivory);
                                                                                            Cf.e eVar = ao.alpha;
                                                                                            ad.zulu(hotel, Cf.d.purple, null, new Xb.d(i192, i182, description, valueOf2, valueOf3, addressType, linkedHashMap3, arrayList, ivory, j12, auVar, null), 2);
                                                                                            auVar.observe(addressNoteActivity, new Dc.t(10, new c(addressNoteActivity, 0)));
                                                                                            return;
                                                                                        case 7:
                                                                                            AbstractC0028a abstractC0028a162 = addressNoteActivity.f12350J;
                                                                                            if (abstractC0028a162 != null) {
                                                                                                ProgressBar pbSkipLoading = abstractC0028a162.f303p;
                                                                                                Intrinsics.delta(pbSkipLoading, "pbSkipLoading");
                                                                                                pbSkipLoading.setVisibility(0);
                                                                                                AbstractC0028a abstractC0028a172 = addressNoteActivity.f12350J;
                                                                                                if (abstractC0028a172 != null) {
                                                                                                    TextView tvSkipButton = abstractC0028a172.f307t;
                                                                                                    Intrinsics.delta(tvSkipButton, "tvSkipButton");
                                                                                                    tvSkipButton.setVisibility(8);
                                                                                                    AbstractC0028a abstractC0028a182 = addressNoteActivity.f12350J;
                                                                                                    if (abstractC0028a182 != null) {
                                                                                                        abstractC0028a182.f298k.setEnabled(false);
                                                                                                        Intent intent = new Intent();
                                                                                                        intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                                                                                                        addressNoteActivity.setResult(-1, intent);
                                                                                                        addressNoteActivity.finish();
                                                                                                        return;
                                                                                                    }
                                                                                                    Intrinsics.lima("binding");
                                                                                                    throw null;
                                                                                                }
                                                                                                Intrinsics.lima("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            Intrinsics.lima("binding");
                                                                                            throw null;
                                                                                        case 8:
                                                                                            int i202 = AddressNoteActivity.f12347W;
                                                                                            K9.b[] bVarArr = K9.b.purple;
                                                                                            addressNoteActivity.f12352L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
                                                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                            return;
                                                                                        case 9:
                                                                                            int i21 = AddressNoteActivity.f12347W;
                                                                                            K9.b[] bVarArr2 = K9.b.purple;
                                                                                            addressNoteActivity.f12352L = 1002;
                                                                                            addressNoteActivity.f12361V.alpha("android.permission.CAMERA");
                                                                                            return;
                                                                                        default:
                                                                                            int i22 = AddressNoteActivity.f12347W;
                                                                                            Vb.a aVar5 = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
                                                                                            if (aVar5 != null) {
                                                                                                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar5, null, null, 2));
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            L supportFragmentManager = getSupportFragmentManager();
                                                                            a aVar = new a(this, 2);
                                                                            supportFragmentManager.getClass();
                                                                            ac lifecycle = getLifecycle();
                                                                            if (lifecycle.bravo() != androidx.lifecycle.ab.alpha) {
                                                                                C c3 = new C(supportFragmentManager, aVar, lifecycle);
                                                                                F f5 = (F) supportFragmentManager.november.put("annotateResult", new F(lifecycle, aVar, c3));
                                                                                if (f5 != null) {
                                                                                    f5.alpha.charlie(f5.charlie);
                                                                                }
                                                                                if (L.gray(2)) {
                                                                                    Log.v("FragmentManager", "Setting FragmentResultListener with key annotateResult lifecycleOwner " + lifecycle + " and listener " + aVar);
                                                                                }
                                                                                lifecycle.alpha(c3);
                                                                            }
                                                                            if (bundle != null) {
                                                                                i5 = bundle.getInt("KEY_ATTACHMENT_TYPE");
                                                                            }
                                                                            this.f12352L = i5;
                                                                            return;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        }
                                                        Intrinsics.lima("binding");
                                                        throw null;
                                                    }
                                                    Intrinsics.lima("binding");
                                                    throw null;
                                                }
                                                Intrinsics.lima("binding");
                                                throw null;
                                            }
                                            Intrinsics.lima("binding");
                                            throw null;
                                        }
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                                Intrinsics.lima("binding");
                                throw null;
                            }
                            Intrinsics.lima("binding");
                            throw null;
                        }
                        Intrinsics.lima("binding");
                        throw null;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onDestroy() {
        CountDownTimer countDownTimer = this.f12359T;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // ae.o, f1.i, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.echo(outState, "outState");
        outState.putInt("KEY_ATTACHMENT_TYPE", this.f12352L);
        super.onSaveInstanceState(outState);
    }
}
