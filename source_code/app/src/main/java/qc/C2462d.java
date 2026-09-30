package qc;

import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.reposition.RepositionActionResponseDto;
import com.app.network.network.models.reposition.RepositionAssignmentDto;
import com.google.android.gms.measurement.internal.C1471u;
import com.google.android.gms.measurement.internal.C1473v;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import rc.InterfaceC2515a;
import sc.C2846a;
import sc.C2847b;
import sc.EnumC2848c;
import sc.EnumC2849d;
import t3.InterfaceC2960e;

/* renamed from: qc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2462d implements InterfaceC2515a {
    public final InterfaceC2960e alpha;

    public C2462d(InterfaceC2960e service) {
        Intrinsics.echo(service, "service");
        this.alpha = service;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(long j5, Pd.c cVar) {
        C2459a c2459a;
        int i4;
        C2462d c2462d;
        if (cVar instanceof C2459a) {
            c2459a = (C2459a) cVar;
            int i5 = c2459a.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2459a.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c2459a.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c2459a.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c2462d = c2459a.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    c2459a.alpha = this;
                    c2459a.silver = 1;
                    obj = this.alpha.alpha(j5, "ACCEPT", c2459a);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c2462d = this;
                }
                RepositionActionResponseDto repositionActionResponseDto = (RepositionActionResponseDto) obj;
                c2462d.getClass();
                long id2 = repositionActionResponseDto.getId();
                long repositionRequestId = repositionActionResponseDto.getRepositionRequestId();
                long orderId = repositionActionResponseDto.getOrderId();
                C1471u c1471u = EnumC2848c.alpha;
                String status = repositionActionResponseDto.getStatus();
                c1471u.getClass();
                return new C2846a(id2, repositionRequestId, orderId, C1471u.delta(status));
            }
        }
        c2459a = new C2459a(this, cVar);
        Object obj2 = c2459a.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2459a.silver;
        if (i4 == 0) {
        }
        RepositionActionResponseDto repositionActionResponseDto2 = (RepositionActionResponseDto) obj2;
        c2462d.getClass();
        long id22 = repositionActionResponseDto2.getId();
        long repositionRequestId2 = repositionActionResponseDto2.getRepositionRequestId();
        long orderId2 = repositionActionResponseDto2.getOrderId();
        C1471u c1471u2 = EnumC2848c.alpha;
        String status2 = repositionActionResponseDto2.getStatus();
        c1471u2.getClass();
        return new C2846a(id22, repositionRequestId2, orderId2, C1471u.delta(status2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(long j5, Pd.c cVar) {
        C2460b c2460b;
        int i4;
        C2462d c2462d;
        Iterator it;
        Object obj;
        EnumC2849d enumC2849d;
        if (cVar instanceof C2460b) {
            c2460b = (C2460b) cVar;
            int i5 = c2460b.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2460b.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c2460b.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c2460b.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c2462d = c2460b.alpha;
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    c2460b.alpha = this;
                    c2460b.silver = 1;
                    obj2 = this.alpha.bravo(j5, c2460b);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    c2462d = this;
                }
                RepositionAssignmentDto repositionAssignmentDto = (RepositionAssignmentDto) obj2;
                c2462d.getClass();
                long id2 = repositionAssignmentDto.getId();
                C1471u c1471u = EnumC2848c.alpha;
                String status = repositionAssignmentDto.getStatus();
                c1471u.getClass();
                EnumC2848c delta = C1471u.delta(status);
                String fromSectionName = repositionAssignmentDto.getFromSectionName();
                String toSectionName = repositionAssignmentDto.getToSectionName();
                Double amount = repositionAssignmentDto.getAmount();
                C1473v c1473v = EnumC2849d.alpha;
                String value = repositionAssignmentDto.getTransferMode();
                c1473v.getClass();
                Intrinsics.echo(value, "value");
                it = EnumC2849d.silver.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        if (r.hotel(((EnumC2849d) obj).name(), value, true)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                enumC2849d = (EnumC2849d) obj;
                if (enumC2849d == null) {
                    enumC2849d = EnumC2849d.purple;
                }
                return new C2847b(id2, delta, fromSectionName, toSectionName, amount, enumC2849d, repositionAssignmentDto.getDistanceInKm(), repositionAssignmentDto.getTitle(), repositionAssignmentDto.getMessage());
            }
        }
        c2460b = new C2460b(this, cVar);
        Object obj22 = c2460b.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2460b.silver;
        if (i4 == 0) {
        }
        RepositionAssignmentDto repositionAssignmentDto2 = (RepositionAssignmentDto) obj22;
        c2462d.getClass();
        long id22 = repositionAssignmentDto2.getId();
        C1471u c1471u2 = EnumC2848c.alpha;
        String status2 = repositionAssignmentDto2.getStatus();
        c1471u2.getClass();
        EnumC2848c delta2 = C1471u.delta(status2);
        String fromSectionName2 = repositionAssignmentDto2.getFromSectionName();
        String toSectionName2 = repositionAssignmentDto2.getToSectionName();
        Double amount2 = repositionAssignmentDto2.getAmount();
        C1473v c1473v2 = EnumC2849d.alpha;
        String value2 = repositionAssignmentDto2.getTransferMode();
        c1473v2.getClass();
        Intrinsics.echo(value2, "value");
        it = EnumC2849d.silver.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        enumC2849d = (EnumC2849d) obj;
        if (enumC2849d == null) {
        }
        return new C2847b(id22, delta2, fromSectionName2, toSectionName2, amount2, enumC2849d, repositionAssignmentDto2.getDistanceInKm(), repositionAssignmentDto2.getTitle(), repositionAssignmentDto2.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object charlie(long j5, Pd.c cVar) {
        C2461c c2461c;
        int i4;
        C2462d c2462d;
        if (cVar instanceof C2461c) {
            c2461c = (C2461c) cVar;
            int i5 = c2461c.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2461c.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c2461c.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c2461c.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c2462d = c2461c.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    c2461c.alpha = this;
                    c2461c.silver = 1;
                    obj = this.alpha.alpha(j5, "REJECT", c2461c);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c2462d = this;
                }
                RepositionActionResponseDto repositionActionResponseDto = (RepositionActionResponseDto) obj;
                c2462d.getClass();
                long id2 = repositionActionResponseDto.getId();
                long repositionRequestId = repositionActionResponseDto.getRepositionRequestId();
                long orderId = repositionActionResponseDto.getOrderId();
                C1471u c1471u = EnumC2848c.alpha;
                String status = repositionActionResponseDto.getStatus();
                c1471u.getClass();
                return new C2846a(id2, repositionRequestId, orderId, C1471u.delta(status));
            }
        }
        c2461c = new C2461c(this, cVar);
        Object obj2 = c2461c.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2461c.silver;
        if (i4 == 0) {
        }
        RepositionActionResponseDto repositionActionResponseDto2 = (RepositionActionResponseDto) obj2;
        c2462d.getClass();
        long id22 = repositionActionResponseDto2.getId();
        long repositionRequestId2 = repositionActionResponseDto2.getRepositionRequestId();
        long orderId2 = repositionActionResponseDto2.getOrderId();
        C1471u c1471u2 = EnumC2848c.alpha;
        String status2 = repositionActionResponseDto2.getStatus();
        c1471u2.getClass();
        return new C2846a(id22, repositionRequestId2, orderId2, C1471u.delta(status2));
    }
}
