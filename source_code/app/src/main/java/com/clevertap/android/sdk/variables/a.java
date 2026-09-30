package com.clevertap.android.sdk.variables;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CTVariables purple;

    public /* synthetic */ a(CTVariables cTVariables, int i4) {
        this.alpha = i4;
        this.purple = cTVariables;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return CTVariables.bravo(this.purple);
            default:
                return CTVariables.charlie(this.purple);
        }
    }
}
