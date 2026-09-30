package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "alpha", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class F extends Lambda implements Function0<List<? extends String>> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ M4296 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(M4296 m4296) {
        super(0);
        this.alpha = m4296;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0084, code lost:
    
        r1 = r3.component9(r1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r2 = com.fingerprintjs.android.fpjs_pro_internal.F.red + 61;
        com.fingerprintjs.android.fpjs_pro_internal.F.purple = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        r2 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (com.fingerprintjs.android.fpjs_pro_internal.F0.alpha() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (com.fingerprintjs.android.fpjs_pro_internal.F0.alpha() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a1, code lost:
    
        throw new com.fingerprintjs.android.fpjs_pro_internal.bd(null, null, 3, null);
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> alpha() {
        bh bhVar;
        List<String> list;
        int i4 = purple;
        int i5 = ((i4 | 35) << 1) - (i4 ^ 35);
        red = i5 % 128;
        int i10 = i5 % 2;
        M4296 m4296 = this.alpha;
        if (i10 == 0) {
            int i11 = M4296.echo + 7;
            M4296.foxtrot = i11 % 128;
            if (i11 % 2 != 0) {
                bhVar = m4296.alpha;
                list = (List) M4296.foxtrot(new Object[]{m4296}, bh.alpha(), 1423730058, bh.alpha(), bh.alpha(), bh.alpha(), -1423730058);
                int i12 = 96 / 0;
            } else {
                bh bhVar2 = m4296.alpha;
                throw null;
            }
        } else {
            int i13 = M4296.echo + 7;
            M4296.foxtrot = i13 % 128;
            if (i13 % 2 != 0) {
                bhVar = m4296.alpha;
                list = (List) M4296.foxtrot(new Object[]{m4296}, bh.alpha(), 1423730058, bh.alpha(), bh.alpha(), bh.alpha(), -1423730058);
            } else {
                bh bhVar3 = m4296.alpha;
                throw null;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends String> invoke() {
        int i4 = purple;
        int i5 = (i4 & 113) + (i4 | 113);
        red = i5 % 128;
        if (i5 % 2 != 0) {
            return alpha();
        }
        alpha();
        throw null;
    }
}
