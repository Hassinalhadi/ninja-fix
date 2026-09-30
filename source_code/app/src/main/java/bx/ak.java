package bx;

import bz.V;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ak extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak(ax axVar, az azVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = axVar;
        this.red = azVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (((bx.A) r3.red).charlie.charlie != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = 0.92f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (((bx.ay) r3.purple).bravo.charlie != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        if (((bx.A) r3.red).charlie.alpha != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        if (((bx.ay) r3.purple).bravo.alpha != null) goto L42;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        bz.aa aaVar;
        bz.aa aaVar2;
        switch (this.alpha) {
            case 0:
                V v4 = (V) obj;
                ai aiVar = ai.alpha;
                ai aiVar2 = ai.purple;
                if (v4.bravo(aiVar, aiVar2)) {
                    B b2 = ((ay) this.purple).bravo.alpha;
                    if (b2 == null || (aaVar2 = b2.alpha) == null) {
                        return ar.bravo;
                    }
                    return aaVar2;
                }
                if (v4.bravo(aiVar2, ai.red)) {
                    B b4 = ((A) this.red).charlie.alpha;
                    if (b4 == null || (aaVar = b4.alpha) == null) {
                        return ar.bravo;
                    }
                    return aaVar;
                }
                return ar.bravo;
            case 1:
                int i4 = al.$EnumSwitchMapping$0[((ai) obj).ordinal()];
                float f5 = 1.0f;
                if (i4 != 1) {
                    if (i4 == 2) {
                        break;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                }
                return Float.valueOf(f5);
            case 2:
                V v6 = (V) obj;
                ai aiVar3 = ai.alpha;
                ai aiVar4 = ai.purple;
                if (v6.bravo(aiVar3, aiVar4)) {
                    E e = ((ay) this.purple).bravo.charlie;
                    if (e != null) {
                        return e.bravo;
                    }
                    return ar.bravo;
                }
                if (v6.bravo(aiVar4, ai.red)) {
                    E e4 = ((A) this.red).charlie.charlie;
                    if (e4 != null) {
                        return e4.bravo;
                    }
                    return ar.bravo;
                }
                return ar.bravo;
            default:
                int i5 = am.$EnumSwitchMapping$0[((ai) obj).ordinal()];
                float f10 = 1.0f;
                if (i5 != 1) {
                    if (i5 == 2) {
                        break;
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                }
                return Float.valueOf(f10);
        }
    }
}
