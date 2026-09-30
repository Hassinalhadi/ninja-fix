package zc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.Shift;
import com.google.android.gms.measurement.internal.C1475w;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t6.S3;
import yc.EnumC3415a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzc/c;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class c extends AbstractC3508a {

    /* renamed from: u, reason: collision with root package name */
    public List f14220u = CollectionsKt.emptyList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f14221v = true;

    /* renamed from: w, reason: collision with root package name */
    public J2.l f14222w;

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
        beige();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.bottom_sheet_pricing_rules_v2, viewGroup, false);
        int i4 = R.id.btn_close;
        ImageButton imageButton = (ImageButton) S3.bravo(R.id.btn_close, inflate);
        if (imageButton != null) {
            i4 = R.id.rv_sections;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_sections, inflate);
            if (recyclerView != null) {
                i4 = R.id.tv_title;
                if (((TextView) S3.bravo(R.id.tv_title, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f14222w = new J2.l(constraintLayout, imageButton, recyclerView);
                    Intrinsics.delta(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e A[SYNTHETIC] */
    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC3415a enumC3415a;
        String obj;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14101q) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f14220u) {
            if (Intrinsics.areEqual(((Shift.PricingRule) obj2).getIsVisibleToCaptain(), Boolean.TRUE)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            Shift.PricingRule pricingRule = (Shift.PricingRule) it.next();
            C1475w c1475w = EnumC3415a.red;
            String category = pricingRule.getCategory();
            c1475w.getClass();
            if (category != null && (obj = StringsKt.b(category).toString()) != null) {
                String lowerCase = obj.toLowerCase(Locale.ROOT);
                Intrinsics.delta(lowerCase, "toLowerCase(...)");
                if (StringsKt.beige(lowerCase, "guarantee", false)) {
                    enumC3415a = EnumC3415a.silver;
                } else if (StringsKt.beige(lowerCase, "bonus", false)) {
                    enumC3415a = EnumC3415a.teal;
                } else if (StringsKt.beige(lowerCase, "deduction", false)) {
                    enumC3415a = EnumC3415a.white;
                }
                if (enumC3415a != null) {
                    pair = new Pair(enumC3415a, pricingRule);
                }
                if (pair == null) {
                    arrayList2.add(pair);
                }
            }
            enumC3415a = null;
            if (enumC3415a != null) {
            }
            if (pair == null) {
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            EnumC3415a enumC3415a2 = (EnumC3415a) pair2.getFirst();
            Object obj3 = linkedHashMap.get(enumC3415a2);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(enumC3415a2, obj3);
            }
            ((List) obj3).add((Shift.PricingRule) pair2.getSecond());
        }
        TreeMap beige = y.beige(linkedHashMap, new Sb.k(21));
        yc.e eVar = new yc.e(beige);
        J2.l lVar = this.f14222w;
        if (lVar != null) {
            ((RecyclerView) lVar.purple).setAdapter(eVar);
            eVar.alpha(CollectionsKt.z(beige.keySet()));
            J2.l lVar2 = this.f14222w;
            if (lVar2 != null) {
                ((ImageButton) lVar2.alpha).setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(25, this));
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a
    public final int whiskey() {
        return 2;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF14221v() {
        return this.f14221v;
    }
}
