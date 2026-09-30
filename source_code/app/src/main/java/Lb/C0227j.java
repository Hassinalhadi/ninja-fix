package Lb;

import android.os.Bundle;
import androidx.compose.runtime.t0;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.AttributeSubmission;
import com.app.network.network.models.ProfileAttributesRequest;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import r3.C2492a;

/* renamed from: Lb.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0227j implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0233p purple;

    public /* synthetic */ C0227j(C0233p c0233p, int i4) {
        this.alpha = i4;
        this.purple = c0233p;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        switch (this.alpha) {
            case 0:
                C0233p c0233p = this.purple;
                S.t tVar = c0233p.f1814z;
                Iterator it = tVar.purple.iterator();
                boolean z2 = false;
                while (((S.ab) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((S.ab) it).next();
                    String str = (String) entry.getKey();
                    if (StringsKt.gray((String) entry.getValue())) {
                        c0233p.A.put(str, c0233p.getString(R.string.field_required));
                        z2 = true;
                    }
                }
                if (!z2) {
                    t0 t0Var = (t0) c0233p.f1801E;
                    if (!((Boolean) t0Var.getValue()).booleanValue()) {
                        t0Var.setValue(Boolean.TRUE);
                        ((t0) c0233p.f1802F).setValue(null);
                        ArrayList arrayList = new ArrayList(tVar.size());
                        Iterator it2 = tVar.purple.iterator();
                        while (((S.ab) it2).hasNext()) {
                            Map.Entry entry2 = (Map.Entry) ((S.ab) it2).next();
                            arrayList.add(new AttributeSubmission((String) entry2.getKey(), StringsKt.b((String) entry2.getValue()).toString()));
                        }
                        ProfileAttributesRequest profileAttributesRequest = new ProfileAttributesRequest(arrayList);
                        HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) c0233p.f1810v.getValue();
                        ?? auVar = new androidx.lifecycle.au(new C2492a(2, "loading"));
                        BaseViewModel.launchApi$default(homeViewModelV2, null, new Jb.L(homeViewModelV2, profileAttributesRequest, auVar, null), 1, null);
                        auVar.observe(c0233p.getViewLifecycleOwner(), new Dc.t(6, new C0228k(c0233p, 3)));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                this.purple.kilo();
                return Unit.INSTANCE;
            default:
                C0233p c0233p2 = this.purple;
                Bundle arguments = c0233p2.getArguments();
                if (arguments != null && (string = arguments.getString("arg_group")) != null) {
                    return (AttributeGroup) c0233p2.f1812x.delta(AttributeGroup.class, string);
                }
                return null;
        }
    }
}
