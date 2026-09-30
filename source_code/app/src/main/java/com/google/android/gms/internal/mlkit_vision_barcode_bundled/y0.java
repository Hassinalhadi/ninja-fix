package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class y0 extends ai implements C {
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i4, am amVar) {
        super(amVar);
        this.red = i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai
    public /* bridge */ /* synthetic */ am charlie() {
        switch (this.red) {
            case 0:
                return golf();
            default:
                return super.charlie();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai
    public /* bridge */ /* synthetic */ B delta() {
        switch (this.red) {
            case 0:
                return golf();
            default:
                return super.delta();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai
    public void foxtrot() {
        switch (this.red) {
            case 0:
                super.foxtrot();
                am amVar = this.purple;
                if (((aj) amVar).zzb != ae.charlie) {
                    aj ajVar = (aj) amVar;
                    ajVar.zzb = ajVar.zzb.clone();
                    return;
                }
                return;
            default:
                super.foxtrot();
                return;
        }
    }

    public aj golf() {
        if (!((aj) this.purple).kilo()) {
            return (aj) this.purple;
        }
        ((aj) this.purple).zzb.delta();
        return (aj) super.charlie();
    }
}
