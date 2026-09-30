package ae;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ad extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ai purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad(ai aiVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = aiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.alpha) {
            case 0:
                C0423b backEvent = (C0423b) obj;
                Intrinsics.echo(backEvent, "backEvent");
                ai aiVar = this.purple;
                kotlin.collections.l lVar = aiVar.bravo;
                ListIterator listIterator = lVar.listIterator(lVar.alpha());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((ac) obj2).isEnabled()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ac acVar = (ac) obj2;
                if (aiVar.charlie != null) {
                    aiVar.charlie();
                }
                aiVar.charlie = acVar;
                if (acVar != null) {
                    acVar.handleOnBackStarted(backEvent);
                }
                return Unit.INSTANCE;
            default:
                C0423b backEvent2 = (C0423b) obj;
                Intrinsics.echo(backEvent2, "backEvent");
                ai aiVar2 = this.purple;
                ac acVar2 = aiVar2.charlie;
                if (acVar2 == null) {
                    kotlin.collections.l lVar2 = aiVar2.bravo;
                    ListIterator listIterator2 = lVar2.listIterator(lVar2.alpha());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((ac) obj3).isEnabled()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    acVar2 = (ac) obj3;
                }
                if (acVar2 != null) {
                    acVar2.handleOnBackProgressed(backEvent2);
                }
                return Unit.INSTANCE;
        }
    }
}
