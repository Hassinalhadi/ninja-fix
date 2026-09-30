package G2;

import F2.i;
import J2.p;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends c {
    public final /* synthetic */ int bravo;
    public final int charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(H2.f tracker, int i4) {
        super(tracker);
        this.bravo = i4;
        switch (i4) {
            case 2:
                Intrinsics.echo(tracker, "tracker");
                super(tracker);
                this.charlie = 7;
                return;
            case 3:
                Intrinsics.echo(tracker, "tracker");
                super(tracker);
                this.charlie = 7;
                return;
            case 4:
                Intrinsics.echo(tracker, "tracker");
                super(tracker);
                this.charlie = 9;
                return;
            default:
                Intrinsics.echo(tracker, "tracker");
                this.charlie = 6;
                return;
        }
    }

    @Override // G2.e
    public final boolean charlie(p workSpec) {
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(workSpec, "workSpec");
                return workSpec.juliet.charlie;
            case 1:
                Intrinsics.echo(workSpec, "workSpec");
                return workSpec.juliet.echo;
            case 2:
                Intrinsics.echo(workSpec, "workSpec");
                if (workSpec.juliet.alpha == 2) {
                    return true;
                }
                return false;
            case 3:
                Intrinsics.echo(workSpec, "workSpec");
                int i4 = workSpec.juliet.alpha;
                if (i4 != 3 && (Build.VERSION.SDK_INT < 30 || i4 != 6)) {
                    return false;
                }
                return true;
            default:
                Intrinsics.echo(workSpec, "workSpec");
                return workSpec.juliet.foxtrot;
        }
    }

    @Override // G2.c
    public final int delta() {
        switch (this.bravo) {
            case 0:
                return this.charlie;
            case 1:
                return this.charlie;
            case 2:
                return this.charlie;
            case 3:
                return this.charlie;
            default:
                return this.charlie;
        }
    }

    @Override // G2.c
    public final boolean echo(Object obj) {
        switch (this.bravo) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                i value = (i) obj;
                Intrinsics.echo(value, "value");
                int i4 = Build.VERSION.SDK_INT;
                boolean z2 = value.alpha;
                if (i4 < 26 ? !z2 : !(z2 && value.bravo)) {
                    return true;
                }
                return false;
            case 3:
                i value2 = (i) obj;
                Intrinsics.echo(value2, "value");
                if (value2.alpha && !value2.charlie) {
                    return false;
                }
                return true;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(H2.a tracker) {
        super(tracker);
        this.bravo = 1;
        Intrinsics.echo(tracker, "tracker");
        this.charlie = 5;
    }
}
