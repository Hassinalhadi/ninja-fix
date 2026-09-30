package Re;

import com.google.android.material.datepicker.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2332h;
import pe.aq;
import qe.InterfaceC2472h;
import s6.AbstractC2779t7;

/* loaded from: classes2.dex */
public final class d extends av {
    public final /* synthetic */ int bravo;
    public final av charlie;

    public /* synthetic */ d(av avVar, int i4) {
        this.bravo = i4;
        this.charlie = avVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public boolean alpha() {
        switch (this.bravo) {
            case 0:
                return this.charlie.alpha();
            default:
                return super.alpha();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public boolean bravo() {
        switch (this.bravo) {
            case 0:
                return true;
            default:
                return super.bravo();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final InterfaceC2472h charlie(InterfaceC2472h annotations) {
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(annotations, "annotations");
                return this.charlie.charlie(annotations);
            default:
                Intrinsics.echo(annotations, "annotations");
                return this.charlie.charlie(annotations);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final as delta(y yVar) {
        switch (this.bravo) {
            case 0:
                as delta = this.charlie.delta(yVar);
                aq aqVar = null;
                if (delta == null) {
                    return null;
                }
                InterfaceC2332h kilo = yVar.green().kilo();
                if (kilo instanceof aq) {
                    aqVar = (aq) kilo;
                }
                return AbstractC2779t7.alpha(delta, aqVar);
            default:
                return this.charlie.delta(yVar);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final boolean echo() {
        switch (this.bravo) {
            case 0:
                return this.charlie.echo();
            default:
                return this.charlie.echo();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final y foxtrot(int i4, y topLevelType) {
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(topLevelType, "topLevelType");
                j.papa(i4, "position");
                return this.charlie.foxtrot(i4, topLevelType);
            default:
                Intrinsics.echo(topLevelType, "topLevelType");
                j.papa(i4, "position");
                return this.charlie.foxtrot(i4, topLevelType);
        }
    }
}
