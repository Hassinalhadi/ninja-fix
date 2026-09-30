package ic;

import Ac.g;
import B9.ar;
import B9.as;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.lifecycle.a0;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import com.bumptech.glide.m;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import z1.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lic/b;", "Landroidx/fragment/app/w;", "<init>", "()V", "s6/n5", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: ic.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1911b extends DialogInterfaceOnCancelListenerC0627w implements GeneratedComponentManagerHolder {

    /* renamed from: j, reason: collision with root package name */
    public ContextWrapper f12777j;

    /* renamed from: l, reason: collision with root package name */
    public volatile FragmentComponentManager f12779l;

    /* renamed from: o, reason: collision with root package name */
    public ar f12782o;

    /* renamed from: p, reason: collision with root package name */
    public g f12783p;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12778k = false;

    /* renamed from: m, reason: collision with root package name */
    public final Object f12780m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f12781n = false;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f12778k) {
            return null;
        }
        tango();
        return this.f12777j;
    }

    @Override // androidx.fragment.app.ai, androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        tango();
        if (this.f12781n) {
            return;
        }
        this.f12781n = true;
        InterfaceC1912c interfaceC1912c = (InterfaceC1912c) generatedComponent();
        interfaceC1912c.getClass();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        papa(2, R.style.TopBannerDialogTheme);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = ar.f365p;
        DataBinderMapperImpl dataBinderMapperImpl = d.alpha;
        ar arVar = (ar) z1.g.kilo(inflater, R.layout.dialog_point_score_show, viewGroup, false, null);
        Intrinsics.delta(arVar, "inflate(...)");
        this.f12782o = arVar;
        View view = arVar.red;
        Intrinsics.delta(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onDestroyView() {
        m delta = com.bumptech.glide.b.bravo(getContext()).delta(this);
        ar arVar = this.f12782o;
        if (arVar != null) {
            delta.getClass();
            delta.india(new k(arVar.f369i));
            m delta2 = com.bumptech.glide.b.bravo(getContext()).delta(this);
            ar arVar2 = this.f12782o;
            if (arVar2 != null) {
                delta2.getClass();
                delta2.india(new k(arVar2.f368h));
                super.onDestroyView();
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
            window.setGravity(48);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.bumptech.glide.load.resource.bitmap.d, java.lang.Object] */
    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Integer indigo;
        Integer indigo2;
        Intrinsics.echo(view, "view");
        Bundle requireArguments = requireArguments();
        Intrinsics.delta(requireArguments, "requireArguments(...)");
        String string = requireArguments.getString("t");
        if (string == null) {
            string = "";
        }
        String string2 = requireArguments.getString("m");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = requireArguments.getString("p1");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = requireArguments.getString("p2");
        int i4 = requireArguments.getInt("ac");
        int[] intArray = requireArguments.getIntArray("gifs");
        ar arVar = this.f12782o;
        if (arVar != null) {
            as asVar = (as) arVar;
            asVar.f372l = string;
            synchronized (asVar) {
                asVar.f377q |= 8;
            }
            asVar.delta();
            asVar.oscar();
            ar arVar2 = this.f12782o;
            if (arVar2 != null) {
                arVar2.romeo(string2);
                ar arVar3 = this.f12782o;
                if (arVar3 != null) {
                    arVar3.sierra(string3);
                    ar arVar4 = this.f12782o;
                    if (arVar4 != null) {
                        arVar4.tango(string4);
                        if (intArray != null && (indigo2 = ArraysKt.indigo(0, intArray)) != null) {
                            int intValue = indigo2.intValue();
                            ar arVar5 = this.f12782o;
                            if (arVar5 != null) {
                                arVar5.f369i.setVisibility(0);
                                ar arVar6 = this.f12782o;
                                if (arVar6 != null) {
                                    arVar6.f369i.setScaleType(ImageView.ScaleType.CENTER);
                                    j bronze = com.bumptech.glide.b.bravo(getContext()).delta(this).hotel().bronze(Integer.valueOf(intValue));
                                    bronze.getClass();
                                    j jVar = (j) bronze.uniform(com.bumptech.glide.load.resource.bitmap.m.delta, new Object());
                                    ar arVar7 = this.f12782o;
                                    if (arVar7 != null) {
                                        jVar.azure(arVar7.f369i);
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        } else {
                            ar arVar8 = this.f12782o;
                            if (arVar8 != null) {
                                arVar8.f369i.setImageDrawable(null);
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        }
                        if (intArray != null && (indigo = ArraysKt.indigo(1, intArray)) != null) {
                            int intValue2 = indigo.intValue();
                            ar arVar9 = this.f12782o;
                            if (arVar9 != null) {
                                arVar9.f368h.setVisibility(0);
                                j bronze2 = com.bumptech.glide.b.bravo(getContext()).delta(this).hotel().bronze(Integer.valueOf(intValue2));
                                ar arVar10 = this.f12782o;
                                if (arVar10 != null) {
                                    bronze2.azure(arVar10.f368h);
                                } else {
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        } else {
                            ar arVar11 = this.f12782o;
                            if (arVar11 != null) {
                                arVar11.f368h.setVisibility(8);
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        }
                        ar arVar12 = this.f12782o;
                        if (arVar12 != null) {
                            arVar12.f371k.setTextColor(i4);
                            ar arVar13 = this.f12782o;
                            if (arVar13 != null) {
                                MaterialButton materialButton = arVar13.f366f;
                                materialButton.setStrokeColor(ColorStateList.valueOf(-1));
                                materialButton.setTextColor(-1);
                                ar arVar14 = this.f12782o;
                                if (arVar14 != null) {
                                    MaterialButton materialButton2 = arVar14.f367g;
                                    materialButton2.setStrokeColor(ColorStateList.valueOf(-1));
                                    materialButton2.setTextColor(-1);
                                    ar arVar15 = this.f12782o;
                                    if (arVar15 != null) {
                                        final int i5 = 0;
                                        arVar15.f366f.setOnClickListener(new View.OnClickListener(this) { // from class: ic.a
                                            public final /* synthetic */ C1911b purple;

                                            {
                                                this.purple = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                switch (i5) {
                                                    case 0:
                                                        this.purple.kilo();
                                                        return;
                                                    default:
                                                        C1911b c1911b = this.purple;
                                                        g gVar = c1911b.f12783p;
                                                        if (gVar != null) {
                                                            gVar.invoke();
                                                        }
                                                        c1911b.kilo();
                                                        return;
                                                }
                                            }
                                        });
                                        ar arVar16 = this.f12782o;
                                        if (arVar16 != null) {
                                            final int i10 = 1;
                                            arVar16.f367g.setOnClickListener(new View.OnClickListener(this) { // from class: ic.a
                                                public final /* synthetic */ C1911b purple;

                                                {
                                                    this.purple = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view2) {
                                                    switch (i10) {
                                                        case 0:
                                                            this.purple.kilo();
                                                            return;
                                                        default:
                                                            C1911b c1911b = this.purple;
                                                            g gVar = c1911b.f12783p;
                                                            if (gVar != null) {
                                                                gVar.invoke();
                                                            }
                                                            c1911b.kilo();
                                                            return;
                                                    }
                                                }
                                            });
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

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: sierra, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f12779l == null) {
            synchronized (this.f12780m) {
                try {
                    if (this.f12779l == null) {
                        this.f12779l = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f12779l;
    }

    public final void tango() {
        if (this.f12777j == null) {
            this.f12777j = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f12778k = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f12777j;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        tango();
        if (this.f12781n) {
            return;
        }
        this.f12781n = true;
        InterfaceC1912c interfaceC1912c = (InterfaceC1912c) generatedComponent();
        interfaceC1912c.getClass();
    }
}
