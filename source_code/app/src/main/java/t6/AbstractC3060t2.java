package t6;

import com.app.network.network.models.HandshakeItem;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3060t2 {
    public static final boolean alpha(ArrayList arrayList) {
        List list;
        long j5;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int ivory = CollectionsKt.ivory(arrayList);
                int i4 = 0;
                while (i4 < ivory) {
                    i4++;
                    Object obj2 = arrayList.get(i4);
                    A0.s sVar = (A0.s) obj2;
                    A0.s sVar2 = (A0.s) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (sVar2.golf().alpha() >> 32)) - Float.intBitsToFloat((int) (sVar.golf().alpha() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (sVar2.golf().alpha() & 4294967295L)) - Float.intBitsToFloat((int) (sVar.golf().alpha() & 4294967295L)));
                    arrayList2.add(new Z.b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j5 = ((Z.b) CollectionsKt.gold(list)).alpha;
            } else {
                if (list.isEmpty()) {
                    S0.a.bravo("Empty collection can't be reduced.");
                }
                Object gold = CollectionsKt.gold(list);
                int ivory2 = CollectionsKt.ivory(list);
                if (1 <= ivory2) {
                    int i5 = 1;
                    while (true) {
                        gold = new Z.b(Z.b.golf(((Z.b) gold).alpha, ((Z.b) list.get(i5)).alpha));
                        if (i5 == ivory2) {
                            break;
                        }
                        i5++;
                    }
                }
                j5 = ((Z.b) gold).alpha;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j5)) >= Float.intBitsToFloat((int) (j5 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean bravo(Order order, OrderTask orderTask) {
        if (Intrinsics.areEqual(order.getIsHybrid(), Boolean.TRUE) && orderTask.getTaskType() == TaskType.PICK_UP && !s6.H0.charlie(order, orderTask)) {
            List<HandshakeItem> handshakeItems = orderTask.getHandshakeItems();
            if (handshakeItems == null || handshakeItems.isEmpty()) {
                List<HandshakeItem> appendages = orderTask.getAppendages();
                if (appendages == null || appendages.isEmpty()) {
                    if (orderTask.getTaskStatus() == TaskStatus.STARTED || orderTask.getTaskStatus() == TaskStatus.AT_DESTINATION) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
