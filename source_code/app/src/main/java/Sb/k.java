package Sb;

import android.view.View;
import com.airbnb.lottie.compose.LottieConstants;
import com.app.network.network.models.HandshakeItem;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Score;
import com.app.network.network.models.WithdrawHistory;
import ge.InterfaceC1783o;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.WeakHashMap;
import je.av;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import s1.al;
import s1.au;
import s6.AbstractC2769s6;
import yc.EnumC3415a;

/* loaded from: classes2.dex */
public final class k implements Comparator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ k(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer rank;
        Integer rank2;
        Integer rank3;
        Integer rank4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = LottieConstants.IterateForever;
        int i20 = -1;
        int i21 = 0;
        switch (this.alpha) {
            case 0:
                Integer rank5 = ((OrderTask) obj).getRank();
                if (rank5 != null) {
                    i4 = rank5.intValue();
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                Integer valueOf = Integer.valueOf(i4);
                Integer rank6 = ((OrderTask) obj2).getRank();
                if (rank6 != null) {
                    i19 = rank6.intValue();
                }
                return AbstractC2769s6.bravo(valueOf, Integer.valueOf(i19));
            case 1:
                return AbstractC2769s6.bravo(((Uf.j) obj).alpha, ((Uf.j) obj2).alpha);
            case 2:
                return ((W0.f) obj).purple - ((W0.f) obj2).purple;
            case 3:
                return AbstractC2769s6.bravo(((WithdrawHistory) obj).getId(), ((WithdrawHistory) obj2).getId());
            case 4:
                return AbstractC2769s6.bravo(Integer.valueOf(((Wf.d) obj).alpha), Integer.valueOf(((Wf.d) obj2).alpha));
            case 5:
                return AbstractC2769s6.bravo(Integer.valueOf(((Wf.d) obj2).alpha), Integer.valueOf(((Wf.d) obj).alpha));
            case 6:
                return AbstractC2769s6.bravo((Integer) ((Pair) obj).getFirst(), (Integer) ((Pair) obj2).getFirst());
            case 7:
                Integer rank7 = ((OrderTask) obj).getRank();
                if (rank7 != null) {
                    i5 = rank7.intValue();
                } else {
                    i5 = Integer.MAX_VALUE;
                }
                Integer valueOf2 = Integer.valueOf(i5);
                Integer rank8 = ((OrderTask) obj2).getRank();
                if (rank8 != null) {
                    i19 = rank8.intValue();
                }
                return AbstractC2769s6.bravo(valueOf2, Integer.valueOf(i19));
            case 8:
                return AbstractC2769s6.bravo(((HandshakeItem) obj).getWeight(), ((HandshakeItem) obj2).getWeight());
            case 9:
                return AbstractC2769s6.bravo(((HandshakeItem) obj).getWeight(), ((HandshakeItem) obj2).getWeight());
            case 10:
                Integer rank9 = ((OrderTask) obj).getRank();
                if (rank9 != null) {
                    i10 = rank9.intValue();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                Integer valueOf3 = Integer.valueOf(i10);
                Integer rank10 = ((OrderTask) obj2).getRank();
                if (rank10 != null) {
                    i19 = rank10.intValue();
                }
                return AbstractC2769s6.bravo(valueOf3, Integer.valueOf(i19));
            case 11:
                WeakHashMap weakHashMap = au.alpha;
                float golf = al.golf((View) obj);
                float golf2 = al.golf((View) obj2);
                if (golf > golf2) {
                    return -1;
                }
                if (golf < golf2) {
                    return 1;
                }
                return 0;
            case 12:
                return ((androidx.viewpager.widget.d) obj).bravo - ((androidx.viewpager.widget.d) obj2).bravo;
            case 13:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 14:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 15:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 16:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 17:
                return AbstractC2769s6.bravo(((Method) obj).getName(), ((Method) obj2).getName());
            case 18:
                return AbstractC2769s6.bravo(((av) ((InterfaceC1783o) obj)).getName(), ((av) ((InterfaceC1783o) obj2)).getName());
            case 19:
                OrderTask orderTask = (OrderTask) obj;
                OrderTask orderTask2 = (OrderTask) obj2;
                if (orderTask != null && (rank4 = orderTask.getRank()) != null) {
                    i11 = rank4.intValue();
                } else {
                    i11 = 0;
                }
                if (orderTask2 != null && (rank3 = orderTask2.getRank()) != null) {
                    i12 = rank3.intValue();
                } else {
                    i12 = 0;
                }
                if (i11 < i12) {
                    return -1;
                }
                if (orderTask != null && (rank2 = orderTask.getRank()) != null) {
                    i13 = rank2.intValue();
                } else {
                    i13 = 0;
                }
                if (orderTask2 != null && (rank = orderTask2.getRank()) != null) {
                    i14 = rank.intValue();
                } else {
                    i14 = 0;
                }
                if (i13 > i14) {
                    return 1;
                }
                return 0;
            case 20:
                Integer weight = ((Score) obj).getWeight();
                if (weight != null) {
                    i15 = weight.intValue();
                } else {
                    i15 = 0;
                }
                Integer valueOf4 = Integer.valueOf(i15);
                Integer weight2 = ((Score) obj2).getWeight();
                if (weight2 != null) {
                    i21 = weight2.intValue();
                }
                return AbstractC2769s6.bravo(valueOf4, Integer.valueOf(i21));
            default:
                EnumC3415a enumC3415a = (EnumC3415a) obj;
                if (enumC3415a == null) {
                    i16 = -1;
                } else {
                    i16 = zc.b.$EnumSwitchMapping$0[enumC3415a.ordinal()];
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            i17 = 2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i17 = 1;
                    }
                } else {
                    i17 = 0;
                }
                EnumC3415a enumC3415a2 = (EnumC3415a) obj2;
                if (enumC3415a2 != null) {
                    i20 = zc.b.$EnumSwitchMapping$0[enumC3415a2.ordinal()];
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        if (i20 == 3) {
                            i18 = 2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i18 = 1;
                    }
                } else {
                    i18 = 0;
                }
                return AbstractC2769s6.bravo(i17, i18);
        }
    }
}
