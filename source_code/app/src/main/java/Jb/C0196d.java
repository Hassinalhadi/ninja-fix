package Jb;

import com.app.network.network.models.UserInfo;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* renamed from: Jb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0196d implements androidx.lifecycle.A {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;

    public /* synthetic */ C0196d(androidx.compose.runtime.ax axVar, int i4) {
        this.alpha = i4;
        this.purple = axVar;
    }

    @Override // androidx.lifecycle.A
    public final void onChanged(Object obj) {
        switch (this.alpha) {
            case 0:
                UserInfo newValue = (UserInfo) obj;
                Intrinsics.echo(newValue, "newValue");
                this.purple.setValue(newValue);
                return;
            case 1:
                C2492a newValue2 = (C2492a) obj;
                Intrinsics.echo(newValue2, "newValue");
                this.purple.setValue(newValue2);
                return;
            case 2:
                UserInfo newValue3 = (UserInfo) obj;
                Intrinsics.echo(newValue3, "newValue");
                this.purple.setValue(newValue3);
                return;
            default:
                this.purple.setValue(obj);
                return;
        }
    }
}
