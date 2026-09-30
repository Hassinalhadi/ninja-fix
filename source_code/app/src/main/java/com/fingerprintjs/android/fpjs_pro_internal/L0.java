package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/ca;", "p0", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/ca;)[B"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class L0 extends Lambda implements Function1<ca, byte[]> {
    public final /* synthetic */ cf alpha;
    public final /* synthetic */ M0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(cf cfVar, M0 m02) {
        super(1);
        this.alpha = cfVar;
        this.purple = m02;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final byte[] invoke(@NotNull ca caVar) {
        byte[] component5;
        JSONObject jSONObject = new JSONObject(this.alpha.alpha(caVar));
        M0 m02 = this.purple;
        ((C1219i1) m02.alpha).getClass();
        jSONObject.toString(2);
        byte[] bytes = jSONObject.toString().getBytes(kotlin.text.a.alpha);
        cj cjVar = m02.bravo;
        if (cjVar != null && (component5 = cjVar.component5(bytes)) != null) {
            return component5;
        }
        return bytes;
    }
}
