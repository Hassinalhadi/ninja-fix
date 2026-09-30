package Ca;

import Va.d;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.az;
import com.app.network.network.models.Bank;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.PlatformListResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wa.C3248d;
import x9.InterfaceC3312f;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ a(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4;
        switch (this.alpha) {
            case 0:
                c cVar = (c) this.red;
                cVar.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f = cVar.bravo;
                if (interfaceC3312f != null) {
                    ArrayList arrayList = cVar.alpha;
                    int i5 = this.purple;
                    Object obj = arrayList.get(i5);
                    Intrinsics.delta(obj, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f.black(view, i5, obj);
                    return;
                }
                return;
            case 1:
                c cVar2 = (c) this.red;
                cVar2.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f2 = cVar2.bravo;
                if (interfaceC3312f2 != null) {
                    ArrayList arrayList2 = cVar2.alpha;
                    int i10 = this.purple;
                    Object obj2 = arrayList2.get(i10);
                    Intrinsics.delta(obj2, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f2.black(view, i10, obj2);
                    return;
                }
                return;
            case 2:
                c cVar3 = (c) this.red;
                InterfaceC3312f interfaceC3312f3 = cVar3.bravo;
                if (interfaceC3312f3 != null) {
                    ArrayList arrayList3 = cVar3.alpha;
                    int i11 = this.purple;
                    Object obj3 = arrayList3.get(i11);
                    Intrinsics.delta(obj3, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f3.black(view, i11, obj3);
                    return;
                }
                return;
            case 3:
                Hc.b bVar = (Hc.b) this.red;
                ArrayList arrayList4 = bVar.alpha;
                int i12 = this.purple;
                arrayList4.remove(i12);
                bVar.notifyItemRemoved(i12);
                az azVar = ((ZenDeskChatActivity) bVar.delta).f12501J;
                List list = (List) azVar.getValue();
                if (list != null) {
                    list.remove(i12);
                } else {
                    list = null;
                }
                azVar.postValue(list);
                return;
            case 4:
                Hc.b bVar2 = (Hc.b) this.red;
                ArrayList arrayList5 = bVar2.alpha;
                int i13 = this.purple;
                arrayList5.remove(i13);
                bVar2.notifyItemRemoved(i13);
                ((Nc.c) bVar2.delta).invoke(Integer.valueOf(i13));
                return;
            case 5:
                d dVar = (d) this.red;
                ArrayList arrayList6 = dVar.alpha;
                int i14 = this.purple;
                dVar.delta = ((Bank) arrayList6.get(i14)).getId();
                dVar.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f4 = dVar.bravo;
                if (interfaceC3312f4 != null) {
                    Object obj4 = dVar.alpha.get(i14);
                    Intrinsics.delta(obj4, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f4.black(view, i14, obj4);
                    return;
                }
                return;
            case 6:
                d dVar2 = (d) this.red;
                ArrayList arrayList7 = dVar2.alpha;
                int i15 = this.purple;
                dVar2.delta = ((City) arrayList7.get(i15)).getId();
                dVar2.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f5 = dVar2.bravo;
                if (interfaceC3312f5 != null) {
                    Object obj5 = dVar2.alpha.get(i15);
                    Intrinsics.delta(obj5, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f5.black(view, i15, obj5);
                    return;
                }
                return;
            case 7:
                Xa.b bVar3 = (Xa.b) this.red;
                ArrayList arrayList8 = bVar3.alpha;
                int i16 = this.purple;
                bVar3.charlie = ((Country) arrayList8.get(i16)).getId();
                bVar3.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f6 = bVar3.bravo;
                if (interfaceC3312f6 != null) {
                    Object obj6 = bVar3.alpha.get(i16);
                    Intrinsics.delta(obj6, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f6.black(view, i16, obj6);
                    return;
                }
                return;
            case 8:
                d dVar3 = (d) this.red;
                ArrayList arrayList9 = dVar3.alpha;
                int i17 = this.purple;
                dVar3.delta = ((PlatformListResponse) arrayList9.get(i17)).getId();
                dVar3.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f7 = dVar3.bravo;
                if (interfaceC3312f7 != null) {
                    Object obj7 = dVar3.alpha.get(i17);
                    Intrinsics.delta(obj7, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f7.black(view, i17, obj7);
                    return;
                }
                return;
            case 9:
                c cVar4 = (c) this.red;
                InterfaceC3312f interfaceC3312f8 = cVar4.bravo;
                if (interfaceC3312f8 != null) {
                    ArrayList arrayList10 = cVar4.alpha;
                    int i18 = this.purple;
                    Object obj8 = arrayList10.get(i18);
                    Intrinsics.delta(obj8, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f8.black(view, i18, obj8);
                    return;
                }
                return;
            case 10:
                c cVar5 = (c) this.red;
                InterfaceC3312f interfaceC3312f9 = cVar5.bravo;
                if (interfaceC3312f9 != null) {
                    ArrayList arrayList11 = cVar5.alpha;
                    int i19 = this.purple;
                    Object obj9 = arrayList11.get(i19);
                    Intrinsics.delta(obj9, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f9.black(view, i19, obj9);
                    return;
                }
                return;
            case 11:
                int i20 = this.purple + 1;
                C3248d c3248d = (C3248d) this.red;
                List list2 = c3248d.f14032v;
                if (list2 != null) {
                    int i21 = 0;
                    for (Object obj10 : list2) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ImageView imageView = (ImageView) obj10;
                        if (i21 < i20) {
                            i4 = R.drawable.ic_star_filled;
                        } else {
                            i4 = R.drawable.ic_star;
                        }
                        imageView.setImageResource(i4);
                        i21 = i22;
                    }
                    c3248d.f14031u = i20;
                    c3248d.bronze().f379f.setEnabled(true);
                    return;
                }
                Intrinsics.lima("rateStars");
                throw null;
            case 12:
                c cVar6 = (c) this.red;
                cVar6.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f10 = cVar6.bravo;
                if (interfaceC3312f10 != null) {
                    ArrayList arrayList12 = cVar6.alpha;
                    int i23 = this.purple;
                    Object obj11 = arrayList12.get(i23);
                    Intrinsics.delta(obj11, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f10.black(view, i23, obj11);
                    return;
                }
                return;
            case 13:
                c cVar7 = (c) this.red;
                cVar7.notifyDataSetChanged();
                InterfaceC3312f interfaceC3312f11 = cVar7.bravo;
                if (interfaceC3312f11 != null) {
                    ArrayList arrayList13 = cVar7.alpha;
                    int i24 = this.purple;
                    Object obj12 = arrayList13.get(i24);
                    Intrinsics.delta(obj12, "get(...)");
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f11.black(view, i24, obj12);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNull(view);
                d dVar4 = (d) this.red;
                Integer num = dVar4.delta;
                ArrayList arrayList14 = dVar4.alpha;
                int i25 = this.purple;
                dVar4.foxtrot(((PlatformListResponse) arrayList14.get(i25)).getId());
                Iterator it = arrayList14.iterator();
                int i26 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!Intrinsics.areEqual(((PlatformListResponse) it.next()).getId(), num)) {
                            i26++;
                        }
                    } else {
                        i26 = -1;
                    }
                }
                dVar4.notifyItemChanged(i26);
                dVar4.notifyItemChanged(i25);
                InterfaceC3312f interfaceC3312f12 = dVar4.bravo;
                if (interfaceC3312f12 != null) {
                    Object obj13 = arrayList14.get(i25);
                    Intrinsics.delta(obj13, "get(...)");
                    interfaceC3312f12.black(view, i25, obj13);
                    return;
                }
                return;
        }
    }
}
