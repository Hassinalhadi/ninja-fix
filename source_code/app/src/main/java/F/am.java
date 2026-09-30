package F;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import f.C1664a;
import f.C1665b;
import f.C1666c;
import f.C1667d;
import f.C1668e;
import f.C1670g;
import f.C1671h;
import f.C1675l;
import f.C1676m;
import f.C1677n;
import f.InterfaceC1672i;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class am implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SnapshotStateList purple;

    public /* synthetic */ am(SnapshotStateList snapshotStateList, int i4) {
        this.alpha = i4;
        this.purple = snapshotStateList;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                InterfaceC1672i interfaceC1672i = (InterfaceC1672i) obj;
                boolean z2 = interfaceC1672i instanceof C1670g;
                SnapshotStateList snapshotStateList = this.purple;
                if (z2) {
                    snapshotStateList.add(interfaceC1672i);
                } else if (interfaceC1672i instanceof C1671h) {
                    snapshotStateList.remove(((C1671h) interfaceC1672i).alpha);
                } else if (interfaceC1672i instanceof C1667d) {
                    snapshotStateList.add(interfaceC1672i);
                } else if (interfaceC1672i instanceof C1668e) {
                    snapshotStateList.remove(((C1668e) interfaceC1672i).alpha);
                } else if (interfaceC1672i instanceof C1676m) {
                    snapshotStateList.add(interfaceC1672i);
                } else if (interfaceC1672i instanceof C1677n) {
                    snapshotStateList.remove(((C1677n) interfaceC1672i).alpha);
                } else if (interfaceC1672i instanceof C1675l) {
                    snapshotStateList.remove(((C1675l) interfaceC1672i).alpha);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1672i interfaceC1672i2 = (InterfaceC1672i) obj;
                boolean z10 = interfaceC1672i2 instanceof C1670g;
                SnapshotStateList snapshotStateList2 = this.purple;
                if (z10) {
                    snapshotStateList2.add(interfaceC1672i2);
                } else if (interfaceC1672i2 instanceof C1671h) {
                    snapshotStateList2.remove(((C1671h) interfaceC1672i2).alpha);
                } else if (interfaceC1672i2 instanceof C1667d) {
                    snapshotStateList2.add(interfaceC1672i2);
                } else if (interfaceC1672i2 instanceof C1668e) {
                    snapshotStateList2.remove(((C1668e) interfaceC1672i2).alpha);
                } else if (interfaceC1672i2 instanceof C1676m) {
                    snapshotStateList2.add(interfaceC1672i2);
                } else if (interfaceC1672i2 instanceof C1677n) {
                    snapshotStateList2.remove(((C1677n) interfaceC1672i2).alpha);
                } else if (interfaceC1672i2 instanceof C1675l) {
                    snapshotStateList2.remove(((C1675l) interfaceC1672i2).alpha);
                } else if (interfaceC1672i2 instanceof C1665b) {
                    snapshotStateList2.add(interfaceC1672i2);
                } else if (interfaceC1672i2 instanceof C1666c) {
                    snapshotStateList2.remove(((C1666c) interfaceC1672i2).alpha);
                } else if (interfaceC1672i2 instanceof C1664a) {
                    snapshotStateList2.remove(((C1664a) interfaceC1672i2).alpha);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC1672i interfaceC1672i3 = (InterfaceC1672i) obj;
                boolean z11 = interfaceC1672i3 instanceof C1670g;
                SnapshotStateList snapshotStateList3 = this.purple;
                if (z11) {
                    snapshotStateList3.add(interfaceC1672i3);
                } else if (interfaceC1672i3 instanceof C1671h) {
                    snapshotStateList3.remove(((C1671h) interfaceC1672i3).alpha);
                } else if (interfaceC1672i3 instanceof C1667d) {
                    snapshotStateList3.add(interfaceC1672i3);
                } else if (interfaceC1672i3 instanceof C1668e) {
                    snapshotStateList3.remove(((C1668e) interfaceC1672i3).alpha);
                } else if (interfaceC1672i3 instanceof C1676m) {
                    snapshotStateList3.add(interfaceC1672i3);
                } else if (interfaceC1672i3 instanceof C1677n) {
                    snapshotStateList3.remove(((C1677n) interfaceC1672i3).alpha);
                } else if (interfaceC1672i3 instanceof C1675l) {
                    snapshotStateList3.remove(((C1675l) interfaceC1672i3).alpha);
                }
                return Unit.INSTANCE;
        }
    }
}
