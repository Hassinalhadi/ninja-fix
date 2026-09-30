package Ob;

import Lb.AbstractC0220c;
import S.ab;
import S.t;
import Xd.l;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.lifecycle.au;
import ao.ad;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.AttributeSubmission;
import com.app.network.network.models.ProfileAttributesRequest;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.missingAttributes.AttributeMissingViewModel;
import delivery.samurai.android.ui.missingAttributes.AttributesMissingActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AttributesMissingActivity purple;

    public /* synthetic */ e(AttributesMissingActivity attributesMissingActivity, int i4) {
        this.alpha = i4;
        this.purple = attributesMissingActivity;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        final AttributesMissingActivity attributesMissingActivity = this.purple;
        final int i4 = 0;
        final int i5 = 1;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                int i10 = AttributesMissingActivity.f12319a0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    int ordinal = ((h) ((t0) attributesMissingActivity.f12326N).getValue()).ordinal();
                    as asVar = C0580l.alpha;
                    ax axVar = attributesMissingActivity.f12332U;
                    ax axVar2 = attributesMissingActivity.f12331T;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                c0585q.purple(444064392);
                                boolean india = c0585q.india(attributesMissingActivity);
                                Object jade = c0585q.jade();
                                if (india || jade == asVar) {
                                    jade = new Function0() { // from class: Ob.f
                                        /* JADX WARN: Type inference failed for: r4v7, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i5) {
                                                case 0:
                                                    AttributesMissingActivity attributesMissingActivity2 = attributesMissingActivity;
                                                    t tVar = attributesMissingActivity2.f12327O;
                                                    Iterator it = tVar.purple.iterator();
                                                    boolean z10 = false;
                                                    while (((ab) it).hasNext()) {
                                                        Map.Entry entry = (Map.Entry) ((ab) it).next();
                                                        String str = (String) entry.getKey();
                                                        if (StringsKt.gray((String) entry.getValue())) {
                                                            attributesMissingActivity2.f12328P.put(str, attributesMissingActivity2.getString(R.string.field_required));
                                                            z10 = true;
                                                        }
                                                    }
                                                    if (!z10) {
                                                        t0 t0Var = (t0) attributesMissingActivity2.f12331T;
                                                        if (!((Boolean) t0Var.getValue()).booleanValue()) {
                                                            t0Var.setValue(Boolean.TRUE);
                                                            ((t0) attributesMissingActivity2.f12332U).setValue(null);
                                                            ArrayList arrayList = new ArrayList(tVar.size());
                                                            Iterator it2 = tVar.purple.iterator();
                                                            while (((ab) it2).hasNext()) {
                                                                Map.Entry entry2 = (Map.Entry) ((ab) it2).next();
                                                                arrayList.add(new AttributeSubmission((String) entry2.getKey(), StringsKt.b((String) entry2.getValue()).toString()));
                                                            }
                                                            ProfileAttributesRequest profileAttributesRequest = new ProfileAttributesRequest(arrayList);
                                                            AttributeMissingViewModel attributeMissingViewModel = (AttributeMissingViewModel) attributesMissingActivity2.f12321I.getValue();
                                                            ?? auVar = new au(new C2492a(2, "loading"));
                                                            BaseViewModel.launchApi$default(attributeMissingViewModel, null, new b(attributeMissingViewModel, profileAttributesRequest, auVar, null), 1, null);
                                                            auVar.observe(attributesMissingActivity2, new Dc.t(8, new g(attributesMissingActivity2, 2)));
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    AttributesMissingActivity attributesMissingActivity3 = attributesMissingActivity;
                                                    attributesMissingActivity3.f12325M = true;
                                                    attributesMissingActivity3.gold();
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    c0585q.f(jade);
                                }
                                AbstractC0220c.hotel(0, null, c0585q, (String) ((t0) attributesMissingActivity.f12337Z).getValue(), (Function0) jade);
                                c0585q.quebec(false);
                            } else {
                                throw ad.black(c0585q, 444011931, false);
                            }
                        } else {
                            c0585q.purple(880262877);
                            String str = (String) ((t0) attributesMissingActivity.f12333V).getValue();
                            int juliet = attributesMissingActivity.f12329R.juliet();
                            String str2 = (String) ((t0) attributesMissingActivity.Q).getValue();
                            String str3 = (String) ((t0) attributesMissingActivity.f12334W).getValue();
                            String str4 = (String) ((t0) attributesMissingActivity.f12335X).getValue();
                            String str5 = (String) ((t0) attributesMissingActivity.f12336Y).getValue();
                            boolean booleanValue = ((Boolean) ((t0) axVar2).getValue()).booleanValue();
                            String str6 = (String) ((t0) axVar).getValue();
                            boolean india2 = c0585q.india(attributesMissingActivity);
                            Object jade2 = c0585q.jade();
                            if (india2 || jade2 == asVar) {
                                jade2 = new g(attributesMissingActivity, i4);
                                c0585q.f(jade2);
                            }
                            Function1 function1 = (Function1) jade2;
                            boolean india3 = c0585q.india(attributesMissingActivity);
                            Object jade3 = c0585q.jade();
                            if (india3 || jade3 == asVar) {
                                jade3 = new g(attributesMissingActivity, i5);
                                c0585q.f(jade3);
                            }
                            AbstractC0220c.foxtrot(str, juliet, str2, function1, (Function1) jade3, str3, str4, str5, booleanValue, str6, null, c0585q, 0);
                            c0585q.quebec(false);
                        }
                    } else {
                        c0585q.purple(444012884);
                        AttributeGroup attributeGroup = attributesMissingActivity.f12323K;
                        if (attributeGroup != null) {
                            boolean india4 = c0585q.india(attributesMissingActivity);
                            Object jade4 = c0585q.jade();
                            if (india4 || jade4 == asVar) {
                                jade4 = new e(attributesMissingActivity, i5);
                                c0585q.f(jade4);
                            }
                            l lVar = (l) jade4;
                            boolean india5 = c0585q.india(attributesMissingActivity);
                            Object jade5 = c0585q.jade();
                            if (india5 || jade5 == asVar) {
                                jade5 = new Function0() { // from class: Ob.f
                                    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i4) {
                                            case 0:
                                                AttributesMissingActivity attributesMissingActivity2 = attributesMissingActivity;
                                                t tVar = attributesMissingActivity2.f12327O;
                                                Iterator it = tVar.purple.iterator();
                                                boolean z10 = false;
                                                while (((ab) it).hasNext()) {
                                                    Map.Entry entry = (Map.Entry) ((ab) it).next();
                                                    String str7 = (String) entry.getKey();
                                                    if (StringsKt.gray((String) entry.getValue())) {
                                                        attributesMissingActivity2.f12328P.put(str7, attributesMissingActivity2.getString(R.string.field_required));
                                                        z10 = true;
                                                    }
                                                }
                                                if (!z10) {
                                                    t0 t0Var = (t0) attributesMissingActivity2.f12331T;
                                                    if (!((Boolean) t0Var.getValue()).booleanValue()) {
                                                        t0Var.setValue(Boolean.TRUE);
                                                        ((t0) attributesMissingActivity2.f12332U).setValue(null);
                                                        ArrayList arrayList = new ArrayList(tVar.size());
                                                        Iterator it2 = tVar.purple.iterator();
                                                        while (((ab) it2).hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) ((ab) it2).next();
                                                            arrayList.add(new AttributeSubmission((String) entry2.getKey(), StringsKt.b((String) entry2.getValue()).toString()));
                                                        }
                                                        ProfileAttributesRequest profileAttributesRequest = new ProfileAttributesRequest(arrayList);
                                                        AttributeMissingViewModel attributeMissingViewModel = (AttributeMissingViewModel) attributesMissingActivity2.f12321I.getValue();
                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                        BaseViewModel.launchApi$default(attributeMissingViewModel, null, new b(attributeMissingViewModel, profileAttributesRequest, auVar, null), 1, null);
                                                        auVar.observe(attributesMissingActivity2, new Dc.t(8, new g(attributesMissingActivity2, 2)));
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                AttributesMissingActivity attributesMissingActivity3 = attributesMissingActivity;
                                                attributesMissingActivity3.f12325M = true;
                                                attributesMissingActivity3.gold();
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c0585q.f(jade5);
                            }
                            AbstractC0220c.golf(attributeGroup, attributesMissingActivity.f12327O, attributesMissingActivity.f12328P, lVar, (Function0) jade5, null, ((Boolean) ((t0) axVar2).getValue()).booleanValue(), (String) ((t0) axVar).getValue(), null, c0585q, 196608);
                            c0585q.quebec(false);
                        } else {
                            Intrinsics.lima("currentGroup");
                            throw null;
                        }
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                String key = (String) obj;
                String value = (String) obj2;
                int i11 = AttributesMissingActivity.f12319a0;
                Intrinsics.echo(key, "key");
                Intrinsics.echo(value, "value");
                attributesMissingActivity.f12327O.put(key, value);
                attributesMissingActivity.f12328P.remove(key);
                ((t0) attributesMissingActivity.f12332U).setValue(null);
                return Unit.INSTANCE;
        }
    }
}
