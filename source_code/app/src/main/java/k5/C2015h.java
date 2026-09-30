package k5;

import B9.ab;
import Cb.ac;
import D0.ae;
import D0.am;
import D0.an;
import I0.t;
import T.s;
import Xd.l;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.appcompat.widget.P0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import com.app.network.network.models.Branch;
import com.app.network.network.models.Zone;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.model.ComponentResult;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import delivery.samurai.android.ui.zones.ZonesActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import o.AbstractC2185b;
import oa.C2203b;
import p.C2263a;
import pa.AbstractC2297c;
import qb.EnumC2443j;
import s.AbstractC2534m;
import s.C2538q;
import s6.D7;
import t6.AbstractC3061t3;
import vg.al;
import wc.AbstractC3255a;
import y.AbstractC3380t;
import y.C3344D;
import y.C3379s;
import y.ao;
import z.ak;

/* renamed from: k5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2015h implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ C2015h(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        if (r3 != null) goto L50;
     */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Unit ScreenHeaderViewPreview$lambda$13;
        boolean z2;
        boolean z10;
        String str;
        String str2;
        Unit createTrailingIcon$lambda$34;
        String str3;
        Object obj3;
        int i4;
        am amVar;
        boolean z11;
        TextClassification textClassification;
        List actions;
        Drawable icon;
        Intent intent;
        View.OnClickListener onClickListener;
        CharSequence label;
        List actions2;
        final int i5 = 2;
        final int i10 = 3;
        int i11 = 28;
        Object obj4 = this.red;
        final Object obj5 = this.purple;
        switch (this.alpha) {
            case 0:
                ScreenHeaderViewPreview$lambda$13 = ScreenHeaderViewKt.ScreenHeaderViewPreview$lambda$13((ax) obj5, (ab) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return ScreenHeaderViewPreview$lambda$13;
            case 1:
                final int i12 = 1;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    boolean z12 = obj5 instanceof Branch;
                    Object obj6 = C0580l.alpha;
                    final C2203b c2203b = (C2203b) obj4;
                    Object obj7 = "-";
                    if (z12) {
                        c0585q.purple(-1053137347);
                        Branch branch = (Branch) obj5;
                        String name = branch.getName();
                        if (name == null) {
                            str2 = "";
                        } else {
                            str2 = name;
                        }
                        Object id2 = branch.getId();
                        if (id2 != null) {
                            obj7 = id2;
                        }
                        String bronze = P0.bronze(obj7, "#");
                        boolean india = c0585q.india(c2203b) | c0585q.india(obj5);
                        Object jade = c0585q.jade();
                        if (india || jade == obj6) {
                            final int i13 = 0;
                            jade = new Function0() { // from class: oa.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Float f5;
                                    switch (i13) {
                                        case 0:
                                            Context context = c2203b.itemView.getContext();
                                            Intrinsics.delta(context, "getContext(...)");
                                            Branch branch2 = (Branch) obj5;
                                            String latitude = branch2.getLatitude();
                                            Float f10 = null;
                                            if (latitude != null) {
                                                f5 = r.sierra(latitude);
                                            } else {
                                                f5 = null;
                                            }
                                            String longitude = branch2.getLongitude();
                                            if (longitude != null) {
                                                f10 = r.sierra(longitude);
                                            }
                                            L9.d.bronze(context, f5, f10);
                                            return Unit.INSTANCE;
                                        case 1:
                                            C2203b c2203b2 = c2203b;
                                            Intent intent2 = new Intent(c2203b2.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                            Branch branch3 = (Branch) obj5;
                                            intent2.putExtra("areaId", branch3.getId());
                                            intent2.putExtra("areaType", "BRANCH");
                                            String name2 = branch3.getName();
                                            if (name2 == null) {
                                                name2 = "";
                                            }
                                            intent2.putExtra("areaName", name2);
                                            c2203b2.itemView.getContext().startActivity(intent2);
                                            return Unit.INSTANCE;
                                        case 2:
                                            Bundle bundle = new Bundle();
                                            bundle.putString("zone", new com.google.gson.l().india(obj5));
                                            C2203b c2203b3 = c2203b;
                                            Context context2 = c2203b3.itemView.getContext();
                                            Intent intent3 = new Intent(c2203b3.itemView.getContext(), (Class<?>) ZonesActivity.class);
                                            intent3.putExtras(bundle);
                                            context2.startActivity(intent3);
                                            return Unit.INSTANCE;
                                        default:
                                            C2203b c2203b4 = c2203b;
                                            Intent intent4 = new Intent(c2203b4.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                            Zone zone = (Zone) obj5;
                                            intent4.putExtra("areaId", zone.getId());
                                            intent4.putExtra("areaType", "ZONE");
                                            String name3 = zone.getName();
                                            if (name3 == null) {
                                                name3 = "";
                                            }
                                            intent4.putExtra("areaName", name3);
                                            c2203b4.itemView.getContext().startActivity(intent4);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q.f(jade);
                        }
                        Function0 function0 = (Function0) jade;
                        boolean india2 = c0585q.india(c2203b) | c0585q.india(obj5);
                        Object jade2 = c0585q.jade();
                        if (india2 || jade2 == obj6) {
                            jade2 = new Function0() { // from class: oa.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Float f5;
                                    switch (i12) {
                                        case 0:
                                            Context context = c2203b.itemView.getContext();
                                            Intrinsics.delta(context, "getContext(...)");
                                            Branch branch2 = (Branch) obj5;
                                            String latitude = branch2.getLatitude();
                                            Float f10 = null;
                                            if (latitude != null) {
                                                f5 = r.sierra(latitude);
                                            } else {
                                                f5 = null;
                                            }
                                            String longitude = branch2.getLongitude();
                                            if (longitude != null) {
                                                f10 = r.sierra(longitude);
                                            }
                                            L9.d.bronze(context, f5, f10);
                                            return Unit.INSTANCE;
                                        case 1:
                                            C2203b c2203b2 = c2203b;
                                            Intent intent2 = new Intent(c2203b2.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                            Branch branch3 = (Branch) obj5;
                                            intent2.putExtra("areaId", branch3.getId());
                                            intent2.putExtra("areaType", "BRANCH");
                                            String name2 = branch3.getName();
                                            if (name2 == null) {
                                                name2 = "";
                                            }
                                            intent2.putExtra("areaName", name2);
                                            c2203b2.itemView.getContext().startActivity(intent2);
                                            return Unit.INSTANCE;
                                        case 2:
                                            Bundle bundle = new Bundle();
                                            bundle.putString("zone", new com.google.gson.l().india(obj5));
                                            C2203b c2203b3 = c2203b;
                                            Context context2 = c2203b3.itemView.getContext();
                                            Intent intent3 = new Intent(c2203b3.itemView.getContext(), (Class<?>) ZonesActivity.class);
                                            intent3.putExtras(bundle);
                                            context2.startActivity(intent3);
                                            return Unit.INSTANCE;
                                        default:
                                            C2203b c2203b4 = c2203b;
                                            Intent intent4 = new Intent(c2203b4.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                            Zone zone = (Zone) obj5;
                                            intent4.putExtra("areaId", zone.getId());
                                            intent4.putExtra("areaType", "ZONE");
                                            String name3 = zone.getName();
                                            if (name3 == null) {
                                                name3 = "";
                                            }
                                            intent4.putExtra("areaName", name3);
                                            c2203b4.itemView.getContext().startActivity(intent4);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q.f(jade2);
                        }
                        AbstractC2297c.alpha(str2, bronze, function0, (Function0) jade2, null, c0585q, 0);
                        c0585q.quebec(false);
                    } else {
                        if (obj5 instanceof Zone) {
                            c0585q.purple(-1052041745);
                            Zone zone = (Zone) obj5;
                            String name2 = zone.getName();
                            if (name2 == null) {
                                str = "";
                            } else {
                                str = name2;
                            }
                            Object id3 = zone.getId();
                            if (id3 != null) {
                                obj7 = id3;
                            }
                            String bronze2 = P0.bronze(obj7, "#");
                            boolean india3 = c0585q.india(obj5) | c0585q.india(c2203b);
                            Object jade3 = c0585q.jade();
                            if (india3 || jade3 == obj6) {
                                jade3 = new Function0() { // from class: oa.a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Float f5;
                                        switch (i5) {
                                            case 0:
                                                Context context = c2203b.itemView.getContext();
                                                Intrinsics.delta(context, "getContext(...)");
                                                Branch branch2 = (Branch) obj5;
                                                String latitude = branch2.getLatitude();
                                                Float f10 = null;
                                                if (latitude != null) {
                                                    f5 = r.sierra(latitude);
                                                } else {
                                                    f5 = null;
                                                }
                                                String longitude = branch2.getLongitude();
                                                if (longitude != null) {
                                                    f10 = r.sierra(longitude);
                                                }
                                                L9.d.bronze(context, f5, f10);
                                                return Unit.INSTANCE;
                                            case 1:
                                                C2203b c2203b2 = c2203b;
                                                Intent intent2 = new Intent(c2203b2.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                                Branch branch3 = (Branch) obj5;
                                                intent2.putExtra("areaId", branch3.getId());
                                                intent2.putExtra("areaType", "BRANCH");
                                                String name22 = branch3.getName();
                                                if (name22 == null) {
                                                    name22 = "";
                                                }
                                                intent2.putExtra("areaName", name22);
                                                c2203b2.itemView.getContext().startActivity(intent2);
                                                return Unit.INSTANCE;
                                            case 2:
                                                Bundle bundle = new Bundle();
                                                bundle.putString("zone", new com.google.gson.l().india(obj5));
                                                C2203b c2203b3 = c2203b;
                                                Context context2 = c2203b3.itemView.getContext();
                                                Intent intent3 = new Intent(c2203b3.itemView.getContext(), (Class<?>) ZonesActivity.class);
                                                intent3.putExtras(bundle);
                                                context2.startActivity(intent3);
                                                return Unit.INSTANCE;
                                            default:
                                                C2203b c2203b4 = c2203b;
                                                Intent intent4 = new Intent(c2203b4.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                                Zone zone2 = (Zone) obj5;
                                                intent4.putExtra("areaId", zone2.getId());
                                                intent4.putExtra("areaType", "ZONE");
                                                String name3 = zone2.getName();
                                                if (name3 == null) {
                                                    name3 = "";
                                                }
                                                intent4.putExtra("areaName", name3);
                                                c2203b4.itemView.getContext().startActivity(intent4);
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c0585q.f(jade3);
                            }
                            Function0 function02 = (Function0) jade3;
                            boolean india4 = c0585q.india(c2203b) | c0585q.india(obj5);
                            Object jade4 = c0585q.jade();
                            if (india4 || jade4 == obj6) {
                                jade4 = new Function0() { // from class: oa.a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Float f5;
                                        switch (i10) {
                                            case 0:
                                                Context context = c2203b.itemView.getContext();
                                                Intrinsics.delta(context, "getContext(...)");
                                                Branch branch2 = (Branch) obj5;
                                                String latitude = branch2.getLatitude();
                                                Float f10 = null;
                                                if (latitude != null) {
                                                    f5 = r.sierra(latitude);
                                                } else {
                                                    f5 = null;
                                                }
                                                String longitude = branch2.getLongitude();
                                                if (longitude != null) {
                                                    f10 = r.sierra(longitude);
                                                }
                                                L9.d.bronze(context, f5, f10);
                                                return Unit.INSTANCE;
                                            case 1:
                                                C2203b c2203b2 = c2203b;
                                                Intent intent2 = new Intent(c2203b2.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                                Branch branch3 = (Branch) obj5;
                                                intent2.putExtra("areaId", branch3.getId());
                                                intent2.putExtra("areaType", "BRANCH");
                                                String name22 = branch3.getName();
                                                if (name22 == null) {
                                                    name22 = "";
                                                }
                                                intent2.putExtra("areaName", name22);
                                                c2203b2.itemView.getContext().startActivity(intent2);
                                                return Unit.INSTANCE;
                                            case 2:
                                                Bundle bundle = new Bundle();
                                                bundle.putString("zone", new com.google.gson.l().india(obj5));
                                                C2203b c2203b3 = c2203b;
                                                Context context2 = c2203b3.itemView.getContext();
                                                Intent intent3 = new Intent(c2203b3.itemView.getContext(), (Class<?>) ZonesActivity.class);
                                                intent3.putExtras(bundle);
                                                context2.startActivity(intent3);
                                                return Unit.INSTANCE;
                                            default:
                                                C2203b c2203b4 = c2203b;
                                                Intent intent4 = new Intent(c2203b4.itemView.getContext(), (Class<?>) ShiftBookingListingActivityV2.class);
                                                Zone zone2 = (Zone) obj5;
                                                intent4.putExtra("areaId", zone2.getId());
                                                intent4.putExtra("areaType", "ZONE");
                                                String name3 = zone2.getName();
                                                if (name3 == null) {
                                                    name3 = "";
                                                }
                                                intent4.putExtra("areaName", name3);
                                                c2203b4.itemView.getContext().startActivity(intent4);
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c0585q.f(jade4);
                            }
                            AbstractC2297c.alpha(str, bronze2, function02, (Function0) jade4, null, c0585q, 0);
                            z10 = false;
                        } else {
                            z10 = false;
                            c0585q.purple(-1054481910);
                        }
                        c0585q.quebec(z10);
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                D7.bravo((EnumC2443j) obj5, (P.d) obj4, (InterfaceC0581m) obj, C0564b.cyan(439));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2534m.alpha((q.g) obj5, (q.c) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C2538q) obj5).alpha((Drawable) obj4, (InterfaceC0581m) obj, C0564b.cyan(49));
                return Unit.INSTANCE;
            case 5:
                createTrailingIcon$lambda$34 = InputComponentViewKt.createTrailingIcon$lambda$34((List) obj5, (CardScheme) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return createTrailingIcon$lambda$34;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC3255a.alpha((l) obj5, (Function0) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC3061t3.alpha((s) obj5, (P.d) obj4, (InterfaceC0581m) obj, C0564b.cyan(49));
                return Unit.INSTANCE;
            case 8:
                C2263a c2263a = (C2263a) obj;
                Context context = (Context) obj2;
                C3344D c3344d = (C3344D) obj5;
                boolean booleanValue = ((Boolean) ((t0) c3344d.mike).getValue()).booleanValue();
                D0.g november = c3344d.november();
                TextClassification textClassification2 = null;
                if (november != null) {
                    str3 = november.purple;
                } else {
                    str3 = null;
                }
                am amVar2 = c3344d.whiskey;
                if (amVar2 != null) {
                    t tVar = c3344d.bravo;
                    long j5 = amVar2.alpha;
                    obj3 = obj4;
                    i4 = 1;
                    amVar = new am(ae.bravo(tVar.originalToTransformed((int) (j5 >> 32)), tVar.originalToTransformed((int) (j5 & 4294967295L))));
                } else {
                    obj3 = obj4;
                    i4 = 1;
                    amVar = null;
                }
                C3379s c3379s = c3344d.juliet;
                ac acVar = new ac(c3344d, (vf.ab) obj3, context, i11);
                E0 e02 = AbstractC3380t.alpha;
                if (Build.VERSION.SDK_INT < 28 || str3 == null || amVar == null || c3379s == null || !(c3379s instanceof C3379s)) {
                    String str4 = str3;
                    acVar.invoke(c2263a);
                    if (str4 != null && amVar != null) {
                        AbstractC2185b.alpha(c2263a, context, booleanValue, str4, amVar.alpha);
                    }
                } else {
                    Ef.c cVar = c3379s.echo;
                    if (!cVar.echo()) {
                        z11 = booleanValue;
                    } else {
                        ao aoVar = (ao) ((t0) c3379s.golf).getValue();
                        if (aoVar != null) {
                            z11 = booleanValue;
                            if (am.bravo(amVar.alpha, aoVar.bravo) && Intrinsics.areEqual(str3, aoVar.alpha)) {
                                textClassification = aoVar.charlie;
                                cVar.foxtrot(null);
                                textClassification2 = textClassification;
                            }
                        } else {
                            z11 = booleanValue;
                        }
                        textClassification = null;
                        cVar.foxtrot(null);
                        textClassification2 = textClassification;
                    }
                    if (textClassification2 != null) {
                        actions = textClassification2.getActions();
                        boolean isEmpty = actions.isEmpty();
                        Object obj8 = c3379s.hotel;
                        if (isEmpty) {
                            icon = textClassification2.getIcon();
                            if (icon == null) {
                                label = textClassification2.getLabel();
                                break;
                            }
                            intent = textClassification2.getIntent();
                            if (intent == null) {
                                onClickListener = textClassification2.getOnClickListener();
                                break;
                            }
                            c2263a.alpha.golf(new q.h(obj8, textClassification2, -1));
                        } else {
                            c2263a.alpha.golf(new q.h(obj8, textClassification2, 0));
                        }
                        acVar.invoke(c2263a);
                        actions2 = textClassification2.getActions();
                        int size = actions2.size();
                        for (int i14 = 0; i14 < size; i14 += i4) {
                            al.quebec(actions2.get(i14));
                            if (i14 > 0) {
                                c2263a.alpha.golf(new q.h(obj8, textClassification2, i14));
                            }
                        }
                    } else {
                        acVar.invoke(c2263a);
                    }
                    AbstractC2185b.alpha(c2263a, context, z11, str3, amVar.alpha);
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ak.alpha((an) obj5, (P.d) obj4, (InterfaceC0581m) obj, C0564b.cyan(49));
                return Unit.INSTANCE;
            default:
                return InternalCheckoutComponents.alpha((InternalCheckoutComponents) obj5, (ComponentCallback) obj4, (ComponentResult) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public /* synthetic */ C2015h(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }
}
